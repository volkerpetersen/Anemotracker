package com.calypsoinstruments.anemotracker;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class windcalcs_subs_0 {


public static RemoteObject  _calc(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("calc (windcalcs) ","windcalcs",8,__ref.getField(false, "ba"),__ref,204);
if (RapidSub.canDelegate("calc")) { return __ref.runUserSub(false, "windcalcs","calc", __ref);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _swr = RemoteObject.createImmutable(0f);
 BA.debugLineNum = 204;BA.debugLine="Sub calc";
Debug.ShouldStop(2048);
 BA.debugLineNum = 207;BA.debugLine="Dim r As Map";
Debug.ShouldStop(16384);
_r = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("r", _r);
 BA.debugLineNum = 210;BA.debugLine="If speed_sw Then";
Debug.ShouldStop(131072);
if (__ref.getField(true,"_speed_sw").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 211;BA.debugLine="If knots <= speed_min  Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("k",__ref.getField(true,"_knots"),BA.numberCast(double.class, __ref.getField(true,"_speed_min")))) { 
 BA.debugLineNum = 212;BA.debugLine="speed_low = True";
Debug.ShouldStop(524288);
__ref.setField ("_speed_low",windcalcs.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 214;BA.debugLine="speed_low = False";
Debug.ShouldStop(2097152);
__ref.setField ("_speed_low",windcalcs.__c.getField(true,"False"));
 };
 }else {
 BA.debugLineNum = 217;BA.debugLine="speed_low = False";
Debug.ShouldStop(16777216);
__ref.setField ("_speed_low",windcalcs.__c.getField(true,"False"));
 };
 BA.debugLineNum = 223;BA.debugLine="If simulated Then";
Debug.ShouldStop(1073741824);
if (__ref.getField(true,"_simulated").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 229;BA.debugLine="Dim swR As Float";
Debug.ShouldStop(16);
_swr = RemoteObject.createImmutable(0f);Debug.locals.put("swR", _swr);
 BA.debugLineNum = 230;BA.debugLine="swR = swa - bearing";
Debug.ShouldStop(32);
_swr = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_swa"),__ref.getField(true,"_bearing")}, "-",1, 0));Debug.locals.put("swR", _swr);
 BA.debugLineNum = 231;BA.debugLine="If swR < 0 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("<",_swr,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 232;BA.debugLine="swR = swR + 360 ' importante el + porque swN es";
Debug.ShouldStop(128);
_swr = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_swr,RemoteObject.createImmutable(360)}, "+",1, 0));Debug.locals.put("swR", _swr);
 };
 BA.debugLineNum = 234;BA.debugLine="twm = Round2( swm, 1 )";
Debug.ShouldStop(512);
__ref.setField ("_twm",BA.numberCast(float.class, windcalcs.__c.runMethod(true,"Round2",(Object)(BA.numberCast(double.class, __ref.getField(true,"_swm"))),(Object)(BA.numberCast(int.class, 1)))));
 BA.debugLineNum = 235;BA.debugLine="twa = Round2( swR, 1 )";
Debug.ShouldStop(1024);
__ref.setField ("_twa",BA.numberCast(float.class, windcalcs.__c.runMethod(true,"Round2",(Object)(BA.numberCast(double.class, _swr)),(Object)(BA.numberCast(int.class, 1)))));
 BA.debugLineNum = 236;BA.debugLine="twN = Round2( twa , 1 ) ' respecto al norte ya e";
Debug.ShouldStop(2048);
__ref.setField ("_twn",BA.numberCast(float.class, windcalcs.__c.runMethod(true,"Round2",(Object)(BA.numberCast(double.class, __ref.getField(true,"_twa"))),(Object)(BA.numberCast(int.class, 1)))));
 BA.debugLineNum = 237;BA.debugLine="If speed_low Then";
Debug.ShouldStop(4096);
if (__ref.getField(true,"_speed_low").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 239;BA.debugLine="r = calc_wind( speed, swm, swR, ecompass, True";
Debug.ShouldStop(16384);
_r = __ref.runClassMethod (com.calypsoinstruments.anemotracker.windcalcs.class, "_calc_wind",(Object)(__ref.getField(true,"_speed")),(Object)(__ref.getField(true,"_swm")),(Object)(_swr),(Object)(BA.numberCast(float.class, __ref.getField(true,"_ecompass"))),(Object)(windcalcs.__c.getField(true,"True")));Debug.locals.put("r", _r);
 BA.debugLineNum = 240;BA.debugLine="speed_bearing = compass";
Debug.ShouldStop(32768);
__ref.setField ("_speed_bearing",__ref.getField(true,"_compass"));
 }else {
 BA.debugLineNum = 242;BA.debugLine="r = calc_wind( speed, swm, swR, bearing, True )";
Debug.ShouldStop(131072);
_r = __ref.runClassMethod (com.calypsoinstruments.anemotracker.windcalcs.class, "_calc_wind",(Object)(__ref.getField(true,"_speed")),(Object)(__ref.getField(true,"_swm")),(Object)(_swr),(Object)(__ref.getField(true,"_bearing")),(Object)(windcalcs.__c.getField(true,"True")));Debug.locals.put("r", _r);
 BA.debugLineNum = 243;BA.debugLine="speed_bearing = bearing";
Debug.ShouldStop(262144);
__ref.setField ("_speed_bearing",__ref.getField(true,"_bearing"));
 };
 BA.debugLineNum = 245;BA.debugLine="awm = Round2( r.Get(\"modulo\"), 1 )";
Debug.ShouldStop(1048576);
__ref.setField ("_awm",BA.numberCast(float.class, windcalcs.__c.runMethod(true,"Round2",(Object)(BA.numberCast(double.class, _r.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("modulo")))))),(Object)(BA.numberCast(int.class, 1)))));
 BA.debugLineNum = 246;BA.debugLine="awa = Round2( r.Get(\"angulo\"), 1 )";
Debug.ShouldStop(2097152);
__ref.setField ("_awa",BA.numberCast(float.class, windcalcs.__c.runMethod(true,"Round2",(Object)(BA.numberCast(double.class, _r.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("angulo")))))),(Object)(BA.numberCast(int.class, 1)))));
 }else {
 BA.debugLineNum = 251;BA.debugLine="If speed_low Then";
Debug.ShouldStop(67108864);
if (__ref.getField(true,"_speed_low").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 252;BA.debugLine="r = calc_wind( speed, anemo, vane-offset, compa";
Debug.ShouldStop(134217728);
_r = __ref.runClassMethod (com.calypsoinstruments.anemotracker.windcalcs.class, "_calc_wind",(Object)(__ref.getField(true,"_speed")),(Object)(__ref.getField(true,"_anemo")),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_vane"),__ref.getField(true,"_offset")}, "-",1, 0))),(Object)(__ref.getField(true,"_compass")),(Object)(windcalcs.__c.getField(true,"False")));Debug.locals.put("r", _r);
 BA.debugLineNum = 253;BA.debugLine="speed_bearing = compass";
Debug.ShouldStop(268435456);
__ref.setField ("_speed_bearing",__ref.getField(true,"_compass"));
 }else {
 BA.debugLineNum = 255;BA.debugLine="r = calc_wind( speed, anemo, vane-offset, beari";
Debug.ShouldStop(1073741824);
_r = __ref.runClassMethod (com.calypsoinstruments.anemotracker.windcalcs.class, "_calc_wind",(Object)(__ref.getField(true,"_speed")),(Object)(__ref.getField(true,"_anemo")),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_vane"),__ref.getField(true,"_offset")}, "-",1, 0))),(Object)(__ref.getField(true,"_bearing")),(Object)(windcalcs.__c.getField(true,"False")));Debug.locals.put("r", _r);
 BA.debugLineNum = 256;BA.debugLine="speed_bearing = bearing";
Debug.ShouldStop(-2147483648);
__ref.setField ("_speed_bearing",__ref.getField(true,"_bearing"));
 };
 BA.debugLineNum = 258;BA.debugLine="If mean_sw Then";
Debug.ShouldStop(2);
if (__ref.getField(true,"_mean_sw").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 261;BA.debugLine="awm = anemo";
Debug.ShouldStop(16);
__ref.setField ("_awm",__ref.getField(true,"_anemo"));
 BA.debugLineNum = 264;BA.debugLine="awa = vane-offset";
Debug.ShouldStop(128);
__ref.setField ("_awa",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_vane"),__ref.getField(true,"_offset")}, "-",1, 0)));
 BA.debugLineNum = 268;BA.debugLine="twm = r.Get(\"modulo\")";
Debug.ShouldStop(2048);
__ref.setField ("_twm",BA.numberCast(float.class, _r.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("modulo"))))));
 BA.debugLineNum = 271;BA.debugLine="twa = Round2( r.Get(\"angulo\"), 1 )";
Debug.ShouldStop(16384);
__ref.setField ("_twa",BA.numberCast(float.class, windcalcs.__c.runMethod(true,"Round2",(Object)(BA.numberCast(double.class, _r.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("angulo")))))),(Object)(BA.numberCast(int.class, 1)))));
 BA.debugLineNum = 274;BA.debugLine="twN = Round2( r.Get(\"windN\"), 1 )";
