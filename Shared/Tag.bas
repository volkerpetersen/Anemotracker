B4i=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=4.4
@EndOfDesignText@
'Custom View class 
#Event: ExampleEvent (Value As Int)
'#DesignerProperty: Key: BooleanExample, DisplayName: Boolean Example, FieldType: Boolean, DefaultValue: True, Description: Example of a boolean property.
'#DesignerProperty: Key: IntExample, DisplayName: Int Example, FieldType: Int, DefaultValue: 10, MinRange: 0, MaxRange: 100, Description: Note that MinRange and MaxRange are optional.
'#DesignerProperty: Key: StringWithListExample, DisplayName: String With List, FieldType: String, DefaultValue: Sunday, List: Sunday|Monday|Tuesday|Wednesday|Thursday|Friday|Saturday
'#DesignerProperty: Key: StringExample, DisplayName: String Example, FieldType: String, DefaultValue: Text
'#DesignerProperty: Key: ColorExample, DisplayName: Color Example, FieldType: Color, DefaultValue: 0xFFCFDCDC, Description: You can use the built-in color picker to find the color values.
'#DesignerProperty: Key: DefaultColorExample, DisplayName: Default Color Example, FieldType: Color, DefaultValue: Null, Description: Setting the default value to Null means that a nullable field will be displayed.
#DesignerProperty: Key: Txt, DisplayName: Variable, FieldType: String, DefaultValue: AWM
#DesignerProperty: Key: Unit, DisplayName: Unit, FieldType: String, DefaultValue: knots

Sub Class_Globals
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Dim mBase As Panel
	Private Const DefaultColorConstant As Int = -984833 'ignore
	
	'
	Private Panel1 As Panel	
	'Private MyCanvas As Canvas
	Public lblText, lblValue, lblUnit As Label
	#if B4A
		Public atlabel As AutoTextSizeLabel
	#end if 
	
	Private TagDialog As CustomLayoutDialog
	#if B4A	
		Private sp_tag As Spinner
		Private sp_unit As Spinner
	#End If
	#if B4i
		Private pk_tag As Picker
		Private pk_unit As Picker
	#End If
	Private lTags = Array As String( "AWA", "AWM", "Speed", "TWA", "TWM", "Batt", "Temp", "Roll", "Pitch", "Mag HDG") As List 
	Dim cvs As Canvas
End Sub

Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
	#if B4A
		Dim bmp As Bitmap
		bmp.InitializeMutable(1,1) 'ignore
		cvs.Initialize2(bmp)
	#end if 
End Sub

