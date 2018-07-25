B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=7.01
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: True
	#IncludeTitle: True
#End Region
#Extends: android.support.v7.app.AppCompatActivity

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Dim mode=0 As Int
	Dim id As Int
	
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Dim EditText1, EditText2 As EditText
	Private btn_init As Button
	Private btn_cancel As Button
	Private btn_delete As Button
	Private btn_excel As Button
	Private btn_kml As Button
	
	Dim toolbar As ACToolBarLight	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("actNavigation")
	Activity.Title = "New Track"


	toolbar.Initialize("tb")
	toolbar.Title = "New Track"
	toolbar.SetAsActionBar
	toolbar.NavigationIconBitmap = LoadBitmap( File.DirAssets, "track.png") 
	
	Dim AC As AppCompat
	AC.SetElevation(toolbar, 8dip)
	'toolbar.AddView( LoadBitmap(File.DirAssets, "track.png") , 50dip, 50dip)
	Activity.AddView( toolbar, 0%x, 0%y, 100%x, 55dip )
End Sub

Sub Activity_Resume

	If mode = 0 Then
		toolbar.Title = "New Track"
		btn_init.Text = "Create" & CRLF & "& Init"
		btn_excel.Visible = False
		btn_kml.Visible = False
		btn_delete.Visible = False
	Else
		Dim m = DBUtils.ExecuteMap( Starter.sql1, "select * from navigation where [id] = " & id, Null  ) As Map
		EditText1.Text = m.Get("name" )
		EditText2.Text = m.Get("description" )
		toolbar.Title = "Edit Track"
		btn_init.Text = "Save"
		btn_excel.Visible = True
		btn_kml.Visible = True
		btn_delete.Visible = True
	End If
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub Start( tipo As String, id1 As Int )
	id = id1
	If tipo = "add" Then
		mode = 0
	Else If tipo = "edit" Then
		mode = 1
	End If
	Activity_Resume
End Sub 

'Sub Button3_Click ' Continue'
'	svcWind.b_nav = True
'	CallSubDelayed3( svcWind, "start_nav", 0, Array As String( Null, Null ) ) ' Continue last
'	Activity.Finish
'End Sub

Sub btn_cancel_Click ' Cancel
	Activity.Finish
	CallSubDelayed( actListTracks, "refresh" )
End Sub
Sub btn_init_Click ' Init
	If mode = 0 Then
		Starter.b_nav = True
		CallSubDelayed3(Starter, "start_nav", 0, Array As String( EditText1.Text, EditText2.Text ) ) 	' Start	
		Activity.Finish
		CallSubDelayed( actListTracks, "finish" )
	Else
		Dim m As Map
		m.Initialize
		m.Put( "id", id )
		DBUtils.UpdateRecord( Starter.sql1, "navigation", "name", EditText1.Text, m )
		DBUtils.UpdateRecord( Starter.sql1, "navigation", "description", EditText2.Text, m )
		Activity.Finish
		CallSubDelayed( actListTracks, "refresh" )
	End If
End Sub

Sub borrado(borrar As Map)
	Dim m As Map
	'navigation
	m.Initialize
	m.Put("id", DBUtils.DB_INTEGER)
	m.Put("name", DBUtils.DB_TEXT)
	m.Put("description", DBUtils.DB_TEXT)
	m.Put("date_start", DBUtils.DB_INTEGER)
	m.Put("boat_id", DBUtils.DB_INTEGER)
	m.Put("e_id", DBUtils.DB_INTEGER )
	
	Dim l As List
	l.Initialize
	l = DBUtils.ExecuteMemoryMapList( Starter.sql1, "select * from navigation", Null, 0 )
	DBUtils.DropTable( Starter.sql1, "navigation")
	DBUtils.CreateTable(Starter.sql1, "navigation", m, "id", True )
	Dim lista As List
	lista.Initialize
	For Each n As Map In l
		If n <> borrar Then
			lista.Add(n)
		End If
	Next
	DBUtils.InsertMaps(Starter.sql1, "navigation", lista)
End Sub

Sub btn_delete_Click
	Dim result As Int
	Dim m = DBUtils.ExecuteMap( Starter.sql1, "select * from navigation where [id] = " & id, Null  ) As Map

	result = Msgbox2( "Track: " & m.Get("name" ) & CRLF & _
					  m.Get("description"), _
					  "Delete Track : " & m.Get("name") & " ? ", "Yes","", "No", Null )
	
	If result = DialogResponse.POSITIVE Then
		'DBUtils.DeleteRecord(Starter.sql1, "navigation", m)
		DBUtils.DeleteRecordID( Starter.sql1, m.Get("id"))
		'borrado(m)
		Activity.Finish
		CallSubDelayed( actListTracks, "refresh" )
	End If
