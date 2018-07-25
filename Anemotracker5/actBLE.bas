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
  	
   	Private cs As Map
   	Private cc As Map

	Public devices As Map
	
	Dim lDevices As List
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Dim toolbar As ACToolBarLight
	
	Dim clv As ListView
	'Dim fab1 As FloatingActionButton
	Private fab1 As DSFloatingActionButton
	Dim toolbar As ACToolBarLight
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	devices.Initialize
	
	lDevices.Initialize
	
	Dim xml As XmlLayoutBuilder
	Activity.Initialize("Activity")
	Activity.Title = "BLE Connection"
	
	toolbar.Initialize("tb")
	toolbar.SubTitle = "Select bluetooth device to connect"
	toolbar.Title = "Ble connection"
	toolbar.SetAsActionBar
	
	toolbar.NavigationIconBitmap = LoadBitmap( File.DirAssets, "bt.png")

	
	Dim AC As AppCompat
	AC.SetElevation(toolbar, 8dip)
	'toolbar.AddView( LoadBitmap(File.DirAssets, "track.png") , 50dip, 50dip)
	Activity.AddView( toolbar, 0%x, 0%y, 100%x, 55dip )
	'Activity.AddMenuItem3(Null, "add_track", LoadBitmap( File.DirAssets, "icon_plus.png"), True )
	clv.Initialize( "clv" )
	Activity.AddView( clv, 0%x, 55dip, 100%x,100%y-55dip )
		
	'Load the + icon for the FAB
	Dim xml As XmlLayoutBuilder
	fab1.Initialize( "Fab1" )
	Activity.AddView( fab1, Activity.Width-70dip, Activity.Height-70dip, 55dip,55dip )
	'fab1.IconDrawable = xml.GetDrawable("ic_add_white_24dp")
	Dim bmp As BitmapDrawable 
	bmp.Initialize( LoadBitmapResize( File.DirAssets, "connection.png", 256,256, True) )
	bmp.Gravity = Gravity.FILL
	fab1.SetIcon( bmp )
	
	'Fab1.HideOffset = 100%y - Fab1.Top
	'Fab1.Hide(False)
	'Attach the FAB to the ListView
	

End Sub
Sub SearchBLE(test As Boolean)
	'Starter.bSelectBLE = True
	devices.Initialize
	clv.Clear
	clv.Invalidate
	Activity.Invalidate
	toolbar.Title = "Searching"
	fab1.Hide
	'fab1.Enabled = False 
	
	CallSubDelayed(Starter, "ble_Scan")
End Sub

Sub Activity_Resume
	clv.Clear
	clv.Invalidate
	
	'autoScan
	SearchBLE(False)
End Sub



Sub Actv_End( mac As String )
	' Hemos conectado ok, 
	Activity.Finish
	Return
	
'	If Main.kvs.GetSimple( "first_conn_feedback" ) <> "NOSDFSDFDSF" Then 
'	' Compruebo que sea primera vez. Pido permiso al usuario para enviar estadística
'	' si no envía estadística, recordar por ejemplo cada 10 veces (la 1, la 11, la 21, etc).
'		If Not( Main.kvs.GetObject("num_sucess_conn") Is Double ) Then
'			Main.kvs.PutObject( "num_sucess_conn", 0.0 )
'		End If
'		Log( Main.kvs.GetObject( "num_sucess_conn" ) Mod 10 )
'		If ( Main.kvs.getobject( "num_sucess_conn" ) Mod 10 ) = 0 Then
'			' divisor por 10..
'			
'       		Dim result As Int
'			Dim ph As Phone
'			'ToastMessageShow( ph.Manufacturer & " " & ph.Model & " " & ph.Product, True )
'	   		result = Msgbox2( "Do you want to confirm to us that " _
'							  & ph.Manufacturer & " " & ph.Model & " works ok with wind sensor", _
'							  "Success connection feedback to Calypso Instruments", "Yes", "", "No", Null )
'	   		If result = DialogResponse.POSITIVE Then
'    			Dim message As Email   
'	    		message.To.Add("amaza@prodeo.es")   
'	    		message.Body = ""   
'	    		message.Subject = "Compatibility Anemotracker " & mac & " " & ph.Manufacturer & " " & ph.Model & " " & ph.Product
'	    		Try       
'	        		StartActivity(message.GetIntent) 
'	    		Catch       
'	        		Msgbox("Email Client Could Not Be Accessed, Please Make Sure You Have Setup Your Email Client", "NOTICE")   
'	    		End Try
'				Main.kvs.PutSimple( "first_conn_feedback", "NO" )
'	       	End If
'		End If
'		
'		If Main.kvs.GetObject( "num_sucess_conn" ) >= 0 Then
'			Main.kvs.PutObject( "num_sucess_conn", Main.kvs.Getobject( "num_sucess_conn" ) + 1  )
'		Else
'			Main.kvs.PutObject( "num_sucess_conn", 0.0 )
'		End If 
'		Log( Main.kvs.GetObject( "num_sucess_conn" ) Mod 10 )
'		'Log( Main.kvs.GetObject( "num_sucess_conn" )%10 )
'
'	End If
	
	
End Sub

Sub Activity_Pause (UserClosed As Boolean)
	'Starter.bSelectBLE = False 
	'CallSubDelayed( Main, "Disconnect")
End Sub

Sub addToListRT
	'Hacemos que se reordene cada vez
	lDevices.Clear
	clv.Clear
	For Each dev In Starter.devices.Values
		lDevices.Add( dev )
	Next
	lDevices.SortType( "RSSI", False )
			
	'For Each macaddress As String In devices.Keys
	For Each ultra As tUltra In lDevices
		clv.AddTwoLines2( ultra.Name , ultra.MacAddress & " rssi: " & ultra.RSSI, ultra  )
		clv.TwoLinesLayout.Label.TextColor = Colors.Black
	Next
End Sub

Sub DiscoveryFinished2
	fab1.Show
End Sub

'Sub DiscoveryFinished
'	For Each dev In Starter.devices.Values
'		lDevices.Add( dev )
'	Next
'	lDevices.SortType( "RSSI", False )
'			
'	'For Each macaddress As String In devices.Keys
'	For Each ultra As tUltra In lDevices
'		clv.AddTwoLines2( ultra.Name , ultra.MacAddress & " " & ultra.RSSI, ultra  )
'		clv.TwoLinesLayout.Label.TextColor = Colors.Black
'	Next
'	'fab1.Enabled = True 
'	fab1.Show
'	
'End Sub

Sub clv_ItemClick (Position As Int, ultra As tUltra)
	Starter.Scan.StopScan
	If Starter.connected Then
		Activity.Finish
	Else
		' Hago el finish aqui directamente.....
		Activity.Finish
		Log( ultra )
		clv.Enabled = False
		''''' paso a servicio
		'manager.Connect(Value, False)
		Starter.actual_ultra = ultra
		ToastMessageShow( "Trying to connecto to " & ultra.macaddress , True )
		If ultra.Name.StartsWith("CUPS") Then
			Starter.deviceType = 1
		else if ultra.Name.StartsWith("ULTRA") Then
			Starter.deviceType = 2
		else if ultra.Name.StartsWith("NMEA") Then
			Starter.deviceType = 3
		End If
		'Starter.bSelectBLE = True
		CallSubDelayed2( Starter, "ConnectBle", ultra ) 
		Starter.uId = ultra.macaddress
		CallSubDelayed(Main, "Connecting")
	End If
End Sub



Sub Fab1_Click
	SearchBLE(False)
End Sub


	