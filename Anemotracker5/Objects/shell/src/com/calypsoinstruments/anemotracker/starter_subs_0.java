package com.calypsoinstruments.anemotracker;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class starter_subs_0 {


public static RemoteObject  _application_error(RemoteObject _error,RemoteObject _stacktrace) throws Exception{
try {
		Debug.PushSubsStack("Application_Error (starter) ","starter",5,starter.processBA,starter.mostCurrent,214);
if (RapidSub.canDelegate("application_error")) { return com.calypsoinstruments.anemotracker.starter.remoteMe.runUserSub(false, "starter","application_error", _error, _stacktrace);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _l = RemoteObject.createImmutable(0L);
RemoteObject _email = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.Email");
RemoteObject _ph = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone");
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 214;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 215;BA.debugLine="If allowReport = False Then Return True";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",starter._allowreport,starter.mostCurrent.__c.getField(true,"False"))) { 
if (true) return starter.mostCurrent.__c.getField(true,"True");};
 BA.debugLineNum = 217;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(16777216);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 218;BA.debugLine="Dim l As Long = 500";
Debug.ShouldStop(33554432);
_l = BA.numberCast(long.class, 500);Debug.locals.put("l", _l);Debug.locals.put("l", _l);
 BA.debugLineNum = 219;BA.debugLine="jo.InitializeStatic(\"java.lang.Thread\").RunMethod";
Debug.ShouldStop(67108864);
_jo.runMethod(false,"InitializeStatic",(Object)(RemoteObject.createImmutable("java.lang.Thread"))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("sleep")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_l)})));
 BA.debugLineNum = 220;BA.debugLine="logcat.LogCatStop";
Debug.ShouldStop(134217728);
starter._logcat.runVoidMethod ("LogCatStop");
 BA.debugLineNum = 221;BA.debugLine="logs.Append(StackTrace)";
Debug.ShouldStop(268435456);
starter._logs.runVoidMethod ("Append",(Object)(_stacktrace));
 BA.debugLineNum = 222;BA.debugLine="Dim email As Email";
Debug.ShouldStop(536870912);
_email = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.Email");Debug.locals.put("email", _email);
 BA.debugLineNum = 223;BA.debugLine="Dim ph As Phone";
Debug.ShouldStop(1073741824);
_ph = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");Debug.locals.put("ph", _ph);
 BA.debugLineNum = 224;BA.debugLine="email.To.Add(\"anemotrackerdev@gmail.com\")";
Debug.ShouldStop(-2147483648);
_email.getField(false,"To").runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("anemotrackerdev@gmail.com"))));
 BA.debugLineNum = 225;BA.debugLine="email.Subject = \"App crash report \" & actual_ultr";
Debug.ShouldStop(1);
_email.setField ("Subject",RemoteObject.concat(RemoteObject.createImmutable("App crash report "),starter._actual_ultra.getField(true,"MacAddress"),RemoteObject.createImmutable(" "),_ph.runMethod(true,"getManufacturer"),RemoteObject.createImmutable(" "),_ph.runMethod(true,"getModel"),RemoteObject.createImmutable(" "),_ph.runMethod(true,"getProduct")));
 BA.debugLineNum = 226;BA.debugLine="email.Body = logs";
Debug.ShouldStop(2);
_email.setField ("Body",BA.ObjectToString(starter._logs));
 BA.debugLineNum = 227;BA.debugLine="StartActivity(email.GetIntent)";
Debug.ShouldStop(4);
starter.mostCurrent.__c.runVoidMethod ("StartActivity",starter.processBA,(Object)((_email.runMethod(false,"GetIntent"))));
 BA.debugLineNum = 229;BA.debugLine="Return True";
