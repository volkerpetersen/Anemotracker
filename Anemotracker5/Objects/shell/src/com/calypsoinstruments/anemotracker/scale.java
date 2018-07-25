
package com.calypsoinstruments.anemotracker;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class scale {
    public static RemoteObject myClass;
	public scale() {
	}
    public static PCBA staticBA = new PCBA(null, scale.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _defaultcolorconstant = RemoteObject.createImmutable(0);
public static RemoteObject _lbl_anemo = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_unit = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_true = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _back = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _img = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _canvas = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
public static RemoteObject _cnv1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
public static RemoteObject _cnv2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
public static RemoteObject _cnv3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
public static RemoteObject _bmp1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
public static RemoteObject _bmp2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
public static RemoteObject _bmp3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
public static RemoteObject _bmp_compass = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
public static RemoteObject _bmp_true = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
public static RemoteObject _bmp_app = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
public static RemoteObject _rect1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");
public static RemoteObject _rect2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");
public static RemoteObject _i = RemoteObject.createImmutable(0);
public static RemoteObject _pos_actual = RemoteObject.createImmutable(0);
public static RemoteObject _pos_destino = RemoteObject.createImmutable(0);
public static RemoteObject _error = RemoteObject.createImmutable(0);
public static RemoteObject _vel = RemoteObject.createImmutable(0);
public static RemoteObject _einit = RemoteObject.createImmutable(0);
public static RemoteObject _x_actual = RemoteObject.createImmutable(0f);
public static RemoteObject _y_actual = RemoteObject.createImmutable(0f);
public static RemoteObject _x_destino = RemoteObject.createImmutable(0f);
public static RemoteObject _y_destino = RemoteObject.createImmutable(0f);
public static RemoteObject _x_vel = RemoteObject.createImmutable(0f);
public static RemoteObject _y_vel = RemoteObject.createImmutable(0f);
public static RemoteObject _xa_actual = RemoteObject.createImmutable(0f);
public static RemoteObject _ya_actual = RemoteObject.createImmutable(0f);
public static RemoteObject _xa_destino = RemoteObject.createImmutable(0f);
public static RemoteObject _ya_destino = RemoteObject.createImmutable(0f);
public static RemoteObject _xa_vel = RemoteObject.createImmutable(0f);
public static RemoteObject _ya_vel = RemoteObject.createImmutable(0f);
public static RemoteObject _xt_actual = RemoteObject.createImmutable(0f);
public static RemoteObject _yt_actual = RemoteObject.createImmutable(0f);
public static RemoteObject _xt_destino = RemoteObject.createImmutable(0f);
public static RemoteObject _yt_destino = RemoteObject.createImmutable(0f);
public static RemoteObject _xt_vel = RemoteObject.createImmutable(0f);
public static RemoteObject _yt_vel = RemoteObject.createImmutable(0f);
public static RemoteObject _einit1 = RemoteObject.createImmutable(0f);
public static RemoteObject _einit2 = RemoteObject.createImmutable(0f);
public static RemoteObject _tupdate = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _wind_true = RemoteObject.createImmutable(false);
public static RemoteObject _kx = RemoteObject.declareNull("com.calypsoinstruments.anemotracker.windcalcs._tkalman");
public static RemoteObject _ky = RemoteObject.declareNull("com.calypsoinstruments.anemotracker.windcalcs._tkalman");
public static RemoteObject _kxa = RemoteObject.declareNull("com.calypsoinstruments.anemotracker.windcalcs._tkalman");
public static RemoteObject _kya = RemoteObject.declareNull("com.calypsoinstruments.anemotracker.windcalcs._tkalman");
public static RemoteObject _kxt = RemoteObject.declareNull("com.calypsoinstruments.anemotracker.windcalcs._tkalman");
public static RemoteObject _kyt = RemoteObject.declareNull("com.calypsoinstruments.anemotracker.windcalcs._tkalman");
public static RemoteObject _cvs = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
public static com.calypsoinstruments.anemotracker.main _main = null;
public static com.calypsoinstruments.anemotracker.actble _actble = null;
public static com.calypsoinstruments.anemotracker.actlisttracks _actlisttracks = null;
public static com.calypsoinstruments.anemotracker.actnavigation _actnavigation = null;
public static com.calypsoinstruments.anemotracker.acttcpip _acttcpip = null;
public static com.calypsoinstruments.anemotracker.starter _starter = null;
public static com.calypsoinstruments.anemotracker.dbutils _dbutils = null;
public static com.calypsoinstruments.anemotracker.actcalcomp _actcalcomp = null;
public static com.calypsoinstruments.anemotracker.actdevinfo _actdevinfo = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"back",_ref.getField(false, "_back"),"bmp_app",_ref.getField(false, "_bmp_app"),"bmp_compass",_ref.getField(false, "_bmp_compass"),"bmp_true",_ref.getField(false, "_bmp_true"),"bmp1",_ref.getField(false, "_bmp1"),"bmp2",_ref.getField(false, "_bmp2"),"bmp3",_ref.getField(false, "_bmp3"),"canvas",_ref.getField(false, "_canvas"),"cnv1",_ref.getField(false, "_cnv1"),"cnv2",_ref.getField(false, "_cnv2"),"cnv3",_ref.getField(false, "_cnv3"),"cvs",_ref.getField(false, "_cvs"),"DefaultColorConstant",_ref.getField(false, "_defaultcolorconstant"),"einit",_ref.getField(false, "_einit"),"einit1",_ref.getField(false, "_einit1"),"einit2",_ref.getField(false, "_einit2"),"error",_ref.getField(false, "_error"),"i",_ref.getField(false, "_i"),"img",_ref.getField(false, "_img"),"kX",_ref.getField(false, "_kx"),"kXa",_ref.getField(false, "_kxa"),"kXt",_ref.getField(false, "_kxt"),"kY",_ref.getField(false, "_ky"),"kYa",_ref.getField(false, "_kya"),"kYt",_ref.getField(false, "_kyt"),"lbl_anemo",_ref.getField(false, "_lbl_anemo"),"lbl_true",_ref.getField(false, "_lbl_true"),"lbl_unit",_ref.getField(false, "_lbl_unit"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname"),"pos_actual",_ref.getField(false, "_pos_actual"),"pos_destino",_ref.getField(false, "_pos_destino"),"rect1",_ref.getField(false, "_rect1"),"rect2",_ref.getField(false, "_rect2"),"tUpdate",_ref.getField(false, "_tupdate"),"vel",_ref.getField(false, "_vel"),"wind_true",_ref.getField(false, "_wind_true"),"x_actual",_ref.getField(false, "_x_actual"),"x_destino",_ref.getField(false, "_x_destino"),"x_vel",_ref.getField(false, "_x_vel"),"xa_actual",_ref.getField(false, "_xa_actual"),"xa_destino",_ref.getField(false, "_xa_destino"),"xa_vel",_ref.getField(false, "_xa_vel"),"xt_actual",_ref.getField(false, "_xt_actual"),"xt_destino",_ref.getField(false, "_xt_destino"),"xt_vel",_ref.getField(false, "_xt_vel"),"y_actual",_ref.getField(false, "_y_actual"),"y_destino",_ref.getField(false, "_y_destino"),"y_vel",_ref.getField(false, "_y_vel"),"ya_actual",_ref.getField(false, "_ya_actual"),"ya_destino",_ref.getField(false, "_ya_destino"),"ya_vel",_ref.getField(false, "_ya_vel"),"yt_actual",_ref.getField(false, "_yt_actual"),"yt_destino",_ref.getField(false, "_yt_destino"),"yt_vel",_ref.getField(false, "_yt_vel")};
}
}