Debug.ShouldStop(131072);
__ref.setField ("_twn",BA.numberCast(float.class, windcalcs.__c.runMethod(true,"Round2",(Object)(BA.numberCast(double.class, _r.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("windN")))))),(Object)(BA.numberCast(int.class, 1)))));
 }else {
 BA.debugLineNum = 276;BA.debugLine="awm = anemo";
Debug.ShouldStop(524288);
__ref.setField ("_awm",__ref.getField(true,"_anemo"));
 BA.debugLineNum = 277;BA.debugLine="awa =  vane-offset";
Debug.ShouldStop(1048576);
__ref.setField ("_awa",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_vane"),__ref.getField(true,"_offset")}, "-",1, 0)));
 BA.debugLineNum = 279;BA.debugLine="twm = r.Get(\"modulo\")";
Debug.ShouldStop(4194304);
__ref.setField ("_twm",BA.numberCast(float.class, _r.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("modulo"))))));
 BA.debugLineNum = 280;BA.debugLine="twa = r.Get(\"angulo\")";
Debug.ShouldStop(8388608);
__ref.setField ("_twa",BA.numberCast(float.class, _r.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("angulo"))))));
 BA.debugLineNum = 281;BA.debugLine="twN = r.Get(\"windN\")";
Debug.ShouldStop(16777216);
__ref.setField ("_twn",BA.numberCast(float.class, _r.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("windN"))))));
 };
 };
 BA.debugLineNum = 286;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _calc_anemo(RemoteObject __ref,RemoteObject _v_anemo,RemoteObject _v_vane) throws Exception{
try {
		Debug.PushSubsStack("calc_anemo (windcalcs) ","windcalcs",8,__ref.getField(false, "ba"),__ref,151);
if (RapidSub.canDelegate("calc_anemo")) { return __ref.runUserSub(false, "windcalcs","calc_anemo", __ref, _v_anemo, _v_vane);}
RemoteObject _intermedio = RemoteObject.createImmutable(0);
RemoteObject _n_samples = RemoteObject.createImmutable(0);
RemoteObject _j = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _media_x = RemoteObject.createImmutable(0f);
RemoteObject _media_y = RemoteObject.createImmutable(0f);
RemoteObject _o_anemo = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("v_anemo", _v_anemo);
Debug.locals.put("v_vane", _v_vane);
 BA.debugLineNum = 151;BA.debugLine="Sub calc_anemo( v_anemo As Float, v_vane As Float";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 154;BA.debugLine="Dim intermedio As Int";
Debug.ShouldStop(33554432);
_intermedio = RemoteObject.createImmutable(0);Debug.locals.put("intermedio", _intermedio);
 BA.debugLineNum = 155;BA.debugLine="Dim n_samples As Int";
Debug.ShouldStop(67108864);
_n_samples = RemoteObject.createImmutable(0);Debug.locals.put("n_samples", _n_samples);
 BA.debugLineNum = 156;BA.debugLine="If mean_sw Then	' Cojo 25 valores";
Debug.ShouldStop(134217728);
if (__ref.getField(true,"_mean_sw").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 157;BA.debugLine="n_samples = 300 '25";
Debug.ShouldStop(268435456);
_n_samples = BA.numberCast(int.class, 300);Debug.locals.put("n_samples", _n_samples);
 }else {
 BA.debugLineNum = 159;BA.debugLine="n_samples = 5";
Debug.ShouldStop(1073741824);
_n_samples = BA.numberCast(int.class, 5);Debug.locals.put("n_samples", _n_samples);
 };
 BA.debugLineNum = 161;BA.debugLine="If m_anemo.Size >= n_samples Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("g",__ref.getField(false,"_m_anemo").runMethod(true,"getSize"),BA.numberCast(double.class, _n_samples))) { 
 BA.debugLineNum = 162;BA.debugLine="Dim j= (m_anemo.Size - n_samples)  As Int";
Debug.ShouldStop(2);
_j = (RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_m_anemo").runMethod(true,"getSize"),_n_samples}, "-",1, 1));Debug.locals.put("j", _j);Debug.locals.put("j", _j);
 BA.debugLineNum = 163;BA.debugLine="For i=0 To j";
Debug.ShouldStop(4);
{
final int step10 = 1;
final int limit10 = _j.<Integer>get().intValue();
_i = 0 ;
for (;(step10 > 0 && _i <= limit10) || (step10 < 0 && _i >= limit10) ;_i = ((int)(0 + _i + step10))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 165;BA.debugLine="m_anemo.RemoveAt(0)";
Debug.ShouldStop(16);
__ref.getField(false,"_m_anemo").runVoidMethod ("RemoveAt",(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 166;BA.debugLine="m_x.RemoveAt(0)";
Debug.ShouldStop(32);
__ref.getField(false,"_m_x").runVoidMethod ("RemoveAt",(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 167;BA.debugLine="m_y.RemoveAt(0)";
Debug.ShouldStop(64);
__ref.getField(false,"_m_y").runVoidMethod ("RemoveAt",(Object)(BA.numberCast(int.class, 0)));
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 170;BA.debugLine="m_anemo.Add( v_anemo )";
Debug.ShouldStop(512);
__ref.getField(false,"_m_anemo").runVoidMethod ("Add",(Object)((_v_anemo)));
 BA.debugLineNum = 171;BA.debugLine="m_x.Add( v_anemo*CosD( -v_vane ) )";
Debug.ShouldStop(1024);
__ref.getField(false,"_m_x").runVoidMethod ("Add",(Object)((RemoteObject.solve(new RemoteObject[] {_v_anemo,windcalcs.__c.runMethod(true,"CosD",(Object)(BA.numberCast(double.class, -(double) (0 + _v_vane.<Float>get().floatValue()))))}, "*",0, 0))));
 BA.debugLineNum = 172;BA.debugLine="m_y.Add( v_anemo*SinD( -v_vane ) )";
Debug.ShouldStop(2048);
__ref.getField(false,"_m_y").runVoidMethod ("Add",(Object)((RemoteObject.solve(new RemoteObject[] {_v_anemo,windcalcs.__c.runMethod(true,"SinD",(Object)(BA.numberCast(double.class, -(double) (0 + _v_vane.<Float>get().floatValue()))))}, "*",0, 0))));
 BA.debugLineNum = 173;BA.debugLine="Dim media_x=0, media_y=0 As Float";
Debug.ShouldStop(4096);
_media_x = BA.numberCast(float.class, 0);Debug.locals.put("media_x", _media_x);Debug.locals.put("media_x", _media_x);
_media_y = BA.numberCast(float.class, 0);Debug.locals.put("media_y", _media_y);Debug.locals.put("media_y", _media_y);
 BA.debugLineNum = 174;BA.debugLine="For i=0 To m_x.Size-1";
Debug.ShouldStop(8192);
{
final int step20 = 1;
final int limit20 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_m_x").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step20 > 0 && _i <= limit20) || (step20 < 0 && _i >= limit20) ;_i = ((int)(0 + _i + step20))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 175;BA.debugLine="media_x = media_x + m_x.Get(i)";
Debug.ShouldStop(16384);
_media_x = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_media_x,BA.numberCast(double.class, __ref.getField(false,"_m_x").runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))}, "+",1, 0));Debug.locals.put("media_x", _media_x);
 BA.debugLineNum = 176;BA.debugLine="media_y = media_y + m_y.Get(i)";
Debug.ShouldStop(32768);
_media_y = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_media_y,BA.numberCast(double.class, __ref.getField(false,"_m_y").runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))}, "+",1, 0));Debug.locals.put("media_y", _media_y);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 178;BA.debugLine="media_x = media_x / m_x.Size";
Debug.ShouldStop(131072);
_media_x = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_media_x,__ref.getField(false,"_m_x").runMethod(true,"getSize")}, "/",0, 0));Debug.locals.put("media_x", _media_x);
 BA.debugLineNum = 179;BA.debugLine="media_y = media_y / m_y.Size";
