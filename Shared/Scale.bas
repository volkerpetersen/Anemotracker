B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.3
@EndOfDesignText@
'Custom View class 
#Event: ExampleEvent (Value As Int)
#DesignerProperty: Key: BooleanExample, DisplayName: Boolean Example, FieldType: Boolean, DefaultValue: True, Description: Example of a boolean property.
#DesignerProperty: Key: IntExample, DisplayName: Int Example, FieldType: Int, DefaultValue: 10, MinRange: 0, MaxRange: 100, Description: Note that MinRange and MaxRange are optional.
#DesignerProperty: Key: StringWithListExample, DisplayName: String With List, FieldType: String, DefaultValue: Sunday, List: Sunday|Monday|Tuesday|Wednesday|Thursday|Friday|Saturday
#DesignerProperty: Key: StringExample, DisplayName: String Example, FieldType: String, DefaultValue: Text
#DesignerProperty: Key: ColorExample, DisplayName: Color Example, FieldType: Color, DefaultValue: 0xFFCFDCDC, Description: You can use the built-in color picker to find the color values.
#DesignerProperty: Key: DefaultColorExample, DisplayName: Default Color Example, FieldType: Color, DefaultValue: Null, Description: Setting the default value to Null means that a nullable field will be displayed.
Sub Class_Globals
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Private mBase As Panel
	Private Const DefaultColorConstant As Int = -984833 'ignore
	Private lbl_anemo As Label
	Private lbl_unit, lbl_true As Label
	Private back, img As ImageView
	Private canvas As Canvas 
	Private cnv1, cnv2, cnv3 As Canvas 
	Private bmp1, bmp2, bmp3, bmp_compass, bmp_true, bmp_app As Bitmap 
	Private rect1, rect2 As Rect 
	Dim i As Int 
	Private pos_actual, pos_destino, error,vel, einit As Int
	Private x_actual = 0, y_actual = 0, x_destino = 0, y_destino = 0, x_vel= 0, y_vel = 0 As Float 
	Private xa_actual = 0, ya_actual = 0, xa_destino = 0, ya_destino = 0, xa_vel= 0, ya_vel = 0 As Float
	Private xt_actual = 0, yt_actual = 0, xt_destino = 0, yt_destino = 0, xt_vel= 0, yt_vel = 0 As Float
	Private einit1, einit2 As Float
	Private tUpdate As Timer
	Private wind_true As Boolean
	'Type tKalman(err_measure As Float, err_estimate As Float, q As Float, current_estimate As Float, last_estimate As Float, kalman_gain As Float)
	Dim kX,kY, kXa, kYa, kXt, kYt As tKalman
	Dim cvs As Canvas
	
End Sub

Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
	Dim mea =0.003, q = 0.003 As Float
	kX.err_measure = mea
	kX.err_estimate =  0.002 'mea*refresh_hz 'no puede ser 0 el inicial
	kX.q = q
	kY.err_measure = mea
	kY.err_estimate = 0.002 'mea*refresh_hz
	kY.q = q
	kXa = kX
	kYa = kY
	kXt = kX
	kYt = kY
	tUpdate.Initialize( "tUpdate", 300)	
	Dim bmp As Bitmap
	#if b4A
		bmp.InitializeMutable(1,1) 'ignore
		cvs.Initialize2(bmp)
	#end if 
	
	
End Sub

