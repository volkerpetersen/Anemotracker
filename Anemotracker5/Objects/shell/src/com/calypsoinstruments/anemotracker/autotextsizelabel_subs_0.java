package com.calypsoinstruments.anemotracker;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class autotextsizelabel_subs_0 {


public static RemoteObject  _checksize(RemoteObject __ref,RemoteObject _size,RemoteObject _multiplelines) throws Exception{
try {
		Debug.PushSubsStack("CheckSize (autotextsizelabel) ","autotextsizelabel",13,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("checksize")) { return __ref.runUserSub(false, "autotextsizelabel","checksize", __ref, _size, _multiplelines);}
Debug.locals.put("size", _size);
Debug.locals.put("MultipleLines", _multiplelines);
 BA.debugLineNum = 40;BA.debugLine="Private Sub CheckSize(size As Float, MultipleLines";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="mLbl.TextSize = size";
Debug.ShouldStop(256);
__ref.getField(false,"_mlbl").runMethod(true,"setTextSize",_size);
 BA.debugLineNum = 42;BA.debugLine="If MultipleLines Then";
Debug.ShouldStop(512);
if (_multiplelines.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 43;BA.debugLine="Return su.MeasureMultilineTextHeight(mLbl, mLbl.";
Debug.ShouldStop(1024);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean(">",__ref.getField(false,"_su").runMethod(true,"MeasureMultilineTextHeight",(Object)((__ref.getField(false,"_mlbl").getObject())),(Object)(BA.ObjectToCharSequence(__ref.getField(false,"_mlbl").runMethod(true,"getText")))),BA.numberCast(double.class, __ref.getField(false,"_mlbl").runMethod(true,"getHeight"))));
 }else {
 BA.debugLineNum = 45;BA.debugLine="Return cvs.MeasureStringWidth(mLbl.Text, mLbl.Ty";
Debug.ShouldStop(4096);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean(">",__ref.getField(false,"_cvs").runMethod(true,"MeasureStringWidth",(Object)(__ref.getField(false,"_mlbl").runMethod(true,"getText")),(Object)(__ref.getField(false,"_mlbl").runMethod(false,"getTypeface")),(Object)(_size)),BA.numberCast(double.class, __ref.getField(false,"_mlbl").runMethod(true,"getWidth"))) || RemoteObject.solveBoolean(">",__ref.getField(false,"_su").runMethod(true,"MeasureMultilineTextHeight",(Object)((__ref.getField(false,"_mlbl").getObject())),(Object)(BA.ObjectToCharSequence(__ref.getField(false,"_mlbl").runMethod(true,"getText")))),BA.numberCast(double.class, __ref.getField(false,"_mlbl").runMethod(true,"getHeight"))));
 };
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private cvs As Canvas";
autotextsizelabel._cvs = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");__ref.setField("_cvs",autotextsizelabel._cvs);
 //BA.debugLineNum = 4;BA.debugLine="Dim mLbl As Label";
autotextsizelabel._mlbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_mlbl",autotextsizelabel._mlbl);
 //BA.debugLineNum = 5;BA.debugLine="Private su As StringUtils";
autotextsizelabel._su = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");__ref.setField("_su",autotextsizelabel._su);
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (autotextsizelabel) ","autotextsizelabel",13,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "autotextsizelabel","designercreateview", __ref, _base, _lbl, _props);}
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _parent = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("Base", _base);
Debug.locals.put("lbl", _lbl);
Debug.locals.put("props", _props);
 BA.debugLineNum = 12;BA.debugLine="Public Sub DesignerCreateView(Base As Panel, lbl A";
Debug.ShouldStop(2048);
 BA.debugLineNum = 13;BA.debugLine="Dim bmp As Bitmap";
Debug.ShouldStop(4096);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 14;BA.debugLine="bmp.InitializeMutable(1,1) 'ignore";
Debug.ShouldStop(8192);
_bmp.runVoidMethod ("InitializeMutable",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 15;BA.debugLine="cvs.Initialize2(bmp)";
Debug.ShouldStop(16384);
__ref.getField(false,"_cvs").runVoidMethod ("Initialize2",(Object)((_bmp.getObject())));
 BA.debugLineNum = 16;BA.debugLine="Dim parent As Panel = Base.Parent";
Debug.ShouldStop(32768);
_parent = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_parent.setObject(_base.runMethod(false,"getParent"));Debug.locals.put("parent", _parent);
 BA.debugLineNum = 18;BA.debugLine="parent.AddView(lbl, Base.Left, Base.Top, Base.Wid";
Debug.ShouldStop(131072);
_parent.runVoidMethod ("AddView",(Object)((_lbl.getObject())),(Object)(_base.runMethod(true,"getLeft")),(Object)(_base.runMethod(true,"getTop")),(Object)(_base.runMethod(true,"getWidth")),(Object)(_base.runMethod(true,"getHeight")));
 BA.debugLineNum = 19;BA.debugLine="Base.RemoveView";
Debug.ShouldStop(262144);
_base.runVoidMethod ("RemoveView");
 BA.debugLineNum = 20;BA.debugLine="mLbl = lbl";
Debug.ShouldStop(524288);
__ref.setField ("_mlbl",_lbl);
 BA.debugLineNum = 21;BA.debugLine="mLbl.Padding = Array As Int(0, 0, 0, 0)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_mlbl").runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {BA.numberCast(int.class, 0),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0)}));
 BA.debugLineNum = 22;BA.debugLine="Dim jo As JavaObject = mLbl";