Debug.ShouldStop(262144);
_media_y = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_media_y,__ref.getField(false,"_m_y").runMethod(true,"getSize")}, "/",0, 0));Debug.locals.put("media_y", _media_y);
 BA.debugLineNum = 180;BA.debugLine="vane = ATan2D( media_y, media_x )";
Debug.ShouldStop(524288);
__ref.setField ("_vane",BA.numberCast(float.class, windcalcs.__c.runMethod(true,"ATan2D",(Object)(BA.numberCast(double.class, _media_y)),(Object)(BA.numberCast(double.class, _media_x)))));
 BA.debugLineNum = 181;BA.debugLine="intermedio = 360 + vane";
Debug.ShouldStop(1048576);
_intermedio = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(360),__ref.getField(true,"_vane")}, "+",1, 0));Debug.locals.put("intermedio", _intermedio);
 BA.debugLineNum = 182;BA.debugLine="vane = intermedio Mod 360";
Debug.ShouldStop(2097152);
__ref.setField ("_vane",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_intermedio,RemoteObject.createImmutable(360)}, "%",0, 1)));
 BA.debugLineNum = 185;BA.debugLine="Dim o_anemo As List";
Debug.ShouldStop(16777216);
_o_anemo = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("o_anemo", _o_anemo);
 BA.debugLineNum = 186;BA.debugLine="o_anemo.Initialize";
Debug.ShouldStop(33554432);
_o_anemo.runVoidMethod ("Initialize");
 BA.debugLineNum = 187;BA.debugLine="o_anemo.AddAll( m_anemo )";
Debug.ShouldStop(67108864);
_o_anemo.runVoidMethod ("AddAll",(Object)(__ref.getField(false,"_m_anemo")));
 BA.debugLineNum = 188;BA.debugLine="o_anemo.Sort(True)";
Debug.ShouldStop(134217728);
_o_anemo.runVoidMethod ("Sort",(Object)(windcalcs.__c.getField(true,"True")));
 BA.debugLineNum = 200;BA.debugLine="anemo = o_anemo.Get( o_anemo.Size/2 )";
Debug.ShouldStop(128);
__ref.setField ("_anemo",BA.numberCast(float.class, _o_anemo.runMethod(false,"Get",(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_o_anemo.runMethod(true,"getSize"),RemoteObject.createImmutable(2)}, "/",0, 0))))));
 BA.debugLineNum = 203;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _calc_anemo_k(RemoteObject __ref,RemoteObject _v_anemo,RemoteObject _v_vane) throws Exception{
try {
		Debug.PushSubsStack("calc_anemo_k (windcalcs) ","windcalcs",8,__ref.getField(false, "ba"),__ref,129);
if (RapidSub.canDelegate("calc_anemo_k")) { return __ref.runUserSub(false, "windcalcs","calc_anemo_k", __ref, _v_anemo, _v_vane);}
RemoteObject _x = RemoteObject.createImmutable(0f);
RemoteObject _y = RemoteObject.createImmutable(0f);
RemoteObject _xe = RemoteObject.createImmutable(0f);
RemoteObject _ye = RemoteObject.createImmutable(0f);
RemoteObject _intermedio = RemoteObject.createImmutable(0);
RemoteObject _intermedio2 = RemoteObject.createImmutable(0);
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _i2 = RemoteObject.createImmutable(0);
Debug.locals.put("v_anemo", _v_anemo);
Debug.locals.put("v_vane", _v_vane);
 BA.debugLineNum = 129;BA.debugLine="Sub calc_anemo_k( v_anemo As Float, v_vane As Floa";
Debug.ShouldStop(1);
 BA.debugLineNum = 130;BA.debugLine="Dim x,y, xe,ye As Float";
Debug.ShouldStop(2);
_x = RemoteObject.createImmutable(0f);Debug.locals.put("x", _x);
_y = RemoteObject.createImmutable(0f);Debug.locals.put("y", _y);
_xe = RemoteObject.createImmutable(0f);Debug.locals.put("xe", _xe);
_ye = RemoteObject.createImmutable(0f);Debug.locals.put("ye", _ye);
 BA.debugLineNum = 131;BA.debugLine="Dim intermedio, intermedio2, i, i2 As Int";
Debug.ShouldStop(4);
_intermedio = RemoteObject.createImmutable(0);Debug.locals.put("intermedio", _intermedio);
_intermedio2 = RemoteObject.createImmutable(0);Debug.locals.put("intermedio2", _intermedio2);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
_i2 = RemoteObject.createImmutable(0);Debug.locals.put("i2", _i2);
 BA.debugLineNum = 132;BA.debugLine="x = CosD( v_vane ) 'v_anemo*";
Debug.ShouldStop(8);
_x = BA.numberCast(float.class, windcalcs.__c.runMethod(true,"CosD",(Object)(BA.numberCast(double.class, _v_vane))));Debug.locals.put("x", _x);
 BA.debugLineNum = 133;BA.debugLine="y = SinD( v_vane ) 'v_anemo*";
Debug.ShouldStop(16);
_y = BA.numberCast(float.class, windcalcs.__c.runMethod(true,"SinD",(Object)(BA.numberCast(double.class, _v_vane))));Debug.locals.put("y", _y);
 BA.debugLineNum = 135;BA.debugLine="xe = updateEstimate( x, kX )";
Debug.ShouldStop(64);
_xe = __ref.runClassMethod (com.calypsoinstruments.anemotracker.windcalcs.class, "_updateestimate",(Object)(_x),(Object)(__ref.getField(false,"_kx")));Debug.locals.put("xe", _xe);
 BA.debugLineNum = 136;BA.debugLine="ye = updateEstimate( y, kY )";
Debug.ShouldStop(128);
_ye = __ref.runClassMethod (com.calypsoinstruments.anemotracker.windcalcs.class, "_updateestimate",(Object)(_y),(Object)(__ref.getField(false,"_ky")));Debug.locals.put("ye", _ye);
 BA.debugLineNum = 141;BA.debugLine="intermedio = ATan2D( ye, xe)";
Debug.ShouldStop(4096);
_intermedio = BA.numberCast(int.class, windcalcs.__c.runMethod(true,"ATan2D",(Object)(BA.numberCast(double.class, _ye)),(Object)(BA.numberCast(double.class, _xe))));Debug.locals.put("intermedio", _intermedio);
 BA.debugLineNum = 142;BA.debugLine="intermedio2 = 360+intermedio";
Debug.ShouldStop(8192);
_intermedio2 = RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(360),_intermedio}, "+",1, 1);Debug.locals.put("intermedio2", _intermedio2);
 BA.debugLineNum = 143;BA.debugLine="i = ATan2D( y, x )";
Debug.ShouldStop(16384);
_i = BA.numberCast(int.class, windcalcs.__c.runMethod(true,"ATan2D",(Object)(BA.numberCast(double.class, _y)),(Object)(BA.numberCast(double.class, _x))));Debug.locals.put("i", _i);
 BA.debugLineNum = 144;BA.debugLine="i2 = 360 + i";
Debug.ShouldStop(32768);
_i2 = RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(360),_i}, "+",1, 1);Debug.locals.put("i2", _i2);
 BA.debugLineNum = 145;BA.debugLine="vane = intermedio2 Mod 360";
Debug.ShouldStop(65536);
__ref.setField ("_vane",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_intermedio2,RemoteObject.createImmutable(360)}, "%",0, 1)));
 BA.debugLineNum = 148;BA.debugLine="anemo = v_anemo";