Public Sub DesignerCreateView (Base As Panel, Lbl As Label, Props As Map)
	
	mBase = Base
	mBase.Height = mBase.Width 
	wind_true = True 
	' Init img fondo
	back.Initialize("Panel1")
	'mBase.Color = Colors.White
	mBase.AddView( back, 0,0, mBase.Width, mBase.Height )
	img.Initialize("img")
	mBase.AddView( img, 0,0,mBase.Width, mBase.Width ) 'mBase.Height )
	canvas.Initialize(img)
	#if B4A
		Dim dsdigi As Typeface
		dsdigi = Typeface.LoadFromAssets("ds-digi.ttf")
	#end if 
	
	lbl_true.Initialize("lbl_true")
	lbl_anemo.Initialize( "lbl_anemo")
	lbl_unit.Initialize( "lbl_unit")
	lbl_true.Text = "true"
	lbl_true.textColor = Colors.white
	lbl_anemo.Text = "00.0"
	lbl_anemo.TextColor = Colors.White
	lbl_unit.Text = "knots"
	lbl_unit.TextColor = Colors.White
	#if b4A
		lbl_true.Padding = Array As Int(0, 0, 0, 0)
		Dim jo As JavaObject = lbl_true
		jo.RunMethod("setIncludeFontPadding", Array(False))
		lbl_true.Gravity = Bit.Or( Gravity.CENTER_HORIZONTAL, Gravity.TOP )

		lbl_anemo.Padding = Array As Int(0, 0, 0, 0)
		Dim jo As JavaObject = lbl_anemo
		jo.RunMethod("setIncludeFontPadding", Array(False))
		lbl_anemo.Gravity =  Bit.Or( Gravity.CENTER_HORIZONTAL, Gravity.top)
		lbl_anemo.Typeface = dsdigi
		
		lbl_unit.Padding = Array As Int(0, 0, 0, 0)
		Dim jo As JavaObject = lbl_unit
		jo.RunMethod("setIncludeFontPadding", Array(False))
		lbl_unit.Gravity =  Bit.Or( Gravity.CENTER_HORIZONTAL, Gravity.top)
	#end if 
	#if b4i
		lbl_true.TextAlignment = lbl_true.ALIGNMENT_CENTER
		lbl_anemo.TextAlignment = lbl_anemo.ALIGNMENT_CENTER
		lbl_unit.TextAlignment = lbl_unit.ALIGNMENT_CENTER
	#End If
	#if b4A
		'mBase.AddView( lbl_true, 0.45*mBase.Width,0.38*mBase.height, 0.10*mBase.Width, 0.10*mBase.Height )
		'mBase.AddView( lbl_anemo, 0.42*mBase.Width,0.1*mBase.Height, 0.16*mBase.Width, 0.45*mBase.Height )
		'mBase.AddView( lbl_unit, 0.43*mBase.Width,0.55*mBase.height, 0.14*mBase.Width, 0.4*mBase.Height )
		mBase.AddView( lbl_true, 0.45*mBase.Width,0.38*mBase.height, 0.10*mBase.Width, 0.08*mBase.Height )
		mBase.AddView( lbl_anemo, 0.42*mBase.Width,0.46*mBase.Height, 0.16*mBase.Width, 0.12*mBase.Height )
		mBase.AddView( lbl_unit, 0.43*mBase.Width,0.55*mBase.height, 0.14*mBase.Width, 0.08*mBase.Height )
		
	#end if 
	#if b4i
		'mBase.AddView( lbl_true, 0.45*mBase.Width,0.40*mBase.height, 0.10*mBase.Width, 0.10*mBase.Height )
		'mBase.AddView( lbl_anemo, 0.42*mBase.Width,0.44*mBase.Height, 0.16*mBase.Width, 0.15*mBase.Height )
		'mBase.AddView( lbl_unit, 0.43*mBase.Width,0.55*mBase.height, 0.14*mBase.Width, 0.10*mBase.Height )
		mBase.AddView( lbl_true, 0.45*mBase.Width,0.38*mBase.height, 0.10*mBase.Width, 0.08*mBase.Height )
		mBase.AddView( lbl_anemo, 0.42*mBase.Width,0.46*mBase.Height, 0.16*mBase.Width, 0.12*mBase.Height )
		mBase.AddView( lbl_unit, 0.43*mBase.Width,0.55*mBase.height, 0.14*mBase.Width, 0.08*mBase.Height )
	#End If
	#if b4A
		AUTO_SIZE1(lbl_true)
		AUTO_SIZE1(lbl_anemo)
		AUTO_SIZE1(lbl_unit)
	#End If
	#if b4i
		SetAutosizeText( lbl_true, lbl_true.Text, "default" )
		SetAutosizeText( lbl_anemo, lbl_anemo.Text,"DS-Digital" )
		SetAutosizeText( lbl_unit, lbl_unit.Text, "default" )
		lbl_true.SizeToFit
	#End If
	' Inicializo rect
	rect1.Initialize(0, 0, img.Width, img.Height )'img.Height)
	'rect2.Initialize(0, 0, img.Width, img.Height)
	' SVG
	'Dim SVG As SVG
	'SVG.Initialize(File.DirAssets, "circulo2.svg")
	#if b4i
		Dim ioxSVG As SVG 
	#End If
	#if b4A
		Dim ioxSVG As ioxSVG
	#end if 
	
	#if b4i
		'ioxSVG.Initialize(File.DirAssets, "rainbowwing.svg")
		'ioxSVG.Initialize( File.DirAssets, "main_screen.svg")
		'bmp1 = ioxSVG.Export(img.Width, img.Width ) 
		bmp1.initializeresize( File.DirAssets, "main_screen.png", img.Width, img.Width, True)
	#End If
	#if b4A
		ioxSVG.Initialize("main_screen.svg")
		bmp1.InitializeMutable(img.Width,img.Width) 'img.Height)
		cnv1.Initialize2(bmp1)
		ioxSVG.RenderToCanvas(cnv1)
	#end if 
	'cnv1.Initialize2( bmp1 )
	'cnv1.DrawColor( Colors.White)
	
	'back.SetBackgroundImage( bmp1 )

	'ioxSVG.RenderToCanvas(cnv1)
	
	''SVG.DrawPicture( cnv1, rect1 )
	''cnv1.DrawPoint(img.Width/2, img.Height/2, Colors.Black)
	'' Asocio como background el bitmap
	
	
	'back.SetBackgroundImage( bmp1 )
	
	
	
	'ioxSVG.Initialize("compass-01.svg")
	#if b4i
		'ioxSVG.Initialize( File.DirAssets, "ruleta_centrada.svg")
		'bmp_compass = ioxSVG.Export(img.Width, img.Width )
		bmp_compass.initializeresize( File.DirAssets, "ruleta_centrada.png", img.Width, img.Width, True)
		'ioxSVG.Initialize( File.DirAssets, "App-01.svg")
		'bmp_app = ioxSVG.Export(img.Width, img.Width )
		bmp_app.initializeresize( File.DirAssets, "App-01.png", img.Width, img.Width, True)
		'ioxSVG.Initialize( File.DirAssets, "True-01.svg")
		'bmp_true = ioxSVG.Export(img.Width, img.Width )
		bmp_true.initializeresize( File.DirAssets, "True-01.png", img.Width, img.Width, True)

	#End If
	#if b4A 
		ioxSVG.Initialize("ruleta_centrada.svg")
		bmp_compass.InitializeMutable(img.Width,img.Width)
		cnv2.Initialize2(bmp_compass)
		ioxSVG.RenderToCanvas(cnv2)
		
		ioxSVG.Initialize("App-01.svg")
		bmp_app.InitializeMutable(img.Width,img.Width )
		cnv2.Initialize2(bmp_app)
		ioxSVG.RenderToCanvas(cnv2)
		
		ioxSVG.Initialize("True-01.svg")
		bmp_true.InitializeMutable(img.Width,img.width )
		cnv2.Initialize2(bmp_true)
		ioxSVG.RenderToCanvas(cnv2)
	#end if 
	
	
	'img.Invalidate
	
	'img.Background = SVG.CreatePictureDrawable ' MAL, no resimensiona