End Sub

Sub btn_excel_Click
	Dim WB As WritableWorkbook
	Dim m = DBUtils.ExecuteMap( Starter.sql1, "select * from navigation where [id] = " & id, Null  ) As Map
	Private rp As RuntimePermissions
	WB.Initialize(rp.GetSafeDirDefaultExternal("") , id&"_"&m.Get("name")&".xls")
	Dim sh1 As WritableSheet
	sh1 = WB.AddSheet(m.Get("name"), 0)
	Dim c As WritableCell
	' HEADER
	Dim cf1 As WritableCellFormat
	cf1.Initialize2(cf1.FONT_ARIAL, 12, True, False, False, _
					cf1.COLOR_GREEN)
	cf1.HorizontalAlignment = cf1.HALIGN_CENTRE
	cf1.SetBorder(cf1.BORDER_ALL, _
				  cf1.BORDER_STYLE_MEDIUM, cf1.COLOR_BLACK)
	cf1.SetBorder(cf1.BORDER_BOTTOM, cf1.BORDER_STYLE_THICK, _
				  cf1.COLOR_BLUE)
	cf1.VertivalAlignment = cf1.VALIGN_CENTRE
	cf1.BackgroundColor = cf1.COLOR_GREY_25_PERCENT	
	Dim i As Int
	'Dim cols() As String
	
	Dim cols() As String = Array As String( "Id", "Lat", "Lon","Date","AppWindAngle","AppWindModulus","TrueWindAngle","TrueWindModulus","Bearing","Speed","Batt","Temp","Roll","Pitch","eCompass")
	For i = 0 To cols.Length - 1
		sh1.SetColumnWidth(i, 15)
		If i = 3 Then
			sh1.SetColumnWidth(i, 25)
		End If
		c.InitializeText(i,0, cols(i) )
		c.SetCellFormat( cf1 )
		sh1.AddCell( c )
	Next
	' Rows
	Dim l As List
	l = DBUtils.ExecuteMemoryTable( Starter.sql1, "select * from route5 where [navigation_id] =" & id, Null, 0 )
	Dim j() As String
	
	'cf1.Initialize
	'cf1.HorizontalAlignment = cf1.HALIGN_CENTRE
	
	For i = 0 To l.Size - 1
		j = l.Get(i)
		c.InitializeNumber(0,i+1, j(0) ) ' Id
		sh1.AddCell(c)
		c.InitializeNumber(1,i+1, j(2) ) ' Lat
		sh1.AddCell(c)
		c.InitializeNumber(2,i+1, j(3) ) ' Lon
		sh1.AddCell(c)
		c.InitializeText(3,i+1, DateTime.Date( j(4) ) & " " & DateTime.Time( j(4) ) ) ' Date
		sh1.AddCell(c)
		c.InitializeNumber(4,i+1, j(6) ) ' Awa
		sh1.AddCell(c)		
		c.InitializeNumber(5,i+1, j(7) ) ' Awm
		sh1.AddCell(c)		
		c.InitializeNumber(6,i+1, j(8) ) ' Twa
		sh1.AddCell(c)		
		c.InitializeNumber(7,i+1, j(9) ) ' Twm
		sh1.AddCell(c)		
		c.InitializeNumber(8,i+1, j(10) ) ' Bearing
		sh1.AddCell(c)		
		c.InitializeNumber(9,i+1, j(11) ) ' Speed
		sh1.AddCell(c)
		c.InitializeNumber(10,i+1, j(12) ) ' Battery
		sh1.AddCell(c)
		c.InitializeNumber(11,i+1, j(13) ) ' Temp
		sh1.AddCell(c)
		c.InitializeNumber(12,i+1,j(14)) ' Roll
		sh1.AddCell(c)
		c.InitializeNumber(13,i+1,j(15)) ' Pitch
		sh1.AddCell(c)
		c.InitializeNumber(14, i+1,j(16)) ' Ecompass
		sh1.AddCell(c)		
		
	Next 
	WB.Write
	WB.Close	
	
	Dim mf As String
	
	mf = "file://" & File.Combine(rp.GetSafeDirDefaultExternal(""), id&"_"&m.Get("name")&".xls")
	Dim intent1 As Intent
	intent1.Initialize(intent1.ACTION_VIEW, mf)
	intent1.SetType("application/vnd.ms-excel")
	intent1.WrapAsIntentChooser("Choose XLS Viewer")
	StartActivity(intent1)	
End Sub
Sub btn_kml_Click
	Dim m = DBUtils.ExecuteMap( Starter.sql1, "select * from navigation where [id] = " & id, Null  ) As Map
