package com.calypsoinstruments.anemotracker;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class tag_subs_0 {


public static RemoteObject  _auto_size1(RemoteObject __ref,RemoteObject _lbl) throws Exception{
try {
		Debug.PushSubsStack("AUTO_SIZE1 (tag) ","tag",14,__ref.getField(false, "ba"),__ref,387);
if (RapidSub.canDelegate("auto_size1")) { return __ref.runUserSub(false, "tag","auto_size1", __ref, _lbl);}
RemoteObject _su = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");
int _size = 0;
Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 387;BA.debugLine="Sub AUTO_SIZE1(lbl As Label) As Float";
Debug.ShouldStop(4);
 BA.debugLineNum = 388;BA.debugLine="Dim su As StringUtils";
Debug.ShouldStop(8);
_su = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");Debug.locals.put("su", _su);
 BA.debugLineNum = 395;BA.debugLine="For size = 2 To 1024";
Debug.ShouldStop(1024);
{
final int step2 = 1;
final int limit2 = 1024;
_size = 2 ;
for (;(step2 > 0 && _size <= limit2) || (step2 < 0 && _size >= limit2) ;_size = ((int)(0 + _size + step2))  ) {
Debug.locals.put("size", _size);
 BA.debugLineNum = 396;BA.debugLine="lbl.TextSize = size";
Debug.ShouldStop(2048);
_lbl.runMethod(true,"setTextSize",BA.numberCast(float.class, _size));
 BA.debugLineNum = 399;BA.debugLine="If cvs.MeasureStringWidth(lbl.Text, lbl.Typefac";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_cvs").runMethod(true,"MeasureStringWidth",(Object)(_lbl.runMethod(true,"getText")),(Object)(_lbl.runMethod(false,"getTypeface")),(Object)(BA.numberCast(float.class, _size))),BA.numberCast(double.class, _lbl.runMethod(true,"getWidth"))) || RemoteObject.solveBoolean(">",_su.runMethod(true,"MeasureMultilineTextHeight",(Object)((_lbl.getObject())),(Object)(BA.ObjectToCharSequence(_lbl.runMethod(true,"getText")))),BA.numberCast(double.class, _lbl.runMethod(true,"getHeight")))) { 
 BA.debugLineNum = 401;BA.debugLine="size = size-0.5";
Debug.ShouldStop(65536);
_size = (int) (0 + RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_size),RemoteObject.createImmutable(0.5)}, "-",1, 0).<Double>get().doubleValue());Debug.locals.put("size", _size);
 BA.debugLineNum = 402;BA.debugLine="Exit";
Debug.ShouldStop(131072);
if (true) break;
 };
 }
}Debug.locals.put("size", _size);
;
 BA.debugLineNum = 410;BA.debugLine="lbl.TextSize = size";
Debug.ShouldStop(33554432);
_lbl.runMethod(true,"setTextSize",BA.numberCast(float.class, _size));
 BA.debugLineNum = 412;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (tag) ","tag",14,__ref.getField(false, "ba"),__ref,126);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "tag","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 126;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 127;BA.debugLine="lblText.left= 0.05*mBase.width";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_lbltext").runMethod(true,"setLeft",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.05),__ref.getField(false,"_mbase").runMethod(true,"getWidth")}, "*",0, 0)));
 BA.debugLineNum = 128;BA.debugLine="lblText.Top= 0.05*mBase.height";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_lbltext").runMethod(true,"setTop",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.05),__ref.getField(false,"_mbase").runMethod(true,"getHeight")}, "*",0, 0)));
 BA.debugLineNum = 129;BA.debugLine="lblText.Width= 0.6*mBase.width";
Debug.ShouldStop(1);
__ref.getField(false,"_lbltext").runMethod(true,"setWidth",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.6),__ref.getField(false,"_mbase").runMethod(true,"getWidth")}, "*",0, 0)));
 BA.debugLineNum = 130;BA.debugLine="lblText.Height= 0.2*mBase.height";
Debug.ShouldStop(2);
__ref.getField(false,"_lbltext").runMethod(true,"setHeight",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.2),__ref.getField(false,"_mbase").runMethod(true,"getHeight")}, "*",0, 0)));
 BA.debugLineNum = 131;BA.debugLine="lblValue.Left= 0.05*mBase.width";
Debug.ShouldStop(4);
__ref.getField(false,"_lblvalue").runMethod(true,"setLeft",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.05),__ref.getField(false,"_mbase").runMethod(true,"getWidth")}, "*",0, 0)));
 BA.debugLineNum = 132;BA.debugLine="lblValue.Top=0.25*mBase.height";
Debug.ShouldStop(8);
__ref.getField(false,"_lblvalue").runMethod(true,"setTop",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.25),__ref.getField(false,"_mbase").runMethod(true,"getHeight")}, "*",0, 0)));
 BA.debugLineNum = 133;BA.debugLine="lblValue.Width=0.9*mBase.width";
Debug.ShouldStop(16);
__ref.getField(false,"_lblvalue").runMethod(true,"setWidth",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.9),__ref.getField(false,"_mbase").runMethod(true,"getWidth")}, "*",0, 0)));
 BA.debugLineNum = 134;BA.debugLine="lblValue.Height=0.72*mBase.height";
Debug.ShouldStop(32);
__ref.getField(false,"_lblvalue").runMethod(true,"setHeight",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.72),__ref.getField(false,"_mbase").runMethod(true,"getHeight")}, "*",0, 0)));
 BA.debugLineNum = 135;BA.debugLine="lblUnit.Left= 0.65*mBase.Width";
Debug.ShouldStop(64);
__ref.getField(false,"_lblunit").runMethod(true,"setLeft",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.65),__ref.getField(false,"_mbase").runMethod(true,"getWidth")}, "*",0, 0)));
 BA.debugLineNum = 136;BA.debugLine="lblUnit.Top= 0.05*mBase.height";
