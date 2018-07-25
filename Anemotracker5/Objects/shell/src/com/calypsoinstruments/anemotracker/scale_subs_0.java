package com.calypsoinstruments.anemotracker;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class scale_subs_0 {


public static RemoteObject  _auto_size1(RemoteObject __ref,RemoteObject _llabel1) throws Exception{
try {
		Debug.PushSubsStack("AUTO_SIZE1 (scale) ","scale",9,__ref.getField(false, "ba"),__ref,439);
if (RapidSub.canDelegate("auto_size1")) { return __ref.runUserSub(false, "scale","auto_size1", __ref, _llabel1);}
RemoteObject _su = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");
RemoteObject _lheight1 = RemoteObject.createImmutable(0f);
Debug.locals.put("Llabel1", _llabel1);
 BA.debugLineNum = 439;BA.debugLine="Sub AUTO_SIZE1(Llabel1 As Label) As Float";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 440;BA.debugLine="Dim su As StringUtils";
Debug.ShouldStop(8388608);
_su = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");Debug.locals.put("su", _su);
 BA.debugLineNum = 441;BA.debugLine="Dim LHeight1 As Float";
Debug.ShouldStop(16777216);
_lheight1 = RemoteObject.createImmutable(0f);Debug.locals.put("LHeight1", _lheight1);
 BA.debugLineNum = 442;BA.debugLine="Llabel1.TextSize = 128";
Debug.ShouldStop(33554432);
_llabel1.runMethod(true,"setTextSize",BA.numberCast(float.class, 128));
 BA.debugLineNum = 444;BA.debugLine="LHeight1 = cvs.MeasureStringWidth(Llabel1.Text,";
Debug.ShouldStop(134217728);
_lheight1 = __ref.getField(false,"_cvs").runMethod(true,"MeasureStringWidth",(Object)(_llabel1.runMethod(true,"getText")),(Object)(_llabel1.runMethod(false,"getTypeface")),(Object)(_llabel1.runMethod(true,"getTextSize")));Debug.locals.put("LHeight1", _lheight1);
 BA.debugLineNum = 446;BA.debugLine="Do While LHeight1 > Llabel1.width";
Debug.ShouldStop(536870912);
while (RemoteObject.solveBoolean(">",_lheight1,BA.numberCast(double.class, _llabel1.runMethod(true,"getWidth")))) {
 BA.debugLineNum = 449;BA.debugLine="LHeight1 = cvs.MeasureStringWidth(Llabel1.Text,";
Debug.ShouldStop(1);
_lheight1 = __ref.getField(false,"_cvs").runMethod(true,"MeasureStringWidth",(Object)(_llabel1.runMethod(true,"getText")),(Object)(_llabel1.runMethod(false,"getTypeface")),(Object)(_llabel1.runMethod(true,"getTextSize")));Debug.locals.put("LHeight1", _lheight1);
 BA.debugLineNum = 450;BA.debugLine="If LHeight1 < Llabel1.width Then Return Llabel1";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("<",_lheight1,BA.numberCast(double.class, _llabel1.runMethod(true,"getWidth")))) { 
if (true) return _llabel1.runMethod(true,"getTextSize");};
 BA.debugLineNum = 451;BA.debugLine="Llabel1.TextSize = Llabel1.TextSize - 1";
Debug.ShouldStop(4);
_llabel1.runMethod(true,"setTextSize",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_llabel1.runMethod(true,"getTextSize"),RemoteObject.createImmutable(1)}, "-",1, 0)));
 BA.debugLineNum = 452;BA.debugLine="If Llabel1.TextSize<8 Then Return 8";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("<",_llabel1.runMethod(true,"getTextSize"),BA.numberCast(double.class, 8))) { 
if (true) return BA.numberCast(float.class, 8);};
 }
;
 BA.debugLineNum = 455;BA.debugLine="Return 8      'Textsize should never be smaller";
Debug.ShouldStop(64);
if (true) return BA.numberCast(float.class, 8);
 BA.debugLineNum = 456;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("Base_Resize (scale) ","scale",9,__ref.getField(false, "ba"),__ref,236);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "scale","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 236;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(2048);
 BA.debugLineNum = 237;BA.debugLine="mBase.Width = Width";
Debug.ShouldStop(4096);
__ref.getField(false,"_mbase").runMethod(true,"setWidth",BA.numberCast(int.class, _width));
 BA.debugLineNum = 238;BA.debugLine="mBase.Height = Height";
Debug.ShouldStop(8192);
__ref.getField(false,"_mbase").runMethod(true,"setHeight",BA.numberCast(int.class, _height));
 BA.debugLineNum = 239;BA.debugLine="img.Height = mBase.Height";
Debug.ShouldStop(16384);
__ref.getField(false,"_img").runMethod(true,"setHeight",__ref.getField(false,"_mbase").runMethod(true,"getHeight"));
 BA.debugLineNum = 240;BA.debugLine="img.Width = mBase.Width";
Debug.ShouldStop(32768);
__ref.getField(false,"_img").runMethod(true,"setWidth",__ref.getField(false,"_mbase").runMethod(true,"getWidth"));
 BA.debugLineNum = 241;BA.debugLine="rect1.Initialize(0, 0, img.Width, img.Height )";
Debug.ShouldStop(65536);
__ref.getField(false,"_rect1").runVoidMethod ("Initialize",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_img").runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_img").runMethod(true,"getHeight")));
 BA.debugLineNum = 242;BA.debugLine="lbl_true.left = 0.43*mBase.Width";
Debug.ShouldStop(131072);
__ref.getField(false,"_lbl_true").runMethod(true,"setLeft",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.43),__ref.getField(false,"_mbase").runMethod(true,"getWidth")}, "*",0, 0)));
 BA.debugLineNum = 243;BA.debugLine="lbl_true.top = 0.37*mBase.height";
Debug.ShouldStop(262144);
__ref.getField(false,"_lbl_true").runMethod(true,"setTop",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.37),__ref.getField(false,"_mbase").runMethod(true,"getHeight")}, "*",0, 0)));
 BA.debugLineNum = 244;BA.debugLine="lbl_true.width = 0.10*mBase.Width";
Debug.ShouldStop(524288);
__ref.getField(false,"_lbl_true").runMethod(true,"setWidth",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.10),__ref.getField(false,"_mbase").runMethod(true,"getWidth")}, "*",0, 0)));
 BA.debugLineNum = 245;BA.debugLine="lbl_true.Height = 0.08*mBase.Height";
Debug.ShouldStop(1048576);
__ref.getField(false,"_lbl_true").runMethod(true,"setHeight",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.08),__ref.getField(false,"_mbase").runMethod(true,"getHeight")}, "*",0, 0)));
 BA.debugLineNum = 246;BA.debugLine="lbl_anemo.left = 0.40*mBase.Width";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lbl_anemo").runMethod(true,"setLeft",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.40),__ref.getField(false,"_mbase").runMethod(true,"getWidth")}, "*",0, 0)));
 BA.debugLineNum = 247;BA.debugLine="lbl_anemo.top= 0.45*mBase.Height";
Debug.ShouldStop(4194304);
__ref.getField(false,"_lbl_anemo").runMethod(true,"setTop",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.45),__ref.getField(false,"_mbase").runMethod(true,"getHeight")}, "*",0, 0)));
 BA.debugLineNum = 248;BA.debugLine="lbl_anemo.Width=0.16*mBase.Width";
Debug.ShouldStop(8388608);
__ref.getField(false,"_lbl_anemo").runMethod(true,"setWidth",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.16),__ref.getField(false,"_mbase").runMethod(true,"getWidth")}, "*",0, 0)));
 BA.debugLineNum = 249;BA.debugLine="lbl_anemo.Height=0.12*mBase.Height";
Debug.ShouldStop(16777216);
__ref.getField(false,"_lbl_anemo").runMethod(true,"setHeight",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.12),__ref.getField(false,"_mbase").runMethod(true,"getHeight")}, "*",0, 0)));
 BA.debugLineNum = 250;BA.debugLine="lbl_unit.left=0.41*mBase.Width";
