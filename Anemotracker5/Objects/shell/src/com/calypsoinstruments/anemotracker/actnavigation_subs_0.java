package com.calypsoinstruments.anemotracker;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class actnavigation_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (actnavigation) ","actnavigation",3,actnavigation.mostCurrent.activityBA,actnavigation.mostCurrent,28);
if (RapidSub.canDelegate("activity_create")) { return com.calypsoinstruments.anemotracker.actnavigation.remoteMe.runUserSub(false, "actnavigation","activity_create", _firsttime);}
RemoteObject _ac = RemoteObject.declareNull("de.amberhome.objects.appcompat.AppCompatBase");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 28;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 30;BA.debugLine="Activity.LoadLayout(\"actNavigation\")";
Debug.ShouldStop(536870912);
actnavigation.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("actNavigation")),actnavigation.mostCurrent.activityBA);
 BA.debugLineNum = 31;BA.debugLine="Activity.Title = \"New Track\"";
Debug.ShouldStop(1073741824);
actnavigation.mostCurrent._activity.runMethod(false,"setTitle",BA.ObjectToCharSequence("New Track"));
 BA.debugLineNum = 34;BA.debugLine="toolbar.Initialize(\"tb\")";
Debug.ShouldStop(2);
actnavigation.mostCurrent._toolbar.runVoidMethod ("Initialize",actnavigation.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("tb")));
 BA.debugLineNum = 35;BA.debugLine="toolbar.Title = \"New Track\"";
Debug.ShouldStop(4);
actnavigation.mostCurrent._toolbar.runMethod(true,"setTitle",BA.ObjectToCharSequence("New Track"));
 BA.debugLineNum = 36;BA.debugLine="toolbar.SetAsActionBar";
Debug.ShouldStop(8);
actnavigation.mostCurrent._toolbar.runVoidMethod ("SetAsActionBar",actnavigation.mostCurrent.activityBA);
 BA.debugLineNum = 37;BA.debugLine="toolbar.NavigationIconBitmap = LoadBitmap( File.D";
Debug.ShouldStop(16);
actnavigation.mostCurrent._toolbar.runVoidMethod ("setNavigationIconBitmap",(actnavigation.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(actnavigation.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("track.png"))).getObject()));
 BA.debugLineNum = 39;BA.debugLine="Dim AC As AppCompat";
Debug.ShouldStop(64);
_ac = RemoteObject.createNew ("de.amberhome.objects.appcompat.AppCompatBase");Debug.locals.put("AC", _ac);
 BA.debugLineNum = 40;BA.debugLine="AC.SetElevation(toolbar, 8dip)";
Debug.ShouldStop(128);
_ac.runVoidMethod ("SetElevation",(Object)((actnavigation.mostCurrent._toolbar.getObject())),(Object)(BA.numberCast(float.class, actnavigation.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8))))));
 BA.debugLineNum = 42;BA.debugLine="Activity.AddView( toolbar, 0%x, 0%y, 100%x, 55dip";
Debug.ShouldStop(512);
actnavigation.mostCurrent._activity.runVoidMethod ("AddView",(Object)((actnavigation.mostCurrent._toolbar.getObject())),(Object)(actnavigation.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),actnavigation.mostCurrent.activityBA)),(Object)(actnavigation.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 0)),actnavigation.mostCurrent.activityBA)),(Object)(actnavigation.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),actnavigation.mostCurrent.activityBA)),(Object)(actnavigation.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 55)))));
 BA.debugLineNum = 43;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Activity_Pause (actnavigation) ","actnavigation",3,actnavigation.mostCurrent.activityBA,actnavigation.mostCurrent,65);
if (RapidSub.canDelegate("activity_pause")) { return com.calypsoinstruments.anemotracker.actnavigation.remoteMe.runUserSub(false, "actnavigation","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 65;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1);
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("Activity_Resume (actnavigation) ","actnavigation",3,actnavigation.mostCurrent.activityBA,actnavigation.mostCurrent,45);
if (RapidSub.canDelegate("activity_resume")) { return com.calypsoinstruments.anemotracker.actnavigation.remoteMe.runUserSub(false, "actnavigation","activity_resume");}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 45;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(4096);
 BA.debugLineNum = 47;BA.debugLine="If mode = 0 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",actnavigation._mode,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 48;BA.debugLine="toolbar.Title = \"New Track\"";
Debug.ShouldStop(32768);
actnavigation.mostCurrent._toolbar.runMethod(true,"setTitle",BA.ObjectToCharSequence("New Track"));
 BA.debugLineNum = 49;BA.debugLine="btn_init.Text = \"Create\" & CRLF & \"& Init\"";
Debug.ShouldStop(65536);
actnavigation.mostCurrent._btn_init.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Create"),actnavigation.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("& Init"))));
 BA.debugLineNum = 50;BA.debugLine="btn_excel.Visible = False";
Debug.ShouldStop(131072);
actnavigation.mostCurrent._btn_excel.runMethod(true,"setVisible",actnavigation.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 51;BA.debugLine="btn_kml.Visible = False";
Debug.ShouldStop(262144);
actnavigation.mostCurrent._btn_kml.runMethod(true,"setVisible",actnavigation.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 52;BA.debugLine="btn_delete.Visible = False";
Debug.ShouldStop(524288);
actnavigation.mostCurrent._btn_delete.runMethod(true,"setVisible",actnavigation.mostCurrent.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 54;BA.debugLine="Dim m = DBUtils.ExecuteMap( Starter.sql1, \"selec";
Debug.ShouldStop(2097152);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = actnavigation.mostCurrent._dbutils.runMethod(false,"_executemap",actnavigation.mostCurrent.activityBA,(Object)(actnavigation.mostCurrent._starter._sql1),(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from navigation where [id] = "),actnavigation._id)),(Object)((actnavigation.mostCurrent.__c.getField(false,"Null"))));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 55;BA.debugLine="EditText1.Text = m.Get(\"name\" )";
Debug.ShouldStop(4194304);
actnavigation.mostCurrent._edittext1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name"))))));
 BA.debugLineNum = 56;BA.debugLine="EditText2.Text = m.Get(\"description\" )";
Debug.ShouldStop(8388608);
actnavigation.mostCurrent._edittext2.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("description"))))));
 BA.debugLineNum = 57;BA.debugLine="toolbar.Title = \"Edit Track\"";
Debug.ShouldStop(16777216);
actnavigation.mostCurrent._toolbar.runMethod(true,"setTitle",BA.ObjectToCharSequence("Edit Track"));
 BA.debugLineNum = 58;BA.debugLine="btn_init.Text = \"Save\"";
Debug.ShouldStop(33554432);
actnavigation.mostCurrent._btn_init.runMethod(true,"setText",BA.ObjectToCharSequence("Save"));
 BA.debugLineNum = 59;BA.debugLine="btn_excel.Visible = True";
Debug.ShouldStop(67108864);
actnavigation.mostCurrent._btn_excel.runMethod(true,"setVisible",actnavigation.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 60;BA.debugLine="btn_kml.Visible = True";
Debug.ShouldStop(134217728);
actnavigation.mostCurrent._btn_kml.runMethod(true,"setVisible",actnavigation.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 61;BA.debugLine="btn_delete.Visible = True";
Debug.ShouldStop(268435456);
actnavigation.mostCurrent._btn_delete.runMethod(true,"setVisible",actnavigation.mostCurrent.__c.getField(true,"True"));
 };
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
public static RemoteObject  _borrado(RemoteObject _borrar) throws Exception{
try {
		Debug.PushSubsStack("borrado (actnavigation) ","actnavigation",3,actnavigation.mostCurrent.activityBA,actnavigation.mostCurrent,106);
if (RapidSub.canDelegate("borrado")) { return com.calypsoinstruments.anemotracker.actnavigation.remoteMe.runUserSub(false, "actnavigation","borrado", _borrar);}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lista = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _n = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("borrar", _borrar);
 BA.debugLineNum = 106;BA.debugLine="Sub borrado(borrar As Map)";
Debug.ShouldStop(512);
 BA.debugLineNum = 107;BA.debugLine="Dim m As Map";
Debug.ShouldStop(1024);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 109;BA.debugLine="m.Initialize";
Debug.ShouldStop(4096);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 110;BA.debugLine="m.Put(\"id\", DBUtils.DB_INTEGER)";
Debug.ShouldStop(8192);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((actnavigation.mostCurrent._dbutils._db_integer)));
 BA.debugLineNum = 111;BA.debugLine="m.Put(\"name\", DBUtils.DB_TEXT)";
Debug.ShouldStop(16384);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("name"))),(Object)((actnavigation.mostCurrent._dbutils._db_text)));
 BA.debugLineNum = 112;BA.debugLine="m.Put(\"description\", DBUtils.DB_TEXT)";
Debug.ShouldStop(32768);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("description"))),(Object)((actnavigation.mostCurrent._dbutils._db_text)));
 BA.debugLineNum = 113;BA.debugLine="m.Put(\"date_start\", DBUtils.DB_INTEGER)";
