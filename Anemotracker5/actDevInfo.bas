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

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Dim clv As ListView
	Dim toolbar As ACToolBarLight
	Dim close_btn As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)

	Activity.Initialize("Activity")
	Activity.Title = "Information about"
	
	toolbar.Initialize("tb")
	toolbar.SubTitle = ""
	toolbar.Title = "Device Info"
	toolbar.SetAsActionBar
	
	toolbar.NavigationIconBitmap = LoadBitmap( File.DirAssets, "track.png")
	
	Dim AC As AppCompat
	AC.SetElevation(toolbar, 8dip)
	Activity.AddView( toolbar, 0%x, 0%y, 100%x, 55dip )
	clv.Initialize( "clv" )
	Activity.AddView( clv, 0%x, 55dip, 100%x,100%y-55dip )
	
	close_btn.Initialize("close_btn")
	Activity.AddView( close_btn, 50dip, Activity.Height - 100dip, 100dip, 50dip )
	close_btn.Text = "Close"
	close_btn.Gravity = Bit.Or( Gravity.CENTER, Gravity.BOTTOM )
	close_btn.Visible = True
	
	clv.Clear
	Dim dInfo As Map = Starter.deviceInfo
	
	For Each k As String In dInfo.Keys
		clv.AddTwoLines(k, dInfo.Get(k))
		clv.TwoLinesLayout.Label.TextColor = Colors.Black
	Next
		
	clv.visible = True
	clv.RequestFocus
	
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub clv_ItemClick (Position As Int, Value As Object)

End Sub

Sub clv_ItemLongClick( Position As Int, value As Object )

End Sub

Sub close_btn_Click
	Activity.finish
End Sub