Debug.ShouldStop(33554432);
__ref.getField(false,"_lbl_unit").runMethod(true,"setLeft",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.41),__ref.getField(false,"_mbase").runMethod(true,"getWidth")}, "*",0, 0)));
 BA.debugLineNum = 251;BA.debugLine="lbl_unit.top=0.53*mBase.height";
Debug.ShouldStop(67108864);
__ref.getField(false,"_lbl_unit").runMethod(true,"setTop",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.53),__ref.getField(false,"_mbase").runMethod(true,"getHeight")}, "*",0, 0)));
 BA.debugLineNum = 252;BA.debugLine="lbl_unit.Width=0.14*mBase.Width";
Debug.ShouldStop(134217728);
__ref.getField(false,"_lbl_unit").runMethod(true,"setWidth",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.14),__ref.getField(false,"_mbase").runMethod(true,"getWidth")}, "*",0, 0)));
 BA.debugLineNum = 253;BA.debugLine="lbl_unit.Height=0.08*mBase.Height";
Debug.ShouldStop(268435456);
__ref.getField(false,"_lbl_unit").runMethod(true,"setHeight",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.08),__ref.getField(false,"_mbase").runMethod(true,"getHeight")}, "*",0, 0)));
 BA.debugLineNum = 254;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 9;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Private mEventName As String 'ignore";
scale._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",scale._meventname);
 //BA.debugLineNum = 11;BA.debugLine="Private mCallBack As Object 'ignore";
scale._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",scale._mcallback);
 //BA.debugLineNum = 12;BA.debugLine="Private mBase As Panel";
scale._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_mbase",scale._mbase);
 //BA.debugLineNum = 13;BA.debugLine="Private Const DefaultColorConstant As Int = -9848";
scale._defaultcolorconstant = BA.numberCast(int.class, -(double) (0 + 984833));__ref.setField("_defaultcolorconstant",scale._defaultcolorconstant);
 //BA.debugLineNum = 14;BA.debugLine="Private lbl_anemo As Label";
scale._lbl_anemo = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbl_anemo",scale._lbl_anemo);
 //BA.debugLineNum = 15;BA.debugLine="Private lbl_unit, lbl_true As Label";
scale._lbl_unit = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbl_unit",scale._lbl_unit);
scale._lbl_true = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbl_true",scale._lbl_true);
 //BA.debugLineNum = 16;BA.debugLine="Private back, img As ImageView";
scale._back = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_back",scale._back);
scale._img = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_img",scale._img);
 //BA.debugLineNum = 17;BA.debugLine="Private canvas As Canvas";
scale._canvas = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");__ref.setField("_canvas",scale._canvas);
 //BA.debugLineNum = 18;BA.debugLine="Private cnv1, cnv2, cnv3 As Canvas";
scale._cnv1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");__ref.setField("_cnv1",scale._cnv1);
scale._cnv2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");__ref.setField("_cnv2",scale._cnv2);
scale._cnv3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");__ref.setField("_cnv3",scale._cnv3);
 //BA.debugLineNum = 19;BA.debugLine="Private bmp1, bmp2, bmp3, bmp_compass, bmp_true,";
scale._bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");__ref.setField("_bmp1",scale._bmp1);
scale._bmp2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");__ref.setField("_bmp2",scale._bmp2);
scale._bmp3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");__ref.setField("_bmp3",scale._bmp3);
scale._bmp_compass = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");__ref.setField("_bmp_compass",scale._bmp_compass);
scale._bmp_true = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");__ref.setField("_bmp_true",scale._bmp_true);
scale._bmp_app = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");__ref.setField("_bmp_app",scale._bmp_app);
 //BA.debugLineNum = 20;BA.debugLine="Private rect1, rect2 As Rect";
scale._rect1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");__ref.setField("_rect1",scale._rect1);
scale._rect2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");__ref.setField("_rect2",scale._rect2);
 //BA.debugLineNum = 21;BA.debugLine="Dim i As Int";
scale._i = RemoteObject.createImmutable(0);__ref.setField("_i",scale._i);
 //BA.debugLineNum = 22;BA.debugLine="Private pos_actual, pos_destino, error,vel, einit";
scale._pos_actual = RemoteObject.createImmutable(0);__ref.setField("_pos_actual",scale._pos_actual);
scale._pos_destino = RemoteObject.createImmutable(0);__ref.setField("_pos_destino",scale._pos_destino);
scale._error = RemoteObject.createImmutable(0);__ref.setField("_error",scale._error);
scale._vel = RemoteObject.createImmutable(0);__ref.setField("_vel",scale._vel);
scale._einit = RemoteObject.createImmutable(0);__ref.setField("_einit",scale._einit);
 //BA.debugLineNum = 23;BA.debugLine="Private x_actual = 0, y_actual = 0, x_destino = 0";
scale._x_actual = BA.numberCast(float.class, 0);__ref.setField("_x_actual",scale._x_actual);
scale._y_actual = BA.numberCast(float.class, 0);__ref.setField("_y_actual",scale._y_actual);
scale._x_destino = BA.numberCast(float.class, 0);__ref.setField("_x_destino",scale._x_destino);
scale._y_destino = BA.numberCast(float.class, 0);__ref.setField("_y_destino",scale._y_destino);
scale._x_vel = BA.numberCast(float.class, 0);__ref.setField("_x_vel",scale._x_vel);
scale._y_vel = BA.numberCast(float.class, 0);__ref.setField("_y_vel",scale._y_vel);
 //BA.debugLineNum = 24;BA.debugLine="Private xa_actual = 0, ya_actual = 0, xa_destino";
scale._xa_actual = BA.numberCast(float.class, 0);__ref.setField("_xa_actual",scale._xa_actual);
scale._ya_actual = BA.numberCast(float.class, 0);__ref.setField("_ya_actual",scale._ya_actual);
scale._xa_destino = BA.numberCast(float.class, 0);__ref.setField("_xa_destino",scale._xa_destino);
scale._ya_destino = BA.numberCast(float.class, 0);__ref.setField("_ya_destino",scale._ya_destino);
scale._xa_vel = BA.numberCast(float.class, 0);__ref.setField("_xa_vel",scale._xa_vel);
scale._ya_vel = BA.numberCast(float.class, 0);__ref.setField("_ya_vel",scale._ya_vel);
 //BA.debugLineNum = 25;BA.debugLine="Private xt_actual = 0, yt_actual = 0, xt_destino";
scale._xt_actual = BA.numberCast(float.class, 0);__ref.setField("_xt_actual",scale._xt_actual);
scale._yt_actual = BA.numberCast(float.class, 0);__ref.setField("_yt_actual",scale._yt_actual);
scale._xt_destino = BA.numberCast(float.class, 0);__ref.setField("_xt_destino",scale._xt_destino);
scale._yt_destino = BA.numberCast(float.class, 0);__ref.setField("_yt_destino",scale._yt_destino);
scale._xt_vel = BA.numberCast(float.class, 0);__ref.setField("_xt_vel",scale._xt_vel);
scale._yt_vel = BA.numberCast(float.class, 0);__ref.setField("_yt_vel",scale._yt_vel);
 //BA.debugLineNum = 26;BA.debugLine="Private einit1, einit2 As Float";
scale._einit1 = RemoteObject.createImmutable(0f);__ref.setField("_einit1",scale._einit1);
scale._einit2 = RemoteObject.createImmutable(0f);__ref.setField("_einit2",scale._einit2);
 //BA.debugLineNum = 27;BA.debugLine="Private tUpdate As Timer";
scale._tupdate = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_tupdate",scale._tupdate);
 //BA.debugLineNum = 28;BA.debugLine="Private wind_true As Boolean";
