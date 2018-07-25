B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Service
Version=7.01
@EndOfDesignText@
#Region  Service Attributes 
	#StartAtBoot: False
	#ExcludeFromLibrary: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	' COMPASS
	Dim orientation As PhoneSensors
	Dim fOrientation As Float
	' GPS
	Dim gps1 As GPS
	Dim gps_changed As Boolean
	Dim gps_location As Location

	' BLE
	Dim Scan As BleManager2
	'Dim serial1 As Serial
	Dim tScan, Timer_ble As Timer
	Dim tRefresh As Timer 
	Dim chPrincipal As String
	Dim actual_ultra As tUltra
	Dim connected As Boolean
	Dim bSelectBLE = False, bSetNotify = False As Boolean   ' Empleamos este bool para saber si la conn ha sido iniciada desde SelectBLE o en background
	Dim bHz = False	As Boolean								' y para saber si he hecho enable de SetNotify
	Dim devices As Map
	Type tUltra(Name As String, MacAddress As String, RSSI As Double)
	Dim last_Ultra As List 'list con datos de un device
	Dim sUltra As String 'Servicio ultra
	Dim cNormal, cRate, cSensors, cStatus, cNmea, cCalComp As String '
	Dim mId,uId As String
	Dim deviceType=0 As Int
	Dim deviceInfo As Map
	
	' Calcs
	Dim calcs_1 As WindCalcs
	' XMLRPC
	Dim Obj1 As Reflector
	Dim dt_historic As Map
	'Dim xmlrpc1 As XMLRPC
	Dim sync_cloud=False As Boolean
	
	' SQLITE
	Dim sql1 As SQL
	Dim Timer_sqlite As Timer
	Dim navigation As Int
	Dim nav_name As String
	' Vars for controlling navigation, true wind,
	Dim b_nav, b_true, b_net As Boolean
	Dim manual_disconnect As Boolean
	
	' NOTIFICATION/SERVICE
	Dim n As Notification
	
	' test
	Dim tang=0, tvel=0 As Float
	Dim c_ble = 0 As Int 
	
	Dim bleEnabled As Boolean
	Dim gps1Enabled As Boolean = True
	
	Dim tryTimes As Int = 0
	
	
	
	Private logs As StringBuilder
	Private logcat As LogCat
	
	Dim allowReport As Boolean
	
	Dim temporizador As Long
End Sub


#Region Service
Sub Service_Create
	'This is the program entry point.
	'This is a good place to load resources that are not specific to a single activity.
	' NOTIFICATION/SERVICE
	n.Initialize
	n.Icon = "icon"
	n.light = False
	n.Sound = False
	n.Vibrate = False
	n.OnGoingEvent = True
	n.SetInfo("AnemoTracker running", "Gps and compass active", Main)
	Service.StartForeground( 1, n )
	
	'Navigation disabled by default
	b_nav = False
	'True wind by default
	b_true = True
	navigation = 0
	'Network disabled by default
	b_net = False
	
	orientation.Initialize2(orientation.TYPE_ORIENTATION,3)
	
	Scan.Initialize("ble")
	gps1.Initialize("gps")
	'serial1.Initialize("serial")
	'xmlrpc1.Initialize("xmlrpc")
	calcs_1.Initialize
	' BLE
	devices.Initialize
	
	' SQLITE
	sql1.Initialize(File.DirInternal, "sailwind.db", True )
	'sql1.Initialize(File.DirRootExternal, "sailwind.db", True )
	
	Dim m As Map
	m.Initialize
	m.Put("id", DBUtils.DB_INTEGER)
	m.Put("name", DBUtils.DB_TEXT)
	m.Put("description", DBUtils.DB_TEXT)
	m.Put("e_id", DBUtils.DB_INTEGER )
	DBUtils.CreateTable(sql1, "boat", m, "id", True )
	'navigation
	m.Initialize
	m.Put("id", DBUtils.DB_INTEGER)
	m.Put("name", DBUtils.DB_TEXT)
	m.Put("description", DBUtils.DB_TEXT)
	m.Put("date_start", DBUtils.DB_INTEGER)
	m.Put("boat_id", DBUtils.DB_INTEGER)
	m.Put("e_id", DBUtils.DB_INTEGER )
	DBUtils.CreateTable(sql1, "navigation", m, "id", True )
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
	m.Put("bearing", DBUtils.DB_REAL)
	m.Put("speed", DBUtils.DB_REAL)
	' new variables only ultra
	m.Put("battery", DBUtils.DB_REAL )
	m.Put("temp", DBUtils.DB_REAL )
	m.Put("roll", DBUtils.DB_REAL)
	m.Put("pitch", DBUtils.DB_REAL)
	m.Put("ecompass", DBUtils.DB_REAL)	
	
	DBUtils.CreateTable(sql1, "route5", m, "id", True )
	
	logs.Initialize
