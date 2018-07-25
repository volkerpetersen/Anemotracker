B4i=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=4.4
@EndOfDesignText@
'Code module
' TRACKING


Sub Process_Globals
	'SQL
	Dim sql1 As SQL
	Dim Timer_sqlite As Timer
	Dim navigation As Int
	Dim nav_name As String	
	' LIST PAGE
	Private pg As Page

	Private btnAdd, btnBack As BarButton
	Private nav As NavigationController
	Private tvTrack As TableView
	
	' EDIT PAGE
	Private pg_edit As Page 
	
	Private btn_xls As Button
	Private btn_kml As Button
	Private txt_name As TextField
	Private txt_description As TextView
	
	' Archiver
	Dim av As Archiver
	Dim temp_id As Int
	'Document interaction 
	Private di As DocumentInteraction	
End Sub

Public Sub Initialize( vNav As NavigationController )
	nav = vNav
	Timer_sqlite.Initialize( "Timer_Sqlite", 60000)
	'If pg.IsInitialized = False Then
		pg.Initialize("pg")
		pg.HideBackButton = True 
		pg.Title = "Select/Add/Edit track"	
		pg.Prompt = "select/add/edit track"
		pg.RootPanel.LoadLayout( "track_select" )
	'clvTrack.Initialize( Me, "clvTrack", 100%x )
	'pg.RootPanel.AddView( clvTrack.AsView, 0%x,0%y, 100%x, 100%y )
	tvTrack.Initialize("tvTrack", False )
	pg.RootPanel.AddView( tvTrack, 0,0, 100%x, 100%y )
	
	'pg.RootPanel.SizeToFit()
	
	btnAdd.InitializeSystem( btnAdd.ITEM_ADD, "Add")
	btnAdd.Tag = "Add"
	btnBack.InitializeSystem( btnAdd.ITEM_CANCEL, "Back")
	btnBack.InitializeText( "Back", "Back")
	'btnBack.Tag = "Add"
	pg.TopRightButtons = Array( btnAdd )
	pg.TopLeftButtons = Array(btnBack )
	'End If
	
	pg_refresh
	
End Sub

Sub pg_refresh
	tvTrack.Clear
	'clvTrack.Clear
	' Poblamos el clv
	Dim li As List
	li = DBUtils.ExecuteMemoryMapList( sql1, "select * from navigation", Null, 0 )
	
	Dim i As Int
	For i = 0 To li.Size - 1
		Dim n = li.Get(i) As Map
		Dim tc= tvTrack.AddTwoLines( n.Get( "name" ), n.Get( "description" ) ) As TableCell
		Dim att1,att2 As AttributedString
		att1.Initialize( n.Get("name"), Font.CreateNew(25), Colors.Black )
		tc.Text = att1
		att2.Initialize( n.Get("description"), Font.CreateNew(15), Colors.Gray )
		tc.DetailText = att2
		tc.tag = n
		'tc.AccessoryType = tc.ACCESSORY_DISCLOSURE_BUTTON
		'tc.tag = n.Get( "id" )
		tc.Update
	Next 
	tvTrack.ReloadAll
	'tvTrack.SetLayoutAnimated(0, 1, 0,0, 100%x, 100%y)
End Sub

Sub pg_resize
	'tvTrack.SetLayoutAnimated(0, 1, 0,0, 100%x, 100%y)
End Sub
Public Sub Page As Page
	Return pg
End Sub


'Sub tvTrack_AccessoryButtonClicked (SectionIndex As Int, Cell As TableCell)
'	If Not( Cell.Tag = Null ) Then
'		'Log( Cell.Tag )
'		Dim m=cell.Tag As Map
'		Dim id=m.Get("id") As Int 
'	    Dim m = DBUtils.ExecuteMap( sql1, "select * from navigation where [id] = " & id, Null  ) As Map
'		'Log(m)
'		Msgbox2( "msg_continue_track", "Track: " & m.Get("name" ) & CRLF & _
'						  m.Get("description"), _
'						  "Continue Track : " & m.Get("name") & " ? ", Array("Yes","No","Edit/Export"))
'		navigation = id
'	Else
'			'Return True
'	End If	
'		
'						  
'End Sub