Debug.ShouldStop(16);
if (true) return starter.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 230;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ble_connected(RemoteObject _services) throws Exception{
try {
		Debug.PushSubsStack("ble_Connected (starter) ","starter",5,starter.processBA,starter.mostCurrent,357);
if (RapidSub.canDelegate("ble_connected")) { return com.calypsoinstruments.anemotracker.starter.remoteMe.runUserSub(false, "starter","ble_connected", _services);}
RemoteObject _s = RemoteObject.createImmutable("");
Debug.locals.put("Services", _services);
 BA.debugLineNum = 357;BA.debugLine="Sub ble_Connected (Services As List)";
Debug.ShouldStop(16);
 BA.debugLineNum = 358;BA.debugLine="Scan.StopScan";
Debug.ShouldStop(32);
starter._scan.runVoidMethod ("StopScan");
 BA.debugLineNum = 359;BA.debugLine="tScan.Enabled = False";
Debug.ShouldStop(64);
starter._tscan.runMethod(true,"setEnabled",starter.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 360;BA.debugLine="Main.kvs.PutObject( \"last_ultra\", actual_ultra )";
Debug.ShouldStop(128);
starter.mostCurrent._main._kvs.runClassMethod (com.calypsoinstruments.anemotracker.keyvaluestore.class, "_putobject",(Object)(BA.ObjectToString("last_ultra")),(Object)((starter._actual_ultra)));
 BA.debugLineNum = 361;BA.debugLine="bSetNotify = False";
Debug.ShouldStop(256);
starter._bsetnotify = starter.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 362;BA.debugLine="bHz = False";
Debug.ShouldStop(512);
starter._bhz = starter.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 363;BA.debugLine="For Each s As String In Services";
Debug.ShouldStop(1024);
{
final RemoteObject group6 = _services;
final int groupLen6 = group6.runMethod(true,"getSize").<Integer>get()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_s = BA.ObjectToString(group6.runMethod(false,"Get",index6));Debug.locals.put("s", _s);
Debug.locals.put("s", _s);
 BA.debugLineNum = 364;BA.debugLine="Log(s)";
Debug.ShouldStop(2048);
starter.mostCurrent.__c.runVoidMethod ("Log",(Object)(_s));
 }
}Debug.locals.put("s", _s);
;
 BA.debugLineNum = 366;BA.debugLine="Timer_ble.Enabled = True";
Debug.ShouldStop(8192);
starter._timer_ble.runMethod(true,"setEnabled",starter.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 367;BA.debugLine="connected = True";
Debug.ShouldStop(16384);
starter._connected = starter.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 368;BA.debugLine="cNormal = \"\"";
Debug.ShouldStop(32768);
starter._cnormal = BA.ObjectToString("");
 BA.debugLineNum = 369;BA.debugLine="cRate = \"\"";
Debug.ShouldStop(65536);
starter._crate = BA.ObjectToString("");
 BA.debugLineNum = 370;BA.debugLine="cSensors = \"\"";
Debug.ShouldStop(131072);
starter._csensors = BA.ObjectToString("");
 BA.debugLineNum = 371;BA.debugLine="cStatus = \"\"";
Debug.ShouldStop(262144);
starter._cstatus = BA.ObjectToString("");
 BA.debugLineNum = 372;BA.debugLine="cNmea = \"\"";
Debug.ShouldStop(524288);
starter._cnmea = BA.ObjectToString("");
 BA.debugLineNum = 373;BA.debugLine="ToastMessageShow( \"Connected \"&uId, True )";
Debug.ShouldStop(1048576);
starter.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Connected "),starter._uid))),(Object)(starter.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 374;BA.debugLine="For Each s As String In Services";
Debug.ShouldStop(2097152);
{
final RemoteObject group17 = _services;
final int groupLen17 = group17.runMethod(true,"getSize").<Integer>get()
;int index17 = 0;
;
for (; index17 < groupLen17;index17++){
_s = BA.ObjectToString(group17.runMethod(false,"Get",index17));Debug.locals.put("s", _s);
Debug.locals.put("s", _s);
 BA.debugLineNum = 375;BA.debugLine="If s.StartsWith( \"0000180d\" ) Then";
Debug.ShouldStop(4194304);
if (_s.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("0000180d"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 376;BA.debugLine="sUltra = s";
Debug.ShouldStop(8388608);
starter._sultra = _s;
 BA.debugLineNum = 377;BA.debugLine="Scan.ReadData(s)";
Debug.ShouldStop(16777216);
starter._scan.runVoidMethod ("ReadData",(Object)(_s));
 }else 
{ BA.debugLineNum = 378;BA.debugLine="Else If s.StartsWith( \"0000180a\" ) Then";
Debug.ShouldStop(33554432);
if (_s.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("0000180a"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 379;BA.debugLine="sUltra = s";
Debug.ShouldStop(67108864);
starter._sultra = _s;
 BA.debugLineNum = 380;BA.debugLine="Scan.ReadData(s)";
Debug.ShouldStop(134217728);
starter._scan.runVoidMethod ("ReadData",(Object)(_s));
 }}
;
 }
}Debug.locals.put("s", _s);
;
 BA.debugLineNum = 418;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ble_dataavailable(RemoteObject _serviceid,RemoteObject _characteristics) throws Exception{
try {
		Debug.PushSubsStack("ble_DataAvailable (starter) ","starter",5,starter.processBA,starter.mostCurrent,565);
if (RapidSub.canDelegate("ble_dataavailable")) { return com.calypsoinstruments.anemotracker.starter.remoteMe.runUserSub(false, "starter","ble_dataavailable", _serviceid, _characteristics);}
RemoteObject _id = RemoteObject.createImmutable("");
RemoteObject _bc = RemoteObject.declareNull("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");
RemoteObject _bvars = null;
RemoteObject _svars = null;
RemoteObject _velocidad = RemoteObject.createImmutable(0f);
RemoteObject _direccion = RemoteObject.createImmutable(0f);
Debug.locals.put("ServiceId", _serviceid);
Debug.locals.put("Characteristics", _characteristics);
 BA.debugLineNum = 565;BA.debugLine="Sub ble_DataAvailable (ServiceId As String, Charac";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 566;BA.debugLine="If ServiceId.StartsWith( \"0000180d\" ) Then";
Debug.ShouldStop(2097152);
if (_serviceid.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("0000180d"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 567;BA.debugLine="If Not( bSetNotify ) Then";
Debug.ShouldStop(4194304);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter._bsetnotify)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 572;BA.debugLine="For Each id As String In Characteristics.Keys";
Debug.ShouldStop(134217728);
{
final RemoteObject group3 = _characteristics.runMethod(false,"Keys");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_id = BA.ObjectToString(group3.runMethod(false,"Get",index3));Debug.locals.put("id", _id);
Debug.locals.put("id", _id);
 BA.debugLineNum = 573;BA.debugLine="If id.StartsWith( \"00002a39\" ) Then";
Debug.ShouldStop(268435456);
if (_id.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("00002a39"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 574;BA.debugLine="cNormal = id";
Debug.ShouldStop(536870912);
starter._cnormal = _id;
 BA.debugLineNum = 575;BA.debugLine="Dim bc As ByteConverter";
Debug.ShouldStop(1073741824);
_bc = RemoteObject.createNew ("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");Debug.locals.put("bc", _bc);
 BA.debugLineNum = 576;BA.debugLine="Scan.SetNotify( sUltra, cNormal, True )";
Debug.ShouldStop(-2147483648);
starter._scan.runVoidMethod ("SetNotify",(Object)(starter._sultra),(Object)(starter._cnormal),(Object)(starter.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 577;BA.debugLine="bSetNotify = True";
Debug.ShouldStop(1);
starter._bsetnotify = starter.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 579;BA.debugLine="If id.StartsWith( \"0000a002\" ) Then";
Debug.ShouldStop(4);
if (_id.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("0000a002"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 580;BA.debugLine="cRate = id";
Debug.ShouldStop(8);
starter._crate = _id;
 };
 BA.debugLineNum = 590;BA.debugLine="If id.StartsWith( \"0000a003\" ) Then";
Debug.ShouldStop(8192);
if (_id.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("0000a003"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 591;BA.debugLine="cSensors = id";
Debug.ShouldStop(16384);
starter._csensors = _id;
 };
 BA.debugLineNum = 593;BA.debugLine="If id.StartsWith( \"0000a001\" ) Then";
Debug.ShouldStop(65536);
if (_id.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("0000a001"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 594;BA.debugLine="cStatus = id";
Debug.ShouldStop(131072);
starter._cstatus = _id;
 };
 BA.debugLineNum = 596;BA.debugLine="If id.StartsWith( \"0000b001\" ) Then";
Debug.ShouldStop(524288);
if (_id.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("0000b001"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 597;BA.debugLine="cNmea = id";
Debug.ShouldStop(1048576);
starter._cnmea = _id;
 };
 BA.debugLineNum = 599;BA.debugLine="If id.StartsWith( \"0000a00b\" ) Then";
Debug.ShouldStop(4194304);
if (_id.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("0000a00b"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 600;BA.debugLine="cCalComp = id";
Debug.ShouldStop(8388608);
starter._ccalcomp = _id;
 };
 BA.debugLineNum = 611;BA.debugLine="If sUltra.StartsWith( \"0000180d\" ) Then";
Debug.ShouldStop(4);
if (starter._sultra.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("0000180d"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 612;BA.debugLine="CallSubDelayed( Main, \"UpdateDrawer\" )";
Debug.ShouldStop(8);
starter.mostCurrent.__c.runVoidMethod ("CallSubDelayed",starter.processBA,(Object)((starter.mostCurrent._main.getObject())),(Object)(RemoteObject.createImmutable("UpdateDrawer")));
 BA.debugLineNum = 613;BA.debugLine="CallSubDelayed( Main, \"add_secondary_drawer\")";
Debug.ShouldStop(16);
starter.mostCurrent.__c.runVoidMethod ("CallSubDelayed",starter.processBA,(Object)((starter.mostCurrent._main.getObject())),(Object)(RemoteObject.createImmutable("add_secondary_drawer")));
 };
 }
}Debug.locals.put("id", _id);
;
 };
 BA.debugLineNum = 620;BA.debugLine="If Characteristics.ContainsKey( cNormal ) Then";
Debug.ShouldStop(2048);
if (_characteristics.runMethod(true,"ContainsKey",(Object)((starter._cnormal))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 622;BA.debugLine="Dim bc As ByteConverter";
Debug.ShouldStop(8192);
_bc = RemoteObject.createNew ("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");Debug.locals.put("bc", _bc);
 BA.debugLineNum = 623;BA.debugLine="bc.LittleEndian = True";
Debug.ShouldStop(16384);
_bc.runMethod(true,"setLittleEndian",starter.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 625;BA.debugLine="Dim bVars(4) As Byte";
Debug.ShouldStop(65536);
_bvars = RemoteObject.createNewArray ("byte", new int[] {4}, new Object[]{});Debug.locals.put("bVars", _bvars);
 BA.debugLineNum = 626;BA.debugLine="Dim sVars() As Short";
Debug.ShouldStop(131072);
_svars = RemoteObject.createNewArray ("short", new int[] {0}, new Object[]{});Debug.locals.put("sVars", _svars);
 BA.debugLineNum = 627;BA.debugLine="bc.ArrayCopy(Characteristics.Get(cNormal), 0, b";
Debug.ShouldStop(262144);
_bc.runVoidMethod ("ArrayCopy",(Object)(_characteristics.runMethod(false,"Get",(Object)((starter._cnormal)))),(Object)(BA.numberCast(int.class, 0)),(Object)((_bvars)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 4)));
 BA.debugLineNum = 628;BA.debugLine="sVars = bc.ShortsFromBytes( bVars )";
Debug.ShouldStop(524288);
_svars = _bc.runMethod(false,"ShortsFromBytes",(Object)(_bvars));Debug.locals.put("sVars", _svars);
 BA.debugLineNum = 629;BA.debugLine="Dim velocidad, direccion As Float";
Debug.ShouldStop(1048576);
_velocidad = RemoteObject.createImmutable(0f);Debug.locals.put("velocidad", _velocidad);
_direccion = RemoteObject.createImmutable(0f);Debug.locals.put("direccion", _direccion);
 BA.debugLineNum = 630;BA.debugLine="velocidad = sVars(0)";
Debug.ShouldStop(2097152);
_velocidad = BA.numberCast(float.class, _svars.getArrayElement(true,BA.numberCast(int.class, 0)));Debug.locals.put("velocidad", _velocidad);
 BA.debugLineNum = 631;BA.debugLine="direccion = sVars(1)";
Debug.ShouldStop(4194304);
_direccion = BA.numberCast(float.class, _svars.getArrayElement(true,BA.numberCast(int.class, 1)));Debug.locals.put("direccion", _direccion);
 BA.debugLineNum = 632;BA.debugLine="calcs_1.orig_vane = direccion";
Debug.ShouldStop(8388608);
starter._calcs_1.setField ("_orig_vane",_direccion);
 BA.debugLineNum = 633;BA.debugLine="calcs_1.orig_anemo = velocidad/100";
Debug.ShouldStop(16777216);
starter._calcs_1.setField ("_orig_anemo",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_velocidad,RemoteObject.createImmutable(100)}, "/",0, 0)));
 BA.debugLineNum = 634;BA.debugLine="calcs_1.vane  = direccion";
Debug.ShouldStop(33554432);
starter._calcs_1.setField ("_vane",_direccion);
 BA.debugLineNum = 635;BA.debugLine="calcs_1.calc_anemo_k( velocidad / 100, direccio";
Debug.ShouldStop(67108864);
starter._calcs_1.runClassMethod (com.calypsoinstruments.anemotracker.windcalcs.class, "_calc_anemo_k",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_velocidad,RemoteObject.createImmutable(100)}, "/",0, 0))),(Object)(_direccion));
 BA.debugLineNum = 637;BA.debugLine="If deviceType = 2 Then  ' solo ultra, cups y nm";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",starter._devicetype,BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 638;BA.debugLine="bc.ArrayCopy(Characteristics.Get(cNormal), 4,";
Debug.ShouldStop(536870912);
_bc.runVoidMethod ("ArrayCopy",(Object)(_characteristics.runMethod(false,"Get",(Object)((starter._cnormal)))),(Object)(BA.numberCast(int.class, 4)),(Object)((_bvars)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 4)));
 BA.debugLineNum = 640;BA.debugLine="calcs_1.battery = ToUnsigned(bVars(0))*10";
Debug.ShouldStop(-2147483648);
starter._calcs_1.setField ("_battery",RemoteObject.solve(new RemoteObject[] {_tounsigned(_bvars.getArrayElement(true,BA.numberCast(int.class, 0))),RemoteObject.createImmutable(10)}, "*",0, 1));
 BA.debugLineNum = 641;BA.debugLine="calcs_1.temp = ToUnsigned(bVars(1)) - 100";
Debug.ShouldStop(1);
starter._calcs_1.setField ("_temp",RemoteObject.solve(new RemoteObject[] {_tounsigned(_bvars.getArrayElement(true,BA.numberCast(int.class, 1))),RemoteObject.createImmutable(100)}, "-",1, 1));
 BA.debugLineNum = 642;BA.debugLine="calcs_1.roll = ToUnsigned(bVars(2)) - 90";
Debug.ShouldStop(2);
starter._calcs_1.setField ("_roll",RemoteObject.solve(new RemoteObject[] {_tounsigned(_bvars.getArrayElement(true,BA.numberCast(int.class, 2))),RemoteObject.createImmutable(90)}, "-",1, 1));
 BA.debugLineNum = 643;BA.debugLine="calcs_1.pitch = ToUnsigned(bVars(3)) - 90";
Debug.ShouldStop(4);
starter._calcs_1.setField ("_pitch",RemoteObject.solve(new RemoteObject[] {_tounsigned(_bvars.getArrayElement(true,BA.numberCast(int.class, 3))),RemoteObject.createImmutable(90)}, "-",1, 1));
 BA.debugLineNum = 646;BA.debugLine="bc.ArrayCopy(Characteristics.Get(cNormal), 8,";
Debug.ShouldStop(32);
_bc.runVoidMethod ("ArrayCopy",(Object)(_characteristics.runMethod(false,"Get",(Object)((starter._cnormal)))),(Object)(BA.numberCast(int.class, 8)),(Object)((_bvars)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)));
 BA.debugLineNum = 647;BA.debugLine="sVars = bc.ShortsFromBytes( bVars )";
Debug.ShouldStop(64);
_svars = _bc.runMethod(false,"ShortsFromBytes",(Object)(_bvars));Debug.locals.put("sVars", _svars);
 BA.debugLineNum = 648;BA.debugLine="calcs_1.ecompass = 360-sVars(0) + Main.offset_";
Debug.ShouldStop(128);
starter._calcs_1.setField ("_ecompass",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(360),_svars.getArrayElement(true,BA.numberCast(int.class, 0)),starter.mostCurrent._main._offset_angle}, "-+",2, 0)));
 };
 BA.debugLineNum = 654;BA.debugLine="c_ble = c_ble + 1";
Debug.ShouldStop(8192);
starter._c_ble = RemoteObject.solve(new RemoteObject[] {starter._c_ble,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 655;BA.debugLine="calcs_1.calc";
Debug.ShouldStop(16384);
starter._calcs_1.runClassMethod (com.calypsoinstruments.anemotracker.windcalcs.class, "_calc");
 BA.debugLineNum = 656;BA.debugLine="If Not( Main.bPaused ) Then";
Debug.ShouldStop(32768);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter.mostCurrent._main._bpaused)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 657;BA.debugLine="CallSubDelayed2( Main, \"Update\", False)";
Debug.ShouldStop(65536);
starter.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",starter.processBA,(Object)((starter.mostCurrent._main.getObject())),(Object)(BA.ObjectToString("Update")),(Object)((starter.mostCurrent.__c.getField(true,"False"))));
 };
 };
 BA.debugLineNum = 660;BA.debugLine="If Characteristics.ContainsKey(cRate) Then";
Debug.ShouldStop(524288);
if (_characteristics.runMethod(true,"ContainsKey",(Object)((starter._crate))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 661;BA.debugLine="Log( Characteristics.Get(cRate) )";
Debug.ShouldStop(1048576);
starter.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(_characteristics.runMethod(false,"Get",(Object)((starter._crate))))));
 };
 }else 
{ BA.debugLineNum = 664;BA.debugLine="Else If ServiceId.StartsWith( \"0000180a\" ) Then";
Debug.ShouldStop(8388608);
if (_serviceid.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("0000180a"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 666;BA.debugLine="Dim bc As ByteConverter";
Debug.ShouldStop(33554432);
_bc = RemoteObject.createNew ("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");Debug.locals.put("bc", _bc);
 BA.debugLineNum = 667;BA.debugLine="bc.LittleEndian = True";
Debug.ShouldStop(67108864);
_bc.runMethod(true,"setLittleEndian",starter.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 668;BA.debugLine="deviceInfo.Initialize";
Debug.ShouldStop(134217728);
starter._deviceinfo.runVoidMethod ("Initialize");
 BA.debugLineNum = 669;BA.debugLine="For Each id As String In Characteristics.Keys";
Debug.ShouldStop(268435456);
{
final RemoteObject group68 = _characteristics.runMethod(false,"Keys");
final int groupLen68 = group68.runMethod(true,"getSize").<Integer>get()
;int index68 = 0;
;
for (; index68 < groupLen68;index68++){
_id = BA.ObjectToString(group68.runMethod(false,"Get",index68));Debug.locals.put("id", _id);
Debug.locals.put("id", _id);
 BA.debugLineNum = 670;BA.debugLine="If id.StartsWith(\"00002a29\") Then 'Manufacturer";
Debug.ShouldStop(536870912);
if (_id.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("00002a29"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 671;BA.debugLine="deviceInfo.Put(\"Manufacturer Name\", bc.StringF";
Debug.ShouldStop(1073741824);
starter._deviceinfo.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Manufacturer Name"))),(Object)((_bc.runMethod(true,"StringFromBytes",(Object)((_characteristics.runMethod(false,"Get",(Object)((_id))))),(Object)(RemoteObject.createImmutable("ASCII"))))));
 }else 
{ BA.debugLineNum = 672;BA.debugLine="else if id.StartsWith(\"00002a24\") Then 'Model n";
Debug.ShouldStop(-2147483648);
if (_id.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("00002a24"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 673;BA.debugLine="deviceInfo.Put(\"Model Number\", bc.StringFromBy";
Debug.ShouldStop(1);
starter._deviceinfo.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Model Number"))),(Object)((_bc.runMethod(true,"StringFromBytes",(Object)((_characteristics.runMethod(false,"Get",(Object)((_id))))),(Object)(RemoteObject.createImmutable("ASCII"))))));
 }else 
{ BA.debugLineNum = 674;BA.debugLine="else if id.StartsWith(\"00002a25\") Then 'Serial";
Debug.ShouldStop(2);
if (_id.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("00002a25"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 675;BA.debugLine="deviceInfo.Put(\"Serial Number\", bc.StringFromB";
Debug.ShouldStop(4);
starter._deviceinfo.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Serial Number"))),(Object)((_bc.runMethod(true,"StringFromBytes",(Object)((_characteristics.runMethod(false,"Get",(Object)((_id))))),(Object)(RemoteObject.createImmutable("ASCII"))))));
 }else 
{ BA.debugLineNum = 676;BA.debugLine="else if id.StartsWith(\"00002a27\") Then 'HW revi";
Debug.ShouldStop(8);
if (_id.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("00002a27"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 677;BA.debugLine="deviceInfo.Put(\"Hardware Revision\", bc.StringF";
Debug.ShouldStop(16);
starter._deviceinfo.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Hardware Revision"))),(Object)((_bc.runMethod(true,"StringFromBytes",(Object)((_characteristics.runMethod(false,"Get",(Object)((_id))))),(Object)(RemoteObject.createImmutable("ASCII"))))));
 }else 
{ BA.debugLineNum = 678;BA.debugLine="else if id.StartsWith(\"00002a26\") Then 'FW revi";
Debug.ShouldStop(32);
if (_id.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("00002a26"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 679;BA.debugLine="deviceInfo.Put(\"Firmware Revision\", bc.StringF";
Debug.ShouldStop(64);
starter._deviceinfo.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Firmware Revision"))),(Object)((_bc.runMethod(true,"StringFromBytes",(Object)((_characteristics.runMethod(false,"Get",(Object)((_id))))),(Object)(RemoteObject.createImmutable("ASCII"))))));
 }else 
{ BA.debugLineNum = 680;BA.debugLine="else if id.StartsWith(\"00002a28\") Then 'SW revi";
Debug.ShouldStop(128);
if (_id.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("00002a28"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 681;BA.debugLine="deviceInfo.Put(\"Software Revision\", bc.StringF";
Debug.ShouldStop(256);
starter._deviceinfo.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Software Revision"))),(Object)((_bc.runMethod(true,"StringFromBytes",(Object)((_characteristics.runMethod(false,"Get",(Object)((_id))))),(Object)(RemoteObject.createImmutable("ASCII"))))));
 }}}}}}
;
 }
}Debug.locals.put("id", _id);
;
 }}
;
 BA.debugLineNum = 687;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ble_devicefound(RemoteObject _name,RemoteObject _macaddress,RemoteObject _advertisingdata,RemoteObject _rssi) throws Exception{
try {
		Debug.PushSubsStack("ble_DeviceFound (starter) ","starter",5,starter.processBA,starter.mostCurrent,315);
if (RapidSub.canDelegate("ble_devicefound")) { return com.calypsoinstruments.anemotracker.starter.remoteMe.runUserSub(false, "starter","ble_devicefound", _name, _macaddress, _advertisingdata, _rssi);}
RemoteObject _ultra = RemoteObject.declareNull("com.calypsoinstruments.anemotracker.starter._tultra");
Debug.locals.put("name", _name);
Debug.locals.put("MacAddress", _macaddress);
Debug.locals.put("AdvertisingData", _advertisingdata);
Debug.locals.put("RSSI", _rssi);
 BA.debugLineNum = 315;BA.debugLine="Sub ble_DeviceFound (name As String, MacAddress As";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 321;BA.debugLine="Dim ultra As tUltra";
Debug.ShouldStop(1);
_ultra = RemoteObject.createNew ("com.calypsoinstruments.anemotracker.starter._tultra");Debug.locals.put("ultra", _ultra);
 BA.debugLineNum = 322;BA.debugLine="ultra.Name = name";
Debug.ShouldStop(2);
_ultra.setField ("Name",_name);
 BA.debugLineNum = 323;BA.debugLine="ultra.MacAddress = MacAddress";
Debug.ShouldStop(4);
_ultra.setField ("MacAddress",_macaddress);
 BA.debugLineNum = 324;BA.debugLine="ultra.RSSI = RSSI";
Debug.ShouldStop(8);
_ultra.setField ("RSSI",_rssi);
 BA.debugLineNum = 326;BA.debugLine="devices.Put( MacAddress, ultra )";
Debug.ShouldStop(32);
starter._devices.runVoidMethod ("Put",(Object)((_macaddress)),(Object)((_ultra)));
 BA.debugLineNum = 328;BA.debugLine="If bSelectBLE = True Then CallSubDelayed( actBLE,";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",starter._bselectble,starter.mostCurrent.__c.getField(true,"True"))) { 
starter.mostCurrent.__c.runVoidMethod ("CallSubDelayed",starter.processBA,(Object)((starter.mostCurrent._actble.getObject())),(Object)(RemoteObject.createImmutable("addToListRT")));};
 BA.debugLineNum = 334;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ble_disconnected() throws Exception{
try {
		Debug.PushSubsStack("ble_Disconnected (starter) ","starter",5,starter.processBA,starter.mostCurrent,420);
if (RapidSub.canDelegate("ble_disconnected")) { return com.calypsoinstruments.anemotracker.starter.remoteMe.runUserSub(false, "starter","ble_disconnected");}
 BA.debugLineNum = 420;BA.debugLine="Sub ble_Disconnected";
Debug.ShouldStop(8);
 BA.debugLineNum = 422;BA.debugLine="connected = False";
Debug.ShouldStop(32);
starter._connected = starter.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 424;BA.debugLine="Timer_ble.Enabled = False";
Debug.ShouldStop(128);
starter._timer_ble.runMethod(true,"setEnabled",starter.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 425;BA.debugLine="tScan.Enabled = False";
Debug.ShouldStop(256);
starter._tscan.runMethod(true,"setEnabled",starter.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 426;BA.debugLine="ToastMessageShow( \"Disconnected from \" & actual_u";
Debug.ShouldStop(512);
starter.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Disconnected from "),starter._actual_ultra.getField(true,"MacAddress")))),(Object)(starter.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 427;BA.debugLine="Log(\"disconnected\")";
Debug.ShouldStop(1024);
starter.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("disconnected")));
 BA.debugLineNum = 437;BA.debugLine="CallSubDelayed( Main, \"remove_secondary_drawer\")";
Debug.ShouldStop(1048576);
starter.mostCurrent.__c.runVoidMethod ("CallSubDelayed",starter.processBA,(Object)((starter.mostCurrent._main.getObject())),(Object)(RemoteObject.createImmutable("remove_secondary_drawer")));
 BA.debugLineNum = 439;BA.debugLine="CallSubDelayed( Main, \"Disconnect\" )";
Debug.ShouldStop(4194304);
starter.mostCurrent.__c.runVoidMethod ("CallSubDelayed",starter.processBA,(Object)((starter.mostCurrent._main.getObject())),(Object)(RemoteObject.createImmutable("Disconnect")));
 BA.debugLineNum = 441;BA.debugLine="calcs_1.anemo = 0";
Debug.ShouldStop(16777216);
starter._calcs_1.setField ("_anemo",BA.numberCast(float.class, 0));
 BA.debugLineNum = 442;BA.debugLine="calcs_1.vane  = 0";
Debug.ShouldStop(33554432);
starter._calcs_1.setField ("_vane",BA.numberCast(float.class, 0));
 BA.debugLineNum = 443;BA.debugLine="calcs_1.calc";
Debug.ShouldStop(67108864);
starter._calcs_1.runClassMethod (com.calypsoinstruments.anemotracker.windcalcs.class, "_calc");
 BA.debugLineNum = 444;BA.debugLine="CallSubDelayed2( Main, \"Update\", True )";
Debug.ShouldStop(134217728);
starter.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",starter.processBA,(Object)((starter.mostCurrent._main.getObject())),(Object)(BA.ObjectToString("Update")),(Object)((starter.mostCurrent.__c.getField(true,"True"))));
 BA.debugLineNum = 445;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ble_discoveryfinished() throws Exception{
try {
		Debug.PushSubsStack("ble_DiscoveryFinished (starter) ","starter",5,starter.processBA,starter.mostCurrent,453);
if (RapidSub.canDelegate("ble_discoveryfinished")) { return com.calypsoinstruments.anemotracker.starter.remoteMe.runUserSub(false, "starter","ble_discoveryfinished");}
 BA.debugLineNum = 453;BA.debugLine="Sub ble_DiscoveryFinished";
Debug.ShouldStop(16);
 BA.debugLineNum = 455;BA.debugLine="If bSelectBLE Then";
Debug.ShouldStop(64);
if (starter._bselectble.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 456;BA.debugLine="CallSubDelayed( actBLE, \"DiscoveryFinished2\")";
Debug.ShouldStop(128);
starter.mostCurrent.__c.runVoidMethod ("CallSubDelayed",starter.processBA,(Object)((starter.mostCurrent._actble.getObject())),(Object)(RemoteObject.createImmutable("DiscoveryFinished2")));
 }else {
 BA.debugLineNum = 460;BA.debugLine="ToastMessageShow(\"Searching for last ultra conne";
Debug.ShouldStop(2048);
starter.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Searching for last ultra connected")),(Object)(starter.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 461;BA.debugLine="Scan.StopScan ' Importante, acelera el proceso..";
Debug.ShouldStop(4096);
starter._scan.runVoidMethod ("StopScan");
 BA.debugLineNum = 463;BA.debugLine="If Main.kvs.ContainsKey( \"last_ultra\" ) Then";
Debug.ShouldStop(16384);
if (starter.mostCurrent._main._kvs.runClassMethod (com.calypsoinstruments.anemotracker.keyvaluestore.class, "_containskey",(Object)(RemoteObject.createImmutable("last_ultra"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 464;BA.debugLine="actual_ultra = Main.kvs.GetObject( \"last_ultra\"";
Debug.ShouldStop(32768);
starter._actual_ultra = (starter.mostCurrent._main._kvs.runClassMethod (com.calypsoinstruments.anemotracker.keyvaluestore.class, "_getobject",(Object)(RemoteObject.createImmutable("last_ultra"))));
 BA.debugLineNum = 466;BA.debugLine="If devices.ContainsKey( Main.kvs.GetObject( \"la";
Debug.ShouldStop(131072);
if (starter._devices.runMethod(true,"ContainsKey",(Object)(starter.mostCurrent._main._kvs.runClassMethod (com.calypsoinstruments.anemotracker.keyvaluestore.class, "_getobject",(Object)(RemoteObject.createImmutable("last_ultra"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 467;BA.debugLine="ToastMessageShow( \"Trying to connect to \" & ac";
Debug.ShouldStop(262144);
starter.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Trying to connect to "),starter._actual_ultra.getField(true,"MacAddress")))),(Object)(starter.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 468;BA.debugLine="Scan.Connect2( actual_ultra.MacAddress, False)";
Debug.ShouldStop(524288);
starter._scan.runVoidMethod ("Connect2",(Object)(starter._actual_ultra.getField(true,"MacAddress")),(Object)(starter.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 469;BA.debugLine="CallSubDelayed(Main, \"Connecting\")";
Debug.ShouldStop(1048576);
starter.mostCurrent.__c.runVoidMethod ("CallSubDelayed",starter.processBA,(Object)((starter.mostCurrent._main.getObject())),(Object)(RemoteObject.createImmutable("Connecting")));
 };
 };
 BA.debugLineNum = 504;BA.debugLine="devices.Clear";
Debug.ShouldStop(8388608);
starter._devices.runVoidMethod ("Clear");
 BA.debugLineNum = 505;BA.debugLine="CallSubDelayed( Main, \"UpdateDrawer\" )";
Debug.ShouldStop(16777216);
starter.mostCurrent.__c.runVoidMethod ("CallSubDelayed",starter.processBA,(Object)((starter.mostCurrent._main.getObject())),(Object)(RemoteObject.createImmutable("UpdateDrawer")));
 };
 BA.debugLineNum = 508;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _ble_scan() throws Exception{
try {
		Debug.PushSubsStack("ble_Scan (starter) ","starter",5,starter.processBA,starter.mostCurrent,306);
if (RapidSub.canDelegate("ble_scan")) { com.calypsoinstruments.anemotracker.starter.remoteMe.runUserSub(false, "starter","ble_scan"); return;}
ResumableSub_ble_Scan rsub = new ResumableSub_ble_Scan(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ble_Scan extends BA.ResumableSub {
public ResumableSub_ble_Scan(com.calypsoinstruments.anemotracker.starter parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
com.calypsoinstruments.anemotracker.starter parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ble_Scan (starter) ","starter",5,starter.processBA,starter.mostCurrent,306);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 BA.debugLineNum = 308;BA.debugLine="devices.Clear";
Debug.ShouldStop(524288);
parent._devices.runVoidMethod ("Clear");
 BA.debugLineNum = 309;BA.debugLine="Scan.Disconnect";
Debug.ShouldStop(1048576);
parent._scan.runVoidMethod ("Disconnect");
 BA.debugLineNum = 310;BA.debugLine="Sleep(100)";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("Sleep",starter.processBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this),BA.numberCast(int.class, 100));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 311;BA.debugLine="Scan.Scan2( Null, False )";
Debug.ShouldStop(4194304);
parent._scan.runVoidMethod ("Scan2",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.mostCurrent.__c.getField(false,"Null")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 312;BA.debugLine="tScan.Initialize( \"tScan\", temporizador )";
Debug.ShouldStop(8388608);
parent._tscan.runVoidMethod ("Initialize",starter.processBA,(Object)(BA.ObjectToString("tScan")),(Object)(parent._temporizador));
 BA.debugLineNum = 313;BA.debugLine="tScan.Enabled = True";
Debug.ShouldStop(16777216);
parent._tscan.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 314;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
public static RemoteObject  _ble_statechanged(RemoteObject _state) throws Exception{
try {
		Debug.PushSubsStack("ble_StateChanged (starter) ","starter",5,starter.processBA,starter.mostCurrent,720);
if (RapidSub.canDelegate("ble_statechanged")) { return com.calypsoinstruments.anemotracker.starter.remoteMe.runUserSub(false, "starter","ble_statechanged", _state);}
Debug.locals.put("state", _state);
 BA.debugLineNum = 720;BA.debugLine="Sub ble_StateChanged(state As Int)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 721;BA.debugLine="If state = Scan.STATE_POWERED_ON Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_state,BA.numberCast(double.class, starter._scan.getField(true,"STATE_POWERED_ON")))) { 
 BA.debugLineNum = 722;BA.debugLine="ToastMessageShow(\"ble habilitado\", True)";
Debug.ShouldStop(131072);
starter.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("ble habilitado")),(Object)(starter.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 723;BA.debugLine="bleEnabled = True";
Debug.ShouldStop(262144);
starter._bleenabled = starter.mostCurrent.__c.getField(true,"True");
 }else 
{ BA.debugLineNum = 725;BA.debugLine="Else If state = Scan.STATE_POWERED_OFF Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_state,BA.numberCast(double.class, starter._scan.getField(true,"STATE_POWERED_OFF")))) { 
 BA.debugLineNum = 726;BA.debugLine="ToastMessageShow(\"ble deshabilitado\", True)";
Debug.ShouldStop(2097152);
starter.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("ble deshabilitado")),(Object)(starter.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 727;BA.debugLine="bleEnabled = False";
Debug.ShouldStop(4194304);
starter._bleenabled = starter.mostCurrent.__c.getField(true,"False");
 }}
;
 BA.debugLineNum = 729;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkgps() throws Exception{
try {
		Debug.PushSubsStack("checkGps (starter) ","starter",5,starter.processBA,starter.mostCurrent,281);
if (RapidSub.canDelegate("checkgps")) { return com.calypsoinstruments.anemotracker.starter.remoteMe.runUserSub(false, "starter","checkgps");}
 BA.debugLineNum = 281;BA.debugLine="Public Sub checkGps";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 282;BA.debugLine="If gps1.IsInitialized And gps1.GPSEnabled Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean(".",starter._gps1.runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(".",starter._gps1.runMethod(true,"getGPSEnabled"))) { 
 BA.debugLineNum = 283;BA.debugLine="gps_start";
Debug.ShouldStop(67108864);
_gps_start();
 };
 BA.debugLineNum = 285;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _connectble(RemoteObject _ultra) throws Exception{
try {
		Debug.PushSubsStack("ConnectBle (starter) ","starter",5,starter.processBA,starter.mostCurrent,336);
if (RapidSub.canDelegate("connectble")) { return com.calypsoinstruments.anemotracker.starter.remoteMe.runUserSub(false, "starter","connectble", _ultra);}
Debug.locals.put("ultra", _ultra);
 BA.debugLineNum = 336;BA.debugLine="Sub ConnectBle( ultra As tUltra )";
Debug.ShouldStop(32768);
 BA.debugLineNum = 337;BA.debugLine="Scan.StopScan";
Debug.ShouldStop(65536);
starter._scan.runVoidMethod ("StopScan");
 BA.debugLineNum = 339;BA.debugLine="Try";
Debug.ShouldStop(262144);
try { BA.debugLineNum = 340;BA.debugLine="actual_ultra = ultra";
Debug.ShouldStop(524288);
starter._actual_ultra = _ultra;
 BA.debugLineNum = 341;BA.debugLine="CallSubDelayed(Main, \"Connecting\")";
Debug.ShouldStop(1048576);
starter.mostCurrent.__c.runVoidMethod ("CallSubDelayed",starter.processBA,(Object)((starter.mostCurrent._main.getObject())),(Object)(RemoteObject.createImmutable("Connecting")));
 BA.debugLineNum = 342;BA.debugLine="Scan.Connect2(ultra.MacAddress, False)";
Debug.ShouldStop(2097152);
starter._scan.runVoidMethod ("Connect2",(Object)(_ultra.getField(true,"MacAddress")),(Object)(starter.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 343;BA.debugLine="tryTimes = 0";
Debug.ShouldStop(4194304);
starter._trytimes = BA.numberCast(int.class, 0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",starter.processBA, e8.toString()); BA.debugLineNum = 345;BA.debugLine="Log(\"ConnectBle Exception: \" & LastException)";
Debug.ShouldStop(16777216);
starter.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("ConnectBle Exception: "),starter.mostCurrent.__c.runMethod(false,"LastException",starter.processBA))));
 BA.debugLineNum = 351;BA.debugLine="Log (\"ERROR. Se ha superado el numero de intent";
Debug.ShouldStop(1073741824);
starter.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("ERROR. Se ha superado el numero de intentos")));
 BA.debugLineNum = 352;BA.debugLine="ToastMessageShow(\"Unable to connect. Plese, try";
Debug.ShouldStop(-2147483648);
starter.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Unable to connect. Plese, try again later")),(Object)(starter.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 355;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gps_locationchanged(RemoteObject _location1) throws Exception{
try {
		Debug.PushSubsStack("gps_LocationChanged (starter) ","starter",5,starter.processBA,starter.mostCurrent,268);
if (RapidSub.canDelegate("gps_locationchanged")) { return com.calypsoinstruments.anemotracker.starter.remoteMe.runUserSub(false, "starter","gps_locationchanged", _location1);}
Debug.locals.put("Location1", _location1);
 BA.debugLineNum = 268;BA.debugLine="Sub gps_LocationChanged (Location1 As Location)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 270;BA.debugLine="calcs_1.speed = Round2( Location1.Speed, 2 )";
Debug.ShouldStop(8192);
starter._calcs_1.setField ("_speed",BA.numberCast(float.class, starter.mostCurrent.__c.runMethod(true,"Round2",(Object)(BA.numberCast(double.class, _location1.runMethod(true,"getSpeed"))),(Object)(BA.numberCast(int.class, 2)))));
 BA.debugLineNum = 271;BA.debugLine="calcs_1.bearing = Location1.Bearing";
Debug.ShouldStop(16384);
starter._calcs_1.setField ("_bearing",_location1.runMethod(true,"getBearing"));
 BA.debugLineNum = 272;BA.debugLine="calcs_1.latitude = Location1.Latitude";
Debug.ShouldStop(32768);
starter._calcs_1.setField ("_latitude",BA.numberCast(float.class, _location1.runMethod(true,"getLatitude")));
 BA.debugLineNum = 273;BA.debugLine="calcs_1.longitude = Location1.Longitude";
Debug.ShouldStop(65536);
starter._calcs_1.setField ("_longitude",BA.numberCast(float.class, _location1.runMethod(true,"getLongitude")));
 BA.debugLineNum = 274;BA.debugLine="calcs_1.altitude = Location1.Altitude";
Debug.ShouldStop(131072);
starter._calcs_1.setField ("_altitude",BA.numberCast(float.class, _location1.runMethod(true,"getAltitude")));
 BA.debugLineNum = 275;BA.debugLine="calcs_1.calc";
Debug.ShouldStop(262144);
starter._calcs_1.runClassMethod (com.calypsoinstruments.anemotracker.windcalcs.class, "_calc");
 BA.debugLineNum = 276;BA.debugLine="gps_changed = True";
Debug.ShouldStop(524288);
starter._gps_changed = starter.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 277;BA.debugLine="gps_location = Location1";
Debug.ShouldStop(1048576);
starter._gps_location = _location1;
 BA.debugLineNum = 279;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gps_start() throws Exception{
try {
		Debug.PushSubsStack("gps_start (starter) ","starter",5,starter.processBA,starter.mostCurrent,287);
if (RapidSub.canDelegate("gps_start")) { return com.calypsoinstruments.anemotracker.starter.remoteMe.runUserSub(false, "starter","gps_start");}
 BA.debugLineNum = 287;BA.debugLine="Sub gps_start";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 289;BA.debugLine="If Main.GPSEnabled Then";
Debug.ShouldStop(1);
if (starter.mostCurrent._main._gpsenabled.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 290;BA.debugLine="gps1.Start( 5000, 5 )";
Debug.ShouldStop(2);
starter._gps1.runVoidMethodAndSync ("Start",starter.processBA,(Object)(BA.numberCast(long.class, 5000)),(Object)(BA.numberCast(float.class, 5)));
 }else {
 };
 BA.debugLineNum = 296;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gps_userenabled(RemoteObject _enabled) throws Exception{
try {
		Debug.PushSubsStack("gps_UserEnabled (starter) ","starter",5,starter.processBA,starter.mostCurrent,258);
if (RapidSub.canDelegate("gps_userenabled")) { return com.calypsoinstruments.anemotracker.starter.remoteMe.runUserSub(false, "starter","gps_userenabled", _enabled);}
Debug.locals.put("Enabled", _enabled);
 BA.debugLineNum = 258;BA.debugLine="Sub gps_UserEnabled (Enabled As Boolean)";
Debug.ShouldStop(2);
 BA.debugLineNum = 259;BA.debugLine="If Enabled Then";
Debug.ShouldStop(4);
if (_enabled.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 260;BA.debugLine="ToastMessageShow(\"GPS device enabled\", True)";
Debug.ShouldStop(8);
starter.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("GPS device enabled")),(Object)(starter.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 261;BA.debugLine="gps1Enabled = True";
Debug.ShouldStop(16);
starter._gps1enabled = starter.mostCurrent.__c.getField(true,"True");
 }else {
 BA.debugLineNum = 263;BA.debugLine="ToastMessageShow(\"GPS device disabled\", True)";
Debug.ShouldStop(64);
starter.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("GPS device disabled")),(Object)(starter.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 264;BA.debugLine="gps1Enabled = False";
Debug.ShouldStop(128);
starter._gps1enabled = starter.mostCurrent.__c.getField(true,"False");
 };
 BA.debugLineNum = 266;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _logcat_logcatdata(RemoteObject _buffer,RemoteObject _length) throws Exception{
try {
		Debug.PushSubsStack("logcat_LogCatData (starter) ","starter",5,starter.processBA,starter.mostCurrent,206);
if (RapidSub.canDelegate("logcat_logcatdata")) { return com.calypsoinstruments.anemotracker.starter.remoteMe.runUserSub(false, "starter","logcat_logcatdata", _buffer, _length);}
Debug.locals.put("Buffer", _buffer);
Debug.locals.put("Length", _length);
 BA.debugLineNum = 206;BA.debugLine="Private Sub logcat_LogCatData (Buffer() As Byte, L";
Debug.ShouldStop(8192);
 BA.debugLineNum = 207;BA.debugLine="logs.Append(BytesToString(Buffer, 0, Length, \"utf";
Debug.ShouldStop(16384);
starter._logs.runVoidMethod ("Append",(Object)(starter.mostCurrent.__c.runMethod(true,"BytesToString",(Object)(_buffer),(Object)(BA.numberCast(int.class, 0)),(Object)(_length),(Object)(RemoteObject.createImmutable("utf8")))));
 BA.debugLineNum = 208;BA.debugLine="If logs.Length > 5000 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean(">",starter._logs.runMethod(true,"getLength"),BA.numberCast(double.class, 5000))) { 
 BA.debugLineNum = 209;BA.debugLine="logs.Remove(0, logs.Length - 4000)";
Debug.ShouldStop(65536);
starter._logs.runVoidMethod ("Remove",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {starter._logs.runMethod(true,"getLength"),RemoteObject.createImmutable(4000)}, "-",1, 1)));
 };
 BA.debugLineNum = 211;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _orientation_sensorchanged(RemoteObject _values) throws Exception{
try {
		Debug.PushSubsStack("orientation_SensorChanged (starter) ","starter",5,starter.processBA,starter.mostCurrent,240);
if (RapidSub.canDelegate("orientation_sensorchanged")) { return com.calypsoinstruments.anemotracker.starter.remoteMe.runUserSub(false, "starter","orientation_sensorchanged", _values);}
Debug.locals.put("Values", _values);
 BA.debugLineNum = 240;BA.debugLine="Sub orientation_SensorChanged (Values() As Float)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 242;BA.debugLine="fOrientation = Values(0)";
Debug.ShouldStop(131072);
starter._forientation = _values.getArrayElement(true,BA.numberCast(int.class, 0));
 BA.debugLineNum = 243;BA.debugLine="If Not( Main.portrait ) Then";
Debug.ShouldStop(262144);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter.mostCurrent._main._portrait)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 244;BA.debugLine="fOrientation = fOrientation + 90";
Debug.ShouldStop(524288);
starter._forientation = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {starter._forientation,RemoteObject.createImmutable(90)}, "+",1, 0));
 };
 BA.debugLineNum = 248;BA.debugLine="calcs_1.compass = 360-fOrientation";
Debug.ShouldStop(8388608);
starter._calcs_1.setField ("_compass",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(360),starter._forientation}, "-",1, 0)));
 BA.debugLineNum = 254;BA.debugLine="calcs_1.calc";
Debug.ShouldStop(536870912);
starter._calcs_1.runClassMethod (com.calypsoinstruments.anemotracker.windcalcs.class, "_calc");
 BA.debugLineNum = 255;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Dim orientation As PhoneSensors";
starter._orientation = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneSensors");
 //BA.debugLineNum = 11;BA.debugLine="Dim fOrientation As Float";
starter._forientation = RemoteObject.createImmutable(0f);
 //BA.debugLineNum = 13;BA.debugLine="Dim gps1 As GPS";
starter._gps1 = RemoteObject.createNew ("anywheresoftware.b4a.gps.GPS");
 //BA.debugLineNum = 14;BA.debugLine="Dim gps_changed As Boolean";
starter._gps_changed = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 15;BA.debugLine="Dim gps_location As Location";
starter._gps_location = RemoteObject.createNew ("anywheresoftware.b4a.gps.LocationWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Dim Scan As BleManager2";
starter._scan = RemoteObject.createNew ("anywheresoftware.b4a.objects.BleManager2");
 //BA.debugLineNum = 20;BA.debugLine="Dim tScan, Timer_ble As Timer";
starter._tscan = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
starter._timer_ble = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 21;BA.debugLine="Dim tRefresh As Timer";
starter._trefresh = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 22;BA.debugLine="Dim chPrincipal As String";
starter._chprincipal = RemoteObject.createImmutable("");
 //BA.debugLineNum = 23;BA.debugLine="Dim actual_ultra As tUltra";
starter._actual_ultra = RemoteObject.createNew ("com.calypsoinstruments.anemotracker.starter._tultra");
 //BA.debugLineNum = 24;BA.debugLine="Dim connected As Boolean";
starter._connected = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 25;BA.debugLine="Dim bSelectBLE = False, bSetNotify = False As Boo";
starter._bselectble = starter.mostCurrent.__c.getField(true,"False");
starter._bsetnotify = starter.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 26;BA.debugLine="Dim bHz = False	As Boolean								' y para saber";
starter._bhz = starter.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 27;BA.debugLine="Dim devices As Map";
starter._devices = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 28;BA.debugLine="Type tUltra(Name As String, MacAddress As String,";
;
 //BA.debugLineNum = 29;BA.debugLine="Dim last_Ultra As List 'list con datos de un devi";
starter._last_ultra = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 30;BA.debugLine="Dim sUltra As String 'Servicio ultra";
starter._sultra = RemoteObject.createImmutable("");
 //BA.debugLineNum = 31;BA.debugLine="Dim cNormal, cRate, cSensors, cStatus, cNmea, cCa";
starter._cnormal = RemoteObject.createImmutable("");
starter._crate = RemoteObject.createImmutable("");
starter._csensors = RemoteObject.createImmutable("");
starter._cstatus = RemoteObject.createImmutable("");
starter._cnmea = RemoteObject.createImmutable("");
starter._ccalcomp = RemoteObject.createImmutable("");
 //BA.debugLineNum = 32;BA.debugLine="Dim mId,uId As String";
starter._mid = RemoteObject.createImmutable("");
starter._uid = RemoteObject.createImmutable("");
 //BA.debugLineNum = 33;BA.debugLine="Dim deviceType=0 As Int";
starter._devicetype = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 34;BA.debugLine="Dim deviceInfo As Map";
starter._deviceinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 37;BA.debugLine="Dim calcs_1 As WindCalcs";
starter._calcs_1 = RemoteObject.createNew ("com.calypsoinstruments.anemotracker.windcalcs");
 //BA.debugLineNum = 39;BA.debugLine="Dim Obj1 As Reflector";
starter._obj1 = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");
 //BA.debugLineNum = 40;BA.debugLine="Dim dt_historic As Map";
starter._dt_historic = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 42;BA.debugLine="Dim sync_cloud=False As Boolean";
starter._sync_cloud = starter.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 45;BA.debugLine="Dim sql1 As SQL";
starter._sql1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 46;BA.debugLine="Dim Timer_sqlite As Timer";
starter._timer_sqlite = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 47;BA.debugLine="Dim navigation As Int";
starter._navigation = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 48;BA.debugLine="Dim nav_name As String";
starter._nav_name = RemoteObject.createImmutable("");
 //BA.debugLineNum = 50;BA.debugLine="Dim b_nav, b_true, b_net As Boolean";
starter._b_nav = RemoteObject.createImmutable(false);
starter._b_true = RemoteObject.createImmutable(false);
starter._b_net = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 51;BA.debugLine="Dim manual_disconnect As Boolean";
starter._manual_disconnect = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 54;BA.debugLine="Dim n As Notification";
starter._n = RemoteObject.createNew ("anywheresoftware.b4a.objects.NotificationWrapper");
 //BA.debugLineNum = 57;BA.debugLine="Dim tang=0, tvel=0 As Float";
starter._tang = BA.numberCast(float.class, 0);
starter._tvel = BA.numberCast(float.class, 0);
 //BA.debugLineNum = 58;BA.debugLine="Dim c_ble = 0 As Int";
starter._c_ble = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 60;BA.debugLine="Dim bleEnabled As Boolean";
starter._bleenabled = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 61;BA.debugLine="Dim gps1Enabled As Boolean = True";
starter._gps1enabled = starter.mostCurrent.__c.getField(true,"True");
 //BA.debugLineNum = 63;BA.debugLine="Dim tryTimes As Int = 0";
starter._trytimes = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 67;BA.debugLine="Private logs As StringBuilder";
starter._logs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");
 //BA.debugLineNum = 68;BA.debugLine="Private logcat As LogCat";
starter._logcat = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.LogCat");
 //BA.debugLineNum = 70;BA.debugLine="Dim allowReport As Boolean";
starter._allowreport = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 72;BA.debugLine="Dim temporizador As Long";
starter._temporizador = RemoteObject.createImmutable(0L);
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _selectedble(RemoteObject _ret_char) throws Exception{
try {
		Debug.PushSubsStack("SelectedBLE (starter) ","starter",5,starter.processBA,starter.mostCurrent,510);
if (RapidSub.canDelegate("selectedble")) { return com.calypsoinstruments.anemotracker.starter.remoteMe.runUserSub(false, "starter","selectedble", _ret_char);}
Debug.locals.put("ret_char", _ret_char);
 BA.debugLineNum = 510;BA.debugLine="Sub SelectedBLE( ret_char As String )  	' Called f";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 533;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_create() throws Exception{
try {
		Debug.PushSubsStack("Service_Create (starter) ","starter",5,starter.processBA,starter.mostCurrent,77);
if (RapidSub.canDelegate("service_create")) { return com.calypsoinstruments.anemotracker.starter.remoteMe.runUserSub(false, "starter","service_create");}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 77;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(4096);
 BA.debugLineNum = 81;BA.debugLine="n.Initialize";
Debug.ShouldStop(65536);
starter._n.runVoidMethod ("Initialize");
 BA.debugLineNum = 82;BA.debugLine="n.Icon = \"icon\"";
Debug.ShouldStop(131072);
starter._n.runVoidMethod ("setIcon",BA.ObjectToString("icon"));
 BA.debugLineNum = 83;BA.debugLine="n.light = False";
Debug.ShouldStop(262144);
starter._n.runVoidMethod ("setLight",starter.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 84;BA.debugLine="n.Sound = False";
Debug.ShouldStop(524288);
starter._n.runVoidMethod ("setSound",starter.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 85;BA.debugLine="n.Vibrate = False";
Debug.ShouldStop(1048576);
starter._n.runVoidMethod ("setVibrate",starter.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 86;BA.debugLine="n.OnGoingEvent = True";
Debug.ShouldStop(2097152);
starter._n.runVoidMethod ("setOnGoingEvent",starter.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 87;BA.debugLine="n.SetInfo(\"AnemoTracker running\", \"Gps and compas";
Debug.ShouldStop(4194304);
starter._n.runVoidMethod ("SetInfoNew",starter.processBA,(Object)(BA.ObjectToCharSequence("AnemoTracker running")),(Object)(BA.ObjectToCharSequence("Gps and compass active")),(Object)((starter.mostCurrent._main.getObject())));
 BA.debugLineNum = 88;BA.debugLine="Service.StartForeground( 1, n )";
Debug.ShouldStop(8388608);
starter.mostCurrent._service.runVoidMethod ("StartForeground",(Object)(BA.numberCast(int.class, 1)),(Object)((starter._n.getObject())));
 BA.debugLineNum = 91;BA.debugLine="b_nav = False";
Debug.ShouldStop(67108864);
starter._b_nav = starter.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 93;BA.debugLine="b_true = True";
Debug.ShouldStop(268435456);
starter._b_true = starter.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 94;BA.debugLine="navigation = 0";
Debug.ShouldStop(536870912);
starter._navigation = BA.numberCast(int.class, 0);
 BA.debugLineNum = 96;BA.debugLine="b_net = False";
Debug.ShouldStop(-2147483648);
starter._b_net = starter.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 98;BA.debugLine="orientation.Initialize2(orientation.TYPE_ORIENTAT";
Debug.ShouldStop(2);
starter._orientation.runVoidMethod ("Initialize2",(Object)(starter._orientation.getField(true,"TYPE_ORIENTATION")),(Object)(BA.numberCast(int.class, 3)));
 BA.debugLineNum = 100;BA.debugLine="Scan.Initialize(\"ble\")";
Debug.ShouldStop(8);
starter._scan.runVoidMethod ("Initialize",starter.processBA,(Object)(RemoteObject.createImmutable("ble")));
 BA.debugLineNum = 101;BA.debugLine="gps1.Initialize(\"gps\")";
Debug.ShouldStop(16);
starter._gps1.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("gps")));
 BA.debugLineNum = 104;BA.debugLine="calcs_1.Initialize";
Debug.ShouldStop(128);
starter._calcs_1.runClassMethod (com.calypsoinstruments.anemotracker.windcalcs.class, "_initialize",starter.processBA);
 BA.debugLineNum = 106;BA.debugLine="devices.Initialize";
Debug.ShouldStop(512);
starter._devices.runVoidMethod ("Initialize");
 BA.debugLineNum = 109;BA.debugLine="sql1.Initialize(File.DirInternal, \"sailwind.db\",";
Debug.ShouldStop(4096);
starter._sql1.runVoidMethod ("Initialize",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("sailwind.db")),(Object)(starter.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 112;BA.debugLine="Dim m As Map";
Debug.ShouldStop(32768);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 113;BA.debugLine="m.Initialize";
Debug.ShouldStop(65536);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 114;BA.debugLine="m.Put(\"id\", DBUtils.DB_INTEGER)";
Debug.ShouldStop(131072);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((starter.mostCurrent._dbutils._db_integer)));
 BA.debugLineNum = 115;BA.debugLine="m.Put(\"name\", DBUtils.DB_TEXT)";
Debug.ShouldStop(262144);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("name"))),(Object)((starter.mostCurrent._dbutils._db_text)));
 BA.debugLineNum = 116;BA.debugLine="m.Put(\"description\", DBUtils.DB_TEXT)";
Debug.ShouldStop(524288);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("description"))),(Object)((starter.mostCurrent._dbutils._db_text)));
 BA.debugLineNum = 117;BA.debugLine="m.Put(\"e_id\", DBUtils.DB_INTEGER )";
Debug.ShouldStop(1048576);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("e_id"))),(Object)((starter.mostCurrent._dbutils._db_integer)));
 BA.debugLineNum = 118;BA.debugLine="DBUtils.CreateTable(sql1, \"boat\", m, \"id\", True )";
Debug.ShouldStop(2097152);
starter.mostCurrent._dbutils.runVoidMethod ("_createtable",starter.processBA,(Object)(starter._sql1),(Object)(BA.ObjectToString("boat")),(Object)(_m),(Object)(BA.ObjectToString("id")),(Object)(starter.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 120;BA.debugLine="m.Initialize";
Debug.ShouldStop(8388608);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 121;BA.debugLine="m.Put(\"id\", DBUtils.DB_INTEGER)";
Debug.ShouldStop(16777216);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((starter.mostCurrent._dbutils._db_integer)));
 BA.debugLineNum = 122;BA.debugLine="m.Put(\"name\", DBUtils.DB_TEXT)";
Debug.ShouldStop(33554432);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("name"))),(Object)((starter.mostCurrent._dbutils._db_text)));
 BA.debugLineNum = 123;BA.debugLine="m.Put(\"description\", DBUtils.DB_TEXT)";
Debug.ShouldStop(67108864);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("description"))),(Object)((starter.mostCurrent._dbutils._db_text)));
 BA.debugLineNum = 124;BA.debugLine="m.Put(\"date_start\", DBUtils.DB_INTEGER)";
Debug.ShouldStop(134217728);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("date_start"))),(Object)((starter.mostCurrent._dbutils._db_integer)));
 BA.debugLineNum = 125;BA.debugLine="m.Put(\"boat_id\", DBUtils.DB_INTEGER)";
Debug.ShouldStop(268435456);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("boat_id"))),(Object)((starter.mostCurrent._dbutils._db_integer)));
 BA.debugLineNum = 126;BA.debugLine="m.Put(\"e_id\", DBUtils.DB_INTEGER )";
Debug.ShouldStop(536870912);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("e_id"))),(Object)((starter.mostCurrent._dbutils._db_integer)));
 BA.debugLineNum = 127;BA.debugLine="DBUtils.CreateTable(sql1, \"navigation\", m, \"id\",";
Debug.ShouldStop(1073741824);
starter.mostCurrent._dbutils.runVoidMethod ("_createtable",starter.processBA,(Object)(starter._sql1),(Object)(BA.ObjectToString("navigation")),(Object)(_m),(Object)(BA.ObjectToString("id")),(Object)(starter.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 129;BA.debugLine="m.Initialize";
Debug.ShouldStop(1);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 130;BA.debugLine="m.Put(\"id\", DBUtils.DB_INTEGER)";
Debug.ShouldStop(2);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((starter.mostCurrent._dbutils._db_integer)));
 BA.debugLineNum = 131;BA.debugLine="m.Put(\"navigation_id\", DBUtils.DB_INTEGER)";
Debug.ShouldStop(4);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("navigation_id"))),(Object)((starter.mostCurrent._dbutils._db_integer)));
 BA.debugLineNum = 132;BA.debugLine="m.Put(\"lat\", DBUtils.DB_REAL)";
Debug.ShouldStop(8);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lat"))),(Object)((starter.mostCurrent._dbutils._db_real)));
 BA.debugLineNum = 133;BA.debugLine="m.Put(\"lon\", DBUtils.DB_REAL)";
Debug.ShouldStop(16);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lon"))),(Object)((starter.mostCurrent._dbutils._db_real)));
 BA.debugLineNum = 134;BA.debugLine="m.Put(\"date\", DBUtils.DB_INTEGER)";
Debug.ShouldStop(32);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("date"))),(Object)((starter.mostCurrent._dbutils._db_integer)));
 BA.debugLineNum = 135;BA.debugLine="m.Put(\"e_id\", DBUtils.DB_INTEGER )";
Debug.ShouldStop(64);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("e_id"))),(Object)((starter.mostCurrent._dbutils._db_integer)));
 BA.debugLineNum = 136;BA.debugLine="m.Put(\"awa\", DBUtils.DB_REAL)";
Debug.ShouldStop(128);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("awa"))),(Object)((starter.mostCurrent._dbutils._db_real)));
 BA.debugLineNum = 137;BA.debugLine="m.Put(\"awm\", DBUtils.DB_REAL)";
Debug.ShouldStop(256);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("awm"))),(Object)((starter.mostCurrent._dbutils._db_real)));
 BA.debugLineNum = 138;BA.debugLine="m.Put(\"twa\", DBUtils.DB_REAL)";
Debug.ShouldStop(512);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("twa"))),(Object)((starter.mostCurrent._dbutils._db_real)));
 BA.debugLineNum = 139;BA.debugLine="m.Put(\"twm\", DBUtils.DB_REAL)";