Debug.ShouldStop(65536);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("date_start"))),(Object)((actnavigation.mostCurrent._dbutils._db_integer)));
 BA.debugLineNum = 114;BA.debugLine="m.Put(\"boat_id\", DBUtils.DB_INTEGER)";
Debug.ShouldStop(131072);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("boat_id"))),(Object)((actnavigation.mostCurrent._dbutils._db_integer)));
 BA.debugLineNum = 115;BA.debugLine="m.Put(\"e_id\", DBUtils.DB_INTEGER )";
Debug.ShouldStop(262144);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("e_id"))),(Object)((actnavigation.mostCurrent._dbutils._db_integer)));
 BA.debugLineNum = 117;BA.debugLine="Dim l As List";
Debug.ShouldStop(1048576);
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("l", _l);
 BA.debugLineNum = 118;BA.debugLine="l.Initialize";
Debug.ShouldStop(2097152);
_l.runVoidMethod ("Initialize");
 BA.debugLineNum = 119;BA.debugLine="l = DBUtils.ExecuteMemoryMapList( Starter.sql1, \"";
Debug.ShouldStop(4194304);
_l = actnavigation.mostCurrent._dbutils.runMethod(false,"_executememorymaplist",actnavigation.mostCurrent.activityBA,(Object)(actnavigation.mostCurrent._starter._sql1),(Object)(BA.ObjectToString("select * from navigation")),(Object)((actnavigation.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("l", _l);
 BA.debugLineNum = 120;BA.debugLine="DBUtils.DropTable( Starter.sql1, \"navigation\")";
Debug.ShouldStop(8388608);
actnavigation.mostCurrent._dbutils.runVoidMethod ("_droptable",actnavigation.mostCurrent.activityBA,(Object)(actnavigation.mostCurrent._starter._sql1),(Object)(RemoteObject.createImmutable("navigation")));
 BA.debugLineNum = 121;BA.debugLine="DBUtils.CreateTable(Starter.sql1, \"navigation\", m";
Debug.ShouldStop(16777216);
actnavigation.mostCurrent._dbutils.runVoidMethod ("_createtable",actnavigation.mostCurrent.activityBA,(Object)(actnavigation.mostCurrent._starter._sql1),(Object)(BA.ObjectToString("navigation")),(Object)(_m),(Object)(BA.ObjectToString("id")),(Object)(actnavigation.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 122;BA.debugLine="Dim lista As List";
Debug.ShouldStop(33554432);
_lista = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lista", _lista);
 BA.debugLineNum = 123;BA.debugLine="lista.Initialize";
Debug.ShouldStop(67108864);
_lista.runVoidMethod ("Initialize");
 BA.debugLineNum = 124;BA.debugLine="For Each n As Map In l";
Debug.ShouldStop(134217728);
_n = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group16 = _l;
final int groupLen16 = group16.runMethod(true,"getSize").<Integer>get()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_n.setObject(group16.runMethod(false,"Get",index16));
Debug.locals.put("n", _n);
 BA.debugLineNum = 125;BA.debugLine="If n <> borrar Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("!",_n,_borrar)) { 
 BA.debugLineNum = 126;BA.debugLine="lista.Add(n)";
Debug.ShouldStop(536870912);
_lista.runVoidMethod ("Add",(Object)((_n.getObject())));
 };
 }
}Debug.locals.put("n", _n);
;
 BA.debugLineNum = 129;BA.debugLine="DBUtils.InsertMaps(Starter.sql1, \"navigation\", li";
Debug.ShouldStop(1);
actnavigation.mostCurrent._dbutils.runVoidMethod ("_insertmaps",actnavigation.mostCurrent.activityBA,(Object)(actnavigation.mostCurrent._starter._sql1),(Object)(BA.ObjectToString("navigation")),(Object)(_lista));
 BA.debugLineNum = 130;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_cancel_click() throws Exception{
try {
		Debug.PushSubsStack("btn_cancel_Click (actnavigation) ","actnavigation",3,actnavigation.mostCurrent.activityBA,actnavigation.mostCurrent,85);
if (RapidSub.canDelegate("btn_cancel_click")) { return com.calypsoinstruments.anemotracker.actnavigation.remoteMe.runUserSub(false, "actnavigation","btn_cancel_click");}
 BA.debugLineNum = 85;BA.debugLine="Sub btn_cancel_Click ' Cancel";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 86;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2097152);
actnavigation.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 87;BA.debugLine="CallSubDelayed( actListTracks, \"refresh\" )";
Debug.ShouldStop(4194304);
actnavigation.mostCurrent.__c.runVoidMethod ("CallSubDelayed",actnavigation.processBA,(Object)((actnavigation.mostCurrent._actlisttracks.getObject())),(Object)(RemoteObject.createImmutable("refresh")));
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_delete_click() throws Exception{
try {
		Debug.PushSubsStack("btn_delete_Click (actnavigation) ","actnavigation",3,actnavigation.mostCurrent.activityBA,actnavigation.mostCurrent,132);
if (RapidSub.canDelegate("btn_delete_click")) { return com.calypsoinstruments.anemotracker.actnavigation.remoteMe.runUserSub(false, "actnavigation","btn_delete_click");}
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 132;BA.debugLine="Sub btn_delete_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 133;BA.debugLine="Dim result As Int";
Debug.ShouldStop(16);
_result = RemoteObject.createImmutable(0);Debug.locals.put("result", _result);
 BA.debugLineNum = 134;BA.debugLine="Dim m = DBUtils.ExecuteMap( Starter.sql1, \"select";
Debug.ShouldStop(32);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = actnavigation.mostCurrent._dbutils.runMethod(false,"_executemap",actnavigation.mostCurrent.activityBA,(Object)(actnavigation.mostCurrent._starter._sql1),(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from navigation where [id] = "),actnavigation._id)),(Object)((actnavigation.mostCurrent.__c.getField(false,"Null"))));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 136;BA.debugLine="result = Msgbox2( \"Track: \" & m.Get(\"name\" ) & CR";
Debug.ShouldStop(128);
_result = actnavigation.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Track: "),_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))),actnavigation.mostCurrent.__c.getField(true,"CRLF"),_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("description"))))))),(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Delete Track : "),_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))),RemoteObject.createImmutable(" ? ")))),(Object)(BA.ObjectToString("Yes")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((actnavigation.mostCurrent.__c.getField(false,"Null"))),actnavigation.mostCurrent.activityBA);Debug.locals.put("result", _result);
 BA.debugLineNum = 140;BA.debugLine="If result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, actnavigation.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 142;BA.debugLine="DBUtils.DeleteRecordID( Starter.sql1, m.Get(\"id\"";
Debug.ShouldStop(8192);
actnavigation.mostCurrent._dbutils.runVoidMethod ("_deleterecordid",actnavigation.mostCurrent.activityBA,(Object)(actnavigation.mostCurrent._starter._sql1),(Object)(BA.numberCast(int.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))))));
 BA.debugLineNum = 144;BA.debugLine="Activity.Finish";