Debug.ShouldStop(524288);
__ref.setField ("_anemo",_v_anemo);
 BA.debugLineNum = 150;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _calc_wind(RemoteObject __ref,RemoteObject _p_speed,RemoteObject _p_anemo,RemoteObject _p_vane,RemoteObject _p_bearing,RemoteObject _inverse) throws Exception{
try {
		Debug.PushSubsStack("calc_wind (windcalcs) ","windcalcs",8,__ref.getField(false, "ba"),__ref,332);
if (RapidSub.canDelegate("calc_wind")) { return __ref.runUserSub(false, "windcalcs","calc_wind", __ref, _p_speed, _p_anemo, _p_vane, _p_bearing, _inverse);}
RemoteObject _ret = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _barco_x = RemoteObject.createImmutable(0f);
RemoteObject _barco_y = RemoteObject.createImmutable(0f);
RemoteObject _vientoap_x = RemoteObject.createImmutable(0f);
RemoteObject _vientoap_y = RemoteObject.createImmutable(0f);
RemoteObject _vientoreal_x = RemoteObject.createImmutable(0f);
RemoteObject _vientoreal_y = RemoteObject.createImmutable(0f);
RemoteObject _vientoreal_m = RemoteObject.createImmutable(0f);
RemoteObject _vientoreal_a = RemoteObject.createImmutable(0f);
RemoteObject _windn = RemoteObject.createImmutable(0f);
RemoteObject _intermedio = RemoteObject.createImmutable(0);
Debug.locals.put("p_speed", _p_speed);
Debug.locals.put("p_anemo", _p_anemo);
Debug.locals.put("p_vane", _p_vane);
Debug.locals.put("p_bearing", _p_bearing);
Debug.locals.put("inverse", _inverse);
 BA.debugLineNum = 332;BA.debugLine="Sub calc_wind( p_speed As Float, p_anemo As Float,";
Debug.ShouldStop(2048);
 BA.debugLineNum = 333;BA.debugLine="Dim ret As Map";
Debug.ShouldStop(4096);
_ret = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 334;BA.debugLine="Dim barco_x, barco_y, vientoap_x, vientoap_y As F";
Debug.ShouldStop(8192);
_barco_x = RemoteObject.createImmutable(0f);Debug.locals.put("barco_x", _barco_x);
_barco_y = RemoteObject.createImmutable(0f);Debug.locals.put("barco_y", _barco_y);
_vientoap_x = RemoteObject.createImmutable(0f);Debug.locals.put("vientoap_x", _vientoap_x);
_vientoap_y = RemoteObject.createImmutable(0f);Debug.locals.put("vientoap_y", _vientoap_y);
 BA.debugLineNum = 335;BA.debugLine="Dim vientoreal_x, vientoreal_y, vientoreal_m, vie";
Debug.ShouldStop(16384);
_vientoreal_x = RemoteObject.createImmutable(0f);Debug.locals.put("vientoreal_x", _vientoreal_x);
_vientoreal_y = RemoteObject.createImmutable(0f);Debug.locals.put("vientoreal_y", _vientoreal_y);
_vientoreal_m = RemoteObject.createImmutable(0f);Debug.locals.put("vientoreal_m", _vientoreal_m);
_vientoreal_a = RemoteObject.createImmutable(0f);Debug.locals.put("vientoreal_a", _vientoreal_a);
_windn = RemoteObject.createImmutable(0f);Debug.locals.put("windN", _windn);
 BA.debugLineNum = 336;BA.debugLine="Dim intermedio As Int";
Debug.ShouldStop(32768);
_intermedio = RemoteObject.createImmutable(0);Debug.locals.put("intermedio", _intermedio);
 BA.debugLineNum = 337;BA.debugLine="ret.Initialize";
Debug.ShouldStop(65536);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 338;BA.debugLine="barco_x = p_speed";
Debug.ShouldStop(131072);
_barco_x = _p_speed;Debug.locals.put("barco_x", _barco_x);
 BA.debugLineNum = 339;BA.debugLine="barco_y = 0";
Debug.ShouldStop(262144);
_barco_y = BA.numberCast(float.class, 0);Debug.locals.put("barco_y", _barco_y);
 BA.debugLineNum = 340;BA.debugLine="vientoap_x = p_anemo*CosD( -p_vane )";
Debug.ShouldStop(524288);
_vientoap_x = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_p_anemo,windcalcs.__c.runMethod(true,"CosD",(Object)(BA.numberCast(double.class, -(double) (0 + _p_vane.<Float>get().floatValue()))))}, "*",0, 0));Debug.locals.put("vientoap_x", _vientoap_x);
 BA.debugLineNum = 341;BA.debugLine="vientoap_y = p_anemo*SinD( -p_vane )";
Debug.ShouldStop(1048576);
_vientoap_y = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_p_anemo,windcalcs.__c.runMethod(true,"SinD",(Object)(BA.numberCast(double.class, -(double) (0 + _p_vane.<Float>get().floatValue()))))}, "*",0, 0));Debug.locals.put("vientoap_y", _vientoap_y);
 BA.debugLineNum = 342;BA.debugLine="If( inverse ) Then";
Debug.ShouldStop(2097152);
if ((_inverse).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 344;BA.debugLine="vientoreal_x = vientoap_x + barco_x";
Debug.ShouldStop(8388608);
_vientoreal_x = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_vientoap_x,_barco_x}, "+",1, 0));Debug.locals.put("vientoreal_x", _vientoreal_x);
 BA.debugLineNum = 345;BA.debugLine="vientoreal_y = vientoap_y + barco_y";
Debug.ShouldStop(16777216);
_vientoreal_y = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_vientoap_y,_barco_y}, "+",1, 0));Debug.locals.put("vientoreal_y", _vientoreal_y);
 BA.debugLineNum = 346;BA.debugLine="vientoreal_a = -ATan2D( vientoreal_y , vientorea";
Debug.ShouldStop(33554432);
_vientoreal_a = BA.numberCast(float.class, -windcalcs.__c.runMethod(true,"ATan2D",(Object)(BA.numberCast(double.class, _vientoreal_y)),(Object)(BA.numberCast(double.class, _vientoreal_x))).<Double>get().doubleValue());Debug.locals.put("vientoreal_a", _vientoreal_a);
 BA.debugLineNum = 347;BA.debugLine="vientoreal_m = Sqrt( vientoreal_x*vientoreal_x +";
Debug.ShouldStop(67108864);
_vientoreal_m = BA.numberCast(float.class, windcalcs.__c.runMethod(true,"Sqrt",(Object)(RemoteObject.solve(new RemoteObject[] {_vientoreal_x,_vientoreal_x,_vientoreal_y,_vientoreal_y}, "*+*",1, 0))));Debug.locals.put("vientoreal_m", _vientoreal_m);
 BA.debugLineNum = 348;BA.debugLine="intermedio = 360 + vientoreal_a";
Debug.ShouldStop(134217728);
_intermedio = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(360),_vientoreal_a}, "+",1, 0));Debug.locals.put("intermedio", _intermedio);
 BA.debugLineNum = 349;BA.debugLine="vientoreal_a = intermedio Mod 360";
Debug.ShouldStop(268435456);
_vientoreal_a = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_intermedio,RemoteObject.createImmutable(360)}, "%",0, 1));Debug.locals.put("vientoreal_a", _vientoreal_a);
 }else {
 BA.debugLineNum = 351;BA.debugLine="vientoreal_x = vientoap_x - barco_x";
Debug.ShouldStop(1073741824);
_vientoreal_x = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_vientoap_x,_barco_x}, "-",1, 0));Debug.locals.put("vientoreal_x", _vientoreal_x);
 BA.debugLineNum = 352;BA.debugLine="vientoreal_y = vientoap_y - barco_y";
Debug.ShouldStop(-2147483648);
_vientoreal_y = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_vientoap_y,_barco_y}, "-",1, 0));Debug.locals.put("vientoreal_y", _vientoreal_y);
 BA.debugLineNum = 353;BA.debugLine="vientoreal_a = -ATan2D( vientoreal_y , vientorea";
Debug.ShouldStop(1);
_vientoreal_a = BA.numberCast(float.class, -windcalcs.__c.runMethod(true,"ATan2D",(Object)(BA.numberCast(double.class, _vientoreal_y)),(Object)(BA.numberCast(double.class, _vientoreal_x))).<Double>get().doubleValue());Debug.locals.put("vientoreal_a", _vientoreal_a);
 BA.debugLineNum = 354;BA.debugLine="intermedio = 360+vientoreal_a";
Debug.ShouldStop(2);
_intermedio = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(360),_vientoreal_a}, "+",1, 0));Debug.locals.put("intermedio", _intermedio);
 BA.debugLineNum = 355;BA.debugLine="vientoreal_a = intermedio Mod 360";
Debug.ShouldStop(4);
_vientoreal_a = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_intermedio,RemoteObject.createImmutable(360)}, "%",0, 1));Debug.locals.put("vientoreal_a", _vientoreal_a);
 BA.debugLineNum = 356;BA.debugLine="If p_speed = 0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_p_speed,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 357;BA.debugLine="vientoreal_a = p_vane";