#if RELEASE
	logcat.LogCatStart(Array As String("-v","raw","*:F","B4A:v"), "logcat")
#end if
	
End Sub

Sub Service_Start (StartingIntent As Intent)
	
	Timer_ble.Initialize( "Timer_ble", 5000 )
	Timer_ble.Enabled = False
	Timer_sqlite.Initialize( "Timer_sqlite", 5000 )
	
	If gps1.IsInitialized Then
		If gps1.GPSEnabled And Main.rp.Check(Main.rp.PERMISSION_ACCESS_FINE_LOCATION) Then
			gps_start
		Else if Main.rp.Check(Main.rp.PERMISSION_ACCESS_FINE_LOCATION) = True Then
			gps1Enabled = False
		End If
	End If
	gps_changed = False
	
	' BLE
	'ToastMessageShow( "Ble state: " & ble1.State, True )
	If Scan.State = 12 Then '12 es todo activo
		'todo funcionando
		temporizador = 10000
		ToastMessageShow( "Searching BLE devices", True )
		ble_Scan
		bleEnabled = True
		bSelectBLE = False
	Else
		bleEnabled = False
	End If
	
	Main.kvs.Initialize(File.DirInternal, "kvs")
	If Main.kvs.ContainsKey( "calibration_offset" ) Then
		calcs_1.offset =  Main.kvs.GetSimple( "calibration_offset" )
		Main.offset_angle = calcs_1.offset
	Else
		calcs_1.offset = 0
		Main.offset_angle = 0
	End If
	orientation.StartListening("orientation")
	CallSubDelayed( Main, "UpdateDrawer" )
End Sub

Sub Service_TaskRemoved
	'This event will be raised when the user removes the app from the recent apps list.
	n.Cancel(1)
	Scan.Disconnect
	Service_Destroy
	ExitApplication
End Sub

Private Sub logcat_LogCatData (Buffer() As Byte, Length As Int)
	logs.Append(BytesToString(Buffer, 0, Length, "utf8"))
	If logs.Length > 5000 Then
		logs.Remove(0, logs.Length - 4000)
	End If
End Sub

'Return true to allow the OS default exceptions handler to handle the uncaught exception.
Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
	If allowReport = False Then Return True
	'wait for 500ms to allow the logs to be updated.
	Dim jo As JavaObject
	Dim l As Long = 500
	jo.InitializeStatic("java.lang.Thread").RunMethod("sleep", Array(l))
	logcat.LogCatStop
	logs.Append(StackTrace)
	Dim email As Email
	Dim ph As Phone
	email.To.Add("anemotrackerdev@gmail.com")
	email.Subject = "App crash report " & actual_ultra.macaddress & " " & ph.Manufacturer & " " & ph.Model & " " & ph.Product
	email.Body = logs
	StartActivity(email.GetIntent)
	
	Return True
End Sub

Sub Service_Destroy
	gps1.stop
	orientation.StopListening
End Sub

#End Region

#Region Orientation
Sub orientation_SensorChanged (Values() As Float)

	fOrientation = Values(0)
	If Not( Main.portrait ) Then
		fOrientation = fOrientation + 90
	End If
	' saltos de 5??? para que ???
	'fOrientation = Round( fOrientation / 5 ) * 5
	calcs_1.compass = 360-fOrientation
	' orientación son grados frente a norte, según nuestra escala es 360 - orientation
	'scale_1.setHandTarget(360-orientacion)
	'If Abs(-fOrientation - brujula_1.backgroundTarget ) > 4 Then
	'	brujula_1.setBackgroundTarget( -fOrientation )
	'End If
	calcs_1.calc