Public Sub DesignerCreateView (Base As Panel, Lbl As Label, Props As Map)
	mBase = Base
	'Log("Props: "&Props)
	Dim d As Int
	Dim r1 As Rect
	Panel1.Initialize( "Panel1" )
	mBase.AddView( Panel1, 0, 0, mBase.Width, mBase.Height )
	
	'Labels
	lblText.Initialize("")
	lblUnit.Initialize("")
	lblValue.Initialize("")
	#if B4A
		Dim pirulen, dsdigi As Typeface
		pirulen = Typeface.LoadFromAssets("pirulen_rg.ttf")
		dsdigi = Typeface.LoadFromAssets("ds-digi.ttf")
	#end if
	#if B4i
		'Dim pirulen, dsdigi As Font
		'pirulen = Font.CreateNew2( "PirulenRg-Regular", 100 )
		'Log(Font.AvailableNames)
		'For Each f As String In Font.AvailableNames
		'	Log(f)
		'Next
		'dsdigi = Font.CreateNew2( "DS-Digital", 100 )
	#End If

	lblText.textColor = Colors.ARGB( 128, 255,255,255 )
	'lblText.Text = "ABCD"
	lblValue.textColor = Colors.ARGB( 255, 255,255,255 )
	'lblValue.Text = "00.0"
	lblUnit.textColor = Colors.ARGB( 128, 255,255,255 )
	'lblUnit.Text = "degrees"
	#if B4A
		lblText.Typeface = pirulen
		lblText.Gravity = Bit.Or( Gravity.LEFT, Gravity.TOP )
		lblValue.Typeface = dsdigi
		lblValue.Padding = Array As Int(0, 0, 0, 0)
		Dim jo As JavaObject = lblValue
		jo.RunMethod("setIncludeFontPadding", Array(False))
		lblValue.Gravity = Bit.Or( Gravity.CENTER_HORIZONTAL, Gravity.BOTTOM )
		lblUnit.Typeface = pirulen
		lblUnit.Gravity = Bit.Or( Gravity.RIGHT, Gravity.TOP )	
	#End If
	#if B4i
		lblValue.TextAlignment = lblValue.ALIGNMENT_CENTER
	#End If
	mBase.AddView( lblText, 0.05*mBase.width, 0.05*mBase.height,0.6*mBase.width, 0.2*mBase.height )	
	'Panel1.AddView( lblValue, 0, mBase.height*25/100, mBase.width, mBase.height*55/100) 'height*3/5+height/5 )
	'Panel1.AddView( lblUnit, 0, mBase.height*78/100, mBase.width*0.9, mBase.height * 15 / 100 )
	mBase.AddView( lblValue, 0.05*mBase.width, 0.25*mBase.height, 0.9*mBase.width, 0.72*mBase.height) 'height*3/5+height/5 )
	mBase.AddView( lblUnit, 0.65*mBase.Width, 0.05*mBase.height, mBase.width*0.31, 0.20*mBase.height )

	SetText( Props.Get("Txt") )
	SetValue( "00.0")
	SetUnit( Props.Get("Unit") )
	If Main.kvs.ContainsKey(mEventName) Then
		Dim lTag = Main.kvs.GetObject( mEventName ) As List
		SetText( lTag.Get(0) )
		SetUnit( lTag.Get(1) )
	End If
	#if B4A
		AUTO_SIZE1(lblText)
		AUTO_SIZE1(lblValue)
		AUTO_SIZE1(lblUnit)
	#End If
	#if B4i
			SetAutosizeText( lblText, lblText.Text, "PirulenRg-Regular" )
			SetAutosizeText( lblValue, lblValue.Text, "DS-Digital" )
			SetAutosizeText( lblUnit, lblUnit.Text, "PirulenRg-Regular" )
		' no vale para nada
		'lblText.AdjustFontSizeToFit=True
		'lblValue.AdjustFontSizeToFit=True
		'lblUnit.AdjustFontSizeToFit=True
	#End If
    
End Sub
Private Sub Base_Resize (Width As Double, Height As Double)
	lblText.left= 0.05*mBase.width
	lblText.Top= 0.05*mBase.height
	lblText.Width= 0.6*mBase.width
	lblText.Height= 0.2*mBase.height 
	lblValue.Left= 0.05*mBase.width
	lblValue.Top=0.25*mBase.height
	lblValue.Width=0.9*mBase.width
	lblValue.Height=0.72*mBase.height
	lblUnit.Left= 0.65*mBase.Width
	lblUnit.Top= 0.05*mBase.height
	lblUnit.Width=mBase.width*0.31
	lblUnit.Height=0.20*mBase.height 
End Sub
Public Sub GetBase As Panel
	Return mBase
End Sub

Public Sub Pause
	
End Sub

Public Sub Update( selected As Boolean )
	'Draw( Starter.calcs_1.awa )
	'Starter.calcs_1.speed_bearing
	#if B4A
		Dim calcs = Starter.calcs_1 As WindCalcs 
	#End If
	#if B4i
		Dim calcs = Main.calcs_1 As WindCalcs 
	#end if 
	Dim value As Float
	Dim strv As String
	Select lblText.Text
		Case "AWM"
			value = calcs.awm
		Case "AWA"
			value = calcs.awa
		Case "TWM"
			value = calcs.twm
		Case "TWA"
			value = calcs.twa
		Case "Speed"
			value = calcs.speed
		Case "Temp"
			value = calcs.temp
		Case "Batt"
			value = calcs.battery
		Case "Roll"
			value = calcs.roll
		Case "Pitch"
			value = calcs.pitch
		Case "Mag HDG"
			value = calcs.ecompass
		
	End Select

	value = convert( value, lblUnit.Text )
	Select lblText.Text
		Case "AWA", "TWA","Roll","Pitch","Batt","Mag HDG"
			strv = NumberFormat( value, 3, 0 )
		Case "AWM", "TWM", "Speed"
			If lblUnit.Text = "km/h" Then 
				strv = NumberFormat2( value, 3, 1, 1, False )
			Else 
				strv = NumberFormat2( value, 2, 1, 1, False )
			End If 
		Case "Temp"
			strv = NumberFormat( value, 2, 1 )
	End Select
	
	
	SetValue( strv  )
	
End Sub

