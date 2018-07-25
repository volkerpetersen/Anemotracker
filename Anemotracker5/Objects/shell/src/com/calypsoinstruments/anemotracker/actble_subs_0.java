package com.calypsoinstruments.anemotracker;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class actble_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (actble) ","actble",1,actble.mostCurrent.activityBA,actble.mostCurrent,33);
if (RapidSub.canDelegate("activity_create")) { return com.calypsoinstruments.anemotracker.actble.remoteMe.runUserSub(false, "actble","activity_create", _firsttime);}
RemoteObject _xml = RemoteObject.declareNull("anywheresoftware.b4a.object.XmlLayoutBuilder");
RemoteObject _ac = RemoteObject.declareNull("de.amberhome.objects.appcompat.AppCompatBase");
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 33;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1);
 BA.debugLineNum = 36;BA.debugLine="devices.Initialize";
Debug.ShouldStop(8);
actble._devices.runVoidMethod ("Initialize");
 BA.debugLineNum = 38;BA.debugLine="lDevices.Initialize";
Debug.ShouldStop(32);
actble._ldevices.runVoidMethod ("Initialize");
 BA.debugLineNum = 40;BA.debugLine="Dim xml As XmlLayoutBuilder";
Debug.ShouldStop(128);
_xml = RemoteObject.createNew ("anywheresoftware.b4a.object.XmlLayoutBuilder");Debug.locals.put("xml", _xml);
 BA.debugLineNum = 41;BA.debugLine="Activity.Initialize(\"Activity\")";
Debug.ShouldStop(256);
actble.mostCurrent._activity.runVoidMethod ("Initialize",actble.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Activity")));
 BA.debugLineNum = 42;BA.debugLine="Activity.Title = \"BLE Connection\"";
Debug.ShouldStop(512);
actble.mostCurrent._activity.runMethod(false,"setTitle",BA.ObjectToCharSequence("BLE Connection"));
 BA.debugLineNum = 44;BA.debugLine="toolbar.Initialize(\"tb\")";
Debug.ShouldStop(2048);
actble.mostCurrent._toolbar.runVoidMethod ("Initialize",actble.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("tb")));
 BA.debugLineNum = 45;BA.debugLine="toolbar.SubTitle = \"Select bluetooth device to co";
Debug.ShouldStop(4096);
actble.mostCurrent._toolbar.runMethod(true,"setSubTitle",BA.ObjectToCharSequence("Select bluetooth device to connect"));
 BA.debugLineNum = 46;BA.debugLine="toolbar.Title = \"Ble connection\"";
Debug.ShouldStop(8192);
actble.mostCurrent._toolbar.runMethod(true,"setTitle",BA.ObjectToCharSequence("Ble connection"));
 BA.debugLineNum = 47;BA.debugLine="toolbar.SetAsActionBar";
Debug.ShouldStop(16384);
actble.mostCurrent._toolbar.runVoidMethod ("SetAsActionBar",actble.mostCurrent.activityBA);
 BA.debugLineNum = 49;BA.debugLine="toolbar.NavigationIconBitmap = LoadBitmap( File.D";
Debug.ShouldStop(65536);
actble.mostCurrent._toolbar.runVoidMethod ("setNavigationIconBitmap",(actble.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(actble.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("bt.png"))).getObject()));
 BA.debugLineNum = 52;BA.debugLine="Dim AC As AppCompat";
Debug.ShouldStop(524288);
_ac = RemoteObject.createNew ("de.amberhome.objects.appcompat.AppCompatBase");Debug.locals.put("AC", _ac);
 BA.debugLineNum = 53;BA.debugLine="AC.SetElevation(toolbar, 8dip)";
Debug.ShouldStop(1048576);
_ac.runVoidMethod ("SetElevation",(Object)((actble.mostCurrent._toolbar.getObject())),(Object)(BA.numberCast(float.class, actble.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8))))));
 BA.debugLineNum = 55;BA.debugLine="Activity.AddView( toolbar, 0%x, 0%y, 100%x, 55dip";
