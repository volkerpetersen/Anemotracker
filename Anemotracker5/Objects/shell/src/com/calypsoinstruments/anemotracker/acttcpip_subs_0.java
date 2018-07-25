package com.calypsoinstruments.anemotracker;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class acttcpip_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (acttcpip) ","acttcpip",4,acttcpip.mostCurrent.activityBA,acttcpip.mostCurrent,44);
if (RapidSub.canDelegate("activity_create")) { return com.calypsoinstruments.anemotracker.acttcpip.remoteMe.runUserSub(false, "acttcpip","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 44;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 47;BA.debugLine="Activity.LoadLayout(\"tcp\")";
Debug.ShouldStop(16384);
acttcpip.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("tcp")),acttcpip.mostCurrent.activityBA);
 BA.debugLineNum = 48;BA.debugLine="btnConnect.Enabled = False";
Debug.ShouldStop(32768);
acttcpip.mostCurrent._btnconnect.runMethod(true,"setEnabled",acttcpip.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 51;BA.debugLine="lvLog.SingleLineLayout.ItemHeight = 16dip";
Debug.ShouldStop(262144);
acttcpip.mostCurrent._lvlog.runMethod(false,"getSingleLineLayout").runMethod(true,"setItemHeight",acttcpip.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 16))));
 BA.debugLineNum = 52;BA.debugLine="lvLog.SingleLineLayout.Label.TextSize = 12";
Debug.ShouldStop(524288);
acttcpip.mostCurrent._lvlog.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextSize",BA.numberCast(float.class, 12));
 BA.debugLineNum = 53;BA.debugLine="MyIP = ServerSocket1.GetMyIP";
Debug.ShouldStop(1048576);
acttcpip._myip = acttcpip._serversocket1.runMethod(true,"GetMyIP");
 BA.debugLineNum = 54;BA.debugLine="lblConnect.Text = MyIP";
Debug.ShouldStop(2097152);
acttcpip.mostCurrent._lblconnect.runMethod(true,"setText",BA.ObjectToCharSequence(acttcpip._myip));
 BA.debugLineNum = 56;BA.debugLine="If FirstTime = True Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_firsttime,acttcpip.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 57;BA.debugLine="btnConnect_Click";
Debug.ShouldStop(16777216);
_btnconnect_click();
 };
 BA.debugLineNum = 60;BA.debugLine="bmp_background = LoadBitmapResize( File.DirAssets";