Sub convert( value As Float, unit As String )
	Select unit
		Case "m/s"
			Return value 
		Case "knots"
			Return value * 3600 / 1852
		Case "km/h"
			Return value*3.6
		Case "ºC"
			Return value 
		Case "ºF"
			Return  value * 1.8 + 32
		Case "degrees", "%"
			Return value
		
	End Select
End Sub

Public Sub SetText( txt As String )
	lblText.Text = txt
	#if B4A
		AUTO_SIZE1(lblText)
		AUTO_SIZE1(lblValue)
		AUTO_SIZE1(lblUnit)
	#End If
	#if B4i
		SetAutosizeText( lblText, lblText.Text, "PirulenRg-Regular" )
	#End If
End Sub

Public Sub SetValue( txt As String )
	lblValue.Text = txt
	'#if B4i
	'	SetAutosizeText( lblValue, lblValue.Text, "DS-Digital" )
	'#End If
End Sub

Public Sub SetUnit( txt As String )
	lblUnit.Text = txt
	#if B4A
		AUTO_SIZE1(lblText)
		AUTO_SIZE1(lblValue)
		AUTO_SIZE1(lblUnit)
	#End If
	#if B4i
		SetAutosizeText( lblUnit, lblUnit.Text, "PirulenRg-Regular" )
	#End If
End Sub

Sub Panel1_LongClick
	'Log("panel1longclick")
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
	
	#if B4A
		Dim sf As Object = TagDialog.ShowAsync("Enter variable", "Ok", "Cancel", "", LoadBitmap(File.DirAssets, "form.png"), True)
		TagDialog.SetSize(100%x, 400dip)
		Wait For (sf) Dialog_Ready(pnl As Panel)
		pnl.LoadLayout("dlg_tag")
	#end if 
	#if B4i
		Dim pnl As Panel
		pnl.Initialize("")
		Log(mBase.Width)
		Log(Main.deviceInfo)		
		pnl.SetLayoutAnimated(0, 1, 0, 0,320, 320)
		pnl.LoadLayout("dlg_tag")
		TagDialog.Initialize(pnl)
		TagDialog.Style = TagDialog.STYLE_EDIT
		Dim sf As Object = TagDialog.ShowAsync("Enter variable", "Ok", "Cancel", "", True)
		
	#End If
	
	

	'0x00002000 = TYPE_TEXT_FLAG_CAP_WORDS (capitalize first character of each word)
	'DialogFirstName.EditText.InputType = Bit.Or(0x00002000, DialogFirstName.EditText.InputType)
	'DialogLastName.EditText.InputType = Bit.Or(0x00002000, DialogLastName.EditText.InputType)
	#if B4A
		sp_tag.AddAll( lTags ) 
		sp_tag.SelectedIndex = lTags.IndexOf( lblText.Text )
		sp_tag_ItemClick( 0,0)
	#end if 
	#if B4i
		pk_tag.SetItems( 0, lTags )	
		pk_tag.SelectRow( 0 , lTags.IndexOf( lblText.Text ), False )
		pk_tag_ItemSelected(0,0) ' para poner uno por defecto
		pk_unit.SelectRow(0, pk_unit.GetItems(0).IndexOf( lblUnit.Text), False )
	
	#end if 
	'For Each var In lTags 
	'	sp_tag.Add(var)
	'Next
	'TagDialog.GetButton(DialogResponse.POSITIVE).Enabled = False
	'Log( lblText.Text )
	'Log( lTags.IndexOf(lblText.Text ) )
	
	Wait For (sf) Dialog_Result (res As Int)
	Dim flagPositive = False As Boolean
	#if B4i
		'Log(pk_tag.GetSelectedRow(0) )
		'Log( pk_tag.GetSelectedItem(0) )
		'Log( pk_unit.GetSelectedItem(0) )
		'Log(res)
		'Log(TagDialog.RESULT_POSITIVE)
		If res = TagDialog.RESULT_POSITIVE Then
			SetText( pk_tag.GetSelectedItem(0) )
			SetUnit( pk_unit.GetSelectedItem(0) )
			flagPositive = True
		End If
	#end if 
	#if B4A	
		If res = DialogResponse.POSITIVE Then
			'ToastMessageShow($"${sp_tag.SelectedItem} ${sp_unit.selecteditem} "$, True)
			SetText( sp_tag.SelectedItem )
			SetUnit( sp_unit.SelectedItem )
			flagPositive = True
		End If
	#end if 	
	If flagPositive Then
		Dim lTag As List
		lTag.Initialize
		lTag.Add( lblText.Text )
		lTag.Add( lblUnit.Text )
		Main.kvs.PutObject( mEventName, lTag )
	End If
		
		'lblValue.AdjustFontSizeToFit=True
		'SetAutosizeText( lblValue, "00.0", "DS-Digital" )
		'lblValue.SizeToFit()
		'Log("hola")
	
