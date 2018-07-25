package com.calypsoinstruments.anemotracker;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class scale extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "com.calypsoinstruments.anemotracker.scale");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.calypsoinstruments.anemotracker.scale.class).invoke(this, new Object[] {null});
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
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.PanelWrapper _mbase = null;
public int _defaultcolorconstant = 0;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_anemo = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_unit = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_true = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _back = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _img = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper _canvas = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper _cnv1 = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper _cnv2 = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper _cnv3 = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp1 = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp2 = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp3 = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp_compass = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp_true = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp_app = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper _rect1 = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper _rect2 = null;
public int _i = 0;
public int _pos_actual = 0;
public int _pos_destino = 0;
public int _error = 0;
public int _vel = 0;
public int _einit = 0;
public float _x_actual = 0f;
public float _y_actual = 0f;
public float _x_destino = 0f;
public float _y_destino = 0f;
public float _x_vel = 0f;
public float _y_vel = 0f;
public float _xa_actual = 0f;
public float _ya_actual = 0f;
public float _xa_destino = 0f;
public float _ya_destino = 0f;
public float _xa_vel = 0f;
public float _ya_vel = 0f;
public float _xt_actual = 0f;
public float _yt_actual = 0f;
public float _xt_destino = 0f;
public float _yt_destino = 0f;
public float _xt_vel = 0f;
public float _yt_vel = 0f;
public float _einit1 = 0f;
public float _einit2 = 0f;
public anywheresoftware.b4a.objects.Timer _tupdate = null;
public boolean _wind_true = false;
public com.calypsoinstruments.anemotracker.windcalcs._tkalman _kx = null;
public com.calypsoinstruments.anemotracker.windcalcs._tkalman _ky = null;
public com.calypsoinstruments.anemotracker.windcalcs._tkalman _kxa = null;
public com.calypsoinstruments.anemotracker.windcalcs._tkalman _kya = null;
public com.calypsoinstruments.anemotracker.windcalcs._tkalman _kxt = null;
public com.calypsoinstruments.anemotracker.windcalcs._tkalman _kyt = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper _cvs = null;
public com.calypsoinstruments.anemotracker.main _main = null;
public com.calypsoinstruments.anemotracker.actble _actble = null;
public com.calypsoinstruments.anemotracker.actlisttracks _actlisttracks = null;
public com.calypsoinstruments.anemotracker.actnavigation _actnavigation = null;
public com.calypsoinstruments.anemotracker.acttcpip _acttcpip = null;
public com.calypsoinstruments.anemotracker.starter _starter = null;
public com.calypsoinstruments.anemotracker.dbutils _dbutils = null;
public com.calypsoinstruments.anemotracker.actcalcomp _actcalcomp = null;
public com.calypsoinstruments.anemotracker.actdevinfo _actdevinfo = null;
public anywheresoftware.b4a.objects.PanelWrapper  _getbase(com.calypsoinstruments.anemotracker.scale __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="scale";
if (Debug.shouldDelegate(ba, "getbase"))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "getbase", null));}
RDebugUtils.currentLine=11730944;
 //BA.debugLineNum = 11730944;BA.debugLine="Public Sub GetBase As Panel";
RDebugUtils.currentLine=11730945;
 //BA.debugLineNum = 11730945;BA.debugLine="Return mBase";
if (true) return __ref._mbase;
RDebugUtils.currentLine=11730946;
 //BA.debugLineNum = 11730946;BA.debugLine="End Sub";
