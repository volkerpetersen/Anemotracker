B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=7.01
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

'Activity module
Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Dim Socket1 As Socket
	Dim ServerSocket1 As ServerSocket
	'Dim InputStream1 As InputStream
	Dim AStreams As AsyncStreams
	Dim OutputStream1 As OutputStream
	Dim Conv As ByteConverter
	Dim Timer1 As Timer
	Dim MyIP As String
	Dim ServerIp As String
	Dim iStr As String 'input string
	
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Dim lblConnect As Label
	Dim btnConnect As Button
	Dim lvLog As ListView
	Dim lblMsg As Label
	
	Dim bmp_background As Bitmap
	
	Dim mls As MLScan
	Dim sp_wifi As Spinner
	Dim txt_pass As EditText
	Dim ap_index As Int
	
	Dim JSONrcv As JSONParser
	
	Dim isConfigU As Boolean = False
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Dim t As String
	
	Activity.LoadLayout("tcp")
	btnConnect.Enabled = False
	
	'Todo: Change typeface of lvLog
	lvLog.SingleLineLayout.ItemHeight = 16dip
	lvLog.SingleLineLayout.Label.TextSize = 12
	MyIP = ServerSocket1.GetMyIP
	lblConnect.Text = MyIP
	
	If FirstTime = True Then
		btnConnect_Click
	End If
	
	bmp_background = LoadBitmapResize( File.DirAssets, "Textura fibra carbono.jpg", 800, 800, True )
	SetTiledBackground( bmp_background )
	
End Sub

Sub SetTiledBackground( b As Bitmap)
	Dim bd As BitmapDrawable
	bd.Initialize(b)
	
	Dim r As Reflector
	r.Target = bd
	r.RunMethod3("setTileModeXY","REPEAT", "android.graphics.Shader$TileMode", _
                        "REPEAT", "android.graphics.Shader$TileMode")
	Activity.Background = bd
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub btnConnect_Click
	Select Case btnConnect.Text
		Case "Connect"
			btnConnect.Text = "Disconnect"
			Socket1.Initialize("Socket1")
			'Set correct ServerIp
			Socket1.Connect("192.168.4.1",50000,5000)
		Case "Disconnect"
			btnConnect.Text = "Connect"
			Socket1.Close
			'ExitApplication
		Case Else
	End Select
End Sub

Sub Socket1_Connected(Connected As Boolean)As Boolean
	If Connected = True Then
		ToastMessageShow("Connected",True)
		lvLog.AddSingleLine("Connected!")
		AStreams.Initialize(Socket1.InputStream,Socket1.OutputStream,"Astreams")
	Else
		ToastMessageShow("Server not available",True)
		lvLog.AddSingleLine("Server not available")
		btnConnect.Text = "Connect"
	End If
	btnConnect.Enabled = True
End Sub

Sub AStreams_NewData (Buffer() As Byte)
	Dim msg As String
	Dim cMsg As String
	Dim t As String
	Dim x As Int
	Dim unsignedi As Int
	Dim signedb As Byte
	
	msg = BytesToString(Buffer, 0, Buffer.Length, "ASCII")
	If isConfigU Then
		isConfigU = False
		Dim mapJ As Map
		JSONrcv.Initialize(msg)
		mapJ = JSONrcv.NextObject
		Try
			Dim ifconfig As List
			ifconfig.Initialize
			ifconfig = mapJ.Get("ifconfig")
			
			Dim a As Boolean = mls.connectWifiAP(ap_index)
			If Not(a) Then
				ToastMessageShow("Unable to connect to wifi", True)
				Return
			End If
			
			Socket1.Close
			Socket1.Initialize("Socket1")
			Socket1.Connect(ifconfig.Get(0),50000,5000)
			ToastMessageShow("Done", True)
		Catch
			ToastMessageShow("Unable to get the ip", True)
		End Try
		
	End If
	
	lvLog.AddSingleLine (msg)
	Log(msg)
	For i = 0 To msg.Length -1
		signedb = Buffer(i)
		unsignedi = Bit.And(0xff, signedb)
		cMsg = cMsg & Chr(unsignedi)
	Next
	lvLog.AddSingleLine(cMsg)
	Log(cMsg)
	lblMsg.Text = x & " / " & msg.Length & " - " & msg
	
	'if cMsg is IP
	'connectToAP
	
End Sub

Sub jsonEdit (cSSID As String, cPass As String) As String
	Dim JSON As JSONParser
	Dim Map1 As Map
	JSON.Initialize("{""essid"": ""a"", ""pass"": ""b""}")
	Map1 = JSON.NextObject
	Map1.Put("essid", cSSID)
	Map1.Put("pass", cPass)
	
	'generate JSON
	Dim JSONGenerator As JSONGenerator
	JSONGenerator.Initialize(Map1)
	Dim str_json As String = JSONGenerator.ToString & CRLF
	Msgbox(str_json, "")
	
	Return str_json
End Sub

Sub SendData(msg As String)
	Dim Buffer() As Byte
	
	Buffer = msg.GetBytes("UTF8")
	AStreams.Write(Buffer)
	AStreams.Write(Array As Byte(1024))
	
End Sub

Sub btnTest_Click
	isConfigU = True
	Socket1.Close
	Socket1.Initialize("Socket1")
	'Set correct ServerIp
	Socket1.Connect("192.168.4.1",8000,5000)

	Dim cd As CustomLayoutDialog
	Dim sf As Object = cd.ShowAsync("Wifi Connect", "Yes", "Cancel", "No", Null, False)
	cd.SetSize(100%x, 400dip)
	Wait For (sf) Dialog_Ready (DialogPanel As Panel)
	DialogPanel.LoadLayout("wifi_dlg")
	Dim lsn As List = mls.listSavedNetworks
	For Each s As String In lsn
		sp_wifi.Add(s.SubString2(1,s.IndexOf(""","))) 'nos eliminamos las comillas
	Next
	
	Wait For (sf) Dialog_Result (Result As Int)
	If Result = DialogResponse.POSITIVE Then
		'mls.addAP(i, )
		ap_index = sp_wifi.SelectedIndex
		SendData(jsonEdit(sp_wifi.SelectedItem,txt_pass.Text))
		
	End If
	
End Sub

Sub close_Click
	Activity.Finish
End Sub