'	' 
'	'SVG.Initialize(File.DirAssets, "triangulo2.svg" )
'	ioxSVG.Initialize( "triangulo2.svg" )
'	bmp2.InitializeMutable(img.Width, img.Height )
'	cnv2.Initialize2( bmp2 )
'	Dim alfa=0.1 As Float
'	rect2.Initialize(img.Width*(1-alfa)/2, 0, img.Width*(1+alfa)/2, img.Height*alfa)
'	'SVG.DrawPicture( cnv2, rect2 )
'	ioxSVG.RenderToCanvas(cnv2)
'	bmp3.InitializeMutable(img.Width, img.Height )
'	cnv3.Initialize2( bmp3 )
'	cnv3.DrawBitmap( bmp2, Null, rect2 )
'	'cnv2.DrawLine( img.Width/2, 0, img.Width/2, img.Height/2, Colors.Black, 1.0)
'	'canvas.DrawBitmapRotated( bmp2,Null , rect1, 90)

	pos_actual = 0
	pos_destino = 0
	'accel = 1
	vel = 0
	einit=0
	
	Draw
	
End Sub

Private Sub Base_Resize (Width As Double, Height As Double)
	mBase.Width = Width 
	mBase.Height = Height
	img.Height = mBase.Height
	img.Width = mBase.Width
	rect1.Initialize(0, 0, img.Width, img.Height )
	lbl_true.left = 0.43*mBase.Width
	lbl_true.top = 0.37*mBase.height
	lbl_true.width = 0.10*mBase.Width
	lbl_true.Height = 0.08*mBase.Height
	lbl_anemo.left = 0.40*mBase.Width
	lbl_anemo.top= 0.45*mBase.Height
	lbl_anemo.Width=0.16*mBase.Width
	lbl_anemo.Height=0.12*mBase.Height 
	lbl_unit.left=0.41*mBase.Width
	lbl_unit.top=0.53*mBase.height
	lbl_unit.Width=0.14*mBase.Width
	lbl_unit.Height=0.08*mBase.Height