Debug.ShouldStop(128);
__ref.getField(false,"_lblunit").runMethod(true,"setTop",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.05),__ref.getField(false,"_mbase").runMethod(true,"getHeight")}, "*",0, 0)));
 BA.debugLineNum = 137;BA.debugLine="lblUnit.Width=mBase.width*0.31";
Debug.ShouldStop(256);
__ref.getField(false,"_lblunit").runMethod(true,"setWidth",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase").runMethod(true,"getWidth"),RemoteObject.createImmutable(0.31)}, "*",0, 0)));
 BA.debugLineNum = 138;BA.debugLine="lblUnit.Height=0.20*mBase.height";
Debug.ShouldStop(512);
__ref.getField(false,"_lblunit").runMethod(true,"setHeight",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.20),__ref.getField(false,"_mbase").runMethod(true,"getHeight")}, "*",0, 0)));
 BA.debugLineNum = 139;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 13;BA.debugLine="Private mEventName As String 'ignore";
tag._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",tag._meventname);
 //BA.debugLineNum = 14;BA.debugLine="Private mCallBack As Object 'ignore";
tag._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",tag._mcallback);
 //BA.debugLineNum = 15;BA.debugLine="Dim mBase As Panel";
tag._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_mbase",tag._mbase);
 //BA.debugLineNum = 16;BA.debugLine="Private Const DefaultColorConstant As Int = -9848";
tag._defaultcolorconstant = BA.numberCast(int.class, -(double) (0 + 984833));__ref.setField("_defaultcolorconstant",tag._defaultcolorconstant);
 //BA.debugLineNum = 19;BA.debugLine="Private Panel1 As Panel";
tag._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel1",tag._panel1);
 //BA.debugLineNum = 21;BA.debugLine="Public lblText, lblValue, lblUnit As Label";
tag._lbltext = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltext",tag._lbltext);
tag._lblvalue = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblvalue",tag._lblvalue);
tag._lblunit = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblunit",tag._lblunit);
 //BA.debugLineNum = 23;BA.debugLine="Public atlabel As AutoTextSizeLabel";
tag._atlabel = RemoteObject.createNew ("com.calypsoinstruments.anemotracker.autotextsizelabel");__ref.setField("_atlabel",tag._atlabel);
 //BA.debugLineNum = 26;BA.debugLine="Private TagDialog As CustomLayoutDialog";
tag._tagdialog = RemoteObject.createNew ("anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog");__ref.setField("_tagdialog",tag._tagdialog);
 //BA.debugLineNum = 28;BA.debugLine="Private sp_tag As Spinner";
tag._sp_tag = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_sp_tag",tag._sp_tag);
 //BA.debugLineNum = 29;BA.debugLine="Private sp_unit As Spinner";
tag._sp_unit = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_sp_unit",tag._sp_unit);
 //BA.debugLineNum = 35;BA.debugLine="Private lTags = Array As String( \"AWA\", \"AWM\", \"S";
tag._ltags = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
tag._ltags = tag.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {10},new Object[] {BA.ObjectToString("AWA"),BA.ObjectToString("AWM"),BA.ObjectToString("Speed"),BA.ObjectToString("TWA"),BA.ObjectToString("TWM"),BA.ObjectToString("Batt"),BA.ObjectToString("Temp"),BA.ObjectToString("Roll"),BA.ObjectToString("Pitch"),RemoteObject.createImmutable("Mag HDG")})));__ref.setField("_ltags",tag._ltags);
 //BA.debugLineNum = 36;BA.debugLine="Dim cvs As Canvas";
tag._cvs = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");__ref.setField("_cvs",tag._cvs);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _convert(RemoteObject __ref,RemoteObject _value,RemoteObject _unit) throws Exception{
try {
		Debug.PushSubsStack("convert (tag) ","tag",14,__ref.getField(false, "ba"),__ref,202);
if (RapidSub.canDelegate("convert")) { return __ref.runUserSub(false, "tag","convert", __ref, _value, _unit);}
Debug.locals.put("value", _value);
Debug.locals.put("unit", _unit);
 BA.debugLineNum = 202;BA.debugLine="Sub convert( value As Float, unit As String )";
Debug.ShouldStop(512);
 BA.debugLineNum = 203;BA.debugLine="Select unit";
Debug.ShouldStop(1024);
switch (BA.switchObjectToInt(_unit,BA.ObjectToString("m/s"),BA.ObjectToString("knots"),BA.ObjectToString("km/h"),BA.ObjectToString("ºC"),BA.ObjectToString("ºF"),BA.ObjectToString("degrees"),BA.ObjectToString("%"))) {
case 0: {
 BA.debugLineNum = 205;BA.debugLine="Return value";
Debug.ShouldStop(4096);
if (true) return BA.NumberToString(_value);
 break; }
case 1: {
 BA.debugLineNum = 207;BA.debugLine="Return value * 3600 / 1852";
Debug.ShouldStop(16384);
if (true) return BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_value,RemoteObject.createImmutable(3600),RemoteObject.createImmutable(1852)}, "*/",0, 0));
 break; }
case 2: {
 BA.debugLineNum = 209;BA.debugLine="Return value*3.6";
Debug.ShouldStop(65536);
if (true) return BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_value,RemoteObject.createImmutable(3.6)}, "*",0, 0));
 break; }
case 3: {
 BA.debugLineNum = 211;BA.debugLine="Return value";
Debug.ShouldStop(262144);
if (true) return BA.NumberToString(_value);
 break; }
case 4: {
 BA.debugLineNum = 213;BA.debugLine="Return  value * 1.8 + 32";
Debug.ShouldStop(1048576);
if (true) return BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_value,RemoteObject.createImmutable(1.8),RemoteObject.createImmutable(32)}, "*+",1, 0));
 break; }