Debug.ShouldStop(16);
_vientoreal_a = _p_vane;Debug.locals.put("vientoreal_a", _vientoreal_a);
 };
 BA.debugLineNum = 359;BA.debugLine="vientoreal_m = Sqrt( vientoreal_x*vientoreal_x +";
Debug.ShouldStop(64);
_vientoreal_m = BA.numberCast(float.class, windcalcs.__c.runMethod(true,"Sqrt",(Object)(RemoteObject.solve(new RemoteObject[] {_vientoreal_x,_vientoreal_x,_vientoreal_y,_vientoreal_y}, "*+*",1, 0))));Debug.locals.put("vientoreal_m", _vientoreal_m);
 };
 BA.debugLineNum = 363;BA.debugLine="ret.Put( \"x\", vientoap_x )";
Debug.ShouldStop(1024);
_ret.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("x"))),(Object)((_vientoap_x)));
 BA.debugLineNum = 364;BA.debugLine="ret.Put( \"y\", vientoap_y )";
Debug.ShouldStop(2048);
_ret.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("y"))),(Object)((_vientoap_y)));
 BA.debugLineNum = 365;BA.debugLine="ret.Put( \"modulo\", vientoreal_m )";
Debug.ShouldStop(4096);
_ret.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("modulo"))),(Object)((_vientoreal_m)));
 BA.debugLineNum = 366;BA.debugLine="ret.Put( \"angulo\", vientoreal_a )";
Debug.ShouldStop(8192);
_ret.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("angulo"))),(Object)((_vientoreal_a)));
 BA.debugLineNum = 367;BA.debugLine="intermedio = ( vientoreal_a + p_bearing )";
Debug.ShouldStop(16384);
_intermedio = BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {_vientoreal_a,_p_bearing}, "+",1, 0)));Debug.locals.put("intermedio", _intermedio);
 BA.debugLineNum = 368;BA.debugLine="windN = (intermedio + 360 ) Mod 360";
Debug.ShouldStop(32768);
_windn = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_intermedio,RemoteObject.createImmutable(360)}, "+",1, 1)),RemoteObject.createImmutable(360)}, "%",0, 1));Debug.locals.put("windN", _windn);
 BA.debugLineNum = 369;BA.debugLine="ret.Put( \"windN\", windN )";
Debug.ShouldStop(65536);
_ret.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("windN"))),(Object)((_windn)));
 BA.debugLineNum = 370;BA.debugLine="Return ret";
Debug.ShouldStop(131072);
if (true) return _ret;
 BA.debugLineNum = 371;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Dim orig_vane =0, orig_anemo=0 As Float";
windcalcs._orig_vane = BA.numberCast(float.class, 0);__ref.setField("_orig_vane",windcalcs._orig_vane);
windcalcs._orig_anemo = BA.numberCast(float.class, 0);__ref.setField("_orig_anemo",windcalcs._orig_anemo);
 //BA.debugLineNum = 4;BA.debugLine="Dim vane As Float = 0";
windcalcs._vane = BA.numberCast(float.class, 0);__ref.setField("_vane",windcalcs._vane);
 //BA.debugLineNum = 5;BA.debugLine="Dim anemo As Float = 0";
windcalcs._anemo = BA.numberCast(float.class, 0);__ref.setField("_anemo",windcalcs._anemo);
 //BA.debugLineNum = 7;BA.debugLine="Dim speed As Float = 0";
windcalcs._speed = BA.numberCast(float.class, 0);__ref.setField("_speed",windcalcs._speed);
 //BA.debugLineNum = 8;BA.debugLine="Dim bearing As Float = 0";
windcalcs._bearing = BA.numberCast(float.class, 0);__ref.setField("_bearing",windcalcs._bearing);
 //BA.debugLineNum = 9;BA.debugLine="Dim latitude As Float";
windcalcs._latitude = RemoteObject.createImmutable(0f);__ref.setField("_latitude",windcalcs._latitude);
 //BA.debugLineNum = 10;BA.debugLine="Dim longitude As Float";
windcalcs._longitude = RemoteObject.createImmutable(0f);__ref.setField("_longitude",windcalcs._longitude);
 //BA.debugLineNum = 11;BA.debugLine="Dim altitude As Float";
windcalcs._altitude = RemoteObject.createImmutable(0f);__ref.setField("_altitude",windcalcs._altitude);
 //BA.debugLineNum = 13;BA.debugLine="Dim compass As Float";
windcalcs._compass = RemoteObject.createImmutable(0f);__ref.setField("_compass",windcalcs._compass);
 //BA.debugLineNum = 15;BA.debugLine="Dim awm, awa, twm, twa, twN As Float = 0";
windcalcs._awm = RemoteObject.createImmutable(0f);__ref.setField("_awm",windcalcs._awm);
windcalcs._awa = RemoteObject.createImmutable(0f);__ref.setField("_awa",windcalcs._awa);
windcalcs._twm = RemoteObject.createImmutable(0f);__ref.setField("_twm",windcalcs._twm);
windcalcs._twa = RemoteObject.createImmutable(0f);__ref.setField("_twa",windcalcs._twa);
windcalcs._twn = BA.numberCast(float.class, 0);__ref.setField("_twn",windcalcs._twn);
 //BA.debugLineNum = 17;BA.debugLine="Dim simulated As Boolean";
windcalcs._simulated = RemoteObject.createImmutable(false);__ref.setField("_simulated",windcalcs._simulated);
 //BA.debugLineNum = 18;BA.debugLine="Dim swm, swa As Float";
windcalcs._swm = RemoteObject.createImmutable(0f);__ref.setField("_swm",windcalcs._swm);
windcalcs._swa = RemoteObject.createImmutable(0f);__ref.setField("_swa",windcalcs._swa);
 //BA.debugLineNum = 19;BA.debugLine="Dim knots As Float = 0";
windcalcs._knots = BA.numberCast(float.class, 0);__ref.setField("_knots",windcalcs._knots);
 //BA.debugLineNum = 21;BA.debugLine="Dim speed_min As Float = 2.0";
windcalcs._speed_min = BA.numberCast(float.class, 2.0);__ref.setField("_speed_min",windcalcs._speed_min);
 //BA.debugLineNum = 22;BA.debugLine="Dim speed_sw As Boolean = True";
windcalcs._speed_sw = windcalcs.__c.getField(true,"True");__ref.setField("_speed_sw",windcalcs._speed_sw);
 //BA.debugLineNum = 23;BA.debugLine="Dim speed_low As Boolean = False";
windcalcs._speed_low = windcalcs.__c.getField(true,"False");__ref.setField("_speed_low",windcalcs._speed_low);
 //BA.debugLineNum = 24;BA.debugLine="Dim speed_bearing As Float = 0.0  ' Bearing según";
windcalcs._speed_bearing = BA.numberCast(float.class, 0.0);__ref.setField("_speed_bearing",windcalcs._speed_bearing);
 //BA.debugLineNum = 26;BA.debugLine="Dim mean_sw As Boolean = True";
windcalcs._mean_sw = windcalcs.__c.getField(true,"True");__ref.setField("_mean_sw",windcalcs._mean_sw);
 //BA.debugLineNum = 27;BA.debugLine="Dim offset As Float";
windcalcs._offset = RemoteObject.createImmutable(0f);__ref.setField("_offset",windcalcs._offset);
 //BA.debugLineNum = 29;BA.debugLine="Dim m_anemo As List";
windcalcs._m_anemo = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_m_anemo",windcalcs._m_anemo);
 //BA.debugLineNum = 30;BA.debugLine="Dim m_x, m_y As List";
windcalcs._m_x = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_m_x",windcalcs._m_x);
windcalcs._m_y = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_m_y",windcalcs._m_y);
 //BA.debugLineNum = 31;BA.debugLine="Dim battery, temp, roll, pitch, ecompass As Int";
windcalcs._battery = RemoteObject.createImmutable(0);__ref.setField("_battery",windcalcs._battery);
windcalcs._temp = RemoteObject.createImmutable(0);__ref.setField("_temp",windcalcs._temp);
windcalcs._roll = RemoteObject.createImmutable(0);__ref.setField("_roll",windcalcs._roll);
windcalcs._pitch = RemoteObject.createImmutable(0);__ref.setField("_pitch",windcalcs._pitch);
windcalcs._ecompass = RemoteObject.createImmutable(0);__ref.setField("_ecompass",windcalcs._ecompass);
 //BA.debugLineNum = 33;BA.debugLine="Type tKalman(err_measure As Float, err_estimate A";
