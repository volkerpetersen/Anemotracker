B4i=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=4.4
@EndOfDesignText@
'Class module
Sub Class_Globals
	Private Panel1 As Panel
	Private Panel2 As Panel
	Dim MyCanvas,MyCanvas2 As Canvas
	Dim w,h As Int
	Private ox,oy, ix,iy, fx, fy As Int 
	Private pth As Path
	Private bmpHand, bmpScale As Bitmap
	Dim t1 As Timer
	Dim test_d As Int 
	
	Dim CallBack As Object
	Dim EventName As String	
		'titlePath.Initialize
	'Dim tmprect As ABRectF
	'tmprect.Initialize(0.13, 0.13, 0.87, 0.87)
	'tmprect.Initialize(13, 13, 87, 87)
	'titlePath.addArc(tmprect, -180.0, -180.0)
	Dim title As String
	Dim bmpCompass As Bitmap
	Dim bmpPanel As Bitmap
	Dim font1, font2 As Font 
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize( root As Panel, vCallBack As Object, vEventName As String, vTitle As String, left As Int, top As Int, width1 As Int, height1 As Int)
	Dim d As Int 
	Dim r1 As Rect
	title = vTitle
	Panel1.Initialize( "Panel1" )
	Panel2.Initialize( "Panel2" )
	'Panel1.Visible = False
	root.AddView( Panel1, left, top, width1, height1 )
	'root.AddView( Panel2, left, top, width1, height1 )
	w = width1
	h = height1	
	
	' Crear compass y me guardo en bitmap
	initCompass
	
	' Crear hand y me guardo en bitmap
	initHand
	
	
	Panel1.Setborder(0.1, Colors.Gray, width1/10)
	Panel1.Color = Colors.RGB(240,240,240)
	Panel2.Setborder(0.1, Colors.Gray, width1/10)
	Panel2.Color = Colors.RGB(240,240,240)
	'Panel1.SetShadow(Colors.Gray, 5,5,0, True )
	
	'Panel2.Initialize( "Panel2" )
	'Panel1.AddView( Panel2, 0, 0, width1, height1 )
	'Panel2.SetBorder( 0.1, Colors.Gray, w/2 )

	MyCanvas.Initialize( Panel1 )
	MyCanvas.DrawCircle( w/2, h/2, w/2, Colors.Black, False, 0.1 )
	MyCanvas.DrawCircle( w/2, h/2, w/2, Colors.White, True, 0 )
	ox = w/2
	oy = h/2
	' Chapuza para pintar un trozo
	pth.Initialize(0,0)
	pth.LineTo( ox+CosD(-90-20)*w/2, oy+SinD(-90-20)*h/2 )
	pth.LineTo( ox, oy )
	pth.LineTo( ox+CosD(-90-60)*w/2, oy+SinD(-90-60)*h/2 )
	pth.LineTo( 0,0 )
	MyCanvas.ClipPath( pth )
	MyCanvas.DrawCircle(ox,oy, w/2-w/30+1, Colors.Red, False, w/15 )
	MyCanvas.RemoveClip
	' Chapuza para pintar verde un trozo
	pth.Initialize(w,0)
	pth.LineTo( ox+CosD(-90+20)*w/2, oy+SinD(-90+20)*h/2 )
	pth.LineTo( ox, oy )
	pth.LineTo( ox+CosD(-90+60)*w/2, oy+SinD(-90+60)*h/2 )
	pth.LineTo( w,0 )
	MyCanvas.ClipPath( pth )
	MyCanvas.DrawCircle(ox,oy, w/2-w/30+1, Colors.Green, False, w/15 )
	MyCanvas.RemoveClip	
	' Pinto los minor
	For d = 20 To 340 Step 10 
		ix = ox+CosD(-90+d)*(w/2-w/30)
		iy = oy+SinD(-90+d)*(h/2-h/30)
		fx = ox+CosD(-90+d)*w/2
		fy = oy+SinD(-90+d)*h/2
		MyCanvas.DrawLine( ix, iy, fx, fy, Colors.Black, w/800 )
	Next
	' Pinto los mayor
	For d = 30 To 350 Step 30 
		ix = ox+CosD(-90+d)*(w/2-w/15)
		iy = oy+SinD(-90+d)*(h/2-h/15)
		fx = ox+CosD(-90+d)*w/2
		fy = oy+SinD(-90+d)*h/2
		MyCanvas.DrawLine( ix, iy, fx, fy, Colors.Black, w/200 )
	Next
		ix = (w/2-w/7)
		iy = (h/2-h/7)
		'MyCanvas.DrawText( "0", ox+CosD(-90)*ix, oy+SinD(-90)*iy, Font.CreateNewBold(w/20), Colors.Black, "CENTER" )
		MyCanvas.DrawText( "30", ox+CosD(-90+32)*ix, oy+SinD(-90+32)*iy, Font.CreateNewBold(w/20), Colors.Black, "CENTER" )
		MyCanvas.DrawText( "30", ox+CosD(-90-32)*ix, oy+SinD(-90-32)*iy, Font.CreateNewBold(w/20), Colors.Black, "CENTER" )
		ix = (w/2-w/7.2)
		iy = (h/2-h/7.2)		
		MyCanvas.DrawText( "60", ox+CosD(-90+62)*ix, oy+SinD(-90+62)*iy, Font.CreateNewBold(w/20), Colors.Black, "CENTER" )
		MyCanvas.DrawText( "60", ox+CosD(-90-62)*ix, oy+SinD(-90-62)*iy, Font.CreateNewBold(w/20), Colors.Black, "CENTER" )
		ix = (w/2-w/7.8)
		iy = (h/2-h/7.8)		
		MyCanvas.DrawText( "90", ox+CosD(-90+93)*ix, oy+SinD(-90+93)*iy, Font.CreateNewBold(w/20), Colors.Black, "CENTER" )
		MyCanvas.DrawText( "90", ox+CosD(-90-93)*ix, oy+SinD(-90-93)*iy, Font.CreateNewBold(w/20), Colors.Black, "CENTER" )
		ix = (w/2-w/8)
		iy = (h/2-h/8)		
		MyCanvas.DrawText( "120", ox+CosD(-90+124)*ix, oy+SinD(-90+124)*iy, Font.CreateNewBold(w/20), Colors.Black, "CENTER" )
		MyCanvas.DrawText( "120", ox+CosD(-90-124)*ix, oy+SinD(-90-124)*iy, Font.CreateNewBold(w/20), Colors.Black, "CENTER" )
		ix = (w/2-w/9.3)
		iy = (h/2-h/9.3)			
		MyCanvas.DrawText( "150", ox+CosD(-90+152)*ix, oy+SinD(-90+152)*iy, Font.CreateNewBold(w/20), Colors.Black, "CENTER" )
		MyCanvas.DrawText( "150", ox+CosD(-90-152)*ix, oy+SinD(-90-152)*iy, Font.CreateNewBold(w/20), Colors.Black, "CENTER" )
		ix = (w/2-w/10.5)
		iy = (h/2-h/10.5)			
		MyCanvas.DrawText( "180", ox+CosD(-90+180)*ix, oy+SinD(-90+180)*iy, Font.CreateNewBold(w/20), Colors.Black, "CENTER" )
	' Dibujo barco, mejorable con bitmap o similar, no hay cubic ni nada....
	pth.Initialize(ox-w/6.5, h/1.5)
	pth.LineTo(ox-w/6.5, h/2 )
	pth.LineTo(ox-w/7.5, h/2.5 )
	pth.LineTo(ox, h/10 )
	pth.LineTo(ox+w/7.5, h/2.5 )
	pth.LineTo(ox+w/6.5, h/2 )
	pth.LineTo(ox+w/6.5,h/1.5)
	
	MyCanvas.DrawPath( pth, Colors.rgb(240,240,240), False, w/80 )	
	' Guardo scale
	bmpScale = MyCanvas.CreateBitmap

	' FALTA dibujar el HAND
	font1 = Font.CreateNew(w/22)
	font2 = Font.CreateNew(w/32)
	
	'MyCanvas.Release
	'MyCanvas.Initialize( Panel1 )
	MyCanvas2.Initialize( Panel2 )
	test_d = 0

	CallBack = vCallBack
	EventName = vEventName	
	