End Sub

Public Sub GetBase As Panel
	Return mBase
End Sub

Public Sub Pause
	tUpdate.Enabled = False
End Sub
Public Sub Update( selected As Boolean )
	If selected Then
		xa_actual = xa_destino
		ya_actual = ya_destino
		xt_actual = xt_destino
		yt_actual = yt_destino
	End If
	'Log( mEventName )
	#if b4A
		pos_destino = Starter.calcs_1.awa
		'Draw( Starter.calcs_1.awm, pos_destino )
		xa_destino = CosD( Starter.calcs_1.awa ) 'Starter.calcs_1.awm*
		ya_destino = SinD( Starter.calcs_1.awa ) 'Starter.calcs_1.awm*
		xt_destino = CosD( Starter.calcs_1.twa ) 'Starter.calcs_1.awm*
		yt_destino = SinD( Starter.calcs_1.twa ) 'Starter.calcs_1.awm*
	#end if 
	#if b4i
		pos_destino = Main.calcs_1.awa
		xa_destino = CosD( Main.calcs_1.awa ) 'Starter.calcs_1.awm*
		ya_destino = SinD( Main.calcs_1.awa ) 'Starter.calcs_1.awm*
		xt_destino = CosD( Main.calcs_1.twa ) 'Starter.calcs_1.awm*
		yt_destino = SinD( Main.calcs_1.twa ) 'Starter.calcs_1.awm*
	#End If
	'einit = pos_destino - pos_actual
	einit1 = x_destino - x_actual
	einit2 = y_destino - y_actual 
	'vel = 0
	'accel = 0
	tUpdate.Enabled = True 
	'Log( Starter.calcs_1.awm )
	'Log( Starter.calcs_1.awa )
	'Starter.calcs_1.speed_bearing
End Sub

