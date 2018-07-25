B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.01
@EndOfDesignText@
'Class module
Sub Class_Globals
	Private cvs As Canvas
	Dim mLbl As Label
	Private su As StringUtils
End Sub

Public Sub Initialize (Target As Object, EventName As String)

End Sub

Public Sub DesignerCreateView(Base As Panel, lbl As Label, props As Map)
	Dim bmp As Bitmap
	bmp.InitializeMutable(1,1) 'ignore
	cvs.Initialize2(bmp)
	Dim parent As Panel = Base.Parent
	
	parent.AddView(lbl, Base.Left, Base.Top, Base.Width, Base.Height)
	Base.RemoveView
	mLbl = lbl
	mLbl.Padding = Array As Int(0, 0, 0, 0)
	Dim jo As JavaObject = mLbl
	jo.RunMethod("setIncludeFontPadding", Array(False))
	setText(mLbl.Text)
End Sub

Public Sub setText(value As String)
	mLbl.Text = value
	Dim multipleLines As Boolean = mLbl.Text.Contains(CRLF)
	Dim size As Float
	For size = 2 To 80
		If CheckSize(size, multipleLines) Then Exit
	Next
	size = size - 0.5
	If CheckSize(size, multipleLines) Then size = size - 0.5
	mLbl.TextSize = size
End Sub

'returns true if the size is too large
Private Sub CheckSize(size As Float, MultipleLines As Boolean) As Boolean
	mLbl.TextSize = size
	If MultipleLines Then
		Return su.MeasureMultilineTextHeight(mLbl, mLbl.Text) > mLbl.Height
	Else
		Return cvs.MeasureStringWidth(mLbl.Text, mLbl.Typeface, size) > mLbl.Width Or _
			su.MeasureMultilineTextHeight(mLbl, mLbl.Text) > mLbl.Height
			
	End If
End Sub

Public Sub getText As String
	Return mLbl.Text
End Sub