scale._wind_true = RemoteObject.createImmutable(false);__ref.setField("_wind_true",scale._wind_true);
 //BA.debugLineNum = 30;BA.debugLine="Dim kX,kY, kXa, kYa, kXt, kYt As tKalman";
scale._kx = RemoteObject.createNew ("com.calypsoinstruments.anemotracker.windcalcs._tkalman");__ref.setField("_kx",scale._kx);
scale._ky = RemoteObject.createNew ("com.calypsoinstruments.anemotracker.windcalcs._tkalman");__ref.setField("_ky",scale._ky);
scale._kxa = RemoteObject.createNew ("com.calypsoinstruments.anemotracker.windcalcs._tkalman");__ref.setField("_kxa",scale._kxa);
scale._kya = RemoteObject.createNew ("com.calypsoinstruments.anemotracker.windcalcs._tkalman");__ref.setField("_kya",scale._kya);
scale._kxt = RemoteObject.createNew ("com.calypsoinstruments.anemotracker.windcalcs._tkalman");__ref.setField("_kxt",scale._kxt);
scale._kyt = RemoteObject.createNew ("com.calypsoinstruments.anemotracker.windcalcs._tkalman");__ref.setField("_kyt",scale._kyt);
 //BA.debugLineNum = 31;BA.debugLine="Dim cvs As Canvas";
scale._cvs = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");__ref.setField("_cvs",scale._cvs);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (scale) ","scale",9,__ref.getField(false, "ba"),__ref,59);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "scale","designercreateview", __ref, _base, _lbl, _props);}
RemoteObject _dsdigi = RemoteObject.declareNull("anywheresoftware.b4a.keywords.constants.TypefaceWrapper");
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _ioxsvg = RemoteObject.declareNull("com.iox.ioxsvg.ioxsvg");
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 59;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 61;BA.debugLine="mBase = Base";
Debug.ShouldStop(268435456);
__ref.setField ("_mbase",_base);
 BA.debugLineNum = 62;BA.debugLine="mBase.Height = mBase.Width";
Debug.ShouldStop(536870912);
__ref.getField(false,"_mbase").runMethod(true,"setHeight",__ref.getField(false,"_mbase").runMethod(true,"getWidth"));
 BA.debugLineNum = 63;BA.debugLine="wind_true = True";
Debug.ShouldStop(1073741824);
__ref.setField ("_wind_true",scale.__c.getField(true,"True"));
 BA.debugLineNum = 65;BA.debugLine="back.Initialize(\"Panel1\")";
Debug.ShouldStop(1);
__ref.getField(false,"_back").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Panel1")));
 BA.debugLineNum = 67;BA.debugLine="mBase.AddView( back, 0,0, mBase.Width, mBase.Heig";
Debug.ShouldStop(4);
__ref.getField(false,"_mbase").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_back").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_mbase").runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase").runMethod(true,"getHeight")));
 BA.debugLineNum = 68;BA.debugLine="img.Initialize(\"img\")";
Debug.ShouldStop(8);
__ref.getField(false,"_img").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("img")));
 BA.debugLineNum = 69;BA.debugLine="mBase.AddView( img, 0,0,mBase.Width, mBase.Width";
Debug.ShouldStop(16);
__ref.getField(false,"_mbase").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_img").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_mbase").runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase").runMethod(true,"getWidth")));
 BA.debugLineNum = 70;BA.debugLine="canvas.Initialize(img)";
Debug.ShouldStop(32);
__ref.getField(false,"_canvas").runVoidMethod ("Initialize",(Object)((__ref.getField(false,"_img").getObject())));
 BA.debugLineNum = 72;BA.debugLine="Dim dsdigi As Typeface";
Debug.ShouldStop(128);
_dsdigi = RemoteObject.createNew ("anywheresoftware.b4a.keywords.constants.TypefaceWrapper");Debug.locals.put("dsdigi", _dsdigi);
 BA.debugLineNum = 73;BA.debugLine="dsdigi = Typeface.LoadFromAssets(\"ds-digi.ttf\")";
Debug.ShouldStop(256);
_dsdigi.setObject(scale.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("ds-digi.ttf"))));
 BA.debugLineNum = 76;BA.debugLine="lbl_true.Initialize(\"lbl_true\")";
Debug.ShouldStop(2048);
__ref.getField(false,"_lbl_true").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("lbl_true")));
 BA.debugLineNum = 77;BA.debugLine="lbl_anemo.Initialize( \"lbl_anemo\")";
Debug.ShouldStop(4096);
__ref.getField(false,"_lbl_anemo").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("lbl_anemo")));
 BA.debugLineNum = 78;BA.debugLine="lbl_unit.Initialize( \"lbl_unit\")";
Debug.ShouldStop(8192);
__ref.getField(false,"_lbl_unit").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("lbl_unit")));
 BA.debugLineNum = 79;BA.debugLine="lbl_true.Text = \"true\"";
Debug.ShouldStop(16384);
__ref.getField(false,"_lbl_true").runMethod(true,"setText",BA.ObjectToCharSequence("true"));
 BA.debugLineNum = 80;BA.debugLine="lbl_true.textColor = Colors.white";
Debug.ShouldStop(32768);
__ref.getField(false,"_lbl_true").runMethod(true,"setTextColor",scale.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 81;BA.debugLine="lbl_anemo.Text = \"00.0\"";
Debug.ShouldStop(65536);
__ref.getField(false,"_lbl_anemo").runMethod(true,"setText",BA.ObjectToCharSequence("00.0"));
 BA.debugLineNum = 82;BA.debugLine="lbl_anemo.TextColor = Colors.White";
Debug.ShouldStop(131072);
__ref.getField(false,"_lbl_anemo").runMethod(true,"setTextColor",scale.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 83;BA.debugLine="lbl_unit.Text = \"knots\"";
Debug.ShouldStop(262144);
__ref.getField(false,"_lbl_unit").runMethod(true,"setText",BA.ObjectToCharSequence("knots"));
 BA.debugLineNum = 84;BA.debugLine="lbl_unit.TextColor = Colors.White";
Debug.ShouldStop(524288);
__ref.getField(false,"_lbl_unit").runMethod(true,"setTextColor",scale.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 86;BA.debugLine="lbl_true.Padding = Array As Int(0, 0, 0, 0)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lbl_true").runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {BA.numberCast(int.class, 0),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0)}));
 BA.debugLineNum = 87;BA.debugLine="Dim jo As JavaObject = lbl_true";
Debug.ShouldStop(4194304);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo.setObject(__ref.getField(false,"_lbl_true").getObject());Debug.locals.put("jo", _jo);
 BA.debugLineNum = 88;BA.debugLine="jo.RunMethod(\"setIncludeFontPadding\", Array(Fals";
Debug.ShouldStop(8388608);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setIncludeFontPadding")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(scale.__c.getField(true,"False"))})));
 BA.debugLineNum = 89;BA.debugLine="lbl_true.Gravity = Bit.Or( Gravity.CENTER_HORIZO";
Debug.ShouldStop(16777216);
__ref.getField(false,"_lbl_true").runMethod(true,"setGravity",scale.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(scale.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL")),(Object)(scale.__c.getField(false,"Gravity").getField(true,"TOP"))));
 BA.debugLineNum = 91;BA.debugLine="lbl_anemo.Padding = Array As Int(0, 0, 0, 0)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_lbl_anemo").runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {BA.numberCast(int.class, 0),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0)}));
 BA.debugLineNum = 92;BA.debugLine="Dim jo As JavaObject = lbl_anemo";
Debug.ShouldStop(134217728);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo.setObject(__ref.getField(false,"_lbl_anemo").getObject());Debug.locals.put("jo", _jo);
 BA.debugLineNum = 93;BA.debugLine="jo.RunMethod(\"setIncludeFontPadding\", Array(Fals";
Debug.ShouldStop(268435456);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setIncludeFontPadding")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(scale.__c.getField(true,"False"))})));
 BA.debugLineNum = 94;BA.debugLine="lbl_anemo.Gravity =  Bit.Or( Gravity.CENTER_HORI";