End Sub
#End Region 
#Region GPS
Sub gps_UserEnabled (Enabled As Boolean)
	If Enabled Then
		ToastMessageShow("GPS device enabled", True)
		gps1Enabled = True
	Else
		ToastMessageShow("GPS device disabled", True)
		gps1Enabled = False
	End If
End Sub

Sub gps_LocationChanged (Location1 As Location)
	'ToastMessageShow( "Lat = " & Location1.ConvertToMinutes(Location1.Latitude) & "\n" & "Lon = " & Location1.ConvertToMinutes(Location1.Longitude)& "\n" &  "Speed = " & Location1.Speed, False )
	calcs_1.speed = Round2( Location1.Speed, 2 )
	calcs_1.bearing = Location1.Bearing
	calcs_1.latitude = Location1.Latitude
	calcs_1.longitude = Location1.Longitude
	calcs_1.altitude = Location1.Altitude
	calcs_1.calc
	gps_changed = True
	gps_location = Location1
	
End Sub

Public Sub checkGps
	If gps1.IsInitialized And gps1.GPSEnabled Then
		gps_start
	End If
End Sub

Sub gps_start
	'gps1.Start( 0, 0 )
	If Main.GPSEnabled Then 
		gps1.Start( 5000, 5 )
	Else 
		
	End If 
	'gps1.Start(5000, 10 )
	'gps1.Start( 5000, 5 )
End Sub
#End Region

#Region BLE
'Sub ScanBLE
'	bSelectBLE = True
'	ble1.Disconnect
'	ble1.Scan2( Null, False )
'	tScan.Initialize( "tScan", 10000 )
'End Sub
Sub ble_Scan
	'Scan.StopScan
	devices.Clear
	Scan.Disconnect
	Sleep(100)
	Scan.Scan2( Null, False )
	tScan.Initialize( "tScan", temporizador )
	tScan.Enabled = True
End Sub 
Sub ble_DeviceFound (name As String, MacAddress As String, AdvertisingData As Map, RSSI As Double)
	'Log(name & ", " & MacAddress & "------------------------------------------------------------")
	'tScan.Enabled = True

	'quitamos mensajes ponzoñosos
	'ToastMessageShow( "Detected " & name & " " & MacAddress & " RSSI: "& RSSI  , False )
	Dim ultra As tUltra 
	ultra.Name = name 
	ultra.MacAddress = MacAddress
	ultra.RSSI = RSSI
	'devices.Put( MacAddress, (name, MacAddress, AdvertisingData, RSSI) As List  )
	devices.Put( MacAddress, ultra )
	
	If bSelectBLE = True Then CallSubDelayed( actBLE, "addToListRT") 'add to list in real time
	'Log( name )
	'Log( MacAddress)
	'Log(RSSI)
		
	'manager.Connect(MacAddress, True)
End Sub

Sub ConnectBle( ultra As tUltra )
	Scan.StopScan
	'Log(ultra.MacAddress)
	Try
		actual_ultra = ultra
		CallSubDelayed(Main, "Connecting")
		Scan.Connect2(ultra.MacAddress, False)
		tryTimes = 0
	Catch
		Log("ConnectBle Exception: " & LastException)
'		tryTimes = tryTimes + 1
'		If tryTimes < 3 Then
'			Sleep(100) 'time to recover
'			ConnectBle(MacAddress)
'		Else
			Log ("ERROR. Se ha superado el numero de intentos")
			ToastMessageShow("Unable to connect. Plese, try again later",True)
'		End If
	End Try
End Sub