Debug.ShouldStop(4194304);
actble.mostCurrent._activity.runVoidMethod ("AddView",(Object)((actble.mostCurrent._toolbar.getObject())),(Object)(actble.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),actble.mostCurrent.activityBA)),(Object)(actble.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 0)),actble.mostCurrent.activityBA)),(Object)(actble.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),actble.mostCurrent.activityBA)),(Object)(actble.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 55)))));
 BA.debugLineNum = 57;BA.debugLine="clv.Initialize( \"clv\" )";
Debug.ShouldStop(16777216);
actble.mostCurrent._clv.runVoidMethod ("Initialize",actble.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("clv")));
 BA.debugLineNum = 58;BA.debugLine="Activity.AddView( clv, 0%x, 55dip, 100%x,100%y-55";
Debug.ShouldStop(33554432);
actble.mostCurrent._activity.runVoidMethod ("AddView",(Object)((actble.mostCurrent._clv.getObject())),(Object)(actble.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),actble.mostCurrent.activityBA)),(Object)(actble.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 55)))),(Object)(actble.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),actble.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {actble.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),actble.mostCurrent.activityBA),actble.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 55)))}, "-",1, 1)));
 BA.debugLineNum = 61;BA.debugLine="Dim xml As XmlLayoutBuilder";
Debug.ShouldStop(268435456);
_xml = RemoteObject.createNew ("anywheresoftware.b4a.object.XmlLayoutBuilder");Debug.locals.put("xml", _xml);
 BA.debugLineNum = 62;BA.debugLine="fab1.Initialize( \"Fab1\" )";
Debug.ShouldStop(536870912);
actble.mostCurrent._fab1.runVoidMethod ("Initialize",actble.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Fab1")));
 BA.debugLineNum = 63;BA.debugLine="Activity.AddView( fab1, Activity.Width-70dip, Act";
Debug.ShouldStop(1073741824);
actble.mostCurrent._activity.runVoidMethod ("AddView",(Object)((actble.mostCurrent._fab1.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {actble.mostCurrent._activity.runMethod(true,"getWidth"),actble.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 70)))}, "-",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {actble.mostCurrent._activity.runMethod(true,"getHeight"),actble.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 70)))}, "-",1, 1)),(Object)(actble.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 55)))),(Object)(actble.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 55)))));
 BA.debugLineNum = 65;BA.debugLine="Dim bmp As BitmapDrawable";
Debug.ShouldStop(1);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 66;BA.debugLine="bmp.Initialize( LoadBitmapResize( File.DirAssets,";
Debug.ShouldStop(2);
_bmp.runVoidMethod ("Initialize",(Object)((actble.mostCurrent.__c.runMethod(false,"LoadBitmapResize",(Object)(actble.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("connection.png")),(Object)(BA.numberCast(int.class, 256)),(Object)(BA.numberCast(int.class, 256)),(Object)(actble.mostCurrent.__c.getField(true,"True"))).getObject())));
 BA.debugLineNum = 67;BA.debugLine="bmp.Gravity = Gravity.FILL";
Debug.ShouldStop(4);
_bmp.runMethod(true,"setGravity",actble.mostCurrent.__c.getField(false,"Gravity").getField(true,"FILL"));
 BA.debugLineNum = 68;BA.debugLine="fab1.SetIcon( bmp )";