Debug.ShouldStop(536870912);
__ref.getField(false,"_lbl_anemo").runMethod(true,"setGravity",scale.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(scale.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL")),(Object)(scale.__c.getField(false,"Gravity").getField(true,"TOP"))));
 BA.debugLineNum = 95;BA.debugLine="lbl_anemo.Typeface = dsdigi";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_lbl_anemo").runMethod(false,"setTypeface",(_dsdigi.getObject()));
 BA.debugLineNum = 97;BA.debugLine="lbl_unit.Padding = Array As Int(0, 0, 0, 0)";
Debug.ShouldStop(1);
__ref.getField(false,"_lbl_unit").runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {BA.numberCast(int.class, 0),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0)}));
 BA.debugLineNum = 98;BA.debugLine="Dim jo As JavaObject = lbl_unit";
Debug.ShouldStop(2);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo.setObject(__ref.getField(false,"_lbl_unit").getObject());Debug.locals.put("jo", _jo);
 BA.debugLineNum = 99;BA.debugLine="jo.RunMethod(\"setIncludeFontPadding\", Array(Fals";
Debug.ShouldStop(4);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setIncludeFontPadding")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(scale.__c.getField(true,"False"))})));
 BA.debugLineNum = 100;BA.debugLine="lbl_unit.Gravity =  Bit.Or( Gravity.CENTER_HORIZ";
Debug.ShouldStop(8);
__ref.getField(false,"_lbl_unit").runMethod(true,"setGravity",scale.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(scale.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL")),(Object)(scale.__c.getField(false,"Gravity").getField(true,"TOP"))));
 BA.debugLineNum = 111;BA.debugLine="mBase.AddView( lbl_true, 0.45*mBase.Width,0.38*m";
Debug.ShouldStop(16384);
__ref.getField(false,"_mbase").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lbl_true").getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.45),__ref.getField(false,"_mbase").runMethod(true,"getWidth")}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.38),__ref.getField(false,"_mbase").runMethod(true,"getHeight")}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.10),__ref.getField(false,"_mbase").runMethod(true,"getWidth")}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.08),__ref.getField(false,"_mbase").runMethod(true,"getHeight")}, "*",0, 0))));
 BA.debugLineNum = 112;BA.debugLine="mBase.AddView( lbl_anemo, 0.42*mBase.Width,0.46*";
Debug.ShouldStop(32768);
__ref.getField(false,"_mbase").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lbl_anemo").getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.42),__ref.getField(false,"_mbase").runMethod(true,"getWidth")}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.46),__ref.getField(false,"_mbase").runMethod(true,"getHeight")}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.16),__ref.getField(false,"_mbase").runMethod(true,"getWidth")}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.12),__ref.getField(false,"_mbase").runMethod(true,"getHeight")}, "*",0, 0))));
 BA.debugLineNum = 113;BA.debugLine="mBase.AddView( lbl_unit, 0.43*mBase.Width,0.55*m";
Debug.ShouldStop(65536);
__ref.getField(false,"_mbase").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lbl_unit").getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.43),__ref.getField(false,"_mbase").runMethod(true,"getWidth")}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.55),__ref.getField(false,"_mbase").runMethod(true,"getHeight")}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.14),__ref.getField(false,"_mbase").runMethod(true,"getWidth")}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.08),__ref.getField(false,"_mbase").runMethod(true,"getHeight")}, "*",0, 0))));
 BA.debugLineNum = 125;BA.debugLine="AUTO_SIZE1(lbl_true)";
Debug.ShouldStop(268435456);
__ref.runClassMethod (com.calypsoinstruments.anemotracker.scale.class, "_auto_size1",(Object)(__ref.getField(false,"_lbl_true")));
 BA.debugLineNum = 126;BA.debugLine="AUTO_SIZE1(lbl_anemo)";
Debug.ShouldStop(536870912);
__ref.runClassMethod (com.calypsoinstruments.anemotracker.scale.class, "_auto_size1",(Object)(__ref.getField(false,"_lbl_anemo")));
 BA.debugLineNum = 127;BA.debugLine="AUTO_SIZE1(lbl_unit)";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (com.calypsoinstruments.anemotracker.scale.class, "_auto_size1",(Object)(__ref.getField(false,"_lbl_unit")));
 BA.debugLineNum = 136;BA.debugLine="rect1.Initialize(0, 0, img.Width, img.Height )'im";
Debug.ShouldStop(128);
__ref.getField(false,"_rect1").runVoidMethod ("Initialize",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_img").runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_img").runMethod(true,"getHeight")));
 BA.debugLineNum = 145;BA.debugLine="Dim ioxSVG As ioxSVG";
Debug.ShouldStop(65536);
_ioxsvg = RemoteObject.createNew ("com.iox.ioxsvg.ioxsvg");Debug.locals.put("ioxSVG", _ioxsvg);
 BA.debugLineNum = 155;BA.debugLine="ioxSVG.Initialize(\"main_screen.svg\")";
Debug.ShouldStop(67108864);
_ioxsvg.runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("main_screen.svg")));
 BA.debugLineNum = 156;BA.debugLine="bmp1.InitializeMutable(img.Width,img.Width) 'img";
Debug.ShouldStop(134217728);
__ref.getField(false,"_bmp1").runVoidMethod ("InitializeMutable",(Object)(__ref.getField(false,"_img").runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_img").runMethod(true,"getWidth")));
 BA.debugLineNum = 157;BA.debugLine="cnv1.Initialize2(bmp1)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_cnv1").runVoidMethod ("Initialize2",(Object)((__ref.getField(false,"_bmp1").getObject())));
 BA.debugLineNum = 158;BA.debugLine="ioxSVG.RenderToCanvas(cnv1)";
Debug.ShouldStop(536870912);
_ioxsvg.runVoidMethod ("_vvv4",(Object)(__ref.getField(false,"_cnv1")));
 BA.debugLineNum = 190;BA.debugLine="ioxSVG.Initialize(\"ruleta_centrada.svg\")";
Debug.ShouldStop(536870912);
_ioxsvg.runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("ruleta_centrada.svg")));
 BA.debugLineNum = 191;BA.debugLine="bmp_compass.InitializeMutable(img.Width,img.Widt";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_bmp_compass").runVoidMethod ("InitializeMutable",(Object)(__ref.getField(false,"_img").runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_img").runMethod(true,"getWidth")));
 BA.debugLineNum = 192;BA.debugLine="cnv2.Initialize2(bmp_compass)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_cnv2").runVoidMethod ("Initialize2",(Object)((__ref.getField(false,"_bmp_compass").getObject())));
 BA.debugLineNum = 193;BA.debugLine="ioxSVG.RenderToCanvas(cnv2)";
Debug.ShouldStop(1);
_ioxsvg.runVoidMethod ("_vvv4",(Object)(__ref.getField(false,"_cnv2")));
 BA.debugLineNum = 195;BA.debugLine="ioxSVG.Initialize(\"App-01.svg\")";
Debug.ShouldStop(4);
_ioxsvg.runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("App-01.svg")));
 BA.debugLineNum = 196;BA.debugLine="bmp_app.InitializeMutable(img.Width,img.Width )";
Debug.ShouldStop(8);
__ref.getField(false,"_bmp_app").runVoidMethod ("InitializeMutable",(Object)(__ref.getField(false,"_img").runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_img").runMethod(true,"getWidth")));
 BA.debugLineNum = 197;BA.debugLine="cnv2.Initialize2(bmp_app)";
Debug.ShouldStop(16);
__ref.getField(false,"_cnv2").runVoidMethod ("Initialize2",(Object)((__ref.getField(false,"_bmp_app").getObject())));
 BA.debugLineNum = 198;BA.debugLine="ioxSVG.RenderToCanvas(cnv2)";
Debug.ShouldStop(32);
_ioxsvg.runVoidMethod ("_vvv4",(Object)(__ref.getField(false,"_cnv2")));
 BA.debugLineNum = 200;BA.debugLine="ioxSVG.Initialize(\"True-01.svg\")";
Debug.ShouldStop(128);
_ioxsvg.runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("True-01.svg")));
 BA.debugLineNum = 201;BA.debugLine="bmp_true.InitializeMutable(img.Width,img.width )";
