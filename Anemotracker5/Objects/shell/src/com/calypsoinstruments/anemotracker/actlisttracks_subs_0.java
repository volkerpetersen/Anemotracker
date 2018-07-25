package com.calypsoinstruments.anemotracker;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class actlisttracks_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (actlisttracks) ","actlisttracks",2,actlisttracks.mostCurrent.activityBA,actlisttracks.mostCurrent,24);
if (RapidSub.canDelegate("activity_create")) { return com.calypsoinstruments.anemotracker.actlisttracks.remoteMe.runUserSub(false, "actlisttracks","activity_create", _firsttime);}
RemoteObject _xml = RemoteObject.declareNull("anywheresoftware.b4a.object.XmlLayoutBuilder");
RemoteObject _ac = RemoteObject.declareNull("de.amberhome.objects.appcompat.AppCompatBase");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 24;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 29;BA.debugLine="Dim xml As XmlLayoutBuilder";
Debug.ShouldStop(268435456);
_xml = RemoteObject.createNew ("anywheresoftware.b4a.object.XmlLayoutBuilder");Debug.locals.put("xml", _xml);
 BA.debugLineNum = 30;BA.debugLine="Activity.Initialize(\"Activity\")";
Debug.ShouldStop(536870912);
actlisttracks.mostCurrent._activity.runVoidMethod ("Initialize",actlisttracks.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Activity")));
 BA.debugLineNum = 31;BA.debugLine="Activity.Title = \"Add/Select Track or Long Press\"";
Debug.ShouldStop(1073741824);
actlisttracks.mostCurrent._activity.runMethod(false,"setTitle",BA.ObjectToCharSequence("Add/Select Track or Long Press"));
 BA.debugLineNum = 33;BA.debugLine="toolbar.Initialize(\"tb\")";
Debug.ShouldStop(1);
actlisttracks.mostCurrent._toolbar.runVoidMethod ("Initialize",actlisttracks.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("tb")));
 BA.debugLineNum = 34;BA.debugLine="toolbar.SubTitle = \"Add/Select Track or Long Pres";
Debug.ShouldStop(2);
actlisttracks.mostCurrent._toolbar.runMethod(true,"setSubTitle",BA.ObjectToCharSequence("Add/Select Track or Long Press"));
 BA.debugLineNum = 35;BA.debugLine="toolbar.Title = \"Track\"";
Debug.ShouldStop(4);
actlisttracks.mostCurrent._toolbar.runMethod(true,"setTitle",BA.ObjectToCharSequence("Track"));
 BA.debugLineNum = 36;BA.debugLine="toolbar.SetAsActionBar";
Debug.ShouldStop(8);
actlisttracks.mostCurrent._toolbar.runVoidMethod ("SetAsActionBar",actlisttracks.mostCurrent.activityBA);
 BA.debugLineNum = 38;BA.debugLine="toolbar.NavigationIconBitmap = LoadBitmap( File.D";
Debug.ShouldStop(32);
actlisttracks.mostCurrent._toolbar.runVoidMethod ("setNavigationIconBitmap",(actlisttracks.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(actlisttracks.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("track.png"))).getObject()));
 BA.debugLineNum = 40;BA.debugLine="Dim AC As AppCompat";
Debug.ShouldStop(128);
_ac = RemoteObject.createNew ("de.amberhome.objects.appcompat.AppCompatBase");Debug.locals.put("AC", _ac);
 BA.debugLineNum = 41;BA.debugLine="AC.SetElevation(toolbar, 8dip)";
Debug.ShouldStop(256);
_ac.runVoidMethod ("SetElevation",(Object)((actlisttracks.mostCurrent._toolbar.getObject())),(Object)(BA.numberCast(float.class, actlisttracks.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8))))));
 BA.debugLineNum = 43;BA.debugLine="Activity.AddView( toolbar, 0%x, 0%y, 100%x, 55dip";
Debug.ShouldStop(1024);
actlisttracks.mostCurrent._activity.runVoidMethod ("AddView",(Object)((actlisttracks.mostCurrent._toolbar.getObject())),(Object)(actlisttracks.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),actlisttracks.mostCurrent.activityBA)),(Object)(actlisttracks.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 0)),actlisttracks.mostCurrent.activityBA)),(Object)(actlisttracks.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),actlisttracks.mostCurrent.activityBA)),(Object)(actlisttracks.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 55)))));
 BA.debugLineNum = 45;BA.debugLine="clv.Initialize( \"clv\" )";