Debug.ShouldStop(134217728);
acttcpip.mostCurrent._bmp_background = acttcpip.mostCurrent.__c.runMethod(false,"LoadBitmapResize",(Object)(acttcpip.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("Textura fibra carbono.jpg")),(Object)(BA.numberCast(int.class, 800)),(Object)(BA.numberCast(int.class, 800)),(Object)(acttcpip.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 61;BA.debugLine="SetTiledBackground( bmp_background )";
Debug.ShouldStop(268435456);
_settiledbackground(acttcpip.mostCurrent._bmp_background);
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (acttcpip) ","acttcpip",4,acttcpip.mostCurrent.activityBA,acttcpip.mostCurrent,80);
if (RapidSub.canDelegate("activity_pause")) { return com.calypsoinstruments.anemotracker.acttcpip.remoteMe.runUserSub(false, "acttcpip","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 80;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("Activity_Resume (acttcpip) ","acttcpip",4,acttcpip.mostCurrent.activityBA,acttcpip.mostCurrent,76);
if (RapidSub.canDelegate("activity_resume")) { return com.calypsoinstruments.anemotracker.acttcpip.remoteMe.runUserSub(false, "acttcpip","activity_resume");}
 BA.debugLineNum = 76;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(2048);
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _astreams_newdata(RemoteObject _buffer) throws Exception{
try {
		Debug.PushSubsStack("AStreams_NewData (acttcpip) ","acttcpip",4,acttcpip.mostCurrent.activityBA,acttcpip.mostCurrent,112);
if (RapidSub.canDelegate("astreams_newdata")) { return com.calypsoinstruments.anemotracker.acttcpip.remoteMe.runUserSub(false, "acttcpip","astreams_newdata", _buffer);}
RemoteObject _msg = RemoteObject.createImmutable("");
RemoteObject _cmsg = RemoteObject.createImmutable("");
RemoteObject _t = RemoteObject.createImmutable("");
RemoteObject _x = RemoteObject.createImmutable(0);
RemoteObject _unsignedi = RemoteObject.createImmutable(0);
RemoteObject _signedb = RemoteObject.createImmutable((byte)0);
RemoteObject _mapj = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _ifconfig = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _a = RemoteObject.createImmutable(false);
int _i = 0;
Debug.locals.put("Buffer", _buffer);
 BA.debugLineNum = 112;BA.debugLine="Sub AStreams_NewData (Buffer() As Byte)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 113;BA.debugLine="Dim msg As String";
Debug.ShouldStop(65536);
_msg = RemoteObject.createImmutable("");Debug.locals.put("msg", _msg);
 BA.debugLineNum = 114;BA.debugLine="Dim cMsg As String";
Debug.ShouldStop(131072);
_cmsg = RemoteObject.createImmutable("");Debug.locals.put("cMsg", _cmsg);
 BA.debugLineNum = 115;BA.debugLine="Dim t As String";
Debug.ShouldStop(262144);
_t = RemoteObject.createImmutable("");Debug.locals.put("t", _t);
 BA.debugLineNum = 116;BA.debugLine="Dim x As Int";
Debug.ShouldStop(524288);
_x = RemoteObject.createImmutable(0);Debug.locals.put("x", _x);
 BA.debugLineNum = 117;BA.debugLine="Dim unsignedi As Int";
Debug.ShouldStop(1048576);
_unsignedi = RemoteObject.createImmutable(0);Debug.locals.put("unsignedi", _unsignedi);
 BA.debugLineNum = 118;BA.debugLine="Dim signedb As Byte";
Debug.ShouldStop(2097152);
_signedb = RemoteObject.createImmutable((byte)0);Debug.locals.put("signedb", _signedb);
 BA.debugLineNum = 120;BA.debugLine="msg = BytesToString(Buffer, 0, Buffer.Length, \"AS";
Debug.ShouldStop(8388608);
_msg = acttcpip.mostCurrent.__c.runMethod(true,"BytesToString",(Object)(_buffer),(Object)(BA.numberCast(int.class, 0)),(Object)(_buffer.getField(true,"length")),(Object)(RemoteObject.createImmutable("ASCII")));Debug.locals.put("msg", _msg);
 BA.debugLineNum = 121;BA.debugLine="If isConfigU Then";
Debug.ShouldStop(16777216);
if (acttcpip._isconfigu.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 122;BA.debugLine="isConfigU = False";
Debug.ShouldStop(33554432);
acttcpip._isconfigu = acttcpip.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 123;BA.debugLine="Dim mapJ As Map";
Debug.ShouldStop(67108864);
_mapj = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mapJ", _mapj);
 BA.debugLineNum = 124;BA.debugLine="JSONrcv.Initialize(msg)";
Debug.ShouldStop(134217728);
acttcpip.mostCurrent._jsonrcv.runVoidMethod ("Initialize",(Object)(_msg));
 BA.debugLineNum = 125;BA.debugLine="mapJ = JSONrcv.NextObject";
Debug.ShouldStop(268435456);
_mapj = acttcpip.mostCurrent._jsonrcv.runMethod(false,"NextObject");Debug.locals.put("mapJ", _mapj);
 BA.debugLineNum = 126;BA.debugLine="Try";
Debug.ShouldStop(536870912);
try { BA.debugLineNum = 127;BA.debugLine="Dim ifconfig As List";
Debug.ShouldStop(1073741824);
_ifconfig = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ifconfig", _ifconfig);
 BA.debugLineNum = 128;BA.debugLine="ifconfig.Initialize";
Debug.ShouldStop(-2147483648);
_ifconfig.runVoidMethod ("Initialize");
 BA.debugLineNum = 129;BA.debugLine="ifconfig = mapJ.Get(\"ifconfig\")";
Debug.ShouldStop(1);
_ifconfig.setObject(_mapj.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ifconfig")))));
 BA.debugLineNum = 131;BA.debugLine="Dim a As Boolean = mls.connectWifiAP(ap_index)";
Debug.ShouldStop(4);
_a = acttcpip.mostCurrent._mls.runMethod(true,"connectWifiAP",(Object)(acttcpip._ap_index));Debug.locals.put("a", _a);Debug.locals.put("a", _a);
 BA.debugLineNum = 132;BA.debugLine="If Not(a) Then";
Debug.ShouldStop(8);
if (acttcpip.mostCurrent.__c.runMethod(true,"Not",(Object)(_a)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 133;BA.debugLine="ToastMessageShow(\"Unable to connect to wifi\",";
Debug.ShouldStop(16);
acttcpip.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Unable to connect to wifi")),(Object)(acttcpip.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 134;BA.debugLine="Return";
Debug.ShouldStop(32);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 137;BA.debugLine="Socket1.Close";
Debug.ShouldStop(256);
acttcpip._socket1.runVoidMethod ("Close");
 BA.debugLineNum = 138;BA.debugLine="Socket1.Initialize(\"Socket1\")";
Debug.ShouldStop(512);
acttcpip._socket1.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("Socket1")));
 BA.debugLineNum = 139;BA.debugLine="Socket1.Connect(ifconfig.Get(0),50000,5000)";
Debug.ShouldStop(1024);
acttcpip._socket1.runVoidMethod ("Connect",acttcpip.processBA,(Object)(BA.ObjectToString(_ifconfig.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(int.class, 50000)),(Object)(BA.numberCast(int.class, 5000)));
 BA.debugLineNum = 140;BA.debugLine="ToastMessageShow(\"Done\", True)";
Debug.ShouldStop(2048);
acttcpip.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Done")),(Object)(acttcpip.mostCurrent.__c.getField(true,"True")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e27) {
			BA.rdebugUtils.runVoidMethod("setLastException",acttcpip.processBA, e27.toString()); BA.debugLineNum = 142;BA.debugLine="ToastMessageShow(\"Unable to get the ip\", True)";
Debug.ShouldStop(8192);
acttcpip.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Unable to get the ip")),(Object)(acttcpip.mostCurrent.__c.getField(true,"True")));
 };
 };
 BA.debugLineNum = 147;BA.debugLine="lvLog.AddSingleLine (msg)";
Debug.ShouldStop(262144);
acttcpip.mostCurrent._lvlog.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(_msg)));
 BA.debugLineNum = 148;BA.debugLine="Log(msg)";
Debug.ShouldStop(524288);
acttcpip.mostCurrent.__c.runVoidMethod ("Log",(Object)(_msg));
 BA.debugLineNum = 149;BA.debugLine="For i = 0 To msg.Length -1";
Debug.ShouldStop(1048576);
{
final int step32 = 1;
final int limit32 = RemoteObject.solve(new RemoteObject[] {_msg.runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step32 > 0 && _i <= limit32) || (step32 < 0 && _i >= limit32) ;_i = ((int)(0 + _i + step32))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 150;BA.debugLine="signedb = Buffer(i)";
Debug.ShouldStop(2097152);
_signedb = _buffer.getArrayElement(true,BA.numberCast(int.class, _i));Debug.locals.put("signedb", _signedb);
 BA.debugLineNum = 151;BA.debugLine="unsignedi = Bit.And(0xff, signedb)";
Debug.ShouldStop(4194304);
_unsignedi = acttcpip.mostCurrent.__c.getField(false,"Bit").runMethod(true,"And",(Object)(BA.numberCast(int.class, 0xff)),(Object)(BA.numberCast(int.class, _signedb)));Debug.locals.put("unsignedi", _unsignedi);
 BA.debugLineNum = 152;BA.debugLine="cMsg = cMsg & Chr(unsignedi)";
Debug.ShouldStop(8388608);
_cmsg = RemoteObject.concat(_cmsg,acttcpip.mostCurrent.__c.runMethod(true,"Chr",(Object)(_unsignedi)));Debug.locals.put("cMsg", _cmsg);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 154;BA.debugLine="lvLog.AddSingleLine(cMsg)";
Debug.ShouldStop(33554432);
acttcpip.mostCurrent._lvlog.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(_cmsg)));
 BA.debugLineNum = 155;BA.debugLine="Log(cMsg)";
Debug.ShouldStop(67108864);
acttcpip.mostCurrent.__c.runVoidMethod ("Log",(Object)(_cmsg));
 BA.debugLineNum = 156;BA.debugLine="lblMsg.Text = x & \" / \" & msg.Length & \" - \" & ms";
Debug.ShouldStop(134217728);
acttcpip.mostCurrent._lblmsg.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_x,RemoteObject.createImmutable(" / "),_msg.runMethod(true,"length"),RemoteObject.createImmutable(" - "),_msg)));
 BA.debugLineNum = 161;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnconnect_click() throws Exception{
try {
		Debug.PushSubsStack("btnConnect_Click (acttcpip) ","acttcpip",4,acttcpip.mostCurrent.activityBA,acttcpip.mostCurrent,84);
if (RapidSub.canDelegate("btnconnect_click")) { return com.calypsoinstruments.anemotracker.acttcpip.remoteMe.runUserSub(false, "acttcpip","btnconnect_click");}
 BA.debugLineNum = 84;BA.debugLine="Sub btnConnect_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 85;BA.debugLine="Select Case btnConnect.Text";
Debug.ShouldStop(1048576);
switch (BA.switchObjectToInt(acttcpip.mostCurrent._btnconnect.runMethod(true,"getText"),BA.ObjectToString("Connect"),BA.ObjectToString("Disconnect"))) {
case 0: {
 BA.debugLineNum = 87;BA.debugLine="btnConnect.Text = \"Disconnect\"";
Debug.ShouldStop(4194304);
acttcpip.mostCurrent._btnconnect.runMethod(true,"setText",BA.ObjectToCharSequence("Disconnect"));
 BA.debugLineNum = 88;BA.debugLine="Socket1.Initialize(\"Socket1\")";
Debug.ShouldStop(8388608);
acttcpip._socket1.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("Socket1")));
 BA.debugLineNum = 90;BA.debugLine="Socket1.Connect(\"192.168.4.1\",50000,5000)";
Debug.ShouldStop(33554432);
acttcpip._socket1.runVoidMethod ("Connect",acttcpip.processBA,(Object)(BA.ObjectToString("192.168.4.1")),(Object)(BA.numberCast(int.class, 50000)),(Object)(BA.numberCast(int.class, 5000)));
 break; }
case 1: {
 BA.debugLineNum = 92;BA.debugLine="btnConnect.Text = \"Connect\"";
Debug.ShouldStop(134217728);
acttcpip.mostCurrent._btnconnect.runMethod(true,"setText",BA.ObjectToCharSequence("Connect"));
 BA.debugLineNum = 93;BA.debugLine="Socket1.Close";
Debug.ShouldStop(268435456);
acttcpip._socket1.runVoidMethod ("Close");
 break; }
default: {
 break; }
}
;
 BA.debugLineNum = 97;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btntest_click() throws Exception{
try {
		Debug.PushSubsStack("btnTest_Click (acttcpip) ","acttcpip",4,acttcpip.mostCurrent.activityBA,acttcpip.mostCurrent,189);
if (RapidSub.canDelegate("btntest_click")) { com.calypsoinstruments.anemotracker.acttcpip.remoteMe.runUserSub(false, "acttcpip","btntest_click"); return;}
ResumableSub_btnTest_Click rsub = new ResumableSub_btnTest_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnTest_Click extends BA.ResumableSub {
public ResumableSub_btnTest_Click(com.calypsoinstruments.anemotracker.acttcpip parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
com.calypsoinstruments.anemotracker.acttcpip parent;
RemoteObject _cd = RemoteObject.declareNull("anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog");
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _dialogpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _lsn = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _s = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject group11;
int index11;
int groupLen11;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnTest_Click (acttcpip) ","acttcpip",4,acttcpip.mostCurrent.activityBA,acttcpip.mostCurrent,189);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 190;BA.debugLine="isConfigU = True";
Debug.ShouldStop(536870912);
parent._isconfigu = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 191;BA.debugLine="Socket1.Close";
Debug.ShouldStop(1073741824);
parent._socket1.runVoidMethod ("Close");
 BA.debugLineNum = 192;BA.debugLine="Socket1.Initialize(\"Socket1\")";
Debug.ShouldStop(-2147483648);
parent._socket1.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("Socket1")));
 BA.debugLineNum = 194;BA.debugLine="Socket1.Connect(\"192.168.4.1\",8000,5000)";
Debug.ShouldStop(2);
parent._socket1.runVoidMethod ("Connect",acttcpip.processBA,(Object)(BA.ObjectToString("192.168.4.1")),(Object)(BA.numberCast(int.class, 8000)),(Object)(BA.numberCast(int.class, 5000)));
 BA.debugLineNum = 196;BA.debugLine="Dim cd As CustomLayoutDialog";
Debug.ShouldStop(8);
_cd = RemoteObject.createNew ("anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog");Debug.locals.put("cd", _cd);
 BA.debugLineNum = 197;BA.debugLine="Dim sf As Object = cd.ShowAsync(\"Wifi Connect\", \"";
Debug.ShouldStop(16);
_sf = _cd.runMethod(false,"ShowAsync",(Object)(BA.ObjectToString("Wifi Connect")),(Object)(BA.ObjectToString("Yes")),(Object)(BA.ObjectToString("Cancel")),(Object)(BA.ObjectToString("No")),acttcpip.mostCurrent.activityBA,(Object)((parent.mostCurrent.__c.getField(false,"Null"))),(Object)(parent.mostCurrent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 198;BA.debugLine="cd.SetSize(100%x, 400dip)";
Debug.ShouldStop(32);
_cd.runVoidMethod ("SetSize",(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),acttcpip.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 400)))));
 BA.debugLineNum = 199;BA.debugLine="Wait For (sf) Dialog_Ready (DialogPanel As Panel)";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","dialog_ready", acttcpip.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), _sf);
this.state = 9;
return;
case 9:
//C
this.state = 1;
_dialogpanel = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("DialogPanel", _dialogpanel);
;
 BA.debugLineNum = 200;BA.debugLine="DialogPanel.LoadLayout(\"wifi_dlg\")";
Debug.ShouldStop(128);
_dialogpanel.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("wifi_dlg")),acttcpip.mostCurrent.activityBA);
 BA.debugLineNum = 201;BA.debugLine="Dim lsn As List = mls.listSavedNetworks";
Debug.ShouldStop(256);
_lsn = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lsn.setObject(parent.mostCurrent._mls.runMethod(false,"listSavedNetworks"));Debug.locals.put("lsn", _lsn);
 BA.debugLineNum = 202;BA.debugLine="For Each s As String In lsn";
Debug.ShouldStop(512);
if (true) break;

case 1:
//for
this.state = 4;
group11 = _lsn;
index11 = 0;
groupLen11 = group11.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("s", _s);
this.state = 10;
if (true) break;

case 10:
//C
this.state = 4;
if (index11 < groupLen11) {
this.state = 3;
_s = BA.ObjectToString(group11.runMethod(false,"Get",index11));Debug.locals.put("s", _s);}
if (true) break;

case 11:
//C
this.state = 10;
index11++;
Debug.locals.put("s", _s);
if (true) break;

case 3:
//C
this.state = 11;
 BA.debugLineNum = 203;BA.debugLine="sp_wifi.Add(s.SubString2(1,s.IndexOf(\"\"\",\"))) 'n";
Debug.ShouldStop(1024);
parent.mostCurrent._sp_wifi.runVoidMethod ("Add",(Object)(_s.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 1)),(Object)(_s.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("\",")))))));
 if (true) break;
