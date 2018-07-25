B4i=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=4.4
@EndOfDesignText@
'Class module
Sub Class_Globals
	Dim total_bmp As Int=4
	Dim startx As Float
    Dim starty As Float
	Dim pnl As Panel
	Dim img, img2 As ImageView
	Dim lst_bmp(total_bmp) As Bitmap 
	Dim current As Int
	Dim MyCanvas As Canvas
	Dim w,h As Int 
	Dim r As Rect
	
	Dim btn_Skip, btn_Unboxing, btn_OpenApi, btn_Shop As Button
	Dim lbl_calypso As Label
	Dim app_t As Application
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize( App As Application, root As Panel, left As Int, top As Int, width As Int, height As Int)
	pnl.Initialize( "pnl" )
	root.AddView( pnl, left, top, width, height )
	app_t = App
	img.Initialize("img")
	img.ContentMode = img.MODE_FIT
	img.Color = Colors.White
	img2.Initialize("img2")
	img2.ContentMode = img.MODE_FIT
	img2.Color = Colors.White
	
	pnl.AddView( img, 0,0, pnl.width, pnl.height*0.9 )
	
	btn_Skip.Initialize( "btn_Skip", btn_Skip.STYLE_SYSTEM )
	btn_Skip.Text = "Skip"
	btn_Skip.CustomLabel.Font = Font.CreateNew(2%y)
	btn_Skip.Color = Colors.White
	btn_Skip.SetBorder( pnl.height*0.002, Colors.Gray, pnl.height*0.01 )
	pnl.AddView( btn_Skip, pnl.width*0.8, pnl.height*0.92, pnl.width*0.15, pnl.height*0.05 )

	btn_Unboxing.Initialize( "btn_Unboxing", btn_Unboxing.STYLE_SYSTEM )
	btn_Unboxing.Text = "Unboxing & Tutorial"
	btn_Unboxing.CustomLabel.Font = Font.CreateNew(2%y)
	btn_Unboxing.Color = Colors.White
	btn_Unboxing.SetBorder( pnl.height*0.002, Colors.Gray, pnl.height*0.01 )
	pnl.AddView( btn_Unboxing, pnl.width*0.05, pnl.height*0.02, pnl.width*0.30, pnl.height*0.05 )

	btn_OpenApi.Initialize( "btn_OpenApi", btn_OpenApi.STYLE_SYSTEM )
	btn_OpenApi.Text = "Open code"
	btn_OpenApi.CustomLabel.Font = Font.CreateNew(2%y)
	btn_OpenApi.Color = Colors.White
	btn_OpenApi.SetBorder( pnl.height*0.002, Colors.Gray, pnl.height*0.01 )
	pnl.AddView( btn_OpenApi, pnl.width*0.75, pnl.height*0.02, pnl.width*0.20, pnl.height*0.05 )

	btn_Shop.Initialize( "btn_Shop", btn_Shop.STYLE_SYSTEM )
	btn_Shop.Text = "Shop"
	btn_Shop.CustomLabel.Font = Font.CreateNew(2%y)
	btn_Shop.Color = Colors.White
	btn_Shop.SetBorder( pnl.height*0.002, Colors.Gray, pnl.height*0.01 )
	pnl.AddView( btn_Shop, pnl.width*0.05, pnl.height*0.92, pnl.width*0.15, pnl.height*0.05 )
	
	lbl_calypso.Initialize( "lbl_calypso" )
	lbl_calypso.Visible = False
	lbl_calypso.Multiline = True
	lbl_calypso.Text = 	"Please go To www.calypsoinstruments.com For up-To-date technical information AND news: " & CRLF 
	lbl_calypso.Text = lbl_calypso.Text & "	- Unboxing AND quick start guide " & CRLF 
	lbl_calypso.Text = lbl_calypso.Text & "	- User manuals" & CRLF 
	lbl_calypso.Text = lbl_calypso.Text & "	- App tutorials" & CRLF 
	lbl_calypso.Text = lbl_calypso.Text & "	- Frequently Asked Questions" & CRLF 
	lbl_calypso.Text = lbl_calypso.Text & "	- latest news, etc... "
	' change default size * 1.4
	lbl_calypso.Font = Font.CreateNew( lbl_calypso.Font.Size * 1.4 )
	 
	pnl.AddView( lbl_calypso, 20%x,0, 60%x, pnl.height*0.9 )
	
	MyCanvas.Initialize(pnl)
	lst_bmp(0) = LoadBitmap(File.DirAssets, "anemometro_splash.png")
	lst_bmp(1) = LoadBitmap(File.DirAssets, "segunda.jpeg") 
	lst_bmp(2) = LoadBitmap(File.DirAssets, "tercera.jpeg") 
	lst_bmp(3) = LoadBitmap(File.DirAssets, "cuarta.jpeg") 
	current = 0
	w = width
	h = height
	r.Initialize( 0,0,w,h)	
	dibuja_circulos( 0, True )
	
	
	