case 5: 
case 6: {
 BA.debugLineNum = 215;BA.debugLine="Return value";
Debug.ShouldStop(4194304);
if (true) return BA.NumberToString(_value);
 break; }
}
;
 BA.debugLineNum = 218;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (tag) ","tag",14,__ref.getField(false, "ba"),__ref,49);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "tag","designercreateview", __ref, _base, _lbl, _props);}
RemoteObject _d = RemoteObject.createImmutable(0);
RemoteObject _r1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");
RemoteObject _pirulen = RemoteObject.declareNull("anywheresoftware.b4a.keywords.constants.TypefaceWrapper");
RemoteObject _dsdigi = RemoteObject.declareNull("anywheresoftware.b4a.keywords.constants.TypefaceWrapper");
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _ltag = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 49;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
Debug.ShouldStop(65536);
 BA.debugLineNum = 50;BA.debugLine="mBase = Base";
Debug.ShouldStop(131072);
__ref.setField ("_mbase",_base);
 BA.debugLineNum = 52;BA.debugLine="Dim d As Int";
Debug.ShouldStop(524288);
_d = RemoteObject.createImmutable(0);Debug.locals.put("d", _d);
 BA.debugLineNum = 53;BA.debugLine="Dim r1 As Rect";
Debug.ShouldStop(1048576);
_r1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");Debug.locals.put("r1", _r1);
 BA.debugLineNum = 54;BA.debugLine="Panel1.Initialize( \"Panel1\" )";
Debug.ShouldStop(2097152);
__ref.getField(false,"_panel1").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Panel1")));
 BA.debugLineNum = 55;BA.debugLine="mBase.AddView( Panel1, 0, 0, mBase.Width, mBase.H";
Debug.ShouldStop(4194304);
__ref.getField(false,"_mbase").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_panel1").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_mbase").runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase").runMethod(true,"getHeight")));
 BA.debugLineNum = 58;BA.debugLine="lblText.Initialize(\"\")";
Debug.ShouldStop(33554432);
__ref.getField(false,"_lbltext").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 59;BA.debugLine="lblUnit.Initialize(\"\")";
Debug.ShouldStop(67108864);
__ref.getField(false,"_lblunit").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 60;BA.debugLine="lblValue.Initialize(\"\")";
Debug.ShouldStop(134217728);
__ref.getField(false,"_lblvalue").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 62;BA.debugLine="Dim pirulen, dsdigi As Typeface";
Debug.ShouldStop(536870912);
_pirulen = RemoteObject.createNew ("anywheresoftware.b4a.keywords.constants.TypefaceWrapper");Debug.locals.put("pirulen", _pirulen);
_dsdigi = RemoteObject.createNew ("anywheresoftware.b4a.keywords.constants.TypefaceWrapper");Debug.locals.put("dsdigi", _dsdigi);
 BA.debugLineNum = 63;BA.debugLine="pirulen = Typeface.LoadFromAssets(\"pirulen_rg.tt";
Debug.ShouldStop(1073741824);
_pirulen.setObject(tag.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("pirulen_rg.ttf"))));
 BA.debugLineNum = 64;BA.debugLine="dsdigi = Typeface.LoadFromAssets(\"ds-digi.ttf\")";
Debug.ShouldStop(-2147483648);
_dsdigi.setObject(tag.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("ds-digi.ttf"))));
 BA.debugLineNum = 76;BA.debugLine="lblText.textColor = Colors.ARGB( 128, 255,255,255";
Debug.ShouldStop(2048);
__ref.getField(false,"_lbltext").runMethod(true,"setTextColor",tag.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 128)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 78;BA.debugLine="lblValue.textColor = Colors.ARGB( 255, 255,255,25";
Debug.ShouldStop(8192);
__ref.getField(false,"_lblvalue").runMethod(true,"setTextColor",tag.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 80;BA.debugLine="lblUnit.textColor = Colors.ARGB( 128, 255,255,255";
Debug.ShouldStop(32768);
__ref.getField(false,"_lblunit").runMethod(true,"setTextColor",tag.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 128)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 83;BA.debugLine="lblText.Typeface = pirulen";
Debug.ShouldStop(262144);
__ref.getField(false,"_lbltext").runMethod(false,"setTypeface",(_pirulen.getObject()));
 BA.debugLineNum = 84;BA.debugLine="lblText.Gravity = Bit.Or( Gravity.LEFT, Gravity.";
Debug.ShouldStop(524288);
__ref.getField(false,"_lbltext").runMethod(true,"setGravity",tag.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(tag.__c.getField(false,"Gravity").getField(true,"LEFT")),(Object)(tag.__c.getField(false,"Gravity").getField(true,"TOP"))));
 BA.debugLineNum = 85;BA.debugLine="lblValue.Typeface = dsdigi";
Debug.ShouldStop(1048576);
__ref.getField(false,"_lblvalue").runMethod(false,"setTypeface",(_dsdigi.getObject()));
 BA.debugLineNum = 86;BA.debugLine="lblValue.Padding = Array As Int(0, 0, 0, 0)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lblvalue").runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {BA.numberCast(int.class, 0),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0)}));
 BA.debugLineNum = 87;BA.debugLine="Dim jo As JavaObject = lblValue";
Debug.ShouldStop(4194304);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo.setObject(__ref.getField(false,"_lblvalue").getObject());Debug.locals.put("jo", _jo);
 BA.debugLineNum = 88;BA.debugLine="jo.RunMethod(\"setIncludeFontPadding\", Array(Fals";
Debug.ShouldStop(8388608);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setIncludeFontPadding")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(tag.__c.getField(true,"False"))})));
 BA.debugLineNum = 89;BA.debugLine="lblValue.Gravity = Bit.Or( Gravity.CENTER_HORIZO";
