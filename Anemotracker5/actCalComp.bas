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
	Dim vueltas As Int = 0
	Dim isNew As Boolean = False
	
	Dim secs As Int
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	
	Dim img_tutorial As ImageView
	Dim lbl_messages As Label
	Dim lbl_vueltas As Label
	Dim test_lbl As Label
	Dim add_btn As Button
	Dim btn_abr As Button
	
	Dim toolbar As ACToolBarLight
	Dim bmp_background As Bitmap
	Dim tuto As Bitmap
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("actCalComp")
	Activity.Title = "Compass Calibration"

	lbl_messages.Text = "Rotate the device slowly"
	tuto = LoadBitmap(File.DirAssets, "Cal brujula-01.png")
	img_tutorial.Bitmap = tuto
	img_tutorial.Height = tuto.Height * img_tutorial.Width/tuto.Width
	bmp_background = LoadBitmapResize( File.DirAssets, "Textura fibra carbono.jpg", 800, 800, True )
	
	SetTiledBackground( bmp_background )
	
	toolbar.Initialize("tb")
	toolbar.Title = "Compass Calibration"
	toolbar.SetAsActionBar
	toolbar.NavigationIconBitmap = LoadBitmap( File.DirAssets, "track.png")
	
	Dim ac As AppCompat
	ac.SetElevation(toolbar, 8dip)
	'toolbar.AddView( LoadBitmap(File.DirAssets, "track.png") , 50dip, 50dip)
	Activity.AddView( toolbar, 0%x, 0%y, 100%x, 55dip )
	
	'ajustamos vista
	lbl_messages.Top = img_tutorial.Height + img_tutorial.Top + 20dip
	lbl_vueltas.Top = lbl_messages.Height + lbl_messages.Top + 20dip
	add_btn.Top = lbl_messages.Height + lbl_messages.Top + 20dip
	btn_abr.Top = lbl_vueltas.Height + lbl_vueltas.Top + 20dip
	
	
	vueltas = 0 'reiniciamos variable sin tener q reiniciar app
	secs = 0
	
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
	Dim bc As ByteConverter
	bc.LittleEndian = True
	If Starter.connected Then
		'Comenzamos calibracion
		'El sleep emula un wait for activity created
		'1 segundo suficiente. Menos da problemas
		Sleep(1000)
		
		Starter.Scan.WriteData( Starter.sUltra, Starter.cCalComp, bc.HextoBytes( "01" ) )

		Dim olSecs As Int = 0
		Dim acPos, olPos As Int
		Do While vueltas < 3
			secs = secs + 1
			acPos = Starter.calcs_1.ecompass
			If Abs(acPos - olPos) > 20 Then	'Variacion de mas de 20 grados por segundo
				lbl_messages.Text = "Too Fast. Rotate Slowly"
			Else If Abs(acPos - olPos) < 2 Then
				lbl_messages.Text = "Please, rotate the device"
			Else
				lbl_messages.Text = "Keep rotating"
			End If
			olPos = acPos
			test_lbl.Text = "Debug Pos: " & acPos 'Debug
			
			If (acPos < 10 Or acPos > 350) And isNew = True And secs-olSecs > 5 Then 'añadimos una vuelta
				vueltas = vueltas + 1
				isNew = False
				'para prevenir las fluctuaciones hacemos que al menos transcurran 5 segundos entre vueltas
				olSecs = secs
			Else If (acPos > 10 Or acPos < 350) And isNew = False Then
				isNew = True
			End If
			
			If vueltas = 0 And secs > 30 Then
				Msgbox("Press +1 button if you have completed a turn but it has not been added to turns count", "")
				secs = 0
				olSecs = secs
			End If
			
			lbl_vueltas.Text = "Turns count: " & vueltas
			'El sleep permite que siga corriendo el backgrund de la app, si pones while sin mas no actualiza el drawer
			Sleep(1000) 'una vez por segundo
		Loop
		
		lbl_messages.Text = "Done"
		Starter.Scan.WriteData( Starter.sUltra, Starter.cCalComp, bc.HextoBytes( "00" ) )
		ToastMessageShow( "Compass calibrated successfully" , False )
		Activity.Finish

	End If
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub add_btn_Click
	vueltas = vueltas + 1
End Sub

Sub btn_abr_Click
	'button abort
	Dim result As Int
	Dim bc As ByteConverter
	bc.LittleEndian = True
	result = Msgbox2( "The calibration may not be finished. Do you wish to abort it?", "Abort", "Abort", "", "No", Null )
	If result = DialogResponse.POSITIVE Then
		Starter.Scan.WriteData( Starter.sUltra, Starter.cCalComp, bc.HextoBytes( "00" ) )
		ToastMessageShow( "Calibration aborted" , False )
		Activity.Finish
	End If
End Sub