Sub ble_Connected (Services As List)
	Scan.StopScan
	tScan.Enabled = False
	Main.kvs.PutObject( "last_ultra", actual_ultra )
	bSetNotify = False
	bHz = False
	For Each s As String In Services
		Log(s)
	Next 
	Timer_ble.Enabled = True
	connected = True
	cNormal = ""
	cRate = ""
	cSensors = "" 
	cStatus = ""
	cNmea = ""
	ToastMessageShow( "Connected "&uId, True )
	For Each s As String In Services
		If s.StartsWith( "0000180d" ) Then
			sUltra = s
			Scan.ReadData(s)
		Else If s.StartsWith( "0000180a" ) Then
			sUltra = s
			Scan.ReadData(s)
		End If
	Next

	
'	For Each k As String In Services.Keys
'		'ListView1.AddTwoLines(Services.GetKeyAt(i), Services.GetValueAt(i) )
'		'ListView1.AddSingleLine( k )
'		s = Services.Get(k)
'		Log( s.Uuid )
'		
'		If s.Uuid.StartsWith( "0000180d" ) Then
'			cc.Initialize
'			cc = s.GetCharacteristics
'			For Each k As String In cc.Keys
'				Dim c As BleCharacteristic
'				c = cc.Get(k)
'				'Log( c.Uuid )
'				If c.Uuid.StartsWith( "00002a39" ) Then
'					ret_char = c
'					found = True
'					CallSubDelayed2(Main, "btn_disconnect_visible", True)
'					SelectedBLE( ret_char )
'				End If
'			Next
'		End If
'		
'		' Servicios UART BLE NORDIC y piscos 4800/38400 y retransmit CUPS->UART ON/OFF
'		'
'		'If s.Uuid.StartsWith( "6e400001-b5a3-f393-e0a9-e50e24dcca9e" ) Then
'		'	cc.Initialize
'		'	cc =
'		'End If
'	Next
	'Main.kvs.PutSimple( "last_mac", actual_mac ) ' Guardamos para siguiente vez...
	'If Not( found ) Then
	'	ble1.Disconnect
	'End If
End Sub

Sub ble_Disconnected
	
	connected = False
	'deviceType = 0
	Timer_ble.Enabled = False
	tScan.Enabled = False
	ToastMessageShow( "Disconnected from " & actual_ultra.MacAddress, False )
	Log("disconnected")
'	If Not(manual_disconnect) Then
'		Scan.Connect2(actual_mac, False)
'	Else
'		
'	End If
	'manual_disconnect = False
	

	'CallSubDelayed2(Main, "btn_disconnect_visible", False)
	CallSubDelayed( Main, "remove_secondary_drawer")
	
	CallSubDelayed( Main, "Disconnect" )
	
	calcs_1.anemo = 0
	calcs_1.vane  = 0
	calcs_1.calc
	CallSubDelayed2( Main, "Update", True )
End Sub

Sub tScan_Tick
	'Log( "tscan tick")
	tScan.Enabled = False
	ble_DiscoveryFinished
End Sub

Sub ble_DiscoveryFinished
	
	If bSelectBLE Then
		CallSubDelayed( actBLE, "DiscoveryFinished2")
		'Do nothing if we use add in real time
		'CallSubDelayed( actBLE, "DiscoveryFinished")
	Else
		ToastMessageShow("Searching for last ultra connected",True)
		Scan.StopScan ' Importante, acelera el proceso....
		'Log(devices)
		If Main.kvs.ContainsKey( "last_ultra" ) Then
			actual_ultra = Main.kvs.GetObject( "last_ultra" )
			
			If devices.ContainsKey( Main.kvs.GetObject( "last_ultra" ) ) Then
				ToastMessageShow( "Trying to connect to " & actual_ultra.MacAddress  , False )
				Scan.Connect2( actual_ultra.MacAddress, False)
				CallSubDelayed(Main, "Connecting")
			End If
		'Else