;
 //BA.debugLineNum = 34;BA.debugLine="Type tKalman2( xk As Float, pk As Float, R As Flo";
;
 //BA.debugLineNum = 35;BA.debugLine="Type tKalman3( q As Float, r As Float, x As Float";
;
 //BA.debugLineNum = 41;BA.debugLine="Dim kX,kY As tKalman";
windcalcs._kx = RemoteObject.createNew ("com.calypsoinstruments.anemotracker.windcalcs._tkalman");__ref.setField("_kx",windcalcs._kx);
windcalcs._ky = RemoteObject.createNew ("com.calypsoinstruments.anemotracker.windcalcs._tkalman");__ref.setField("_ky",windcalcs._ky);
 //BA.debugLineNum = 42;BA.debugLine="Dim kX2, kY2 As tKalman2";
windcalcs._kx2 = RemoteObject.createNew ("com.calypsoinstruments.anemotracker.windcalcs._tkalman2");__ref.setField("_kx2",windcalcs._kx2);
windcalcs._ky2 = RemoteObject.createNew ("com.calypsoinstruments.anemotracker.windcalcs._tkalman2");__ref.setField("_ky2",windcalcs._ky2);
 //BA.debugLineNum = 43;BA.debugLine="Dim kX3, kY3 As tKalman3";
windcalcs._kx3 = RemoteObject.createNew ("com.calypsoinstruments.anemotracker.windcalcs._tkalman3");__ref.setField("_kx3",windcalcs._kx3);
windcalcs._ky3 = RemoteObject.createNew ("com.calypsoinstruments.anemotracker.windcalcs._tkalman3");__ref.setField("_ky3",windcalcs._ky3);
 //BA.debugLineNum = 44;BA.debugLine="Dim refresh_hz = 1.0 As Float";
windcalcs._refresh_hz = BA.numberCast(float.class, 1.0);__ref.setField("_refresh_hz",windcalcs._refresh_hz);
 //BA.debugLineNum = 45;BA.debugLine="Dim selected_compass As Float";
windcalcs._selected_compass = RemoteObject.createImmutable(0f);__ref.setField("_selected_compass",windcalcs._selected_compass);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (windcalcs) ","windcalcs",8,__ref.getField(false, "ba"),__ref,50);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "windcalcs","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 50;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(131072);
 BA.debugLineNum = 51;BA.debugLine="m_anemo.Initialize";
Debug.ShouldStop(262144);
__ref.getField(false,"_m_anemo").runVoidMethod ("Initialize");
 BA.debugLineNum = 52;BA.debugLine="m_x.Initialize";
Debug.ShouldStop(524288);
__ref.getField(false,"_m_x").runVoidMethod ("Initialize");
 BA.debugLineNum = 53;BA.debugLine="m_y.Initialize";
Debug.ShouldStop(1048576);
__ref.getField(false,"_m_y").runVoidMethod ("Initialize");
 BA.debugLineNum = 54;BA.debugLine="speed = 0";
Debug.ShouldStop(2097152);
__ref.setField ("_speed",BA.numberCast(float.class, 0));
 BA.debugLineNum = 55;BA.debugLine="anemo = 0";
Debug.ShouldStop(4194304);
__ref.setField ("_anemo",BA.numberCast(float.class, 0));
 BA.debugLineNum = 56;BA.debugLine="vane = 0";
Debug.ShouldStop(8388608);
__ref.setField ("_vane",BA.numberCast(float.class, 0));
 BA.debugLineNum = 57;BA.debugLine="bearing = 0";
Debug.ShouldStop(16777216);
__ref.setField ("_bearing",BA.numberCast(float.class, 0));
 BA.debugLineNum = 58;BA.debugLine="offset = 0";
Debug.ShouldStop(33554432);
__ref.setField ("_offset",BA.numberCast(float.class, 0));
 BA.debugLineNum = 59;BA.debugLine="simulated = False";
Debug.ShouldStop(67108864);
__ref.setField ("_simulated",windcalcs.__c.getField(true,"False"));
 BA.debugLineNum = 62;BA.debugLine="mean_checked(True)";
Debug.ShouldStop(536870912);
__ref.runClassMethod (com.calypsoinstruments.anemotracker.windcalcs.class, "_mean_checked",(Object)(windcalcs.__c.getField(true,"True")));
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mean_checked(RemoteObject __ref,RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("mean_checked (windcalcs) ","windcalcs",8,__ref.getField(false, "ba"),__ref,65);
if (RapidSub.canDelegate("mean_checked")) { return __ref.runUserSub(false, "windcalcs","mean_checked", __ref, _checked);}
RemoteObject _mea = RemoteObject.createImmutable(0f);
RemoteObject _q = RemoteObject.createImmutable(0f);
Debug.locals.put("checked", _checked);
 BA.debugLineNum = 65;BA.debugLine="Sub mean_checked( checked As Boolean)";
Debug.ShouldStop(1);
 BA.debugLineNum = 66;BA.debugLine="mean_sw = checked";
Debug.ShouldStop(2);
__ref.setField ("_mean_sw",_checked);
 BA.debugLineNum = 67;BA.debugLine="Dim mea, q As Float";
Debug.ShouldStop(4);
_mea = RemoteObject.createImmutable(0f);Debug.locals.put("mea", _mea);
_q = RemoteObject.createImmutable(0f);Debug.locals.put("q", _q);
 BA.debugLineNum = 68;BA.debugLine="If checked Then";
Debug.ShouldStop(8);
if (_checked.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 69;BA.debugLine="mea = 0.01 '0.05";
Debug.ShouldStop(16);
_mea = BA.numberCast(float.class, 0.01);Debug.locals.put("mea", _mea);
 BA.debugLineNum = 70;BA.debugLine="q = 0.005*2/refresh_hz  '0.05";
Debug.ShouldStop(32);
_q = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.005),RemoteObject.createImmutable(2),__ref.getField(true,"_refresh_hz")}, "*/",0, 0));Debug.locals.put("q", _q);
 }else {
 BA.debugLineNum = 72;BA.debugLine="mea = 0.02";
Debug.ShouldStop(128);
_mea = BA.numberCast(float.class, 0.02);Debug.locals.put("mea", _mea);
 BA.debugLineNum = 73;BA.debugLine="q = 0.01*2/refresh_hz";
Debug.ShouldStop(256);
_q = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.01),RemoteObject.createImmutable(2),__ref.getField(true,"_refresh_hz")}, "*/",0, 0));Debug.locals.put("q", _q);
 };
 BA.debugLineNum = 75;BA.debugLine="kX.err_measure = mea";
Debug.ShouldStop(1024);
__ref.getField(false,"_kx").setField ("err_measure",_mea);
 BA.debugLineNum = 76;BA.debugLine="kX.err_estimate =  0.05 'mea*refresh_hz 'no puede";
Debug.ShouldStop(2048);
__ref.getField(false,"_kx").setField ("err_estimate",BA.numberCast(float.class, 0.05));
 BA.debugLineNum = 77;BA.debugLine="kX.q = q";
Debug.ShouldStop(4096);
__ref.getField(false,"_kx").setField ("q",_q);
 BA.debugLineNum = 78;BA.debugLine="kY.err_measure = mea";
Debug.ShouldStop(8192);
__ref.getField(false,"_ky").setField ("err_measure",_mea);
 BA.debugLineNum = 79;BA.debugLine="kY.err_estimate = 0.05 'mea*refresh_hz";
Debug.ShouldStop(16384);
__ref.getField(false,"_ky").setField ("err_estimate",BA.numberCast(float.class, 0.05));
 BA.debugLineNum = 80;BA.debugLine="kY.q = q";
Debug.ShouldStop(32768);
__ref.getField(false,"_ky").setField ("q",_q);
 BA.debugLineNum = 83;BA.debugLine="kX2.xk = 0";
Debug.ShouldStop(262144);
__ref.getField(false,"_kx2").setField ("xk",BA.numberCast(float.class, 0));
 BA.debugLineNum = 84;BA.debugLine="kX2.pk = 1";
Debug.ShouldStop(524288);
__ref.getField(false,"_kx2").setField ("pk",BA.numberCast(float.class, 1));
 BA.debugLineNum = 85;BA.debugLine="kX2.R = 0.005";
Debug.ShouldStop(1048576);
__ref.getField(false,"_kx2").setField ("R",BA.numberCast(float.class, 0.005));
 BA.debugLineNum = 86;BA.debugLine="kY2.xk = 0";