Debug.ShouldStop(32768);
actnavigation.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 145;BA.debugLine="CallSubDelayed( actListTracks, \"refresh\" )";
Debug.ShouldStop(65536);
actnavigation.mostCurrent.__c.runVoidMethod ("CallSubDelayed",actnavigation.processBA,(Object)((actnavigation.mostCurrent._actlisttracks.getObject())),(Object)(RemoteObject.createImmutable("refresh")));
 };
 BA.debugLineNum = 147;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_excel_click() throws Exception{
try {
		Debug.PushSubsStack("btn_excel_Click (actnavigation) ","actnavigation",3,actnavigation.mostCurrent.activityBA,actnavigation.mostCurrent,149);
if (RapidSub.canDelegate("btn_excel_click")) { return com.calypsoinstruments.anemotracker.actnavigation.remoteMe.runUserSub(false, "actnavigation","btn_excel_click");}
RemoteObject _wb = RemoteObject.declareNull("anywheresoftware.b4a.objects.WorkbookWrapper.WritableWorkbookWrapper");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _rp = RemoteObject.declareNull("anywheresoftware.b4a.objects.RuntimePermissions");
RemoteObject _sh1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.WorkbookWrapper.WritableSheetWrapper");
RemoteObject _c = RemoteObject.declareNull("anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellWrapper");
RemoteObject _cf1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper");
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _cols = null;
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _j = null;
RemoteObject _mf = RemoteObject.createImmutable("");
RemoteObject _intent1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
 BA.debugLineNum = 149;BA.debugLine="Sub btn_excel_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 150;BA.debugLine="Dim WB As WritableWorkbook";
Debug.ShouldStop(2097152);
_wb = RemoteObject.createNew ("anywheresoftware.b4a.objects.WorkbookWrapper.WritableWorkbookWrapper");Debug.locals.put("WB", _wb);
 BA.debugLineNum = 151;BA.debugLine="Dim m = DBUtils.ExecuteMap( Starter.sql1, \"select";
Debug.ShouldStop(4194304);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = actnavigation.mostCurrent._dbutils.runMethod(false,"_executemap",actnavigation.mostCurrent.activityBA,(Object)(actnavigation.mostCurrent._starter._sql1),(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from navigation where [id] = "),actnavigation._id)),(Object)((actnavigation.mostCurrent.__c.getField(false,"Null"))));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 152;BA.debugLine="Private rp As RuntimePermissions";
Debug.ShouldStop(8388608);
_rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");Debug.locals.put("rp", _rp);
 BA.debugLineNum = 153;BA.debugLine="WB.Initialize(rp.GetSafeDirDefaultExternal(\"\") ,";
Debug.ShouldStop(16777216);
_wb.runVoidMethod ("Initialize",(Object)(_rp.runMethod(true,"GetSafeDirDefaultExternal",(Object)(RemoteObject.createImmutable("")))),(Object)(RemoteObject.concat(actnavigation._id,RemoteObject.createImmutable("_"),_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))),RemoteObject.createImmutable(".xls"))));
 BA.debugLineNum = 154;BA.debugLine="Dim sh1 As WritableSheet";
Debug.ShouldStop(33554432);
_sh1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.WorkbookWrapper.WritableSheetWrapper");Debug.locals.put("sh1", _sh1);
 BA.debugLineNum = 155;BA.debugLine="sh1 = WB.AddSheet(m.Get(\"name\"), 0)";
Debug.ShouldStop(67108864);
_sh1 = _wb.runMethod(false,"AddSheet",(Object)(BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))))),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("sh1", _sh1);
 BA.debugLineNum = 156;BA.debugLine="Dim c As WritableCell";
Debug.ShouldStop(134217728);
_c = RemoteObject.createNew ("anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellWrapper");Debug.locals.put("c", _c);
 BA.debugLineNum = 158;BA.debugLine="Dim cf1 As WritableCellFormat";
Debug.ShouldStop(536870912);
_cf1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper");Debug.locals.put("cf1", _cf1);
 BA.debugLineNum = 159;BA.debugLine="cf1.Initialize2(cf1.FONT_ARIAL, 12, True, False,";
Debug.ShouldStop(1073741824);
_cf1.runVoidMethod ("Initialize2",(Object)(_cf1.getField(false,"FONT_ARIAL")),(Object)(BA.numberCast(int.class, 12)),(Object)(actnavigation.mostCurrent.__c.getField(true,"True")),(Object)(actnavigation.mostCurrent.__c.getField(true,"False")),(Object)(actnavigation.mostCurrent.__c.getField(true,"False")),(Object)(_cf1.getField(false,"COLOR_GREEN")));
 BA.debugLineNum = 161;BA.debugLine="cf1.HorizontalAlignment = cf1.HALIGN_CENTRE";
Debug.ShouldStop(1);
_cf1.runVoidMethod ("setHorizontalAlignment",_cf1.getField(false,"HALIGN_CENTRE"));
 BA.debugLineNum = 162;BA.debugLine="cf1.SetBorder(cf1.BORDER_ALL, _ 				  cf1.BORDER_";
Debug.ShouldStop(2);
_cf1.runVoidMethod ("SetBorder",(Object)(_cf1.getField(false,"BORDER_ALL")),(Object)(_cf1.getField(false,"BORDER_STYLE_MEDIUM")),(Object)(_cf1.getField(false,"COLOR_BLACK")));
 BA.debugLineNum = 164;BA.debugLine="cf1.SetBorder(cf1.BORDER_BOTTOM, cf1.BORDER_STYLE";
Debug.ShouldStop(8);
_cf1.runVoidMethod ("SetBorder",(Object)(_cf1.getField(false,"BORDER_BOTTOM")),(Object)(_cf1.getField(false,"BORDER_STYLE_THICK")),(Object)(_cf1.getField(false,"COLOR_BLUE")));
 BA.debugLineNum = 166;BA.debugLine="cf1.VertivalAlignment = cf1.VALIGN_CENTRE";
Debug.ShouldStop(32);
_cf1.runVoidMethod ("setVertivalAlignment",_cf1.getField(false,"VALIGN_CENTRE"));
 BA.debugLineNum = 167;BA.debugLine="cf1.BackgroundColor = cf1.COLOR_GREY_25_PERCENT";
Debug.ShouldStop(64);
_cf1.runVoidMethod ("setBackgroundColor",_cf1.getField(false,"COLOR_GREY_25_PERCENT"));
 BA.debugLineNum = 168;BA.debugLine="Dim i As Int";
Debug.ShouldStop(128);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 171;BA.debugLine="Dim cols() As String = Array As String( \"Id\", \"La";
Debug.ShouldStop(1024);
_cols = RemoteObject.createNewArray("String",new int[] {15},new Object[] {BA.ObjectToString("Id"),BA.ObjectToString("Lat"),BA.ObjectToString("Lon"),BA.ObjectToString("Date"),BA.ObjectToString("AppWindAngle"),BA.ObjectToString("AppWindModulus"),BA.ObjectToString("TrueWindAngle"),BA.ObjectToString("TrueWindModulus"),BA.ObjectToString("Bearing"),BA.ObjectToString("Speed"),BA.ObjectToString("Batt"),BA.ObjectToString("Temp"),BA.ObjectToString("Roll"),BA.ObjectToString("Pitch"),RemoteObject.createImmutable("eCompass")});Debug.locals.put("cols", _cols);Debug.locals.put("cols", _cols);
 BA.debugLineNum = 172;BA.debugLine="For i = 0 To cols.Length - 1";