'			Dim lDevices As List 
'			lDevices.Initialize
'			
'			
'			For Each dev In devices.Values
'				lDevices.Add( dev )
'			Next
'			lDevices.SortType( "RSSI", False )
'			
'			'For Each macaddress As String In devices.Keys
'			For Each ultra As tUltra In lDevices
'				'Log( macaddress )
'				'Dim ultra = devices.Get( macaddress ) As tUltra
'				'Log(ultra)
'				If ultra.Name.StartsWith( "CUPS" ) Or ultra.name.StartsWith("ULTRA") Or ultra.name.StartsWith("NMEA") Then
'					actual_mac = ultra.Macaddress
'					ToastMessageShow( "Trying to connecto to " & ultra.macaddress , True )
'					If ultra.Name.StartsWith("CUPS") Then
'						deviceType = 1
'					else if ultra.Name.StartsWith("ULTRA") And ultra.Name.Contains("107") Then
'						deviceType = 4 ' Ultra wifi, if antes de ultra a secas
'					else if ultra.Name.StartsWith("ULTRA") Then 
'						deviceType = 2
'					else if ultra.Name.StartsWith("NMEA") Then
'						deviceType = 3
'					End If
'					'ble1.Connect2(ultra.macaddress, False) 'da problemas en las pruebas con mucho ultra	
'					uId = ultra.macaddress 
'					Exit
'				End If
'			Next
		End If
		devices.Clear
		CallSubDelayed( Main, "UpdateDrawer" )
	End If
	
End Sub

Sub SelectedBLE( ret_char As String )  	' Called from SelectBLE activity
	
