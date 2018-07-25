package com.calypsoinstruments.anemotracker;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class actdevinfo_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (actdevinfo) ","actdevinfo",12,actdevinfo.mostCurrent.activityBA,actdevinfo.mostCurrent,22);
if (RapidSub.canDelegate("activity_create")) { return com.calypsoinstruments.anemotracker.actdevinfo.remoteMe.runUserSub(false, "actdevinfo","activity_create", _firsttime);}
RemoteObject _ac = RemoteObject.declareNull("de.amberhome.objects.appcompat.AppCompatBase");
RemoteObject _dinfo = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _k = RemoteObject.createImmutable("");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 22;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 24;BA.debugLine="Activity.Initialize(\"Activity\")";
Debug.ShouldStop(8388608);
actdevinfo.mostCurrent._activity.runVoidMethod ("Initialize",actdevinfo.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Activity")));
 BA.debugLineNum = 25;BA.debugLine="Activity.Title = \"Information about\"";
Debug.ShouldStop(16777216);
actdevinfo.mostCurrent._activity.runMethod(false,"setTitle",BA.ObjectToCharSequence("Information about"));
 BA.debugLineNum = 27;BA.debugLine="toolbar.Initialize(\"tb\")";
Debug.ShouldStop(67108864);
actdevinfo.mostCurrent._toolbar.runVoidMethod ("Initialize",actdevinfo.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("tb")));
 BA.debugLineNum = 28;BA.debugLine="toolbar.SubTitle = \"\"";
Debug.ShouldStop(134217728);
actdevinfo.mostCurrent._toolbar.runMethod(true,"setSubTitle",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 29;BA.debugLine="toolbar.Title = \"Device Info\"";
Debug.ShouldStop(268435456);
actdevinfo.mostCurrent._toolbar.runMethod(true,"setTitle",BA.ObjectToCharSequence("Device Info"));
 BA.debugLineNum = 30;BA.debugLine="toolbar.SetAsActionBar";
Debug.ShouldStop(536870912);
actdevinfo.mostCurrent._toolbar.runVoidMethod ("SetAsActionBar",actdevinfo.mostCurrent.activityBA);
 BA.debugLineNum = 32;BA.debugLine="toolbar.NavigationIconBitmap = LoadBitmap( File.D";
Debug.ShouldStop(-2147483648);
actdevinfo.mostCurrent._toolbar.runVoidMethod ("setNavigationIconBitmap",(actdevinfo.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(actdevinfo.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("track.png"))).getObject()));
 BA.debugLineNum = 34;BA.debugLine="Dim AC As AppCompat";
Debug.ShouldStop(2);
_ac = RemoteObject.createNew ("de.amberhome.objects.appcompat.AppCompatBase");Debug.locals.put("AC", _ac);
 BA.debugLineNum = 35;BA.debugLine="AC.SetElevation(toolbar, 8dip)";
Debug.ShouldStop(4);
_ac.runVoidMethod ("SetElevation",(Object)((actdevinfo.mostCurrent._toolbar.getObject())),(Object)(BA.numberCast(float.class, actdevinfo.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8))))));
 BA.debugLineNum = 36;BA.debugLine="Activity.AddView( toolbar, 0%x, 0%y, 100%x, 55dip";
Debug.ShouldStop(8);
actdevinfo.mostCurrent._activity.runVoidMethod ("AddView",(Object)((actdevinfo.mostCurrent._toolbar.getObject())),(Object)(actdevinfo.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),actdevinfo.mostCurrent.activityBA)),(Object)(actdevinfo.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 0)),actdevinfo.mostCurrent.activityBA)),(Object)(actdevinfo.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),actdevinfo.mostCurrent.activityBA)),(Object)(actdevinfo.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 55)))));
 BA.debugLineNum = 37;BA.debugLine="clv.Initialize( \"clv\" )";
Debug.ShouldStop(16);
actdevinfo.mostCurrent._clv.runVoidMethod ("Initialize",actdevinfo.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("clv")));
 BA.debugLineNum = 38;BA.debugLine="Activity.AddView( clv, 0%x, 55dip, 100%x,100%y-55";
Debug.ShouldStop(32);
actdevinfo.mostCurrent._activity.runVoidMethod ("AddView",(Object)((actdevinfo.mostCurrent._clv.getObject())),(Object)(actdevinfo.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),actdevinfo.mostCurrent.activityBA)),(Object)(actdevinfo.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 55)))),(Object)(actdevinfo.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),actdevinfo.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {actdevinfo.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),actdevinfo.mostCurrent.activityBA),actdevinfo.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 55)))}, "-",1, 1)));
 BA.debugLineNum = 40;BA.debugLine="close_btn.Initialize(\"close_btn\")";
Debug.ShouldStop(128);
actdevinfo.mostCurrent._close_btn.runVoidMethod ("Initialize",actdevinfo.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("close_btn")));
 BA.debugLineNum = 41;BA.debugLine="Activity.AddView( close_btn, 50dip, Activity.Heig";