if (true) break;

case 4:
//C
this.state = 5;
Debug.locals.put("s", _s);
;
 BA.debugLineNum = 206;BA.debugLine="Wait For (sf) Dialog_Result (Result As Int)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","dialog_result", acttcpip.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), _sf);
this.state = 12;
return;
case 12:
//C
this.state = 5;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 207;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(16384);
if (true) break;

case 5:
//if
this.state = 8;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 209;BA.debugLine="ap_index = sp_wifi.SelectedIndex";
Debug.ShouldStop(65536);
parent._ap_index = parent.mostCurrent._sp_wifi.runMethod(true,"getSelectedIndex");
 BA.debugLineNum = 210;BA.debugLine="SendData(jsonEdit(sp_wifi.SelectedItem,txt_pass.";
Debug.ShouldStop(131072);
_senddata(_jsonedit(parent.mostCurrent._sp_wifi.runMethod(true,"getSelectedItem"),parent.mostCurrent._txt_pass.runMethod(true,"getText")));
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 214;BA.debugLine="End Sub";
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
public static void  _dialog_ready(RemoteObject _dialogpanel) throws Exception{
}
public static void  _dialog_result(RemoteObject _result) throws Exception{
}
public static RemoteObject  _close_click() throws Exception{
try {
		Debug.PushSubsStack("close_Click (acttcpip) ","acttcpip",4,acttcpip.mostCurrent.activityBA,acttcpip.mostCurrent,216);
if (RapidSub.canDelegate("close_click")) { return com.calypsoinstruments.anemotracker.acttcpip.remoteMe.runUserSub(false, "acttcpip","close_click");}
 BA.debugLineNum = 216;BA.debugLine="Sub close_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 217;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16777216);
acttcpip.mostCurrent._activity.runVoidMethod ("Finish");
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 26;BA.debugLine="Dim lblConnect As Label";
acttcpip.mostCurrent._lblconnect = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Dim btnConnect As Button";
acttcpip.mostCurrent._btnconnect = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Dim lvLog As ListView";
acttcpip.mostCurrent._lvlog = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Dim lblMsg As Label";
acttcpip.mostCurrent._lblmsg = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Dim bmp_background As Bitmap";
acttcpip.mostCurrent._bmp_background = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Dim mls As MLScan";
acttcpip.mostCurrent._mls = RemoteObject.createNew ("wifi.MLwifi.MLWifiScanner");
 //BA.debugLineNum = 34;BA.debugLine="Dim sp_wifi As Spinner";
acttcpip.mostCurrent._sp_wifi = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Dim txt_pass As EditText";
acttcpip.mostCurrent._txt_pass = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Dim ap_index As Int";
acttcpip._ap_index = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 38;BA.debugLine="Dim JSONrcv As JSONParser";
acttcpip.mostCurrent._jsonrcv = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");
 //BA.debugLineNum = 40;BA.debugLine="Dim isConfigU As Boolean = False";
acttcpip._isconfigu = acttcpip.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jsonedit(RemoteObject _cssid,RemoteObject _cpass) throws Exception{
try {
		Debug.PushSubsStack("jsonEdit (acttcpip) ","acttcpip",4,acttcpip.mostCurrent.activityBA,acttcpip.mostCurrent,163);
if (RapidSub.canDelegate("jsonedit")) { return com.calypsoinstruments.anemotracker.acttcpip.remoteMe.runUserSub(false, "acttcpip","jsonedit", _cssid, _cpass);}
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _map1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _jsongenerator = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _str_json = RemoteObject.createImmutable("");
Debug.locals.put("cSSID", _cssid);
Debug.locals.put("cPass", _cpass);
 BA.debugLineNum = 163;BA.debugLine="Sub jsonEdit (cSSID As String, cPass As String) As";
Debug.ShouldStop(4);
 BA.debugLineNum = 164;BA.debugLine="Dim JSON As JSONParser";
Debug.ShouldStop(8);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 165;BA.debugLine="Dim Map1 As Map";
Debug.ShouldStop(16);
_map1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Map1", _map1);
 BA.debugLineNum = 166;BA.debugLine="JSON.Initialize(\"{\"\"essid\"\": \"\"a\"\", \"\"pass\"\": \"\"b";
Debug.ShouldStop(32);
_json.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("{\"essid\": \"a\", \"pass\": \"b\"}")));
 BA.debugLineNum = 167;BA.debugLine="Map1 = JSON.NextObject";
Debug.ShouldStop(64);
_map1 = _json.runMethod(false,"NextObject");Debug.locals.put("Map1", _map1);
 BA.debugLineNum = 168;BA.debugLine="Map1.Put(\"essid\", cSSID)";
Debug.ShouldStop(128);
_map1.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("essid"))),(Object)((_cssid)));
 BA.debugLineNum = 169;BA.debugLine="Map1.Put(\"pass\", cPass)";