Debug.ShouldStop(2048);
{
final int step17 = 1;
final int limit17 = RemoteObject.solve(new RemoteObject[] {_cols.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step17 > 0 && _i.<Integer>get().intValue() <= limit17) || (step17 < 0 && _i.<Integer>get().intValue() >= limit17) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step17))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 173;BA.debugLine="sh1.SetColumnWidth(i, 15)";
Debug.ShouldStop(4096);
_sh1.runVoidMethod ("SetColumnWidth",(Object)(_i),(Object)(BA.numberCast(int.class, 15)));
 BA.debugLineNum = 174;BA.debugLine="If i = 3 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 175;BA.debugLine="sh1.SetColumnWidth(i, 25)";
Debug.ShouldStop(16384);
_sh1.runVoidMethod ("SetColumnWidth",(Object)(_i),(Object)(BA.numberCast(int.class, 25)));
 };
 BA.debugLineNum = 177;BA.debugLine="c.InitializeText(i,0, cols(i) )";
Debug.ShouldStop(65536);
_c.runVoidMethod ("InitializeText",(Object)(_i),(Object)(BA.numberCast(int.class, 0)),(Object)(_cols.getArrayElement(true,_i)));
 BA.debugLineNum = 178;BA.debugLine="c.SetCellFormat( cf1 )";
Debug.ShouldStop(131072);
_c.runVoidMethod ("SetCellFormat",(Object)(_cf1));
 BA.debugLineNum = 179;BA.debugLine="sh1.AddCell( c )";
