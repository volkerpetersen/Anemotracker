B4i=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=4.4
@EndOfDesignText@
'Class module
Sub Class_Globals
	Private pnlBackground As Panel
	Private pnlCustomdialog As Panel
	Dim pnlTitel, pnlButton As Panel
	Private imgTitel As ImageView
	Private lblTitel As Label
	Private btn(3) As Button
	Private pnlParent As Panel
	Private lstButton As List
	Private mModule As Object
	Private mEventName As String
	Dim max_width,max_height As Int
	
	
End Sub

'Initializes the object.
'EventName - Sets the Sub that will handle the Click event.
'Page1 - Page where you want to display dialog.
Public Sub Initialize(Module As Object, Page1 As Page, EventName As String)
	mModule = Module
	mEventName = EventName
	pnlParent = Page1.RootPanel
	
	pnlBackground.Initialize("")
	pnlBackground.Color = Colors.ARGB(60,120,0,0) '.Transparent
	pnlBackground.Visible = False
	pnlCustomdialog.Initialize("")
	pnlCustomdialog.SetBorder(1, Colors.Black, 5)
	pnlCustomdialog.Color = Colors.White

	imgTitel.Initialize("")
	imgTitel.ContentMode = imgTitel.MODE_FILL
	
	pnlTitel = NewPanel
	pnlButton = NewPanel

	lblTitel = NewLabel("", Colors.Black, Font.CreateNew2("Arial-BoldMT", 18), lblTitel.ALIGNMENT_LEFT)
	pnlTitel.AddView(imgTitel, 5, 5, 30dip, 30dip)
	pnlTitel.AddView(lblTitel, 40, 0, 80dip, 40dip)
	
	
	btn(0) = NewButton("", 18, Font.CreateNew(18), 0)
	btn(1) = NewButton("", 18, Font.CreateNew(18), 1)
	btn(2) = NewButton("", 18, Font.CreateNew(18), 2)
	
	pnlButton.AddView(btn(0), 5, 5, 100dip, 40dip)
	pnlButton.AddView(btn(1), btn(0).width + 10dip, 5, 100dip, 40dip)
	pnlButton.AddView(btn(2), btn(0).width + 10dip + btn(1).width + 5dip, 5, 100dip, 40dip)

	pnlCustomdialog.AddView(pnlTitel, 0, 0, 80dip, 40dip)
	pnlCustomdialog.AddView(pnlButton, 0, 0, 80dip, 50dip)

	'pnlBackground.AddView(pnlCustomdialog, 10, (pnlParent.Height - 100dip) / 2, 320dip, 200dip)
	pnlBackground.AddView(pnlCustomdialog, 0, 0, pnlParent.width, pnlParent.height)

	pnlParent.AddView(pnlBackground, 0, 0, pnlParent.width, pnlParent.height)
	max_width = pnlCustomdialog.Width - 10
	max_height = pnlCustomdialog.Height - pnlButton.Height -pnlTitel.Height - 10
End Sub

'Title - The Dialog title
'Buttons - A List of strings that will used as buttons ( max. 3)
'Icon - A bitmap that will be drawn near the title. Pass Null if you dont't want to show an icon.
Public Sub Show(Title As String, Buttons As List, icon As Bitmap)
	lstButton = Buttons
	pnlTitel.width = pnlCustomdialog.width
	
	If icon = Null Or Not(icon.IsInitialized) Then
		imgTitel.Visible = False
		lblTitel.Left = 5
		lblTitel.width = pnlTitel.width
	Else
		imgTitel.Bitmap = icon
		lblTitel.Left = 40
		lblTitel.width = pnlTitel.width - 40
	End If
	lblTitel.Text = Title
	
	pnlButton.Top = pnlCustomdialog.height - pnlButton.height
	pnlButton.width = pnlCustomdialog.width

	If lstButton.Size = 0 Then
		btn(0).Tag = -1
		btn(0).Text = "OK"
		btn(0).width = 100
		btn(0).Left = (pnlButton.width - btn(0).width) / 2
	Else
		Dim NextWidth As Int = 5
		Dim btnWidth As Int = (pnlButton.width - (10 * lstButton.Size)) / lstButton.Size 
		For I = 0 To lstButton.Size -1
			btn(I).Visible = True
			btn(I).Text = lstButton.Get(I)
			btn(I).width = btnWidth
			btn(I).Left = NextWidth
			NextWidth = NextWidth + btnWidth + 10
		Next
	End If
	SetDialogToMiddle
	pnlBackground.Visible = True