End Sub



Sub sp_unit_ItemClick (Position As Int, Value As Object)
	
End Sub

Sub sp_tag_ItemClick (Position As Int, Value As Object)
	#if B4A
	sp_unit.Clear
	Select sp_tag.SelectedItem As String  
		Case "AWA", "TWA"
			sp_unit.AddAll( Array As String( "degrees" ) )
		Case "AWM", "TWM", "Speed"
			sp_unit.addall( Array As String( "knots", "m/s", "km/h" ) )
		Case "Temp"
			sp_unit.AddAll( Array As String( "ºC", "ºF" ))
		Case "Batt"
			sp_unit.AddAll( Array As String ("%"))
		Case "Mag HDG", "Roll", "Pitch"
			sp_unit.AddAll( Array As String( "degrees" ) )	
	End Select
	#end if 
End Sub
Sub pk_tag_ItemSelected (Column As Int, Row As Int)
	'Log( "ITEMCLICK" )
	'Log( Column)
	'Log( Row )
	#if B4i
		Select pk_tag.GetSelectedItem(0) As String  
			Case "AWA", "TWA"
				pk_unit.SetItems( 0, Array As String( "degrees" ) )
			Case "AWM", "TWM", "Speed"
				pk_unit.SetItems( 0, Array As String( "knots", "m/s", "km/h" ) )
			Case "Temp"
				pk_unit.SetItems( 0,  Array As String( "ºC", "ºF" ) )
			Case "Batt"
				pk_unit.SetItems( 0, Array As String ("%"))
			Case "Mag HDG", "Roll", "Pitch"
				pk_unit.SetItems( 0, Array As String( "degrees" ) )
		End Select
	#end if 	
End Sub
#if B4A
	Sub AUTO_SIZE1(lbl As Label) As Float
		Dim su As StringUtils
		'Dim LHeight1 As Float
		'Llabel1.TextSize = 128
		'LHeight1 = su.MeasureMultilineTextHeight(Llabel1,Llabel1.Text) ' + 4dip
		'LHeight1 = cvs.MeasureStringWidth(Llabel1.Text, Llabel1.Typeface, Llabel1.TextSize)
		'LWidth1 = su.MeasureMultilineTextHeight(mLbl, mLbl.Text) > mLbl.Height
		'Do While LHeight1 > Llabel1.height
		For size = 2 To 1024
			lbl.TextSize = size
			'Log( "CALC: "&LHeight1 & " " &Llabel1.width)
			'LHeight1 = su.MeasureMultilineTextHeight(Llabel1,Llabel1.Text) ' + 4dip
			If cvs.MeasureStringWidth(lbl.Text, lbl.Typeface, size) > lbl.Width Or _
				su.MeasureMultilineTextHeight(lbl, lbl.Text) > lbl.height Then
				size = size-0.5
				Exit
			End If 
			'LHeight1 = cvs.MeasureStringWidth(Llabel1.Text, Llabel1.Typeface, Llabel1.TextSize)
			'If LHeight1 < Llabel1.width Then Return Llabel1.TextSize
			'Llabel1.TextSize = Llabel1.TextSize - 1
			'If Llabel1.TextSize<8 Then Return 8
		Next 
		'Loop
		lbl.TextSize = size 
		'Return 8      'Textsize should never be smaller than 8
	End Sub
#end if 
#if B4i
' FUTURO COMPROBAR QUE EL ANCHO NO SE SALE....
	Private Sub SetAutosizeText( lbl As Label, txt As String, fnt As String  )
		Dim w,h As Float
		Dim f As Font
		f = Font.CreateNew2( fnt, lbl.height )
		h = txt.MeasureHeight( f )
		w = txt.MeasureWidth( f )
		
		'Log(txt)
		'Log( w )
		'Log(lbl.Width)

		If w > lbl.width Then
			lbl.Font = Font.CreateNew2( fnt, lbl.height * lbl.width *0.85 / w )
		Else
			lbl.Font = f
		End If
		lbl.Text = txt
	End Sub
#End If