Debug.ShouldStop(1024);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("twm"))),(Object)((starter.mostCurrent._dbutils._db_real)));
 BA.debugLineNum = 140;BA.debugLine="m.Put(\"bearing\", DBUtils.DB_REAL)";
Debug.ShouldStop(2048);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("bearing"))),(Object)((starter.mostCurrent._dbutils._db_real)));
 BA.debugLineNum = 141;BA.debugLine="m.Put(\"speed\", DBUtils.DB_REAL)";
Debug.ShouldStop(4096);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("speed"))),(Object)((starter.mostCurrent._dbutils._db_real)));
 BA.debugLineNum = 143;BA.debugLine="m.Put(\"battery\", DBUtils.DB_REAL )";
Debug.ShouldStop(16384);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("battery"))),(Object)((starter.mostCurrent._dbutils._db_real)));
 BA.debugLineNum = 144;BA.debugLine="m.Put(\"temp\", DBUtils.DB_REAL )";
Debug.ShouldStop(32768);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("temp"))),(Object)((starter.mostCurrent._dbutils._db_real)));
 BA.debugLineNum = 145;BA.debugLine="m.Put(\"roll\", DBUtils.DB_REAL)";
Debug.ShouldStop(65536);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("roll"))),(Object)((starter.mostCurrent._dbutils._db_real)));
 BA.debugLineNum = 146;BA.debugLine="m.Put(\"pitch\", DBUtils.DB_REAL)";