Debug.ShouldStop(16777216);
__ref.getField(false,"_lblvalue").runMethod(true,"setGravity",tag.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(tag.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL")),(Object)(tag.__c.getField(false,"Gravity").getField(true,"BOTTOM"))));
 BA.debugLineNum = 90;BA.debugLine="lblUnit.Typeface = pirulen";
Debug.ShouldStop(33554432);
__ref.getField(false,"_lblunit").runMethod(false,"setTypeface",(_pirulen.getObject()));
 BA.debugLineNum = 91;BA.debugLine="lblUnit.Gravity = Bit.Or( Gravity.RIGHT, Gravity";
Debug.ShouldStop(67108864);
__ref.getField(false,"_lblunit").runMethod(true,"setGravity",tag.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(tag.__c.getField(false,"Gravity").getField(true,"RIGHT")),(Object)(tag.__c.getField(false,"Gravity").getField(true,"TOP"))));
 BA.debugLineNum = 96;BA.debugLine="mBase.AddView( lblText, 0.05*mBase.width, 0.05*mB";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_mbase").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lbltext").getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.05),__ref.getField(false,"_mbase").runMethod(true,"getWidth")}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.05),__ref.getField(false,"_mbase").runMethod(true,"getHeight")}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.6),__ref.getField(false,"_mbase").runMethod(true,"getWidth")}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.2),__ref.getField(false,"_mbase").runMethod(true,"getHeight")}, "*",0, 0))));
 BA.debugLineNum = 99;BA.debugLine="mBase.AddView( lblValue, 0.05*mBase.width, 0.25*m";
Debug.ShouldStop(4);
__ref.getField(false,"_mbase").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lblvalue").getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.05),__ref.getField(false,"_mbase").runMethod(true,"getWidth")}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.25),__ref.getField(false,"_mbase").runMethod(true,"getHeight")}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.9),__ref.getField(false,"_mbase").runMethod(true,"getWidth")}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.72),__ref.getField(false,"_mbase").runMethod(true,"getHeight")}, "*",0, 0))));
 BA.debugLineNum = 100;BA.debugLine="mBase.AddView( lblUnit, 0.65*mBase.Width, 0.05*mB";
Debug.ShouldStop(8);
__ref.getField(false,"_mbase").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lblunit").getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.65),__ref.getField(false,"_mbase").runMethod(true,"getWidth")}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.05),__ref.getField(false,"_mbase").runMethod(true,"getHeight")}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase").runMethod(true,"getWidth"),RemoteObject.createImmutable(0.31)}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.20),__ref.getField(false,"_mbase").runMethod(true,"getHeight")}, "*",0, 0))));
 BA.debugLineNum = 102;BA.debugLine="SetText( Props.Get(\"Txt\") )";