'<kml xmlns="http://earth.google.com/kml/2.2">
'<Folder>
'<name>London Landmarks</name>
'<open>1</open>
'<Placemark>
'<name>House of Commons</name>
'<description></description>
'<Point>
'<coordinates>0.17810782,1.35190495,0</coordinates>
'</Point>
'</Placemark>
'<Placemark>
'</Folder>
'</kml>	

	Dim sb, track As StringBuilder, coor As String
	sb.Initialize
	track.Initialize
	sb.Append("<?xml version="& QUOTE & "1.0" & QUOTE & " encoding=" & QUOTE & "UTF-8" & QUOTE & "?>").Append(CRLF)
	sb.Append("<kml xmlns=" & QUOTE & "http://www.opengis.net/kml/2.2" & QUOTE & ">").Append(CRLF)
	sb.Append("<Document>").Append(CRLF)

	' Rows
	Dim li As List
	li = DBUtils.ExecuteMemoryMapList( Starter.sql1, "select * from route5 where [navigation_id] =" & id, Null, 0 )
		
	For i = 0 To li.Size - 1
		Dim n = li.Get(i) As Map
	'For i=0 To TrackPoints.Size - 1
	   sb.Append("<Placemark>").Append(CRLF)
	   sb.Append("<name>" & n.Get("id") & "</name>").Append(CRLF)
	   sb.Append("<description>"& n.Get("id") &"</description>").Append(CRLF)
	   sb.Append("<ExtendedData>")
	   sb.Append("<Data name=""Id""><value>"&n.Get("id")&"</value></Data>")
	   sb.Append("<Data name=""AppWindAngle""><value>"&n.Get("awa")&"</value></Data>")
	   sb.Append("<Data name=""AppWindModule""><value>"&n.Get("awm")&"</value></Data>")
	   sb.Append("<Data name=""TrueWindAngle""><value>"&n.Get("twa")&"</value></Data>")
	   sb.Append("<Data name=""TrueWindModule""><value>"&n.Get("twm")&"</value></Data>")
	   sb.Append("<Data name=""Bearing""><value>"&n.Get("bearing")&"</value></Data>")
	   sb.Append("<Data name=""Speed""><value>"&n.Get("speed")&"</value></Data>")
		' new ultra
		sb.Append("<Data name=""Battery""><value>"&n.Get("battery")&"</value></Data>")
		sb.Append("<Data name=""Temp""><value>"&n.Get("temp")&"</value></Data>")
		sb.Append("<Data name=""Roll""><value>"&n.Get("roll")&"</value></Data>")
		sb.Append("<Data name=""Pitch""><value>"&n.Get("pitch")&"</value></Data>")
		sb.Append("<Data name=""Compass""><value>"&n.Get("ecompass")&"</value></Data>")

	   
	   sb.Append("</ExtendedData>")
	   sb.Append("<Point>").Append(CRLF)
	   coor = n.Get("lon") & "," & n.Get("lat")   ' Long and Lat separated by ","  (inverse order, not normal order)
	   sb.Append("<coordinates>" & coor & "</coordinates>").Append(CRLF)
	   sb.Append("</Point>").Append(CRLF)
	   sb.Append("</Placemark>").Append(CRLF)
	   
	   track.Append(coor).Append(",0").Append(CRLF)   'track data including Altitude = 0
	Next

	sb.Append("<Placemark>").Append(CRLF)
	sb.Append("<name>" & "Track" & "</name>").Append(CRLF)
	sb.Append("<description></description>").Append(CRLF)
	sb.Append("<LineString>").Append(CRLF)
	sb.Append("<tessellate>1</tessellate>").Append(CRLF)

	sb.Append("<coordinates>" & track.ToString & "</coordinates>").Append(CRLF)

	sb.Append("</LineString>").Append(CRLF)
	sb.Append("</Placemark>").Append(CRLF)
	sb.Append("</Document>").Append(CRLF)
	sb.Append("</kml>").Append(CRLF)

	Dim rp As RuntimePermissions
	File.WriteString(rp.GetSafeDirDefaultExternal(""), id&"_"&m.Get("name")&".kml", sb.ToString)
	
   	Dim mf As String
	mf = "file://" & File.Combine(rp.GetSafeDirDefaultExternal(""), id&"_"&m.Get("name")&".kml")
	Dim intent1 As Intent
	intent1.Initialize(intent1.ACTION_VIEW, mf)
	intent1.SetType("application/vnd.google-earth.kml+xml")
	intent1.WrapAsIntentChooser("Choose KML Viewer")
	StartActivity(intent1)	
End Sub