Debug.ShouldStop(131072);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pitch"))),(Object)((starter.mostCurrent._dbutils._db_real)));
 BA.debugLineNum = 147;BA.debugLine="m.Put(\"ecompass\", DBUtils.DB_REAL)";
Debug.ShouldStop(262144);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ecompass"))),(Object)((starter.mostCurrent._dbutils._db_real)));
 BA.debugLineNum = 149;BA.debugLine="DBUtils.CreateTable(sql1, \"route5\", m, \"id\", True";
Debug.ShouldStop(1048576);
starter.mostCurrent._dbutils.runVoidMethod ("_createtable",starter.processBA,(Object)(starter._sql1),(Object)(BA.ObjectToString("route5")),(Object)(_m),(Object)(BA.ObjectToString("id")),(Object)(starter.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 151;BA.debugLine="logs.Initialize";
Debug.ShouldStop(4194304);
starter._logs.runVoidMethod ("Initialize");
 BA.debugLineNum = 156;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_destroy() throws Exception{
try {
		Debug.PushSubsStack("Service_Destroy (starter) ","starter",5,starter.processBA,starter.mostCurrent,232);
if (RapidSub.canDelegate("service_destroy")) { return com.calypsoinstruments.anemotracker.starter.remoteMe.runUserSub(false, "starter","service_destroy");}
 BA.debugLineNum = 232;BA.debugLine="Sub Service_Destroy";
Debug.ShouldStop(128);
 BA.debugLineNum = 233;BA.debugLine="gps1.stop";
Debug.ShouldStop(256);
starter._gps1.runVoidMethod ("Stop");
 BA.debugLineNum = 234;BA.debugLine="orientation.StopListening";
Debug.ShouldStop(512);
starter._orientation.runVoidMethod ("StopListening",starter.processBA);
 BA.debugLineNum = 235;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_start(RemoteObject _startingintent) throws Exception{
try {
		Debug.PushSubsStack("Service_Start (starter) ","starter",5,starter.processBA,starter.mostCurrent,158);
if (RapidSub.canDelegate("service_start")) { return com.calypsoinstruments.anemotracker.starter.remoteMe.runUserSub(false, "starter","service_start", _startingintent);}
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 158;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 160;BA.debugLine="Timer_ble.Initialize( \"Timer_ble\", 5000 )";
Debug.ShouldStop(-2147483648);
starter._timer_ble.runVoidMethod ("Initialize",starter.processBA,(Object)(BA.ObjectToString("Timer_ble")),(Object)(BA.numberCast(long.class, 5000)));
 BA.debugLineNum = 161;BA.debugLine="Timer_ble.Enabled = False";
Debug.ShouldStop(1);
starter._timer_ble.runMethod(true,"setEnabled",starter.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 162;BA.debugLine="Timer_sqlite.Initialize( \"Timer_sqlite\", 5000 )";
Debug.ShouldStop(2);
starter._timer_sqlite.runVoidMethod ("Initialize",starter.processBA,(Object)(BA.ObjectToString("Timer_sqlite")),(Object)(BA.numberCast(long.class, 5000)));
 BA.debugLineNum = 164;BA.debugLine="If gps1.IsInitialized Then";
Debug.ShouldStop(8);
if (starter._gps1.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 165;BA.debugLine="If gps1.GPSEnabled And Main.rp.Check(Main.rp.PER";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean(".",starter._gps1.runMethod(true,"getGPSEnabled")) && RemoteObject.solveBoolean(".",starter.mostCurrent._main._rp.runMethod(true,"Check",(Object)(starter.mostCurrent._main._rp.getField(true,"PERMISSION_ACCESS_FINE_LOCATION"))))) { 
 BA.debugLineNum = 166;BA.debugLine="gps_start";
Debug.ShouldStop(32);
_gps_start();
 }else 
{ BA.debugLineNum = 167;BA.debugLine="Else if Main.rp.Check(Main.rp.PERMISSION_ACCESS_";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",starter.mostCurrent._main._rp.runMethod(true,"Check",(Object)(starter.mostCurrent._main._rp.getField(true,"PERMISSION_ACCESS_FINE_LOCATION"))),starter.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 168;BA.debugLine="gps1Enabled = False";
Debug.ShouldStop(128);
starter._gps1enabled = starter.mostCurrent.__c.getField(true,"False");
 }}
;
 };
 BA.debugLineNum = 171;BA.debugLine="gps_changed = False";
Debug.ShouldStop(1024);
starter._gps_changed = starter.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 175;BA.debugLine="If Scan.State = 12 Then '12 es todo activo";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",starter._scan.runMethod(true,"getState"),BA.numberCast(double.class, 12))) { 
 BA.debugLineNum = 177;BA.debugLine="temporizador = 10000";
Debug.ShouldStop(65536);
starter._temporizador = BA.numberCast(long.class, 10000);
 BA.debugLineNum = 178;BA.debugLine="ToastMessageShow( \"Searching BLE devices\", True";
Debug.ShouldStop(131072);
starter.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Searching BLE devices")),(Object)(starter.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 179;BA.debugLine="ble_Scan";
Debug.ShouldStop(262144);
_ble_scan();
 BA.debugLineNum = 180;BA.debugLine="bleEnabled = True";
Debug.ShouldStop(524288);
starter._bleenabled = starter.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 181;BA.debugLine="bSelectBLE = False";
Debug.ShouldStop(1048576);
starter._bselectble = starter.mostCurrent.__c.getField(true,"False");
 }else {
 BA.debugLineNum = 183;BA.debugLine="bleEnabled = False";
Debug.ShouldStop(4194304);
starter._bleenabled = starter.mostCurrent.__c.getField(true,"False");
 };
 BA.debugLineNum = 186;BA.debugLine="Main.kvs.Initialize(File.DirInternal, \"kvs\")";
Debug.ShouldStop(33554432);
starter.mostCurrent._main._kvs.runClassMethod (com.calypsoinstruments.anemotracker.keyvaluestore.class, "_initialize",starter.processBA,(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("kvs")));
 BA.debugLineNum = 187;BA.debugLine="If Main.kvs.ContainsKey( \"calibration_offset\" ) T";
Debug.ShouldStop(67108864);
if (starter.mostCurrent._main._kvs.runClassMethod (com.calypsoinstruments.anemotracker.keyvaluestore.class, "_containskey",(Object)(RemoteObject.createImmutable("calibration_offset"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 188;BA.debugLine="calcs_1.offset =  Main.kvs.GetSimple( \"calibrati";
Debug.ShouldStop(134217728);
starter._calcs_1.setField ("_offset",BA.numberCast(float.class, starter.mostCurrent._main._kvs.runClassMethod (com.calypsoinstruments.anemotracker.keyvaluestore.class, "_getsimple",(Object)(RemoteObject.createImmutable("calibration_offset")))));
 BA.debugLineNum = 189;BA.debugLine="Main.offset_angle = calcs_1.offset";
Debug.ShouldStop(268435456);
starter.mostCurrent._main._offset_angle = BA.numberCast(double.class, starter._calcs_1.getField(true,"_offset"));
 }else {
 BA.debugLineNum = 191;BA.debugLine="calcs_1.offset = 0";
Debug.ShouldStop(1073741824);
starter._calcs_1.setField ("_offset",BA.numberCast(float.class, 0));
 BA.debugLineNum = 192;BA.debugLine="Main.offset_angle = 0";
Debug.ShouldStop(-2147483648);
starter.mostCurrent._main._offset_angle = BA.numberCast(double.class, 0);
 };
 BA.debugLineNum = 194;BA.debugLine="orientation.StartListening(\"orientation\")";
Debug.ShouldStop(2);
starter._orientation.runVoidMethod ("StartListening",starter.processBA,(Object)(RemoteObject.createImmutable("orientation")));
 BA.debugLineNum = 195;BA.debugLine="CallSubDelayed( Main, \"UpdateDrawer\" )";
Debug.ShouldStop(4);
starter.mostCurrent.__c.runVoidMethod ("CallSubDelayed",starter.processBA,(Object)((starter.mostCurrent._main.getObject())),(Object)(RemoteObject.createImmutable("UpdateDrawer")));
 BA.debugLineNum = 196;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_taskremoved() throws Exception{
try {
		Debug.PushSubsStack("Service_TaskRemoved (starter) ","starter",5,starter.processBA,starter.mostCurrent,198);
if (RapidSub.canDelegate("service_taskremoved")) { return com.calypsoinstruments.anemotracker.starter.remoteMe.runUserSub(false, "starter","service_taskremoved");}
 BA.debugLineNum = 198;BA.debugLine="Sub Service_TaskRemoved";
Debug.ShouldStop(32);
 BA.debugLineNum = 200;BA.debugLine="n.Cancel(1)";
Debug.ShouldStop(128);
starter._n.runVoidMethod ("Cancel",(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 201;BA.debugLine="Scan.Disconnect";
Debug.ShouldStop(256);
starter._scan.runVoidMethod ("Disconnect");
 BA.debugLineNum = 202;BA.debugLine="Service_Destroy";
Debug.ShouldStop(512);
_service_destroy();
 BA.debugLineNum = 203;BA.debugLine="ExitApplication";
Debug.ShouldStop(1024);
starter.mostCurrent.__c.runVoidMethod ("ExitApplication");
 BA.debugLineNum = 204;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _start_nav(RemoteObject _id,RemoteObject _fields) throws Exception{
try {
		Debug.PushSubsStack("start_nav (starter) ","starter",5,starter.processBA,starter.mostCurrent,732);
if (RapidSub.canDelegate("start_nav")) { return com.calypsoinstruments.anemotracker.starter.remoteMe.runUserSub(false, "starter","start_nav", _id, _fields);}
RemoteObject _name = RemoteObject.createImmutable("");
RemoteObject _descrip = RemoteObject.createImmutable("");
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("id", _id);
Debug.locals.put("fields", _fields);
 BA.debugLineNum = 732;BA.debugLine="Sub start_nav( id As Int, fields() As String )";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 733;BA.debugLine="Dim name = fields(0) As String";
Debug.ShouldStop(268435456);
_name = _fields.getArrayElement(true,BA.numberCast(int.class, 0));Debug.locals.put("name", _name);Debug.locals.put("name", _name);
 BA.debugLineNum = 734;BA.debugLine="Dim descrip = fields(1) As String";
Debug.ShouldStop(536870912);
_descrip = _fields.getArrayElement(true,BA.numberCast(int.class, 1));Debug.locals.put("descrip", _descrip);Debug.locals.put("descrip", _descrip);
 BA.debugLineNum = 735;BA.debugLine="Timer_sqlite.Enabled = True";
Debug.ShouldStop(1073741824);
starter._timer_sqlite.runMethod(true,"setEnabled",starter.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 736;BA.debugLine="If navigation = 0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",starter._navigation,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 737;BA.debugLine="If id > 0 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(">",_id,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 738;BA.debugLine="navigation = id";
Debug.ShouldStop(2);
starter._navigation = _id;
 }else {
 BA.debugLineNum = 740;BA.debugLine="If Not( name = Null ) Then";
Debug.ShouldStop(8);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("n",_name)))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 741;BA.debugLine="Dim l As List";
Debug.ShouldStop(16);
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("l", _l);
 BA.debugLineNum = 742;BA.debugLine="Dim m As Map";
Debug.ShouldStop(32);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 743;BA.debugLine="l.Initialize";
Debug.ShouldStop(64);
_l.runVoidMethod ("Initialize");
 BA.debugLineNum = 744;BA.debugLine="m.Initialize";
Debug.ShouldStop(128);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 745;BA.debugLine="m.Put(\"name\", name )";
Debug.ShouldStop(256);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("name"))),(Object)((_name)));
 BA.debugLineNum = 746;BA.debugLine="m.Put(\"description\", descrip )";
Debug.ShouldStop(512);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("description"))),(Object)((_descrip)));
 BA.debugLineNum = 747;BA.debugLine="l.Add( m )";
Debug.ShouldStop(1024);
_l.runVoidMethod ("Add",(Object)((_m.getObject())));
 BA.debugLineNum = 748;BA.debugLine="DBUtils.InsertMaps( sql1, \"navigation\", l )";
Debug.ShouldStop(2048);
starter.mostCurrent._dbutils.runVoidMethod ("_insertmaps",starter.processBA,(Object)(starter._sql1),(Object)(BA.ObjectToString("navigation")),(Object)(_l));
 };
 BA.debugLineNum = 750;BA.debugLine="m = DBUtils.ExecuteMap( sql1, \"select max(id) f";
Debug.ShouldStop(8192);
_m = starter.mostCurrent._dbutils.runMethod(false,"_executemap",starter.processBA,(Object)(starter._sql1),(Object)(BA.ObjectToString("select max(id) from navigation")),(Object)((starter.mostCurrent.__c.getField(false,"Null"))));Debug.locals.put("m", _m);
 BA.debugLineNum = 751;BA.debugLine="navigation = m.Get( \"max(id)\" )";
Debug.ShouldStop(16384);
starter._navigation = BA.numberCast(int.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("max(id)")))));
 };
 BA.debugLineNum = 754;BA.debugLine="ToastMessageShow( \"Registering navigation\", True";
Debug.ShouldStop(131072);
starter.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Registering navigation")),(Object)(starter.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 759;BA.debugLine="Dim m = DBUtils.ExecuteMap( sql1, \"select * from";
Debug.ShouldStop(4194304);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = starter.mostCurrent._dbutils.runMethod(false,"_executemap",starter.processBA,(Object)(starter._sql1),(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from navigation where [id] = "),starter._navigation)),(Object)((starter.mostCurrent.__c.getField(false,"Null"))));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 760;BA.debugLine="nav_name = m.Get(\"name\" )";
Debug.ShouldStop(8388608);
starter._nav_name = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))));
 };
 BA.debugLineNum = 763;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _start_net() throws Exception{
try {
		Debug.PushSubsStack("start_net (starter) ","starter",5,starter.processBA,starter.mostCurrent,798);
if (RapidSub.canDelegate("start_net")) { return com.calypsoinstruments.anemotracker.starter.remoteMe.runUserSub(false, "starter","start_net");}
 BA.debugLineNum = 798;BA.debugLine="Sub start_net";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 799;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _stop_nav() throws Exception{
try {
		Debug.PushSubsStack("stop_nav (starter) ","starter",5,starter.processBA,starter.mostCurrent,765);
if (RapidSub.canDelegate("stop_nav")) { return com.calypsoinstruments.anemotracker.starter.remoteMe.runUserSub(false, "starter","stop_nav");}
 BA.debugLineNum = 765;BA.debugLine="Sub stop_nav";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 766;BA.debugLine="Timer_sqlite.Enabled = False";
Debug.ShouldStop(536870912);
starter._timer_sqlite.runMethod(true,"setEnabled",starter.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 767;BA.debugLine="navigation = 0";
Debug.ShouldStop(1073741824);
starter._navigation = BA.numberCast(int.class, 0);
 BA.debugLineNum = 768;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _stop_net() throws Exception{
try {
		Debug.PushSubsStack("stop_net (starter) ","starter",5,starter.processBA,starter.mostCurrent,801);
if (RapidSub.canDelegate("stop_net")) { return com.calypsoinstruments.anemotracker.starter.remoteMe.runUserSub(false, "starter","stop_net");}
 BA.debugLineNum = 801;BA.debugLine="Sub stop_net";
Debug.ShouldStop(1);
 BA.debugLineNum = 802;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _timer_ble_tick() throws Exception{
try {
		Debug.PushSubsStack("Timer_ble_tick (starter) ","starter",5,starter.processBA,starter.mostCurrent,535);
if (RapidSub.canDelegate("timer_ble_tick")) { return com.calypsoinstruments.anemotracker.starter.remoteMe.runUserSub(false, "starter","timer_ble_tick");}
 BA.debugLineNum = 535;BA.debugLine="Sub Timer_ble_tick( )								' This timer calls re";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 536;BA.debugLine="If deviceType = 2 Then ' Only portable";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",starter._devicetype,BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 537;BA.debugLine="Scan.ReadData2( sUltra, cRate )";
Debug.ShouldStop(16777216);
starter._scan.runVoidMethod ("ReadData2",(Object)(starter._sultra),(Object)(starter._crate));
 };
 BA.debugLineNum = 558;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _timer_sqlite_tick() throws Exception{
try {
		Debug.PushSubsStack("Timer_sqlite_tick (starter) ","starter",5,starter.processBA,starter.mostCurrent,770);
if (RapidSub.canDelegate("timer_sqlite_tick")) { return com.calypsoinstruments.anemotracker.starter.remoteMe.runUserSub(false, "starter","timer_sqlite_tick");}
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 770;BA.debugLine="Sub Timer_sqlite_tick";
Debug.ShouldStop(2);
 BA.debugLineNum = 771;BA.debugLine="Dim l As List";
Debug.ShouldStop(4);
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("l", _l);
 BA.debugLineNum = 772;BA.debugLine="Dim m As Map";
Debug.ShouldStop(8);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 773;BA.debugLine="l.Initialize";
Debug.ShouldStop(16);
_l.runVoidMethod ("Initialize");
 BA.debugLineNum = 774;BA.debugLine="m.Initialize";
Debug.ShouldStop(32);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 775;BA.debugLine="m.Put(\"navigation_id\", navigation)  ' change to l";
Debug.ShouldStop(64);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("navigation_id"))),(Object)((starter._navigation)));
 BA.debugLineNum = 776;BA.debugLine="m.Put(\"lat\", calcs_1.latitude)";
Debug.ShouldStop(128);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lat"))),(Object)((starter._calcs_1.getField(true,"_latitude"))));
 BA.debugLineNum = 777;BA.debugLine="m.Put(\"lon\", calcs_1.longitude)";
Debug.ShouldStop(256);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lon"))),(Object)((starter._calcs_1.getField(true,"_longitude"))));
 BA.debugLineNum = 778;BA.debugLine="m.Put(\"date\", DateTime.Now )";
Debug.ShouldStop(512);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("date"))),(Object)((starter.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 780;BA.debugLine="m.Put(\"awa\", calcs_1.awa)";
Debug.ShouldStop(2048);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("awa"))),(Object)((starter._calcs_1.getField(true,"_awa"))));
 BA.debugLineNum = 781;BA.debugLine="m.Put(\"awm\", calcs_1.awm)";
Debug.ShouldStop(4096);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("awm"))),(Object)((starter._calcs_1.getField(true,"_awm"))));
 BA.debugLineNum = 782;BA.debugLine="m.Put(\"twa\", calcs_1.twa)";
Debug.ShouldStop(8192);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("twa"))),(Object)((starter._calcs_1.getField(true,"_twa"))));
 BA.debugLineNum = 783;BA.debugLine="m.Put(\"twm\", calcs_1.twm)";
