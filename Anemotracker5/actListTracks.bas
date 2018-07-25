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
'#Extends: android.support.v7.app.ActionBarActivity
#Extends: android.support.v7.app.AppCompatActivity

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Dim clv As ListView
	'Dim fab1 As FloatingActionButton
	Private fab1 As DSFloatingActionButton
	Dim toolbar As ACToolBarLight
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	
	
	Dim xml As XmlLayoutBuilder
	Activity.Initialize("Activity")
	Activity.Title = "Add/Select Track or Long Press"
	
	toolbar.Initialize("tb")
	toolbar.SubTitle = "Add/Select Track or Long Press"
	toolbar.Title = "Track"
	toolbar.SetAsActionBar
	
	toolbar.NavigationIconBitmap = LoadBitmap( File.DirAssets, "track.png") 
	
	Dim AC As AppCompat
	AC.SetElevation(toolbar, 8dip)
	'toolbar.AddView( LoadBitmap(File.DirAssets, "track.png") , 50dip, 50dip)
	Activity.AddView( toolbar, 0%x, 0%y, 100%x, 55dip )
	'Activity.AddMenuItem3(Null, "add_track", LoadBitmap( File.DirAssets, "icon_plus.png"), True )
	clv.Initialize( "clv" )
	Activity.AddView( clv, 0%x, 55dip, 100%x,100%y-55dip )
	
	'Load the + icon for the FAB
	'Dim xml As XmlLayoutBuilder
	fab1.Initialize( "Fab1" )
	Activity.AddView( fab1, Activity.Width-70dip, Activity.Height-70dip, 55dip,55dip )
	'fab1.IconDrawable = xml.GetDrawable("ic_add_white_24dp")
	fab1.SetIcon( xml.GetDrawable("ic_add_white_24dp"))
	'Fab1.HideOffset = 100%y - Fab1.Top
	'Fab1.Hide(False)
	'Attach the FAB to the ListView
	
	refresh
	
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub clv_ItemClick (Position As Int, Value As Object)
	Dim result As Int
    Dim m = DBUtils.ExecuteMap( Starter.sql1, "select * from navigation where [id] = " & Value, Null  ) As Map

	result = Msgbox2( "Track: " & m.Get("name" ) & CRLF & _
					  m.Get("description"), _
					  "Continue Track : " & m.Get("name") & " ? ", "Yes","", "No", Null )
	
	If result = DialogResponse.POSITIVE Then
		Dim id = Value As Int
		CallSubDelayed3( Starter, "start_nav", id, Array As String( Null, Null ) )
		Activity.finish
		'CallSubDelayed2( Main, "Activity_Recreate", False )
	Else
		'Return True
	End If	
	
End Sub

Sub clv_ItemLongClick( Position As Int, value As Object )
	Dim id = value As Int 
	CallSubDelayed3( actNavigation, "Start", "edit", id )
End Sub

Sub add_track_Click
	CallSubDelayed3( actNavigation, "Start", "add", 0 )
End Sub
Sub Fab1_Click
	add_track_Click
End Sub
Sub refresh
	clv.Clear
	
	Dim l As List
	l = DBUtils.ExecuteMemoryTable( Starter.sql1, "select * from navigation", Null, 0 )

	Dim j() As String
	Dim i As Int
	For i = 0 To l.Size - 1
		j = l.Get(i)
		clv.AddTwoLines2( j(1), j(2), j(0) )
		clv.TwoLinesLayout.Label.TextColor = Colors.Black
	Next 
	
	'Dim item As 
	'For i In l 
'		clv.AddTwoLinesAndBitmap( i.
	'Next 
	clv.visible = True
	clv.RequestFocus
End Sub

Sub finish
	Activity.finish
	'CallSubDelayed2( Main, "Activity_Recreate", False )
End Sub