End Sub



Public Sub initHand
	Dim handPath As Path
	MyCanvas.Initialize( Panel1 )
	handPath.Initialize(0.5*w, (0.5+0.2)*h )
	'handPath.moveTo(0.5, 0.5 + 0.2)
	handPath.lineTo((0.5 - 0.010)*w, (0.5 + 0.2 - 0.007)*h)
	handPath.lineTo((0.5 - 0.002)*w, (0.5 - 0.45)*h)
	handPath.lineTo((0.5 + 0.002)*w, (0.5 - 0.45)*h)
	handPath.lineTo((0.5 + 0.010)*w, (0.5 + 0.2 - 0.007)*h)
	handPath.lineTo(0.5*w, (0.5 + 0.2)*h)
	MyCanvas.DrawPath( handPath, Colors.rgb(25,25,25), True, w/200)
	MyCanvas.DrawCircle(w/2,h/2,w*0.025, Colors.RGB(25,25,25), True, w/200) 
	' Guardo Hand
	bmpHand = MyCanvas.CreateBitmap
	MyCanvas.Release

End Sub

Public Sub initCompass
	Dim w1= w As Float 
	Dim h1 = h As Float 
	Dim a = 0.05*w1 As Int
	Dim b = 0.35*h1 As Int 
	Dim compPath As Path
	MyCanvas.Initialize( Panel1 )
	compPath.Initialize( 0.5*w1 - a, 0.5*h1 )
	compPath.lineTo( 0.5*w1, 0.5*h1 - b )
	compPath.LineTo( 0.5*w1, 0.5*h1 )	
	MyCanvas.DrawPath( compPath, Colors.Red, True, 0.0 )
	compPath.Initialize( 0.5*w1 + a, 0.5*h1 )
	compPath.lineTo( 0.5*w1, 0.5*h1 - b )
	compPath.LineTo( 0.5*w1, 0.5*h1 )	
	MyCanvas.DrawPath( compPath, Colors.RGB(150,0,0), True, 0.0 )
	compPath.Initialize( 0.5*w1 - a, 0.5*h1 )
	compPath.lineTo( 0.5*w1, 0.5*h1 + b )
	compPath.LineTo( 0.5*w1, 0.5*h1 )	
	MyCanvas.DrawPath( compPath, Colors.RGB(200,200,200), True, 0.0 )
	compPath.Initialize( 0.5*w1 + a, 0.5*h1 )
	compPath.lineTo( 0.5*w1, 0.5*h1 + b )
	compPath.LineTo( 0.5*w1, 0.5*h1 )	
	MyCanvas.DrawPath( compPath, Colors.RGB(150,150,150), True, 0.0 )
	bmpCompass = MyCanvas.CreateBitmap
	MyCanvas.Release