Debug.ShouldStop(16384);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("twm"))),(Object)((starter._calcs_1.getField(true,"_twm"))));
 BA.debugLineNum = 784;BA.debugLine="m.Put(\"bearing\", calcs_1.bearing)";
Debug.ShouldStop(32768);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("bearing"))),(Object)((starter._calcs_1.getField(true,"_bearing"))));
 BA.debugLineNum = 785;BA.debugLine="m.Put(\"speed\", calcs_1.speed)";
Debug.ShouldStop(65536);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("speed"))),(Object)((starter._calcs_1.getField(true,"_speed"))));
 BA.debugLineNum = 787;BA.debugLine="m.Put(\"battery\", calcs_1.battery )";
Debug.ShouldStop(262144);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("battery"))),(Object)((starter._calcs_1.getField(true,"_battery"))));
 BA.debugLineNum = 788;BA.debugLine="m.Put(\"temp\", calcs_1.temp )";
Debug.ShouldStop(524288);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("temp"))),(Object)((starter._calcs_1.getField(true,"_temp"))));
 BA.debugLineNum = 789;BA.debugLine="m.Put(\"roll\", calcs_1.roll )";
Debug.ShouldStop(1048576);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("roll"))),(Object)((starter._calcs_1.getField(true,"_roll"))));
 BA.debugLineNum = 790;BA.debugLine="m.Put(\"pitch\", calcs_1.pitch )";
