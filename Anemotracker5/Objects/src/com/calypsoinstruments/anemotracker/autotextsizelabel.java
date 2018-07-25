package com.calypsoinstruments.anemotracker;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class autotextsizelabel extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "com.calypsoinstruments.anemotracker.autotextsizelabel");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.calypsoinstruments.anemotracker.autotextsizelabel.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper _cvs = null;
public anywheresoftware.b4a.objects.LabelWrapper _mlbl = null;
public anywheresoftware.b4a.objects.StringUtils _su = null;
public com.calypsoinstruments.anemotracker.main _main = null;
public com.calypsoinstruments.anemotracker.actble _actble = null;
public com.calypsoinstruments.anemotracker.actlisttracks _actlisttracks = null;
public com.calypsoinstruments.anemotracker.actnavigation _actnavigation = null;
public com.calypsoinstruments.anemotracker.acttcpip _acttcpip = null;
public com.calypsoinstruments.anemotracker.starter _starter = null;
public com.calypsoinstruments.anemotracker.dbutils _dbutils = null;
public com.calypsoinstruments.anemotracker.actcalcomp _actcalcomp = null;
public com.calypsoinstruments.anemotracker.actdevinfo _actdevinfo = null;
public boolean  _checksize(com.calypsoinstruments.anemotracker.autotextsizelabel __ref,float _size,boolean _multiplelines) throws Exception{
__ref = this;
RDebugUtils.currentModule="autotextsizelabel";
if (Debug.shouldDelegate(ba, "checksize"))
	 {return ((Boolean) Debug.delegate(ba, "checksize", new Object[] {_size,_multiplelines}));}
RDebugUtils.currentLine=16252928;
 //BA.debugLineNum = 16252928;BA.debugLine="Private Sub CheckSize(size As Float, MultipleLines";
RDebugUtils.currentLine=16252929;
 //BA.debugLineNum = 16252929;BA.debugLine="mLbl.TextSize = size";
__ref._mlbl.setTextSize(_size);
RDebugUtils.currentLine=16252930;
 //BA.debugLineNum = 16252930;BA.debugLine="If MultipleLines Then";
if (_multiplelines) { 
RDebugUtils.currentLine=16252931;
 //BA.debugLineNum = 16252931;BA.debugLine="Return su.MeasureMultilineTextHeight(mLbl, mLbl.";
if (true) return __ref._su.MeasureMultilineTextHeight((android.widget.TextView)(__ref._mlbl.getObject()),BA.ObjectToCharSequence(__ref._mlbl.getText()))>__ref._mlbl.getHeight();
 }else {
RDebugUtils.currentLine=16252933;
 //BA.debugLineNum = 16252933;BA.debugLine="Return cvs.MeasureStringWidth(mLbl.Text, mLbl.Ty";
if (true) return __ref._cvs.MeasureStringWidth(__ref._mlbl.getText(),__ref._mlbl.getTypeface(),_size)>__ref._mlbl.getWidth() || __ref._su.MeasureMultilineTextHeight((android.widget.TextView)(__ref._mlbl.getObject()),BA.ObjectToCharSequence(__ref._mlbl.getText()))>__ref._mlbl.getHeight();
 };
RDebugUtils.currentLine=16252937;
 //BA.debugLineNum = 16252937;BA.debugLine="End Sub";
return false;
}
public String  _class_globals(com.calypsoinstruments.anemotracker.autotextsizelabel __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="autotextsizelabel";
RDebugUtils.currentLine=15990784;
 //BA.debugLineNum = 15990784;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=15990785;
 //BA.debugLineNum = 15990785;BA.debugLine="Private cvs As Canvas";
_cvs = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=15990786;
 //BA.debugLineNum = 15990786;BA.debugLine="Dim mLbl As Label";
_mlbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=15990787;
 //BA.debugLineNum = 15990787;BA.debugLine="Private su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=15990788;
 //BA.debugLineNum = 15990788;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(com.calypsoinstruments.anemotracker.autotextsizelabel __ref,anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="autotextsizelabel";
if (Debug.shouldDelegate(ba, "designercreateview"))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
anywheresoftware.b4a.objects.PanelWrapper _parent = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=16121856;
 //BA.debugLineNum = 16121856;BA.debugLine="Public Sub DesignerCreateView(Base As Panel, lbl A";
RDebugUtils.currentLine=16121857;
 //BA.debugLineNum = 16121857;BA.debugLine="Dim bmp As Bitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=16121858;
 //BA.debugLineNum = 16121858;BA.debugLine="bmp.InitializeMutable(1,1) 'ignore";
_bmp.InitializeMutable((int) (1),(int) (1));
RDebugUtils.currentLine=16121859;
 //BA.debugLineNum = 16121859;BA.debugLine="cvs.Initialize2(bmp)";
__ref._cvs.Initialize2((android.graphics.Bitmap)(_bmp.getObject()));
RDebugUtils.currentLine=16121860;
 //BA.debugLineNum = 16121860;BA.debugLine="Dim parent As Panel = Base.Parent";
_parent = new anywheresoftware.b4a.objects.PanelWrapper();
_parent.setObject((android.view.ViewGroup)(_base.getParent()));
RDebugUtils.currentLine=16121862;
 //BA.debugLineNum = 16121862;BA.debugLine="parent.AddView(lbl, Base.Left, Base.Top, Base.Wid";
_parent.AddView((android.view.View)(_lbl.getObject()),_base.getLeft(),_base.getTop(),_base.getWidth(),_base.getHeight());
RDebugUtils.currentLine=16121863;
 //BA.debugLineNum = 16121863;BA.debugLine="Base.RemoveView";
_base.RemoveView();
RDebugUtils.currentLine=16121864;
 //BA.debugLineNum = 16121864;BA.debugLine="mLbl = lbl";
__ref._mlbl = _lbl;
RDebugUtils.currentLine=16121865;
 //BA.debugLineNum = 16121865;BA.debugLine="mLbl.Padding = Array As Int(0, 0, 0, 0)";
__ref._mlbl.setPadding(new int[]{(int) (0),(int) (0),(int) (0),(int) (0)});
RDebugUtils.currentLine=16121866;
 //BA.debugLineNum = 16121866;BA.debugLine="Dim jo As JavaObject = mLbl";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo.setObject((java.lang.Object)(__ref._mlbl.getObject()));
RDebugUtils.currentLine=16121867;
 //BA.debugLineNum = 16121867;BA.debugLine="jo.RunMethod(\"setIncludeFontPadding\", Array(False";
_jo.RunMethod("setIncludeFontPadding",new Object[]{(Object)(__c.False)});
RDebugUtils.currentLine=16121868;
 //BA.debugLineNum = 16121868;BA.debugLine="setText(mLbl.Text)";
__ref._settext(null,__ref._mlbl.getText());
RDebugUtils.currentLine=16121869;
 //BA.debugLineNum = 16121869;BA.debugLine="End Sub";
return "";
}
public String  _settext(com.calypsoinstruments.anemotracker.autotextsizelabel __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="autotextsizelabel";
if (Debug.shouldDelegate(ba, "settext"))
	 {return ((String) Debug.delegate(ba, "settext", new Object[] {_value}));}
boolean _multiplelines = false;
float _size = 0f;
RDebugUtils.currentLine=16187392;
 //BA.debugLineNum = 16187392;BA.debugLine="Public Sub setText(value As String)";
RDebugUtils.currentLine=16187393;
 //BA.debugLineNum = 16187393;BA.debugLine="mLbl.Text = value";
__ref._mlbl.setText(BA.ObjectToCharSequence(_value));
RDebugUtils.currentLine=16187394;
 //BA.debugLineNum = 16187394;BA.debugLine="Dim multipleLines As Boolean = mLbl.Text.Contains";
_multiplelines = __ref._mlbl.getText().contains(__c.CRLF);
RDebugUtils.currentLine=16187395;
 //BA.debugLineNum = 16187395;BA.debugLine="Dim size As Float";
_size = 0f;
RDebugUtils.currentLine=16187396;
 //BA.debugLineNum = 16187396;BA.debugLine="For size = 2 To 80";
{
final double step4 = 1;
final double limit4 = (float) (80);
_size = (float) (2) ;
for (;_size <= limit4 ;_size = ((float)(0 + _size + step4))  ) {
RDebugUtils.currentLine=16187397;
 //BA.debugLineNum = 16187397;BA.debugLine="If CheckSize(size, multipleLines) Then Exit";
if (__ref._checksize(null,_size,_multiplelines)) { 
if (true) break;};
 }
};
RDebugUtils.currentLine=16187399;
 //BA.debugLineNum = 16187399;BA.debugLine="size = size - 0.5";
_size = (float) (_size-0.5);
RDebugUtils.currentLine=16187400;
 //BA.debugLineNum = 16187400;BA.debugLine="If CheckSize(size, multipleLines) Then size = siz";
if (__ref._checksize(null,_size,_multiplelines)) { 
_size = (float) (_size-0.5);};
RDebugUtils.currentLine=16187401;
 //BA.debugLineNum = 16187401;BA.debugLine="mLbl.TextSize = size";
__ref._mlbl.setTextSize(_size);
RDebugUtils.currentLine=16187402;
 //BA.debugLineNum = 16187402;BA.debugLine="End Sub";
return "";
}
public String  _gettext(com.calypsoinstruments.anemotracker.autotextsizelabel __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="autotextsizelabel";
if (Debug.shouldDelegate(ba, "gettext"))
	 {return ((String) Debug.delegate(ba, "gettext", null));}
RDebugUtils.currentLine=16318464;
 //BA.debugLineNum = 16318464;BA.debugLine="Public Sub getText As String";
RDebugUtils.currentLine=16318465;
 //BA.debugLineNum = 16318465;BA.debugLine="Return mLbl.Text";
if (true) return __ref._mlbl.getText();
RDebugUtils.currentLine=16318466;
 //BA.debugLineNum = 16318466;BA.debugLine="End Sub";
return "";
}
public String  _initialize(com.calypsoinstruments.anemotracker.autotextsizelabel __ref,anywheresoftware.b4a.BA _ba,Object _target,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="autotextsizelabel";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_target,_eventname}));}
RDebugUtils.currentLine=16056320;
 //BA.debugLineNum = 16056320;BA.debugLine="Public Sub Initialize (Target As Object, EventName";
RDebugUtils.currentLine=16056322;
 //BA.debugLineNum = 16056322;BA.debugLine="End Sub";
return "";
}
}