Debug.ShouldStop(256);
actdevinfo.mostCurrent._activity.runVoidMethod ("AddView",(Object)((actdevinfo.mostCurrent._close_btn.getObject())),(Object)(actdevinfo.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))),(Object)(RemoteObject.solve(new RemoteObject[] {actdevinfo.mostCurrent._activity.runMethod(true,"getHeight"),actdevinfo.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))}, "-",1, 1)),(Object)(actdevinfo.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))),(Object)(actdevinfo.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 BA.debugLineNum = 42;BA.debugLine="close_btn.Text = \"Close\"";
Debug.ShouldStop(512);
actdevinfo.mostCurrent._close_btn.runMethod(true,"setText",BA.ObjectToCharSequence("Close"));
 BA.debugLineNum = 43;BA.debugLine="close_btn.Gravity = Bit.Or( Gravity.CENTER, Gravi";
Debug.ShouldStop(1024);
actdevinfo.mostCurrent._close_btn.runMethod(true,"setGravity",actdevinfo.mostCurrent.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(actdevinfo.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER")),(Object)(actdevinfo.mostCurrent.__c.getField(false,"Gravity").getField(true,"BOTTOM"))));
 BA.debugLineNum = 44;BA.debugLine="close_btn.Visible = True";
Debug.ShouldStop(2048);
actdevinfo.mostCurrent._close_btn.runMethod(true,"setVisible",actdevinfo.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 46;BA.debugLine="clv.Clear";
Debug.ShouldStop(8192);
actdevinfo.mostCurrent._clv.runVoidMethod ("Clear");
 BA.debugLineNum = 47;BA.debugLine="Dim dInfo As Map = Starter.deviceInfo";
Debug.ShouldStop(16384);
_dinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_dinfo = actdevinfo.mostCurrent._starter._deviceinfo;Debug.locals.put("dInfo", _dinfo);Debug.locals.put("dInfo", _dinfo);
 BA.debugLineNum = 49;BA.debugLine="For Each k As String In dInfo.Keys";
Debug.ShouldStop(65536);
{
final RemoteObject group20 = _dinfo.runMethod(false,"Keys");
final int groupLen20 = group20.runMethod(true,"getSize").<Integer>get()
;int index20 = 0;
;
for (; index20 < groupLen20;index20++){
_k = BA.ObjectToString(group20.runMethod(false,"Get",index20));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 50;BA.debugLine="clv.AddTwoLines(k, dInfo.Get(k))";
Debug.ShouldStop(131072);
actdevinfo.mostCurrent._clv.runVoidMethod ("AddTwoLines",(Object)(BA.ObjectToCharSequence(_k)),(Object)(BA.ObjectToCharSequence(_dinfo.runMethod(false,"Get",(Object)((_k))))));
 BA.debugLineNum = 51;BA.debugLine="clv.TwoLinesLayout.Label.TextColor = Colors.Blac";
Debug.ShouldStop(262144);
actdevinfo.mostCurrent._clv.runMethod(false,"getTwoLinesLayout").getField(false,"Label").runMethod(true,"setTextColor",actdevinfo.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 54;BA.debugLine="clv.visible = True";
Debug.ShouldStop(2097152);
actdevinfo.mostCurrent._clv.runMethod(true,"setVisible",actdevinfo.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 55;BA.debugLine="clv.RequestFocus";
Debug.ShouldStop(4194304);
actdevinfo.mostCurrent._clv.runVoidMethod ("RequestFocus");
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (actdevinfo) ","actdevinfo",12,actdevinfo.mostCurrent.activityBA,actdevinfo.mostCurrent,63);
if (RapidSub.canDelegate("activity_pause")) { return com.calypsoinstruments.anemotracker.actdevinfo.remoteMe.runUserSub(false, "actdevinfo","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 63;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("Activity_Resume (actdevinfo) ","actdevinfo",12,actdevinfo.mostCurrent.activityBA,actdevinfo.mostCurrent,59);
if (RapidSub.canDelegate("activity_resume")) { return com.calypsoinstruments.anemotracker.actdevinfo.remoteMe.runUserSub(false, "actdevinfo","activity_resume");}
 BA.debugLineNum = 59;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _close_btn_click() throws Exception{
try {
		Debug.PushSubsStack("close_btn_Click (actdevinfo) ","actdevinfo",12,actdevinfo.mostCurrent.activityBA,actdevinfo.mostCurrent,75);
if (RapidSub.canDelegate("close_btn_click")) { return com.calypsoinstruments.anemotracker.actdevinfo.remoteMe.runUserSub(false, "actdevinfo","close_btn_click");}
 BA.debugLineNum = 75;BA.debugLine="Sub close_btn_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 76;BA.debugLine="Activity.finish";
Debug.ShouldStop(2048);
actdevinfo.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clv_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("clv_ItemClick (actdevinfo) ","actdevinfo",12,actdevinfo.mostCurrent.activityBA,actdevinfo.mostCurrent,67);
if (RapidSub.canDelegate("clv_itemclick")) { return com.calypsoinstruments.anemotracker.actdevinfo.remoteMe.runUserSub(false, "actdevinfo","clv_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 67;BA.debugLine="Sub clv_ItemClick (Position As Int, Value As Objec";
Debug.ShouldStop(4);
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clv_itemlongclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("clv_ItemLongClick (actdevinfo) ","actdevinfo",12,actdevinfo.mostCurrent.activityBA,actdevinfo.mostCurrent,71);
if (RapidSub.canDelegate("clv_itemlongclick")) { return com.calypsoinstruments.anemotracker.actdevinfo.remoteMe.runUserSub(false, "actdevinfo","clv_itemlongclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("value", _value);
 BA.debugLineNum = 71;BA.debugLine="Sub clv_ItemLongClick( Position As Int, value As O";
Debug.ShouldStop(64);
 BA.debugLineNum = 73;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 17;BA.debugLine="Dim clv As ListView";
actdevinfo.mostCurrent._clv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Dim toolbar As ACToolBarLight";
actdevinfo.mostCurrent._toolbar = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACToolbarLightWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Dim close_btn As Button";
actdevinfo.mostCurrent._close_btn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}