Debug.ShouldStop(32);
__ref.runClassMethod (com.calypsoinstruments.anemotracker.tag.class, "_settext",(Object)(BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Txt")))))));
 BA.debugLineNum = 103;BA.debugLine="SetValue( \"00.0\")";
Debug.ShouldStop(64);
__ref.runClassMethod (com.calypsoinstruments.anemotracker.tag.class, "_setvalue",(Object)(RemoteObject.createImmutable("00.0")));
 BA.debugLineNum = 104;BA.debugLine="SetUnit( Props.Get(\"Unit\") )";
Debug.ShouldStop(128);
__ref.runClassMethod (com.calypsoinstruments.anemotracker.tag.class, "_setunit",(Object)(BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Unit")))))));
 BA.debugLineNum = 105;BA.debugLine="If Main.kvs.ContainsKey(mEventName) Then";
Debug.ShouldStop(256);
if (tag._main._kvs.runClassMethod (com.calypsoinstruments.anemotracker.keyvaluestore.class, "_containskey",(Object)(__ref.getField(true,"_meventname"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 106;BA.debugLine="Dim lTag = Main.kvs.GetObject( mEventName ) As L";
Debug.ShouldStop(512);
_ltag = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_ltag.setObject(tag._main._kvs.runClassMethod (com.calypsoinstruments.anemotracker.keyvaluestore.class, "_getobject",(Object)(__ref.getField(true,"_meventname"))));Debug.locals.put("lTag", _ltag);
 BA.debugLineNum = 107;BA.debugLine="SetText( lTag.Get(0) )";
Debug.ShouldStop(1024);
__ref.runClassMethod (com.calypsoinstruments.anemotracker.tag.class, "_settext",(Object)(BA.ObjectToString(_ltag.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))))));
 BA.debugLineNum = 108;BA.debugLine="SetUnit( lTag.Get(1) )";
Debug.ShouldStop(2048);
__ref.runClassMethod (com.calypsoinstruments.anemotracker.tag.class, "_setunit",(Object)(BA.ObjectToString(_ltag.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))))));
 };
 BA.debugLineNum = 111;BA.debugLine="AUTO_SIZE1(lblText)";
Debug.ShouldStop(16384);
__ref.runClassMethod (com.calypsoinstruments.anemotracker.tag.class, "_auto_size1",(Object)(__ref.getField(false,"_lbltext")));
 BA.debugLineNum = 112;BA.debugLine="AUTO_SIZE1(lblValue)";
Debug.ShouldStop(32768);
__ref.runClassMethod (com.calypsoinstruments.anemotracker.tag.class, "_auto_size1",(Object)(__ref.getField(false,"_lblvalue")));
 BA.debugLineNum = 113;BA.debugLine="AUTO_SIZE1(lblUnit)";
Debug.ShouldStop(65536);
__ref.runClassMethod (com.calypsoinstruments.anemotracker.tag.class, "_auto_size1",(Object)(__ref.getField(false,"_lblunit")));
 BA.debugLineNum = 125;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbase(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetBase (tag) ","tag",14,__ref.getField(false, "ba"),__ref,140);
if (RapidSub.canDelegate("getbase")) { return __ref.runUserSub(false, "tag","getbase", __ref);}
 BA.debugLineNum = 140;BA.debugLine="Public Sub GetBase As Panel";
Debug.ShouldStop(2048);
 BA.debugLineNum = 141;BA.debugLine="Return mBase";
Debug.ShouldStop(4096);
if (true) return __ref.getField(false,"_mbase");
 BA.debugLineNum = 142;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (tag) ","tag",14,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "tag","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 39;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(128);
__ref.setField ("_meventname",_eventname);
 BA.debugLineNum = 41;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(256);
__ref.setField ("_mcallback",_callback);
 BA.debugLineNum = 43;BA.debugLine="Dim bmp As Bitmap";
Debug.ShouldStop(1024);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 44;BA.debugLine="bmp.InitializeMutable(1,1) 'ignore";
Debug.ShouldStop(2048);
_bmp.runVoidMethod ("InitializeMutable",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 45;BA.debugLine="cvs.Initialize2(bmp)";
Debug.ShouldStop(4096);
__ref.getField(false,"_cvs").runVoidMethod ("Initialize2",(Object)((_bmp.getObject())));
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _panel1_longclick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Panel1_LongClick (tag) ","tag",14,__ref.getField(false, "ba"),__ref,251);
if (RapidSub.canDelegate("panel1_longclick")) { __ref.runUserSub(false, "tag","panel1_longclick", __ref); return;}
ResumableSub_Panel1_LongClick rsub = new ResumableSub_Panel1_LongClick(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Panel1_LongClick extends BA.ResumableSub {
public ResumableSub_Panel1_LongClick(com.calypsoinstruments.anemotracker.tag parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
com.calypsoinstruments.anemotracker.tag parent;
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _res = RemoteObject.createImmutable(0);
RemoteObject _flagpositive = RemoteObject.createImmutable(false);
RemoteObject _ltag = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Panel1_LongClick (tag) ","tag",14,__ref.getField(false, "ba"),__ref,251);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 254;BA.debugLine="If SubExists(mCallBack, mEventName & \"_LongClick";
Debug.ShouldStop(536870912);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_LongClick")))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 255;BA.debugLine="CallSub( mCallBack, mEventName & \"_LongClick\" )";
Debug.ShouldStop(1073741824);
parent.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_LongClick"))));
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 265;BA.debugLine="Dim sf As Object = TagDialog.ShowAsync(\"Enter va";
Debug.ShouldStop(256);
_sf = __ref.getField(false,"_tagdialog").runMethod(false,"ShowAsync",(Object)(BA.ObjectToString("Enter variable")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("Cancel")),(Object)(BA.ObjectToString("")),__ref.getField(false, "ba"),(Object)((parent.__c.runMethod(false,"LoadBitmap",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("form.png"))).getObject())),(Object)(parent.__c.getField(true,"True")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 266;BA.debugLine="TagDialog.SetSize(100%x, 400dip)";
Debug.ShouldStop(512);
__ref.getField(false,"_tagdialog").runVoidMethod ("SetSize",(Object)(parent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 400)))));
 BA.debugLineNum = 267;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","dialog_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), _sf);
this.state = 12;
return;
case 12:
//C
this.state = 5;
_pnl = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("pnl", _pnl);
;
 BA.debugLineNum = 268;BA.debugLine="pnl.LoadLayout(\"dlg_tag\")";
Debug.ShouldStop(2048);
_pnl.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("dlg_tag")),__ref.getField(false, "ba"));
 BA.debugLineNum = 289;BA.debugLine="sp_tag.AddAll( lTags )";
Debug.ShouldStop(1);
__ref.getField(false,"_sp_tag").runVoidMethod ("AddAll",(Object)(__ref.getField(false,"_ltags")));
 BA.debugLineNum = 290;BA.debugLine="sp_tag.SelectedIndex = lTags.IndexOf( lblText.Te";
Debug.ShouldStop(2);
__ref.getField(false,"_sp_tag").runMethod(true,"setSelectedIndex",__ref.getField(false,"_ltags").runMethod(true,"IndexOf",(Object)((__ref.getField(false,"_lbltext").runMethod(true,"getText")))));
 BA.debugLineNum = 291;BA.debugLine="sp_tag_ItemClick( 0,0)";
Debug.ShouldStop(4);
__ref.runClassMethod (com.calypsoinstruments.anemotracker.tag.class, "_sp_tag_itemclick",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 307;BA.debugLine="Wait For (sf) Dialog_Result (res As Int)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","dialog_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), _sf);
this.state = 13;
return;
case 13:
//C
this.state = 5;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 308;BA.debugLine="Dim flagPositive = False As Boolean";
Debug.ShouldStop(524288);
_flagpositive = parent.__c.getField(true,"False");Debug.locals.put("flagPositive", _flagpositive);Debug.locals.put("flagPositive", _flagpositive);
 BA.debugLineNum = 322;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(2);
if (true) break;

case 5:
//if
this.state = 8;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 324;BA.debugLine="SetText( sp_tag.SelectedItem )";
Debug.ShouldStop(8);
__ref.runClassMethod (com.calypsoinstruments.anemotracker.tag.class, "_settext",(Object)(__ref.getField(false,"_sp_tag").runMethod(true,"getSelectedItem")));
 BA.debugLineNum = 325;BA.debugLine="SetUnit( sp_unit.SelectedItem )";
Debug.ShouldStop(16);
__ref.runClassMethod (com.calypsoinstruments.anemotracker.tag.class, "_setunit",(Object)(__ref.getField(false,"_sp_unit").runMethod(true,"getSelectedItem")));
 BA.debugLineNum = 326;BA.debugLine="flagPositive = True";
Debug.ShouldStop(32);
_flagpositive = parent.__c.getField(true,"True");Debug.locals.put("flagPositive", _flagpositive);
 if (true) break;
;
 BA.debugLineNum = 329;BA.debugLine="If flagPositive Then";
Debug.ShouldStop(256);

case 8:
//if
this.state = 11;
if (_flagpositive.<Boolean>get().booleanValue()) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 330;BA.debugLine="Dim lTag As List";
Debug.ShouldStop(512);
_ltag = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lTag", _ltag);
 BA.debugLineNum = 331;BA.debugLine="lTag.Initialize";
Debug.ShouldStop(1024);
_ltag.runVoidMethod ("Initialize");
 BA.debugLineNum = 332;BA.debugLine="lTag.Add( lblText.Text )";
Debug.ShouldStop(2048);
_ltag.runVoidMethod ("Add",(Object)((__ref.getField(false,"_lbltext").runMethod(true,"getText"))));
 BA.debugLineNum = 333;BA.debugLine="lTag.Add( lblUnit.Text )";
Debug.ShouldStop(4096);
_ltag.runVoidMethod ("Add",(Object)((__ref.getField(false,"_lblunit").runMethod(true,"getText"))));
 BA.debugLineNum = 334;BA.debugLine="Main.kvs.PutObject( mEventName, lTag )";
Debug.ShouldStop(8192);
parent._main._kvs.runClassMethod (com.calypsoinstruments.anemotracker.keyvaluestore.class, "_putobject",(Object)(__ref.getField(true,"_meventname")),(Object)((_ltag.getObject())));
 if (true) break;

case 11:
//C
this.state = -1;
;
 BA.debugLineNum = 342;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _dialog_ready(RemoteObject __ref,RemoteObject _pnl) throws Exception{
}
public static void  _dialog_result(RemoteObject __ref,RemoteObject _res) throws Exception{
}
public static RemoteObject  _pause(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Pause (tag) ","tag",14,__ref.getField(false, "ba"),__ref,144);
if (RapidSub.canDelegate("pause")) { return __ref.runUserSub(false, "tag","pause", __ref);}
 BA.debugLineNum = 144;BA.debugLine="Public Sub Pause";
Debug.ShouldStop(32768);
 BA.debugLineNum = 146;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pk_tag_itemselected(RemoteObject __ref,RemoteObject _column,RemoteObject _row) throws Exception{
try {
		Debug.PushSubsStack("pk_tag_ItemSelected (tag) ","tag",14,__ref.getField(false, "ba"),__ref,367);
if (RapidSub.canDelegate("pk_tag_itemselected")) { return __ref.runUserSub(false, "tag","pk_tag_itemselected", __ref, _column, _row);}
Debug.locals.put("Column", _column);
Debug.locals.put("Row", _row);
 BA.debugLineNum = 367;BA.debugLine="Sub pk_tag_ItemSelected (Column As Int, Row As Int";
Debug.ShouldStop(16384);
 BA.debugLineNum = 385;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settext(RemoteObject __ref,RemoteObject _txt) throws Exception{
try {
		Debug.PushSubsStack("SetText (tag) ","tag",14,__ref.getField(false, "ba"),__ref,220);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "tag","settext", __ref, _txt);}
Debug.locals.put("txt", _txt);
 BA.debugLineNum = 220;BA.debugLine="Public Sub SetText( txt As String )";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 221;BA.debugLine="lblText.Text = txt";
Debug.ShouldStop(268435456);
__ref.getField(false,"_lbltext").runMethod(true,"setText",BA.ObjectToCharSequence(_txt));
 BA.debugLineNum = 223;BA.debugLine="AUTO_SIZE1(lblText)";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (com.calypsoinstruments.anemotracker.tag.class, "_auto_size1",(Object)(__ref.getField(false,"_lbltext")));
 BA.debugLineNum = 224;BA.debugLine="AUTO_SIZE1(lblValue)";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (com.calypsoinstruments.anemotracker.tag.class, "_auto_size1",(Object)(__ref.getField(false,"_lblvalue")));
 BA.debugLineNum = 225;BA.debugLine="AUTO_SIZE1(lblUnit)";
Debug.ShouldStop(1);
__ref.runClassMethod (com.calypsoinstruments.anemotracker.tag.class, "_auto_size1",(Object)(__ref.getField(false,"_lblunit")));
 BA.debugLineNum = 230;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setunit(RemoteObject __ref,RemoteObject _txt) throws Exception{
try {
		Debug.PushSubsStack("SetUnit (tag) ","tag",14,__ref.getField(false, "ba"),__ref,239);
if (RapidSub.canDelegate("setunit")) { return __ref.runUserSub(false, "tag","setunit", __ref, _txt);}
Debug.locals.put("txt", _txt);
 BA.debugLineNum = 239;BA.debugLine="Public Sub SetUnit( txt As String )";
Debug.ShouldStop(16384);
 BA.debugLineNum = 240;BA.debugLine="lblUnit.Text = txt";
Debug.ShouldStop(32768);
__ref.getField(false,"_lblunit").runMethod(true,"setText",BA.ObjectToCharSequence(_txt));
 BA.debugLineNum = 242;BA.debugLine="AUTO_SIZE1(lblText)";
Debug.ShouldStop(131072);
__ref.runClassMethod (com.calypsoinstruments.anemotracker.tag.class, "_auto_size1",(Object)(__ref.getField(false,"_lbltext")));
 BA.debugLineNum = 243;BA.debugLine="AUTO_SIZE1(lblValue)";
Debug.ShouldStop(262144);
__ref.runClassMethod (com.calypsoinstruments.anemotracker.tag.class, "_auto_size1",(Object)(__ref.getField(false,"_lblvalue")));
 BA.debugLineNum = 244;BA.debugLine="AUTO_SIZE1(lblUnit)";
Debug.ShouldStop(524288);
__ref.runClassMethod (com.calypsoinstruments.anemotracker.tag.class, "_auto_size1",(Object)(__ref.getField(false,"_lblunit")));
 BA.debugLineNum = 249;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvalue(RemoteObject __ref,RemoteObject _txt) throws Exception{
try {
		Debug.PushSubsStack("SetValue (tag) ","tag",14,__ref.getField(false, "ba"),__ref,232);
if (RapidSub.canDelegate("setvalue")) { return __ref.runUserSub(false, "tag","setvalue", __ref, _txt);}
Debug.locals.put("txt", _txt);
 BA.debugLineNum = 232;BA.debugLine="Public Sub SetValue( txt As String )";
Debug.ShouldStop(128);
 BA.debugLineNum = 233;BA.debugLine="lblValue.Text = txt";
Debug.ShouldStop(256);
__ref.getField(false,"_lblvalue").runMethod(true,"setText",BA.ObjectToCharSequence(_txt));
 BA.debugLineNum = 237;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sp_tag_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("sp_tag_ItemClick (tag) ","tag",14,__ref.getField(false, "ba"),__ref,350);
if (RapidSub.canDelegate("sp_tag_itemclick")) { return __ref.runUserSub(false, "tag","sp_tag_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 350;BA.debugLine="Sub sp_tag_ItemClick (Position As Int, Value As Ob";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 352;BA.debugLine="sp_unit.Clear";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_sp_unit").runVoidMethod ("Clear");
 BA.debugLineNum = 353;BA.debugLine="Select sp_tag.SelectedItem As String";
Debug.ShouldStop(1);
switch (BA.switchObjectToInt(__ref.getField(false,"_sp_tag").runMethod(true,"getSelectedItem"),BA.ObjectToString("AWA"),BA.ObjectToString("TWA"),BA.ObjectToString("AWM"),BA.ObjectToString("TWM"),BA.ObjectToString("Speed"),BA.ObjectToString("Temp"),BA.ObjectToString("Batt"),BA.ObjectToString("Mag HDG"),BA.ObjectToString("Roll"),BA.ObjectToString("Pitch"))) {
case 0: 
case 1: {
 BA.debugLineNum = 355;BA.debugLine="sp_unit.AddAll( Array As String( \"degrees\" ) )";
Debug.ShouldStop(4);
__ref.getField(false,"_sp_unit").runVoidMethod ("AddAll",(Object)(tag.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("degrees")})))));
 break; }
case 2: 
case 3: 
case 4: {
 BA.debugLineNum = 357;BA.debugLine="sp_unit.addall( Array As String( \"knots\", \"m/s\"";
Debug.ShouldStop(16);
__ref.getField(false,"_sp_unit").runVoidMethod ("AddAll",(Object)(tag.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {3},new Object[] {BA.ObjectToString("knots"),BA.ObjectToString("m/s"),RemoteObject.createImmutable("km/h")})))));
 break; }
case 5: {
 BA.debugLineNum = 359;BA.debugLine="sp_unit.AddAll( Array As String( \"ºC\", \"ºF\" ))";
Debug.ShouldStop(64);
__ref.getField(false,"_sp_unit").runVoidMethod ("AddAll",(Object)(tag.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("ºC"),RemoteObject.createImmutable("ºF")})))));
 break; }
case 6: {
 BA.debugLineNum = 361;BA.debugLine="sp_unit.AddAll( Array As String (\"%\"))";
Debug.ShouldStop(256);
__ref.getField(false,"_sp_unit").runVoidMethod ("AddAll",(Object)(tag.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("%")})))));
 break; }
