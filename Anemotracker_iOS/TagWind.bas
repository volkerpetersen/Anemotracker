B4i=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=4.4
@EndOfDesignText@
'Class module
Sub Class_Globals
	Private Panel1 As Panel
	Dim MyCanvas As Canvas	
	Dim width,height As Int	
	Public lblText, lblValue, lblUnit As Label
	
	Dim CallBack As Object
	Dim EventName As String	
	Dim font1 As Font
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize( root As Panel, vCallBack As Object, vEventName As String, left As Int, top As Int, width1 As Int, height1 As Int, txt As String, unit As String )
	Dim d As Int 
	Dim r1 As Rect
	Panel1.Initialize( "Panel1" )
	root.AddView( Panel1, left, top, width1, height1 )
	width = width1
	height = height1	
	MyCanvas.Initialize( Panel1 )

	Panel1.Setborder(0.1, Colors.Gray, width1/10)
	Panel1.Color = Colors.RGB(240,240,240)
	
	
	'Labels
	
	lblText.Initialize("")
	lblUnit.Initialize("")
	lblValue.Initialize("")
	

	
	lblText.textColor = Colors.ARGB( 128, 0,0,0 )
	lblValue.textColor = Colors.ARGB( 255, 0,0,0 )
	lblUnit.textColor = Colors.ARGB( 128, 0,0,0 )

	Panel1.AddView( lblText, width/15, height*5/100,width, height*20/100 )
	Panel1.AddView( lblValue, 0, height*25/100, width, height*55/100) 'height*3/5+height/5 )
	Panel1.AddView( lblUnit, 0, height*78/100, width*0.9, height * 15 / 100 )

	lblText.Font = Font.CreateNew( lblText.height ) 
	lblValue.Font = Font.CreateNew( lblValue.height/1.5 ) 
	lblUnit.Font = Font.CreateNew( lblUnit.height ) 
	
	lblUnit.TextAlignment = lblUnit.ALIGNMENT_RIGHT
	lblText.TextAlignment = lblText.ALIGNMENT_LEFT
	lblValue.TextAlignment = lblValue.ALIGNMENT_CENTER
	
	lblText.Text = txt
	SetText(  txt )
	SetUnit( unit )

	CallBack = vCallBack
	EventName = vEventName	
End Sub


Public Sub SetText( txt As String )
	'lblText.Text = txt
	Set_Text( lblText, txt )
End Sub

Public Sub SetValue( txt As String )
	'lblValue.Text = txt
	Set_Text( lblValue, txt ) 
End Sub

Public Sub SetUnit( txt As String )
	'lblUnit.Text = txt
	Set_Text( lblUnit, txt )
End Sub

' FUTURO COMPROBAR QUE EL ANCHO NO SE SALE....
Private Sub Set_Text( lbl As Label, txt As String )
	Dim w,h As Float 
	Dim f As Font
	f = Font.CreateNew( lbl.height )
	h = txt.MeasureHeight( f )
	w = txt.MeasureWidth( f )

	If w > Panel1.width Then
		lbl.Font = Font.CreateNew( lbl.height * Panel1.width *0.85 / w ) 
	Else 
		lbl.Font = f
	End If
	lbl.Text = txt
End Sub

Sub Panel1_LongClick
	If SubExists(CallBack, EventName & "_LongClick", 0) Then
		CallSub( CallBack, EventName & "_LongClick" )
	End If
End Sub