Debug.ShouldStop(256);
__ref.getField(false,"_bmp_true").runVoidMethod ("InitializeMutable",(Object)(__ref.getField(false,"_img").runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_img").runMethod(true,"getWidth")));
 BA.debugLineNum = 202;BA.debugLine="cnv2.Initialize2(bmp_true)";
Debug.ShouldStop(512);
__ref.getField(false,"_cnv2").runVoidMethod ("Initialize2",(Object)((__ref.getField(false,"_bmp_true").getObject())));
 BA.debugLineNum = 203;BA.debugLine="ioxSVG.RenderToCanvas(cnv2)";
Debug.ShouldStop(1024);
_ioxsvg.runVoidMethod ("_vvv4",(Object)(__ref.getField(false,"_cnv2")));
 BA.debugLineNum = 226;BA.debugLine="pos_actual = 0";
Debug.ShouldStop(2);
__ref.setField ("_pos_actual",BA.numberCast(int.class, 0));
 BA.debugLineNum = 227;BA.debugLine="pos_destino = 0";
Debug.ShouldStop(4);
__ref.setField ("_pos_destino",BA.numberCast(int.class, 0));
 BA.debugLineNum = 229;BA.debugLine="vel = 0";
Debug.ShouldStop(16);
__ref.setField ("_vel",BA.numberCast(int.class, 0));
 BA.debugLineNum = 230;BA.debugLine="einit=0";
Debug.ShouldStop(32);
__ref.setField ("_einit",BA.numberCast(int.class, 0));
 BA.debugLineNum = 232;BA.debugLine="Draw";
Debug.ShouldStop(128);
__ref.runClassMethod (com.calypsoinstruments.anemotracker.scale.class, "_draw");
 BA.debugLineNum = 234;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _draw(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Draw (scale) ","scale",9,__ref.getField(false, "ba"),__ref,360);
if (RapidSub.canDelegate("draw")) { return __ref.runUserSub(false, "scale","draw", __ref);}
RemoteObject _intermedio = RemoteObject.createImmutable(0f);
RemoteObject _intermedio2 = RemoteObject.createImmutable(0);
RemoteObject _angle = RemoteObject.createImmutable(0f);
 BA.debugLineNum = 360;BA.debugLine="Sub Draw '( modulo As Float, angle As Float )";
Debug.ShouldStop(128);
 BA.debugLineNum = 361;BA.debugLine="canvas.DrawColor( Colors.Transparent)";
Debug.ShouldStop(256);
__ref.getField(false,"_canvas").runVoidMethod ("DrawColor",(Object)(scale.__c.getField(false,"Colors").getField(true,"Transparent")));
 BA.debugLineNum = 363;BA.debugLine="canvas.DrawBitmap( bmp1, Null, rect1 )";
Debug.ShouldStop(1024);
__ref.getField(false,"_canvas").runVoidMethod ("DrawBitmap",(Object)((__ref.getField(false,"_bmp1").getObject())),(Object)((scale.__c.getField(false,"Null"))),(Object)((__ref.getField(false,"_rect1").getObject())));
 BA.debugLineNum = 365;BA.debugLine="canvas.DrawBitmapRotated( bmp_compass,Null,rect1";
Debug.ShouldStop(4096);
__ref.getField(false,"_canvas").runVoidMethod ("DrawBitmapRotated",(Object)((__ref.getField(false,"_bmp_compass").getObject())),(Object)((scale.__c.getField(false,"Null"))),(Object)((__ref.getField(false,"_rect1").getObject())),(Object)(scale._starter._calcs_1.getField(true,"_speed_bearing")));
 BA.debugLineNum = 375;BA.debugLine="Dim intermedio = ATan2D( ya_actual, xa_actual) As";
Debug.ShouldStop(4194304);
_intermedio = BA.numberCast(float.class, scale.__c.runMethod(true,"ATan2D",(Object)(BA.numberCast(double.class, __ref.getField(true,"_ya_actual"))),(Object)(BA.numberCast(double.class, __ref.getField(true,"_xa_actual")))));Debug.locals.put("intermedio", _intermedio);Debug.locals.put("intermedio", _intermedio);
 BA.debugLineNum = 376;BA.debugLine="Dim intermedio2 = 360+intermedio As Int";
Debug.ShouldStop(8388608);
_intermedio2 = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(360),_intermedio}, "+",1, 0));Debug.locals.put("intermedio2", _intermedio2);Debug.locals.put("intermedio2", _intermedio2);
 BA.debugLineNum = 377;BA.debugLine="Dim angle = intermedio2 Mod 360 As Float";
Debug.ShouldStop(16777216);
_angle = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_intermedio2,RemoteObject.createImmutable(360)}, "%",0, 1));Debug.locals.put("angle", _angle);Debug.locals.put("angle", _angle);
 BA.debugLineNum = 379;BA.debugLine="canvas.DrawBitmapRotated( bmp_app,Null , rect1,";
Debug.ShouldStop(67108864);
__ref.getField(false,"_canvas").runVoidMethod ("DrawBitmapRotated",(Object)((__ref.getField(false,"_bmp_app").getObject())),(Object)((scale.__c.getField(false,"Null"))),(Object)((__ref.getField(false,"_rect1").getObject())),(Object)(_angle));
 BA.debugLineNum = 384;BA.debugLine="intermedio = ATan2D( yt_actual, xt_actual)";
Debug.ShouldStop(-2147483648);
_intermedio = BA.numberCast(float.class, scale.__c.runMethod(true,"ATan2D",(Object)(BA.numberCast(double.class, __ref.getField(true,"_yt_actual"))),(Object)(BA.numberCast(double.class, __ref.getField(true,"_xt_actual")))));Debug.locals.put("intermedio", _intermedio);
 BA.debugLineNum = 385;BA.debugLine="intermedio2 = 360+intermedio";
Debug.ShouldStop(1);
_intermedio2 = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(360),_intermedio}, "+",1, 0));Debug.locals.put("intermedio2", _intermedio2);
 BA.debugLineNum = 386;BA.debugLine="angle = intermedio2 Mod 360";
Debug.ShouldStop(2);
_angle = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_intermedio2,RemoteObject.createImmutable(360)}, "%",0, 1));Debug.locals.put("angle", _angle);
 BA.debugLineNum = 388;BA.debugLine="canvas.DrawBitmapRotated( bmp_true, Null, rect1,";
Debug.ShouldStop(8);
__ref.getField(false,"_canvas").runVoidMethod ("DrawBitmapRotated",(Object)((__ref.getField(false,"_bmp_true").getObject())),(Object)((scale.__c.getField(false,"Null"))),(Object)((__ref.getField(false,"_rect1").getObject())),(Object)(_angle));
 BA.debugLineNum = 393;BA.debugLine="If wind_true Then";