End Sub

Public Sub drawHand( degrees As Float, degrees2 As Float  )
	Dim r As Rect
	r.Initialize( 0,0,w,h)
	' Dibujo scale
	MyCanvas.Initialize( Panel1 )
	MyCanvas.DrawBitmap( bmpScale, r )
	' Texto 
	'MyCanvas.DrawText( title, w/2, h/18, Font.CreateNewBold(w/25), Colors.Gray, "CENTER" )
	MyCanvas.DrawTextRotated(title, w/8, h/8, font1, Colors.Gray, "CENTER", -45 )
	MyCanvas.DrawTextRotated(title, w-w/8, h/8, font1, Colors.Gray, "CENTER", 45 )
	
	'Dim r2 As Rect
	'r2.Initialize( w/4,h/4,w*3/4,h*3/4)
	MyCanvas.DrawBitmapRotated( bmpCompass, r, -degrees2)
	
	'Dim rad As Float = w*0.35
	'MyCanvas.DrawTextRotated( "N", w/2+rad*CosD( -degrees2-90),h/2+rad*SinD( -degrees2-90), font2, Colors.Gray, "CENTER", -degrees2 ) '-degrees2 )
	MyCanvas.DrawTextRotated( "    North", w/2,h/2, font2, Colors.White, "LEFT", -degrees2-90 ) '-degrees2 )
	MyCanvas.DrawTextRotated( "    South", w/2,h/2, font2, Colors.White, "LEFT", -degrees2+90 ) '-degrees2 )
	
	' Dibujo hand rotada
	MyCanvas.DrawBitmapRotated( bmpHand, r, degrees )
	
	'bmpPanel = MyCanvas.CreateBitmap
	'MyCanvas2.DrawBitmap( bmpPanel, r )
	
	' refresh final
	'MyCanvas2.Refresh
	MyCanvas.refresh
End Sub

Sub Panel1_LongClick
	If SubExists(CallBack, EventName & "_LongClick", 0) Then
		CallSub( CallBack, EventName & "_LongClick" )
	End If
End Sub
Sub Panel2_LongClick
	If SubExists(CallBack, EventName & "_LongClick", 0) Then
		CallSub( CallBack, EventName & "_LongClick" )
	End If
End Sub

Public Sub SetText( txt As String )
	'lblText.Text = txt
	title = txt 
End Sub