Debug.ShouldStop(262144);
_sh1.runVoidMethod ("AddCell",(Object)((_c.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 182;BA.debugLine="Dim l As List";
Debug.ShouldStop(2097152);
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("l", _l);
 BA.debugLineNum = 183;BA.debugLine="l = DBUtils.ExecuteMemoryTable( Starter.sql1, \"se";
Debug.ShouldStop(4194304);
_l = actnavigation.mostCurrent._dbutils.runMethod(false,"_executememorytable",actnavigation.mostCurrent.activityBA,(Object)(actnavigation.mostCurrent._starter._sql1),(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from route5 where [navigation_id] ="),actnavigation._id)),(Object)((actnavigation.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("l", _l);
 BA.debugLineNum = 184;BA.debugLine="Dim j() As String";
Debug.ShouldStop(8388608);
_j = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("j", _j);
 BA.debugLineNum = 189;BA.debugLine="For i = 0 To l.Size - 1";
Debug.ShouldStop(268435456);
{
final int step29 = 1;
final int limit29 = RemoteObject.solve(new RemoteObject[] {_l.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step29 > 0 && _i.<Integer>get().intValue() <= limit29) || (step29 < 0 && _i.<Integer>get().intValue() >= limit29) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step29))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 190;BA.debugLine="j = l.Get(i)";
Debug.ShouldStop(536870912);
_j = (_l.runMethod(false,"Get",(Object)(_i)));Debug.locals.put("j", _j);
 BA.debugLineNum = 191;BA.debugLine="c.InitializeNumber(0,i+1, j(0) ) ' Id";
Debug.ShouldStop(1073741824);
_c.runVoidMethod ("InitializeNumber",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(BA.numberCast(double.class, _j.getArrayElement(true,BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 192;BA.debugLine="sh1.AddCell(c)";
Debug.ShouldStop(-2147483648);
_sh1.runVoidMethod ("AddCell",(Object)((_c.getObject())));
 BA.debugLineNum = 193;BA.debugLine="c.InitializeNumber(1,i+1, j(2) ) ' Lat";
Debug.ShouldStop(1);
_c.runVoidMethod ("InitializeNumber",(Object)(BA.numberCast(int.class, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(BA.numberCast(double.class, _j.getArrayElement(true,BA.numberCast(int.class, 2)))));
 BA.debugLineNum = 194;BA.debugLine="sh1.AddCell(c)";
Debug.ShouldStop(2);
_sh1.runVoidMethod ("AddCell",(Object)((_c.getObject())));
 BA.debugLineNum = 195;BA.debugLine="c.InitializeNumber(2,i+1, j(3) ) ' Lon";
Debug.ShouldStop(4);
_c.runVoidMethod ("InitializeNumber",(Object)(BA.numberCast(int.class, 2)),(Object)(RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(BA.numberCast(double.class, _j.getArrayElement(true,BA.numberCast(int.class, 3)))));
 BA.debugLineNum = 196;BA.debugLine="sh1.AddCell(c)";
Debug.ShouldStop(8);
_sh1.runVoidMethod ("AddCell",(Object)((_c.getObject())));
 BA.debugLineNum = 197;BA.debugLine="c.InitializeText(3,i+1, DateTime.Date( j(4) ) &";
Debug.ShouldStop(16);
_c.runVoidMethod ("InitializeText",(Object)(BA.numberCast(int.class, 3)),(Object)(RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(RemoteObject.concat(actnavigation.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(BA.numberCast(long.class, _j.getArrayElement(true,BA.numberCast(int.class, 4))))),RemoteObject.createImmutable(" "),actnavigation.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(BA.numberCast(long.class, _j.getArrayElement(true,BA.numberCast(int.class, 4))))))));
 BA.debugLineNum = 198;BA.debugLine="sh1.AddCell(c)";
Debug.ShouldStop(32);
_sh1.runVoidMethod ("AddCell",(Object)((_c.getObject())));
 BA.debugLineNum = 199;BA.debugLine="c.InitializeNumber(4,i+1, j(6) ) ' Awa";
Debug.ShouldStop(64);
_c.runVoidMethod ("InitializeNumber",(Object)(BA.numberCast(int.class, 4)),(Object)(RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(BA.numberCast(double.class, _j.getArrayElement(true,BA.numberCast(int.class, 6)))));
 BA.debugLineNum = 200;BA.debugLine="sh1.AddCell(c)";
Debug.ShouldStop(128);
_sh1.runVoidMethod ("AddCell",(Object)((_c.getObject())));
 BA.debugLineNum = 201;BA.debugLine="c.InitializeNumber(5,i+1, j(7) ) ' Awm";
Debug.ShouldStop(256);
_c.runVoidMethod ("InitializeNumber",(Object)(BA.numberCast(int.class, 5)),(Object)(RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(BA.numberCast(double.class, _j.getArrayElement(true,BA.numberCast(int.class, 7)))));
 BA.debugLineNum = 202;BA.debugLine="sh1.AddCell(c)";
Debug.ShouldStop(512);
_sh1.runVoidMethod ("AddCell",(Object)((_c.getObject())));
 BA.debugLineNum = 203;BA.debugLine="c.InitializeNumber(6,i+1, j(8) ) ' Twa";
Debug.ShouldStop(1024);
_c.runVoidMethod ("InitializeNumber",(Object)(BA.numberCast(int.class, 6)),(Object)(RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(BA.numberCast(double.class, _j.getArrayElement(true,BA.numberCast(int.class, 8)))));
 BA.debugLineNum = 204;BA.debugLine="sh1.AddCell(c)";
Debug.ShouldStop(2048);
_sh1.runVoidMethod ("AddCell",(Object)((_c.getObject())));
 BA.debugLineNum = 205;BA.debugLine="c.InitializeNumber(7,i+1, j(9) ) ' Twm";
Debug.ShouldStop(4096);
_c.runVoidMethod ("InitializeNumber",(Object)(BA.numberCast(int.class, 7)),(Object)(RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(BA.numberCast(double.class, _j.getArrayElement(true,BA.numberCast(int.class, 9)))));
 BA.debugLineNum = 206;BA.debugLine="sh1.AddCell(c)";
Debug.ShouldStop(8192);
_sh1.runVoidMethod ("AddCell",(Object)((_c.getObject())));
 BA.debugLineNum = 207;BA.debugLine="c.InitializeNumber(8,i+1, j(10) ) ' Bearing";
Debug.ShouldStop(16384);
_c.runVoidMethod ("InitializeNumber",(Object)(BA.numberCast(int.class, 8)),(Object)(RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(BA.numberCast(double.class, _j.getArrayElement(true,BA.numberCast(int.class, 10)))));
 BA.debugLineNum = 208;BA.debugLine="sh1.AddCell(c)";
Debug.ShouldStop(32768);
_sh1.runVoidMethod ("AddCell",(Object)((_c.getObject())));
 BA.debugLineNum = 209;BA.debugLine="c.InitializeNumber(9,i+1, j(11) ) ' Speed";
Debug.ShouldStop(65536);
_c.runVoidMethod ("InitializeNumber",(Object)(BA.numberCast(int.class, 9)),(Object)(RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(BA.numberCast(double.class, _j.getArrayElement(true,BA.numberCast(int.class, 11)))));
 BA.debugLineNum = 210;BA.debugLine="sh1.AddCell(c)";
Debug.ShouldStop(131072);
_sh1.runVoidMethod ("AddCell",(Object)((_c.getObject())));
 BA.debugLineNum = 211;BA.debugLine="c.InitializeNumber(10,i+1, j(12) ) ' Battery";
Debug.ShouldStop(262144);
_c.runVoidMethod ("InitializeNumber",(Object)(BA.numberCast(int.class, 10)),(Object)(RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(BA.numberCast(double.class, _j.getArrayElement(true,BA.numberCast(int.class, 12)))));
 BA.debugLineNum = 212;BA.debugLine="sh1.AddCell(c)";
Debug.ShouldStop(524288);
_sh1.runVoidMethod ("AddCell",(Object)((_c.getObject())));
 BA.debugLineNum = 213;BA.debugLine="c.InitializeNumber(11,i+1, j(13) ) ' Temp";
Debug.ShouldStop(1048576);
_c.runVoidMethod ("InitializeNumber",(Object)(BA.numberCast(int.class, 11)),(Object)(RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(BA.numberCast(double.class, _j.getArrayElement(true,BA.numberCast(int.class, 13)))));
 BA.debugLineNum = 214;BA.debugLine="sh1.AddCell(c)";
Debug.ShouldStop(2097152);
_sh1.runVoidMethod ("AddCell",(Object)((_c.getObject())));
 BA.debugLineNum = 215;BA.debugLine="c.InitializeNumber(12,i+1,j(14)) ' Roll";
Debug.ShouldStop(4194304);
_c.runVoidMethod ("InitializeNumber",(Object)(BA.numberCast(int.class, 12)),(Object)(RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(BA.numberCast(double.class, _j.getArrayElement(true,BA.numberCast(int.class, 14)))));
 BA.debugLineNum = 216;BA.debugLine="sh1.AddCell(c)";
Debug.ShouldStop(8388608);
_sh1.runVoidMethod ("AddCell",(Object)((_c.getObject())));
 BA.debugLineNum = 217;BA.debugLine="c.InitializeNumber(13,i+1,j(15)) ' Pitch";
Debug.ShouldStop(16777216);
_c.runVoidMethod ("InitializeNumber",(Object)(BA.numberCast(int.class, 13)),(Object)(RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(BA.numberCast(double.class, _j.getArrayElement(true,BA.numberCast(int.class, 15)))));
 BA.debugLineNum = 218;BA.debugLine="sh1.AddCell(c)";
Debug.ShouldStop(33554432);
_sh1.runVoidMethod ("AddCell",(Object)((_c.getObject())));
 BA.debugLineNum = 219;BA.debugLine="c.InitializeNumber(14, i+1,j(16)) ' Ecompass";
Debug.ShouldStop(67108864);
_c.runVoidMethod ("InitializeNumber",(Object)(BA.numberCast(int.class, 14)),(Object)(RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(BA.numberCast(double.class, _j.getArrayElement(true,BA.numberCast(int.class, 16)))));
 BA.debugLineNum = 220;BA.debugLine="sh1.AddCell(c)";
Debug.ShouldStop(134217728);
_sh1.runVoidMethod ("AddCell",(Object)((_c.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 223;BA.debugLine="WB.Write";
Debug.ShouldStop(1073741824);
_wb.runVoidMethod ("Write");
 BA.debugLineNum = 224;BA.debugLine="WB.Close";
Debug.ShouldStop(-2147483648);
_wb.runVoidMethod ("Close");
 BA.debugLineNum = 226;BA.debugLine="Dim mf As String";
Debug.ShouldStop(2);
_mf = RemoteObject.createImmutable("");Debug.locals.put("mf", _mf);
 BA.debugLineNum = 228;BA.debugLine="mf = \"file://\" & File.Combine(rp.GetSafeDirDefaul";
Debug.ShouldStop(8);
_mf = RemoteObject.concat(RemoteObject.createImmutable("file://"),actnavigation.mostCurrent.__c.getField(false,"File").runMethod(true,"Combine",(Object)(_rp.runMethod(true,"GetSafeDirDefaultExternal",(Object)(RemoteObject.createImmutable("")))),(Object)(RemoteObject.concat(actnavigation._id,RemoteObject.createImmutable("_"),_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))),RemoteObject.createImmutable(".xls")))));Debug.locals.put("mf", _mf);
 BA.debugLineNum = 229;BA.debugLine="Dim intent1 As Intent";
Debug.ShouldStop(16);
_intent1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("intent1", _intent1);
 BA.debugLineNum = 230;BA.debugLine="intent1.Initialize(intent1.ACTION_VIEW, mf)";
Debug.ShouldStop(32);
_intent1.runVoidMethod ("Initialize",(Object)(_intent1.getField(true,"ACTION_VIEW")),(Object)(_mf));
 BA.debugLineNum = 231;BA.debugLine="intent1.SetType(\"application/vnd.ms-excel\")";
Debug.ShouldStop(64);
_intent1.runVoidMethod ("SetType",(Object)(RemoteObject.createImmutable("application/vnd.ms-excel")));
 BA.debugLineNum = 232;BA.debugLine="intent1.WrapAsIntentChooser(\"Choose XLS Viewer\")";
Debug.ShouldStop(128);
_intent1.runVoidMethod ("WrapAsIntentChooser",(Object)(RemoteObject.createImmutable("Choose XLS Viewer")));
 BA.debugLineNum = 233;BA.debugLine="StartActivity(intent1)";
Debug.ShouldStop(256);
actnavigation.mostCurrent.__c.runVoidMethod ("StartActivity",actnavigation.processBA,(Object)((_intent1.getObject())));
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
public static RemoteObject  _btn_init_click() throws Exception{
try {
		Debug.PushSubsStack("btn_init_Click (actnavigation) ","actnavigation",3,actnavigation.mostCurrent.activityBA,actnavigation.mostCurrent,89);
if (RapidSub.canDelegate("btn_init_click")) { return com.calypsoinstruments.anemotracker.actnavigation.remoteMe.runUserSub(false, "actnavigation","btn_init_click");}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 89;BA.debugLine="Sub btn_init_Click ' Init";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 90;BA.debugLine="If mode = 0 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",actnavigation._mode,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 91;BA.debugLine="Starter.b_nav = True";
Debug.ShouldStop(67108864);
actnavigation.mostCurrent._starter._b_nav = actnavigation.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 92;BA.debugLine="CallSubDelayed3(Starter, \"start_nav\", 0, Array A";
Debug.ShouldStop(134217728);
actnavigation.mostCurrent.__c.runVoidMethod ("CallSubDelayed3",actnavigation.processBA,(Object)((actnavigation.mostCurrent._starter.getObject())),(Object)(BA.ObjectToString("start_nav")),(Object)(RemoteObject.createImmutable((0))),(Object)((RemoteObject.createNewArray("String",new int[] {2},new Object[] {actnavigation.mostCurrent._edittext1.runMethod(true,"getText"),actnavigation.mostCurrent._edittext2.runMethod(true,"getText")}))));
 BA.debugLineNum = 93;BA.debugLine="Activity.Finish";
Debug.ShouldStop(268435456);
actnavigation.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 94;BA.debugLine="CallSubDelayed( actListTracks, \"finish\" )";
Debug.ShouldStop(536870912);
actnavigation.mostCurrent.__c.runVoidMethod ("CallSubDelayed",actnavigation.processBA,(Object)((actnavigation.mostCurrent._actlisttracks.getObject())),(Object)(RemoteObject.createImmutable("finish")));
 }else {
 BA.debugLineNum = 96;BA.debugLine="Dim m As Map";
Debug.ShouldStop(-2147483648);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 97;BA.debugLine="m.Initialize";
Debug.ShouldStop(1);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 98;BA.debugLine="m.Put( \"id\", id )";
Debug.ShouldStop(2);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((actnavigation._id)));
 BA.debugLineNum = 99;BA.debugLine="DBUtils.UpdateRecord( Starter.sql1, \"navigation\"";
Debug.ShouldStop(4);
actnavigation.mostCurrent._dbutils.runVoidMethod ("_updaterecord",actnavigation.mostCurrent.activityBA,(Object)(actnavigation.mostCurrent._starter._sql1),(Object)(BA.ObjectToString("navigation")),(Object)(BA.ObjectToString("name")),(Object)((actnavigation.mostCurrent._edittext1.runMethod(true,"getText"))),(Object)(_m));
 BA.debugLineNum = 100;BA.debugLine="DBUtils.UpdateRecord( Starter.sql1, \"navigation\"";
Debug.ShouldStop(8);
actnavigation.mostCurrent._dbutils.runVoidMethod ("_updaterecord",actnavigation.mostCurrent.activityBA,(Object)(actnavigation.mostCurrent._starter._sql1),(Object)(BA.ObjectToString("navigation")),(Object)(BA.ObjectToString("description")),(Object)((actnavigation.mostCurrent._edittext2.runMethod(true,"getText"))),(Object)(_m));
 BA.debugLineNum = 101;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16);
actnavigation.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 102;BA.debugLine="CallSubDelayed( actListTracks, \"refresh\" )";
Debug.ShouldStop(32);
actnavigation.mostCurrent.__c.runVoidMethod ("CallSubDelayed",actnavigation.processBA,(Object)((actnavigation.mostCurrent._actlisttracks.getObject())),(Object)(RemoteObject.createImmutable("refresh")));
 };
 BA.debugLineNum = 104;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_kml_click() throws Exception{
try {
		Debug.PushSubsStack("btn_kml_Click (actnavigation) ","actnavigation",3,actnavigation.mostCurrent.activityBA,actnavigation.mostCurrent,235);
if (RapidSub.canDelegate("btn_kml_click")) { return com.calypsoinstruments.anemotracker.actnavigation.remoteMe.runUserSub(false, "actnavigation","btn_kml_click");}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _track = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _coor = RemoteObject.createImmutable("");
RemoteObject _li = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _n = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _rp = RemoteObject.declareNull("anywheresoftware.b4a.objects.RuntimePermissions");
RemoteObject _mf = RemoteObject.createImmutable("");
RemoteObject _intent1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
 BA.debugLineNum = 235;BA.debugLine="Sub btn_kml_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 236;BA.debugLine="Dim m = DBUtils.ExecuteMap( Starter.sql1, \"select";
Debug.ShouldStop(2048);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = actnavigation.mostCurrent._dbutils.runMethod(false,"_executemap",actnavigation.mostCurrent.activityBA,(Object)(actnavigation.mostCurrent._starter._sql1),(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from navigation where [id] = "),actnavigation._id)),(Object)((actnavigation.mostCurrent.__c.getField(false,"Null"))));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 252;BA.debugLine="Dim sb, track As StringBuilder, coor As String";
Debug.ShouldStop(134217728);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
_track = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("track", _track);
_coor = RemoteObject.createImmutable("");Debug.locals.put("coor", _coor);
 BA.debugLineNum = 253;BA.debugLine="sb.Initialize";
Debug.ShouldStop(268435456);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 254;BA.debugLine="track.Initialize";
Debug.ShouldStop(536870912);
_track.runVoidMethod ("Initialize");
 BA.debugLineNum = 255;BA.debugLine="sb.Append(\"<?xml version=\"& QUOTE & \"1.0\" & QUOTE";
Debug.ShouldStop(1073741824);
_sb.runMethod(false,"Append",(Object)(RemoteObject.concat(RemoteObject.createImmutable("<?xml version="),actnavigation.mostCurrent.__c.getField(true,"QUOTE"),RemoteObject.createImmutable("1.0"),actnavigation.mostCurrent.__c.getField(true,"QUOTE"),RemoteObject.createImmutable(" encoding="),actnavigation.mostCurrent.__c.getField(true,"QUOTE"),RemoteObject.createImmutable("UTF-8"),actnavigation.mostCurrent.__c.getField(true,"QUOTE"),RemoteObject.createImmutable("?>")))).runVoidMethod ("Append",(Object)(actnavigation.mostCurrent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 256;BA.debugLine="sb.Append(\"<kml xmlns=\" & QUOTE & \"http://www.ope";
Debug.ShouldStop(-2147483648);
_sb.runMethod(false,"Append",(Object)(RemoteObject.concat(RemoteObject.createImmutable("<kml xmlns="),actnavigation.mostCurrent.__c.getField(true,"QUOTE"),RemoteObject.createImmutable("http://www.opengis.net/kml/2.2"),actnavigation.mostCurrent.__c.getField(true,"QUOTE"),RemoteObject.createImmutable(">")))).runVoidMethod ("Append",(Object)(actnavigation.mostCurrent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 257;BA.debugLine="sb.Append(\"<Document>\").Append(CRLF)";
Debug.ShouldStop(1);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<Document>"))).runVoidMethod ("Append",(Object)(actnavigation.mostCurrent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 260;BA.debugLine="Dim li As List";
Debug.ShouldStop(8);
_li = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("li", _li);
 BA.debugLineNum = 261;BA.debugLine="li = DBUtils.ExecuteMemoryMapList( Starter.sql1,";
Debug.ShouldStop(16);
_li = actnavigation.mostCurrent._dbutils.runMethod(false,"_executememorymaplist",actnavigation.mostCurrent.activityBA,(Object)(actnavigation.mostCurrent._starter._sql1),(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from route5 where [navigation_id] ="),actnavigation._id)),(Object)((actnavigation.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("li", _li);
 BA.debugLineNum = 263;BA.debugLine="For i = 0 To li.Size - 1";
Debug.ShouldStop(64);
{
final int step10 = 1;
final int limit10 = RemoteObject.solve(new RemoteObject[] {_li.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step10 > 0 && _i <= limit10) || (step10 < 0 && _i >= limit10) ;_i = ((int)(0 + _i + step10))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 264;BA.debugLine="Dim n = li.Get(i) As Map";
Debug.ShouldStop(128);
_n = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_n.setObject(_li.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("n", _n);
 BA.debugLineNum = 266;BA.debugLine="sb.Append(\"<Placemark>\").Append(CRLF)";
Debug.ShouldStop(512);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<Placemark>"))).runVoidMethod ("Append",(Object)(actnavigation.mostCurrent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 267;BA.debugLine="sb.Append(\"<name>\" & n.Get(\"id\") & \"</name>\").";
Debug.ShouldStop(1024);
_sb.runMethod(false,"Append",(Object)(RemoteObject.concat(RemoteObject.createImmutable("<name>"),_n.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))),RemoteObject.createImmutable("</name>")))).runVoidMethod ("Append",(Object)(actnavigation.mostCurrent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 268;BA.debugLine="sb.Append(\"<description>\"& n.Get(\"id\") &\"</des";
Debug.ShouldStop(2048);
_sb.runMethod(false,"Append",(Object)(RemoteObject.concat(RemoteObject.createImmutable("<description>"),_n.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))),RemoteObject.createImmutable("</description>")))).runVoidMethod ("Append",(Object)(actnavigation.mostCurrent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 269;BA.debugLine="sb.Append(\"<ExtendedData>\")";
Debug.ShouldStop(4096);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("<ExtendedData>")));
 BA.debugLineNum = 270;BA.debugLine="sb.Append(\"<Data name=\"\"Id\"\"><value>\"&n.Get(\"i";
Debug.ShouldStop(8192);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.concat(RemoteObject.createImmutable("<Data name=\"Id\"><value>"),_n.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))),RemoteObject.createImmutable("</value></Data>"))));
 BA.debugLineNum = 271;BA.debugLine="sb.Append(\"<Data name=\"\"AppWindAngle\"\"><value>";
Debug.ShouldStop(16384);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.concat(RemoteObject.createImmutable("<Data name=\"AppWindAngle\"><value>"),_n.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("awa")))),RemoteObject.createImmutable("</value></Data>"))));
 BA.debugLineNum = 272;BA.debugLine="sb.Append(\"<Data name=\"\"AppWindModule\"\"><value";
Debug.ShouldStop(32768);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.concat(RemoteObject.createImmutable("<Data name=\"AppWindModule\"><value>"),_n.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("awm")))),RemoteObject.createImmutable("</value></Data>"))));
 BA.debugLineNum = 273;BA.debugLine="sb.Append(\"<Data name=\"\"TrueWindAngle\"\"><value";
Debug.ShouldStop(65536);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.concat(RemoteObject.createImmutable("<Data name=\"TrueWindAngle\"><value>"),_n.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("twa")))),RemoteObject.createImmutable("</value></Data>"))));
 BA.debugLineNum = 274;BA.debugLine="sb.Append(\"<Data name=\"\"TrueWindModule\"\"><valu";
Debug.ShouldStop(131072);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.concat(RemoteObject.createImmutable("<Data name=\"TrueWindModule\"><value>"),_n.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("twm")))),RemoteObject.createImmutable("</value></Data>"))));
 BA.debugLineNum = 275;BA.debugLine="sb.Append(\"<Data name=\"\"Bearing\"\"><value>\"&n.G";
Debug.ShouldStop(262144);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.concat(RemoteObject.createImmutable("<Data name=\"Bearing\"><value>"),_n.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("bearing")))),RemoteObject.createImmutable("</value></Data>"))));
 BA.debugLineNum = 276;BA.debugLine="sb.Append(\"<Data name=\"\"Speed\"\"><value>\"&n.Get";
Debug.ShouldStop(524288);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.concat(RemoteObject.createImmutable("<Data name=\"Speed\"><value>"),_n.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("speed")))),RemoteObject.createImmutable("</value></Data>"))));
 BA.debugLineNum = 278;BA.debugLine="sb.Append(\"<Data name=\"\"Battery\"\"><value>\"&n.Get";