End Sub


Sub dibuja_circulos( actual As Int, avance As Boolean)
	Dim i As Int, relleno As Boolean

	MyCanvas.DrawColor( Colors.White )
	' Hay que tener cuidado aquí con el tema del encuadre... ahora dibujo a pelo
	
	'If avance Then
	'	pnl.SetLayoutAnimated(1000, 0.9, -pnl.width, 0, pnl.width, pnl.height) 'put the panel in the initial position
	If current < total_bmp Then
		img.Bitmap = lst_bmp(current)
		lbl_calypso.Visible = False		
	Else
		img.Bitmap = Null
		lbl_calypso.Visible = True
	End If
		'MyCanvas.DrawBitmap( lst_bmp(current), r ) 	
	'	pnl.SetLayoutAnimated(1000, 0.9, 0, 0, pnl.width, pnl.height)
	'Else
	'	pnl.SetLayoutAnimated(1000, 0.9, pnl.width, 0, pnl.width, pnl.height) 'put the panel in the initial position
	'	img.Bitmap = lst_bmp(current)
		'MyCanvas.DrawBitmap( lst_bmp(current), r ) 	
	'	pnl.SetLayoutAnimated(1000, 0.9, 0, 0, pnl.width, pnl.height)	
	'End If
	For i = 0 To (total_bmp ) ' sería hasta total_bmp -1 pero la última página es para el texto.
		If i = actual Then
			relleno = True
		Else
			relleno = False
		End If 
		MyCanvas.DrawCircle( pnl.Width*(1/3+1/3/(total_bmp)*i), pnl.Height*0.94, pnl.Width/75, Colors.Black, relleno, 1 )
	Next
	If actual < ( total_bmp ) Then
		btn_Skip.Text = "Skip"
	Else
		btn_Skip.Text = "Done"
	End If
	
	MyCanvas.Refresh
End Sub 
Sub pnl_Touch(Action As Int, X As Float, Y As Float)
    Select Action
        Case pnl.ACTION_DOWN
            startx = X
            starty = Y
        Case pnl.ACTION_MOVE
            'Log("moving")
			'pnl.SetLayoutAnimated(10, 0, X-startx, 0, 100%x, 100%y)
        Case pnl.ACTION_UP
            If Abs(Y - starty) > 20%y Then Return
            If X - startx > 20%x  Then 'right
                'Log( "Move to the right" )
				If current > 0 Then
					current = current - 1
					dibuja_circulos( current, True )
				End If		
            Else If startx - X > 20%x  Then ' left
                'Msgbox("Moved to the left","")
				'Log( "Move to the left" )
				If current < (lst_bmp.Length ) Then
					current = current + 1
					dibuja_circulos( current, False )
				End If						
            End If
    End Select
  
End Sub

Sub btn_Skip_Click
	pnl.RemoveViewFromParent
End Sub 

Sub btn_Unboxing_Click
	app_t.OpenURL( "https://calypsoinstruments.com/blogpost/Unboxing-and-Quick-Start-Guide-68" )
End Sub 

Sub btn_OpenApi_Click
	app_t.OpenURL( "https://calypsoinstruments.com/blogpost/CALYPSO-opens-CUPS-40-to-developers-66" )
End Sub 

Sub btn_Shop_Click
	app_t.OpenURL( "https://calypsoinstruments.com/shop" )
End Sub 