Debug.ShouldStop(4096);
actlisttracks.mostCurrent._clv.runVoidMethod ("Initialize",actlisttracks.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("clv")));
 BA.debugLineNum = 46;BA.debugLine="Activity.AddView( clv, 0%x, 55dip, 100%x,100%y-55";
Debug.ShouldStop(8192);
actlisttracks.mostCurrent._activity.runVoidMethod ("AddView",(Object)((actlisttracks.mostCurrent._clv.getObject())),(Object)(actlisttracks.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),actlisttracks.mostCurrent.activityBA)),(Object)(actlisttracks.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 55)))),(Object)(actlisttracks.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),actlisttracks.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {actlisttracks.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),actlisttracks.mostCurrent.activityBA),actlisttracks.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 55)))}, "-",1, 1)));
 BA.debugLineNum = 50;BA.debugLine="fab1.Initialize( \"Fab1\" )";
Debug.ShouldStop(131072);
actlisttracks.mostCurrent._fab1.runVoidMethod ("Initialize",actlisttracks.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Fab1")));
 BA.debugLineNum = 51;BA.debugLine="Activity.AddView( fab1, Activity.Width-70dip, Act";
Debug.ShouldStop(262144);
actlisttracks.mostCurrent._activity.runVoidMethod ("AddView",(Object)((actlisttracks.mostCurrent._fab1.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {actlisttracks.mostCurrent._activity.runMethod(true,"getWidth"),actlisttracks.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 70)))}, "-",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {actlisttracks.mostCurrent._activity.runMethod(true,"getHeight"),actlisttracks.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 70)))}, "-",1, 1)),(Object)(actlisttracks.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 55)))),(Object)(actlisttracks.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 55)))));
 BA.debugLineNum = 53;BA.debugLine="fab1.SetIcon( xml.GetDrawable(\"ic_add_white_24dp\"";
Debug.ShouldStop(1048576);
actlisttracks.mostCurrent._fab1.runVoidMethod ("SetIcon",(Object)(_xml.runMethod(false,"GetDrawable",(Object)(RemoteObject.createImmutable("ic_add_white_24dp")))));
 BA.debugLineNum = 58;BA.debugLine="refresh";