Debug.ShouldStop(256);
_map1.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pass"))),(Object)((_cpass)));
 BA.debugLineNum = 172;BA.debugLine="Dim JSONGenerator As JSONGenerator";
Debug.ShouldStop(2048);
_jsongenerator = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSONGenerator", _jsongenerator);
 BA.debugLineNum = 173;BA.debugLine="JSONGenerator.Initialize(Map1)";
Debug.ShouldStop(4096);
_jsongenerator.runVoidMethod ("Initialize",(Object)(_map1));
 BA.debugLineNum = 174;BA.debugLine="Dim str_json As String = JSONGenerator.ToString &";
Debug.ShouldStop(8192);
_str_json = RemoteObject.concat(_jsongenerator.runMethod(true,"ToString"),acttcpip.mostCurrent.__c.getField(true,"CRLF"));Debug.locals.put("str_json", _str_json);Debug.locals.put("str_json", _str_json);
 BA.debugLineNum = 175;BA.debugLine="Msgbox(str_json, \"\")";
Debug.ShouldStop(16384);
acttcpip.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(_str_json)),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),acttcpip.mostCurrent.activityBA);
 BA.debugLineNum = 177;BA.debugLine="Return str_json";
Debug.ShouldStop(65536);
if (true) return _str_json;
 BA.debugLineNum = 178;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Dim Socket1 As Socket";