Debug.ShouldStop(2097152);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pitch"))),(Object)((starter._calcs_1.getField(true,"_pitch"))));
 BA.debugLineNum = 791;BA.debugLine="m.Put(\"ecompass\", calcs_1.ecompass )";
Debug.ShouldStop(4194304);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ecompass"))),(Object)((starter._calcs_1.getField(true,"_ecompass"))));
 BA.debugLineNum = 792;BA.debugLine="l.Add( m )";
Debug.ShouldStop(8388608);
_l.runVoidMethod ("Add",(Object)((_m.getObject())));
 BA.debugLineNum = 793;BA.debugLine="DBUtils.InsertMaps( sql1, \"route5\", l )";
Debug.ShouldStop(16777216);
starter.mostCurrent._dbutils.runVoidMethod ("_insertmaps",starter.processBA,(Object)(starter._sql1),(Object)(BA.ObjectToString("route5")),(Object)(_l));
 BA.debugLineNum = 795;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tounsigned(RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("ToUnsigned (starter) ","starter",5,starter.processBA,starter.mostCurrent,691);
if (RapidSub.canDelegate("tounsigned")) { return com.calypsoinstruments.anemotracker.starter.remoteMe.runUserSub(false, "starter","tounsigned", _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 691;BA.debugLine="Sub ToUnsigned(b As Byte) As Int";
Debug.ShouldStop(262144);
 BA.debugLineNum = 692;BA.debugLine="Return Bit.And(0xFF, b)";
Debug.ShouldStop(524288);
if (true) return starter.mostCurrent.__c.getField(false,"Bit").runMethod(true,"And",(Object)(BA.numberCast(int.class, 0xff)),(Object)(BA.numberCast(int.class, _b)));
 BA.debugLineNum = 693;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tscan_tick() throws Exception{
try {
		Debug.PushSubsStack("tScan_Tick (starter) ","starter",5,starter.processBA,starter.mostCurrent,447);
if (RapidSub.canDelegate("tscan_tick")) { return com.calypsoinstruments.anemotracker.starter.remoteMe.runUserSub(false, "starter","tscan_tick");}
 BA.debugLineNum = 447;BA.debugLine="Sub tScan_Tick";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 449;BA.debugLine="tScan.Enabled = False";
Debug.ShouldStop(1);
starter._tscan.runMethod(true,"setEnabled",starter.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 450;BA.debugLine="ble_DiscoveryFinished";
Debug.ShouldStop(2);
_ble_discoveryfinished();
 BA.debugLineNum = 451;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _xmlrpc_init() throws Exception{
try {
		Debug.PushSubsStack("xmlrpc_init (starter) ","starter",5,starter.processBA,starter.mostCurrent,804);
if (RapidSub.canDelegate("xmlrpc_init")) { return com.calypsoinstruments.anemotracker.starter.remoteMe.runUserSub(false, "starter","xmlrpc_init");}
RemoteObject _args = null;
RemoteObject _types = null;
RemoteObject _args2 = null;
RemoteObject _types2 = null;
 BA.debugLineNum = 804;BA.debugLine="Sub xmlrpc_init";
Debug.ShouldStop(8);
 BA.debugLineNum = 807;BA.debugLine="Dim args(1) As Object";
Debug.ShouldStop(64);
_args = RemoteObject.createNewArray ("Object", new int[] {1}, new Object[]{});Debug.locals.put("args", _args);
 BA.debugLineNum = 808;BA.debugLine="Dim types(1) As String";
Debug.ShouldStop(128);
_types = RemoteObject.createNewArray ("String", new int[] {1}, new Object[]{});Debug.locals.put("types", _types);
 BA.debugLineNum = 809;BA.debugLine="args(0) = \"http://192.168.0.218:8069/xmlrpc/commo";
Debug.ShouldStop(256);
_args.setArrayElement (RemoteObject.createImmutable(("http://192.168.0.218:8069/xmlrpc/common")),BA.numberCast(int.class, 0));
 BA.debugLineNum = 810;BA.debugLine="types(0) = \"java.lang.String\"";
Debug.ShouldStop(512);
_types.setArrayElement (BA.ObjectToString("java.lang.String"),BA.numberCast(int.class, 0));
 BA.debugLineNum = 811;BA.debugLine="Obj1.Target = Obj1.CreateObject2( \"org.xmlrpc.and";
Debug.ShouldStop(1024);
starter._obj1.setField ("Target",starter._obj1.runMethod(false,"CreateObject2",(Object)(BA.ObjectToString("org.xmlrpc.android.XMLRPCClient")),(Object)(_args),(Object)(_types)));
 BA.debugLineNum = 812;BA.debugLine="Dim args2(4) As Object";
Debug.ShouldStop(2048);
_args2 = RemoteObject.createNewArray ("Object", new int[] {4}, new Object[]{});Debug.locals.put("args2", _args2);
 BA.debugLineNum = 813;BA.debugLine="Dim types2(4) As String";
Debug.ShouldStop(4096);
_types2 = RemoteObject.createNewArray ("String", new int[] {4}, new Object[]{});Debug.locals.put("types2", _types2);
 BA.debugLineNum = 814;BA.debugLine="args2(0) = \"login\"";
Debug.ShouldStop(8192);
_args2.setArrayElement (RemoteObject.createImmutable(("login")),BA.numberCast(int.class, 0));
 BA.debugLineNum = 815;BA.debugLine="args2(1) = \"Pieralisi\"";
Debug.ShouldStop(16384);
_args2.setArrayElement (RemoteObject.createImmutable(("Pieralisi")),BA.numberCast(int.class, 1));
 BA.debugLineNum = 816;BA.debugLine="args2(2) = \"admin\"";
Debug.ShouldStop(32768);
_args2.setArrayElement (RemoteObject.createImmutable(("admin")),BA.numberCast(int.class, 2));
 BA.debugLineNum = 817;BA.debugLine="args2(3) = \"pieralisi_2013\"";
Debug.ShouldStop(65536);
_args2.setArrayElement (RemoteObject.createImmutable(("pieralisi_2013")),BA.numberCast(int.class, 3));
 BA.debugLineNum = 818;BA.debugLine="types2(0) = \"java.lang.String\"";
Debug.ShouldStop(131072);
_types2.setArrayElement (BA.ObjectToString("java.lang.String"),BA.numberCast(int.class, 0));
 BA.debugLineNum = 819;BA.debugLine="types2(1) = \"java.lang.Object\"";
Debug.ShouldStop(262144);
_types2.setArrayElement (BA.ObjectToString("java.lang.Object"),BA.numberCast(int.class, 1));
 BA.debugLineNum = 820;BA.debugLine="types2(2) = \"java.lang.Object\"";
Debug.ShouldStop(524288);
_types2.setArrayElement (BA.ObjectToString("java.lang.Object"),BA.numberCast(int.class, 2));
 BA.debugLineNum = 821;BA.debugLine="types2(3) = \"java.lang.Object\"";
Debug.ShouldStop(1048576);
_types2.setArrayElement (BA.ObjectToString("java.lang.Object"),BA.numberCast(int.class, 3));
 BA.debugLineNum = 822;BA.debugLine="Obj1.Target = Obj1.RunMethod4( \"call\", args2, typ";
Debug.ShouldStop(2097152);
starter._obj1.setField ("Target",starter._obj1.runMethod(false,"RunMethod4",(Object)(BA.ObjectToString("call")),(Object)(_args2),(Object)(_types2)));
 BA.debugLineNum = 823;BA.debugLine="Log( \"RETURN OF login ---------------------------";
Debug.ShouldStop(4194304);
starter.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("RETURN OF login --------------------------------------------------------------------------------------")));
 BA.debugLineNum = 824;BA.debugLine="Log( Obj1.Target)";
Debug.ShouldStop(8388608);
starter.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(starter._obj1.getField(false,"Target"))));
 BA.debugLineNum = 827;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _xmlrpc_send_register() throws Exception{
try {
		Debug.PushSubsStack("xmlrpc_send_register (starter) ","starter",5,starter.processBA,starter.mostCurrent,829);
if (RapidSub.canDelegate("xmlrpc_send_register")) { return com.calypsoinstruments.anemotracker.starter.remoteMe.runUserSub(false, "starter","xmlrpc_send_register");}
RemoteObject _args = null;
RemoteObject _types = null;
RemoteObject _args3 = null;
RemoteObject _types3 = null;
 BA.debugLineNum = 829;BA.debugLine="Sub xmlrpc_send_register";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 830;BA.debugLine="Dim args(1) As Object";
Debug.ShouldStop(536870912);
_args = RemoteObject.createNewArray ("Object", new int[] {1}, new Object[]{});Debug.locals.put("args", _args);
 BA.debugLineNum = 831;BA.debugLine="Dim types(1) As String";
Debug.ShouldStop(1073741824);
_types = RemoteObject.createNewArray ("String", new int[] {1}, new Object[]{});Debug.locals.put("types", _types);
 BA.debugLineNum = 832;BA.debugLine="args(0) = \"http://192.168.0.218:8069/xmlrpc/objec";
Debug.ShouldStop(-2147483648);
_args.setArrayElement (RemoteObject.createImmutable(("http://192.168.0.218:8069/xmlrpc/object")),BA.numberCast(int.class, 0));
 BA.debugLineNum = 833;BA.debugLine="Obj1.Target = Obj1.CreateObject2( \"org.xmlrpc.and";
Debug.ShouldStop(1);
starter._obj1.setField ("Target",starter._obj1.runMethod(false,"CreateObject2",(Object)(BA.ObjectToString("org.xmlrpc.android.XMLRPCClient")),(Object)(_args),(Object)(_types)));
 BA.debugLineNum = 834;BA.debugLine="dt_historic.Initialize";
Debug.ShouldStop(2);
starter._dt_historic.runVoidMethod ("Initialize");
 BA.debugLineNum = 835;BA.debugLine="dt_historic.Put( \"tag_id\", 1 )";
Debug.ShouldStop(4);
starter._dt_historic.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tag_id"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 836;BA.debugLine="dt_historic.Put( \"dated\", \"2013-12-25 00:00:00\" )";
Debug.ShouldStop(8);
starter._dt_historic.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("dated"))),(Object)((RemoteObject.createImmutable("2013-12-25 00:00:00"))));
 BA.debugLineNum = 837;BA.debugLine="dt_historic.Put( \"value\", 25.0 )";
Debug.ShouldStop(16);
starter._dt_historic.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("value"))),(Object)(RemoteObject.createImmutable((25.0))));
 BA.debugLineNum = 838;BA.debugLine="Dim args3( 7 ) As Object";
Debug.ShouldStop(32);
_args3 = RemoteObject.createNewArray ("Object", new int[] {7}, new Object[]{});Debug.locals.put("args3", _args3);
 BA.debugLineNum = 839;BA.debugLine="Dim types3( 7 ) As String";
Debug.ShouldStop(64);
_types3 = RemoteObject.createNewArray ("String", new int[] {7}, new Object[]{});Debug.locals.put("types3", _types3);
 BA.debugLineNum = 840;BA.debugLine="args3(0) = \"execute\"";
Debug.ShouldStop(128);
_args3.setArrayElement (RemoteObject.createImmutable(("execute")),BA.numberCast(int.class, 0));
 BA.debugLineNum = 841;BA.debugLine="args3(1) = \"Pieralisi\"";
Debug.ShouldStop(256);
_args3.setArrayElement (RemoteObject.createImmutable(("Pieralisi")),BA.numberCast(int.class, 1));
 BA.debugLineNum = 842;BA.debugLine="args3(2) = 1";
Debug.ShouldStop(512);
_args3.setArrayElement (RemoteObject.createImmutable((1)),BA.numberCast(int.class, 2));
 BA.debugLineNum = 843;BA.debugLine="args3(3) = \"pieralisi_2013\"";
Debug.ShouldStop(1024);
_args3.setArrayElement (RemoteObject.createImmutable(("pieralisi_2013")),BA.numberCast(int.class, 3));
 BA.debugLineNum = 844;BA.debugLine="args3(4) = \"tag.historic\"";
Debug.ShouldStop(2048);
_args3.setArrayElement (RemoteObject.createImmutable(("tag.historic")),BA.numberCast(int.class, 4));
 BA.debugLineNum = 845;BA.debugLine="args3(5) = \"create\"";
Debug.ShouldStop(4096);
_args3.setArrayElement (RemoteObject.createImmutable(("create")),BA.numberCast(int.class, 5));
 BA.debugLineNum = 846;BA.debugLine="args3(6) = dt_historic";
Debug.ShouldStop(8192);
_args3.setArrayElement ((starter._dt_historic.getObject()),BA.numberCast(int.class, 6));
 BA.debugLineNum = 847;BA.debugLine="types3(0) = \"java.lang.String\"";
Debug.ShouldStop(16384);
_types3.setArrayElement (BA.ObjectToString("java.lang.String"),BA.numberCast(int.class, 0));
 BA.debugLineNum = 848;BA.debugLine="types3(1) = \"java.lang.Object\"";
Debug.ShouldStop(32768);
_types3.setArrayElement (BA.ObjectToString("java.lang.Object"),BA.numberCast(int.class, 1));
 BA.debugLineNum = 849;BA.debugLine="types3(2) = \"java.lang.Object\"";
Debug.ShouldStop(65536);
_types3.setArrayElement (BA.ObjectToString("java.lang.Object"),BA.numberCast(int.class, 2));
 BA.debugLineNum = 850;BA.debugLine="types3(3) = \"java.lang.Object\"";
Debug.ShouldStop(131072);
_types3.setArrayElement (BA.ObjectToString("java.lang.Object"),BA.numberCast(int.class, 3));
 BA.debugLineNum = 851;BA.debugLine="types3(4) = \"java.lang.Object\"";
Debug.ShouldStop(262144);
_types3.setArrayElement (BA.ObjectToString("java.lang.Object"),BA.numberCast(int.class, 4));
 BA.debugLineNum = 852;BA.debugLine="types3(5) = \"java.lang.Object\"";
Debug.ShouldStop(524288);
_types3.setArrayElement (BA.ObjectToString("java.lang.Object"),BA.numberCast(int.class, 5));
 BA.debugLineNum = 853;BA.debugLine="types3(6) = \"java.lang.Object\"";
Debug.ShouldStop(1048576);
_types3.setArrayElement (BA.ObjectToString("java.lang.Object"),BA.numberCast(int.class, 6));
 BA.debugLineNum = 854;BA.debugLine="Obj1.Target = Obj1.RunMethod4( \"call\", args3, typ";
Debug.ShouldStop(2097152);
starter._obj1.setField ("Target",starter._obj1.runMethod(false,"RunMethod4",(Object)(BA.ObjectToString("call")),(Object)(_args3),(Object)(_types3)));
 BA.debugLineNum = 857;BA.debugLine="Return";
Debug.ShouldStop(16777216);
if (true) return RemoteObject.createImmutable("");
 BA.debugLineNum = 859;BA.debugLine="args(0) = \"http://192.168.0.218:8069/xmlrpc/objec";
Debug.ShouldStop(67108864);
_args.setArrayElement (RemoteObject.createImmutable(("http://192.168.0.218:8069/xmlrpc/object")),BA.numberCast(int.class, 0));
 BA.debugLineNum = 860;BA.debugLine="Obj1.Target = Obj1.CreateObject2( \"org.xmlrpc.and";
Debug.ShouldStop(134217728);
starter._obj1.setField ("Target",starter._obj1.runMethod(false,"CreateObject2",(Object)(BA.ObjectToString("org.xmlrpc.android.XMLRPCClient")),(Object)(_args),(Object)(_types)));
 BA.debugLineNum = 861;BA.debugLine="dt_historic.Initialize";
Debug.ShouldStop(268435456);
starter._dt_historic.runVoidMethod ("Initialize");
 BA.debugLineNum = 865;BA.debugLine="Dim args3( 7 ) As Object";
Debug.ShouldStop(1);
_args3 = RemoteObject.createNewArray ("Object", new int[] {7}, new Object[]{});Debug.locals.put("args3", _args3);
 BA.debugLineNum = 866;BA.debugLine="Dim types3( 7 ) As String";
Debug.ShouldStop(2);
_types3 = RemoteObject.createNewArray ("String", new int[] {7}, new Object[]{});Debug.locals.put("types3", _types3);
 BA.debugLineNum = 867;BA.debugLine="args3(0) = \"execute\"";
Debug.ShouldStop(4);
_args3.setArrayElement (RemoteObject.createImmutable(("execute")),BA.numberCast(int.class, 0));
 BA.debugLineNum = 868;BA.debugLine="args3(1) = \"Pieralisi\"";
Debug.ShouldStop(8);
_args3.setArrayElement (RemoteObject.createImmutable(("Pieralisi")),BA.numberCast(int.class, 1));
 BA.debugLineNum = 869;BA.debugLine="args3(2) = 1";
Debug.ShouldStop(16);
_args3.setArrayElement (RemoteObject.createImmutable((1)),BA.numberCast(int.class, 2));
 BA.debugLineNum = 870;BA.debugLine="args3(3) = \"pieralisi_2013\"";
Debug.ShouldStop(32);
_args3.setArrayElement (RemoteObject.createImmutable(("pieralisi_2013")),BA.numberCast(int.class, 3));
 BA.debugLineNum = 871;BA.debugLine="args3(4) = \"tag.historic\"";
Debug.ShouldStop(64);
_args3.setArrayElement (RemoteObject.createImmutable(("tag.historic")),BA.numberCast(int.class, 4));
 BA.debugLineNum = 872;BA.debugLine="args3(5) = \"create\"";
Debug.ShouldStop(128);
_args3.setArrayElement (RemoteObject.createImmutable(("create")),BA.numberCast(int.class, 5));
 BA.debugLineNum = 873;BA.debugLine="args3(6) = dt_historic";
Debug.ShouldStop(256);
_args3.setArrayElement ((starter._dt_historic.getObject()),BA.numberCast(int.class, 6));
 BA.debugLineNum = 874;BA.debugLine="types3(0) = \"java.lang.String\"";
Debug.ShouldStop(512);
_types3.setArrayElement (BA.ObjectToString("java.lang.String"),BA.numberCast(int.class, 0));
 BA.debugLineNum = 875;BA.debugLine="types3(1) = \"java.lang.Object\"";
Debug.ShouldStop(1024);
_types3.setArrayElement (BA.ObjectToString("java.lang.Object"),BA.numberCast(int.class, 1));
 BA.debugLineNum = 876;BA.debugLine="types3(2) = \"java.lang.Object\"";
Debug.ShouldStop(2048);
_types3.setArrayElement (BA.ObjectToString("java.lang.Object"),BA.numberCast(int.class, 2));
 BA.debugLineNum = 877;BA.debugLine="types3(3) = \"java.lang.Object\"";
Debug.ShouldStop(4096);
_types3.setArrayElement (BA.ObjectToString("java.lang.Object"),BA.numberCast(int.class, 3));
 BA.debugLineNum = 878;BA.debugLine="types3(4) = \"java.lang.Object\"";
Debug.ShouldStop(8192);
_types3.setArrayElement (BA.ObjectToString("java.lang.Object"),BA.numberCast(int.class, 4));
 BA.debugLineNum = 879;BA.debugLine="types3(5) = \"java.lang.Object\"";
Debug.ShouldStop(16384);
_types3.setArrayElement (BA.ObjectToString("java.lang.Object"),BA.numberCast(int.class, 5));
 BA.debugLineNum = 880;BA.debugLine="types3(6) = \"java.lang.Object\"";
Debug.ShouldStop(32768);
_types3.setArrayElement (BA.ObjectToString("java.lang.Object"),BA.numberCast(int.class, 6));
 BA.debugLineNum = 881;BA.debugLine="Obj1.Target = Obj1.RunMethod4( \"call\", args3, typ";
Debug.ShouldStop(65536);
starter._obj1.setField ("Target",starter._obj1.runMethod(false,"RunMethod4",(Object)(BA.ObjectToString("call")),(Object)(_args3),(Object)(_types3)));
 BA.debugLineNum = 883;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}