Debug.ShouldStop(2097152);
__ref.getField(false,"_ky2").setField ("xk",BA.numberCast(float.class, 0));
 BA.debugLineNum = 87;BA.debugLine="kY2.pk = 1";
Debug.ShouldStop(4194304);
__ref.getField(false,"_ky2").setField ("pk",BA.numberCast(float.class, 1));
 BA.debugLineNum = 88;BA.debugLine="kY2.R = 0.005";
Debug.ShouldStop(8388608);
__ref.getField(false,"_ky2").setField ("R",BA.numberCast(float.class, 0.005));
 BA.debugLineNum = 114;BA.debugLine="kX3.q = 0.1";
Debug.ShouldStop(131072);
__ref.getField(false,"_kx3").setField ("q",BA.numberCast(float.class, 0.1));
 BA.debugLineNum = 115;BA.debugLine="kX3.r = 0.5";
Debug.ShouldStop(262144);
__ref.getField(false,"_kx3").setField ("r",BA.numberCast(float.class, 0.5));
 BA.debugLineNum = 116;BA.debugLine="kX3.p = 1023";
Debug.ShouldStop(524288);
__ref.getField(false,"_kx3").setField ("p",BA.numberCast(float.class, 1023));
 BA.debugLineNum = 117;BA.debugLine="kX3.x = 0";
Debug.ShouldStop(1048576);
__ref.getField(false,"_kx3").setField ("x",BA.numberCast(float.class, 0));
 BA.debugLineNum = 118;BA.debugLine="kY3 = kX3";
Debug.ShouldStop(2097152);
__ref.setField ("_ky3",__ref.getField(false,"_kx3"));
 BA.debugLineNum = 121;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _test_calc(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("test_calc (windcalcs) ","windcalcs",8,__ref.getField(false, "ba"),__ref,288);
if (RapidSub.canDelegate("test_calc")) { return __ref.runUserSub(false, "windcalcs","test_calc", __ref);}
RemoteObject _results = RemoteObject.createImmutable("");
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 288;BA.debugLine="Sub test_calc";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 293;BA.debugLine="Dim results As String";
Debug.ShouldStop(16);
_results = RemoteObject.createImmutable("");Debug.locals.put("results", _results);
 BA.debugLineNum = 294;BA.debugLine="Dim r As Map";
Debug.ShouldStop(32);
_r = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("r", _r);
 BA.debugLineNum = 296;BA.debugLine="r = calc_wind( 1, 1, 0, 0, False )";
Debug.ShouldStop(128);
_r = __ref.runClassMethod (com.calypsoinstruments.anemotracker.windcalcs.class, "_calc_wind",(Object)(BA.numberCast(float.class, 1)),(Object)(BA.numberCast(float.class, 1)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(windcalcs.__c.getField(true,"False")));Debug.locals.put("r", _r);
 BA.debugLineNum = 297;BA.debugLine="results = results & r.Get( \"modulo\") & \", \" & r.";
Debug.ShouldStop(256);
_results = RemoteObject.concat(_results,_r.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("modulo")))),RemoteObject.createImmutable(", "),_r.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("angulo")))),RemoteObject.createImmutable("\\n"));Debug.locals.put("results", _results);
 BA.debugLineNum = 299;BA.debugLine="r = calc_wind( 1, 1, 45, 0, False )";
Debug.ShouldStop(1024);
_r = __ref.runClassMethod (com.calypsoinstruments.anemotracker.windcalcs.class, "_calc_wind",(Object)(BA.numberCast(float.class, 1)),(Object)(BA.numberCast(float.class, 1)),(Object)(BA.numberCast(float.class, 45)),(Object)(BA.numberCast(float.class, 0)),(Object)(windcalcs.__c.getField(true,"False")));Debug.locals.put("r", _r);
 BA.debugLineNum = 300;BA.debugLine="results = results & r.Get( \"modulo\") & \", \" & r.";
Debug.ShouldStop(2048);
_results = RemoteObject.concat(_results,_r.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("modulo")))),RemoteObject.createImmutable(", "),_r.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("angulo")))),RemoteObject.createImmutable("\\n"));Debug.locals.put("results", _results);
 BA.debugLineNum = 302;BA.debugLine="r = calc_wind( 1, 1, 90, 0, False )";
Debug.ShouldStop(8192);
_r = __ref.runClassMethod (com.calypsoinstruments.anemotracker.windcalcs.class, "_calc_wind",(Object)(BA.numberCast(float.class, 1)),(Object)(BA.numberCast(float.class, 1)),(Object)(BA.numberCast(float.class, 90)),(Object)(BA.numberCast(float.class, 0)),(Object)(windcalcs.__c.getField(true,"False")));Debug.locals.put("r", _r);
 BA.debugLineNum = 303;BA.debugLine="results = results & r.Get( \"modulo\") & \", \" & r.";
Debug.ShouldStop(16384);
_results = RemoteObject.concat(_results,_r.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("modulo")))),RemoteObject.createImmutable(", "),_r.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("angulo")))),RemoteObject.createImmutable("\\n"));Debug.locals.put("results", _results);
 BA.debugLineNum = 305;BA.debugLine="r = calc_wind( 1, 1, 135, 0, False )";
Debug.ShouldStop(65536);
_r = __ref.runClassMethod (com.calypsoinstruments.anemotracker.windcalcs.class, "_calc_wind",(Object)(BA.numberCast(float.class, 1)),(Object)(BA.numberCast(float.class, 1)),(Object)(BA.numberCast(float.class, 135)),(Object)(BA.numberCast(float.class, 0)),(Object)(windcalcs.__c.getField(true,"False")));Debug.locals.put("r", _r);
 BA.debugLineNum = 306;BA.debugLine="results = results & r.Get( \"modulo\") & \", \" & r.";
Debug.ShouldStop(131072);
_results = RemoteObject.concat(_results,_r.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("modulo")))),RemoteObject.createImmutable(", "),_r.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("angulo")))),RemoteObject.createImmutable("\\n"));Debug.locals.put("results", _results);
 BA.debugLineNum = 308;BA.debugLine="r = calc_wind( 1, 1, 180, 0, False )";
Debug.ShouldStop(524288);
_r = __ref.runClassMethod (com.calypsoinstruments.anemotracker.windcalcs.class, "_calc_wind",(Object)(BA.numberCast(float.class, 1)),(Object)(BA.numberCast(float.class, 1)),(Object)(BA.numberCast(float.class, 180)),(Object)(BA.numberCast(float.class, 0)),(Object)(windcalcs.__c.getField(true,"False")));Debug.locals.put("r", _r);
 BA.debugLineNum = 309;BA.debugLine="results = results & r.Get( \"modulo\") & \", \" & r.";
Debug.ShouldStop(1048576);
_results = RemoteObject.concat(_results,_r.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("modulo")))),RemoteObject.createImmutable(", "),_r.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("angulo")))),RemoteObject.createImmutable("\\n"));Debug.locals.put("results", _results);
 BA.debugLineNum = 311;BA.debugLine="r = calc_wind( 1, 1, 225, 0, False )";
Debug.ShouldStop(4194304);
_r = __ref.runClassMethod (com.calypsoinstruments.anemotracker.windcalcs.class, "_calc_wind",(Object)(BA.numberCast(float.class, 1)),(Object)(BA.numberCast(float.class, 1)),(Object)(BA.numberCast(float.class, 225)),(Object)(BA.numberCast(float.class, 0)),(Object)(windcalcs.__c.getField(true,"False")));Debug.locals.put("r", _r);
 BA.debugLineNum = 312;BA.debugLine="results = results & r.Get( \"modulo\") & \", \" & r.";
Debug.ShouldStop(8388608);
_results = RemoteObject.concat(_results,_r.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("modulo")))),RemoteObject.createImmutable(", "),_r.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("angulo")))),RemoteObject.createImmutable("\\n"));Debug.locals.put("results", _results);
 BA.debugLineNum = 314;BA.debugLine="r = calc_wind( 1, 1, 270, 0, False )";
Debug.ShouldStop(33554432);
_r = __ref.runClassMethod (com.calypsoinstruments.anemotracker.windcalcs.class, "_calc_wind",(Object)(BA.numberCast(float.class, 1)),(Object)(BA.numberCast(float.class, 1)),(Object)(BA.numberCast(float.class, 270)),(Object)(BA.numberCast(float.class, 0)),(Object)(windcalcs.__c.getField(true,"False")));Debug.locals.put("r", _r);
 BA.debugLineNum = 315;BA.debugLine="results = results & r.Get( \"modulo\") & \", \" & r.";