Debug.ShouldStop(33554432);
_refresh();
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("Activity_Pause (actlisttracks) ","actlisttracks",2,actlisttracks.mostCurrent.activityBA,actlisttracks.mostCurrent,66);
if (RapidSub.canDelegate("activity_pause")) { return com.calypsoinstruments.anemotracker.actlisttracks.remoteMe.runUserSub(false, "actlisttracks","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 66;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(2);
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("Activity_Resume (actlisttracks) ","actlisttracks",2,actlisttracks.mostCurrent.activityBA,actlisttracks.mostCurrent,62);
if (RapidSub.canDelegate("activity_resume")) { return com.calypsoinstruments.anemotracker.actlisttracks.remoteMe.runUserSub(false, "actlisttracks","activity_resume");}
 BA.debugLineNum = 62;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _add_track_click() throws Exception{
try {
		Debug.PushSubsStack("add_track_Click (actlisttracks) ","actlisttracks",2,actlisttracks.mostCurrent.activityBA,actlisttracks.mostCurrent,94);
if (RapidSub.canDelegate("add_track_click")) { return com.calypsoinstruments.anemotracker.actlisttracks.remoteMe.runUserSub(false, "actlisttracks","add_track_click");}
 BA.debugLineNum = 94;BA.debugLine="Sub add_track_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 95;BA.debugLine="CallSubDelayed3( actNavigation, \"Start\", \"add\", 0";
Debug.ShouldStop(1073741824);
actlisttracks.mostCurrent.__c.runVoidMethod ("CallSubDelayed3",actlisttracks.processBA,(Object)((actlisttracks.mostCurrent._actnavigation.getObject())),(Object)(BA.ObjectToString("Start")),(Object)(RemoteObject.createImmutable(("add"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 96;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("clv_ItemClick (actlisttracks) ","actlisttracks",2,actlisttracks.mostCurrent.activityBA,actlisttracks.mostCurrent,70);
if (RapidSub.canDelegate("clv_itemclick")) { return com.calypsoinstruments.anemotracker.actlisttracks.remoteMe.runUserSub(false, "actlisttracks","clv_itemclick", _position, _value);}
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _id = RemoteObject.createImmutable(0);
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 70;BA.debugLine="Sub clv_ItemClick (Position As Int, Value As Objec";
Debug.ShouldStop(32);
 BA.debugLineNum = 71;BA.debugLine="Dim result As Int";
Debug.ShouldStop(64);
_result = RemoteObject.createImmutable(0);Debug.locals.put("result", _result);
 BA.debugLineNum = 72;BA.debugLine="Dim m = DBUtils.ExecuteMap( Starter.sql1, \"sel";
Debug.ShouldStop(128);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = actlisttracks.mostCurrent._dbutils.runMethod(false,"_executemap",actlisttracks.mostCurrent.activityBA,(Object)(actlisttracks.mostCurrent._starter._sql1),(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from navigation where [id] = "),_value)),(Object)((actlisttracks.mostCurrent.__c.getField(false,"Null"))));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 74;BA.debugLine="result = Msgbox2( \"Track: \" & m.Get(\"name\" ) & CR";
Debug.ShouldStop(512);
_result = actlisttracks.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Track: "),_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))),actlisttracks.mostCurrent.__c.getField(true,"CRLF"),_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("description"))))))),(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Continue Track : "),_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))),RemoteObject.createImmutable(" ? ")))),(Object)(BA.ObjectToString("Yes")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((actlisttracks.mostCurrent.__c.getField(false,"Null"))),actlisttracks.mostCurrent.activityBA);Debug.locals.put("result", _result);
 BA.debugLineNum = 78;BA.debugLine="If result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, actlisttracks.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 79;BA.debugLine="Dim id = Value As Int";
Debug.ShouldStop(16384);
_id = BA.numberCast(int.class, _value);Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 80;BA.debugLine="CallSubDelayed3( Starter, \"start_nav\", id, Array";
Debug.ShouldStop(32768);
actlisttracks.mostCurrent.__c.runVoidMethod ("CallSubDelayed3",actlisttracks.processBA,(Object)((actlisttracks.mostCurrent._starter.getObject())),(Object)(BA.ObjectToString("start_nav")),(Object)((_id)),(Object)((RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString(actlisttracks.mostCurrent.__c.getField(false,"Null")),BA.ObjectToString(actlisttracks.mostCurrent.__c.getField(false,"Null"))}))));
 BA.debugLineNum = 81;BA.debugLine="Activity.finish";
Debug.ShouldStop(65536);
actlisttracks.mostCurrent._activity.runVoidMethod ("Finish");
 }else {
 };
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
public static RemoteObject  _clv_itemlongclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("clv_ItemLongClick (actlisttracks) ","actlisttracks",2,actlisttracks.mostCurrent.activityBA,actlisttracks.mostCurrent,89);
if (RapidSub.canDelegate("clv_itemlongclick")) { return com.calypsoinstruments.anemotracker.actlisttracks.remoteMe.runUserSub(false, "actlisttracks","clv_itemlongclick", _position, _value);}
RemoteObject _id = RemoteObject.createImmutable(0);
Debug.locals.put("Position", _position);
Debug.locals.put("value", _value);
 BA.debugLineNum = 89;BA.debugLine="Sub clv_ItemLongClick( Position As Int, value As O";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 90;BA.debugLine="Dim id = value As Int";
Debug.ShouldStop(33554432);
_id = BA.numberCast(int.class, _value);Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 91;BA.debugLine="CallSubDelayed3( actNavigation, \"Start\", \"edit\",";
Debug.ShouldStop(67108864);
actlisttracks.mostCurrent.__c.runVoidMethod ("CallSubDelayed3",actlisttracks.processBA,(Object)((actlisttracks.mostCurrent._actnavigation.getObject())),(Object)(BA.ObjectToString("Start")),(Object)(RemoteObject.createImmutable(("edit"))),(Object)((_id)));
 BA.debugLineNum = 92;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("Fab1_Click (actlisttracks) ","actlisttracks",2,actlisttracks.mostCurrent.activityBA,actlisttracks.mostCurrent,97);
if (RapidSub.canDelegate("fab1_click")) { return com.calypsoinstruments.anemotracker.actlisttracks.remoteMe.runUserSub(false, "actlisttracks","fab1_click");}
 BA.debugLineNum = 97;BA.debugLine="Sub Fab1_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 98;BA.debugLine="add_track_Click";
Debug.ShouldStop(2);
_add_track_click();
 BA.debugLineNum = 99;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _finish() throws Exception{
try {
		Debug.PushSubsStack("finish (actlisttracks) ","actlisttracks",2,actlisttracks.mostCurrent.activityBA,actlisttracks.mostCurrent,122);
if (RapidSub.canDelegate("finish")) { return com.calypsoinstruments.anemotracker.actlisttracks.remoteMe.runUserSub(false, "actlisttracks","finish");}
 BA.debugLineNum = 122;BA.debugLine="Sub finish";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 123;BA.debugLine="Activity.finish";
Debug.ShouldStop(67108864);
actlisttracks.mostCurrent._activity.runVoidMethod ("Finish");
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 18;BA.debugLine="Dim clv As ListView";
actlisttracks.mostCurrent._clv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private fab1 As DSFloatingActionButton";
actlisttracks.mostCurrent._fab1 = RemoteObject.createNew ("de.amberhome.objects.FloatingActionButtonWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Dim toolbar As ACToolBarLight";
actlisttracks.mostCurrent._toolbar = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACToolbarLightWrapper");
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 9;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _refresh() throws Exception{
try {
		Debug.PushSubsStack("refresh (actlisttracks) ","actlisttracks",2,actlisttracks.mostCurrent.activityBA,actlisttracks.mostCurrent,100);
if (RapidSub.canDelegate("refresh")) { return com.calypsoinstruments.anemotracker.actlisttracks.remoteMe.runUserSub(false, "actlisttracks","refresh");}
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _j = null;
RemoteObject _i = RemoteObject.createImmutable(0);
 BA.debugLineNum = 100;BA.debugLine="Sub refresh";
Debug.ShouldStop(8);
 BA.debugLineNum = 101;BA.debugLine="clv.Clear";
Debug.ShouldStop(16);
actlisttracks.mostCurrent._clv.runVoidMethod ("Clear");
 BA.debugLineNum = 103;BA.debugLine="Dim l As List";
Debug.ShouldStop(64);
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("l", _l);
 BA.debugLineNum = 104;BA.debugLine="l = DBUtils.ExecuteMemoryTable( Starter.sql1, \"se";
Debug.ShouldStop(128);
_l = actlisttracks.mostCurrent._dbutils.runMethod(false,"_executememorytable",actlisttracks.mostCurrent.activityBA,(Object)(actlisttracks.mostCurrent._starter._sql1),(Object)(BA.ObjectToString("select * from navigation")),(Object)((actlisttracks.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("l", _l);
 BA.debugLineNum = 106;BA.debugLine="Dim j() As String";
Debug.ShouldStop(512);
_j = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("j", _j);
 BA.debugLineNum = 107;BA.debugLine="Dim i As Int";
Debug.ShouldStop(1024);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 108;BA.debugLine="For i = 0 To l.Size - 1";
Debug.ShouldStop(2048);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_l.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step6 > 0 && _i.<Integer>get().intValue() <= limit6) || (step6 < 0 && _i.<Integer>get().intValue() >= limit6) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 109;BA.debugLine="j = l.Get(i)";
Debug.ShouldStop(4096);
_j = (_l.runMethod(false,"Get",(Object)(_i)));Debug.locals.put("j", _j);
 BA.debugLineNum = 110;BA.debugLine="clv.AddTwoLines2( j(1), j(2), j(0) )";
Debug.ShouldStop(8192);
actlisttracks.mostCurrent._clv.runVoidMethod ("AddTwoLines2",(Object)(BA.ObjectToCharSequence(_j.getArrayElement(true,BA.numberCast(int.class, 1)))),(Object)(BA.ObjectToCharSequence(_j.getArrayElement(true,BA.numberCast(int.class, 2)))),(Object)((_j.getArrayElement(true,BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 111;BA.debugLine="clv.TwoLinesLayout.Label.TextColor = Colors.Blac";
Debug.ShouldStop(16384);
actlisttracks.mostCurrent._clv.runMethod(false,"getTwoLinesLayout").getField(false,"Label").runMethod(true,"setTextColor",actlisttracks.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 118;BA.debugLine="clv.visible = True";
Debug.ShouldStop(2097152);
actlisttracks.mostCurrent._clv.runMethod(true,"setVisible",actlisttracks.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 119;BA.debugLine="clv.RequestFocus";
Debug.ShouldStop(4194304);
actlisttracks.mostCurrent._clv.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 120;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}