case 7: 
case 8: 
case 9: {
 BA.debugLineNum = 363;BA.debugLine="sp_unit.AddAll( Array As String( \"degrees\" ) )";
Debug.ShouldStop(1024);
__ref.getField(false,"_sp_unit").runVoidMethod ("AddAll",(Object)(tag.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("degrees")})))));
 break; }
}
;
 BA.debugLineNum = 366;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sp_unit_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("sp_unit_ItemClick (tag) ","tag",14,__ref.getField(false, "ba"),__ref,346);
if (RapidSub.canDelegate("sp_unit_itemclick")) { return __ref.runUserSub(false, "tag","sp_unit_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 346;BA.debugLine="Sub sp_unit_ItemClick (Position As Int, Value As O";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 348;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _update(RemoteObject __ref,RemoteObject _selected) throws Exception{
try {
		Debug.PushSubsStack("Update (tag) ","tag",14,__ref.getField(false, "ba"),__ref,148);
if (RapidSub.canDelegate("update")) { return __ref.runUserSub(false, "tag","update", __ref, _selected);}
RemoteObject _calcs = RemoteObject.declareNull("com.calypsoinstruments.anemotracker.windcalcs");
RemoteObject _value = RemoteObject.createImmutable(0f);
RemoteObject _strv = RemoteObject.createImmutable("");
Debug.locals.put("selected", _selected);
 BA.debugLineNum = 148;BA.debugLine="Public Sub Update( selected As Boolean )";
Debug.ShouldStop(524288);
 BA.debugLineNum = 152;BA.debugLine="Dim calcs = Starter.calcs_1 As WindCalcs";
Debug.ShouldStop(8388608);
_calcs = tag._starter._calcs_1;Debug.locals.put("calcs", _calcs);Debug.locals.put("calcs", _calcs);
 BA.debugLineNum = 157;BA.debugLine="Dim value As Float";
Debug.ShouldStop(268435456);
_value = RemoteObject.createImmutable(0f);Debug.locals.put("value", _value);
 BA.debugLineNum = 158;BA.debugLine="Dim strv As String";
Debug.ShouldStop(536870912);
_strv = RemoteObject.createImmutable("");Debug.locals.put("strv", _strv);
 BA.debugLineNum = 159;BA.debugLine="Select lblText.Text";
Debug.ShouldStop(1073741824);
switch (BA.switchObjectToInt(__ref.getField(false,"_lbltext").runMethod(true,"getText"),BA.ObjectToString("AWM"),BA.ObjectToString("AWA"),BA.ObjectToString("TWM"),BA.ObjectToString("TWA"),BA.ObjectToString("Speed"),BA.ObjectToString("Temp"),BA.ObjectToString("Batt"),BA.ObjectToString("Roll"),BA.ObjectToString("Pitch"),BA.ObjectToString("Mag HDG"))) {
case 0: {
 BA.debugLineNum = 161;BA.debugLine="value = calcs.awm";
Debug.ShouldStop(1);
_value = _calcs.getField(true,"_awm");Debug.locals.put("value", _value);
 break; }
case 1: {
 BA.debugLineNum = 163;BA.debugLine="value = calcs.awa";
Debug.ShouldStop(4);
_value = _calcs.getField(true,"_awa");Debug.locals.put("value", _value);
 break; }
case 2: {
 BA.debugLineNum = 165;BA.debugLine="value = calcs.twm";
Debug.ShouldStop(16);
_value = _calcs.getField(true,"_twm");Debug.locals.put("value", _value);
 break; }
case 3: {
 BA.debugLineNum = 167;BA.debugLine="value = calcs.twa";
Debug.ShouldStop(64);
_value = _calcs.getField(true,"_twa");Debug.locals.put("value", _value);
 break; }
case 4: {
 BA.debugLineNum = 169;BA.debugLine="value = calcs.speed";
Debug.ShouldStop(256);
_value = _calcs.getField(true,"_speed");Debug.locals.put("value", _value);
 break; }
case 5: {
 BA.debugLineNum = 171;BA.debugLine="value = calcs.temp";
Debug.ShouldStop(1024);
_value = BA.numberCast(float.class, _calcs.getField(true,"_temp"));Debug.locals.put("value", _value);
 break; }
case 6: {
 BA.debugLineNum = 173;BA.debugLine="value = calcs.battery";
Debug.ShouldStop(4096);
_value = BA.numberCast(float.class, _calcs.getField(true,"_battery"));Debug.locals.put("value", _value);
 break; }
case 7: {
 BA.debugLineNum = 175;BA.debugLine="value = calcs.roll";
Debug.ShouldStop(16384);
_value = BA.numberCast(float.class, _calcs.getField(true,"_roll"));Debug.locals.put("value", _value);
 break; }
case 8: {
 BA.debugLineNum = 177;BA.debugLine="value = calcs.pitch";
Debug.ShouldStop(65536);
_value = BA.numberCast(float.class, _calcs.getField(true,"_pitch"));Debug.locals.put("value", _value);
 break; }
case 9: {
 BA.debugLineNum = 179;BA.debugLine="value = calcs.ecompass";
Debug.ShouldStop(262144);
_value = BA.numberCast(float.class, _calcs.getField(true,"_ecompass"));Debug.locals.put("value", _value);
 break; }
}
;
 BA.debugLineNum = 183;BA.debugLine="value = convert( value, lblUnit.Text )";
Debug.ShouldStop(4194304);
_value = BA.numberCast(float.class, __ref.runClassMethod (com.calypsoinstruments.anemotracker.tag.class, "_convert",(Object)(_value),(Object)(__ref.getField(false,"_lblunit").runMethod(true,"getText"))));Debug.locals.put("value", _value);
 BA.debugLineNum = 184;BA.debugLine="Select lblText.Text";
Debug.ShouldStop(8388608);
switch (BA.switchObjectToInt(__ref.getField(false,"_lbltext").runMethod(true,"getText"),BA.ObjectToString("AWA"),BA.ObjectToString("TWA"),BA.ObjectToString("Roll"),BA.ObjectToString("Pitch"),BA.ObjectToString("Batt"),BA.ObjectToString("Mag HDG"),BA.ObjectToString("AWM"),BA.ObjectToString("TWM"),BA.ObjectToString("Speed"),BA.ObjectToString("Temp"))) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: 
case 5: {
 BA.debugLineNum = 186;BA.debugLine="strv = NumberFormat( value, 3, 0 )";
Debug.ShouldStop(33554432);
_strv = tag.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _value)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("strv", _strv);
 break; }
case 6: 
case 7: 
case 8: {
 BA.debugLineNum = 188;BA.debugLine="If lblUnit.Text = \"km/h\" Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_lblunit").runMethod(true,"getText"),BA.ObjectToString("km/h"))) { 
 BA.debugLineNum = 189;BA.debugLine="strv = NumberFormat2( value, 3, 1, 1, False )";
Debug.ShouldStop(268435456);
_strv = tag.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, _value)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 1)),(Object)(tag.__c.getField(true,"False")));Debug.locals.put("strv", _strv);
 }else {
 BA.debugLineNum = 191;BA.debugLine="strv = NumberFormat2( value, 2, 1, 1, False )";
Debug.ShouldStop(1073741824);
_strv = tag.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, _value)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 1)),(Object)(tag.__c.getField(true,"False")));Debug.locals.put("strv", _strv);
 };
 break; }
case 9: {
 BA.debugLineNum = 194;BA.debugLine="strv = NumberFormat( value, 2, 1 )";
Debug.ShouldStop(2);
_strv = tag.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _value)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("strv", _strv);
 break; }
}
;
 BA.debugLineNum = 198;BA.debugLine="SetValue( strv  )";
Debug.ShouldStop(32);
__ref.runClassMethod (com.calypsoinstruments.anemotracker.tag.class, "_setvalue",(Object)(_strv));
 BA.debugLineNum = 200;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}