Debug.ShouldStop(67108864);
_results = RemoteObject.concat(_results,_r.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("modulo")))),RemoteObject.createImmutable(", "),_r.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("angulo")))),RemoteObject.createImmutable("\\n"));Debug.locals.put("results", _results);
 BA.debugLineNum = 317;BA.debugLine="r = calc_wind( 1, 1, 315, 0, False )";
Debug.ShouldStop(268435456);
_r = __ref.runClassMethod (com.calypsoinstruments.anemotracker.windcalcs.class, "_calc_wind",(Object)(BA.numberCast(float.class, 1)),(Object)(BA.numberCast(float.class, 1)),(Object)(BA.numberCast(float.class, 315)),(Object)(BA.numberCast(float.class, 0)),(Object)(windcalcs.__c.getField(true,"False")));Debug.locals.put("r", _r);
 BA.debugLineNum = 318;BA.debugLine="results = results & r.Get( \"modulo\") & \", \" & r.";
Debug.ShouldStop(536870912);
_results = RemoteObject.concat(_results,_r.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("modulo")))),RemoteObject.createImmutable(", "),_r.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("angulo")))),RemoteObject.createImmutable("\\n"));Debug.locals.put("results", _results);
 BA.debugLineNum = 320;BA.debugLine="r = calc_wind( 1, 1, 360, 0, False )";
Debug.ShouldStop(-2147483648);
_r = __ref.runClassMethod (com.calypsoinstruments.anemotracker.windcalcs.class, "_calc_wind",(Object)(BA.numberCast(float.class, 1)),(Object)(BA.numberCast(float.class, 1)),(Object)(BA.numberCast(float.class, 360)),(Object)(BA.numberCast(float.class, 0)),(Object)(windcalcs.__c.getField(true,"False")));Debug.locals.put("r", _r);
 BA.debugLineNum = 321;BA.debugLine="results = results & r.Get( \"modulo\") & \", \" & r.";
Debug.ShouldStop(1);
_results = RemoteObject.concat(_results,_r.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("modulo")))),RemoteObject.createImmutable(", "),_r.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("angulo")))),RemoteObject.createImmutable("\\n"));Debug.locals.put("results", _results);
 BA.debugLineNum = 330;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("updateEstimate (windcalcs) ","windcalcs",8,__ref.getField(false, "ba"),__ref,373);
if (RapidSub.canDelegate("updateestimate")) { return __ref.runUserSub(false, "windcalcs","updateestimate", __ref, _mea, _k);}
Debug.locals.put("mea", _mea);
Debug.locals.put("k", _k);
 BA.debugLineNum = 373;BA.debugLine="Sub updateEstimate(mea As Float, k As tKalman) As";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 375;BA.debugLine="k.kalman_gain = k.err_estimate/(k.err_estimate +";
Debug.ShouldStop(4194304);
_k.setField ("kalman_gain",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_k.getField(true,"err_estimate"),(RemoteObject.solve(new RemoteObject[] {_k.getField(true,"err_estimate"),_k.getField(true,"err_measure")}, "+",1, 0))}, "/",0, 0)));
 BA.debugLineNum = 376;BA.debugLine="k.current_estimate = k.last_estimate + k.kalman_";
Debug.ShouldStop(8388608);
_k.setField ("current_estimate",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_k.getField(true,"last_estimate"),_k.getField(true,"kalman_gain"),(RemoteObject.solve(new RemoteObject[] {_mea,_k.getField(true,"last_estimate")}, "-",1, 0))}, "+*",1, 0)));
 BA.debugLineNum = 377;BA.debugLine="k.err_estimate =  (1.0 - k.kalman_gain)*k.err_es";
Debug.ShouldStop(16777216);
_k.setField ("err_estimate",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1.0),_k.getField(true,"kalman_gain")}, "-",1, 0)),_k.getField(true,"err_estimate"),windcalcs.__c.runMethod(true,"Abs",(Object)(RemoteObject.solve(new RemoteObject[] {_k.getField(true,"last_estimate"),_k.getField(true,"current_estimate")}, "-",1, 0))),_k.getField(true,"q")}, "*+*",1, 0)));
 BA.debugLineNum = 378;BA.debugLine="k.last_estimate=k.current_estimate";
Debug.ShouldStop(33554432);
_k.setField ("last_estimate",_k.getField(true,"current_estimate"));
 BA.debugLineNum = 380;BA.debugLine="Return k.current_estimate";
Debug.ShouldStop(134217728);
if (true) return _k.getField(true,"current_estimate");
 BA.debugLineNum = 381;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updateestimate2(RemoteObject __ref,RemoteObject _mea,RemoteObject _k) throws Exception{
try {
		Debug.PushSubsStack("updateEstimate2 (windcalcs) ","windcalcs",8,__ref.getField(false, "ba"),__ref,393);
if (RapidSub.canDelegate("updateestimate2")) { return __ref.runUserSub(false, "windcalcs","updateestimate2", __ref, _mea, _k);}
Debug.locals.put("mea", _mea);
Debug.locals.put("k", _k);
 BA.debugLineNum = 393;BA.debugLine="Sub updateEstimate2( mea As Float, k As tKalman2";
Debug.ShouldStop(256);
 BA.debugLineNum = 396;BA.debugLine="k.xk = k.xk + k.pk/(k.pk+1)*(mea-k.xk)";
Debug.ShouldStop(2048);
_k.setField ("xk",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_k.getField(true,"xk"),_k.getField(true,"pk"),(RemoteObject.solve(new RemoteObject[] {_k.getField(true,"pk"),RemoteObject.createImmutable(1)}, "+",1, 0)),(RemoteObject.solve(new RemoteObject[] {_mea,_k.getField(true,"xk")}, "-",1, 0))}, "+/*",1, 0)));
 BA.debugLineNum = 397;BA.debugLine="k.pk = k.pk/(1+k.pk)";
Debug.ShouldStop(4096);
_k.setField ("pk",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_k.getField(true,"pk"),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1),_k.getField(true,"pk")}, "+",1, 0))}, "/",0, 0)));
 BA.debugLineNum = 399;BA.debugLine="Return k.xk";
Debug.ShouldStop(16384);
if (true) return _k.getField(true,"xk");
 BA.debugLineNum = 401;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updateestimate3(RemoteObject __ref,RemoteObject _mea,RemoteObject _k) throws Exception{
try {
		Debug.PushSubsStack("updateEstimate3 (windcalcs) ","windcalcs",8,__ref.getField(false, "ba"),__ref,403);
if (RapidSub.canDelegate("updateestimate3")) { return __ref.runUserSub(false, "windcalcs","updateestimate3", __ref, _mea, _k);}
Debug.locals.put("mea", _mea);
Debug.locals.put("k", _k);
 BA.debugLineNum = 403;BA.debugLine="Sub updateEstimate3( mea As Float, k As tKalman3 )";
Debug.ShouldStop(262144);
 BA.debugLineNum = 404;BA.debugLine="k.p = k.p + k.q";
Debug.ShouldStop(524288);
_k.setField ("p",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_k.getField(true,"p"),_k.getField(true,"q")}, "+",1, 0)));
 BA.debugLineNum = 407;BA.debugLine="k.k = k.p / (k.p + k.r)";
Debug.ShouldStop(4194304);
_k.setField ("k",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_k.getField(true,"p"),(RemoteObject.solve(new RemoteObject[] {_k.getField(true,"p"),_k.getField(true,"r")}, "+",1, 0))}, "/",0, 0)));
 BA.debugLineNum = 408;BA.debugLine="k.x = k.x + k.k * (mea - k.x)";
Debug.ShouldStop(8388608);
_k.setField ("x",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_k.getField(true,"x"),_k.getField(true,"k"),(RemoteObject.solve(new RemoteObject[] {_mea,_k.getField(true,"x")}, "-",1, 0))}, "+*",1, 0)));
 BA.debugLineNum = 409;BA.debugLine="k.p = (1 - k.k) * k.p";
Debug.ShouldStop(16777216);
_k.setField ("p",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1),_k.getField(true,"k")}, "-",1, 0)),_k.getField(true,"p")}, "*",0, 0)));
 BA.debugLineNum = 411;BA.debugLine="Return k.x";
Debug.ShouldStop(67108864);
if (true) return _k.getField(true,"x");
 BA.debugLineNum = 413;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}