Debug.ShouldStop(2097152);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo.setObject(__ref.getField(false,"_mlbl").getObject());Debug.locals.put("jo", _jo);
 BA.debugLineNum = 23;BA.debugLine="jo.RunMethod(\"setIncludeFontPadding\", Array(False";
Debug.ShouldStop(4194304);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setIncludeFontPadding")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(autotextsizelabel.__c.getField(true,"False"))})));
 BA.debugLineNum = 24;BA.debugLine="setText(mLbl.Text)";
Debug.ShouldStop(8388608);
__ref.runClassMethod (com.calypsoinstruments.anemotracker.autotextsizelabel.class, "_settext",(Object)(__ref.getField(false,"_mlbl").runMethod(true,"getText")));
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettext(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getText (autotextsizelabel) ","autotextsizelabel",13,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("gettext")) { return __ref.runUserSub(false, "autotextsizelabel","gettext", __ref);}
 BA.debugLineNum = 51;BA.debugLine="Public Sub getText As String";
Debug.ShouldStop(262144);
 BA.debugLineNum = 52;BA.debugLine="Return mLbl.Text";
Debug.ShouldStop(524288);
if (true) return __ref.getField(false,"_mlbl").runMethod(true,"getText");
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _target,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (autotextsizelabel) ","autotextsizelabel",13,__ref.getField(false, "ba"),__ref,8);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "autotextsizelabel","initialize", __ref, _ba, _target, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Target", _target);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize (Target As Object, EventName";
Debug.ShouldStop(128);
 BA.debugLineNum = 10;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settext(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("setText (autotextsizelabel) ","autotextsizelabel",13,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "autotextsizelabel","settext", __ref, _value);}
RemoteObject _multiplelines = RemoteObject.createImmutable(false);
RemoteObject _size = RemoteObject.createImmutable(0f);
Debug.locals.put("value", _value);
 BA.debugLineNum = 27;BA.debugLine="Public Sub setText(value As String)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="mLbl.Text = value";
Debug.ShouldStop(134217728);
__ref.getField(false,"_mlbl").runMethod(true,"setText",BA.ObjectToCharSequence(_value));
 BA.debugLineNum = 29;BA.debugLine="Dim multipleLines As Boolean = mLbl.Text.Contains";
Debug.ShouldStop(268435456);
_multiplelines = __ref.getField(false,"_mlbl").runMethod(true,"getText").runMethod(true,"contains",(Object)(autotextsizelabel.__c.getField(true,"CRLF")));Debug.locals.put("multipleLines", _multiplelines);Debug.locals.put("multipleLines", _multiplelines);
 BA.debugLineNum = 30;BA.debugLine="Dim size As Float";
Debug.ShouldStop(536870912);
_size = RemoteObject.createImmutable(0f);Debug.locals.put("size", _size);
 BA.debugLineNum = 31;BA.debugLine="For size = 2 To 80";
Debug.ShouldStop(1073741824);
{
final double step4 = 1;
final double limit4 = (float) (0 + 80);
_size = BA.numberCast(float.class, 2) ;
for (;(step4 > 0 && _size.<Float>get().floatValue() <= limit4) || (step4 < 0 && _size.<Float>get().floatValue() >= limit4) ;_size = RemoteObject.createImmutable((float)(0 + _size.<Float>get().floatValue() + step4))  ) {
Debug.locals.put("size", _size);
 BA.debugLineNum = 32;BA.debugLine="If CheckSize(size, multipleLines) Then Exit";
Debug.ShouldStop(-2147483648);
if (__ref.runClassMethod (com.calypsoinstruments.anemotracker.autotextsizelabel.class, "_checksize",(Object)(_size),(Object)(_multiplelines)).<Boolean>get().booleanValue()) { 
if (true) break;};
 }
}Debug.locals.put("size", _size);
;
 BA.debugLineNum = 34;BA.debugLine="size = size - 0.5";
Debug.ShouldStop(2);
_size = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_size,RemoteObject.createImmutable(0.5)}, "-",1, 0));Debug.locals.put("size", _size);
 BA.debugLineNum = 35;BA.debugLine="If CheckSize(size, multipleLines) Then size = siz";
Debug.ShouldStop(4);
if (__ref.runClassMethod (com.calypsoinstruments.anemotracker.autotextsizelabel.class, "_checksize",(Object)(_size),(Object)(_multiplelines)).<Boolean>get().booleanValue()) { 
_size = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_size,RemoteObject.createImmutable(0.5)}, "-",1, 0));Debug.locals.put("size", _size);};
 BA.debugLineNum = 36;BA.debugLine="mLbl.TextSize = size";
Debug.ShouldStop(8);
__ref.getField(false,"_mlbl").runMethod(true,"setTextSize",_size);
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}