'Sub t1_Tick
Sub tUpdate_Tick
	xa_actual = updateEstimate( xa_destino, kXa )
	ya_actual = updateEstimate( ya_destino, kYa )
	xt_actual = updateEstimate( xt_destino, kXt )
	yt_actual = updateEstimate( yt_destino, kYt )
	Draw 
End Sub

Sub updateEstimate(mea As Float, k As tKalman) As Float
  
	k.kalman_gain = k.err_estimate/(k.err_estimate + k.err_measure)
	k.current_estimate = k.last_estimate + k.kalman_gain * (mea - k.last_estimate)
	k.err_estimate =  (1.0 - k.kalman_gain)*k.err_estimate + Abs(k.last_estimate-k.current_estimate)*k.q 'PK
	k.last_estimate=k.current_estimate

	Return k.current_estimate
End Sub

Sub tUpdate_Tick_back
	Dim accel As Float  
	Dim error_x, error_y As Float
	' X
	error_x = x_destino - x_actual 
	If Abs(error_x) >0 Then 
		If Abs(error_x) > Abs(einit1/2) Then
			accel = error_x*Abs(einit1/500)/Abs(error_x)
		Else
			accel = -error_x*Abs(einit1/500)/Abs(error_x)
		End If 
		If Abs(error_x) > 0.01 Then 
			x_vel = x_vel + accel
		End If
		If Abs(x_vel) > Abs(error_x) Then
			x_actual = x_destino 
			x_vel = 0
		Else
			x_actual = x_actual + x_vel
		End If
	End If 
	' Y
	error_y = y_destino - y_actual
	If Abs(error_y) > 0 Then 
		If Abs(error_y) > Abs(einit2/2) Then
			accel = error_y*Abs(einit2/500)/Abs(error_y)
		Else
			accel = -error_y*Abs(einit2/500)/Abs(error_y)
		End If
		If Abs(error_y) > 0.01 Then
			y_vel = y_vel + accel 
		End If
		If Abs(y_vel) > Abs(error_y) Then
			y_actual = y_destino
			y_vel = 0
		Else
			y_actual = y_actual + y_vel
		End If
	End If 
	'Log( Round2(x_destino,2) & " " & Round2(y_destino,2) & "/"&Round2(x_actual,2) & " "& Round2(y_actual,2) & "/" & Round2(x_vel,2) & " " & Round2(y_vel,2) & "/" & Round2(error_x,2)&" "&Round2(error_y,2)&"/"&accel )
	'i = i + 1
	Draw '( pos_actual )
End Sub 

Sub Draw '( modulo As Float, angle As Float )
	canvas.DrawColor( Colors.Transparent)
	#if b4A
		canvas.DrawBitmap( bmp1, Null, rect1 )
		'Correccion brujula rote con datos Ultra
		canvas.DrawBitmapRotated( bmp_compass,Null,rect1, Starter.calcs_1.speed_bearing ) 'Anterior: Starter.calcs_1.speed_bearing 

	#end if 
	#if b4i
		canvas.DrawBitmap( bmp1, rect1 )
		'Correccion brujula rote con datos Ultra
		canvas.DrawBitmapRotated( bmp_compass,rect1, Main.calcs_1.speed_bearing ) 'Anterior: Starter.calcs_1.speed_bearing
	#End If
	
	'Log( rect1.Width & " " & rect1.Height & " " & rect1.CenterX & " " &rect1.CenterY )
	Dim intermedio = ATan2D( ya_actual, xa_actual) As Float 
	Dim intermedio2 = 360+intermedio As Int   
	Dim angle = intermedio2 Mod 360 As Float
	#if b4A
		canvas.DrawBitmapRotated( bmp_app,Null , rect1, angle)
	#end if 
	#if b4i
		canvas.DrawBitmapRotated( bmp_app, rect1, angle)
	#End If
	intermedio = ATan2D( yt_actual, xt_actual)
	intermedio2 = 360+intermedio 
	angle = intermedio2 Mod 360 
	#if b4A
		canvas.DrawBitmapRotated( bmp_true, Null, rect1, angle )
	#end if 
	#if b4i
		canvas.DrawBitmapRotated( bmp_true, rect1, angle )
	#End If
	If wind_true Then 
		lbl_true.text = "true"
		#if b4A
			lbl_anemo.text = NumberFormat2( Starter.calcs_1.twm* 3600 / 1852, 2, 1, 1, False )
		#end if
		#if b4i
			lbl_anemo.text = NumberFormat2( Main.calcs_1.twm* 3600 / 1852, 2, 1, 1, False )
		#End If
	Else
		lbl_true.text = "app"
		#if b4A
			lbl_anemo.text = NumberFormat2( Starter.calcs_1.awm* 3600 / 1852, 2, 1, 1, False )
		#end if
		#if b4i
			lbl_anemo.text = NumberFormat2( Main.calcs_1.awm* 3600 / 1852, 2, 1, 1, False )
		#End If
	End If  
	'Log(AUTO_SIZE1(lbl_anemo))
	'reloj.Rotate = i
	#if b4A
		img.Invalidate
	#end if 
	#if b4i
		canvas.Refresh
	#End If
	'gv.Invalidate
	'i = i + 1
	'Log( i )