Debug.ShouldStop(256);
if (__ref.getField(true,"_wind_true").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 394;BA.debugLine="lbl_true.text = \"true\"";
Debug.ShouldStop(512);
__ref.getField(false,"_lbl_true").runMethod(true,"setText",BA.ObjectToCharSequence("true"));
 BA.debugLineNum = 396;BA.debugLine="lbl_anemo.text = NumberFormat2( Starter.calcs_1";
Debug.ShouldStop(2048);
__ref.getField(false,"_lbl_anemo").runMethod(true,"setText",BA.ObjectToCharSequence(scale.__c.runMethod(true,"NumberFormat2",(Object)(RemoteObject.solve(new RemoteObject[] {scale._starter._calcs_1.getField(true,"_twm"),RemoteObject.createImmutable(3600),RemoteObject.createImmutable(1852)}, "*/",0, 0)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 1)),(Object)(scale.__c.getField(true,"False")))));
 }else {
 BA.debugLineNum = 402;BA.debugLine="lbl_true.text = \"app\"";
Debug.ShouldStop(131072);
__ref.getField(false,"_lbl_true").runMethod(true,"setText",BA.ObjectToCharSequence("app"));
 BA.debugLineNum = 404;BA.debugLine="lbl_anemo.text = NumberFormat2( Starter.calcs_1";
Debug.ShouldStop(524288);
__ref.getField(false,"_lbl_anemo").runMethod(true,"setText",BA.ObjectToCharSequence(scale.__c.runMethod(true,"NumberFormat2",(Object)(RemoteObject.solve(new RemoteObject[] {scale._starter._calcs_1.getField(true,"_awm"),RemoteObject.createImmutable(3600),RemoteObject.createImmutable(1852)}, "*/",0, 0)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 1)),(Object)(scale.__c.getField(true,"False")))));
 };
 BA.debugLineNum = 413;BA.debugLine="img.Invalidate";
Debug.ShouldStop(268435456);
__ref.getField(false,"_img").runVoidMethod ("Invalidate");
 BA.debugLineNum = 421;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("GetBase (scale) ","scale",9,__ref.getField(false, "ba"),__ref,256);
if (RapidSub.canDelegate("getbase")) { return __ref.runUserSub(false, "scale","getbase", __ref);}
 BA.debugLineNum = 256;BA.debugLine="Public Sub GetBase As Panel";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 257;BA.debugLine="Return mBase";
Debug.ShouldStop(1);
if (true) return __ref.getField(false,"_mbase");
 BA.debugLineNum = 258;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("Initialize (scale) ","scale",9,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "scale","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _mea = RemoteObject.createImmutable(0f);
RemoteObject _q = RemoteObject.createImmutable(0f);
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 35;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(8);
__ref.setField ("_meventname",_eventname);
 BA.debugLineNum = 37;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(16);
__ref.setField ("_mcallback",_callback);
 BA.debugLineNum = 38;BA.debugLine="Dim mea =0.003, q = 0.003 As Float";
Debug.ShouldStop(32);
_mea = BA.numberCast(float.class, 0.003);Debug.locals.put("mea", _mea);Debug.locals.put("mea", _mea);
_q = BA.numberCast(float.class, 0.003);Debug.locals.put("q", _q);Debug.locals.put("q", _q);
 BA.debugLineNum = 39;BA.debugLine="kX.err_measure = mea";
Debug.ShouldStop(64);
__ref.getField(false,"_kx").setField ("err_measure",_mea);
 BA.debugLineNum = 40;BA.debugLine="kX.err_estimate =  0.002 'mea*refresh_hz 'no pued";
Debug.ShouldStop(128);
__ref.getField(false,"_kx").setField ("err_estimate",BA.numberCast(float.class, 0.002));
 BA.debugLineNum = 41;BA.debugLine="kX.q = q";
Debug.ShouldStop(256);
__ref.getField(false,"_kx").setField ("q",_q);
 BA.debugLineNum = 42;BA.debugLine="kY.err_measure = mea";
Debug.ShouldStop(512);
__ref.getField(false,"_ky").setField ("err_measure",_mea);
 BA.debugLineNum = 43;BA.debugLine="kY.err_estimate = 0.002 'mea*refresh_hz";
Debug.ShouldStop(1024);
__ref.getField(false,"_ky").setField ("err_estimate",BA.numberCast(float.class, 0.002));
 BA.debugLineNum = 44;BA.debugLine="kY.q = q";
Debug.ShouldStop(2048);
__ref.getField(false,"_ky").setField ("q",_q);
 BA.debugLineNum = 45;BA.debugLine="kXa = kX";
Debug.ShouldStop(4096);
__ref.setField ("_kxa",__ref.getField(false,"_kx"));
 BA.debugLineNum = 46;BA.debugLine="kYa = kY";
Debug.ShouldStop(8192);
__ref.setField ("_kya",__ref.getField(false,"_ky"));
 BA.debugLineNum = 47;BA.debugLine="kXt = kX";
Debug.ShouldStop(16384);
__ref.setField ("_kxt",__ref.getField(false,"_kx"));
 BA.debugLineNum = 48;BA.debugLine="kYt = kY";
Debug.ShouldStop(32768);
__ref.setField ("_kyt",__ref.getField(false,"_ky"));
 BA.debugLineNum = 49;BA.debugLine="tUpdate.Initialize( \"tUpdate\", 300)";
Debug.ShouldStop(65536);
__ref.getField(false,"_tupdate").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("tUpdate")),(Object)(BA.numberCast(long.class, 300)));
 BA.debugLineNum = 50;BA.debugLine="Dim bmp As Bitmap";
Debug.ShouldStop(131072);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 52;BA.debugLine="bmp.InitializeMutable(1,1) 'ignore";
Debug.ShouldStop(524288);
_bmp.runVoidMethod ("InitializeMutable",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 53;BA.debugLine="cvs.Initialize2(bmp)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_cvs").runVoidMethod ("Initialize2",(Object)((_bmp.getObject())));
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _panel1_longclick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Panel1_LongClick (scale) ","scale",9,__ref.getField(false, "ba"),__ref,423);
if (RapidSub.canDelegate("panel1_longclick")) { return __ref.runUserSub(false, "scale","panel1_longclick", __ref);}
 BA.debugLineNum = 423;BA.debugLine="Sub Panel1_LongClick";
Debug.ShouldStop(64);
 BA.debugLineNum = 425;BA.debugLine="If SubExists(mCallBack, mEventName & \"_LongClick";