acttcpip._socket1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.SocketWrapper");
 //BA.debugLineNum = 11;BA.debugLine="Dim ServerSocket1 As ServerSocket";
acttcpip._serversocket1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper");
 //BA.debugLineNum = 13;BA.debugLine="Dim AStreams As AsyncStreams";
acttcpip._astreams = RemoteObject.createNew ("anywheresoftware.b4a.randomaccessfile.AsyncStreams");
 //BA.debugLineNum = 14;BA.debugLine="Dim OutputStream1 As OutputStream";
acttcpip._outputstream1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
 //BA.debugLineNum = 15;BA.debugLine="Dim Conv As ByteConverter";
acttcpip._conv = RemoteObject.createNew ("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");
 //BA.debugLineNum = 16;BA.debugLine="Dim Timer1 As Timer";
acttcpip._timer1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 17;BA.debugLine="Dim MyIP As String";
acttcpip._myip = RemoteObject.createImmutable("");
 //BA.debugLineNum = 18;BA.debugLine="Dim ServerIp As String";
acttcpip._serverip = RemoteObject.createImmutable("");
 //BA.debugLineNum = 19;BA.debugLine="Dim iStr As String 'input string";
acttcpip._istr = RemoteObject.createImmutable("");
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _senddata(RemoteObject _msg) throws Exception{
try {
		Debug.PushSubsStack("SendData (acttcpip) ","acttcpip",4,acttcpip.mostCurrent.activityBA,acttcpip.mostCurrent,180);
if (RapidSub.canDelegate("senddata")) { return com.calypsoinstruments.anemotracker.acttcpip.remoteMe.runUserSub(false, "acttcpip","senddata", _msg);}
RemoteObject _buffer = null;
Debug.locals.put("msg", _msg);
 BA.debugLineNum = 180;BA.debugLine="Sub SendData(msg As String)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 181;BA.debugLine="Dim Buffer() As Byte";
Debug.ShouldStop(1048576);
_buffer = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});Debug.locals.put("Buffer", _buffer);
 BA.debugLineNum = 183;BA.debugLine="Buffer = msg.GetBytes(\"UTF8\")";