End Sub

Private Sub SetDialogToMiddle
	pnlCustomdialog.Left = (pnlParent.width - pnlCustomdialog.width) / 2
	pnlCustomdialog.Top = (pnlParent.height - pnlCustomdialog.height) / 2
End Sub

Public Sub AddView(oView As View, width As Int, height As Int)
	If width > pnlCustomdialog.width Then
		pnlCustomdialog.width = width + 10
	End If
	If height > (pnlCustomdialog.height - (pnlTitel.height + pnlButton.height + 10)) Then
		pnlCustomdialog.height = pnlTitel.height + height + pnlButton.height + 10
	End If
	pnlCustomdialog.AddView(oView, 5, pnlTitel.height + 5, width, height)
End Sub

Public Sub setColor(Color As Int)
	pnlCustomdialog.Color = Color
End Sub

#Region Position
Public Sub setTop(Top As Int)
	pnlCustomdialog.Top = Top
End Sub

Public Sub getTop As Int
	Return pnlCustomdialog.Top
End Sub

Public Sub getLeft As Int
	Return pnlCustomdialog.Left
End Sub

Public Sub setLeft(Left As Int)
	pnlCustomdialog.Left = Left
End Sub

Public Sub getWidth As Int
	Return pnlCustomdialog.width
End Sub

Public Sub getHeight As Int
	Return pnlCustomdialog.height
End Sub
#End Region

Public Sub setGoBack
	SetDialogToMiddle
End Sub

Public Sub IsShow As Boolean
	Return pnlBackground.Visible
End Sub

Private Sub btn_Click
	Dim buttontext As String
	Dim b As Button = Sender
	If b.Tag = -1 Then
		buttontext = "OK"
	Else
		buttontext = lstButton.Get(b.Tag)
	End If
	pnlBackground.Visible = False
	pnlBackground.RemoveViewFromParent
	If SubExists(mModule, mEventName & "_Click", 1) Then
		CallSub2(mModule, mEventName & "_Click", buttontext)
	End If
End Sub

Public Sub Hide
	pnlBackground.Visible = False
	pnlBackground.RemoveAllViews
	pnlBackground.RemoveViewFromParent
End Sub

Private Sub pnlBackground_Click
	'Nur damit als Modaler Controller dargestellt wird.
End Sub

#Region New Controls
Private Sub NewPanel As Panel
	Dim pnl As Panel
	pnl.Initialize("")
	pnl.Color = Colors.LightGray
	pnl.SetBorder(1, Colors.Black, 0)
	Return pnl
End Sub

Sub NewButton(Text As String, TextSize As Int, TextFont As Font, number As Int) As Button
	Dim b As Button
	b.Initialize("btn", b.STYLE_SYSTEM)
	b.SetBorder(1, Colors.Black, 3)
	b.CustomLabel.Font = Font.CreateNew(TextSize)
	b.Text = Text
	b.Tag = number
	b.Visible = False
	Return b
End Sub

Sub NewLabel(Text As String, TextColor As Int, TextFont As Font, TextGravity As Int) As Label
	Dim lbl As Label
	lbl.Initialize("")
'	lbl.SetBorder(1, Colors.Black, 0)
	lbl.Font	= TextFont
	lbl.TextAlignment	= TextGravity
	lbl.Text		= Text
	lbl.TextColor	= TextColor
	lbl.Color = Colors.LightGray
	Return lbl
End Sub
#End Region