Sub tvTrack_SelectedChanged (SectionIndex As Int, Cell As TableCell)
	If Not( Cell.Tag = Null ) Then
		'Log( Cell.Tag )
		Dim m=Cell.Tag As Map
		Dim id=m.Get("id") As Int 
	    Dim m = DBUtils.ExecuteMap( sql1, "select * from navigation where [id] = " & id, Null  ) As Map
		'Log(m)
		Msgbox2( "msg_continue_track", "Track: " & m.Get("name" ) & CRLF & _
						  m.Get("description"), _
						  "Continue Track : " & m.Get("name") & " ? ", Array("Yes","No","Edit/Export"))
		navigation = id
	Else
			'Return True
	End If		
End Sub
Sub msg_continue_track_click( txt As String )
	Dim id=navigation As Int
	navigation = 0
	If txt = "Yes" Then
		start_nav( id, Array As String( Null, Null ) )
		nav.NavigationBarVisible = False
		nav.ToolBarVisible = True
		nav.RemoveCurrentPage
	Else If txt = "No" Then
		' do nothing, but navigation must go to 0 
	Else ' Edit/Export
		pg_edit.Initialize( "pg_edit")
		pg_edit.Title = "Edit Track"
		pg_edit.RootPanel.LoadLayout( "track_edit" )
		Dim m = DBUtils.ExecuteMap( sql1, "select * from navigation where [id] = " & id, Null  ) As Map
		txt_name.Text = m.Get("name" )
		txt_description.Text = m.Get("description" )
		btn_xls.Visible = True
		btn_kml.Visible = True		
		pg_edit.Tag = id
		nav.ShowPage( pg_edit )	
	End If
End Sub


Sub pg_BarButtonClick (TagName As String)
	If TagName = "Add" Then
		pg_edit.Initialize( "pg_edit")
		pg_edit.Title = "Add Track"
		pg_edit.RootPanel.LoadLayout( "track_edit" )
		pg_edit.Tag = 0
		nav.ShowPage( pg_edit )
	Else if TagName = "Back" Then
		nav.NavigationBarVisible = False
		nav.ToolBarVisible = True
		nav.RemoveCurrentPage
	Else 
		Log(TagName)
	End If
End Sub
Sub btn_xls_Click
	Log("Export XLS")
	Dim id=pg_edit.Tag As Int
	Dim m = DBUtils.ExecuteMap( sql1, "select * from navigation where [id] = " & id, Null  ) As Map

	Dim sb As StringBuilder
	sb.Initialize
	
	Dim m = DBUtils.ExecuteMap( sql1, "select * from navigation where [id] = " & id, Null  ) As Map
	' HEADER

	Dim cols() As String = Array As String( "Id", "Lat", "Lon","Date","AppWindAngle","AppWindModulus","TrueWindAngle","TrueWindModulus", "TrueWindNorth","Bearing","Speed","Batt","Temp","Roll","Pitch","eCompass")
	For i = 0 To cols.Length - 1
		If i = cols.Length - 1 Then
			sb.Append( cols(i) & CRLF )
		Else
			sb.Append( cols(i) & ";")
		End If
	Next
	
	' Rows
	Dim li As List
	li = DBUtils.ExecuteMemoryMapList( sql1, "select * from route5 where [navigation_id] =" & id, Null, 0 )
		
	For i = 0 To li.Size - 1
		Dim n = li.Get(i) As Map
		sb.Append( n.Get("id") & ";" )
		sb.Append( "'"& n.Get("lat") & "';" )
		sb.Append( "'"& n.Get("lon") & "';" ) 
		sb.Append( DateTime.Date( n.Get("date") ) & " " & DateTime.Time( n.Get("date") ) & ";" )  ' Date
		sb.Append( NumberFormat(n.Get("awa"),1,1) & ";" )
		sb.Append( NumberFormat(n.Get("awm"),1,1) & ";" )
		sb.Append( NumberFormat(n.Get("twa"),1,1) & ";" )
		sb.Append( NumberFormat(n.Get("twm"),1,1) & ";" )
		sb.Append( NumberFormat(n.Get("twn"),1,1) & ";" )
		sb.Append( NumberFormat(n.Get("bearing"),1,1) & ";" )
		sb.Append( NumberFormat(n.Get("speed"),1,1)&";")
		sb.Append( NumberFormat(n.Get("battery"),1,1)&";")
		sb.Append( NumberFormat(n.Get("temp"),1,1)&";")
		sb.Append( NumberFormat(n.Get("roll"),1,1)&";")
		sb.Append( NumberFormat(n.Get("pitch"),1,1)&";")
		sb.Append( NumberFormat(n.Get("ecompass"),1,1)& CRLF)
	Next

   	File.WriteString(File.DirDocuments, id&"_"&m.Get("name")&".csv", sb.ToString)
	
   	Dim mf As String
	mf = "file://" & File.Combine(File.DirDocuments, id&"_"&m.Get("name")&".csv")	
	
	di.Initialize("di", File.DirDocuments, id&"_"&m.Get("name")&".csv") 
	di.OpenFile( pg.RootPanel )	

		