'	'Log( "MAC ADDRESS"&MacAddress )
'	conn_char = ret_char
'	'manager = SelectBLE.manager
'	
'	'quitado de aqui, no era llamado
'	'''''CallSubDelayed2( SelectBLE, "Actv_End", actual_mac)
'	
'	' Esto a futuro, atacando a antiguos hace petar la aplicación. hay que chequear si está property_notify....
'	'Log( "char notify??")
'	'Log(conn_char.Properties  ) '& conn_char.PROPERTY_NOTIFY (16) si lleva
'	'Log(conn_char.Properties )
'	'Log( conn_char.PROPERTY_NOTIFY )
'	'Log( Bit.AND( conn_char.Properties, conn_char.PROPERTY_NOTIFY ) )
'	'ble1.SetCharacteristicNotification( conn_char, True )
'	If Bit.And( conn_char.Properties, conn_char.PROPERTY_NOTIFY ) = conn_char.PROPERTY_NOTIFY Then
'		ble1.SetCharacteristicNotification( conn_char, True )
'	End If
'	Timer_ble.Initialize( "Timer_ble", 500 )
'	Timer_ble.Enabled = True
'	'manager.ReadCharacteristic(conn_char)
	
End Sub

Sub Timer_ble_tick( )								' This timer calls read characteristic
	If deviceType = 2 Then ' Only portable
		Scan.ReadData2( sUltra, cRate )
	End If 
	
	
'	'ToastMessageShow( conn_char, True )
'	'conn_char.
'	If conn_char.IsInitialized Then
'		ble1.ReadCharacteristic(conn_char)
'	End If
'	
'	'ble_CharacteristicRead( True, conn_char )
'	'Log( conn_char )
	'	'Log( conn_char.GetIntValue( conn_char.FORMAT_UINT16, 0 ) )
	
	
	' Para darle un poco de vidilla al update...
	'calcs_1.calc
	'If Not( Main.bPaused ) Then
	'	CallSubDelayed( Main, "Update")
	'End If

End Sub

'Sub ble_CharacteristicChanged( Characteristic As BleCharacteristic )
'	'If Characteristic.IsInitialized Then
'	ble_CharacteristicRead( True, Characteristic )
'	'End If
'End Sub
Sub ble_DataAvailable (ServiceId As String, Characteristics As Map)
	If ServiceId.StartsWith( "0000180d" ) Then
		If Not( bSetNotify ) Then
			'Log("servicio")
			'Log(ServiceId)
			'Log("caracteristicas")
			'Log( Characteristics )
			For Each id As String In Characteristics.Keys
				If id.StartsWith( "00002a39" ) Then
					cNormal = id
					Dim bc As ByteConverter
					Scan.SetNotify( sUltra, cNormal, True )
					bSetNotify = True
				End If
				If id.StartsWith( "0000a002" ) Then
					cRate = id
					' 1 -> 1Hz 4-> 4Hz 8->8Hz
					'Sleep(500)
					'Dim bc As ByteConverter 
					'Log( "8Hz")
					'bc.LittleEndian = True
					'Dim str = "08" As String 
					'Log(  bc.HexToBytes( str ) )
					'ble1.WriteData( sUltra, id,  bc.HexToBytes( str ) )
				End If
				If id.StartsWith( "0000a003" ) Then
					cSensors = id 
				End If
				If id.StartsWith( "0000a001" ) Then
					cStatus = id
				End If
				If id.StartsWith( "0000b001" ) Then
					cNmea = id
				End If
				If id.StartsWith( "0000a00b" ) Then
					cCalComp = id
				End If
				
				'If id.StartsWith( "0000a003" ) Then
				'	Sleep(500)
				'	Dim bc As ByteConverter
				'	Log( "Sensors")
				'	bc.LittleEndian = True
				'	Dim str = "02" As String
				'	ble1.WriteData( sUltra, id,  bc.HexToBytes( str ) )
				'End If
				If sUltra.StartsWith( "0000180d" ) Then 
					CallSubDelayed( Main, "UpdateDrawer" )
					CallSubDelayed( Main, "add_secondary_drawer")
				End If 
			Next
			
		End If
		

		If Characteristics.ContainsKey( cNormal ) Then
			'Log( Characteristics.Get( cNormal ) )
			Dim bc As ByteConverter
			bc.LittleEndian = True
			'Log(bc.HexFromBytes( Characteristics.Get(cNormal)))
			Dim bVars(4) As Byte
			Dim sVars() As Short
			bc.ArrayCopy(Characteristics.Get(cNormal), 0, bVars, 0, 4 )
			sVars = bc.ShortsFromBytes( bVars )
			Dim velocidad, direccion As Float
			velocidad = sVars(0)
			direccion = sVars(1)
			calcs_1.orig_vane = direccion
			calcs_1.orig_anemo = velocidad/100
			calcs_1.vane  = direccion
			calcs_1.calc_anemo_k( velocidad / 100, direccion )
			'Log( deviceType )
			If deviceType = 2 Then  ' solo ultra, cups y nmea no lo soportan
				bc.ArrayCopy(Characteristics.Get(cNormal), 4, bVars, 0, 4 )
				'Log( bc.HexFromBytes( bVars ) )
				calcs_1.battery = ToUnsigned(bVars(0))*10
				calcs_1.temp = ToUnsigned(bVars(1)) - 100
				calcs_1.roll = ToUnsigned(bVars(2)) - 90 
				calcs_1.pitch = ToUnsigned(bVars(3)) - 90
				'Log(calcs_1.roll)
				'Log(calcs_1.pitch)
				bc.ArrayCopy(Characteristics.Get(cNormal), 8, bVars, 0, 2 ) 
				sVars = bc.ShortsFromBytes( bVars )
				calcs_1.ecompass = 360-sVars(0) + Main.offset_angle
			End If 
			'Log( sVars(0) )
			'Log( velocidad )
			'Log( direccion )

			c_ble = c_ble + 1
			calcs_1.calc
			If Not( Main.bPaused ) Then
				CallSubDelayed2( Main, "Update", False)
			End If 
		End If
		If Characteristics.ContainsKey(cRate) Then 
			Log( Characteristics.Get(cRate) )
		End If
		
	Else If ServiceId.StartsWith( "0000180a" ) Then
		'informacion
		Dim bc As ByteConverter
		bc.LittleEndian = True
		deviceInfo.Initialize
		For Each id As String In Characteristics.Keys
			If id.StartsWith("00002a29") Then 'Manufacturer name
				deviceInfo.Put("Manufacturer Name", bc.StringFromBytes(Characteristics.Get(id),"ASCII"))
			else if id.StartsWith("00002a24") Then 'Model number name
				deviceInfo.Put("Model Number", bc.StringFromBytes(Characteristics.Get(id),"ASCII"))
			else if id.StartsWith("00002a25") Then 'Serial number name
				deviceInfo.Put("Serial Number", bc.StringFromBytes(Characteristics.Get(id),"ASCII"))
			else if id.StartsWith("00002a27") Then 'HW revision
				deviceInfo.Put("Hardware Revision", bc.StringFromBytes(Characteristics.Get(id),"ASCII"))
			else if id.StartsWith("00002a26") Then 'FW revision
				deviceInfo.Put("Firmware Revision", bc.StringFromBytes(Characteristics.Get(id),"ASCII"))
			else if id.StartsWith("00002a28") Then 'SW revision
				deviceInfo.Put("Software Revision", bc.StringFromBytes(Characteristics.Get(id),"ASCII"))
			End If
		Next
		
	End If
	
End Sub



Sub ToUnsigned(b As Byte) As Int
	Return Bit.And(0xFF, b)
End Sub

'Sub ble_CharacteristicRead (Success As Boolean, Characteristic As BleCharacteristic)
'	Dim velocidad,direccion As Int
'	'Log("CR: " & Success & ": " & Characteristic.Uuid)
'	If Success Then
'		'Log("cr PRINCIPAL: " & Characteristic.GetStringValue(0))
'		'If Success Then Log("cr: " & Characteristic.GetStringValue(0))
'		velocidad = Characteristic.GetIntValue( Characteristic.FORMAT_UINT16, 0 )
'		direccion = Characteristic.GetIntValue( Characteristic.FORMAT_UINT16, 2 )
'		If Main.demo Then
'			' No hago nada para no entorpecer los datos
'		Else
'			' actualizamos y calculamos
'			If velocidad < ( 100 * 100 ) And velocidad > 0 Then  ' Evitar espureos > 100m/s y datos raros
'				'calcs_1.anemo = velocidad / 100 ' divide por 100 para obtener m/s
'				calcs_1.vane  = direccion
'				calcs_1.calc_anemo( velocidad / 100, direccion )
'				calcs_1.calc
'			End If
'		End If
'		'Log( "Velocidad " & velocidad )
'		'Log( "Dirección " & direccion )
'	Else  ' pending: make a red flag in BT button, there is some problems connecting.....
'	End If
'End Sub

Sub ble_StateChanged(state As Int)
	If state = Scan.STATE_POWERED_ON Then
		ToastMessageShow("ble habilitado", True)
		bleEnabled = True
		'ble1.Initialize("ble")
	Else If state = Scan.STATE_POWERED_OFF Then
		ToastMessageShow("ble deshabilitado", True)
		bleEnabled = False
	End If
End Sub
#End Region
#Region SQLITE 
Sub start_nav( id As Int, fields() As String )
	Dim name = fields(0) As String
	Dim descrip = fields(1) As String
	Timer_sqlite.Enabled = True
	If navigation = 0 Then
		If id > 0 Then
			navigation = id
		Else
			If Not( name = Null ) Then
				Dim l As List
				Dim m As Map
				l.Initialize
				m.Initialize
				m.Put("name", name )
				m.Put("description", descrip )
				l.Add( m )
				DBUtils.InsertMaps( sql1, "navigation", l )
			End If
			m = DBUtils.ExecuteMap( sql1, "select max(id) from navigation", Null )
			navigation = m.Get( "max(id)" )
		End If
		
		ToastMessageShow( "Registering navigation", True )

		'For Each a As String In m.Keys
		'	ToastMessageShow( a, True )
		'Next
		Dim m = DBUtils.ExecuteMap( sql1, "select * from navigation where [id] = " & navigation, Null  ) As Map
		nav_name = m.Get("name" )
		
	End If
End Sub

Sub stop_nav
	Timer_sqlite.Enabled = False
	navigation = 0
End Sub

Sub Timer_sqlite_tick
	Dim l As List
	Dim m As Map
	l.Initialize
	m.Initialize
	m.Put("navigation_id", navigation)  ' change to link with navigation_id
	m.Put("lat", calcs_1.latitude)
	m.Put("lon", calcs_1.longitude)
	m.Put("date", DateTime.Now )
	'm.Put("e_id", DBUtils.DB_INTEGER )
	m.Put("awa", calcs_1.awa)
	m.Put("awm", calcs_1.awm)
	m.Put("twa", calcs_1.twa)
	m.Put("twm", calcs_1.twm)
	m.Put("bearing", calcs_1.bearing)
	m.Put("speed", calcs_1.speed)
	'
	m.Put("battery", calcs_1.battery )
	m.Put("temp", calcs_1.temp )
	m.Put("roll", calcs_1.roll )
	m.Put("pitch", calcs_1.pitch )
	m.Put("ecompass", calcs_1.ecompass )
	l.Add( m )
	DBUtils.InsertMaps( sql1, "route5", l )

End Sub
#End Region 
#Region XMLRPC
Sub start_net
End Sub

Sub stop_net
End Sub

Sub xmlrpc_init
	'xmlrpc1.initXMLRPCClient("http://192.168.0.218:8069/xmlrpc/common")
	
	Dim args(1) As Object
	Dim types(1) As String
	args(0) = "http://192.168.0.218:8069/xmlrpc/common"
	types(0) = "java.lang.String"
	Obj1.Target = Obj1.CreateObject2( "org.xmlrpc.android.XMLRPCClient", args, types )
	Dim args2(4) As Object
	Dim types2(4) As String
	args2(0) = "login"
	args2(1) = "Pieralisi"
	args2(2) = "admin"
	args2(3) = "pieralisi_2013"
	types2(0) = "java.lang.String"
	types2(1) = "java.lang.Object"
	types2(2) = "java.lang.Object"
	types2(3) = "java.lang.Object"
	Obj1.Target = Obj1.RunMethod4( "call", args2, types2 )
	Log( "RETURN OF login --------------------------------------------------------------------------------------")
	Log( Obj1.Target)
	'Dim uid As Int
	'uId = Obj1.Target
End Sub

Sub xmlrpc_send_register
	Dim args(1) As Object
	Dim types(1) As String
	args(0) = "http://192.168.0.218:8069/xmlrpc/object"
	Obj1.Target = Obj1.CreateObject2( "org.xmlrpc.android.XMLRPCClient", args, types )
	dt_historic.Initialize
	dt_historic.Put( "tag_id", 1 )
	dt_historic.Put( "dated", "2013-12-25 00:00:00" )
	dt_historic.Put( "value", 25.0 )
	Dim args3( 7 ) As Object
	Dim types3( 7 ) As String
	args3(0) = "execute"
	args3(1) = "Pieralisi"
	args3(2) = 1
	args3(3) = "pieralisi_2013"
	args3(4) = "tag.historic"
	args3(5) = "create"
	args3(6) = dt_historic
	types3(0) = "java.lang.String"
	types3(1) = "java.lang.Object"
	types3(2) = "java.lang.Object"
	types3(3) = "java.lang.Object"
	types3(4) = "java.lang.Object"
	types3(5) = "java.lang.Object"
	types3(6) = "java.lang.Object"
	Obj1.Target = Obj1.RunMethod4( "call", args3, types3 )
	'  sock.execute( dbname, uid, pwd, 'zwise.route', 'create', dt_zwise_route )

	Return
	' iNSERT EN HISTORIC PARA TESTEO....
	args(0) = "http://192.168.0.218:8069/xmlrpc/object"
	Obj1.Target = Obj1.CreateObject2( "org.xmlrpc.android.XMLRPCClient", args, types )
	dt_historic.Initialize
	'dt_historic.Put( "tag_id", 1 )
	'dt_historic.Put( "dated", "2013-12-25 00:00:00" )
	'dt_historic.Put( "value", 25.0 )
	Dim args3( 7 ) As Object
	Dim types3( 7 ) As String
	args3(0) = "execute"
	args3(1) = "Pieralisi"
	args3(2) = 1
	args3(3) = "pieralisi_2013"
	args3(4) = "tag.historic"
	args3(5) = "create"
	args3(6) = dt_historic
	types3(0) = "java.lang.String"
	types3(1) = "java.lang.Object"
	types3(2) = "java.lang.Object"
	types3(3) = "java.lang.Object"
	types3(4) = "java.lang.Object"
	types3(5) = "java.lang.Object"
	types3(6) = "java.lang.Object"
	Obj1.Target = Obj1.RunMethod4( "call", args3, types3 )
	'  sock.execute( dbname, uid, pwd, 'zwise.route', 'create', dt_zwise_route )
End Sub
#End Region 