return null;
}
public float  _auto_size1(com.calypsoinstruments.anemotracker.scale __ref,anywheresoftware.b4a.objects.LabelWrapper _llabel1) throws Exception{
__ref = this;
RDebugUtils.currentModule="scale";
if (Debug.shouldDelegate(ba, "auto_size1"))
	 {return ((Float) Debug.delegate(ba, "auto_size1", new Object[] {_llabel1}));}
anywheresoftware.b4a.objects.StringUtils _su = null;
float _lheight1 = 0f;
RDebugUtils.currentLine=12255232;
 //BA.debugLineNum = 12255232;BA.debugLine="Sub AUTO_SIZE1(Llabel1 As Label) As Float";
RDebugUtils.currentLine=12255233;
 //BA.debugLineNum = 12255233;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=12255234;
 //BA.debugLineNum = 12255234;BA.debugLine="Dim LHeight1 As Float";
_lheight1 = 0f;
RDebugUtils.currentLine=12255235;
 //BA.debugLineNum = 12255235;BA.debugLine="Llabel1.TextSize = 128";
_llabel1.setTextSize((float) (128));
RDebugUtils.currentLine=12255237;
 //BA.debugLineNum = 12255237;BA.debugLine="LHeight1 = cvs.MeasureStringWidth(Llabel1.Text,";
_lheight1 = __ref._cvs.MeasureStringWidth(_llabel1.getText(),_llabel1.getTypeface(),_llabel1.getTextSize());
RDebugUtils.currentLine=12255239;
 //BA.debugLineNum = 12255239;BA.debugLine="Do While LHeight1 > Llabel1.width";
while (_lheight1>_llabel1.getWidth()) {
RDebugUtils.currentLine=12255242;
 //BA.debugLineNum = 12255242;BA.debugLine="LHeight1 = cvs.MeasureStringWidth(Llabel1.Text,";
_lheight1 = __ref._cvs.MeasureStringWidth(_llabel1.getText(),_llabel1.getTypeface(),_llabel1.getTextSize());
RDebugUtils.currentLine=12255243;
 //BA.debugLineNum = 12255243;BA.debugLine="If LHeight1 < Llabel1.width Then Return Llabel1";
if (_lheight1<_llabel1.getWidth()) { 
if (true) return _llabel1.getTextSize();};
RDebugUtils.currentLine=12255244;
 //BA.debugLineNum = 12255244;BA.debugLine="Llabel1.TextSize = Llabel1.TextSize - 1";
_llabel1.setTextSize((float) (_llabel1.getTextSize()-1));
RDebugUtils.currentLine=12255245;
 //BA.debugLineNum = 12255245;BA.debugLine="If Llabel1.TextSize<8 Then Return 8";
if (_llabel1.getTextSize()<8) { 
if (true) return (float) (8);};
 }
;
RDebugUtils.currentLine=12255248;
 //BA.debugLineNum = 12255248;BA.debugLine="Return 8      'Textsize should never be smaller";
if (true) return (float) (8);
RDebugUtils.currentLine=12255249;
 //BA.debugLineNum = 12255249;BA.debugLine="End Sub";
return 0f;
}
public String  _base_resize(com.calypsoinstruments.anemotracker.scale __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="scale";
if (Debug.shouldDelegate(ba, "base_resize"))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=11665408;
 //BA.debugLineNum = 11665408;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=11665409;
 //BA.debugLineNum = 11665409;BA.debugLine="mBase.Width = Width";
__ref._mbase.setWidth((int) (_width));
RDebugUtils.currentLine=11665410;
 //BA.debugLineNum = 11665410;BA.debugLine="mBase.Height = Height";
__ref._mbase.setHeight((int) (_height));
RDebugUtils.currentLine=11665411;
 //BA.debugLineNum = 11665411;BA.debugLine="img.Height = mBase.Height";
__ref._img.setHeight(__ref._mbase.getHeight());
RDebugUtils.currentLine=11665412;
 //BA.debugLineNum = 11665412;BA.debugLine="img.Width = mBase.Width";
__ref._img.setWidth(__ref._mbase.getWidth());
RDebugUtils.currentLine=11665413;
 //BA.debugLineNum = 11665413;BA.debugLine="rect1.Initialize(0, 0, img.Width, img.Height )";
__ref._rect1.Initialize((int) (0),(int) (0),__ref._img.getWidth(),__ref._img.getHeight());
RDebugUtils.currentLine=11665414;
 //BA.debugLineNum = 11665414;BA.debugLine="lbl_true.left = 0.43*mBase.Width";
__ref._lbl_true.setLeft((int) (0.43*__ref._mbase.getWidth()));
RDebugUtils.currentLine=11665415;
 //BA.debugLineNum = 11665415;BA.debugLine="lbl_true.top = 0.37*mBase.height";
__ref._lbl_true.setTop((int) (0.37*__ref._mbase.getHeight()));
RDebugUtils.currentLine=11665416;
 //BA.debugLineNum = 11665416;BA.debugLine="lbl_true.width = 0.10*mBase.Width";
__ref._lbl_true.setWidth((int) (0.10*__ref._mbase.getWidth()));
RDebugUtils.currentLine=11665417;
 //BA.debugLineNum = 11665417;BA.debugLine="lbl_true.Height = 0.08*mBase.Height";
__ref._lbl_true.setHeight((int) (0.08*__ref._mbase.getHeight()));
RDebugUtils.currentLine=11665418;
 //BA.debugLineNum = 11665418;BA.debugLine="lbl_anemo.left = 0.40*mBase.Width";
__ref._lbl_anemo.setLeft((int) (0.40*__ref._mbase.getWidth()));
RDebugUtils.currentLine=11665419;
 //BA.debugLineNum = 11665419;BA.debugLine="lbl_anemo.top= 0.45*mBase.Height";
__ref._lbl_anemo.setTop((int) (0.45*__ref._mbase.getHeight()));
RDebugUtils.currentLine=11665420;
 //BA.debugLineNum = 11665420;BA.debugLine="lbl_anemo.Width=0.16*mBase.Width";
__ref._lbl_anemo.setWidth((int) (0.16*__ref._mbase.getWidth()));
RDebugUtils.currentLine=11665421;
 //BA.debugLineNum = 11665421;BA.debugLine="lbl_anemo.Height=0.12*mBase.Height";
__ref._lbl_anemo.setHeight((int) (0.12*__ref._mbase.getHeight()));
RDebugUtils.currentLine=11665422;
 //BA.debugLineNum = 11665422;BA.debugLine="lbl_unit.left=0.41*mBase.Width";
__ref._lbl_unit.setLeft((int) (0.41*__ref._mbase.getWidth()));
RDebugUtils.currentLine=11665423;
 //BA.debugLineNum = 11665423;BA.debugLine="lbl_unit.top=0.53*mBase.height";
__ref._lbl_unit.setTop((int) (0.53*__ref._mbase.getHeight()));
RDebugUtils.currentLine=11665424;
 //BA.debugLineNum = 11665424;BA.debugLine="lbl_unit.Width=0.14*mBase.Width";
__ref._lbl_unit.setWidth((int) (0.14*__ref._mbase.getWidth()));
RDebugUtils.currentLine=11665425;
 //BA.debugLineNum = 11665425;BA.debugLine="lbl_unit.Height=0.08*mBase.Height";
__ref._lbl_unit.setHeight((int) (0.08*__ref._mbase.getHeight()));
RDebugUtils.currentLine=11665426;
 //BA.debugLineNum = 11665426;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(com.calypsoinstruments.anemotracker.scale __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="scale";
RDebugUtils.currentLine=11468800;
 //BA.debugLineNum = 11468800;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=11468801;
 //BA.debugLineNum = 11468801;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=11468802;
 //BA.debugLineNum = 11468802;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=11468803;
 //BA.debugLineNum = 11468803;BA.debugLine="Private mBase As Panel";
_mbase = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=11468804;
 //BA.debugLineNum = 11468804;BA.debugLine="Private Const DefaultColorConstant As Int = -9848";
_defaultcolorconstant = (int) (-984833);
RDebugUtils.currentLine=11468805;
 //BA.debugLineNum = 11468805;BA.debugLine="Private lbl_anemo As Label";
_lbl_anemo = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=11468806;
 //BA.debugLineNum = 11468806;BA.debugLine="Private lbl_unit, lbl_true As Label";
_lbl_unit = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl_true = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=11468807;
 //BA.debugLineNum = 11468807;BA.debugLine="Private back, img As ImageView";
_back = new anywheresoftware.b4a.objects.ImageViewWrapper();
_img = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=11468808;
 //BA.debugLineNum = 11468808;BA.debugLine="Private canvas As Canvas";
_canvas = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=11468809;
 //BA.debugLineNum = 11468809;BA.debugLine="Private cnv1, cnv2, cnv3 As Canvas";
_cnv1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
_cnv2 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
_cnv3 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=11468810;
 //BA.debugLineNum = 11468810;BA.debugLine="Private bmp1, bmp2, bmp3, bmp_compass, bmp_true,";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bmp2 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bmp3 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bmp_compass = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bmp_true = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bmp_app = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=11468811;
 //BA.debugLineNum = 11468811;BA.debugLine="Private rect1, rect2 As Rect";
_rect1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper();
_rect2 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper();
RDebugUtils.currentLine=11468812;
 //BA.debugLineNum = 11468812;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=11468813;
 //BA.debugLineNum = 11468813;BA.debugLine="Private pos_actual, pos_destino, error,vel, einit";
_pos_actual = 0;
_pos_destino = 0;
_error = 0;
_vel = 0;
_einit = 0;
RDebugUtils.currentLine=11468814;
 //BA.debugLineNum = 11468814;BA.debugLine="Private x_actual = 0, y_actual = 0, x_destino = 0";
_x_actual = (float) (0);
_y_actual = (float) (0);
_x_destino = (float) (0);
_y_destino = (float) (0);
_x_vel = (float) (0);
_y_vel = (float) (0);
RDebugUtils.currentLine=11468815;
 //BA.debugLineNum = 11468815;BA.debugLine="Private xa_actual = 0, ya_actual = 0, xa_destino";
_xa_actual = (float) (0);
_ya_actual = (float) (0);
_xa_destino = (float) (0);
_ya_destino = (float) (0);
_xa_vel = (float) (0);
_ya_vel = (float) (0);
RDebugUtils.currentLine=11468816;
 //BA.debugLineNum = 11468816;BA.debugLine="Private xt_actual = 0, yt_actual = 0, xt_destino";
_xt_actual = (float) (0);
_yt_actual = (float) (0);
_xt_destino = (float) (0);
_yt_destino = (float) (0);
_xt_vel = (float) (0);
_yt_vel = (float) (0);
RDebugUtils.currentLine=11468817;
 //BA.debugLineNum = 11468817;BA.debugLine="Private einit1, einit2 As Float";
_einit1 = 0f;
_einit2 = 0f;
RDebugUtils.currentLine=11468818;
 //BA.debugLineNum = 11468818;BA.debugLine="Private tUpdate As Timer";
_tupdate = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=11468819;
 //BA.debugLineNum = 11468819;BA.debugLine="Private wind_true As Boolean";
_wind_true = false;
RDebugUtils.currentLine=11468821;
 //BA.debugLineNum = 11468821;BA.debugLine="Dim kX,kY, kXa, kYa, kXt, kYt As tKalman";
_kx = new com.calypsoinstruments.anemotracker.windcalcs._tkalman();
_ky = new com.calypsoinstruments.anemotracker.windcalcs._tkalman();
_kxa = new com.calypsoinstruments.anemotracker.windcalcs._tkalman();
_kya = new com.calypsoinstruments.anemotracker.windcalcs._tkalman();
_kxt = new com.calypsoinstruments.anemotracker.windcalcs._tkalman();
_kyt = new com.calypsoinstruments.anemotracker.windcalcs._tkalman();
RDebugUtils.currentLine=11468822;
 //BA.debugLineNum = 11468822;BA.debugLine="Dim cvs As Canvas";
_cvs = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=11468824;
 //BA.debugLineNum = 11468824;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(com.calypsoinstruments.anemotracker.scale __ref,anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="scale";
if (Debug.shouldDelegate(ba, "designercreateview"))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.keywords.constants.TypefaceWrapper _dsdigi = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
com.iox.ioxsvg.ioxsvg _ioxsvg = null;
RDebugUtils.currentLine=11599872;
 //BA.debugLineNum = 11599872;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
RDebugUtils.currentLine=11599874;
 //BA.debugLineNum = 11599874;BA.debugLine="mBase = Base";
__ref._mbase = _base;
RDebugUtils.currentLine=11599875;
 //BA.debugLineNum = 11599875;BA.debugLine="mBase.Height = mBase.Width";
__ref._mbase.setHeight(__ref._mbase.getWidth());
RDebugUtils.currentLine=11599876;
 //BA.debugLineNum = 11599876;BA.debugLine="wind_true = True";
__ref._wind_true = __c.True;
RDebugUtils.currentLine=11599878;
 //BA.debugLineNum = 11599878;BA.debugLine="back.Initialize(\"Panel1\")";
__ref._back.Initialize(ba,"Panel1");
RDebugUtils.currentLine=11599880;
 //BA.debugLineNum = 11599880;BA.debugLine="mBase.AddView( back, 0,0, mBase.Width, mBase.Heig";
__ref._mbase.AddView((android.view.View)(__ref._back.getObject()),(int) (0),(int) (0),__ref._mbase.getWidth(),__ref._mbase.getHeight());
RDebugUtils.currentLine=11599881;
 //BA.debugLineNum = 11599881;BA.debugLine="img.Initialize(\"img\")";
__ref._img.Initialize(ba,"img");
RDebugUtils.currentLine=11599882;
 //BA.debugLineNum = 11599882;BA.debugLine="mBase.AddView( img, 0,0,mBase.Width, mBase.Width";
__ref._mbase.AddView((android.view.View)(__ref._img.getObject()),(int) (0),(int) (0),__ref._mbase.getWidth(),__ref._mbase.getWidth());
RDebugUtils.currentLine=11599883;
 //BA.debugLineNum = 11599883;BA.debugLine="canvas.Initialize(img)";
__ref._canvas.Initialize((android.view.View)(__ref._img.getObject()));
RDebugUtils.currentLine=11599885;
 //BA.debugLineNum = 11599885;BA.debugLine="Dim dsdigi As Typeface";
_dsdigi = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
RDebugUtils.currentLine=11599886;
 //BA.debugLineNum = 11599886;BA.debugLine="dsdigi = Typeface.LoadFromAssets(\"ds-digi.ttf\")";
_dsdigi.setObject((android.graphics.Typeface)(__c.Typeface.LoadFromAssets("ds-digi.ttf")));
RDebugUtils.currentLine=11599889;
 //BA.debugLineNum = 11599889;BA.debugLine="lbl_true.Initialize(\"lbl_true\")";
__ref._lbl_true.Initialize(ba,"lbl_true");
RDebugUtils.currentLine=11599890;
 //BA.debugLineNum = 11599890;BA.debugLine="lbl_anemo.Initialize( \"lbl_anemo\")";
__ref._lbl_anemo.Initialize(ba,"lbl_anemo");
RDebugUtils.currentLine=11599891;
 //BA.debugLineNum = 11599891;BA.debugLine="lbl_unit.Initialize( \"lbl_unit\")";
__ref._lbl_unit.Initialize(ba,"lbl_unit");
RDebugUtils.currentLine=11599892;
 //BA.debugLineNum = 11599892;BA.debugLine="lbl_true.Text = \"true\"";
__ref._lbl_true.setText(BA.ObjectToCharSequence("true"));
RDebugUtils.currentLine=11599893;
 //BA.debugLineNum = 11599893;BA.debugLine="lbl_true.textColor = Colors.white";
__ref._lbl_true.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=11599894;
 //BA.debugLineNum = 11599894;BA.debugLine="lbl_anemo.Text = \"00.0\"";
__ref._lbl_anemo.setText(BA.ObjectToCharSequence("00.0"));
RDebugUtils.currentLine=11599895;
 //BA.debugLineNum = 11599895;BA.debugLine="lbl_anemo.TextColor = Colors.White";
__ref._lbl_anemo.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=11599896;
 //BA.debugLineNum = 11599896;BA.debugLine="lbl_unit.Text = \"knots\"";
__ref._lbl_unit.setText(BA.ObjectToCharSequence("knots"));
RDebugUtils.currentLine=11599897;
 //BA.debugLineNum = 11599897;BA.debugLine="lbl_unit.TextColor = Colors.White";
__ref._lbl_unit.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=11599899;
 //BA.debugLineNum = 11599899;BA.debugLine="lbl_true.Padding = Array As Int(0, 0, 0, 0)";
__ref._lbl_true.setPadding(new int[]{(int) (0),(int) (0),(int) (0),(int) (0)});
RDebugUtils.currentLine=11599900;
 //BA.debugLineNum = 11599900;BA.debugLine="Dim jo As JavaObject = lbl_true";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo.setObject((java.lang.Object)(__ref._lbl_true.getObject()));
RDebugUtils.currentLine=11599901;
 //BA.debugLineNum = 11599901;BA.debugLine="jo.RunMethod(\"setIncludeFontPadding\", Array(Fals";
_jo.RunMethod("setIncludeFontPadding",new Object[]{(Object)(__c.False)});
RDebugUtils.currentLine=11599902;
 //BA.debugLineNum = 11599902;BA.debugLine="lbl_true.Gravity = Bit.Or( Gravity.CENTER_HORIZO";
__ref._lbl_true.setGravity(__c.Bit.Or(__c.Gravity.CENTER_HORIZONTAL,__c.Gravity.TOP));
RDebugUtils.currentLine=11599904;
 //BA.debugLineNum = 11599904;BA.debugLine="lbl_anemo.Padding = Array As Int(0, 0, 0, 0)";
__ref._lbl_anemo.setPadding(new int[]{(int) (0),(int) (0),(int) (0),(int) (0)});
RDebugUtils.currentLine=11599905;
 //BA.debugLineNum = 11599905;BA.debugLine="Dim jo As JavaObject = lbl_anemo";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo.setObject((java.lang.Object)(__ref._lbl_anemo.getObject()));
RDebugUtils.currentLine=11599906;
 //BA.debugLineNum = 11599906;BA.debugLine="jo.RunMethod(\"setIncludeFontPadding\", Array(Fals";
_jo.RunMethod("setIncludeFontPadding",new Object[]{(Object)(__c.False)});
RDebugUtils.currentLine=11599907;
 //BA.debugLineNum = 11599907;BA.debugLine="lbl_anemo.Gravity =  Bit.Or( Gravity.CENTER_HORI";
__ref._lbl_anemo.setGravity(__c.Bit.Or(__c.Gravity.CENTER_HORIZONTAL,__c.Gravity.TOP));
RDebugUtils.currentLine=11599908;
 //BA.debugLineNum = 11599908;BA.debugLine="lbl_anemo.Typeface = dsdigi";
__ref._lbl_anemo.setTypeface((android.graphics.Typeface)(_dsdigi.getObject()));
RDebugUtils.currentLine=11599910;
 //BA.debugLineNum = 11599910;BA.debugLine="lbl_unit.Padding = Array As Int(0, 0, 0, 0)";
__ref._lbl_unit.setPadding(new int[]{(int) (0),(int) (0),(int) (0),(int) (0)});
RDebugUtils.currentLine=11599911;
 //BA.debugLineNum = 11599911;BA.debugLine="Dim jo As JavaObject = lbl_unit";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo.setObject((java.lang.Object)(__ref._lbl_unit.getObject()));
RDebugUtils.currentLine=11599912;
 //BA.debugLineNum = 11599912;BA.debugLine="jo.RunMethod(\"setIncludeFontPadding\", Array(Fals";
_jo.RunMethod("setIncludeFontPadding",new Object[]{(Object)(__c.False)});
RDebugUtils.currentLine=11599913;
 //BA.debugLineNum = 11599913;BA.debugLine="lbl_unit.Gravity =  Bit.Or( Gravity.CENTER_HORIZ";
__ref._lbl_unit.setGravity(__c.Bit.Or(__c.Gravity.CENTER_HORIZONTAL,__c.Gravity.TOP));
RDebugUtils.currentLine=11599924;
 //BA.debugLineNum = 11599924;BA.debugLine="mBase.AddView( lbl_true, 0.45*mBase.Width,0.38*m";
__ref._mbase.AddView((android.view.View)(__ref._lbl_true.getObject()),(int) (0.45*__ref._mbase.getWidth()),(int) (0.38*__ref._mbase.getHeight()),(int) (0.10*__ref._mbase.getWidth()),(int) (0.08*__ref._mbase.getHeight()));
RDebugUtils.currentLine=11599925;
 //BA.debugLineNum = 11599925;BA.debugLine="mBase.AddView( lbl_anemo, 0.42*mBase.Width,0.46*";
__ref._mbase.AddView((android.view.View)(__ref._lbl_anemo.getObject()),(int) (0.42*__ref._mbase.getWidth()),(int) (0.46*__ref._mbase.getHeight()),(int) (0.16*__ref._mbase.getWidth()),(int) (0.12*__ref._mbase.getHeight()));
RDebugUtils.currentLine=11599926;
 //BA.debugLineNum = 11599926;BA.debugLine="mBase.AddView( lbl_unit, 0.43*mBase.Width,0.55*m";
__ref._mbase.AddView((android.view.View)(__ref._lbl_unit.getObject()),(int) (0.43*__ref._mbase.getWidth()),(int) (0.55*__ref._mbase.getHeight()),(int) (0.14*__ref._mbase.getWidth()),(int) (0.08*__ref._mbase.getHeight()));
RDebugUtils.currentLine=11599938;
 //BA.debugLineNum = 11599938;BA.debugLine="AUTO_SIZE1(lbl_true)";
__ref._auto_size1(null,__ref._lbl_true);
RDebugUtils.currentLine=11599939;
 //BA.debugLineNum = 11599939;BA.debugLine="AUTO_SIZE1(lbl_anemo)";
__ref._auto_size1(null,__ref._lbl_anemo);
RDebugUtils.currentLine=11599940;
 //BA.debugLineNum = 11599940;BA.debugLine="AUTO_SIZE1(lbl_unit)";
__ref._auto_size1(null,__ref._lbl_unit);
RDebugUtils.currentLine=11599949;
 //BA.debugLineNum = 11599949;BA.debugLine="rect1.Initialize(0, 0, img.Width, img.Height )'im";
__ref._rect1.Initialize((int) (0),(int) (0),__ref._img.getWidth(),__ref._img.getHeight());
RDebugUtils.currentLine=11599958;
 //BA.debugLineNum = 11599958;BA.debugLine="Dim ioxSVG As ioxSVG";
_ioxsvg = new com.iox.ioxsvg.ioxsvg();
RDebugUtils.currentLine=11599968;
 //BA.debugLineNum = 11599968;BA.debugLine="ioxSVG.Initialize(\"main_screen.svg\")";
_ioxsvg._initialize(ba,"main_screen.svg");
RDebugUtils.currentLine=11599969;
 //BA.debugLineNum = 11599969;BA.debugLine="bmp1.InitializeMutable(img.Width,img.Width) 'img";
__ref._bmp1.InitializeMutable(__ref._img.getWidth(),__ref._img.getWidth());
RDebugUtils.currentLine=11599970;
 //BA.debugLineNum = 11599970;BA.debugLine="cnv1.Initialize2(bmp1)";
__ref._cnv1.Initialize2((android.graphics.Bitmap)(__ref._bmp1.getObject()));
RDebugUtils.currentLine=11599971;
 //BA.debugLineNum = 11599971;BA.debugLine="ioxSVG.RenderToCanvas(cnv1)";
_ioxsvg._vvv4(__ref._cnv1);
RDebugUtils.currentLine=11600003;
 //BA.debugLineNum = 11600003;BA.debugLine="ioxSVG.Initialize(\"ruleta_centrada.svg\")";
_ioxsvg._initialize(ba,"ruleta_centrada.svg");
RDebugUtils.currentLine=11600004;
 //BA.debugLineNum = 11600004;BA.debugLine="bmp_compass.InitializeMutable(img.Width,img.Widt";
__ref._bmp_compass.InitializeMutable(__ref._img.getWidth(),__ref._img.getWidth());
RDebugUtils.currentLine=11600005;
 //BA.debugLineNum = 11600005;BA.debugLine="cnv2.Initialize2(bmp_compass)";
__ref._cnv2.Initialize2((android.graphics.Bitmap)(__ref._bmp_compass.getObject()));
RDebugUtils.currentLine=11600006;
 //BA.debugLineNum = 11600006;BA.debugLine="ioxSVG.RenderToCanvas(cnv2)";
_ioxsvg._vvv4(__ref._cnv2);
RDebugUtils.currentLine=11600008;
 //BA.debugLineNum = 11600008;BA.debugLine="ioxSVG.Initialize(\"App-01.svg\")";
_ioxsvg._initialize(ba,"App-01.svg");
RDebugUtils.currentLine=11600009;
 //BA.debugLineNum = 11600009;BA.debugLine="bmp_app.InitializeMutable(img.Width,img.Width )";
__ref._bmp_app.InitializeMutable(__ref._img.getWidth(),__ref._img.getWidth());
RDebugUtils.currentLine=11600010;
 //BA.debugLineNum = 11600010;BA.debugLine="cnv2.Initialize2(bmp_app)";
__ref._cnv2.Initialize2((android.graphics.Bitmap)(__ref._bmp_app.getObject()));
RDebugUtils.currentLine=11600011;
 //BA.debugLineNum = 11600011;BA.debugLine="ioxSVG.RenderToCanvas(cnv2)";
_ioxsvg._vvv4(__ref._cnv2);
RDebugUtils.currentLine=11600013;
 //BA.debugLineNum = 11600013;BA.debugLine="ioxSVG.Initialize(\"True-01.svg\")";
_ioxsvg._initialize(ba,"True-01.svg");
RDebugUtils.currentLine=11600014;
 //BA.debugLineNum = 11600014;BA.debugLine="bmp_true.InitializeMutable(img.Width,img.width )";
__ref._bmp_true.InitializeMutable(__ref._img.getWidth(),__ref._img.getWidth());
RDebugUtils.currentLine=11600015;
 //BA.debugLineNum = 11600015;BA.debugLine="cnv2.Initialize2(bmp_true)";
__ref._cnv2.Initialize2((android.graphics.Bitmap)(__ref._bmp_true.getObject()));
RDebugUtils.currentLine=11600016;
 //BA.debugLineNum = 11600016;BA.debugLine="ioxSVG.RenderToCanvas(cnv2)";
_ioxsvg._vvv4(__ref._cnv2);
RDebugUtils.currentLine=11600039;
 //BA.debugLineNum = 11600039;BA.debugLine="pos_actual = 0";
__ref._pos_actual = (int) (0);
RDebugUtils.currentLine=11600040;
 //BA.debugLineNum = 11600040;BA.debugLine="pos_destino = 0";
__ref._pos_destino = (int) (0);
RDebugUtils.currentLine=11600042;
 //BA.debugLineNum = 11600042;BA.debugLine="vel = 0";
__ref._vel = (int) (0);
RDebugUtils.currentLine=11600043;
 //BA.debugLineNum = 11600043;BA.debugLine="einit=0";
__ref._einit = (int) (0);
RDebugUtils.currentLine=11600045;
 //BA.debugLineNum = 11600045;BA.debugLine="Draw";
__ref._draw(null);
RDebugUtils.currentLine=11600047;
 //BA.debugLineNum = 11600047;BA.debugLine="End Sub";
return "";
}
public String  _draw(com.calypsoinstruments.anemotracker.scale __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="scale";
if (Debug.shouldDelegate(ba, "draw"))
	 {return ((String) Debug.delegate(ba, "draw", null));}
float _intermedio = 0f;
int _intermedio2 = 0;
float _angle = 0f;
RDebugUtils.currentLine=12124160;
 //BA.debugLineNum = 12124160;BA.debugLine="Sub Draw '( modulo As Float, angle As Float )";
RDebugUtils.currentLine=12124161;
 //BA.debugLineNum = 12124161;BA.debugLine="canvas.DrawColor( Colors.Transparent)";
__ref._canvas.DrawColor(__c.Colors.Transparent);
RDebugUtils.currentLine=12124163;
 //BA.debugLineNum = 12124163;BA.debugLine="canvas.DrawBitmap( bmp1, Null, rect1 )";
__ref._canvas.DrawBitmap((android.graphics.Bitmap)(__ref._bmp1.getObject()),(android.graphics.Rect)(__c.Null),(android.graphics.Rect)(__ref._rect1.getObject()));
RDebugUtils.currentLine=12124165;
 //BA.debugLineNum = 12124165;BA.debugLine="canvas.DrawBitmapRotated( bmp_compass,Null,rect1";
__ref._canvas.DrawBitmapRotated((android.graphics.Bitmap)(__ref._bmp_compass.getObject()),(android.graphics.Rect)(__c.Null),(android.graphics.Rect)(__ref._rect1.getObject()),_starter._calcs_1._speed_bearing);
RDebugUtils.currentLine=12124175;
 //BA.debugLineNum = 12124175;BA.debugLine="Dim intermedio = ATan2D( ya_actual, xa_actual) As";
_intermedio = (float) (__c.ATan2D(__ref._ya_actual,__ref._xa_actual));
RDebugUtils.currentLine=12124176;
 //BA.debugLineNum = 12124176;BA.debugLine="Dim intermedio2 = 360+intermedio As Int";
_intermedio2 = (int) (360+_intermedio);
RDebugUtils.currentLine=12124177;
 //BA.debugLineNum = 12124177;BA.debugLine="Dim angle = intermedio2 Mod 360 As Float";
_angle = (float) (_intermedio2%360);
RDebugUtils.currentLine=12124179;
 //BA.debugLineNum = 12124179;BA.debugLine="canvas.DrawBitmapRotated( bmp_app,Null , rect1,";
__ref._canvas.DrawBitmapRotated((android.graphics.Bitmap)(__ref._bmp_app.getObject()),(android.graphics.Rect)(__c.Null),(android.graphics.Rect)(__ref._rect1.getObject()),_angle);
RDebugUtils.currentLine=12124184;
 //BA.debugLineNum = 12124184;BA.debugLine="intermedio = ATan2D( yt_actual, xt_actual)";
_intermedio = (float) (__c.ATan2D(__ref._yt_actual,__ref._xt_actual));
RDebugUtils.currentLine=12124185;
 //BA.debugLineNum = 12124185;BA.debugLine="intermedio2 = 360+intermedio";
_intermedio2 = (int) (360+_intermedio);
RDebugUtils.currentLine=12124186;
 //BA.debugLineNum = 12124186;BA.debugLine="angle = intermedio2 Mod 360";
_angle = (float) (_intermedio2%360);
RDebugUtils.currentLine=12124188;
 //BA.debugLineNum = 12124188;BA.debugLine="canvas.DrawBitmapRotated( bmp_true, Null, rect1,";
__ref._canvas.DrawBitmapRotated((android.graphics.Bitmap)(__ref._bmp_true.getObject()),(android.graphics.Rect)(__c.Null),(android.graphics.Rect)(__ref._rect1.getObject()),_angle);
RDebugUtils.currentLine=12124193;
 //BA.debugLineNum = 12124193;BA.debugLine="If wind_true Then";
if (__ref._wind_true) { 
RDebugUtils.currentLine=12124194;
 //BA.debugLineNum = 12124194;BA.debugLine="lbl_true.text = \"true\"";
__ref._lbl_true.setText(BA.ObjectToCharSequence("true"));
RDebugUtils.currentLine=12124196;
 //BA.debugLineNum = 12124196;BA.debugLine="lbl_anemo.text = NumberFormat2( Starter.calcs_1";
__ref._lbl_anemo.setText(BA.ObjectToCharSequence(__c.NumberFormat2(_starter._calcs_1._twm*3600/(double)1852,(int) (2),(int) (1),(int) (1),__c.False)));
 }else {
RDebugUtils.currentLine=12124202;
 //BA.debugLineNum = 12124202;BA.debugLine="lbl_true.text = \"app\"";
__ref._lbl_true.setText(BA.ObjectToCharSequence("app"));
RDebugUtils.currentLine=12124204;
 //BA.debugLineNum = 12124204;BA.debugLine="lbl_anemo.text = NumberFormat2( Starter.calcs_1";
__ref._lbl_anemo.setText(BA.ObjectToCharSequence(__c.NumberFormat2(_starter._calcs_1._awm*3600/(double)1852,(int) (2),(int) (1),(int) (1),__c.False)));
 };
RDebugUtils.currentLine=12124213;
 //BA.debugLineNum = 12124213;BA.debugLine="img.Invalidate";
__ref._img.Invalidate();
RDebugUtils.currentLine=12124221;
 //BA.debugLineNum = 12124221;BA.debugLine="End Sub";
return "";
}
public String  _initialize(com.calypsoinstruments.anemotracker.scale __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="scale";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
float _mea = 0f;
float _q = 0f;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
RDebugUtils.currentLine=11534336;
 //BA.debugLineNum = 11534336;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=11534337;
 //BA.debugLineNum = 11534337;BA.debugLine="mEventName = EventName";
__ref._meventname = _eventname;
RDebugUtils.currentLine=11534338;
 //BA.debugLineNum = 11534338;BA.debugLine="mCallBack = Callback";
__ref._mcallback = _callback;
RDebugUtils.currentLine=11534339;
 //BA.debugLineNum = 11534339;BA.debugLine="Dim mea =0.003, q = 0.003 As Float";
_mea = (float) (0.003);
_q = (float) (0.003);
RDebugUtils.currentLine=11534340;
 //BA.debugLineNum = 11534340;BA.debugLine="kX.err_measure = mea";
__ref._kx.err_measure = _mea;
RDebugUtils.currentLine=11534341;
 //BA.debugLineNum = 11534341;BA.debugLine="kX.err_estimate =  0.002 'mea*refresh_hz 'no pued";
__ref._kx.err_estimate = (float) (0.002);
RDebugUtils.currentLine=11534342;
 //BA.debugLineNum = 11534342;BA.debugLine="kX.q = q";
__ref._kx.q = _q;
RDebugUtils.currentLine=11534343;
 //BA.debugLineNum = 11534343;BA.debugLine="kY.err_measure = mea";
__ref._ky.err_measure = _mea;
RDebugUtils.currentLine=11534344;
 //BA.debugLineNum = 11534344;BA.debugLine="kY.err_estimate = 0.002 'mea*refresh_hz";
__ref._ky.err_estimate = (float) (0.002);
RDebugUtils.currentLine=11534345;
 //BA.debugLineNum = 11534345;BA.debugLine="kY.q = q";
__ref._ky.q = _q;
RDebugUtils.currentLine=11534346;
 //BA.debugLineNum = 11534346;BA.debugLine="kXa = kX";
__ref._kxa = __ref._kx;
RDebugUtils.currentLine=11534347;
 //BA.debugLineNum = 11534347;BA.debugLine="kYa = kY";
__ref._kya = __ref._ky;
RDebugUtils.currentLine=11534348;
 //BA.debugLineNum = 11534348;BA.debugLine="kXt = kX";
__ref._kxt = __ref._kx;
RDebugUtils.currentLine=11534349;
 //BA.debugLineNum = 11534349;BA.debugLine="kYt = kY";
__ref._kyt = __ref._ky;
RDebugUtils.currentLine=11534350;
 //BA.debugLineNum = 11534350;BA.debugLine="tUpdate.Initialize( \"tUpdate\", 300)";
__ref._tupdate.Initialize(ba,"tUpdate",(long) (300));
RDebugUtils.currentLine=11534351;
 //BA.debugLineNum = 11534351;BA.debugLine="Dim bmp As Bitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=11534353;
 //BA.debugLineNum = 11534353;BA.debugLine="bmp.InitializeMutable(1,1) 'ignore";
_bmp.InitializeMutable((int) (1),(int) (1));
RDebugUtils.currentLine=11534354;
 //BA.debugLineNum = 11534354;BA.debugLine="cvs.Initialize2(bmp)";
__ref._cvs.Initialize2((android.graphics.Bitmap)(_bmp.getObject()));
RDebugUtils.currentLine=11534358;
 //BA.debugLineNum = 11534358;BA.debugLine="End Sub";
return "";
}
public String  _panel1_longclick(com.calypsoinstruments.anemotracker.scale __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="scale";
if (Debug.shouldDelegate(ba, "panel1_longclick"))
	 {return ((String) Debug.delegate(ba, "panel1_longclick", null));}
RDebugUtils.currentLine=12189696;
 //BA.debugLineNum = 12189696;BA.debugLine="Sub Panel1_LongClick";
RDebugUtils.currentLine=12189698;
 //BA.debugLineNum = 12189698;BA.debugLine="If SubExists(mCallBack, mEventName & \"_LongClick";
if (__c.SubExists(ba,__ref._mcallback,__ref._meventname+"_LongClick")) { 
RDebugUtils.currentLine=12189699;
 //BA.debugLineNum = 12189699;BA.debugLine="CallSub( mCallBack, mEventName & \"_LongClick\" )";
__c.CallSubNew(ba,__ref._mcallback,__ref._meventname+"_LongClick");
 };
RDebugUtils.currentLine=12189707;
 //BA.debugLineNum = 12189707;BA.debugLine="wind_true = Not( wind_true )";
__ref._wind_true = __c.Not(__ref._wind_true);
RDebugUtils.currentLine=12189709;
 //BA.debugLineNum = 12189709;BA.debugLine="End Sub";
return "";
}
public String  _pause(com.calypsoinstruments.anemotracker.scale __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="scale";
if (Debug.shouldDelegate(ba, "pause"))
	 {return ((String) Debug.delegate(ba, "pause", null));}
RDebugUtils.currentLine=11796480;
 //BA.debugLineNum = 11796480;BA.debugLine="Public Sub Pause";
RDebugUtils.currentLine=11796481;
 //BA.debugLineNum = 11796481;BA.debugLine="tUpdate.Enabled = False";
__ref._tupdate.setEnabled(__c.False);
RDebugUtils.currentLine=11796482;
 //BA.debugLineNum = 11796482;BA.debugLine="End Sub";
return "";
}
public String  _tupdate_tick(com.calypsoinstruments.anemotracker.scale __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="scale";
if (Debug.shouldDelegate(ba, "tupdate_tick"))
	 {return ((String) Debug.delegate(ba, "tupdate_tick", null));}
RDebugUtils.currentLine=11927552;
 //BA.debugLineNum = 11927552;BA.debugLine="Sub tUpdate_Tick";
RDebugUtils.currentLine=11927553;
 //BA.debugLineNum = 11927553;BA.debugLine="xa_actual = updateEstimate( xa_destino, kXa )";
__ref._xa_actual = __ref._updateestimate(null,__ref._xa_destino,__ref._kxa);
RDebugUtils.currentLine=11927554;
 //BA.debugLineNum = 11927554;BA.debugLine="ya_actual = updateEstimate( ya_destino, kYa )";
__ref._ya_actual = __ref._updateestimate(null,__ref._ya_destino,__ref._kya);
RDebugUtils.currentLine=11927555;
 //BA.debugLineNum = 11927555;BA.debugLine="xt_actual = updateEstimate( xt_destino, kXt )";
__ref._xt_actual = __ref._updateestimate(null,__ref._xt_destino,__ref._kxt);
RDebugUtils.currentLine=11927556;
 //BA.debugLineNum = 11927556;BA.debugLine="yt_actual = updateEstimate( yt_destino, kYt )";
__ref._yt_actual = __ref._updateestimate(null,__ref._yt_destino,__ref._kyt);
RDebugUtils.currentLine=11927557;
 //BA.debugLineNum = 11927557;BA.debugLine="Draw";
__ref._draw(null);
RDebugUtils.currentLine=11927558;
 //BA.debugLineNum = 11927558;BA.debugLine="End Sub";
return "";
}
public float  _updateestimate(com.calypsoinstruments.anemotracker.scale __ref,float _mea,com.calypsoinstruments.anemotracker.windcalcs._tkalman _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="scale";
if (Debug.shouldDelegate(ba, "updateestimate"))
	 {return ((Float) Debug.delegate(ba, "updateestimate", new Object[] {_mea,_k}));}
RDebugUtils.currentLine=11993088;
 //BA.debugLineNum = 11993088;BA.debugLine="Sub updateEstimate(mea As Float, k As tKalman) As";
RDebugUtils.currentLine=11993090;
 //BA.debugLineNum = 11993090;BA.debugLine="k.kalman_gain = k.err_estimate/(k.err_estimate +";
_k.kalman_gain = (float) (_k.err_estimate/(double)(_k.err_estimate+_k.err_measure));
RDebugUtils.currentLine=11993091;
 //BA.debugLineNum = 11993091;BA.debugLine="k.current_estimate = k.last_estimate + k.kalman_g";
_k.current_estimate = (float) (_k.last_estimate+_k.kalman_gain*(_mea-_k.last_estimate));
RDebugUtils.currentLine=11993092;
 //BA.debugLineNum = 11993092;BA.debugLine="k.err_estimate =  (1.0 - k.kalman_gain)*k.err_est";
_k.err_estimate = (float) ((1.0-_k.kalman_gain)*_k.err_estimate+__c.Abs(_k.last_estimate-_k.current_estimate)*_k.q);
RDebugUtils.currentLine=11993093;
 //BA.debugLineNum = 11993093;BA.debugLine="k.last_estimate=k.current_estimate";
_k.last_estimate = _k.current_estimate;
RDebugUtils.currentLine=11993095;
 //BA.debugLineNum = 11993095;BA.debugLine="Return k.current_estimate";
if (true) return _k.current_estimate;
RDebugUtils.currentLine=11993096;
 //BA.debugLineNum = 11993096;BA.debugLine="End Sub";
return 0f;
}
public String  _tupdate_tick_back(com.calypsoinstruments.anemotracker.scale __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="scale";
if (Debug.shouldDelegate(ba, "tupdate_tick_back"))
	 {return ((String) Debug.delegate(ba, "tupdate_tick_back", null));}
float _accel = 0f;
float _error_x = 0f;
float _error_y = 0f;
RDebugUtils.currentLine=12058624;
 //BA.debugLineNum = 12058624;BA.debugLine="Sub tUpdate_Tick_back";
RDebugUtils.currentLine=12058625;
 //BA.debugLineNum = 12058625;BA.debugLine="Dim accel As Float";
_accel = 0f;
RDebugUtils.currentLine=12058626;
 //BA.debugLineNum = 12058626;BA.debugLine="Dim error_x, error_y As Float";
_error_x = 0f;
_error_y = 0f;
RDebugUtils.currentLine=12058628;
 //BA.debugLineNum = 12058628;BA.debugLine="error_x = x_destino - x_actual";
_error_x = (float) (__ref._x_destino-__ref._x_actual);
RDebugUtils.currentLine=12058629;
 //BA.debugLineNum = 12058629;BA.debugLine="If Abs(error_x) >0 Then";
if (__c.Abs(_error_x)>0) { 
RDebugUtils.currentLine=12058630;
 //BA.debugLineNum = 12058630;BA.debugLine="If Abs(error_x) > Abs(einit1/2) Then";
if (__c.Abs(_error_x)>__c.Abs(__ref._einit1/(double)2)) { 
RDebugUtils.currentLine=12058631;
 //BA.debugLineNum = 12058631;BA.debugLine="accel = error_x*Abs(einit1/500)/Abs(error_x)";
_accel = (float) (_error_x*__c.Abs(__ref._einit1/(double)500)/(double)__c.Abs(_error_x));
 }else {
RDebugUtils.currentLine=12058633;
 //BA.debugLineNum = 12058633;BA.debugLine="accel = -error_x*Abs(einit1/500)/Abs(error_x)";
_accel = (float) (-_error_x*__c.Abs(__ref._einit1/(double)500)/(double)__c.Abs(_error_x));
 };
RDebugUtils.currentLine=12058635;
 //BA.debugLineNum = 12058635;BA.debugLine="If Abs(error_x) > 0.01 Then";
if (__c.Abs(_error_x)>0.01) { 
RDebugUtils.currentLine=12058636;
 //BA.debugLineNum = 12058636;BA.debugLine="x_vel = x_vel + accel";
__ref._x_vel = (float) (__ref._x_vel+_accel);
 };
RDebugUtils.currentLine=12058638;
 //BA.debugLineNum = 12058638;BA.debugLine="If Abs(x_vel) > Abs(error_x) Then";
if (__c.Abs(__ref._x_vel)>__c.Abs(_error_x)) { 
RDebugUtils.currentLine=12058639;
 //BA.debugLineNum = 12058639;BA.debugLine="x_actual = x_destino";
__ref._x_actual = __ref._x_destino;
RDebugUtils.currentLine=12058640;
 //BA.debugLineNum = 12058640;BA.debugLine="x_vel = 0";
__ref._x_vel = (float) (0);
 }else {
RDebugUtils.currentLine=12058642;
 //BA.debugLineNum = 12058642;BA.debugLine="x_actual = x_actual + x_vel";
__ref._x_actual = (float) (__ref._x_actual+__ref._x_vel);
 };
 };
RDebugUtils.currentLine=12058646;
 //BA.debugLineNum = 12058646;BA.debugLine="error_y = y_destino - y_actual";
_error_y = (float) (__ref._y_destino-__ref._y_actual);
RDebugUtils.currentLine=12058647;
 //BA.debugLineNum = 12058647;BA.debugLine="If Abs(error_y) > 0 Then";
if (__c.Abs(_error_y)>0) { 
RDebugUtils.currentLine=12058648;
 //BA.debugLineNum = 12058648;BA.debugLine="If Abs(error_y) > Abs(einit2/2) Then";
if (__c.Abs(_error_y)>__c.Abs(__ref._einit2/(double)2)) { 
RDebugUtils.currentLine=12058649;
 //BA.debugLineNum = 12058649;BA.debugLine="accel = error_y*Abs(einit2/500)/Abs(error_y)";
_accel = (float) (_error_y*__c.Abs(__ref._einit2/(double)500)/(double)__c.Abs(_error_y));
 }else {
RDebugUtils.currentLine=12058651;
 //BA.debugLineNum = 12058651;BA.debugLine="accel = -error_y*Abs(einit2/500)/Abs(error_y)";
_accel = (float) (-_error_y*__c.Abs(__ref._einit2/(double)500)/(double)__c.Abs(_error_y));
 };
RDebugUtils.currentLine=12058653;
 //BA.debugLineNum = 12058653;BA.debugLine="If Abs(error_y) > 0.01 Then";
if (__c.Abs(_error_y)>0.01) { 
RDebugUtils.currentLine=12058654;
 //BA.debugLineNum = 12058654;BA.debugLine="y_vel = y_vel + accel";
__ref._y_vel = (float) (__ref._y_vel+_accel);
 };
RDebugUtils.currentLine=12058656;
 //BA.debugLineNum = 12058656;BA.debugLine="If Abs(y_vel) > Abs(error_y) Then";
if (__c.Abs(__ref._y_vel)>__c.Abs(_error_y)) { 
RDebugUtils.currentLine=12058657;
 //BA.debugLineNum = 12058657;BA.debugLine="y_actual = y_destino";
__ref._y_actual = __ref._y_destino;
RDebugUtils.currentLine=12058658;
 //BA.debugLineNum = 12058658;BA.debugLine="y_vel = 0";
__ref._y_vel = (float) (0);
 }else {
RDebugUtils.currentLine=12058660;
 //BA.debugLineNum = 12058660;BA.debugLine="y_actual = y_actual + y_vel";
__ref._y_actual = (float) (__ref._y_actual+__ref._y_vel);
 };
 };
RDebugUtils.currentLine=12058665;
 //BA.debugLineNum = 12058665;BA.debugLine="Draw '( pos_actual )";
__ref._draw(null);
RDebugUtils.currentLine=12058666;
 //BA.debugLineNum = 12058666;BA.debugLine="End Sub";
return "";
}
public String  _update(com.calypsoinstruments.anemotracker.scale __ref,boolean _selected) throws Exception{
__ref = this;
RDebugUtils.currentModule="scale";
if (Debug.shouldDelegate(ba, "update"))
	 {return ((String) Debug.delegate(ba, "update", new Object[] {_selected}));}
RDebugUtils.currentLine=11862016;
 //BA.debugLineNum = 11862016;BA.debugLine="Public Sub Update( selected As Boolean )";
RDebugUtils.currentLine=11862017;
 //BA.debugLineNum = 11862017;BA.debugLine="If selected Then";
if (_selected) { 
RDebugUtils.currentLine=11862018;
 //BA.debugLineNum = 11862018;BA.debugLine="xa_actual = xa_destino";
__ref._xa_actual = __ref._xa_destino;
RDebugUtils.currentLine=11862019;
 //BA.debugLineNum = 11862019;BA.debugLine="ya_actual = ya_destino";
__ref._ya_actual = __ref._ya_destino;
RDebugUtils.currentLine=11862020;
 //BA.debugLineNum = 11862020;BA.debugLine="xt_actual = xt_destino";
__ref._xt_actual = __ref._xt_destino;
RDebugUtils.currentLine=11862021;
 //BA.debugLineNum = 11862021;BA.debugLine="yt_actual = yt_destino";
__ref._yt_actual = __ref._yt_destino;
 };
RDebugUtils.currentLine=11862025;
 //BA.debugLineNum = 11862025;BA.debugLine="pos_destino = Starter.calcs_1.awa";
__ref._pos_destino = (int) (_starter._calcs_1._awa);
RDebugUtils.currentLine=11862027;
 //BA.debugLineNum = 11862027;BA.debugLine="xa_destino = CosD( Starter.calcs_1.awa ) 'Starte";
__ref._xa_destino = (float) (__c.CosD(_starter._calcs_1._awa));
RDebugUtils.currentLine=11862028;
 //BA.debugLineNum = 11862028;BA.debugLine="ya_destino = SinD( Starter.calcs_1.awa ) 'Starte";
__ref._ya_destino = (float) (__c.SinD(_starter._calcs_1._awa));
RDebugUtils.currentLine=11862029;
 //BA.debugLineNum = 11862029;BA.debugLine="xt_destino = CosD( Starter.calcs_1.twa ) 'Starte";
__ref._xt_destino = (float) (__c.CosD(_starter._calcs_1._twa));
RDebugUtils.currentLine=11862030;
 //BA.debugLineNum = 11862030;BA.debugLine="yt_destino = SinD( Starter.calcs_1.twa ) 'Starte";
__ref._yt_destino = (float) (__c.SinD(_starter._calcs_1._twa));
RDebugUtils.currentLine=11862040;
 //BA.debugLineNum = 11862040;BA.debugLine="einit1 = x_destino - x_actual";
__ref._einit1 = (float) (__ref._x_destino-__ref._x_actual);
RDebugUtils.currentLine=11862041;
 //BA.debugLineNum = 11862041;BA.debugLine="einit2 = y_destino - y_actual";
__ref._einit2 = (float) (__ref._y_destino-__ref._y_actual);
RDebugUtils.currentLine=11862044;
 //BA.debugLineNum = 11862044;BA.debugLine="tUpdate.Enabled = True";
__ref._tupdate.setEnabled(__c.True);
RDebugUtils.currentLine=11862048;
 //BA.debugLineNum = 11862048;BA.debugLine="End Sub";
return "";
}
}