Debug.ShouldStop(4194304);
_buffer = _msg.runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")));Debug.locals.put("Buffer", _buffer);
 BA.debugLineNum = 184;BA.debugLine="AStreams.Write(Buffer)";
Debug.ShouldStop(8388608);
acttcpip._astreams.runVoidMethod ("Write",(Object)(_buffer));
 BA.debugLineNum = 185;BA.debugLine="AStreams.Write(Array As Byte(1024))";
Debug.ShouldStop(16777216);
acttcpip._astreams.runVoidMethod ("Write",(Object)(RemoteObject.createNewArray("byte",new int[] {1},new Object[] {BA.numberCast(byte.class, 1024)})));
 BA.debugLineNum = 187;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settiledbackground(RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetTiledBackground (acttcpip) ","acttcpip",4,acttcpip.mostCurrent.activityBA,acttcpip.mostCurrent,65);
if (RapidSub.canDelegate("settiledbackground")) { return com.calypsoinstruments.anemotracker.acttcpip.remoteMe.runUserSub(false, "acttcpip","settiledbackground", _b);}
RemoteObject _bd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
Debug.locals.put("b", _b);
 BA.debugLineNum = 65;BA.debugLine="Sub SetTiledBackground( b As Bitmap)";
Debug.ShouldStop(1);
 BA.debugLineNum = 66;BA.debugLine="Dim bd As BitmapDrawable";
Debug.ShouldStop(2);
_bd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("bd", _bd);
 BA.debugLineNum = 67;BA.debugLine="bd.Initialize(b)";
Debug.ShouldStop(4);
_bd.runVoidMethod ("Initialize",(Object)((_b.getObject())));
 BA.debugLineNum = 69;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(16);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 70;BA.debugLine="r.Target = bd";
Debug.ShouldStop(32);
_r.setField ("Target",(_bd.getObject()));
 BA.debugLineNum = 71;BA.debugLine="r.RunMethod3(\"setTileModeXY\",\"REPEAT\", \"android.g";
Debug.ShouldStop(64);
_r.runVoidMethod ("RunMethod3",(Object)(BA.ObjectToString("setTileModeXY")),(Object)(BA.ObjectToString("REPEAT")),(Object)(BA.ObjectToString("android.graphics.Shader$TileMode")),(Object)(BA.ObjectToString("REPEAT")),(Object)(RemoteObject.createImmutable("android.graphics.Shader$TileMode")));
 BA.debugLineNum = 73;BA.debugLine="Activity.Background = bd";
Debug.ShouldStop(256);
acttcpip.mostCurrent._activity.runMethod(false,"setBackground",(_bd.getObject()));
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _socket1_connected(RemoteObject _connected) throws Exception{
try {
		Debug.PushSubsStack("Socket1_Connected (acttcpip) ","acttcpip",4,acttcpip.mostCurrent.activityBA,acttcpip.mostCurrent,99);
if (RapidSub.canDelegate("socket1_connected")) { return com.calypsoinstruments.anemotracker.acttcpip.remoteMe.runUserSub(false, "acttcpip","socket1_connected", _connected);}
Debug.locals.put("Connected", _connected);
 BA.debugLineNum = 99;BA.debugLine="Sub Socket1_Connected(Connected As Boolean)As Bool";
Debug.ShouldStop(4);
 BA.debugLineNum = 100;BA.debugLine="If Connected = True Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_connected,acttcpip.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 101;BA.debugLine="ToastMessageShow(\"Connected\",True)";
Debug.ShouldStop(16);
acttcpip.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Connected")),(Object)(acttcpip.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 102;BA.debugLine="lvLog.AddSingleLine(\"Connected!\")";
Debug.ShouldStop(32);
acttcpip.mostCurrent._lvlog.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Connected!"))));
 BA.debugLineNum = 103;BA.debugLine="AStreams.Initialize(Socket1.InputStream,Socket1.";
Debug.ShouldStop(64);
acttcpip._astreams.runVoidMethod ("Initialize",acttcpip.processBA,(Object)(acttcpip._socket1.runMethod(false,"getInputStream")),(Object)(acttcpip._socket1.runMethod(false,"getOutputStream")),(Object)(RemoteObject.createImmutable("Astreams")));
 }else {
 BA.debugLineNum = 105;BA.debugLine="ToastMessageShow(\"Server not available\",True)";
Debug.ShouldStop(256);
acttcpip.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Server not available")),(Object)(acttcpip.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 106;BA.debugLine="lvLog.AddSingleLine(\"Server not available\")";
Debug.ShouldStop(512);
acttcpip.mostCurrent._lvlog.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Server not available"))));
 BA.debugLineNum = 107;BA.debugLine="btnConnect.Text = \"Connect\"";
Debug.ShouldStop(1024);
acttcpip.mostCurrent._btnconnect.runMethod(true,"setText",BA.ObjectToCharSequence("Connect"));
 };
 BA.debugLineNum = 109;BA.debugLine="btnConnect.Enabled = True";
Debug.ShouldStop(4096);
acttcpip.mostCurrent._btnconnect.runMethod(true,"setEnabled",acttcpip.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 110;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}