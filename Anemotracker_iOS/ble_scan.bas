B4i=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=4.4
@EndOfDesignText@
'Code module
' BLE SCAN
Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'Public variables can be accessed from all modules.
	' LIST PAGE
	Private pg As Page
	Public tvBLE As TableView
	Public btnBack As BarButton
	Private nav As NavigationController
End Sub

Sub Initialize( vNav As NavigationController )
	nav = vNav
	nav.NavigationBarVisible = True
	nav.ToolBarVisible = False
	pg.Initialize("pg")
	pg.Title = "Scan bluetooth wind sensors "	
	pg.RootPanel.LoadLayout("ble_scan")
	
	btnBack.InitializeSystem( btnBack.ITEM_CANCEL, "Back")
	btnBack.InitializeText( "Back", "Back")
	'btnBack.Tag = "Add"
	
	pg.TopLeftButtons = Array(btnBack )
	'tvBLE.Initialize("tvBLE", False )
	'pg.RootPanel.AddView( tvBLE, 0,0, 100%x, 100%y )
	Main.managerBLE.Scan(Null)
End Sub

Public Sub Page As Page
	Return pg
End Sub
'
Public Sub Table As TableView
	Return tvBLE
End Sub

Sub pg_BarButtonClick (TagName As String)
	If TagName = "Back" Then
		nav.NavigationBarVisible = False
		nav.ToolBarVisible = True
		nav.RemoveCurrentPage
	Else
		Log(TagName)
	End If
End Sub

Sub tvBLE_SelectedChanged (SectionIndex As Int, Cell As TableCell)
	If Not( Cell.Tag=Null ) Then 
		nav.NavigationBarVisible = False
		nav.ToolBarVisible = True
		nav.RemoveCurrentPage
		Dim arr = Cell.tag As List 
		'Log( arr )
		Main.connect( arr.Get(0), arr.Get(1) )
	End If
End Sub

Sub pg_Disappear
	Main.managerBLE.StopScan
End Sub