End Sub
Sub btn_kml_Click
	'Log("Export KML")
	Dim id=pg_edit.Tag As Int
	Dim m = DBUtils.ExecuteMap( sql1, "select * from navigation where [id] = " & id, Null  ) As Map
	
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
	li = DBUtils.ExecuteMemoryMapList( sql1, "select * from route5 where [navigation_id] =" & id, Null, 0 )
		
	For i = 0 To li.Size - 1
		Dim n = li.Get(i) As Map
	'For i=0 To TrackPoints.Size - 1
	   sb.Append("<Placemark>").Append(CRLF)
	   sb.Append("<name>" & n.Get("id") & "</name>").Append(CRLF)
	   'sb.Append("<description>"& n.Get("id") &"</description>").Append(CRLF)
	   sb.Append("<ExtendedData>")
	   sb.Append("<Data name=""Id""><value>"&n.Get("id")&"</value></Data>")
	   sb.Append("<Data name=""AppWindAngle""><value>"&NumberFormat(n.Get("awa"),1,0)&"</value></Data>")
	   sb.Append("<Data name=""AppWindModule""><value>"&NumberFormat(n.Get("awm"),1,1)&"</value></Data>")
	   sb.Append("<Data name=""TrueWindAngle""><value>"&NumberFormat(n.Get("twa"),1,0)&"</value></Data>")
	   sb.Append("<Data name=""TrueWindModule""><value>"&NumberFormat(n.Get("twm"),1,1)&"</value></Data>")
	   sb.Append("<Data name=""TrueWindNorth""><value>"&NumberFormat(n.Get("twn"),1,0)&"</value></Data>")
	   sb.Append("<Data name=""Bearing""><value>"&NumberFormat(n.Get("bearing"),1,0)&"</value></Data>")
		sb.Append("<Data name=""Speed""><value>"&NumberFormat(n.Get("speed"),1,1)&"</value></Data>")
		' new ultra
		sb.Append("<Data name=""Battery""><value>"&NumberFormat(n.Get("battery"),1,0)&"</value></Data>")
		sb.Append("<Data name=""Temp""><value>"&NumberFormat(n.Get("temp"),1,0)&"</value></Data>")
		sb.Append("<Data name=""Roll""><value>"&NumberFormat(n.Get("roll"),1,0)&"</value></Data>")
		sb.Append("<Data name=""Pitch""><value>"&NumberFormat(n.Get("pitch"),1,0)&"</value></Data>")
		sb.Append("<Data name=""Compass""><value>"&NumberFormat(n.Get("ecompass"),1,0)&"</value></Data>")

	   
	   sb.Append("</ExtendedData>")

			'<Style>
			'	<IconStyle>
			'		<scale>1.4</scale>
			'		<heading>90</heading>
			'		<Icon>
			'			<href>http://www.ogleearth.com/weather/23-27.png</href>
			'		</Icon>
			'	</IconStyle>
			'	<LabelStyle>
			'		<scale>1.1</scale>
			'	</LabelStyle>
			'</Style>	
			
	   sb.Append("<Style>")
	   sb.Append("<IconStyle><scale>0.4</scale>")
	   sb.Append("<heading>"&n.Get("bearing")&"</heading>")
	   sb.Append("<Icon>"&"<href>beaufort/b.png</href>"&"</Icon>")
	   sb.Append("</IconStyle>")
	   sb.Append("</Style>")
	   
	   sb.Append("<Point>").Append(CRLF)
	   coor = n.Get("lon") & "," & n.Get("lat")   ' Long and Lat separated by ","  (inverse order, not normal order)
	   sb.Append("<coordinates>" & coor & "</coordinates>").Append(CRLF)
	   sb.Append("</Point>").Append(CRLF)
	   sb.Append("</Placemark>").Append(CRLF)
	   
	   ' bandera beaufort
	   sb.Append("<Placemark>").Append(CRLF)	   
	   sb.Append("<Style>")
	   sb.Append("<IconStyle><scale>0.5</scale>")
	   sb.Append("<heading>"&n.Get("twn")&"</heading>")
	   sb.Append("<hotSpot x="""& ( 1*SinD(n.Get("twn")) ) &""" y="""& ( 1*CosD(n.Get("twn")) ) & """ xunits=""fraction"" yunits=""fraction""/>")
	   sb.Append("<Icon><href>beaufort/"& bf(n.Get("twm") ) &"</href></Icon>")
	   sb.Append("</IconStyle>")	   
	   sb.Append("</Style>")
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


   	'File.WriteString(File.DirDocuments, id&"_"&m.Get("name")&".kml", sb.ToString)
	File.MakeDir( File.DirTemp, "tempexport")
	File.MakeDir( File.DirTemp&"/tempexport", "beaufort" )
	For Each fi As String In Array( "b.png", "f0.png", "f1.png", "f2.png", "f3.png", "f4.png", "f5.png", "f6.png", _
									"f7.png", "f8.png", "f9.png", "f10.png", "f11.png", "f12.png" ) 
		File.Copy( File.DirAssets, fi, File.DirTemp&"/tempexport/beaufort", fi )
	Next 
	'File.WriteString(File.DirDocuments, id&"_"&m.Get("name")&".kml", sb.ToString)
	File.WriteString( File.DirTemp&"/tempexport",  id&"_"&m.Get("name")&".kml", sb.ToString)
	
	av.AsyncZipFolder( File.DirTemp&"/tempexport", File.DirTemp, id&".kmz", "av" ) 
End Sub

Sub bf( knots As Float ) As String
	If knots < 1 Then 
		Return "f0.png"
	Else If knots < 4 Then
		Return "f1.png"
	Else If knots < 7 Then
		Return "f2.png"
	Else If knots < 11 Then
		Return "f3.png"
	Else If knots < 17 Then
		Return "f4.png"
	Else If knots < 22 Then
		Return "f5.png"
	Else If knots < 28 Then
		Return "f6.png"
	Else If knots < 34 Then
		Return "f7.png"
	Else If knots < 41 Then
		Return "f8.png"
	Else If knots < 48 Then
		Return "f9.png"
	Else If knots < 56 Then
		Return "f10.png"
	Else If knots < 64 Then
		Return "f11.png"
	Else 
		Return "f12.png"
	End If 

End Sub

Sub btn_kml_Click_BACKUP
	'Log("Export KML")
	Dim id=pg_edit.Tag As Int
	Dim m = DBUtils.ExecuteMap( sql1, "select * from navigation where [id] = " & id, Null  ) As Map
	
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
	li = DBUtils.ExecuteMemoryMapList( sql1, "select * from route5 where [navigation_id] =" & id, Null, 0 )
		
	For i = 0 To li.Size - 1
		Dim n = li.Get(i) As Map
	'For i=0 To TrackPoints.Size - 1
	   sb.Append("<Placemark>").Append(CRLF)
	   sb.Append("<name>" & n.Get("id") & "</name>").Append(CRLF)
	   'sb.Append("<description>"& n.Get("id") &"</description>").Append(CRLF)
	   sb.Append("<ExtendedData>")
	   sb.Append("<Data name=""Id""><value>"&n.Get("id")&"</value></Data>")
	   sb.Append("<Data name=""AppWindAngle""><value>"&n.Get("awa")&"</value></Data>")
	   sb.Append("<Data name=""AppWindModule""><value>"&n.Get("awm")&"</value></Data>")
	   sb.Append("<Data name=""TrueWindAngle""><value>"&n.Get("twa")&"</value></Data>")
	   sb.Append("<Data name=""TrueWindModule""><value>"&n.Get("twm")&"</value></Data>")
	   sb.Append("<Data name=""Bearing""><value>"&n.Get("bearing")&"</value></Data>")
	   sb.Append("<Data name=""Speed""><value>"&n.Get("speed")&"</value></Data>")
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


   	File.WriteString(File.DirDocuments, id&"_"&m.Get("name")&".kml", sb.ToString)
	
   	Dim mf As String
	mf = "file://" & File.Combine(File.DirDocuments, id&"_"&m.Get("name")&".kml")	
	
	di.Initialize("di", File.DirDocuments, id&"_"&m.Get("name")&".kml") 
	di.OpenFile( pg.RootPanel )
	
End Sub



Sub av_ZipDone (Success As Boolean)
	Dim id=pg_edit.Tag As Int
   	Dim mf As String
	mf = "file://" & File.Combine(File.DirTemp, id&".kmz")		
	di.Initialize("di", File.DirTemp, id&".kmz") 
	di.OpenFile( pg.RootPanel )   
	File.Delete( File.DirTemp, "tempexport")
End Sub

Sub pg_edit_BarButtonClick (TagName As String)
	If TagName = "Save" Then
		If pg_edit.Tag = 0 Then
			'add
			start_nav( 0, Array As String( txt_name.Text, txt_description.Text ) ) 	' Start	
			nav.NavigationBarVisible = False
			nav.ToolBarVisible = True
			nav.RemoveCurrentPage
			nav.RemoveCurrentPage
		Else
			'modify
			Dim m As Map
			m.Initialize
			m.Put( "id", pg_edit.Tag )
			DBUtils.UpdateRecord( sql1, "navigation", "name", txt_name.Text, m )
			DBUtils.UpdateRecord( sql1, "navigation", "description", txt_description.Text, m )
			pg_refresh
			nav.RemoveCurrentPage
			
		End If
	End If
End Sub

#Region SQL -------------------------------------------------------------------------------------------------
Sub InitSql
	sql1.Initialize(File.DirLibrary, "sailwind.db", True )
	Dim m As Map
	m.Initialize
	m.Put("id", DBUtils.DB_INTEGER)
	m.Put("name", DBUtils.DB_TEXT)
	m.Put("description", DBUtils.DB_TEXT)
	m.Put("e_id", DBUtils.DB_INTEGER )    
	DBUtils.CreateTable(sql1, "boat", m, "id")
	'navigation
	m.Initialize
	m.Put("id", DBUtils.DB_INTEGER)
	m.Put("name", DBUtils.DB_TEXT)
	m.Put("description", DBUtils.DB_TEXT)
	m.Put("date_start", DBUtils.DB_INTEGER)
	m.Put("boat_id", DBUtils.DB_INTEGER)
	m.Put("e_id", DBUtils.DB_INTEGER )    
	DBUtils.CreateTable(sql1, "navigation", m, "id")
	'route
	m.Initialize
	m.Put("id", DBUtils.DB_INTEGER)
	m.Put("navigation_id", DBUtils.DB_INTEGER)
	m.Put("lat", DBUtils.DB_REAL)
	m.Put("lon", DBUtils.DB_REAL)
	m.Put("date", DBUtils.DB_INTEGER)
	m.Put("e_id", DBUtils.DB_INTEGER )    
	m.Put("awa", DBUtils.DB_REAL)
	m.Put("awm", DBUtils.DB_REAL)
	m.Put("twa", DBUtils.DB_REAL)
	m.Put("twm", DBUtils.DB_REAL)
	m.Put("twn", DBUtils.DB_REAL)
	m.Put("bearing", DBUtils.DB_REAL)
	m.Put("speed", DBUtils.DB_REAL)
	' new variables only ultra
	m.Put("battery", DBUtils.DB_REAL )
	m.Put("temp", DBUtils.DB_REAL )
	m.Put("roll", DBUtils.DB_REAL)
	m.Put("pitch", DBUtils.DB_REAL)
	m.Put("ecompass", DBUtils.DB_REAL)
	DBUtils.CreateTable(sql1, "route5", m, "id" )
End Sub

Sub start_nav( id As Int, fields() As String )
	Dim name = fields(0) As String
	Dim descrip = fields(1) As String
	Timer_sqlite.Enabled = True
	If navigation = 0 Then
		If id > 0 Then
			navigation = id
		Else
			If Not( name = Null ) Then
				Dim li As List
				Dim m As Map
				li.Initialize
				m.Initialize
				m.Put("name", name )
				m.Put("description", descrip )
				li.Add(m)
				DBUtils.InsertMaps( sql1, "navigation", li )
			End If
			m = DBUtils.ExecuteMap( sql1, "select max(id) from navigation", Null )
			navigation = m.Get( "max(id)" )
		End If
		
		Main.hd.ToastMessageShow( "Registering navigation", True )
		'For Each a As String In m.Keys 
		'	ToastMessageShow( a, True )
		'Next
		Dim m = DBUtils.ExecuteMap( sql1, "select * from navigation where [id] = " & navigation, Null  ) As Map
		nav_name = m.Get("name" )
	
	
		Main.btn_track.Text = "Stop tracking"
		Main.lbl_track.Text = nav_name
	End If
End Sub

Sub stop_nav
	Timer_sqlite.Enabled = False
	navigation = 0
	Main.btn_track.Text = "Track"
	Main.lbl_track.Text = "Not Tracking"	
End Sub

Sub Timer_sqlite_tick
	Dim li As List
	Dim m As Map
	li.Initialize
	m.Initialize
	m.Put("navigation_id", navigation)  ' change to link with navigation_id
	Log( Main.calcs_1.latitude & " " & Main.calcs_1.longitude )
	m.Put("lat", Main.calcs_1.latitude)
	m.Put("lon", Main.calcs_1.longitude)
	m.Put("date", DateTime.Now )
	'm.Put("e_id", DBUtils.DB_INTEGER )    
	m.Put("awa", Main.calcs_1.awa)
	m.Put("awm", Main.calcs_1.awm)
	m.Put("twa", Main.calcs_1.twa)
	m.Put("twm", Main.calcs_1.twm)
	m.Put("twn", Main.calcs_1.twN)
	m.Put("bearing", Main.calcs_1.bearing)
	m.Put("speed", Main.calcs_1.speed)
	m.Put("battery", Main.calcs_1.battery )
	m.Put("temp", Main.calcs_1.temp )
	m.Put("roll", Main.calcs_1.roll )
	m.Put("pitch", Main.calcs_1.pitch )
	m.Put("ecompass", Main.calcs_1.ecompass )
	li.Add( m )
	DBUtils.InsertMaps( sql1, "route5", li )
	
End Sub
#End Region