Debug.ShouldStop(256);
if (scale.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_LongClick")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 426;BA.debugLine="CallSub( mCallBack, mEventName & \"_LongClick\" )";
Debug.ShouldStop(512);
scale.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_LongClick"))));
 };
 BA.debugLineNum = 434;BA.debugLine="wind_true = Not( wind_true )";
Debug.ShouldStop(131072);
__ref.setField ("_wind_true",scale.__c.runMethod(true,"Not",(Object)(__ref.getField(true,"_wind_true"))));
 BA.debugLineNum = 436;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pause(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Pause (scale) ","scale",9,__ref.getField(false, "ba"),__ref,260);
if (RapidSub.canDelegate("pause")) { return __ref.runUserSub(false, "scale","pause", __ref);}
 BA.debugLineNum = 260;BA.debugLine="Public Sub Pause";
Debug.ShouldStop(8);
 BA.debugLineNum = 261;BA.debugLine="tUpdate.Enabled = False";
Debug.ShouldStop(16);
__ref.getField(false,"_tupdate").runMethod(true,"setEnabled",scale.__c.getField(true,"False"));
 BA.debugLineNum = 262;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tupdate_tick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("tUpdate_Tick (scale) ","scale",9,__ref.getField(false, "ba"),__ref,298);
if (RapidSub.canDelegate("tupdate_tick")) { return __ref.runUserSub(false, "scale","tupdate_tick", __ref);}
 BA.debugLineNum = 298;BA.debugLine="Sub tUpdate_Tick";
Debug.ShouldStop(512);
 BA.debugLineNum = 299;BA.debugLine="xa_actual = updateEstimate( xa_destino, kXa )";
Debug.ShouldStop(1024);
__ref.setField ("_xa_actual",__ref.runClassMethod (com.calypsoinstruments.anemotracker.scale.class, "_updateestimate",(Object)(__ref.getField(true,"_xa_destino")),(Object)(__ref.getField(false,"_kxa"))));
 BA.debugLineNum = 300;BA.debugLine="ya_actual = updateEstimate( ya_destino, kYa )";
Debug.ShouldStop(2048);
__ref.setField ("_ya_actual",__ref.runClassMethod (com.calypsoinstruments.anemotracker.scale.class, "_updateestimate",(Object)(__ref.getField(true,"_ya_destino")),(Object)(__ref.getField(false,"_kya"))));
 BA.debugLineNum = 301;BA.debugLine="xt_actual = updateEstimate( xt_destino, kXt )";
Debug.ShouldStop(4096);
__ref.setField ("_xt_actual",__ref.runClassMethod (com.calypsoinstruments.anemotracker.scale.class, "_updateestimate",(Object)(__ref.getField(true,"_xt_destino")),(Object)(__ref.getField(false,"_kxt"))));
 BA.debugLineNum = 302;BA.debugLine="yt_actual = updateEstimate( yt_destino, kYt )";
Debug.ShouldStop(8192);
__ref.setField ("_yt_actual",__ref.runClassMethod (com.calypsoinstruments.anemotracker.scale.class, "_updateestimate",(Object)(__ref.getField(true,"_yt_destino")),(Object)(__ref.getField(false,"_kyt"))));
 BA.debugLineNum = 303;BA.debugLine="Draw";
Debug.ShouldStop(16384);
__ref.runClassMethod (com.calypsoinstruments.anemotracker.scale.class, "_draw");
 BA.debugLineNum = 304;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tupdate_tick_back(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("tUpdate_Tick_back (scale) ","scale",9,__ref.getField(false, "ba"),__ref,316);
if (RapidSub.canDelegate("tupdate_tick_back")) { return __ref.runUserSub(false, "scale","tupdate_tick_back", __ref);}
RemoteObject _accel = RemoteObject.createImmutable(0f);
RemoteObject _error_x = RemoteObject.createImmutable(0f);
RemoteObject _error_y = RemoteObject.createImmutable(0f);
 BA.debugLineNum = 316;BA.debugLine="Sub tUpdate_Tick_back";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 317;BA.debugLine="Dim accel As Float";
Debug.ShouldStop(268435456);
_accel = RemoteObject.createImmutable(0f);Debug.locals.put("accel", _accel);
 BA.debugLineNum = 318;BA.debugLine="Dim error_x, error_y As Float";
Debug.ShouldStop(536870912);
_error_x = RemoteObject.createImmutable(0f);Debug.locals.put("error_x", _error_x);
_error_y = RemoteObject.createImmutable(0f);Debug.locals.put("error_y", _error_y);
 BA.debugLineNum = 320;BA.debugLine="error_x = x_destino - x_actual";
Debug.ShouldStop(-2147483648);
_error_x = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_x_destino"),__ref.getField(true,"_x_actual")}, "-",1, 0));Debug.locals.put("error_x", _error_x);
 BA.debugLineNum = 321;BA.debugLine="If Abs(error_x) >0 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(">",scale.__c.runMethod(true,"Abs",(Object)(BA.numberCast(double.class, _error_x))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 322;BA.debugLine="If Abs(error_x) > Abs(einit1/2) Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",scale.__c.runMethod(true,"Abs",(Object)(BA.numberCast(double.class, _error_x))),scale.__c.runMethod(true,"Abs",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_einit1"),RemoteObject.createImmutable(2)}, "/",0, 0))))) { 
 BA.debugLineNum = 323;BA.debugLine="accel = error_x*Abs(einit1/500)/Abs(error_x)";
Debug.ShouldStop(4);
_accel = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_error_x,scale.__c.runMethod(true,"Abs",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_einit1"),RemoteObject.createImmutable(500)}, "/",0, 0))),scale.__c.runMethod(true,"Abs",(Object)(BA.numberCast(double.class, _error_x)))}, "*/",0, 0));Debug.locals.put("accel", _accel);
 }else {
 BA.debugLineNum = 325;BA.debugLine="accel = -error_x*Abs(einit1/500)/Abs(error_x)";
Debug.ShouldStop(16);
_accel = BA.numberCast(float.class, -(double) (0 + _error_x.<Float>get().floatValue())*scale.__c.runMethod(true,"Abs",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_einit1"),RemoteObject.createImmutable(500)}, "/",0, 0))).<Double>get().doubleValue()/(double)scale.__c.runMethod(true,"Abs",(Object)(BA.numberCast(double.class, _error_x))).<Double>get().doubleValue());Debug.locals.put("accel", _accel);
 };
 BA.debugLineNum = 327;BA.debugLine="If Abs(error_x) > 0.01 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(">",scale.__c.runMethod(true,"Abs",(Object)(BA.numberCast(double.class, _error_x))),BA.numberCast(double.class, 0.01))) { 
 BA.debugLineNum = 328;BA.debugLine="x_vel = x_vel + accel";
Debug.ShouldStop(128);
__ref.setField ("_x_vel",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_x_vel"),_accel}, "+",1, 0)));
 };
 BA.debugLineNum = 330;BA.debugLine="If Abs(x_vel) > Abs(error_x) Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean(">",scale.__c.runMethod(true,"Abs",(Object)(BA.numberCast(double.class, __ref.getField(true,"_x_vel")))),scale.__c.runMethod(true,"Abs",(Object)(BA.numberCast(double.class, _error_x))))) { 
 BA.debugLineNum = 331;BA.debugLine="x_actual = x_destino";
Debug.ShouldStop(1024);
__ref.setField ("_x_actual",__ref.getField(true,"_x_destino"));
 BA.debugLineNum = 332;BA.debugLine="x_vel = 0";
Debug.ShouldStop(2048);
__ref.setField ("_x_vel",BA.numberCast(float.class, 0));
 }else {
 BA.debugLineNum = 334;BA.debugLine="x_actual = x_actual + x_vel";
Debug.ShouldStop(8192);
__ref.setField ("_x_actual",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_x_actual"),__ref.getField(true,"_x_vel")}, "+",1, 0)));
 };
 };
 BA.debugLineNum = 338;BA.debugLine="error_y = y_destino - y_actual";
Debug.ShouldStop(131072);
_error_y = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_y_destino"),__ref.getField(true,"_y_actual")}, "-",1, 0));Debug.locals.put("error_y", _error_y);
 BA.debugLineNum = 339;BA.debugLine="If Abs(error_y) > 0 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(">",scale.__c.runMethod(true,"Abs",(Object)(BA.numberCast(double.class, _error_y))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 340;BA.debugLine="If Abs(error_y) > Abs(einit2/2) Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean(">",scale.__c.runMethod(true,"Abs",(Object)(BA.numberCast(double.class, _error_y))),scale.__c.runMethod(true,"Abs",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_einit2"),RemoteObject.createImmutable(2)}, "/",0, 0))))) { 
 BA.debugLineNum = 341;BA.debugLine="accel = error_y*Abs(einit2/500)/Abs(error_y)";
Debug.ShouldStop(1048576);
_accel = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_error_y,scale.__c.runMethod(true,"Abs",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_einit2"),RemoteObject.createImmutable(500)}, "/",0, 0))),scale.__c.runMethod(true,"Abs",(Object)(BA.numberCast(double.class, _error_y)))}, "*/",0, 0));Debug.locals.put("accel", _accel);
 }else {
 BA.debugLineNum = 343;BA.debugLine="accel = -error_y*Abs(einit2/500)/Abs(error_y)";
Debug.ShouldStop(4194304);
_accel = BA.numberCast(float.class, -(double) (0 + _error_y.<Float>get().floatValue())*scale.__c.runMethod(true,"Abs",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_einit2"),RemoteObject.createImmutable(500)}, "/",0, 0))).<Double>get().doubleValue()/(double)scale.__c.runMethod(true,"Abs",(Object)(BA.numberCast(double.class, _error_y))).<Double>get().doubleValue());Debug.locals.put("accel", _accel);
 };
 BA.debugLineNum = 345;BA.debugLine="If Abs(error_y) > 0.01 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean(">",scale.__c.runMethod(true,"Abs",(Object)(BA.numberCast(double.class, _error_y))),BA.numberCast(double.class, 0.01))) { 
 BA.debugLineNum = 346;BA.debugLine="y_vel = y_vel + accel";
Debug.ShouldStop(33554432);
__ref.setField ("_y_vel",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_y_vel"),_accel}, "+",1, 0)));
 };
 BA.debugLineNum = 348;BA.debugLine="If Abs(y_vel) > Abs(error_y) Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean(">",scale.__c.runMethod(true,"Abs",(Object)(BA.numberCast(double.class, __ref.getField(true,"_y_vel")))),scale.__c.runMethod(true,"Abs",(Object)(BA.numberCast(double.class, _error_y))))) { 
 BA.debugLineNum = 349;BA.debugLine="y_actual = y_destino";
Debug.ShouldStop(268435456);
__ref.setField ("_y_actual",__ref.getField(true,"_y_destino"));
 BA.debugLineNum = 350;BA.debugLine="y_vel = 0";
Debug.ShouldStop(536870912);
__ref.setField ("_y_vel",BA.numberCast(float.class, 0));
 }else {
 BA.debugLineNum = 352;BA.debugLine="y_actual = y_actual + y_vel";
Debug.ShouldStop(-2147483648);
__ref.setField ("_y_actual",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_y_actual"),__ref.getField(true,"_y_vel")}, "+",1, 0)));
 };
 };
 BA.debugLineNum = 357;BA.debugLine="Draw '( pos_actual )";
Debug.ShouldStop(16);
__ref.runClassMethod (com.calypsoinstruments.anemotracker.scale.class, "_draw");
 BA.debugLineNum = 358;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("Update (scale) ","scale",9,__ref.getField(false, "ba"),__ref,263);
if (RapidSub.canDelegate("update")) { return __ref.runUserSub(false, "scale","update", __ref, _selected);}
Debug.locals.put("selected", _selected);
 BA.debugLineNum = 263;BA.debugLine="Public Sub Update( selected As Boolean )";
Debug.ShouldStop(64);
 BA.debugLineNum = 264;BA.debugLine="If selected Then";
Debug.ShouldStop(128);
if (_selected.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 265;BA.debugLine="xa_actual = xa_destino";
Debug.ShouldStop(256);
__ref.setField ("_xa_actual",__ref.getField(true,"_xa_destino"));
 BA.debugLineNum = 266;BA.debugLine="ya_actual = ya_destino";
Debug.ShouldStop(512);
__ref.setField ("_ya_actual",__ref.getField(true,"_ya_destino"));
 BA.debugLineNum = 267;BA.debugLine="xt_actual = xt_destino";
Debug.ShouldStop(1024);
__ref.setField ("_xt_actual",__ref.getField(true,"_xt_destino"));
 BA.debugLineNum = 268;BA.debugLine="yt_actual = yt_destino";
Debug.ShouldStop(2048);
__ref.setField ("_yt_actual",__ref.getField(true,"_yt_destino"));
 };
 BA.debugLineNum = 272;BA.debugLine="pos_destino = Starter.calcs_1.awa";
Debug.ShouldStop(32768);
__ref.setField ("_pos_destino",BA.numberCast(int.class, scale._starter._calcs_1.getField(true,"_awa")));
 BA.debugLineNum = 274;BA.debugLine="xa_destino = CosD( Starter.calcs_1.awa ) 'Starte";
Debug.ShouldStop(131072);
__ref.setField ("_xa_destino",BA.numberCast(float.class, scale.__c.runMethod(true,"CosD",(Object)(BA.numberCast(double.class, scale._starter._calcs_1.getField(true,"_awa"))))));
 BA.debugLineNum = 275;BA.debugLine="ya_destino = SinD( Starter.calcs_1.awa ) 'Starte";
Debug.ShouldStop(262144);
__ref.setField ("_ya_destino",BA.numberCast(float.class, scale.__c.runMethod(true,"SinD",(Object)(BA.numberCast(double.class, scale._starter._calcs_1.getField(true,"_awa"))))));
 BA.debugLineNum = 276;BA.debugLine="xt_destino = CosD( Starter.calcs_1.twa ) 'Starte";
Debug.ShouldStop(524288);
__ref.setField ("_xt_destino",BA.numberCast(float.class, scale.__c.runMethod(true,"CosD",(Object)(BA.numberCast(double.class, scale._starter._calcs_1.getField(true,"_twa"))))));
 BA.debugLineNum = 277;BA.debugLine="yt_destino = SinD( Starter.calcs_1.twa ) 'Starte";
Debug.ShouldStop(1048576);
__ref.setField ("_yt_destino",BA.numberCast(float.class, scale.__c.runMethod(true,"SinD",(Object)(BA.numberCast(double.class, scale._starter._calcs_1.getField(true,"_twa"))))));
 BA.debugLineNum = 287;BA.debugLine="einit1 = x_destino - x_actual";
Debug.ShouldStop(1073741824);
__ref.setField ("_einit1",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_x_destino"),__ref.getField(true,"_x_actual")}, "-",1, 0)));
 BA.debugLineNum = 288;BA.debugLine="einit2 = y_destino - y_actual";
Debug.ShouldStop(-2147483648);
__ref.setField ("_einit2",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_y_destino"),__ref.getField(true,"_y_actual")}, "-",1, 0)));
 BA.debugLineNum = 291;BA.debugLine="tUpdate.Enabled = True";
Debug.ShouldStop(4);
__ref.getField(false,"_tupdate").runMethod(true,"setEnabled",scale.__c.getField(true,"True"));
 BA.debugLineNum = 295;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updateestimate(RemoteObject __ref,RemoteObject _mea,RemoteObject _k) throws Exception{
try {
		Debug.PushSubsStack("updateEstimate (scale) ","scale",9,__ref.getField(false, "ba"),__ref,306);
if (RapidSub.canDelegate("updateestimate")) { return __ref.runUserSub(false, "scale","updateestimate", __ref, _mea, _k);}
Debug.locals.put("mea", _mea);
Debug.locals.put("k", _k);
 BA.debugLineNum = 306;BA.debugLine="Sub updateEstimate(mea As Float, k As tKalman) As";
Debug.ShouldStop(131072);
 BA.debugLineNum = 308;BA.debugLine="k.kalman_gain = k.err_estimate/(k.err_estimate +";
Debug.ShouldStop(524288);
_k.setField ("kalman_gain",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_k.getField(true,"err_estimate"),(RemoteObject.solve(new RemoteObject[] {_k.getField(true,"err_estimate"),_k.getField(true,"err_measure")}, "+",1, 0))}, "/",0, 0)));
 BA.debugLineNum = 309;BA.debugLine="k.current_estimate = k.last_estimate + k.kalman_g";
Debug.ShouldStop(1048576);
_k.setField ("current_estimate",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_k.getField(true,"last_estimate"),_k.getField(true,"kalman_gain"),(RemoteObject.solve(new RemoteObject[] {_mea,_k.getField(true,"last_estimate")}, "-",1, 0))}, "+*",1, 0)));
 BA.debugLineNum = 310;BA.debugLine="k.err_estimate =  (1.0 - k.kalman_gain)*k.err_est";
Debug.ShouldStop(2097152);
_k.setField ("err_estimate",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1.0),_k.getField(true,"kalman_gain")}, "-",1, 0)),_k.getField(true,"err_estimate"),scale.__c.runMethod(true,"Abs",(Object)(RemoteObject.solve(new RemoteObject[] {_k.getField(true,"last_estimate"),_k.getField(true,"current_estimate")}, "-",1, 0))),_k.getField(true,"q")}, "*+*",1, 0)));
 BA.debugLineNum = 311;BA.debugLine="k.last_estimate=k.current_estimate";
Debug.ShouldStop(4194304);
_k.setField ("last_estimate",_k.getField(true,"current_estimate"));
 BA.debugLineNum = 313;BA.debugLine="Return k.current_estimate";
Debug.ShouldStop(16777216);
if (true) return _k.getField(true,"current_estimate");
 BA.debugLineNum = 314;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}