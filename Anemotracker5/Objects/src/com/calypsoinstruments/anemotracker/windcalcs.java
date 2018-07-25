package com.calypsoinstruments.anemotracker;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class windcalcs extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "com.calypsoinstruments.anemotracker.windcalcs");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.calypsoinstruments.anemotracker.windcalcs.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _tkalman{
public boolean IsInitialized;
public float err_measure;
public float err_estimate;
public float q;
public float current_estimate;
public float last_estimate;
public float kalman_gain;
public void Initialize() {
IsInitialized = true;
err_measure = 0f;
err_estimate = 0f;
q = 0f;
current_estimate = 0f;
last_estimate = 0f;
kalman_gain = 0f;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _tkalman2{
public boolean IsInitialized;
public float xk;
public float pk;
public float R;
public void Initialize() {
IsInitialized = true;
xk = 0f;
pk = 0f;
R = 0f;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _tkalman3{
public boolean IsInitialized;
public float q;
public float r;
public float x;
public float p;
public float k;
public void Initialize() {
IsInitialized = true;
q = 0f;
r = 0f;
x = 0f;
p = 0f;
k = 0f;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public float _orig_vane = 0f;
public float _orig_anemo = 0f;
public float _vane = 0f;
public float _anemo = 0f;
public float _speed = 0f;
public float _bearing = 0f;
public float _latitude = 0f;
public float _longitude = 0f;
public float _altitude = 0f;
public float _compass = 0f;
public float _awm = 0f;
public float _awa = 0f;
public float _twm = 0f;
public float _twa = 0f;
public float _twn = 0f;
public boolean _simulated = false;
public float _swm = 0f;
public float _swa = 0f;
public float _knots = 0f;
public float _speed_min = 0f;
public boolean _speed_sw = false;
public boolean _speed_low = false;
public float _speed_bearing = 0f;
public boolean _mean_sw = false;
public float _offset = 0f;
public anywheresoftware.b4a.objects.collections.List _m_anemo = null;
public anywheresoftware.b4a.objects.collections.List _m_x = null;
public anywheresoftware.b4a.objects.collections.List _m_y = null;
public int _battery = 0;
public int _temp = 0;
public int _roll = 0;
public int _pitch = 0;
public int _ecompass = 0;
public com.calypsoinstruments.anemotracker.windcalcs._tkalman _kx = null;
public com.calypsoinstruments.anemotracker.windcalcs._tkalman _ky = null;
public com.calypsoinstruments.anemotracker.windcalcs._tkalman2 _kx2 = null;
public com.calypsoinstruments.anemotracker.windcalcs._tkalman2 _ky2 = null;
public com.calypsoinstruments.anemotracker.windcalcs._tkalman3 _kx3 = null;
public com.calypsoinstruments.anemotracker.windcalcs._tkalman3 _ky3 = null;
public float _refresh_hz = 0f;
public float _selected_compass = 0f;
public com.calypsoinstruments.anemotracker.main _main = null;
public com.calypsoinstruments.anemotracker.actble _actble = null;
public com.calypsoinstruments.anemotracker.actlisttracks _actlisttracks = null;
public com.calypsoinstruments.anemotracker.actnavigation _actnavigation = null;
public com.calypsoinstruments.anemotracker.acttcpip _acttcpip = null;
public com.calypsoinstruments.anemotracker.starter _starter = null;
public com.calypsoinstruments.anemotracker.dbutils _dbutils = null;
public com.calypsoinstruments.anemotracker.actcalcomp _actcalcomp = null;
public com.calypsoinstruments.anemotracker.actdevinfo _actdevinfo = null;
public String  _mean_checked(com.calypsoinstruments.anemotracker.windcalcs __ref,boolean _checked) throws Exception{
__ref = this;
RDebugUtils.currentModule="windcalcs";
if (Debug.shouldDelegate(ba, "mean_checked"))
	 {return ((String) Debug.delegate(ba, "mean_checked", new Object[] {_checked}));}
float _mea = 0f;
float _q = 0f;
RDebugUtils.currentLine=10878976;
 //BA.debugLineNum = 10878976;BA.debugLine="Sub mean_checked( checked As Boolean)";
RDebugUtils.currentLine=10878977;
 //BA.debugLineNum = 10878977;BA.debugLine="mean_sw = checked";
__ref._mean_sw = _checked;
RDebugUtils.currentLine=10878978;
 //BA.debugLineNum = 10878978;BA.debugLine="Dim mea, q As Float";
_mea = 0f;
_q = 0f;
RDebugUtils.currentLine=10878979;
 //BA.debugLineNum = 10878979;BA.debugLine="If checked Then";
if (_checked) { 
RDebugUtils.currentLine=10878980;
 //BA.debugLineNum = 10878980;BA.debugLine="mea = 0.01 '0.05";
_mea = (float) (0.01);
RDebugUtils.currentLine=10878981;
 //BA.debugLineNum = 10878981;BA.debugLine="q = 0.005*2/refresh_hz  '0.05";
_q = (float) (0.005*2/(double)__ref._refresh_hz);
 }else {
RDebugUtils.currentLine=10878983;
 //BA.debugLineNum = 10878983;BA.debugLine="mea = 0.02";
_mea = (float) (0.02);
RDebugUtils.currentLine=10878984;
 //BA.debugLineNum = 10878984;BA.debugLine="q = 0.01*2/refresh_hz";
_q = (float) (0.01*2/(double)__ref._refresh_hz);
 };
RDebugUtils.currentLine=10878986;
 //BA.debugLineNum = 10878986;BA.debugLine="kX.err_measure = mea";
__ref._kx.err_measure = _mea;
RDebugUtils.currentLine=10878987;
 //BA.debugLineNum = 10878987;BA.debugLine="kX.err_estimate =  0.05 'mea*refresh_hz 'no puede";
__ref._kx.err_estimate = (float) (0.05);
RDebugUtils.currentLine=10878988;
 //BA.debugLineNum = 10878988;BA.debugLine="kX.q = q";
__ref._kx.q = _q;
RDebugUtils.currentLine=10878989;
 //BA.debugLineNum = 10878989;BA.debugLine="kY.err_measure = mea";
__ref._ky.err_measure = _mea;
RDebugUtils.currentLine=10878990;
 //BA.debugLineNum = 10878990;BA.debugLine="kY.err_estimate = 0.05 'mea*refresh_hz";
__ref._ky.err_estimate = (float) (0.05);
RDebugUtils.currentLine=10878991;
 //BA.debugLineNum = 10878991;BA.debugLine="kY.q = q";
__ref._ky.q = _q;
RDebugUtils.currentLine=10878994;
 //BA.debugLineNum = 10878994;BA.debugLine="kX2.xk = 0";
__ref._kx2.xk = (float) (0);
RDebugUtils.currentLine=10878995;
 //BA.debugLineNum = 10878995;BA.debugLine="kX2.pk = 1";
__ref._kx2.pk = (float) (1);
RDebugUtils.currentLine=10878996;
 //BA.debugLineNum = 10878996;BA.debugLine="kX2.R = 0.005";
__ref._kx2.R = (float) (0.005);
RDebugUtils.currentLine=10878997;
 //BA.debugLineNum = 10878997;BA.debugLine="kY2.xk = 0";
__ref._ky2.xk = (float) (0);
RDebugUtils.currentLine=10878998;
 //BA.debugLineNum = 10878998;BA.debugLine="kY2.pk = 1";
__ref._ky2.pk = (float) (1);
RDebugUtils.currentLine=10878999;
 //BA.debugLineNum = 10878999;BA.debugLine="kY2.R = 0.005";
__ref._ky2.R = (float) (0.005);
RDebugUtils.currentLine=10879025;
 //BA.debugLineNum = 10879025;BA.debugLine="kX3.q = 0.1";
__ref._kx3.q = (float) (0.1);
RDebugUtils.currentLine=10879026;
 //BA.debugLineNum = 10879026;BA.debugLine="kX3.r = 0.5";
__ref._kx3.r = (float) (0.5);
RDebugUtils.currentLine=10879027;
 //BA.debugLineNum = 10879027;BA.debugLine="kX3.p = 1023";
__ref._kx3.p = (float) (1023);
RDebugUtils.currentLine=10879028;
 //BA.debugLineNum = 10879028;BA.debugLine="kX3.x = 0";
__ref._kx3.x = (float) (0);
RDebugUtils.currentLine=10879029;
 //BA.debugLineNum = 10879029;BA.debugLine="kY3 = kX3";
__ref._ky3 = __ref._kx3;
RDebugUtils.currentLine=10879032;
 //BA.debugLineNum = 10879032;BA.debugLine="End Sub";
return "";
}
public String  _calc_anemo_k(com.calypsoinstruments.anemotracker.windcalcs __ref,float _v_anemo,float _v_vane) throws Exception{
__ref = this;
RDebugUtils.currentModule="windcalcs";
if (Debug.shouldDelegate(ba, "calc_anemo_k"))
	 {return ((String) Debug.delegate(ba, "calc_anemo_k", new Object[] {_v_anemo,_v_vane}));}
float _x = 0f;
float _y = 0f;
float _xe = 0f;
float _ye = 0f;
int _intermedio = 0;
int _intermedio2 = 0;
int _i = 0;
int _i2 = 0;
RDebugUtils.currentLine=10944512;
 //BA.debugLineNum = 10944512;BA.debugLine="Sub calc_anemo_k( v_anemo As Float, v_vane As Floa";
RDebugUtils.currentLine=10944513;
 //BA.debugLineNum = 10944513;BA.debugLine="Dim x,y, xe,ye As Float";
_x = 0f;
_y = 0f;
_xe = 0f;
_ye = 0f;
RDebugUtils.currentLine=10944514;
 //BA.debugLineNum = 10944514;BA.debugLine="Dim intermedio, intermedio2, i, i2 As Int";
_intermedio = 0;
_intermedio2 = 0;
_i = 0;
_i2 = 0;
RDebugUtils.currentLine=10944515;
 //BA.debugLineNum = 10944515;BA.debugLine="x = CosD( v_vane ) 'v_anemo*";
_x = (float) (__c.CosD(_v_vane));
RDebugUtils.currentLine=10944516;
 //BA.debugLineNum = 10944516;BA.debugLine="y = SinD( v_vane ) 'v_anemo*";
_y = (float) (__c.SinD(_v_vane));
RDebugUtils.currentLine=10944518;
 //BA.debugLineNum = 10944518;BA.debugLine="xe = updateEstimate( x, kX )";
_xe = __ref._updateestimate(null,_x,__ref._kx);
RDebugUtils.currentLine=10944519;
 //BA.debugLineNum = 10944519;BA.debugLine="ye = updateEstimate( y, kY )";
_ye = __ref._updateestimate(null,_y,__ref._ky);
RDebugUtils.currentLine=10944524;
 //BA.debugLineNum = 10944524;BA.debugLine="intermedio = ATan2D( ye, xe)";
_intermedio = (int) (__c.ATan2D(_ye,_xe));
RDebugUtils.currentLine=10944525;
 //BA.debugLineNum = 10944525;BA.debugLine="intermedio2 = 360+intermedio";
_intermedio2 = (int) (360+_intermedio);
RDebugUtils.currentLine=10944526;
 //BA.debugLineNum = 10944526;BA.debugLine="i = ATan2D( y, x )";
_i = (int) (__c.ATan2D(_y,_x));
RDebugUtils.currentLine=10944527;
 //BA.debugLineNum = 10944527;BA.debugLine="i2 = 360 + i";
_i2 = (int) (360+_i);
RDebugUtils.currentLine=10944528;
 //BA.debugLineNum = 10944528;BA.debugLine="vane = intermedio2 Mod 360";
__ref._vane = (float) (_intermedio2%360);
RDebugUtils.currentLine=10944531;
 //BA.debugLineNum = 10944531;BA.debugLine="anemo = v_anemo";
__ref._anemo = _v_anemo;
RDebugUtils.currentLine=10944533;
 //BA.debugLineNum = 10944533;BA.debugLine="End Sub";
return "";
}
public String  _calc(com.calypsoinstruments.anemotracker.windcalcs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="windcalcs";
if (Debug.shouldDelegate(ba, "calc"))
	 {return ((String) Debug.delegate(ba, "calc", null));}
anywheresoftware.b4a.objects.collections.Map _r = null;
float _swr = 0f;
RDebugUtils.currentLine=11075584;
 //BA.debugLineNum = 11075584;BA.debugLine="Sub calc";
RDebugUtils.currentLine=11075587;
 //BA.debugLineNum = 11075587;BA.debugLine="Dim r As Map";
_r = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=11075590;
 //BA.debugLineNum = 11075590;BA.debugLine="If speed_sw Then";
if (__ref._speed_sw) { 
RDebugUtils.currentLine=11075591;
 //BA.debugLineNum = 11075591;BA.debugLine="If knots <= speed_min  Then";
if (__ref._knots<=__ref._speed_min) { 
RDebugUtils.currentLine=11075592;
 //BA.debugLineNum = 11075592;BA.debugLine="speed_low = True";
__ref._speed_low = __c.True;
 }else {
RDebugUtils.currentLine=11075594;
 //BA.debugLineNum = 11075594;BA.debugLine="speed_low = False";
__ref._speed_low = __c.False;
 };
 }else {
RDebugUtils.currentLine=11075597;
 //BA.debugLineNum = 11075597;BA.debugLine="speed_low = False";
__ref._speed_low = __c.False;
 };
RDebugUtils.currentLine=11075603;
 //BA.debugLineNum = 11075603;BA.debugLine="If simulated Then";
if (__ref._simulated) { 
RDebugUtils.currentLine=11075609;
 //BA.debugLineNum = 11075609;BA.debugLine="Dim swR As Float";
_swr = 0f;
RDebugUtils.currentLine=11075610;
 //BA.debugLineNum = 11075610;BA.debugLine="swR = swa - bearing";
_swr = (float) (__ref._swa-__ref._bearing);
RDebugUtils.currentLine=11075611;
 //BA.debugLineNum = 11075611;BA.debugLine="If swR < 0 Then";
if (_swr<0) { 
RDebugUtils.currentLine=11075612;
 //BA.debugLineNum = 11075612;BA.debugLine="swR = swR + 360 ' importante el + porque swN es";
_swr = (float) (_swr+360);
 };
RDebugUtils.currentLine=11075614;
 //BA.debugLineNum = 11075614;BA.debugLine="twm = Round2( swm, 1 )";
__ref._twm = (float) (__c.Round2(__ref._swm,(int) (1)));
RDebugUtils.currentLine=11075615;
 //BA.debugLineNum = 11075615;BA.debugLine="twa = Round2( swR, 1 )";
__ref._twa = (float) (__c.Round2(_swr,(int) (1)));
RDebugUtils.currentLine=11075616;
 //BA.debugLineNum = 11075616;BA.debugLine="twN = Round2( twa , 1 ) ' respecto al norte ya e";
__ref._twn = (float) (__c.Round2(__ref._twa,(int) (1)));
RDebugUtils.currentLine=11075617;
 //BA.debugLineNum = 11075617;BA.debugLine="If speed_low Then";
if (__ref._speed_low) { 
RDebugUtils.currentLine=11075619;
 //BA.debugLineNum = 11075619;BA.debugLine="r = calc_wind( speed, swm, swR, ecompass, True";
_r = __ref._calc_wind(null,__ref._speed,__ref._swm,_swr,(float) (__ref._ecompass),__c.True);
RDebugUtils.currentLine=11075620;
 //BA.debugLineNum = 11075620;BA.debugLine="speed_bearing = compass";
__ref._speed_bearing = __ref._compass;
 }else {
RDebugUtils.currentLine=11075622;
 //BA.debugLineNum = 11075622;BA.debugLine="r = calc_wind( speed, swm, swR, bearing, True )";
_r = __ref._calc_wind(null,__ref._speed,__ref._swm,_swr,__ref._bearing,__c.True);
RDebugUtils.currentLine=11075623;
 //BA.debugLineNum = 11075623;BA.debugLine="speed_bearing = bearing";
__ref._speed_bearing = __ref._bearing;
 };
RDebugUtils.currentLine=11075625;
 //BA.debugLineNum = 11075625;BA.debugLine="awm = Round2( r.Get(\"modulo\"), 1 )";
__ref._awm = (float) (__c.Round2((double)(BA.ObjectToNumber(_r.Get((Object)("modulo")))),(int) (1)));
RDebugUtils.currentLine=11075626;
 //BA.debugLineNum = 11075626;BA.debugLine="awa = Round2( r.Get(\"angulo\"), 1 )";
__ref._awa = (float) (__c.Round2((double)(BA.ObjectToNumber(_r.Get((Object)("angulo")))),(int) (1)));
 }else {
RDebugUtils.currentLine=11075631;
 //BA.debugLineNum = 11075631;BA.debugLine="If speed_low Then";
if (__ref._speed_low) { 
RDebugUtils.currentLine=11075632;
 //BA.debugLineNum = 11075632;BA.debugLine="r = calc_wind( speed, anemo, vane-offset, compa";
_r = __ref._calc_wind(null,__ref._speed,__ref._anemo,(float) (__ref._vane-__ref._offset),__ref._compass,__c.False);
RDebugUtils.currentLine=11075633;
 //BA.debugLineNum = 11075633;BA.debugLine="speed_bearing = compass";
__ref._speed_bearing = __ref._compass;
 }else {
RDebugUtils.currentLine=11075635;
 //BA.debugLineNum = 11075635;BA.debugLine="r = calc_wind( speed, anemo, vane-offset, beari";
_r = __ref._calc_wind(null,__ref._speed,__ref._anemo,(float) (__ref._vane-__ref._offset),__ref._bearing,__c.False);
RDebugUtils.currentLine=11075636;
 //BA.debugLineNum = 11075636;BA.debugLine="speed_bearing = bearing";
__ref._speed_bearing = __ref._bearing;
 };
RDebugUtils.currentLine=11075638;
 //BA.debugLineNum = 11075638;BA.debugLine="If mean_sw Then";
if (__ref._mean_sw) { 
RDebugUtils.currentLine=11075641;
 //BA.debugLineNum = 11075641;BA.debugLine="awm = anemo";
__ref._awm = __ref._anemo;
RDebugUtils.currentLine=11075644;
 //BA.debugLineNum = 11075644;BA.debugLine="awa = vane-offset";
__ref._awa = (float) (__ref._vane-__ref._offset);
RDebugUtils.currentLine=11075648;
 //BA.debugLineNum = 11075648;BA.debugLine="twm = r.Get(\"modulo\")";
__ref._twm = (float)(BA.ObjectToNumber(_r.Get((Object)("modulo"))));
RDebugUtils.currentLine=11075651;
 //BA.debugLineNum = 11075651;BA.debugLine="twa = Round2( r.Get(\"angulo\"), 1 )";
__ref._twa = (float) (__c.Round2((double)(BA.ObjectToNumber(_r.Get((Object)("angulo")))),(int) (1)));
RDebugUtils.currentLine=11075654;
 //BA.debugLineNum = 11075654;BA.debugLine="twN = Round2( r.Get(\"windN\"), 1 )";
__ref._twn = (float) (__c.Round2((double)(BA.ObjectToNumber(_r.Get((Object)("windN")))),(int) (1)));
 }else {
RDebugUtils.currentLine=11075656;
 //BA.debugLineNum = 11075656;BA.debugLine="awm = anemo";
__ref._awm = __ref._anemo;
RDebugUtils.currentLine=11075657;
 //BA.debugLineNum = 11075657;BA.debugLine="awa =  vane-offset";
__ref._awa = (float) (__ref._vane-__ref._offset);
RDebugUtils.currentLine=11075659;
 //BA.debugLineNum = 11075659;BA.debugLine="twm = r.Get(\"modulo\")";
__ref._twm = (float)(BA.ObjectToNumber(_r.Get((Object)("modulo"))));
RDebugUtils.currentLine=11075660;
 //BA.debugLineNum = 11075660;BA.debugLine="twa = r.Get(\"angulo\")";
__ref._twa = (float)(BA.ObjectToNumber(_r.Get((Object)("angulo"))));
RDebugUtils.currentLine=11075661;
 //BA.debugLineNum = 11075661;BA.debugLine="twN = r.Get(\"windN\")";
__ref._twn = (float)(BA.ObjectToNumber(_r.Get((Object)("windN"))));
 };
 };
RDebugUtils.currentLine=11075666;
 //BA.debugLineNum = 11075666;BA.debugLine="End Sub";
return "";
}
public String  _initialize(com.calypsoinstruments.anemotracker.windcalcs __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="windcalcs";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=10813440;
 //BA.debugLineNum = 10813440;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=10813441;
 //BA.debugLineNum = 10813441;BA.debugLine="m_anemo.Initialize";
__ref._m_anemo.Initialize();
RDebugUtils.currentLine=10813442;
 //BA.debugLineNum = 10813442;BA.debugLine="m_x.Initialize";
__ref._m_x.Initialize();
RDebugUtils.currentLine=10813443;
 //BA.debugLineNum = 10813443;BA.debugLine="m_y.Initialize";
__ref._m_y.Initialize();
RDebugUtils.currentLine=10813444;
 //BA.debugLineNum = 10813444;BA.debugLine="speed = 0";
__ref._speed = (float) (0);
RDebugUtils.currentLine=10813445;
 //BA.debugLineNum = 10813445;BA.debugLine="anemo = 0";
__ref._anemo = (float) (0);
RDebugUtils.currentLine=10813446;
 //BA.debugLineNum = 10813446;BA.debugLine="vane = 0";
__ref._vane = (float) (0);
RDebugUtils.currentLine=10813447;
 //BA.debugLineNum = 10813447;BA.debugLine="bearing = 0";
__ref._bearing = (float) (0);
RDebugUtils.currentLine=10813448;
 //BA.debugLineNum = 10813448;BA.debugLine="offset = 0";
__ref._offset = (float) (0);
RDebugUtils.currentLine=10813449;
 //BA.debugLineNum = 10813449;BA.debugLine="simulated = False";
__ref._simulated = __c.False;
RDebugUtils.currentLine=10813452;
 //BA.debugLineNum = 10813452;BA.debugLine="mean_checked(True)";
__ref._mean_checked(null,__c.True);
RDebugUtils.currentLine=10813453;
 //BA.debugLineNum = 10813453;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _calc_wind(com.calypsoinstruments.anemotracker.windcalcs __ref,float _p_speed,float _p_anemo,float _p_vane,float _p_bearing,boolean _inverse) throws Exception{
__ref = this;
RDebugUtils.currentModule="windcalcs";
if (Debug.shouldDelegate(ba, "calc_wind"))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "calc_wind", new Object[] {_p_speed,_p_anemo,_p_vane,_p_bearing,_inverse}));}
anywheresoftware.b4a.objects.collections.Map _ret = null;
float _barco_x = 0f;
float _barco_y = 0f;
float _vientoap_x = 0f;
float _vientoap_y = 0f;
float _vientoreal_x = 0f;
float _vientoreal_y = 0f;
float _vientoreal_m = 0f;
float _vientoreal_a = 0f;
float _windn = 0f;
int _intermedio = 0;
RDebugUtils.currentLine=11206656;
 //BA.debugLineNum = 11206656;BA.debugLine="Sub calc_wind( p_speed As Float, p_anemo As Float,";
RDebugUtils.currentLine=11206657;
 //BA.debugLineNum = 11206657;BA.debugLine="Dim ret As Map";
_ret = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=11206658;
 //BA.debugLineNum = 11206658;BA.debugLine="Dim barco_x, barco_y, vientoap_x, vientoap_y As F";
_barco_x = 0f;
_barco_y = 0f;
_vientoap_x = 0f;
_vientoap_y = 0f;
RDebugUtils.currentLine=11206659;
 //BA.debugLineNum = 11206659;BA.debugLine="Dim vientoreal_x, vientoreal_y, vientoreal_m, vie";
_vientoreal_x = 0f;
_vientoreal_y = 0f;
_vientoreal_m = 0f;
_vientoreal_a = 0f;
_windn = 0f;
RDebugUtils.currentLine=11206660;
 //BA.debugLineNum = 11206660;BA.debugLine="Dim intermedio As Int";
_intermedio = 0;
RDebugUtils.currentLine=11206661;
 //BA.debugLineNum = 11206661;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=11206662;
 //BA.debugLineNum = 11206662;BA.debugLine="barco_x = p_speed";
_barco_x = _p_speed;
RDebugUtils.currentLine=11206663;
 //BA.debugLineNum = 11206663;BA.debugLine="barco_y = 0";
_barco_y = (float) (0);
RDebugUtils.currentLine=11206664;
 //BA.debugLineNum = 11206664;BA.debugLine="vientoap_x = p_anemo*CosD( -p_vane )";
_vientoap_x = (float) (_p_anemo*__c.CosD(-_p_vane));
RDebugUtils.currentLine=11206665;
 //BA.debugLineNum = 11206665;BA.debugLine="vientoap_y = p_anemo*SinD( -p_vane )";
_vientoap_y = (float) (_p_anemo*__c.SinD(-_p_vane));
RDebugUtils.currentLine=11206666;
 //BA.debugLineNum = 11206666;BA.debugLine="If( inverse ) Then";
if ((_inverse)) { 
RDebugUtils.currentLine=11206668;
 //BA.debugLineNum = 11206668;BA.debugLine="vientoreal_x = vientoap_x + barco_x";
_vientoreal_x = (float) (_vientoap_x+_barco_x);
RDebugUtils.currentLine=11206669;
 //BA.debugLineNum = 11206669;BA.debugLine="vientoreal_y = vientoap_y + barco_y";
_vientoreal_y = (float) (_vientoap_y+_barco_y);
RDebugUtils.currentLine=11206670;
 //BA.debugLineNum = 11206670;BA.debugLine="vientoreal_a = -ATan2D( vientoreal_y , vientorea";
_vientoreal_a = (float) (-__c.ATan2D(_vientoreal_y,_vientoreal_x));
RDebugUtils.currentLine=11206671;
 //BA.debugLineNum = 11206671;BA.debugLine="vientoreal_m = Sqrt( vientoreal_x*vientoreal_x +";
_vientoreal_m = (float) (__c.Sqrt(_vientoreal_x*_vientoreal_x+_vientoreal_y*_vientoreal_y));
RDebugUtils.currentLine=11206672;
 //BA.debugLineNum = 11206672;BA.debugLine="intermedio = 360 + vientoreal_a";
_intermedio = (int) (360+_vientoreal_a);
RDebugUtils.currentLine=11206673;
 //BA.debugLineNum = 11206673;BA.debugLine="vientoreal_a = intermedio Mod 360";
_vientoreal_a = (float) (_intermedio%360);
 }else {
RDebugUtils.currentLine=11206675;
 //BA.debugLineNum = 11206675;BA.debugLine="vientoreal_x = vientoap_x - barco_x";
_vientoreal_x = (float) (_vientoap_x-_barco_x);
RDebugUtils.currentLine=11206676;
 //BA.debugLineNum = 11206676;BA.debugLine="vientoreal_y = vientoap_y - barco_y";
_vientoreal_y = (float) (_vientoap_y-_barco_y);
RDebugUtils.currentLine=11206677;
 //BA.debugLineNum = 11206677;BA.debugLine="vientoreal_a = -ATan2D( vientoreal_y , vientorea";
_vientoreal_a = (float) (-__c.ATan2D(_vientoreal_y,_vientoreal_x));
RDebugUtils.currentLine=11206678;
 //BA.debugLineNum = 11206678;BA.debugLine="intermedio = 360+vientoreal_a";
_intermedio = (int) (360+_vientoreal_a);
RDebugUtils.currentLine=11206679;
 //BA.debugLineNum = 11206679;BA.debugLine="vientoreal_a = intermedio Mod 360";
_vientoreal_a = (float) (_intermedio%360);
RDebugUtils.currentLine=11206680;
 //BA.debugLineNum = 11206680;BA.debugLine="If p_speed = 0 Then";
if (_p_speed==0) { 
RDebugUtils.currentLine=11206681;
 //BA.debugLineNum = 11206681;BA.debugLine="vientoreal_a = p_vane";
_vientoreal_a = _p_vane;
 };
RDebugUtils.currentLine=11206683;
 //BA.debugLineNum = 11206683;BA.debugLine="vientoreal_m = Sqrt( vientoreal_x*vientoreal_x +";
_vientoreal_m = (float) (__c.Sqrt(_vientoreal_x*_vientoreal_x+_vientoreal_y*_vientoreal_y));
 };
RDebugUtils.currentLine=11206687;
 //BA.debugLineNum = 11206687;BA.debugLine="ret.Put( \"x\", vientoap_x )";
_ret.Put((Object)("x"),(Object)(_vientoap_x));
RDebugUtils.currentLine=11206688;
 //BA.debugLineNum = 11206688;BA.debugLine="ret.Put( \"y\", vientoap_y )";
_ret.Put((Object)("y"),(Object)(_vientoap_y));
RDebugUtils.currentLine=11206689;
 //BA.debugLineNum = 11206689;BA.debugLine="ret.Put( \"modulo\", vientoreal_m )";
_ret.Put((Object)("modulo"),(Object)(_vientoreal_m));
RDebugUtils.currentLine=11206690;
 //BA.debugLineNum = 11206690;BA.debugLine="ret.Put( \"angulo\", vientoreal_a )";
_ret.Put((Object)("angulo"),(Object)(_vientoreal_a));
RDebugUtils.currentLine=11206691;
 //BA.debugLineNum = 11206691;BA.debugLine="intermedio = ( vientoreal_a + p_bearing )";
_intermedio = (int) ((_vientoreal_a+_p_bearing));
RDebugUtils.currentLine=11206692;
 //BA.debugLineNum = 11206692;BA.debugLine="windN = (intermedio + 360 ) Mod 360";
_windn = (float) ((_intermedio+360)%360);
RDebugUtils.currentLine=11206693;
 //BA.debugLineNum = 11206693;BA.debugLine="ret.Put( \"windN\", windN )";
_ret.Put((Object)("windN"),(Object)(_windn));
RDebugUtils.currentLine=11206694;
 //BA.debugLineNum = 11206694;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=11206695;
 //BA.debugLineNum = 11206695;BA.debugLine="End Sub";
return null;
}
public String  _calc_anemo(com.calypsoinstruments.anemotracker.windcalcs __ref,float _v_anemo,float _v_vane) throws Exception{
__ref = this;
RDebugUtils.currentModule="windcalcs";
if (Debug.shouldDelegate(ba, "calc_anemo"))
	 {return ((String) Debug.delegate(ba, "calc_anemo", new Object[] {_v_anemo,_v_vane}));}
int _intermedio = 0;
int _n_samples = 0;
int _j = 0;
int _i = 0;
float _media_x = 0f;
float _media_y = 0f;
anywheresoftware.b4a.objects.collections.List _o_anemo = null;
RDebugUtils.currentLine=11010048;
 //BA.debugLineNum = 11010048;BA.debugLine="Sub calc_anemo( v_anemo As Float, v_vane As Float";
RDebugUtils.currentLine=11010051;
 //BA.debugLineNum = 11010051;BA.debugLine="Dim intermedio As Int";
_intermedio = 0;
RDebugUtils.currentLine=11010052;
 //BA.debugLineNum = 11010052;BA.debugLine="Dim n_samples As Int";
_n_samples = 0;
RDebugUtils.currentLine=11010053;
 //BA.debugLineNum = 11010053;BA.debugLine="If mean_sw Then	' Cojo 25 valores";
if (__ref._mean_sw) { 
RDebugUtils.currentLine=11010054;
 //BA.debugLineNum = 11010054;BA.debugLine="n_samples = 300 '25";
_n_samples = (int) (300);
 }else {
RDebugUtils.currentLine=11010056;
 //BA.debugLineNum = 11010056;BA.debugLine="n_samples = 5";
_n_samples = (int) (5);
 };
RDebugUtils.currentLine=11010058;
 //BA.debugLineNum = 11010058;BA.debugLine="If m_anemo.Size >= n_samples Then";
if (__ref._m_anemo.getSize()>=_n_samples) { 
RDebugUtils.currentLine=11010059;
 //BA.debugLineNum = 11010059;BA.debugLine="Dim j= (m_anemo.Size - n_samples)  As Int";
_j = (int) ((__ref._m_anemo.getSize()-_n_samples));
RDebugUtils.currentLine=11010060;
 //BA.debugLineNum = 11010060;BA.debugLine="For i=0 To j";
{
final int step10 = 1;
final int limit10 = _j;
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=11010062;
 //BA.debugLineNum = 11010062;BA.debugLine="m_anemo.RemoveAt(0)";
__ref._m_anemo.RemoveAt((int) (0));
RDebugUtils.currentLine=11010063;
 //BA.debugLineNum = 11010063;BA.debugLine="m_x.RemoveAt(0)";
__ref._m_x.RemoveAt((int) (0));
RDebugUtils.currentLine=11010064;
 //BA.debugLineNum = 11010064;BA.debugLine="m_y.RemoveAt(0)";
__ref._m_y.RemoveAt((int) (0));
 }
};
 };
RDebugUtils.currentLine=11010067;
 //BA.debugLineNum = 11010067;BA.debugLine="m_anemo.Add( v_anemo )";
__ref._m_anemo.Add((Object)(_v_anemo));
RDebugUtils.currentLine=11010068;
 //BA.debugLineNum = 11010068;BA.debugLine="m_x.Add( v_anemo*CosD( -v_vane ) )";
__ref._m_x.Add((Object)(_v_anemo*__c.CosD(-_v_vane)));
RDebugUtils.currentLine=11010069;
 //BA.debugLineNum = 11010069;BA.debugLine="m_y.Add( v_anemo*SinD( -v_vane ) )";
__ref._m_y.Add((Object)(_v_anemo*__c.SinD(-_v_vane)));
RDebugUtils.currentLine=11010070;
 //BA.debugLineNum = 11010070;BA.debugLine="Dim media_x=0, media_y=0 As Float";
_media_x = (float) (0);
_media_y = (float) (0);
RDebugUtils.currentLine=11010071;
 //BA.debugLineNum = 11010071;BA.debugLine="For i=0 To m_x.Size-1";
{
final int step20 = 1;
final int limit20 = (int) (__ref._m_x.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit20 ;_i = _i + step20 ) {
RDebugUtils.currentLine=11010072;
 //BA.debugLineNum = 11010072;BA.debugLine="media_x = media_x + m_x.Get(i)";
_media_x = (float) (_media_x+(double)(BA.ObjectToNumber(__ref._m_x.Get(_i))));
RDebugUtils.currentLine=11010073;
 //BA.debugLineNum = 11010073;BA.debugLine="media_y = media_y + m_y.Get(i)";
_media_y = (float) (_media_y+(double)(BA.ObjectToNumber(__ref._m_y.Get(_i))));
 }
};
RDebugUtils.currentLine=11010075;
 //BA.debugLineNum = 11010075;BA.debugLine="media_x = media_x / m_x.Size";
_media_x = (float) (_media_x/(double)__ref._m_x.getSize());
RDebugUtils.currentLine=11010076;
 //BA.debugLineNum = 11010076;BA.debugLine="media_y = media_y / m_y.Size";
_media_y = (float) (_media_y/(double)__ref._m_y.getSize());
RDebugUtils.currentLine=11010077;
 //BA.debugLineNum = 11010077;BA.debugLine="vane = ATan2D( media_y, media_x )";
__ref._vane = (float) (__c.ATan2D(_media_y,_media_x));
RDebugUtils.currentLine=11010078;
 //BA.debugLineNum = 11010078;BA.debugLine="intermedio = 360 + vane";
_intermedio = (int) (360+__ref._vane);
RDebugUtils.currentLine=11010079;
 //BA.debugLineNum = 11010079;BA.debugLine="vane = intermedio Mod 360";
__ref._vane = (float) (_intermedio%360);
RDebugUtils.currentLine=11010082;
 //BA.debugLineNum = 11010082;BA.debugLine="Dim o_anemo As List";
_o_anemo = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=11010083;
 //BA.debugLineNum = 11010083;BA.debugLine="o_anemo.Initialize";
_o_anemo.Initialize();
RDebugUtils.currentLine=11010084;
 //BA.debugLineNum = 11010084;BA.debugLine="o_anemo.AddAll( m_anemo )";
_o_anemo.AddAll(__ref._m_anemo);
RDebugUtils.currentLine=11010085;
 //BA.debugLineNum = 11010085;BA.debugLine="o_anemo.Sort(True)";
_o_anemo.Sort(__c.True);
RDebugUtils.currentLine=11010097;
 //BA.debugLineNum = 11010097;BA.debugLine="anemo = o_anemo.Get( o_anemo.Size/2 )";
__ref._anemo = (float)(BA.ObjectToNumber(_o_anemo.Get((int) (_o_anemo.getSize()/(double)2))));
RDebugUtils.currentLine=11010100;
 //BA.debugLineNum = 11010100;BA.debugLine="End Sub";
return "";
}
public float  _updateestimate(com.calypsoinstruments.anemotracker.windcalcs __ref,float _mea,com.calypsoinstruments.anemotracker.windcalcs._tkalman _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="windcalcs";
if (Debug.shouldDelegate(ba, "updateestimate"))
	 {return ((Float) Debug.delegate(ba, "updateestimate", new Object[] {_mea,_k}));}
RDebugUtils.currentLine=11272192;
 //BA.debugLineNum = 11272192;BA.debugLine="Sub updateEstimate(mea As Float, k As tKalman) As";
RDebugUtils.currentLine=11272194;
 //BA.debugLineNum = 11272194;BA.debugLine="k.kalman_gain = k.err_estimate/(k.err_estimate +";
_k.kalman_gain = (float) (_k.err_estimate/(double)(_k.err_estimate+_k.err_measure));
RDebugUtils.currentLine=11272195;
 //BA.debugLineNum = 11272195;BA.debugLine="k.current_estimate = k.last_estimate + k.kalman_";
_k.current_estimate = (float) (_k.last_estimate+_k.kalman_gain*(_mea-_k.last_estimate));
RDebugUtils.currentLine=11272196;
 //BA.debugLineNum = 11272196;BA.debugLine="k.err_estimate =  (1.0 - k.kalman_gain)*k.err_es";
_k.err_estimate = (float) ((1.0-_k.kalman_gain)*_k.err_estimate+__c.Abs(_k.last_estimate-_k.current_estimate)*_k.q);
RDebugUtils.currentLine=11272197;
 //BA.debugLineNum = 11272197;BA.debugLine="k.last_estimate=k.current_estimate";
_k.last_estimate = _k.current_estimate;
RDebugUtils.currentLine=11272199;
 //BA.debugLineNum = 11272199;BA.debugLine="Return k.current_estimate";
if (true) return _k.current_estimate;
RDebugUtils.currentLine=11272200;
 //BA.debugLineNum = 11272200;BA.debugLine="End Sub";
return 0f;
}
public String  _class_globals(com.calypsoinstruments.anemotracker.windcalcs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="windcalcs";
RDebugUtils.currentLine=10747904;
 //BA.debugLineNum = 10747904;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=10747905;
 //BA.debugLineNum = 10747905;BA.debugLine="Dim orig_vane =0, orig_anemo=0 As Float";
_orig_vane = (float) (0);
_orig_anemo = (float) (0);
RDebugUtils.currentLine=10747906;
 //BA.debugLineNum = 10747906;BA.debugLine="Dim vane As Float = 0";
_vane = (float) (0);
RDebugUtils.currentLine=10747907;
 //BA.debugLineNum = 10747907;BA.debugLine="Dim anemo As Float = 0";
_anemo = (float) (0);
RDebugUtils.currentLine=10747909;
 //BA.debugLineNum = 10747909;BA.debugLine="Dim speed As Float = 0";
_speed = (float) (0);
RDebugUtils.currentLine=10747910;
 //BA.debugLineNum = 10747910;BA.debugLine="Dim bearing As Float = 0";
_bearing = (float) (0);
RDebugUtils.currentLine=10747911;
 //BA.debugLineNum = 10747911;BA.debugLine="Dim latitude As Float";
_latitude = 0f;
RDebugUtils.currentLine=10747912;
 //BA.debugLineNum = 10747912;BA.debugLine="Dim longitude As Float";
_longitude = 0f;
RDebugUtils.currentLine=10747913;
 //BA.debugLineNum = 10747913;BA.debugLine="Dim altitude As Float";
_altitude = 0f;
RDebugUtils.currentLine=10747915;
 //BA.debugLineNum = 10747915;BA.debugLine="Dim compass As Float";
_compass = 0f;
RDebugUtils.currentLine=10747917;
 //BA.debugLineNum = 10747917;BA.debugLine="Dim awm, awa, twm, twa, twN As Float = 0";
_awm = 0f;
_awa = 0f;
_twm = 0f;
_twa = 0f;
_twn = (float) (0);
RDebugUtils.currentLine=10747919;
 //BA.debugLineNum = 10747919;BA.debugLine="Dim simulated As Boolean";
_simulated = false;
RDebugUtils.currentLine=10747920;
 //BA.debugLineNum = 10747920;BA.debugLine="Dim swm, swa As Float";
_swm = 0f;
_swa = 0f;
RDebugUtils.currentLine=10747921;
 //BA.debugLineNum = 10747921;BA.debugLine="Dim knots As Float = 0";
_knots = (float) (0);
RDebugUtils.currentLine=10747923;
 //BA.debugLineNum = 10747923;BA.debugLine="Dim speed_min As Float = 2.0";
_speed_min = (float) (2.0);
RDebugUtils.currentLine=10747924;
 //BA.debugLineNum = 10747924;BA.debugLine="Dim speed_sw As Boolean = True";
_speed_sw = __c.True;
RDebugUtils.currentLine=10747925;
 //BA.debugLineNum = 10747925;BA.debugLine="Dim speed_low As Boolean = False";
_speed_low = __c.False;
RDebugUtils.currentLine=10747926;
 //BA.debugLineNum = 10747926;BA.debugLine="Dim speed_bearing As Float = 0.0  ' Bearing según";
_speed_bearing = (float) (0.0);
RDebugUtils.currentLine=10747928;
 //BA.debugLineNum = 10747928;BA.debugLine="Dim mean_sw As Boolean = True";
_mean_sw = __c.True;
RDebugUtils.currentLine=10747929;
 //BA.debugLineNum = 10747929;BA.debugLine="Dim offset As Float";
_offset = 0f;
RDebugUtils.currentLine=10747931;
 //BA.debugLineNum = 10747931;BA.debugLine="Dim m_anemo As List";
_m_anemo = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=10747932;
 //BA.debugLineNum = 10747932;BA.debugLine="Dim m_x, m_y As List";
_m_x = new anywheresoftware.b4a.objects.collections.List();
_m_y = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=10747933;
 //BA.debugLineNum = 10747933;BA.debugLine="Dim battery, temp, roll, pitch, ecompass As Int";
_battery = 0;
_temp = 0;
_roll = 0;
_pitch = 0;
_ecompass = 0;
RDebugUtils.currentLine=10747935;
 //BA.debugLineNum = 10747935;BA.debugLine="Type tKalman(err_measure As Float, err_estimate A";
;
RDebugUtils.currentLine=10747936;
 //BA.debugLineNum = 10747936;BA.debugLine="Type tKalman2( xk As Float, pk As Float, R As Flo";
;
RDebugUtils.currentLine=10747937;
 //BA.debugLineNum = 10747937;BA.debugLine="Type tKalman3( q As Float, r As Float, x As Float";
;
RDebugUtils.currentLine=10747943;
 //BA.debugLineNum = 10747943;BA.debugLine="Dim kX,kY As tKalman";
_kx = new com.calypsoinstruments.anemotracker.windcalcs._tkalman();
_ky = new com.calypsoinstruments.anemotracker.windcalcs._tkalman();
RDebugUtils.currentLine=10747944;
 //BA.debugLineNum = 10747944;BA.debugLine="Dim kX2, kY2 As tKalman2";
_kx2 = new com.calypsoinstruments.anemotracker.windcalcs._tkalman2();
_ky2 = new com.calypsoinstruments.anemotracker.windcalcs._tkalman2();
RDebugUtils.currentLine=10747945;
 //BA.debugLineNum = 10747945;BA.debugLine="Dim kX3, kY3 As tKalman3";
_kx3 = new com.calypsoinstruments.anemotracker.windcalcs._tkalman3();
_ky3 = new com.calypsoinstruments.anemotracker.windcalcs._tkalman3();
RDebugUtils.currentLine=10747946;
 //BA.debugLineNum = 10747946;BA.debugLine="Dim refresh_hz = 1.0 As Float";
_refresh_hz = (float) (1.0);
RDebugUtils.currentLine=10747947;
 //BA.debugLineNum = 10747947;BA.debugLine="Dim selected_compass As Float";
_selected_compass = 0f;
RDebugUtils.currentLine=10747949;
 //BA.debugLineNum = 10747949;BA.debugLine="End Sub";
return "";
}
public String  _test_calc(com.calypsoinstruments.anemotracker.windcalcs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="windcalcs";
if (Debug.shouldDelegate(ba, "test_calc"))
	 {return ((String) Debug.delegate(ba, "test_calc", null));}
String _results = "";
anywheresoftware.b4a.objects.collections.Map _r = null;
RDebugUtils.currentLine=11141120;
 //BA.debugLineNum = 11141120;BA.debugLine="Sub test_calc";
RDebugUtils.currentLine=11141125;
 //BA.debugLineNum = 11141125;BA.debugLine="Dim results As String";
_results = "";
RDebugUtils.currentLine=11141126;
 //BA.debugLineNum = 11141126;BA.debugLine="Dim r As Map";
_r = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=11141128;
 //BA.debugLineNum = 11141128;BA.debugLine="r = calc_wind( 1, 1, 0, 0, False )";
_r = __ref._calc_wind(null,(float) (1),(float) (1),(float) (0),(float) (0),__c.False);
RDebugUtils.currentLine=11141129;
 //BA.debugLineNum = 11141129;BA.debugLine="results = results & r.Get( \"modulo\") & \", \" & r.";
_results = _results+BA.ObjectToString(_r.Get((Object)("modulo")))+", "+BA.ObjectToString(_r.Get((Object)("angulo")))+"\\n";
RDebugUtils.currentLine=11141131;
 //BA.debugLineNum = 11141131;BA.debugLine="r = calc_wind( 1, 1, 45, 0, False )";
_r = __ref._calc_wind(null,(float) (1),(float) (1),(float) (45),(float) (0),__c.False);
RDebugUtils.currentLine=11141132;
 //BA.debugLineNum = 11141132;BA.debugLine="results = results & r.Get( \"modulo\") & \", \" & r.";
_results = _results+BA.ObjectToString(_r.Get((Object)("modulo")))+", "+BA.ObjectToString(_r.Get((Object)("angulo")))+"\\n";
RDebugUtils.currentLine=11141134;
 //BA.debugLineNum = 11141134;BA.debugLine="r = calc_wind( 1, 1, 90, 0, False )";
_r = __ref._calc_wind(null,(float) (1),(float) (1),(float) (90),(float) (0),__c.False);
RDebugUtils.currentLine=11141135;
 //BA.debugLineNum = 11141135;BA.debugLine="results = results & r.Get( \"modulo\") & \", \" & r.";
_results = _results+BA.ObjectToString(_r.Get((Object)("modulo")))+", "+BA.ObjectToString(_r.Get((Object)("angulo")))+"\\n";
RDebugUtils.currentLine=11141137;
 //BA.debugLineNum = 11141137;BA.debugLine="r = calc_wind( 1, 1, 135, 0, False )";
_r = __ref._calc_wind(null,(float) (1),(float) (1),(float) (135),(float) (0),__c.False);
RDebugUtils.currentLine=11141138;
 //BA.debugLineNum = 11141138;BA.debugLine="results = results & r.Get( \"modulo\") & \", \" & r.";
_results = _results+BA.ObjectToString(_r.Get((Object)("modulo")))+", "+BA.ObjectToString(_r.Get((Object)("angulo")))+"\\n";
RDebugUtils.currentLine=11141140;
 //BA.debugLineNum = 11141140;BA.debugLine="r = calc_wind( 1, 1, 180, 0, False )";
_r = __ref._calc_wind(null,(float) (1),(float) (1),(float) (180),(float) (0),__c.False);
RDebugUtils.currentLine=11141141;
 //BA.debugLineNum = 11141141;BA.debugLine="results = results & r.Get( \"modulo\") & \", \" & r.";
_results = _results+BA.ObjectToString(_r.Get((Object)("modulo")))+", "+BA.ObjectToString(_r.Get((Object)("angulo")))+"\\n";
RDebugUtils.currentLine=11141143;
 //BA.debugLineNum = 11141143;BA.debugLine="r = calc_wind( 1, 1, 225, 0, False )";
_r = __ref._calc_wind(null,(float) (1),(float) (1),(float) (225),(float) (0),__c.False);
RDebugUtils.currentLine=11141144;
 //BA.debugLineNum = 11141144;BA.debugLine="results = results & r.Get( \"modulo\") & \", \" & r.";
_results = _results+BA.ObjectToString(_r.Get((Object)("modulo")))+", "+BA.ObjectToString(_r.Get((Object)("angulo")))+"\\n";
RDebugUtils.currentLine=11141146;
 //BA.debugLineNum = 11141146;BA.debugLine="r = calc_wind( 1, 1, 270, 0, False )";
_r = __ref._calc_wind(null,(float) (1),(float) (1),(float) (270),(float) (0),__c.False);
RDebugUtils.currentLine=11141147;
 //BA.debugLineNum = 11141147;BA.debugLine="results = results & r.Get( \"modulo\") & \", \" & r.";
_results = _results+BA.ObjectToString(_r.Get((Object)("modulo")))+", "+BA.ObjectToString(_r.Get((Object)("angulo")))+"\\n";
RDebugUtils.currentLine=11141149;
 //BA.debugLineNum = 11141149;BA.debugLine="r = calc_wind( 1, 1, 315, 0, False )";
_r = __ref._calc_wind(null,(float) (1),(float) (1),(float) (315),(float) (0),__c.False);
RDebugUtils.currentLine=11141150;
 //BA.debugLineNum = 11141150;BA.debugLine="results = results & r.Get( \"modulo\") & \", \" & r.";
_results = _results+BA.ObjectToString(_r.Get((Object)("modulo")))+", "+BA.ObjectToString(_r.Get((Object)("angulo")))+"\\n";
RDebugUtils.currentLine=11141152;
 //BA.debugLineNum = 11141152;BA.debugLine="r = calc_wind( 1, 1, 360, 0, False )";
_r = __ref._calc_wind(null,(float) (1),(float) (1),(float) (360),(float) (0),__c.False);
RDebugUtils.currentLine=11141153;
 //BA.debugLineNum = 11141153;BA.debugLine="results = results & r.Get( \"modulo\") & \", \" & r.";
_results = _results+BA.ObjectToString(_r.Get((Object)("modulo")))+", "+BA.ObjectToString(_r.Get((Object)("angulo")))+"\\n";
RDebugUtils.currentLine=11141162;
 //BA.debugLineNum = 11141162;BA.debugLine="End Sub";
return "";
}
public float  _updateestimate2(com.calypsoinstruments.anemotracker.windcalcs __ref,float _mea,com.calypsoinstruments.anemotracker.windcalcs._tkalman2 _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="windcalcs";
if (Debug.shouldDelegate(ba, "updateestimate2"))
	 {return ((Float) Debug.delegate(ba, "updateestimate2", new Object[] {_mea,_k}));}
RDebugUtils.currentLine=11337728;
 //BA.debugLineNum = 11337728;BA.debugLine="Sub updateEstimate2( mea As Float, k As tKalman2";
RDebugUtils.currentLine=11337731;
 //BA.debugLineNum = 11337731;BA.debugLine="k.xk = k.xk + k.pk/(k.pk+1)*(mea-k.xk)";
_k.xk = (float) (_k.xk+_k.pk/(double)(_k.pk+1)*(_mea-_k.xk));
RDebugUtils.currentLine=11337732;
 //BA.debugLineNum = 11337732;BA.debugLine="k.pk = k.pk/(1+k.pk)";
_k.pk = (float) (_k.pk/(double)(1+_k.pk));
RDebugUtils.currentLine=11337734;
 //BA.debugLineNum = 11337734;BA.debugLine="Return k.xk";
if (true) return _k.xk;
RDebugUtils.currentLine=11337736;
 //BA.debugLineNum = 11337736;BA.debugLine="End Sub";
return 0f;
}
public float  _updateestimate3(com.calypsoinstruments.anemotracker.windcalcs __ref,float _mea,com.calypsoinstruments.anemotracker.windcalcs._tkalman3 _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="windcalcs";
if (Debug.shouldDelegate(ba, "updateestimate3"))
	 {return ((Float) Debug.delegate(ba, "updateestimate3", new Object[] {_mea,_k}));}
RDebugUtils.currentLine=11403264;
 //BA.debugLineNum = 11403264;BA.debugLine="Sub updateEstimate3( mea As Float, k As tKalman3 )";
RDebugUtils.currentLine=11403265;
 //BA.debugLineNum = 11403265;BA.debugLine="k.p = k.p + k.q";
_k.p = (float) (_k.p+_k.q);
RDebugUtils.currentLine=11403268;
 //BA.debugLineNum = 11403268;BA.debugLine="k.k = k.p / (k.p + k.r)";
_k.k = (float) (_k.p/(double)(_k.p+_k.r));
RDebugUtils.currentLine=11403269;
 //BA.debugLineNum = 11403269;BA.debugLine="k.x = k.x + k.k * (mea - k.x)";
_k.x = (float) (_k.x+_k.k*(_mea-_k.x));
RDebugUtils.currentLine=11403270;
 //BA.debugLineNum = 11403270;BA.debugLine="k.p = (1 - k.k) * k.p";
_k.p = (float) ((1-_k.k)*_k.p);
RDebugUtils.currentLine=11403272;
 //BA.debugLineNum = 11403272;BA.debugLine="Return k.x";
if (true) return _k.x;
RDebugUtils.currentLine=11403274;
 //BA.debugLineNum = 11403274;BA.debugLine="End Sub";
return 0f;
}
}