Debug.ShouldStop(2097152);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.concat(RemoteObject.createImmutable("<Data name=\"Battery\"><value>"),_n.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("battery")))),RemoteObject.createImmutable("</value></Data>"))));
 BA.debugLineNum = 279;BA.debugLine="sb.Append(\"<Data name=\"\"Temp\"\"><value>\"&n.Get(\"t";
Debug.ShouldStop(4194304);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.concat(RemoteObject.createImmutable("<Data name=\"Temp\"><value>"),_n.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("temp")))),RemoteObject.createImmutable("</value></Data>"))));
 BA.debugLineNum = 280;BA.debugLine="sb.Append(\"<Data name=\"\"Roll\"\"><value>\"&n.Get(\"r";
Debug.ShouldStop(8388608);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.concat(RemoteObject.createImmutable("<Data name=\"Roll\"><value>"),_n.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("roll")))),RemoteObject.createImmutable("</value></Data>"))));
 BA.debugLineNum = 281;BA.debugLine="sb.Append(\"<Data name=\"\"Pitch\"\"><value>\"&n.Get(\"";
Debug.ShouldStop(16777216);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.concat(RemoteObject.createImmutable("<Data name=\"Pitch\"><value>"),_n.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pitch")))),RemoteObject.createImmutable("</value></Data>"))));
 BA.debugLineNum = 282;BA.debugLine="sb.Append(\"<Data name=\"\"Compass\"\"><value>\"&n.Get";
Debug.ShouldStop(33554432);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.concat(RemoteObject.createImmutable("<Data name=\"Compass\"><value>"),_n.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ecompass")))),RemoteObject.createImmutable("</value></Data>"))));
 BA.debugLineNum = 285;BA.debugLine="sb.Append(\"</ExtendedData>\")";
Debug.ShouldStop(268435456);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("</ExtendedData>")));
 BA.debugLineNum = 286;BA.debugLine="sb.Append(\"<Point>\").Append(CRLF)";