End Sub

Sub Panel1_LongClick
	#if B4A
		If SubExists(mCallBack, mEventName & "_LongClick") Then
			CallSub( mCallBack, mEventName & "_LongClick" )
		End If
	#end if 
	#if B4i
		If SubExists(mCallBack, mEventName & "_LongClick", 0) Then
			CallSub( mCallBack, mEventName & "_LongClick" )
		End If
	#End If	
	wind_true = Not( wind_true )
	'Log(tUpdate.enabled)
End Sub

#if B4A
	Sub AUTO_SIZE1(Llabel1 As Label) As Float
		Dim su As StringUtils
		Dim LHeight1 As Float
		Llabel1.TextSize = 128
		'LHeight1 = su.MeasureMultilineTextHeight(Llabel1,Llabel1.Text) ' + 4dip
		LHeight1 = cvs.MeasureStringWidth(Llabel1.Text, Llabel1.Typeface, Llabel1.TextSize) 
		'Do While LHeight1 > Llabel1.height 
		Do While LHeight1 > Llabel1.width
			'Log( "CALC: "&LHeight1 & " " &Llabel1.width)
			'LHeight1 = su.MeasureMultilineTextHeight(Llabel1,Llabel1.Text) ' + 4dip
			LHeight1 = cvs.MeasureStringWidth(Llabel1.Text, Llabel1.Typeface, Llabel1.TextSize)
			If LHeight1 < Llabel1.width Then Return Llabel1.TextSize
			Llabel1.TextSize = Llabel1.TextSize - 1
			If Llabel1.TextSize<8 Then Return 8
		Loop
		
		Return 8      'Textsize should never be smaller than 8
	End Sub
#end if

#if B4i
' FUTURO COMPROBAR QUE EL ANCHO NO SE SALE....
Private Sub SetAutosizeText( lbl As Label, txt As String, fnt As String  )
	Dim w,h As Float
	Dim f As Font
	If fnt = "default" Then
		f = Font.CreateNew( lbl.height )
	Else
		f = Font.CreateNew2( fnt, lbl.height )
	End If
	h = txt.MeasureHeight( f )
	w = txt.MeasureWidth( f )
		
	'Log(txt)
	'Log( w )
	'Log(lbl.Width)

	If w > lbl.width Then
		If fnt = "default" Then
			lbl.Font = Font.CreateNew( lbl.height * lbl.width *0.85 / w )
		Else
			lbl.Font = Font.CreateNew2( fnt, lbl.height * lbl.width *0.85 / w )
		End If
	Else
		lbl.Font = f
	End If
	lbl.Text = txt
End Sub
#End If