Debug.ShouldStop(8);
actble.mostCurrent._fab1.runVoidMethod ("SetIcon",(Object)((_bmp.getObject())));
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (actble) ","actble",1,actble.mostCurrent.activityBA,actble.mostCurrent,147);
if (RapidSub.canDelegate("activity_pause")) { return com.calypsoinstruments.anemotracker.actble.remoteMe.runUserSub(false, "actble","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 147;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(262144);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (actble) ","actble",1,actble.mostCurrent.activityBA,actble.mostCurrent,89);
if (RapidSub.canDelegate("activity_resume")) { return com.calypsoinstruments.anemotracker.actble.remoteMe.runUserSub(false, "actble","activity_resume");}
 BA.debugLineNum = 89;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 90;BA.debugLine="clv.Clear";
Debug.ShouldStop(33554432);
actble.mostCurrent._clv.runVoidMethod ("Clear");
 BA.debugLineNum = 91;BA.debugLine="clv.Invalidate";
Debug.ShouldStop(67108864);
actble.mostCurrent._clv.runVoidMethod ("Invalidate");
 BA.debugLineNum = 94;BA.debugLine="SearchBLE(False)";
Debug.ShouldStop(536870912);
_searchble(actble.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 95;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _actv_end(RemoteObject _mac) throws Exception{
try {
		Debug.PushSubsStack("Actv_End (actble) ","actble",1,actble.mostCurrent.activityBA,actble.mostCurrent,99);
if (RapidSub.canDelegate("actv_end")) { return com.calypsoinstruments.anemotracker.actble.remoteMe.runUserSub(false, "actble","actv_end", _mac);}
Debug.locals.put("mac", _mac);
 BA.debugLineNum = 99;BA.debugLine="Sub Actv_End( mac As String )";
Debug.ShouldStop(4);
 BA.debugLineNum = 101;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16);
actble.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 102;BA.debugLine="Return";
Debug.ShouldStop(32);
if (true) return RemoteObject.createImmutable("");
 BA.debugLineNum = 145;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addtolistrt() throws Exception{
try {
		Debug.PushSubsStack("addToListRT (actble) ","actble",1,actble.mostCurrent.activityBA,actble.mostCurrent,152);
if (RapidSub.canDelegate("addtolistrt")) { return com.calypsoinstruments.anemotracker.actble.remoteMe.runUserSub(false, "actble","addtolistrt");}
RemoteObject _dev = RemoteObject.declareNull("Object");
RemoteObject _ultra = RemoteObject.declareNull("com.calypsoinstruments.anemotracker.starter._tultra");
 BA.debugLineNum = 152;BA.debugLine="Sub addToListRT";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 154;BA.debugLine="lDevices.Clear";
Debug.ShouldStop(33554432);
actble._ldevices.runVoidMethod ("Clear");
 BA.debugLineNum = 155;BA.debugLine="clv.Clear";
Debug.ShouldStop(67108864);
actble.mostCurrent._clv.runVoidMethod ("Clear");
 BA.debugLineNum = 156;BA.debugLine="For Each dev In Starter.devices.Values";
Debug.ShouldStop(134217728);
{
final RemoteObject group3 = actble.mostCurrent._starter._devices.runMethod(false,"Values");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_dev = group3.runMethod(false,"Get",index3);Debug.locals.put("dev", _dev);
Debug.locals.put("dev", _dev);
 BA.debugLineNum = 157;BA.debugLine="lDevices.Add( dev )";
Debug.ShouldStop(268435456);
actble._ldevices.runVoidMethod ("Add",(Object)(_dev));
 }
}Debug.locals.put("dev", _dev);
;
 BA.debugLineNum = 159;BA.debugLine="lDevices.SortType( \"RSSI\", False )";
Debug.ShouldStop(1073741824);
actble._ldevices.runVoidMethod ("SortType",(Object)(BA.ObjectToString("RSSI")),(Object)(actble.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 162;BA.debugLine="For Each ultra As tUltra In lDevices";
Debug.ShouldStop(2);
{
final RemoteObject group7 = actble._ldevices;
final int groupLen7 = group7.runMethod(true,"getSize").<Integer>get()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_ultra = (group7.runMethod(false,"Get",index7));Debug.locals.put("ultra", _ultra);
Debug.locals.put("ultra", _ultra);
 BA.debugLineNum = 163;BA.debugLine="clv.AddTwoLines2( ultra.Name , ultra.MacAddress";
Debug.ShouldStop(4);
actble.mostCurrent._clv.runVoidMethod ("AddTwoLines2",(Object)(BA.ObjectToCharSequence(_ultra.getField(true,"Name"))),(Object)(BA.ObjectToCharSequence(RemoteObject.concat(_ultra.getField(true,"MacAddress"),RemoteObject.createImmutable(" rssi: "),_ultra.getField(true,"RSSI")))),(Object)((_ultra)));
 BA.debugLineNum = 164;BA.debugLine="clv.TwoLinesLayout.Label.TextColor = Colors.Blac";
Debug.ShouldStop(8);
actble.mostCurrent._clv.runMethod(false,"getTwoLinesLayout").getField(false,"Label").runMethod(true,"setTextColor",actble.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 }
}Debug.locals.put("ultra", _ultra);
;
 BA.debugLineNum = 166;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clv_itemclick(RemoteObject _position,RemoteObject _ultra) throws Exception{
try {
		Debug.PushSubsStack("clv_ItemClick (actble) ","actble",1,actble.mostCurrent.activityBA,actble.mostCurrent,188);
if (RapidSub.canDelegate("clv_itemclick")) { return com.calypsoinstruments.anemotracker.actble.remoteMe.runUserSub(false, "actble","clv_itemclick", _position, _ultra);}
Debug.locals.put("Position", _position);
Debug.locals.put("ultra", _ultra);
 BA.debugLineNum = 188;BA.debugLine="Sub clv_ItemClick (Position As Int, ultra As tUltr";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 189;BA.debugLine="Starter.Scan.StopScan";
Debug.ShouldStop(268435456);
actble.mostCurrent._starter._scan.runVoidMethod ("StopScan");
 BA.debugLineNum = 190;BA.debugLine="If Starter.connected Then";
Debug.ShouldStop(536870912);
if (actble.mostCurrent._starter._connected.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 191;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1073741824);
actble.mostCurrent._activity.runVoidMethod ("Finish");
 }else {
 BA.debugLineNum = 194;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2);
actble.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 195;BA.debugLine="Log( ultra )";
Debug.ShouldStop(4);
actble.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(_ultra)));
 BA.debugLineNum = 196;BA.debugLine="clv.Enabled = False";
Debug.ShouldStop(8);
actble.mostCurrent._clv.runMethod(true,"setEnabled",actble.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 199;BA.debugLine="Starter.actual_ultra = ultra";
Debug.ShouldStop(64);
actble.mostCurrent._starter._actual_ultra = _ultra;
 BA.debugLineNum = 200;BA.debugLine="ToastMessageShow( \"Trying to connecto to \" & ult";
Debug.ShouldStop(128);
actble.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Trying to connecto to "),_ultra.getField(true,"MacAddress")))),(Object)(actble.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 201;BA.debugLine="If ultra.Name.StartsWith(\"CUPS\") Then";
Debug.ShouldStop(256);
if (_ultra.getField(true,"Name").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("CUPS"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 202;BA.debugLine="Starter.deviceType = 1";
Debug.ShouldStop(512);
actble.mostCurrent._starter._devicetype = BA.numberCast(int.class, 1);
 }else 
{ BA.debugLineNum = 203;BA.debugLine="else if ultra.Name.StartsWith(\"ULTRA\") Then";
Debug.ShouldStop(1024);
if (_ultra.getField(true,"Name").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ULTRA"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 204;BA.debugLine="Starter.deviceType = 2";
Debug.ShouldStop(2048);
actble.mostCurrent._starter._devicetype = BA.numberCast(int.class, 2);
 }else 
{ BA.debugLineNum = 205;BA.debugLine="else if ultra.Name.StartsWith(\"NMEA\") Then";
Debug.ShouldStop(4096);
if (_ultra.getField(true,"Name").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("NMEA"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 206;BA.debugLine="Starter.deviceType = 3";
Debug.ShouldStop(8192);
actble.mostCurrent._starter._devicetype = BA.numberCast(int.class, 3);
 }}}
;
 BA.debugLineNum = 209;BA.debugLine="CallSubDelayed2( Starter, \"ConnectBle\", ultra )";
Debug.ShouldStop(65536);
actble.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",actble.processBA,(Object)((actble.mostCurrent._starter.getObject())),(Object)(BA.ObjectToString("ConnectBle")),(Object)((_ultra)));
 BA.debugLineNum = 210;BA.debugLine="Starter.uId = ultra.macaddress";
Debug.ShouldStop(131072);
actble.mostCurrent._starter._uid = _ultra.getField(true,"MacAddress");
 BA.debugLineNum = 211;BA.debugLine="CallSubDelayed(Main, \"Connecting\")";
Debug.ShouldStop(262144);
actble.mostCurrent.__c.runVoidMethod ("CallSubDelayed",actble.processBA,(Object)((actble.mostCurrent._main.getObject())),(Object)(RemoteObject.createImmutable("Connecting")));
 };
 BA.debugLineNum = 213;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _discoveryfinished2() throws Exception{
try {
		Debug.PushSubsStack("DiscoveryFinished2 (actble) ","actble",1,actble.mostCurrent.activityBA,actble.mostCurrent,168);
if (RapidSub.canDelegate("discoveryfinished2")) { return com.calypsoinstruments.anemotracker.actble.remoteMe.runUserSub(false, "actble","discoveryfinished2");}
 BA.debugLineNum = 168;BA.debugLine="Sub DiscoveryFinished2";
Debug.ShouldStop(128);
 BA.debugLineNum = 169;BA.debugLine="fab1.Show";
Debug.ShouldStop(256);
actble.mostCurrent._fab1.runVoidMethod ("Show");
 BA.debugLineNum = 170;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fab1_click() throws Exception{
try {
		Debug.PushSubsStack("Fab1_Click (actble) ","actble",1,actble.mostCurrent.activityBA,actble.mostCurrent,217);
if (RapidSub.canDelegate("fab1_click")) { return com.calypsoinstruments.anemotracker.actble.remoteMe.runUserSub(false, "actble","fab1_click");}
 BA.debugLineNum = 217;BA.debugLine="Sub Fab1_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 218;BA.debugLine="SearchBLE(False)";
Debug.ShouldStop(33554432);
_searchble(actble.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 219;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 24;BA.debugLine="Dim toolbar As ACToolBarLight";
actble.mostCurrent._toolbar = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACToolbarLightWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Dim clv As ListView";
actble.mostCurrent._clv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private fab1 As DSFloatingActionButton";
actble.mostCurrent._fab1 = RemoteObject.createNew ("de.amberhome.objects.FloatingActionButtonWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Dim toolbar As ACToolBarLight";
actble.mostCurrent._toolbar = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACToolbarLightWrapper");
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 12;BA.debugLine="Private cs As Map";
actble._cs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 13;BA.debugLine="Private cc As Map";
actble._cc = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 15;BA.debugLine="Public devices As Map";
actble._devices = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 17;BA.debugLine="Dim lDevices As List";
actble._ldevices = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _searchble(RemoteObject _test) throws Exception{
try {
		Debug.PushSubsStack("SearchBLE (actble) ","actble",1,actble.mostCurrent.activityBA,actble.mostCurrent,76);
if (RapidSub.canDelegate("searchble")) { return com.calypsoinstruments.anemotracker.actble.remoteMe.runUserSub(false, "actble","searchble", _test);}
Debug.locals.put("test", _test);
 BA.debugLineNum = 76;BA.debugLine="Sub SearchBLE(test As Boolean)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 78;BA.debugLine="devices.Initialize";
Debug.ShouldStop(8192);
actble._devices.runVoidMethod ("Initialize");
 BA.debugLineNum = 79;BA.debugLine="clv.Clear";
Debug.ShouldStop(16384);
actble.mostCurrent._clv.runVoidMethod ("Clear");
 BA.debugLineNum = 80;BA.debugLine="clv.Invalidate";
Debug.ShouldStop(32768);
actble.mostCurrent._clv.runVoidMethod ("Invalidate");
 BA.debugLineNum = 81;BA.debugLine="Activity.Invalidate";
Debug.ShouldStop(65536);
actble.mostCurrent._activity.runVoidMethod ("Invalidate");
 BA.debugLineNum = 82;BA.debugLine="toolbar.Title = \"Searching\"";
Debug.ShouldStop(131072);
actble.mostCurrent._toolbar.runMethod(true,"setTitle",BA.ObjectToCharSequence("Searching"));
 BA.debugLineNum = 83;BA.debugLine="fab1.Hide";
Debug.ShouldStop(262144);
actble.mostCurrent._fab1.runVoidMethod ("Hide");
 BA.debugLineNum = 86;BA.debugLine="CallSubDelayed(Starter, \"ble_Scan\")";
Debug.ShouldStop(2097152);
actble.mostCurrent.__c.runVoidMethod ("CallSubDelayed",actble.processBA,(Object)((actble.mostCurrent._starter.getObject())),(Object)(RemoteObject.createImmutable("ble_Scan")));
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}