Debug.ShouldStop(536870912);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<Point>"))).runVoidMethod ("Append",(Object)(actnavigation.mostCurrent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 287;BA.debugLine="coor = n.Get(\"lon\") & \",\" & n.Get(\"lat\")   ' L";
Debug.ShouldStop(1073741824);
_coor = RemoteObject.concat(_n.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lon")))),RemoteObject.createImmutable(","),_n.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lat")))));Debug.locals.put("coor", _coor);
 BA.debugLineNum = 288;BA.debugLine="sb.Append(\"<coordinates>\" & coor & \"</coordina";
Debug.ShouldStop(-2147483648);
_sb.runMethod(false,"Append",(Object)(RemoteObject.concat(RemoteObject.createImmutable("<coordinates>"),_coor,RemoteObject.createImmutable("</coordinates>")))).runVoidMethod ("Append",(Object)(actnavigation.mostCurrent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 289;BA.debugLine="sb.Append(\"</Point>\").Append(CRLF)";
Debug.ShouldStop(1);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("</Point>"))).runVoidMethod ("Append",(Object)(actnavigation.mostCurrent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 290;BA.debugLine="sb.Append(\"</Placemark>\").Append(CRLF)";
Debug.ShouldStop(2);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("</Placemark>"))).runVoidMethod ("Append",(Object)(actnavigation.mostCurrent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 292;BA.debugLine="track.Append(coor).Append(\",0\").Append(CRLF)";
Debug.ShouldStop(8);
_track.runMethod(false,"Append",(Object)(_coor)).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(",0"))).runVoidMethod ("Append",(Object)(actnavigation.mostCurrent.__c.getField(true,"CRLF")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 295;BA.debugLine="sb.Append(\"<Placemark>\").Append(CRLF)";
Debug.ShouldStop(64);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<Placemark>"))).runVoidMethod ("Append",(Object)(actnavigation.mostCurrent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 296;BA.debugLine="sb.Append(\"<name>\" & \"Track\" & \"</name>\").Append(";
Debug.ShouldStop(128);
_sb.runMethod(false,"Append",(Object)(RemoteObject.concat(RemoteObject.createImmutable("<name>"),RemoteObject.createImmutable("Track"),RemoteObject.createImmutable("</name>")))).runVoidMethod ("Append",(Object)(actnavigation.mostCurrent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 297;BA.debugLine="sb.Append(\"<description></description>\").Append(C";
Debug.ShouldStop(256);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<description></description>"))).runVoidMethod ("Append",(Object)(actnavigation.mostCurrent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 298;BA.debugLine="sb.Append(\"<LineString>\").Append(CRLF)";
Debug.ShouldStop(512);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<LineString>"))).runVoidMethod ("Append",(Object)(actnavigation.mostCurrent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 299;BA.debugLine="sb.Append(\"<tessellate>1</tessellate>\").Append(CR";
Debug.ShouldStop(1024);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<tessellate>1</tessellate>"))).runVoidMethod ("Append",(Object)(actnavigation.mostCurrent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 301;BA.debugLine="sb.Append(\"<coordinates>\" & track.ToString & \"</c";
Debug.ShouldStop(4096);
_sb.runMethod(false,"Append",(Object)(RemoteObject.concat(RemoteObject.createImmutable("<coordinates>"),_track.runMethod(true,"ToString"),RemoteObject.createImmutable("</coordinates>")))).runVoidMethod ("Append",(Object)(actnavigation.mostCurrent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 303;BA.debugLine="sb.Append(\"</LineString>\").Append(CRLF)";
Debug.ShouldStop(16384);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("</LineString>"))).runVoidMethod ("Append",(Object)(actnavigation.mostCurrent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 304;BA.debugLine="sb.Append(\"</Placemark>\").Append(CRLF)";
Debug.ShouldStop(32768);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("</Placemark>"))).runVoidMethod ("Append",(Object)(actnavigation.mostCurrent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 305;BA.debugLine="sb.Append(\"</Document>\").Append(CRLF)";
Debug.ShouldStop(65536);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("</Document>"))).runVoidMethod ("Append",(Object)(actnavigation.mostCurrent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 306;BA.debugLine="sb.Append(\"</kml>\").Append(CRLF)";
Debug.ShouldStop(131072);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("</kml>"))).runVoidMethod ("Append",(Object)(actnavigation.mostCurrent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 308;BA.debugLine="Dim rp As RuntimePermissions";
Debug.ShouldStop(524288);
_rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");Debug.locals.put("rp", _rp);
 BA.debugLineNum = 309;BA.debugLine="File.WriteString(rp.GetSafeDirDefaultExternal(\"\")";
Debug.ShouldStop(1048576);
actnavigation.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(_rp.runMethod(true,"GetSafeDirDefaultExternal",(Object)(RemoteObject.createImmutable("")))),(Object)(RemoteObject.concat(actnavigation._id,RemoteObject.createImmutable("_"),_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))),RemoteObject.createImmutable(".kml"))),(Object)(_sb.runMethod(true,"ToString")));
 BA.debugLineNum = 311;BA.debugLine="Dim mf As String";
Debug.ShouldStop(4194304);
_mf = RemoteObject.createImmutable("");Debug.locals.put("mf", _mf);
 BA.debugLineNum = 312;BA.debugLine="mf = \"file://\" & File.Combine(rp.GetSafeDirDefaul";
Debug.ShouldStop(8388608);
_mf = RemoteObject.concat(RemoteObject.createImmutable("file://"),actnavigation.mostCurrent.__c.getField(false,"File").runMethod(true,"Combine",(Object)(_rp.runMethod(true,"GetSafeDirDefaultExternal",(Object)(RemoteObject.createImmutable("")))),(Object)(RemoteObject.concat(actnavigation._id,RemoteObject.createImmutable("_"),_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))),RemoteObject.createImmutable(".kml")))));Debug.locals.put("mf", _mf);
 BA.debugLineNum = 313;BA.debugLine="Dim intent1 As Intent";
Debug.ShouldStop(16777216);
_intent1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("intent1", _intent1);
 BA.debugLineNum = 314;BA.debugLine="intent1.Initialize(intent1.ACTION_VIEW, mf)";
Debug.ShouldStop(33554432);
_intent1.runVoidMethod ("Initialize",(Object)(_intent1.getField(true,"ACTION_VIEW")),(Object)(_mf));
 BA.debugLineNum = 315;BA.debugLine="intent1.SetType(\"application/vnd.google-earth.kml";
Debug.ShouldStop(67108864);
_intent1.runVoidMethod ("SetType",(Object)(RemoteObject.createImmutable("application/vnd.google-earth.kml+xml")));
 BA.debugLineNum = 316;BA.debugLine="intent1.WrapAsIntentChooser(\"Choose KML Viewer\")";
Debug.ShouldStop(134217728);
_intent1.runVoidMethod ("WrapAsIntentChooser",(Object)(RemoteObject.createImmutable("Choose KML Viewer")));
 BA.debugLineNum = 317;BA.debugLine="StartActivity(intent1)";
Debug.ShouldStop(268435456);
actnavigation.mostCurrent.__c.runVoidMethod ("StartActivity",actnavigation.processBA,(Object)((_intent1.getObject())));
 BA.debugLineNum = 318;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
 //BA.debugLineNum = 18;BA.debugLine="Dim EditText1, EditText2 As EditText";
actnavigation.mostCurrent._edittext1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
actnavigation.mostCurrent._edittext2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private btn_init As Button";
actnavigation.mostCurrent._btn_init = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private btn_cancel As Button";
actnavigation.mostCurrent._btn_cancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private btn_delete As Button";
actnavigation.mostCurrent._btn_delete = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private btn_excel As Button";
actnavigation.mostCurrent._btn_excel = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private btn_kml As Button";
actnavigation.mostCurrent._btn_kml = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Dim toolbar As ACToolBarLight";
actnavigation.mostCurrent._toolbar = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACToolbarLightWrapper");
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Dim mode=0 As Int";
actnavigation._mode = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 11;BA.debugLine="Dim id As Int";
actnavigation._id = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _start(RemoteObject _tipo,RemoteObject _id1) throws Exception{
try {
		Debug.PushSubsStack("Start (actnavigation) ","actnavigation",3,actnavigation.mostCurrent.activityBA,actnavigation.mostCurrent,69);
if (RapidSub.canDelegate("start")) { return com.calypsoinstruments.anemotracker.actnavigation.remoteMe.runUserSub(false, "actnavigation","start", _tipo, _id1);}
Debug.locals.put("tipo", _tipo);
Debug.locals.put("id1", _id1);
 BA.debugLineNum = 69;BA.debugLine="Sub Start( tipo As String, id1 As Int )";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="id = id1";
Debug.ShouldStop(32);
actnavigation._id = _id1;
 BA.debugLineNum = 71;BA.debugLine="If tipo = \"add\" Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_tipo,BA.ObjectToString("add"))) { 
 BA.debugLineNum = 72;BA.debugLine="mode = 0";
Debug.ShouldStop(128);
actnavigation._mode = BA.numberCast(int.class, 0);
 }else 
{ BA.debugLineNum = 73;BA.debugLine="Else If tipo = \"edit\" Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_tipo,BA.ObjectToString("edit"))) { 
 BA.debugLineNum = 74;BA.debugLine="mode = 1";
Debug.ShouldStop(512);
actnavigation._mode = BA.numberCast(int.class, 1);
 }}
;
 BA.debugLineNum = 76;BA.debugLine="Activity_Resume";
Debug.ShouldStop(2048);
_activity_resume();
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
}