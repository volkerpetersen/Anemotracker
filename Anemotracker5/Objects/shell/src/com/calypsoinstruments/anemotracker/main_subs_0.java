package com.calypsoinstruments.anemotracker;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _acbutton1_click() throws Exception{
try {
		Debug.PushSubsStack("ACButton1_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,854);
if (RapidSub.canDelegate("acbutton1_click")) { return com.calypsoinstruments.anemotracker.main.remoteMe.runUserSub(false, "main","acbutton1_click");}
 BA.debugLineNum = 854;BA.debugLine="Sub ACButton1_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 856;BA.debugLine="DSB.CheckedItem=1";
Debug.ShouldStop(8388608);
main.mostCurrent._dsb.runVoidMethod ("setCheckedItem",BA.numberCast(int.class, 1));
 BA.debugLineNum = 857;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,137);
if (RapidSub.canDelegate("activity_create")) { return com.calypsoinstruments.anemotracker.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
RemoteObject _pirulen = RemoteObject.declareNull("anywheresoftware.b4a.keywords.constants.TypefaceWrapper");
RemoteObject _dsdigi = RemoteObject.declareNull("anywheresoftware.b4a.keywords.constants.TypefaceWrapper");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 137;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(256);
 BA.debugLineNum = 138;BA.debugLine="Dim xml As XmlLayoutBuilder";
Debug.ShouldStop(512);
main.mostCurrent._xml = RemoteObject.createNew ("anywheresoftware.b4a.object.XmlLayoutBuilder");
 BA.debugLineNum = 139;BA.debugLine="If FirstTime Then";
Debug.ShouldStop(1024);
if (_firsttime.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 142;BA.debugLine="bmp_bt = LoadBitmap( File.DirAssets, \"bt.jpg\" )";
Debug.ShouldStop(8192);
main._bmp_bt = main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("bt.jpg")));
 BA.debugLineNum = 143;BA.debugLine="bmp_calypso = LoadBitmap( File.DirAssets, \"calyp";
Debug.ShouldStop(16384);
main._bmp_calypso = main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("calypso_drawer.jpg")));
 BA.debugLineNum = 144;BA.debugLine="bmp_cups = LoadBitmap( File.DirAssets, \"cups.jpg";
Debug.ShouldStop(32768);
main._bmp_cups = main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("cups.jpg")));
 BA.debugLineNum = 145;BA.debugLine="bmp_ultra = LoadBitmap( File.DirAssets, \"ultra.j";
Debug.ShouldStop(65536);
main._bmp_ultra = main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("ultra.jpg")));
 BA.debugLineNum = 146;BA.debugLine="bmp_nmea = LoadBitmap( File.DirAssets, \"nmea.jpg";
Debug.ShouldStop(131072);
main._bmp_nmea = main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("nmea.jpg")));
 BA.debugLineNum = 147;BA.debugLine="Activity.SetBackgroundImage(LoadBitmapResize( Fi";
Debug.ShouldStop(262144);
main.mostCurrent._activity.runMethod(false,"SetBackgroundImageNew",(Object)((main.mostCurrent.__c.runMethod(false,"LoadBitmapResize",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("ultra.jpg")),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.getField(true,"True"))).getObject()))).runMethod(true,"setGravity",main.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 149;BA.debugLine="NativeMe.InitializeContext 'Para meter codigo ja";
Debug.ShouldStop(1048576);
main._nativeme.runVoidMethod ("InitializeContext",main.processBA);
 };
 BA.debugLineNum = 154;BA.debugLine="If Activity.Width > Activity.Height Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean(">",main.mostCurrent._activity.runMethod(true,"getWidth"),BA.numberCast(double.class, main.mostCurrent._activity.runMethod(true,"getHeight")))) { 
 BA.debugLineNum = 155;BA.debugLine="portrait = False";
Debug.ShouldStop(67108864);
main._portrait = main.mostCurrent.__c.getField(true,"False");
 }else {
 BA.debugLineNum = 157;BA.debugLine="portrait = True";
Debug.ShouldStop(268435456);
main._portrait = main.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 164;BA.debugLine="NavDrawer.Initialize2(\"NavDrawer\", Activity, NavD";
Debug.ShouldStop(8);
main.mostCurrent._navdrawer.runVoidMethod ("Initialize2",main.mostCurrent.activityBA,(Object)(BA.ObjectToString("NavDrawer")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), main.mostCurrent._activity.getObject()),(Object)(main.mostCurrent._navdrawer.runMethod(true,"getDefaultDrawerWidth")),(Object)(main.mostCurrent._navdrawer.getField(true,"GRAVITY_START")));
 BA.debugLineNum = 167;BA.debugLine="Activity.LoadLayout(\"layout1\")";
Debug.ShouldStop(64);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("layout1")),main.mostCurrent.activityBA);
 BA.debugLineNum = 180;BA.debugLine="bmp_background = LoadBitmapResize( File.DirAssets";
Debug.ShouldStop(524288);
main.mostCurrent._bmp_background = main.mostCurrent.__c.runMethod(false,"LoadBitmapResize",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("Textura fibra carbono.jpg")),(Object)(BA.numberCast(int.class, 800)),(Object)(BA.numberCast(int.class, 800)),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 184;BA.debugLine="init_drawer";
Debug.ShouldStop(8388608);
_init_drawer();
 BA.debugLineNum = 185;BA.debugLine="init_dsb";
Debug.ShouldStop(16777216);
_init_dsb();
 BA.debugLineNum = 186;BA.debugLine="add_controls";
Debug.ShouldStop(33554432);
_add_controls();
 BA.debugLineNum = 192;BA.debugLine="SetTiledBackground( DSB, bmp_background )";
Debug.ShouldStop(-2147483648);
_settiledbackground(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), main.mostCurrent._dsb.getObject()),main.mostCurrent._bmp_background);
 BA.debugLineNum = 216;BA.debugLine="Dim pirulen, dsdigi As Typeface";
Debug.ShouldStop(8388608);
_pirulen = RemoteObject.createNew ("anywheresoftware.b4a.keywords.constants.TypefaceWrapper");Debug.locals.put("pirulen", _pirulen);
_dsdigi = RemoteObject.createNew ("anywheresoftware.b4a.keywords.constants.TypefaceWrapper");Debug.locals.put("dsdigi", _dsdigi);
 BA.debugLineNum = 217;BA.debugLine="pirulen = Typeface.LoadFromAssets(\"pirulen_rg.ttf";
Debug.ShouldStop(16777216);
_pirulen.setObject(main.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("pirulen_rg.ttf"))));
 BA.debugLineNum = 218;BA.debugLine="dsdigi = Typeface.LoadFromAssets(\"ds-digi.ttf\")";
Debug.ShouldStop(33554432);
_dsdigi.setObject(main.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("ds-digi.ttf"))));
 BA.debugLineNum = 220;BA.debugLine="touchpanel.Initialize( \"touchpanel\" )";
Debug.ShouldStop(134217728);
main.mostCurrent._touchpanel.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("touchpanel")));
 BA.debugLineNum = 221;BA.debugLine="Activity.AddView( touchpanel, 0, (Activity.Height";
Debug.ShouldStop(268435456);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._touchpanel.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {main.mostCurrent._activity.runMethod(true,"getHeight"),main.mostCurrent._activity.runMethod(true,"getWidth")}, "-",1, 1)),RemoteObject.createImmutable(2),main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))}, "/-",1, 0))),(Object)(main.mostCurrent._activity.runMethod(true,"getWidth")),(Object)(main.mostCurrent._activity.runMethod(true,"getWidth")));
 BA.debugLineNum = 222;BA.debugLine="touchpanel.SendToBack";
Debug.ShouldStop(536870912);
main.mostCurrent._touchpanel.runVoidMethod ("SendToBack");
 BA.debugLineNum = 224;BA.debugLine="btnDis.Initialize( \"btnDis\" )";
Debug.ShouldStop(-2147483648);
main.mostCurrent._btndis.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("btnDis")));
 BA.debugLineNum = 225;BA.debugLine="Activity.AddView( btnDis, Activity.Width/2 - 150/";
Debug.ShouldStop(1);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._btndis.getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {main.mostCurrent._activity.runMethod(true,"getWidth"),RemoteObject.createImmutable(2),RemoteObject.createImmutable(150),RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(RemoteObject.solve(new RemoteObject[] {main.mostCurrent._activity.runMethod(true,"getHeight"),main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 150)))}, "-",1, 1)),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 150)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 BA.debugLineNum = 226;BA.debugLine="btnDis.Text = \"End offset adjust\"";
Debug.ShouldStop(2);
main.mostCurrent._btndis.runMethod(true,"setText",BA.ObjectToCharSequence("End offset adjust"));
 BA.debugLineNum = 228;BA.debugLine="offname_lbl.Initialize( \"offname_lbl\" )";
Debug.ShouldStop(8);
main.mostCurrent._offname_lbl.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("offname_lbl")));
 BA.debugLineNum = 229;BA.debugLine="Activity.AddView( offname_lbl, Activity.Width/2 -";
Debug.ShouldStop(16);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._offname_lbl.getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {main.mostCurrent._activity.runMethod(true,"getWidth"),RemoteObject.createImmutable(2),main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 120)))}, "/-",1, 0))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 240)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 BA.debugLineNum = 230;BA.debugLine="offname_lbl.TextColor = 0xFFFFFFFF";
Debug.ShouldStop(32);
main.mostCurrent._offname_lbl.runMethod(true,"setTextColor",BA.numberCast(int.class, 0xffffffff));
 BA.debugLineNum = 231;BA.debugLine="offname_lbl.TextSize = 22";
Debug.ShouldStop(64);
main.mostCurrent._offname_lbl.runMethod(true,"setTextSize",BA.numberCast(float.class, 22));
 BA.debugLineNum = 232;BA.debugLine="offname_lbl.Typeface = pirulen";
Debug.ShouldStop(128);
main.mostCurrent._offname_lbl.runMethod(false,"setTypeface",(_pirulen.getObject()));
 BA.debugLineNum = 233;BA.debugLine="offname_lbl.Text = \"Offset Angle:\"";
Debug.ShouldStop(256);
main.mostCurrent._offname_lbl.runMethod(true,"setText",BA.ObjectToCharSequence("Offset Angle:"));
 BA.debugLineNum = 234;BA.debugLine="offname_lbl.Visible = False";
Debug.ShouldStop(512);
main.mostCurrent._offname_lbl.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 236;BA.debugLine="offset_lbl.Initialize( \"offset_lbl\" )";
Debug.ShouldStop(2048);
main.mostCurrent._offset_lbl.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("offset_lbl")));
 BA.debugLineNum = 237;BA.debugLine="Activity.AddView( offset_lbl, Activity.Width/2 -";
Debug.ShouldStop(4096);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._offset_lbl.getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {main.mostCurrent._activity.runMethod(true,"getWidth"),RemoteObject.createImmutable(2),main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 120)))}, "/-",1, 0))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 70)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 240)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))));
 BA.debugLineNum = 238;BA.debugLine="offset_lbl.TextColor = 0xFFFFFFFF";
Debug.ShouldStop(8192);
main.mostCurrent._offset_lbl.runMethod(true,"setTextColor",BA.numberCast(int.class, 0xffffffff));
 BA.debugLineNum = 239;BA.debugLine="offset_lbl.TextSize = 24";
Debug.ShouldStop(16384);
main.mostCurrent._offset_lbl.runMethod(true,"setTextSize",BA.numberCast(float.class, 24));
 BA.debugLineNum = 240;BA.debugLine="offset_lbl.Typeface = dsdigi";
Debug.ShouldStop(32768);
main.mostCurrent._offset_lbl.runMethod(false,"setTypeface",(_dsdigi.getObject()));
 BA.debugLineNum = 241;BA.debugLine="offset_lbl.Visible = False";
Debug.ShouldStop(65536);
main.mostCurrent._offset_lbl.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 243;BA.debugLine="sw_realnorth.Initialize(\"sw_realnorth\")";
Debug.ShouldStop(262144);
main.mostCurrent._sw_realnorth.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("sw_realnorth")));
 BA.debugLineNum = 244;BA.debugLine="sw_realnorth.Text = \"Use real North\"";
Debug.ShouldStop(524288);
main.mostCurrent._sw_realnorth.runMethod(true,"setText",BA.ObjectToCharSequence("Use real North"));
 BA.debugLineNum = 245;BA.debugLine="Activity.AddView( sw_realnorth, 50dip, Activity.H";
Debug.ShouldStop(1048576);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._sw_realnorth.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))),(Object)(RemoteObject.solve(new RemoteObject[] {main.mostCurrent._activity.runMethod(true,"getHeight"),main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 150)))}, "-",1, 1)),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 160)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 BA.debugLineNum = 246;BA.debugLine="sw_realnorth.TextColor = 0xFFFFFFFF";
Debug.ShouldStop(2097152);
main.mostCurrent._sw_realnorth.runMethod(true,"setTextColor",BA.numberCast(int.class, 0xffffffff));
 BA.debugLineNum = 247;BA.debugLine="sw_realnorth.TextSize = 18";
Debug.ShouldStop(4194304);
main.mostCurrent._sw_realnorth.runMethod(true,"setTextSize",BA.numberCast(float.class, 18));
 BA.debugLineNum = 248;BA.debugLine="sw_realnorth.Visible = False";
Debug.ShouldStop(8388608);
main.mostCurrent._sw_realnorth.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 250;BA.debugLine="btnDis.Visible = False";
Debug.ShouldStop(33554432);
main.mostCurrent._btndis.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 252;BA.debugLine="tag_list.Initialize";
Debug.ShouldStop(134217728);
main.mostCurrent._tag_list.runVoidMethod ("Initialize");
 BA.debugLineNum = 253;BA.debugLine="tag_list.AddAll(Array As Tag(TagFour1,TagFour2,Ta";
Debug.ShouldStop(268435456);
main.mostCurrent._tag_list.runVoidMethod ("AddAll",(Object)(main.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("com.calypsoinstruments.anemotracker.tag",new int[] {4},new Object[] {main.mostCurrent._tagfour1,main.mostCurrent._tagfour2,main.mostCurrent._tagfour3,main.mostCurrent._tagfour4})))));
 BA.debugLineNum = 258;BA.debugLine="UpdateDrawer";
Debug.ShouldStop(2);
_updatedrawer();
 BA.debugLineNum = 260;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1047);
if (RapidSub.canDelegate("activity_keypress")) { return com.calypsoinstruments.anemotracker.main.remoteMe.runUserSub(false, "main","activity_keypress", _keycode);}
RemoteObject _result = RemoteObject.createImmutable(0);
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 1047;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 1048;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then  ' the Ba";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, main.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 1049;BA.debugLine="Dim result As Int";
Debug.ShouldStop(16777216);
_result = RemoteObject.createImmutable(0);Debug.locals.put("result", _result);
 BA.debugLineNum = 1050;BA.debugLine="result = Msgbox2( \"AnemoTracker exit\", \"Do you w";
Debug.ShouldStop(33554432);
_result = main.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("AnemoTracker exit")),(Object)(BA.ObjectToCharSequence("Do you want to exit")),(Object)(BA.ObjectToString("Yes")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((main.mostCurrent.__c.getField(false,"Null"))),main.mostCurrent.activityBA);Debug.locals.put("result", _result);
 BA.debugLineNum = 1051;BA.debugLine="If result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, main.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 1052;BA.debugLine="Starter.n.Cancel(1)";
Debug.ShouldStop(134217728);
main.mostCurrent._starter._n.runVoidMethod ("Cancel",(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 1053;BA.debugLine="Starter.Scan.Disconnect";
Debug.ShouldStop(268435456);
main.mostCurrent._starter._scan.runVoidMethod ("Disconnect");
 BA.debugLineNum = 1054;BA.debugLine="StopService( Starter )";
Debug.ShouldStop(536870912);
main.mostCurrent.__c.runVoidMethod ("StopService",main.processBA,(Object)((main.mostCurrent._starter.getObject())));
 BA.debugLineNum = 1055;BA.debugLine="ExitApplication";
Debug.ShouldStop(1073741824);
main.mostCurrent.__c.runVoidMethod ("ExitApplication");
 BA.debugLineNum = 1056;BA.debugLine="Return False";
Debug.ShouldStop(-2147483648);
if (true) return main.mostCurrent.__c.getField(true,"False");
 }else {
 BA.debugLineNum = 1058;BA.debugLine="Return True 'returns to the Activity instead of";
Debug.ShouldStop(2);
if (true) return main.mostCurrent.__c.getField(true,"True");
 };
 };
 BA.debugLineNum = 1061;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,631);
if (RapidSub.canDelegate("activity_pause")) { return com.calypsoinstruments.anemotracker.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 631;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 633;BA.debugLine="bPaused = True";
Debug.ShouldStop(16777216);
main._bpaused = main.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 635;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,624);
if (RapidSub.canDelegate("activity_resume")) { return com.calypsoinstruments.anemotracker.main.remoteMe.runUserSub(false, "main","activity_resume");}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
 BA.debugLineNum = 624;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(32768);
 BA.debugLineNum = 625;BA.debugLine="bPaused = False";
Debug.ShouldStop(65536);
main._bpaused = main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 627;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(262144);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 628;BA.debugLine="r.RunStaticMethod(\"java.lang.System\", \"gc\", Null,";
Debug.ShouldStop(524288);
_r.runVoidMethod ("RunStaticMethod",(Object)(BA.ObjectToString("java.lang.System")),(Object)(BA.ObjectToString("gc")),(Object)((main.mostCurrent.__c.getField(false,"Null"))),(Object)((main.mostCurrent.__c.getField(false,"Null"))));
 BA.debugLineNum = 629;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _add_controls() throws Exception{
try {
		Debug.PushSubsStack("add_controls (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,581);
if (RapidSub.canDelegate("add_controls")) { return com.calypsoinstruments.anemotracker.main.remoteMe.runUserSub(false, "main","add_controls");}
RemoteObject _lcontroles = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 581;BA.debugLine="Sub add_controls";
Debug.ShouldStop(16);
 BA.debugLineNum = 582;BA.debugLine="Dim lControles As List";
Debug.ShouldStop(32);
_lcontroles = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lControles", _lcontroles);
 BA.debugLineNum = 584;BA.debugLine="mControles.Initialize";
Debug.ShouldStop(128);
main.mostCurrent._mcontroles.runVoidMethod ("Initialize");
 BA.debugLineNum = 586;BA.debugLine="lControles.Initialize";
Debug.ShouldStop(512);
_lcontroles.runVoidMethod ("Initialize");
 BA.debugLineNum = 587;BA.debugLine="lControles.Add( ScaleBasic )";
Debug.ShouldStop(1024);
_lcontroles.runVoidMethod ("Add",(Object)((main.mostCurrent._scalebasic)));
 BA.debugLineNum = 588;BA.debugLine="lControles.AddAll( Array As Tag( TagBasic1, TagBa";
Debug.ShouldStop(2048);
_lcontroles.runVoidMethod ("AddAll",(Object)(main.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("com.calypsoinstruments.anemotracker.tag",new int[] {2},new Object[] {main.mostCurrent._tagbasic1,main.mostCurrent._tagbasic2})))));
 BA.debugLineNum = 589;BA.debugLine="mControles.Put( 1, lControles )";
Debug.ShouldStop(4096);
main.mostCurrent._mcontroles.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable((1))),(Object)((_lcontroles.getObject())));
 BA.debugLineNum = 591;BA.debugLine="lControles.Initialize";
Debug.ShouldStop(16384);
_lcontroles.runVoidMethod ("Initialize");
 BA.debugLineNum = 592;BA.debugLine="lControles.Add( ScaleFour )";
Debug.ShouldStop(32768);
_lcontroles.runVoidMethod ("Add",(Object)((main.mostCurrent._scalefour)));
 BA.debugLineNum = 593;BA.debugLine="lControles.AddAll( Array As Tag( TagFour1, TagFou";
Debug.ShouldStop(65536);
_lcontroles.runVoidMethod ("AddAll",(Object)(main.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("com.calypsoinstruments.anemotracker.tag",new int[] {4},new Object[] {main.mostCurrent._tagfour1,main.mostCurrent._tagfour2,main.mostCurrent._tagfour3,main.mostCurrent._tagfour4})))));
 BA.debugLineNum = 594;BA.debugLine="mControles.Put( 2, lControles )";
Debug.ShouldStop(131072);
main.mostCurrent._mcontroles.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable((2))),(Object)((_lcontroles.getObject())));
 BA.debugLineNum = 596;BA.debugLine="lControles.Initialize";
Debug.ShouldStop(524288);
_lcontroles.runVoidMethod ("Initialize");
 BA.debugLineNum = 597;BA.debugLine="lControles.Add( ScaleMap )";
Debug.ShouldStop(1048576);
_lcontroles.runVoidMethod ("Add",(Object)((main.mostCurrent._scalemap)));
 BA.debugLineNum = 598;BA.debugLine="lControles.Addall( Array As Tag( TagMap1, TagMap2";
Debug.ShouldStop(2097152);
_lcontroles.runVoidMethod ("AddAll",(Object)(main.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("com.calypsoinstruments.anemotracker.tag",new int[] {2},new Object[] {main.mostCurrent._tagmap1,main.mostCurrent._tagmap2})))));
 BA.debugLineNum = 599;BA.debugLine="mControles.Put( 3, lControles )";
Debug.ShouldStop(4194304);
main.mostCurrent._mcontroles.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable((3))),(Object)((_lcontroles.getObject())));
 BA.debugLineNum = 601;BA.debugLine="lControles.Initialize";
Debug.ShouldStop(16777216);
_lcontroles.runVoidMethod ("Initialize");
 BA.debugLineNum = 602;BA.debugLine="lControles.Addall( Array As Tag( TagTri1, TagTri2";
Debug.ShouldStop(33554432);
_lcontroles.runVoidMethod ("AddAll",(Object)(main.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("com.calypsoinstruments.anemotracker.tag",new int[] {3},new Object[] {main.mostCurrent._tagtri1,main.mostCurrent._tagtri2,main.mostCurrent._tagtri3})))));
 BA.debugLineNum = 603;BA.debugLine="mControles.Put( 4, lControles )";
Debug.ShouldStop(67108864);
main.mostCurrent._mcontroles.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable((4))),(Object)((_lcontroles.getObject())));
 BA.debugLineNum = 605;BA.debugLine="lControles.Initialize";
Debug.ShouldStop(268435456);
_lcontroles.runVoidMethod ("Initialize");
 BA.debugLineNum = 606;BA.debugLine="lControles.AddAll( Array As Tag( TagM1, TagM2, Ta";
Debug.ShouldStop(536870912);
_lcontroles.runVoidMethod ("AddAll",(Object)(main.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("com.calypsoinstruments.anemotracker.tag",new int[] {6},new Object[] {main.mostCurrent._tagm1,main.mostCurrent._tagm2,main.mostCurrent._tagm3,main.mostCurrent._tagm4,main.mostCurrent._tagm5,main.mostCurrent._tagm6})))));
 BA.debugLineNum = 607;BA.debugLine="mControles.Put( 5, lControles )";
Debug.ShouldStop(1073741824);
main.mostCurrent._mcontroles.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable((5))),(Object)((_lcontroles.getObject())));
 BA.debugLineNum = 608;BA.debugLine="Update(True)";
Debug.ShouldStop(-2147483648);
_update(main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 609;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _add_secondary_drawer() throws Exception{
try {
		Debug.PushSubsStack("add_secondary_drawer (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,497);
if (RapidSub.canDelegate("add_secondary_drawer")) { return com.calypsoinstruments.anemotracker.main.remoteMe.runUserSub(false, "main","add_secondary_drawer");}
 BA.debugLineNum = 497;BA.debugLine="Sub add_secondary_drawer";
Debug.ShouldStop(65536);
 BA.debugLineNum = 517;BA.debugLine="pnl_equipment.LoadLayout(\"navheaderlayout2\")";
Debug.ShouldStop(16);
main.mostCurrent._pnl_equipment.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("navheaderlayout2")),main.mostCurrent.activityBA);
 BA.debugLineNum = 518;BA.debugLine="HeaderLabel.Text = \"\" 'Starter.actual_mac";
Debug.ShouldStop(32);
main.mostCurrent._headerlabel.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 545;BA.debugLine="If Starter.deviceType = 2 Or Starter.deviceType =";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",main.mostCurrent._starter._devicetype,BA.numberCast(double.class, 2)) || RemoteObject.solveBoolean("=",main.mostCurrent._starter._devicetype,BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 551;BA.debugLine="sp_Hz.Add(\"1Hz\")";
Debug.ShouldStop(64);
main.mostCurrent._sp_hz.runVoidMethod ("Add",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("1Hz"))));
 BA.debugLineNum = 552;BA.debugLine="sp_Hz.Add(\"4Hz\")";
Debug.ShouldStop(128);
main.mostCurrent._sp_hz.runVoidMethod ("Add",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("4Hz"))));
 BA.debugLineNum = 553;BA.debugLine="sp_Hz.Add(\"8Hz\")";
Debug.ShouldStop(256);
main.mostCurrent._sp_hz.runVoidMethod ("Add",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("8Hz"))));
 BA.debugLineNum = 554;BA.debugLine="sp_Hz.SelectedIndex = 1 ' contador comienza en 0";
Debug.ShouldStop(512);
main.mostCurrent._sp_hz.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 1));
 }else {
 BA.debugLineNum = 558;BA.debugLine="sp_Hz.Visible = False";
Debug.ShouldStop(8192);
main.mostCurrent._sp_hz.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 559;BA.debugLine="sw_gyro.Visible = False";
Debug.ShouldStop(16384);
main.mostCurrent._sw_gyro.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 560;BA.debugLine="lbl_refresh.Visible = False";
Debug.ShouldStop(32768);
main.mostCurrent._lbl_refresh.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 562;BA.debugLine="If Starter.deviceType = 3 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",main.mostCurrent._starter._devicetype,BA.numberCast(double.class, 3))) { 
 }else {
 BA.debugLineNum = 564;BA.debugLine="sw_nmea.Visible = False";
Debug.ShouldStop(524288);
main.mostCurrent._sw_nmea.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 572;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bluetoothad() throws Exception{
try {
		Debug.PushSubsStack("bluetoothAd (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1070);
if (RapidSub.canDelegate("bluetoothad")) { return com.calypsoinstruments.anemotracker.main.remoteMe.runUserSub(false, "main","bluetoothad");}
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _activarble = RemoteObject.createImmutable(false);
 BA.debugLineNum = 1070;BA.debugLine="Sub bluetoothAd";
Debug.ShouldStop(8192);
 BA.debugLineNum = 1071;BA.debugLine="Dim result As Int";
Debug.ShouldStop(16384);
_result = RemoteObject.createImmutable(0);Debug.locals.put("result", _result);
 BA.debugLineNum = 1072;BA.debugLine="result = Msgbox2( \"Bluetooth is disabled. Do you";
Debug.ShouldStop(32768);
_result = main.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Bluetooth is disabled. Do you want to enable it?")),(Object)(BA.ObjectToCharSequence("Advise")),(Object)(BA.ObjectToString("Yes")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((main.mostCurrent.__c.getField(false,"Null"))),main.mostCurrent.activityBA);Debug.locals.put("result", _result);
 BA.debugLineNum = 1073;BA.debugLine="If result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, main.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 1074;BA.debugLine="Dim activarBle As Boolean = NativeMe.RunMethod(\"";
Debug.ShouldStop(131072);
_activarble = BA.ObjectToBoolean(main._nativeme.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("setBluetooth")),(Object)((main.mostCurrent.__c.getField(false,"Null")))));Debug.locals.put("activarBle", _activarble);Debug.locals.put("activarBle", _activarble);
 BA.debugLineNum = 1075;BA.debugLine="Log(\"activarBle \" & activarBle)";
Debug.ShouldStop(262144);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("activarBle "),_activarble)));
 }else {
 BA.debugLineNum = 1077;BA.debugLine="Msgbox(\"Some functions will not be usable\", \"Blu";
Debug.ShouldStop(1048576);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Some functions will not be usable")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Bluetooth warning"))),main.mostCurrent.activityBA);
 };
 BA.debugLineNum = 1079;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_bt_click() throws Exception{
try {
		Debug.PushSubsStack("btn_bt_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,824);
if (RapidSub.canDelegate("btn_bt_click")) { return com.calypsoinstruments.anemotracker.main.remoteMe.runUserSub(false, "main","btn_bt_click");}
 BA.debugLineNum = 824;BA.debugLine="Sub btn_bt_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 825;BA.debugLine="If Starter.connected Then";
Debug.ShouldStop(16777216);
if (main.mostCurrent._starter._connected.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 826;BA.debugLine="Starter.manual_disconnect = True";
Debug.ShouldStop(33554432);
main.mostCurrent._starter._manual_disconnect = main.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 827;BA.debugLine="Starter.Scan.Disconnect";
Debug.ShouldStop(67108864);
main.mostCurrent._starter._scan.runVoidMethod ("Disconnect");
 BA.debugLineNum = 828;BA.debugLine="btn_bt.Text = \"Scan\"";
Debug.ShouldStop(134217728);
main.mostCurrent._btn_bt.runMethod(true,"setText",BA.ObjectToCharSequence("Scan"));
 BA.debugLineNum = 829;BA.debugLine="btn_bt.Enabled = True";
Debug.ShouldStop(268435456);
main.mostCurrent._btn_bt.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 831;BA.debugLine="Starter.Scan.StopScan";
Debug.ShouldStop(1073741824);
main.mostCurrent._starter._scan.runVoidMethod ("StopScan");
 BA.debugLineNum = 832;BA.debugLine="btn_bt.Enabled = False";
Debug.ShouldStop(-2147483648);
main.mostCurrent._btn_bt.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 833;BA.debugLine="btn_bt.Text = \"Scanning\"";
Debug.ShouldStop(1);
main.mostCurrent._btn_bt.runMethod(true,"setText",BA.ObjectToCharSequence("Scanning"));
 BA.debugLineNum = 834;BA.debugLine="btn_bt.Invalidate";
Debug.ShouldStop(2);
main.mostCurrent._btn_bt.runVoidMethod ("Invalidate");
 BA.debugLineNum = 835;BA.debugLine="Starter.Scan.Disconnect";
Debug.ShouldStop(4);
main.mostCurrent._starter._scan.runVoidMethod ("Disconnect");
 BA.debugLineNum = 836;BA.debugLine="Starter.bSelectBLE = True";
Debug.ShouldStop(8);
main.mostCurrent._starter._bselectble = main.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 837;BA.debugLine="Starter.temporizador = 10000";
Debug.ShouldStop(16);
main.mostCurrent._starter._temporizador = BA.numberCast(long.class, 10000);
 BA.debugLineNum = 838;BA.debugLine="StartActivity( actBLE )";
Debug.ShouldStop(32);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._actble.getObject())));
 };
 BA.debugLineNum = 841;BA.debugLine="UpdateDrawer";
Debug.ShouldStop(256);
_updatedrawer();
 BA.debugLineNum = 842;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_calcomp_click() throws Exception{
try {
		Debug.PushSubsStack("btn_calComp_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,995);
if (RapidSub.canDelegate("btn_calcomp_click")) { return com.calypsoinstruments.anemotracker.main.remoteMe.runUserSub(false, "main","btn_calcomp_click");}
 BA.debugLineNum = 995;BA.debugLine="Sub btn_calComp_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 997;BA.debugLine="Log(\"btn_calComp clicked\")";
Debug.ShouldStop(16);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("btn_calComp clicked")));
 BA.debugLineNum = 998;BA.debugLine="If gyroEnabled Then";
Debug.ShouldStop(32);
if (main._gyroenabled.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 999;BA.debugLine="StartActivity( actCalComp )";
Debug.ShouldStop(64);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._actcalcomp.getObject())));
 }else {
 BA.debugLineNum = 1001;BA.debugLine="Msgbox(\"You sould enable gyro first\", \"Warning\")";
Debug.ShouldStop(256);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("You sould enable gyro first")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),main.mostCurrent.activityBA);
 };
 BA.debugLineNum = 1003;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_info_click() throws Exception{
try {
		Debug.PushSubsStack("btn_info_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1193);
if (RapidSub.canDelegate("btn_info_click")) { return com.calypsoinstruments.anemotracker.main.remoteMe.runUserSub(false, "main","btn_info_click");}
 BA.debugLineNum = 1193;BA.debugLine="Sub btn_info_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 1194;BA.debugLine="StartActivity(actDevInfo)";
Debug.ShouldStop(512);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._actdevinfo.getObject())));
 BA.debugLineNum = 1195;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_wifi_click() throws Exception{
try {
		Debug.PushSubsStack("btn_wifi_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,988);
if (RapidSub.canDelegate("btn_wifi_click")) { return com.calypsoinstruments.anemotracker.main.remoteMe.runUserSub(false, "main","btn_wifi_click");}
RemoteObject _ml = RemoteObject.declareNull("wifi.MLwifi");
RemoteObject _isultrawifi = RemoteObject.createImmutable(false);
 BA.debugLineNum = 988;BA.debugLine="Sub btn_wifi_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 989;BA.debugLine="Dim ml As MLwifi";
Debug.ShouldStop(268435456);
_ml = RemoteObject.createNew ("wifi.MLwifi");Debug.locals.put("ml", _ml);
 BA.debugLineNum = 990;BA.debugLine="Dim isUltraWifi As Boolean = ml.WifiSSID.StartsWi";
Debug.ShouldStop(536870912);
_isultrawifi = _ml.runMethod(true,"WifiSSID").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("UltraWifi")));Debug.locals.put("isUltraWifi", _isultrawifi);Debug.locals.put("isUltraWifi", _isultrawifi);
 BA.debugLineNum = 991;BA.debugLine="ToastMessageShow(\"Is connected to WiFi: \" &  ml.i";
Debug.ShouldStop(1073741824);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Is connected to WiFi: "),_ml.runMethod(true,"isOnline"),main.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("SSID:"),_ml.runMethod(true,"WifiSSID"),main.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("is Ultra: "),_isultrawifi))),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 992;BA.debugLine="StartActivity(actTCPip)";
Debug.ShouldStop(-2147483648);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._acttcpip.getObject())));
 BA.debugLineNum = 993;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btndis_click() throws Exception{
try {
		Debug.PushSubsStack("btnDis_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1166);
if (RapidSub.canDelegate("btndis_click")) { return com.calypsoinstruments.anemotracker.main.remoteMe.runUserSub(false, "main","btndis_click");}
 BA.debugLineNum = 1166;BA.debugLine="Sub btnDis_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 1167;BA.debugLine="touchpanel.SendToBack";
Debug.ShouldStop(16384);
main.mostCurrent._touchpanel.runVoidMethod ("SendToBack");
 BA.debugLineNum = 1168;BA.debugLine="btnDis.Visible = False";
Debug.ShouldStop(32768);
main.mostCurrent._btndis.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1169;BA.debugLine="offname_lbl.Visible = False";
Debug.ShouldStop(65536);
main.mostCurrent._offname_lbl.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1170;BA.debugLine="offset_lbl.Visible = False";
Debug.ShouldStop(131072);
main.mostCurrent._offset_lbl.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1171;BA.debugLine="sw_realnorth.Visible = False";
Debug.ShouldStop(262144);
main.mostCurrent._sw_realnorth.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1173;BA.debugLine="edit_tags(tag_list, 0xFFFFFF, 10dip, 3dip, 0xFF00";
Debug.ShouldStop(1048576);
_edit_tags(main.mostCurrent._tag_list,BA.numberCast(int.class, 0xffffff),main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10))),main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3))),BA.numberCast(int.class, 0xff000000),main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1176;BA.debugLine="kvs.PutSimple( \"calibration_offset\" , offset_angl";
Debug.ShouldStop(8388608);
main._kvs.runClassMethod (com.calypsoinstruments.anemotracker.keyvaluestore.class, "_putsimple",(Object)(BA.ObjectToString("calibration_offset")),(Object)((main._offset_angle)));
 BA.debugLineNum = 1177;BA.debugLine="Starter.calcs_1.offset = offset_angle";
Debug.ShouldStop(16777216);
main.mostCurrent._starter._calcs_1.setField ("_offset",BA.numberCast(float.class, main._offset_angle));
 BA.debugLineNum = 1179;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _connecting() throws Exception{
try {
		Debug.PushSubsStack("Connecting (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,843);
if (RapidSub.canDelegate("connecting")) { return com.calypsoinstruments.anemotracker.main.remoteMe.runUserSub(false, "main","connecting");}
 BA.debugLineNum = 843;BA.debugLine="Sub Connecting";
Debug.ShouldStop(1024);
 BA.debugLineNum = 844;BA.debugLine="btn_bt.Enabled = False";
Debug.ShouldStop(2048);
main.mostCurrent._btn_bt.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 845;BA.debugLine="btn_bt.Text = \"Connecting\"";
Debug.ShouldStop(4096);
main.mostCurrent._btn_bt.runMethod(true,"setText",BA.ObjectToCharSequence("Connecting"));
 BA.debugLineNum = 846;BA.debugLine="btn_bt.Invalidate";
Debug.ShouldStop(8192);
main.mostCurrent._btn_bt.runVoidMethod ("Invalidate");
 BA.debugLineNum = 848;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _disconnect() throws Exception{
try {
		Debug.PushSubsStack("Disconnect (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,849);
if (RapidSub.canDelegate("disconnect")) { return com.calypsoinstruments.anemotracker.main.remoteMe.runUserSub(false, "main","disconnect");}
 BA.debugLineNum = 849;BA.debugLine="Sub Disconnect";
Debug.ShouldStop(65536);
 BA.debugLineNum = 850;BA.debugLine="btn_bt.Enabled = True";
Debug.ShouldStop(131072);
main.mostCurrent._btn_bt.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 851;BA.debugLine="btn_bt.Text = \"Scan\"";
Debug.ShouldStop(262144);
main.mostCurrent._btn_bt.runMethod(true,"setText",BA.ObjectToCharSequence("Scan"));
 BA.debugLineNum = 852;BA.debugLine="btn_bt.Invalidate";
Debug.ShouldStop(524288);
main.mostCurrent._btn_bt.runVoidMethod ("Invalidate");
 BA.debugLineNum = 853;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dsb_navigationitemselected(RemoteObject _menuitem) throws Exception{
try {
		Debug.PushSubsStack("DSB_NavigationItemSelected (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,649);
if (RapidSub.canDelegate("dsb_navigationitemselected")) { return com.calypsoinstruments.anemotracker.main.remoteMe.runUserSub(false, "main","dsb_navigationitemselected", _menuitem);}
RemoteObject _newpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _lcontroles = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _control = RemoteObject.declareNull("Object");
Debug.locals.put("MenuItem", _menuitem);
 BA.debugLineNum = 649;BA.debugLine="Sub DSB_NavigationItemSelected(MenuItem As ACMenuI";
Debug.ShouldStop(256);
 BA.debugLineNum = 651;BA.debugLine="Dim newPanel As Panel";
Debug.ShouldStop(1024);
_newpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("newPanel", _newpanel);
 BA.debugLineNum = 655;BA.debugLine="Dim lControles As List";
Debug.ShouldStop(16384);
_lcontroles = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lControles", _lcontroles);
 BA.debugLineNum = 656;BA.debugLine="lControles.Initialize";
Debug.ShouldStop(32768);
_lcontroles.runVoidMethod ("Initialize");
 BA.debugLineNum = 657;BA.debugLine="lControles = mControles.Get(iMenuSelected)";
Debug.ShouldStop(65536);
_lcontroles.setObject(main.mostCurrent._mcontroles.runMethod(false,"Get",(Object)((main._imenuselected))));
 BA.debugLineNum = 658;BA.debugLine="For Each control As Object In lControles";
Debug.ShouldStop(131072);
{
final RemoteObject group5 = _lcontroles;
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_control = group5.runMethod(false,"Get",index5);Debug.locals.put("control", _control);
Debug.locals.put("control", _control);
 BA.debugLineNum = 659;BA.debugLine="CallSubDelayed( control, \"Pause\" )";
Debug.ShouldStop(262144);
main.mostCurrent.__c.runVoidMethod ("CallSubDelayed",main.processBA,(Object)(_control),(Object)(RemoteObject.createImmutable("Pause")));
 }
}Debug.locals.put("control", _control);
;
 BA.debugLineNum = 662;BA.debugLine="iMenuSelected  = MenuItem.Id";
Debug.ShouldStop(2097152);
main._imenuselected = _menuitem.runMethod(true,"getId");
 BA.debugLineNum = 663;BA.debugLine="Select MenuItem.Id";
Debug.ShouldStop(4194304);
switch (BA.switchObjectToInt(_menuitem.runMethod(true,"getId"),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3),BA.numberCast(int.class, 4),BA.numberCast(int.class, 5))) {
case 0: {
 BA.debugLineNum = 665;BA.debugLine="newPanel = Panel1";
Debug.ShouldStop(16777216);
_newpanel = main.mostCurrent._panel1;Debug.locals.put("newPanel", _newpanel);
 break; }
case 1: {
 BA.debugLineNum = 667;BA.debugLine="newPanel = Panel4";
Debug.ShouldStop(67108864);
_newpanel = main.mostCurrent._panel4;Debug.locals.put("newPanel", _newpanel);
 break; }
case 2: {
 BA.debugLineNum = 669;BA.debugLine="newPanel = Panel2";
Debug.ShouldStop(268435456);
_newpanel = main.mostCurrent._panel2;Debug.locals.put("newPanel", _newpanel);
 break; }
case 3: {
 BA.debugLineNum = 671;BA.debugLine="newPanel = Panel3";
Debug.ShouldStop(1073741824);
_newpanel = main.mostCurrent._panel3;Debug.locals.put("newPanel", _newpanel);
 break; }
case 4: {
 BA.debugLineNum = 673;BA.debugLine="newPanel = PanelM";
Debug.ShouldStop(1);
_newpanel = main.mostCurrent._panelm;Debug.locals.put("newPanel", _newpanel);
 break; }
}
;
 BA.debugLineNum = 678;BA.debugLine="If currentPanel <> newPanel Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("!",main.mostCurrent._currentpanel,_newpanel)) { 
 BA.debugLineNum = 680;BA.debugLine="newPanel.SetVisibleAnimated(0, False)";
Debug.ShouldStop(128);
_newpanel.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 681;BA.debugLine="newPanel.BringToFront";
Debug.ShouldStop(256);
_newpanel.runVoidMethod ("BringToFront");
 BA.debugLineNum = 682;BA.debugLine="newPanel.SetVisibleAnimated(0, True)";
Debug.ShouldStop(512);
_newpanel.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 683;BA.debugLine="currentPanel = newPanel";
Debug.ShouldStop(1024);
main.mostCurrent._currentpanel = _newpanel;
 BA.debugLineNum = 684;BA.debugLine="Update( True )";
Debug.ShouldStop(2048);
_update(main.mostCurrent.__c.getField(true,"True"));
 };
 BA.debugLineNum = 686;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edit_tags(RemoteObject _stag,RemoteObject _color,RemoteObject _cradius,RemoteObject _bwidth,RemoteObject _bcolor,RemoteObject _svisible) throws Exception{
try {
		Debug.PushSubsStack("edit_tags (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1128);
if (RapidSub.canDelegate("edit_tags")) { return com.calypsoinstruments.anemotracker.main.remoteMe.runUserSub(false, "main","edit_tags", _stag, _color, _cradius, _bwidth, _bcolor, _svisible);}
RemoteObject _cd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _elem = RemoteObject.declareNull("com.calypsoinstruments.anemotracker.tag");
Debug.locals.put("sTag", _stag);
Debug.locals.put("color", _color);
Debug.locals.put("cRadius", _cradius);
Debug.locals.put("bWidth", _bwidth);
Debug.locals.put("bColor", _bcolor);
Debug.locals.put("sVisible", _svisible);
 BA.debugLineNum = 1128;BA.debugLine="Sub edit_tags (sTag As List, color As Int , cRadiu";
Debug.ShouldStop(128);
 BA.debugLineNum = 1129;BA.debugLine="Dim cd As ColorDrawable";
Debug.ShouldStop(256);
_cd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cd", _cd);
 BA.debugLineNum = 1130;BA.debugLine="cd.Initialize2(color, cRadius, bWidth, bColor)";
Debug.ShouldStop(512);
_cd.runVoidMethod ("Initialize2",(Object)(_color),(Object)(_cradius),(Object)(_bwidth),(Object)(_bcolor));
 BA.debugLineNum = 1131;BA.debugLine="For Each elem As Tag In sTag";
Debug.ShouldStop(1024);
{
final RemoteObject group3 = _stag;
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_elem = (group3.runMethod(false,"Get",index3));Debug.locals.put("elem", _elem);
Debug.locals.put("elem", _elem);
 BA.debugLineNum = 1132;BA.debugLine="elem.GetBase.Background = cd";
Debug.ShouldStop(2048);
_elem.runClassMethod (com.calypsoinstruments.anemotracker.tag.class, "_getbase").runMethod(false,"setBackground",(_cd.getObject()));
 }
}Debug.locals.put("elem", _elem);
;
 BA.debugLineNum = 1135;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getba() throws Exception{
try {
		Debug.PushSubsStack("GetBA (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,615);
if (RapidSub.canDelegate("getba")) { return com.calypsoinstruments.anemotracker.main.remoteMe.runUserSub(false, "main","getba");}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _cls = RemoteObject.createImmutable("");
 BA.debugLineNum = 615;BA.debugLine="Sub GetBA As JavaObject";
Debug.ShouldStop(64);
 BA.debugLineNum = 616;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(128);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 617;BA.debugLine="Dim cls As String = Me";
Debug.ShouldStop(256);
_cls = BA.ObjectToString(main.getObject());Debug.locals.put("cls", _cls);Debug.locals.put("cls", _cls);
 BA.debugLineNum = 618;BA.debugLine="cls = cls.SubString(\"class \".Length)";
Debug.ShouldStop(512);
_cls = _cls.runMethod(true,"substring",(Object)(RemoteObject.createImmutable("class ").runMethod(true,"length")));Debug.locals.put("cls", _cls);
 BA.debugLineNum = 619;BA.debugLine="jo.InitializeStatic(cls)";
Debug.ShouldStop(1024);
_jo.runVoidMethod ("InitializeStatic",(Object)(_cls));
 BA.debugLineNum = 620;BA.debugLine="Return jo.GetFieldJO(\"processBA\")";
Debug.ShouldStop(2048);
if (true) return _jo.runMethod(false,"GetFieldJO",(Object)(RemoteObject.createImmutable("processBA")));
 BA.debugLineNum = 622;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcontext() throws Exception{
try {
		Debug.PushSubsStack("GetContext (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,611);
if (RapidSub.canDelegate("getcontext")) { return com.calypsoinstruments.anemotracker.main.remoteMe.runUserSub(false, "main","getcontext");}
 BA.debugLineNum = 611;BA.debugLine="Sub GetContext As JavaObject";
Debug.ShouldStop(4);
 BA.debugLineNum = 612;BA.debugLine="Return GetBA.GetField(\"context\")";
Debug.ShouldStop(8);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _getba().runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("context"))));
 BA.debugLineNum = 613;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 52;BA.debugLine="Private xml As XmlLayoutBuilder";
main.mostCurrent._xml = RemoteObject.createNew ("anywheresoftware.b4a.object.XmlLayoutBuilder");
 //BA.debugLineNum = 54;BA.debugLine="Private DSB As DSBottomNavigationView";
main.mostCurrent._dsb = RemoteObject.createNew ("de.amberhome.objects.BottomNavigationViewWrapper");
 //BA.debugLineNum = 55;BA.debugLine="Private NavDrawer As DSNavigationDrawer";
main.mostCurrent._navdrawer = RemoteObject.createNew ("de.amberhome.objects.NavigationDrawerWrapper");
 //BA.debugLineNum = 56;BA.debugLine="Dim pnl_header As Panel";
main.mostCurrent._pnl_header = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 57;BA.debugLine="Dim imv_calypso, imv_equipment As ImageView";
main.mostCurrent._imv_calypso = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
main.mostCurrent._imv_equipment = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 58;BA.debugLine="Private panel_secondary As Panel";
main.mostCurrent._panel_secondary = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 62;BA.debugLine="Private sw_mean, sw_track, sw_gyro As ACSwitch";
main.mostCurrent._sw_mean = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACSwitchCompatWrapper");
main.mostCurrent._sw_track = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACSwitchCompatWrapper");
main.mostCurrent._sw_gyro = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACSwitchCompatWrapper");
 //BA.debugLineNum = 63;BA.debugLine="Private sp_Hz, sp_track_period As ACSpinner";
main.mostCurrent._sp_hz = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACSpinnerWrapper");
main.mostCurrent._sp_track_period = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACSpinnerWrapper");
 //BA.debugLineNum = 71;BA.debugLine="Private HeaderLabel As Label";
main.mostCurrent._headerlabel = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 76;BA.debugLine="Public Panel1 As Panel";
main.mostCurrent._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 77;BA.debugLine="Private ScaleBasic As Scale";
main.mostCurrent._scalebasic = RemoteObject.createNew ("com.calypsoinstruments.anemotracker.scale");
 //BA.debugLineNum = 78;BA.debugLine="Private TagBasic1, TagBasic2 As Tag";
main.mostCurrent._tagbasic1 = RemoteObject.createNew ("com.calypsoinstruments.anemotracker.tag");
main.mostCurrent._tagbasic2 = RemoteObject.createNew ("com.calypsoinstruments.anemotracker.tag");
 //BA.debugLineNum = 81;BA.debugLine="Private Panel4 As Panel";
main.mostCurrent._panel4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 82;BA.debugLine="Private TagFour1,TagFour2,TagFour3,TagFour4 As Ta";
main.mostCurrent._tagfour1 = RemoteObject.createNew ("com.calypsoinstruments.anemotracker.tag");
main.mostCurrent._tagfour2 = RemoteObject.createNew ("com.calypsoinstruments.anemotracker.tag");
main.mostCurrent._tagfour3 = RemoteObject.createNew ("com.calypsoinstruments.anemotracker.tag");
main.mostCurrent._tagfour4 = RemoteObject.createNew ("com.calypsoinstruments.anemotracker.tag");
 //BA.debugLineNum = 83;BA.debugLine="Private ScaleFour As Scale";
main.mostCurrent._scalefour = RemoteObject.createNew ("com.calypsoinstruments.anemotracker.scale");
 //BA.debugLineNum = 85;BA.debugLine="Private Panel2 As Panel";
main.mostCurrent._panel2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 86;BA.debugLine="Private ScaleMap As Scale";
main.mostCurrent._scalemap = RemoteObject.createNew ("com.calypsoinstruments.anemotracker.scale");
 //BA.debugLineNum = 87;BA.debugLine="Private TagMap1, TagMap2 As Tag";
main.mostCurrent._tagmap1 = RemoteObject.createNew ("com.calypsoinstruments.anemotracker.tag");
main.mostCurrent._tagmap2 = RemoteObject.createNew ("com.calypsoinstruments.anemotracker.tag");
 //BA.debugLineNum = 89;BA.debugLine="Private Panel3 As Panel";
main.mostCurrent._panel3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 90;BA.debugLine="Private TagTri1, TagTri2, TagTri3 As Tag";
main.mostCurrent._tagtri1 = RemoteObject.createNew ("com.calypsoinstruments.anemotracker.tag");
main.mostCurrent._tagtri2 = RemoteObject.createNew ("com.calypsoinstruments.anemotracker.tag");
main.mostCurrent._tagtri3 = RemoteObject.createNew ("com.calypsoinstruments.anemotracker.tag");
 //BA.debugLineNum = 91;BA.debugLine="Private currentPanel As Panel";
main.mostCurrent._currentpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 93;BA.debugLine="Private PanelM As Panel";
main.mostCurrent._panelm = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 94;BA.debugLine="Private TagM1, TagM2, TagM3, TagM4, TagM5, TagM6";
main.mostCurrent._tagm1 = RemoteObject.createNew ("com.calypsoinstruments.anemotracker.tag");
main.mostCurrent._tagm2 = RemoteObject.createNew ("com.calypsoinstruments.anemotracker.tag");
main.mostCurrent._tagm3 = RemoteObject.createNew ("com.calypsoinstruments.anemotracker.tag");
main.mostCurrent._tagm4 = RemoteObject.createNew ("com.calypsoinstruments.anemotracker.tag");
main.mostCurrent._tagm5 = RemoteObject.createNew ("com.calypsoinstruments.anemotracker.tag");
main.mostCurrent._tagm6 = RemoteObject.createNew ("com.calypsoinstruments.anemotracker.tag");
 //BA.debugLineNum = 96;BA.debugLine="Dim mControles As Map";
main.mostCurrent._mcontroles = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 97;BA.debugLine="Dim iMenuSelected=2 As Int";
main._imenuselected = BA.numberCast(int.class, 2);
 //BA.debugLineNum = 99;BA.debugLine="Private sp_period As ACSpinner";
main.mostCurrent._sp_period = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACSpinnerWrapper");
 //BA.debugLineNum = 100;BA.debugLine="Private lbl_track As Label";
main.mostCurrent._lbl_track = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 101;BA.debugLine="Private lbl_bt As Label";
main.mostCurrent._lbl_bt = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 102;BA.debugLine="Dim btn_bt As Button";
main.mostCurrent._btn_bt = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 103;BA.debugLine="Private lbl_mac As Label";
main.mostCurrent._lbl_mac = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 104;BA.debugLine="Private lbl_a, lbl_b, lbl_c, lbl_refresh As Label";
main.mostCurrent._lbl_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
main.mostCurrent._lbl_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
main.mostCurrent._lbl_c = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
main.mostCurrent._lbl_refresh = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 106;BA.debugLine="Dim bmp_background As Bitmap";
main.mostCurrent._bmp_background = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 //BA.debugLineNum = 111;BA.debugLine="Private pnl_equipment As Panel";
main.mostCurrent._pnl_equipment = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 112;BA.debugLine="Private sw_nmea As ACSwitch";
main.mostCurrent._sw_nmea = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACSwitchCompatWrapper");
 //BA.debugLineNum = 113;BA.debugLine="Private btn_wifi As ACButton";
main.mostCurrent._btn_wifi = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACButtonWrapper");
 //BA.debugLineNum = 115;BA.debugLine="Private btn_calComp As ACButton";
main.mostCurrent._btn_calcomp = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACButtonWrapper");
 //BA.debugLineNum = 117;BA.debugLine="Dim gyroEnabled As Boolean = False";
main._gyroenabled = main.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 119;BA.debugLine="Dim touchpanel As Panel";
main.mostCurrent._touchpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 120;BA.debugLine="Dim off_btn As ACButton";
main.mostCurrent._off_btn = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACButtonWrapper");
 //BA.debugLineNum = 121;BA.debugLine="Dim btnDis As Button";
main.mostCurrent._btndis = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 122;BA.debugLine="Dim offname_lbl As Label";
main.mostCurrent._offname_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 123;BA.debugLine="Dim offset_lbl As Label";
main.mostCurrent._offset_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 124;BA.debugLine="Private startAngle As Double";
main._startangle = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 125;BA.debugLine="Dim sw_realnorth As ACSwitch";
main.mostCurrent._sw_realnorth = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACSwitchCompatWrapper");
 //BA.debugLineNum = 126;BA.debugLine="Dim offstart_ang As Double";
main._offstart_ang = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 128;BA.debugLine="Dim olBleEnabled As Boolean = False";
main._olbleenabled = main.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 130;BA.debugLine="Private moveTouch As Boolean = False";
main._movetouch = main.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 131;BA.debugLine="Private tTouch As Long";
main._ttouch = RemoteObject.createImmutable(0L);
 //BA.debugLineNum = 132;BA.debugLine="Dim tag_list As List";
main.mostCurrent._tag_list = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _init_drawer() throws Exception{
try {
		Debug.PushSubsStack("init_drawer (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,428);
if (RapidSub.canDelegate("init_drawer")) { return com.calypsoinstruments.anemotracker.main.remoteMe.runUserSub(false, "main","init_drawer");}
 BA.debugLineNum = 428;BA.debugLine="Sub init_drawer";
Debug.ShouldStop(2048);
 BA.debugLineNum = 431;BA.debugLine="pnl_header.Initialize(\"\")";
Debug.ShouldStop(16384);
main.mostCurrent._pnl_header.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 432;BA.debugLine="imv_calypso.Initialize(\"\")";
Debug.ShouldStop(32768);
main.mostCurrent._imv_calypso.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 433;BA.debugLine="imv_calypso.Bitmap = LoadBitmapResize( File.DirAs";
Debug.ShouldStop(65536);
main.mostCurrent._imv_calypso.runMethod(false,"setBitmap",(main.mostCurrent.__c.runMethod(false,"LoadBitmapResize",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("calypso_drawer.jpg")),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80)))),(Object)(main.mostCurrent.__c.getField(true,"True"))).getObject()));
 BA.debugLineNum = 436;BA.debugLine="imv_equipment.Initialize(\"\")";
Debug.ShouldStop(524288);
main.mostCurrent._imv_equipment.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 440;BA.debugLine="NavDrawer.NavigationView.AddHeaderView( pnl_heade";
Debug.ShouldStop(8388608);
main.mostCurrent._navdrawer.runMethod(false,"getNavigationView").runVoidMethod ("AddHeaderView",(Object)((main.mostCurrent._pnl_header.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))));
 BA.debugLineNum = 441;BA.debugLine="pnl_header.Width =  300dip ' NavDrawer.DefaultHea";
Debug.ShouldStop(16777216);
main.mostCurrent._pnl_header.runMethod(true,"setWidth",main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300))));
 BA.debugLineNum = 443;BA.debugLine="pnl_header.AddView( imv_calypso, 0,0.1*pnl_header";
Debug.ShouldStop(67108864);
main.mostCurrent._pnl_header.runVoidMethod ("AddView",(Object)((main.mostCurrent._imv_calypso.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.1),main.mostCurrent._pnl_header.runMethod(true,"getHeight")}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.5),main.mostCurrent._pnl_header.runMethod(true,"getWidth")}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.8),main.mostCurrent._pnl_header.runMethod(true,"getHeight")}, "*",0, 0))));
 BA.debugLineNum = 444;BA.debugLine="pnl_header.AddView( imv_equipment, 0.5*pnl_header";
Debug.ShouldStop(134217728);
main.mostCurrent._pnl_header.runVoidMethod ("AddView",(Object)((main.mostCurrent._imv_equipment.getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.5),main.mostCurrent._pnl_header.runMethod(true,"getWidth")}, "*",0, 0))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.5),main.mostCurrent._pnl_header.runMethod(true,"getWidth")}, "*",0, 0))),(Object)(main.mostCurrent._pnl_header.runMethod(true,"getHeight")));
 BA.debugLineNum = 464;BA.debugLine="NavDrawer.NavigationView.LoadLayout(\"navHeaderLay";
Debug.ShouldStop(32768);
main.mostCurrent._navdrawer.runMethod(false,"getNavigationView").runVoidMethodAndSync ("LoadLayout",main.mostCurrent.activityBA,(Object)(BA.ObjectToString("navHeaderLayout")),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 800)))));
 BA.debugLineNum = 485;BA.debugLine="sp_period.Prompt = \"Track period\"";
Debug.ShouldStop(16);
main.mostCurrent._sp_period.runMethod(true,"setPrompt",BA.ObjectToCharSequence("Track period"));
 BA.debugLineNum = 486;BA.debugLine="sp_period.Add(\"Racing(5sec)\")";
Debug.ShouldStop(32);
main.mostCurrent._sp_period.runVoidMethod ("Add",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Racing(5sec)"))));
 BA.debugLineNum = 487;BA.debugLine="sp_period.Add(\"Daysail(1min)\")";
Debug.ShouldStop(64);
main.mostCurrent._sp_period.runVoidMethod ("Add",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Daysail(1min)"))));
 BA.debugLineNum = 488;BA.debugLine="sp_period.Add(\"Cruising(5min)\")";
Debug.ShouldStop(128);
main.mostCurrent._sp_period.runVoidMethod ("Add",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Cruising(5min)"))));
 BA.debugLineNum = 492;BA.debugLine="If Starter.connected Then ' hemos hecho cambio la";
Debug.ShouldStop(2048);
if (main.mostCurrent._starter._connected.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 493;BA.debugLine="add_secondary_drawer";
Debug.ShouldStop(4096);
_add_secondary_drawer();
 };
 BA.debugLineNum = 496;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _init_drawer2() throws Exception{
try {
		Debug.PushSubsStack("init_drawer2 (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,338);
if (RapidSub.canDelegate("init_drawer2")) { return com.calypsoinstruments.anemotracker.main.remoteMe.runUserSub(false, "main","init_drawer2");}
RemoteObject _actionviewitem = RemoteObject.declareNull("de.amberhome.objects.appcompat.ACMenuItemWrapper");
RemoteObject _menuhz = RemoteObject.declareNull("de.amberhome.objects.appcompat.ACSpinnerWrapper");
RemoteObject _submenu = RemoteObject.declareNull("de.amberhome.objects.appcompat.ACSubMenuWrapper");
int _i = 0;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _pagename = RemoteObject.createImmutable("");
 BA.debugLineNum = 338;BA.debugLine="Sub init_drawer2";
Debug.ShouldStop(131072);
 BA.debugLineNum = 358;BA.debugLine="NavDrawer.NavigationView.LoadLayout( \"navheaderLa";
Debug.ShouldStop(32);
main.mostCurrent._navdrawer.runMethod(false,"getNavigationView").runVoidMethodAndSync ("LoadLayout",main.mostCurrent.activityBA,(Object)(BA.ObjectToString("navheaderLayout.bal")),(Object)(main.mostCurrent._navdrawer.runMethod(true,"getDefaultHeaderHeight")));
 BA.debugLineNum = 363;BA.debugLine="NavDrawer.NavigationView.Menu.AddWithGroup2(1, 1,";
Debug.ShouldStop(1024);
main.mostCurrent._navdrawer.runMethod(false,"getNavigationView").runMethod(false,"getMenu").runMethod(false,"AddWithGroup2",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.ObjectToCharSequence("Home")),(Object)(main.mostCurrent._xml.runMethod(false,"GetDrawable",(Object)(RemoteObject.createImmutable("ic_home_black_24dp"))))).runMethod(true,"setChecked",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 367;BA.debugLine="Dim actionViewItem As ACMenuItem";
Debug.ShouldStop(16384);
_actionviewitem = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACMenuItemWrapper");Debug.locals.put("actionViewItem", _actionviewitem);
 BA.debugLineNum = 369;BA.debugLine="actionViewItem = NavDrawer.NavigationView.Menu.Ad";
Debug.ShouldStop(65536);
_actionviewitem = main.mostCurrent._navdrawer.runMethod(false,"getNavigationView").runMethod(false,"getMenu").runMethod(false,"AddWithGroup2",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.ObjectToCharSequence("A Switch")),(Object)(main.mostCurrent._xml.runMethod(false,"GetDrawable",(Object)(RemoteObject.createImmutable("ic_android_black_24dp")))));Debug.locals.put("actionViewItem", _actionviewitem);
 BA.debugLineNum = 371;BA.debugLine="sw_gyro.Initialize(\"switch\")";
Debug.ShouldStop(262144);
main.mostCurrent._sw_gyro.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("switch")));
 BA.debugLineNum = 374;BA.debugLine="actionViewItem.ActionView = sw_gyro";
Debug.ShouldStop(2097152);
_actionviewitem.runVoidMethod ("setActionView",(main.mostCurrent._sw_gyro.getObject()));
 BA.debugLineNum = 377;BA.debugLine="NavDrawer.NavigationView.Menu.SetGroupCheckable(1";
Debug.ShouldStop(16777216);
main.mostCurrent._navdrawer.runMethod(false,"getNavigationView").runMethod(false,"getMenu").runVoidMethod ("SetGroupCheckable",(Object)(BA.numberCast(int.class, 1)),(Object)(main.mostCurrent.__c.getField(true,"True")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 379;BA.debugLine="actionViewItem.Checkable = False";
Debug.ShouldStop(67108864);
_actionviewitem.runMethod(true,"setCheckable",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 381;BA.debugLine="actionViewItem = NavDrawer.NavigationView.Menu.Ad";
Debug.ShouldStop(268435456);
_actionviewitem = main.mostCurrent._navdrawer.runMethod(false,"getNavigationView").runMethod(false,"getMenu").runMethod(false,"AddWithGroup2",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.ObjectToCharSequence("Menu")),(Object)(main.mostCurrent._xml.runMethod(false,"GetDrawable",(Object)(RemoteObject.createImmutable("ic_android_black_24dp")))));Debug.locals.put("actionViewItem", _actionviewitem);
 BA.debugLineNum = 382;BA.debugLine="Dim menuHz As ACSpinner";
Debug.ShouldStop(536870912);
_menuhz = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACSpinnerWrapper");Debug.locals.put("menuHz", _menuhz);
 BA.debugLineNum = 383;BA.debugLine="menuHz.Initialize(\"menuHz\")";
Debug.ShouldStop(1073741824);
_menuhz.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("menuHz")));
 BA.debugLineNum = 384;BA.debugLine="menuHz.Add(\"1Hz\")";
Debug.ShouldStop(-2147483648);
_menuhz.runVoidMethod ("Add",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("1Hz"))));
 BA.debugLineNum = 385;BA.debugLine="menuHz.Add(\"1Hz\")";
Debug.ShouldStop(1);
_menuhz.runVoidMethod ("Add",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("1Hz"))));
 BA.debugLineNum = 386;BA.debugLine="menuHz.Add(\"1Hz\")";
Debug.ShouldStop(2);
_menuhz.runVoidMethod ("Add",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("1Hz"))));
 BA.debugLineNum = 387;BA.debugLine="actionViewItem.ActionView = menuHz";
Debug.ShouldStop(4);
_actionviewitem.runVoidMethod ("setActionView",(_menuhz.getObject()));
 BA.debugLineNum = 388;BA.debugLine="actionViewItem.Checkable = False";
Debug.ShouldStop(8);
_actionviewitem.runMethod(true,"setCheckable",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 391;BA.debugLine="NavDrawer.NavigationView.Menu.AddWithGroup2(2, 10";
Debug.ShouldStop(64);
main.mostCurrent._navdrawer.runMethod(false,"getNavigationView").runMethod(false,"getMenu").runVoidMethod ("AddWithGroup2",(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 10)),(Object)(BA.numberCast(int.class, 1000)),(Object)(BA.ObjectToCharSequence("Settings")),(Object)(main.mostCurrent._xml.runMethod(false,"GetDrawable",(Object)(RemoteObject.createImmutable("ic_settings_black_24dp")))));
 BA.debugLineNum = 392;BA.debugLine="NavDrawer.NavigationView.Menu.AddWithGroup2(2, 11";
Debug.ShouldStop(128);
main.mostCurrent._navdrawer.runMethod(false,"getNavigationView").runMethod(false,"getMenu").runVoidMethod ("AddWithGroup2",(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 11)),(Object)(BA.numberCast(int.class, 1100)),(Object)(BA.ObjectToCharSequence("Feedback")),(Object)(main.mostCurrent._xml.runMethod(false,"GetDrawable",(Object)(RemoteObject.createImmutable("ic_feedback_black_24dp")))));
 BA.debugLineNum = 393;BA.debugLine="NavDrawer.NavigationView.Menu.AddWithGroup2(2, 12";
Debug.ShouldStop(256);
main.mostCurrent._navdrawer.runMethod(false,"getNavigationView").runMethod(false,"getMenu").runVoidMethod ("AddWithGroup2",(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 12)),(Object)(BA.numberCast(int.class, 1200)),(Object)(BA.ObjectToCharSequence("Help")),(Object)(main.mostCurrent._xml.runMethod(false,"GetDrawable",(Object)(RemoteObject.createImmutable("ic_help_black_24dp")))));
 BA.debugLineNum = 394;BA.debugLine="NavDrawer.NavigationView.Menu.SetGroupCheckable(2";
Debug.ShouldStop(512);
main.mostCurrent._navdrawer.runMethod(false,"getNavigationView").runMethod(false,"getMenu").runVoidMethod ("SetGroupCheckable",(Object)(BA.numberCast(int.class, 2)),(Object)(main.mostCurrent.__c.getField(true,"True")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 397;BA.debugLine="NavDrawer.AddSecondaryDrawer(150dip, NavDrawer.GR";
Debug.ShouldStop(4096);
main.mostCurrent._navdrawer.runVoidMethod ("AddSecondaryDrawer",(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 150)))),(Object)(main.mostCurrent._navdrawer.getField(true,"GRAVITY_END")));
 BA.debugLineNum = 400;BA.debugLine="NavDrawer.SecondaryNavigationView.LoadLayout(\"nav";
Debug.ShouldStop(32768);
main.mostCurrent._navdrawer.runMethod(false,"getSecondaryNavigationView").runVoidMethodAndSync ("LoadLayout",main.mostCurrent.activityBA,(Object)(BA.ObjectToString("navHeaderLayout2")),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))));
 BA.debugLineNum = 402;BA.debugLine="NavDrawer.SecondaryNavigationView.LoadLayout(\"nav";
Debug.ShouldStop(131072);
main.mostCurrent._navdrawer.runMethod(false,"getSecondaryNavigationView").runVoidMethodAndSync ("LoadLayout",main.mostCurrent.activityBA,(Object)(BA.ObjectToString("navHeaderLayout2")),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 BA.debugLineNum = 406;BA.debugLine="NavDrawer.SecondaryNavigationView.ItemIconColor =";
Debug.ShouldStop(2097152);
main.mostCurrent._navdrawer.runMethod(false,"getSecondaryNavigationView").runVoidMethod ("setItemIconColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 407;BA.debugLine="NavDrawer.SecondaryNavigationView.SetItemTextColo";
Debug.ShouldStop(4194304);
main.mostCurrent._navdrawer.runMethod(false,"getSecondaryNavigationView").runVoidMethod ("SetItemTextColors",(Object)(main.mostCurrent.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(main.mostCurrent.__c.getField(false,"Colors").getField(true,"Red")),(Object)(main.mostCurrent.__c.getField(false,"Colors").getField(true,"Red")),(Object)(main.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray")));
 BA.debugLineNum = 412;BA.debugLine="Dim subMenu As ACSubMenu";
Debug.ShouldStop(134217728);
_submenu = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACSubMenuWrapper");Debug.locals.put("subMenu", _submenu);
 BA.debugLineNum = 413;BA.debugLine="subMenu = NavDrawer.SecondaryNavigationView.Menu.";
Debug.ShouldStop(268435456);
_submenu = main.mostCurrent._navdrawer.runMethod(false,"getSecondaryNavigationView").runMethod(false,"getMenu").runMethod(false,"AddSubMenu",(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 20)),(Object)(BA.numberCast(int.class, 20)),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Pages"))));Debug.locals.put("subMenu", _submenu);
 BA.debugLineNum = 415;BA.debugLine="For i = 0 To 2";
Debug.ShouldStop(1073741824);
{
final int step28 = 1;
final int limit28 = 2;
_i = 0 ;
for (;(step28 > 0 && _i <= limit28) || (step28 < 0 && _i >= limit28) ;_i = ((int)(0 + _i + step28))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 417;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(1);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 418;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(2);
_p.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 419;BA.debugLine="p.Color = Colors.RGB(Rnd(0,256), Rnd(0,256), Rnd";
Debug.ShouldStop(4);
_p.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(main.mostCurrent.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 256)))),(Object)(main.mostCurrent.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 256)))),(Object)(main.mostCurrent.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 256))))));
 BA.debugLineNum = 420;BA.debugLine="Dim pageName As String";
Debug.ShouldStop(8);
_pagename = RemoteObject.createImmutable("");Debug.locals.put("pageName", _pagename);
 BA.debugLineNum = 421;BA.debugLine="pageName = \"Page \" & i";
Debug.ShouldStop(16);
_pagename = RemoteObject.concat(RemoteObject.createImmutable("Page "),RemoteObject.createImmutable(_i));Debug.locals.put("pageName", _pagename);
 BA.debugLineNum = 423;BA.debugLine="subMenu.AddWithGroup2(3, 100+i, 100+i, pageName,";
Debug.ShouldStop(64);
_submenu.runVoidMethod ("AddWithGroup2",(Object)(BA.numberCast(int.class, 3)),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(100),RemoteObject.createImmutable(_i)}, "+",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(100),RemoteObject.createImmutable(_i)}, "+",1, 1)),(Object)(BA.ObjectToCharSequence(_pagename)),(Object)(main.mostCurrent._xml.runMethod(false,"GetDrawable",(Object)(RemoteObject.createImmutable("ic_bookmark_black_24dp")))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 425;BA.debugLine="NavDrawer.SecondaryNavigationView.CheckedItem = 1";
Debug.ShouldStop(256);
main.mostCurrent._navdrawer.runMethod(false,"getSecondaryNavigationView").runVoidMethod ("setCheckedItem",BA.numberCast(int.class, 100));
 BA.debugLineNum = 426;BA.debugLine="subMenu.SetGroupCheckable(3, True, True)";
Debug.ShouldStop(512);
_submenu.runVoidMethod ("SetGroupCheckable",(Object)(BA.numberCast(int.class, 3)),(Object)(main.mostCurrent.__c.getField(true,"True")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 427;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _init_dsb() throws Exception{
try {
		Debug.PushSubsStack("init_dsb (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,261);
if (RapidSub.canDelegate("init_dsb")) { return com.calypsoinstruments.anemotracker.main.remoteMe.runUserSub(false, "main","init_dsb");}
RemoteObject _item = RemoteObject.declareNull("de.amberhome.objects.appcompat.ACMenuItemWrapper");
RemoteObject _bd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
 BA.debugLineNum = 261;BA.debugLine="Sub init_dsb";
Debug.ShouldStop(16);
 BA.debugLineNum = 267;BA.debugLine="Dim item As ACMenuItem";
Debug.ShouldStop(1024);
_item = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACMenuItemWrapper");Debug.locals.put("item", _item);
 BA.debugLineNum = 268;BA.debugLine="Dim bd As BitmapDrawable";
Debug.ShouldStop(2048);
_bd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("bd", _bd);
 BA.debugLineNum = 269;BA.debugLine="bd.Initialize(LoadBitmap(File.DirAssets,\"Basic ic";
Debug.ShouldStop(4096);
_bd.runVoidMethod ("Initialize",(Object)((main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("Basic icon-01.png"))).getObject())));
 BA.debugLineNum = 270;BA.debugLine="bd.Gravity = Gravity.CENTER";
Debug.ShouldStop(8192);
_bd.runMethod(true,"setGravity",main.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 282;BA.debugLine="DSB.SetItemIconColors( Colors.Gray, Colors.White,";
Debug.ShouldStop(33554432);
main.mostCurrent._dsb.runVoidMethod ("SetItemIconColors",(Object)(main.mostCurrent.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(main.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(main.mostCurrent.__c.getField(false,"Colors").getField(true,"Black")));
 BA.debugLineNum = 283;BA.debugLine="DSB.SetItemTextColors( Colors.Gray, Colors.White,";
Debug.ShouldStop(67108864);
main.mostCurrent._dsb.runVoidMethod ("SetItemTextColors",(Object)(main.mostCurrent.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(main.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(main.mostCurrent.__c.getField(false,"Colors").getField(true,"Black")));
 BA.debugLineNum = 285;BA.debugLine="DSB.Menu.Add(2, 2, \"Four\", LoadBitmap(File.DirAss";
Debug.ShouldStop(268435456);
main.mostCurrent._dsb.runMethod(false,"getMenu").runMethod(false,"Add",(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.ObjectToCharSequence("Four")),(Object)((main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("Basic icon-01.png"))).getObject()))).runMethod(true,"setChecked",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 286;BA.debugLine="DSB.Menu.Add(3, 3, \"Map\", LoadBitmap(File.DirAsse";
Debug.ShouldStop(536870912);
main.mostCurrent._dsb.runMethod(false,"getMenu").runVoidMethod ("Add",(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.ObjectToCharSequence("Map")),(Object)((main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("Map icon-01.png"))).getObject())));
 BA.debugLineNum = 287;BA.debugLine="DSB.Menu.Add(4, 4, \"Tri\", LoadBitmap(File.DirAsse";
Debug.ShouldStop(1073741824);
main.mostCurrent._dsb.runMethod(false,"getMenu").runVoidMethod ("Add",(Object)(BA.numberCast(int.class, 4)),(Object)(BA.numberCast(int.class, 4)),(Object)(BA.ObjectToCharSequence("Tri")),(Object)((main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("Tridata icon-01.png"))).getObject())));
 BA.debugLineNum = 288;BA.debugLine="DSB.Menu.Add(5, 5, \"Multiple\", LoadBitmap(File.Di";
Debug.ShouldStop(-2147483648);
main.mostCurrent._dsb.runMethod(false,"getMenu").runVoidMethod ("Add",(Object)(BA.numberCast(int.class, 5)),(Object)(BA.numberCast(int.class, 5)),(Object)(BA.ObjectToCharSequence("Multiple")),(Object)((main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("Multi icon-01.png"))).getObject())));
 BA.debugLineNum = 298;BA.debugLine="Panel4.LoadLayout(\"Four\")";
Debug.ShouldStop(512);
main.mostCurrent._panel4.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Four")),main.mostCurrent.activityBA);
 BA.debugLineNum = 299;BA.debugLine="SetTiledBackground( Panel4, bmp_background )";
Debug.ShouldStop(1024);
_settiledbackground(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), main.mostCurrent._panel4.getObject()),main.mostCurrent._bmp_background);
 BA.debugLineNum = 302;BA.debugLine="ScaleFour.GetBase().Height = ScaleFour.getbase().";
Debug.ShouldStop(8192);
main.mostCurrent._scalefour.runClassMethod (com.calypsoinstruments.anemotracker.scale.class, "_getbase").runMethod(true,"setHeight",main.mostCurrent._scalefour.runClassMethod (com.calypsoinstruments.anemotracker.scale.class, "_getbase").runMethod(true,"getWidth"));
 BA.debugLineNum = 315;BA.debugLine="Panel3.LoadLayout(\"Tridata\")";
Debug.ShouldStop(67108864);
main.mostCurrent._panel3.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Tridata")),main.mostCurrent.activityBA);
 BA.debugLineNum = 316;BA.debugLine="SetTiledBackground( Panel3, bmp_background )";
Debug.ShouldStop(134217728);
_settiledbackground(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), main.mostCurrent._panel3.getObject()),main.mostCurrent._bmp_background);
 BA.debugLineNum = 317;BA.debugLine="TagTri1.mbase.Height = 0.33*Panel3.Height";
Debug.ShouldStop(268435456);
main.mostCurrent._tagtri1.getField(false,"_mbase").runMethod(true,"setHeight",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.33),main.mostCurrent._panel3.runMethod(true,"getHeight")}, "*",0, 0)));
 BA.debugLineNum = 318;BA.debugLine="TagTri1.mbase.Top = 0";
Debug.ShouldStop(536870912);
main.mostCurrent._tagtri1.getField(false,"_mbase").runMethod(true,"setTop",BA.numberCast(int.class, 0));
 BA.debugLineNum = 319;BA.debugLine="TagTri2.mbase.height = 0.33*Panel3.Height";
Debug.ShouldStop(1073741824);
main.mostCurrent._tagtri2.getField(false,"_mbase").runMethod(true,"setHeight",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.33),main.mostCurrent._panel3.runMethod(true,"getHeight")}, "*",0, 0)));
 BA.debugLineNum = 320;BA.debugLine="TagTri2.mbase.Top = 0.33*Panel3.Height";
Debug.ShouldStop(-2147483648);
main.mostCurrent._tagtri2.getField(false,"_mbase").runMethod(true,"setTop",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.33),main.mostCurrent._panel3.runMethod(true,"getHeight")}, "*",0, 0)));
 BA.debugLineNum = 321;BA.debugLine="TagTri3.mbase.height = 0.33*Panel3.Height";
Debug.ShouldStop(1);
main.mostCurrent._tagtri3.getField(false,"_mbase").runMethod(true,"setHeight",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.33),main.mostCurrent._panel3.runMethod(true,"getHeight")}, "*",0, 0)));
 BA.debugLineNum = 322;BA.debugLine="TagTri3.mbase.Top = 0.66*Panel3.Height";
Debug.ShouldStop(2);
main.mostCurrent._tagtri3.getField(false,"_mbase").runMethod(true,"setTop",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.66),main.mostCurrent._panel3.runMethod(true,"getHeight")}, "*",0, 0)));
 BA.debugLineNum = 324;BA.debugLine="PanelM.LoadLayout(\"Multiple\")";
Debug.ShouldStop(8);
main.mostCurrent._panelm.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Multiple")),main.mostCurrent.activityBA);
 BA.debugLineNum = 325;BA.debugLine="SetTiledBackground( PanelM, bmp_background )";
Debug.ShouldStop(16);
_settiledbackground(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), main.mostCurrent._panelm.getObject()),main.mostCurrent._bmp_background);
 BA.debugLineNum = 328;BA.debugLine="currentPanel = Panel4";
Debug.ShouldStop(128);
main.mostCurrent._currentpanel = main.mostCurrent._panel4;
 BA.debugLineNum = 329;BA.debugLine="iMenuSelected = 2";
Debug.ShouldStop(256);
main._imenuselected = BA.numberCast(int.class, 2);
 BA.debugLineNum = 337;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _init_messages() throws Exception{
try {
		Debug.PushSubsStack("init_messages (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,777);
if (RapidSub.canDelegate("init_messages")) { return com.calypsoinstruments.anemotracker.main.remoteMe.runUserSub(false, "main","init_messages");}
RemoteObject _result = RemoteObject.createImmutable(0);
 BA.debugLineNum = 777;BA.debugLine="Sub init_messages";
Debug.ShouldStop(256);
 BA.debugLineNum = 779;BA.debugLine="If Starter.bleEnabled = False Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",main.mostCurrent._starter._bleenabled,main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 780;BA.debugLine="Try";
Debug.ShouldStop(2048);
try { BA.debugLineNum = 781;BA.debugLine="bluetoothAd";
Debug.ShouldStop(4096);
_bluetoothad();
 BA.debugLineNum = 782;BA.debugLine="btn_bt.Enabled = False";
Debug.ShouldStop(8192);
main.mostCurrent._btn_bt.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 783;BA.debugLine="olBleEnabled = False";
Debug.ShouldStop(16384);
main._olbleenabled = main.mostCurrent.__c.getField(true,"False");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e7) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e7.toString()); BA.debugLineNum = 785;BA.debugLine="Log(LastException)";
Debug.ShouldStop(65536);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA))));
 };
 }else {
 BA.debugLineNum = 788;BA.debugLine="Try";
Debug.ShouldStop(524288);
try { BA.debugLineNum = 789;BA.debugLine="If olBleEnabled = False Then 'evitamos que este";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",main._olbleenabled,main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 790;BA.debugLine="btn_bt.Enabled = True";
Debug.ShouldStop(2097152);
main.mostCurrent._btn_bt.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 791;BA.debugLine="olBleEnabled = True";
Debug.ShouldStop(4194304);
main._olbleenabled = main.mostCurrent.__c.getField(true,"True");
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e16) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e16.toString()); BA.debugLineNum = 794;BA.debugLine="Log(LastException)";
Debug.ShouldStop(33554432);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA))));
 };
 };
 BA.debugLineNum = 798;BA.debugLine="Try";
Debug.ShouldStop(536870912);
try { BA.debugLineNum = 799;BA.debugLine="If Starter.gps1Enabled = False And rp.Check(rp.P";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",main.mostCurrent._starter._gps1enabled,main.mostCurrent.__c.getField(true,"False")) && RemoteObject.solveBoolean(".",main._rp.runMethod(true,"Check",(Object)(main._rp.getField(true,"PERMISSION_ACCESS_FINE_LOCATION")))) && RemoteObject.solveBoolean("=",main._olbleenabled,main.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 800;BA.debugLine="locationAd";
Debug.ShouldStop(-2147483648);
_locationad();
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e24) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e24.toString()); BA.debugLineNum = 803;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA))));
 };
 BA.debugLineNum = 806;BA.debugLine="Try";
Debug.ShouldStop(32);
try { BA.debugLineNum = 807;BA.debugLine="If Not ( kvs.ContainsKey( \"first_time\" ) ) Then";
Debug.ShouldStop(64);
if (main.mostCurrent.__c.runMethod(true,"Not",(Object)(main._kvs.runClassMethod (com.calypsoinstruments.anemotracker.keyvaluestore.class, "_containskey",(Object)(RemoteObject.createImmutable("first_time"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 808;BA.debugLine="Dim result As Int";
Debug.ShouldStop(128);
_result = RemoteObject.createImmutable(0);Debug.locals.put("result", _result);
 BA.debugLineNum = 809;BA.debugLine="result = Msgbox2( \"Please, let the app to colle";
Debug.ShouldStop(256);
_result = main.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Please, let the app to collect some information about the app usage. All information is anonimous"),main.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Do you allow the app to send us reports?")))),(Object)(BA.ObjectToCharSequence("Feedback")),(Object)(BA.ObjectToString("Yes")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((main.mostCurrent.__c.getField(false,"Null"))),main.mostCurrent.activityBA);Debug.locals.put("result", _result);
 BA.debugLineNum = 810;BA.debugLine="If result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, main.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 811;BA.debugLine="Starter.allowReport = True";
Debug.ShouldStop(1024);
main.mostCurrent._starter._allowreport = main.mostCurrent.__c.getField(true,"True");
 }else {
 BA.debugLineNum = 813;BA.debugLine="Starter.allowReport = False";
Debug.ShouldStop(4096);
main.mostCurrent._starter._allowreport = main.mostCurrent.__c.getField(true,"False");
 };
 BA.debugLineNum = 815;BA.debugLine="kvs.PutSimple( \"first_time\" , Starter.allowRepo";
Debug.ShouldStop(16384);
main._kvs.runClassMethod (com.calypsoinstruments.anemotracker.keyvaluestore.class, "_putsimple",(Object)(BA.ObjectToString("first_time")),(Object)((main.mostCurrent._starter._allowreport)));
 }else {
 BA.debugLineNum = 817;BA.debugLine="Starter.allowReport = IntToBool(kvs.GetSimple(\"";
Debug.ShouldStop(65536);
main.mostCurrent._starter._allowreport = main._inttobool.getArrayElement(true,BA.numberCast(int.class, main._kvs.runClassMethod (com.calypsoinstruments.anemotracker.keyvaluestore.class, "_getsimple",(Object)(RemoteObject.createImmutable("first_time")))));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e40) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e40.toString()); BA.debugLineNum = 820;BA.debugLine="Log(LastException)";
Debug.ShouldStop(524288);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA))));
 };
 BA.debugLineNum = 822;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _locationad() throws Exception{
try {
		Debug.PushSubsStack("locationAd (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1081);
if (RapidSub.canDelegate("locationad")) { return com.calypsoinstruments.anemotracker.main.remoteMe.runUserSub(false, "main","locationad");}
RemoteObject _result = RemoteObject.createImmutable(0);
 BA.debugLineNum = 1081;BA.debugLine="Sub locationAd";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 1082;BA.debugLine="Dim result As Int";
Debug.ShouldStop(33554432);
_result = RemoteObject.createImmutable(0);Debug.locals.put("result", _result);
 BA.debugLineNum = 1083;BA.debugLine="result = Msgbox2( \"Location is disabled. Do you w";
Debug.ShouldStop(67108864);
_result = main.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Location is disabled. Do you want to enable it?")),(Object)(BA.ObjectToCharSequence("Advise")),(Object)(BA.ObjectToString("Yes")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((main.mostCurrent.__c.getField(false,"Null"))),main.mostCurrent.activityBA);Debug.locals.put("result", _result);
 BA.debugLineNum = 1084;BA.debugLine="If result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, main.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 1085;BA.debugLine="NativeMe.RunMethod(\"enableLocation\", Null)";
Debug.ShouldStop(268435456);
main._nativeme.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("enableLocation")),(Object)((main.mostCurrent.__c.getField(false,"Null"))));
 }else {
 BA.debugLineNum = 1087;BA.debugLine="Msgbox(\"Please, enable location to allow using G";
Debug.ShouldStop(1073741824);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Please, enable location to allow using GPS")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Location service"))),main.mostCurrent.activityBA);
 };
 BA.debugLineNum = 1089;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _navdrawer_drawerclosed(RemoteObject _drawergravity) throws Exception{
try {
		Debug.PushSubsStack("NavDrawer_DrawerClosed (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,860);
if (RapidSub.canDelegate("navdrawer_drawerclosed")) { return com.calypsoinstruments.anemotracker.main.remoteMe.runUserSub(false, "main","navdrawer_drawerclosed", _drawergravity);}
Debug.locals.put("DrawerGravity", _drawergravity);
 BA.debugLineNum = 860;BA.debugLine="Sub NavDrawer_DrawerClosed (DrawerGravity As Int)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 862;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _navdrawer_draweropened(RemoteObject _drawergravity) throws Exception{
try {
		Debug.PushSubsStack("NavDrawer_DrawerOpened (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,864);
if (RapidSub.canDelegate("navdrawer_draweropened")) { return com.calypsoinstruments.anemotracker.main.remoteMe.runUserSub(false, "main","navdrawer_draweropened", _drawergravity);}
Debug.locals.put("DrawerGravity", _drawergravity);
 BA.debugLineNum = 864;BA.debugLine="Sub NavDrawer_DrawerOpened (DrawerGravity As Int)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 866;BA.debugLine="UpdateDrawer";
Debug.ShouldStop(2);
_updatedrawer();
 BA.debugLineNum = 867;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _navdrawer_drawerslide(RemoteObject _position,RemoteObject _drawergravity) throws Exception{
try {
		Debug.PushSubsStack("NavDrawer_DrawerSlide (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,869);
if (RapidSub.canDelegate("navdrawer_drawerslide")) { return com.calypsoinstruments.anemotracker.main.remoteMe.runUserSub(false, "main","navdrawer_drawerslide", _position, _drawergravity);}
Debug.locals.put("Position", _position);
Debug.locals.put("DrawerGravity", _drawergravity);
 BA.debugLineNum = 869;BA.debugLine="Sub NavDrawer_DrawerSlide (Position As Float, Draw";
Debug.ShouldStop(16);
 BA.debugLineNum = 871;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _navdrawer_navigationitemselected(RemoteObject _menuitem,RemoteObject _drawergravity) throws Exception{
try {
		Debug.PushSubsStack("NavDrawer_NavigationItemSelected (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,874);
if (RapidSub.canDelegate("navdrawer_navigationitemselected")) { return com.calypsoinstruments.anemotracker.main.remoteMe.runUserSub(false, "main","navdrawer_navigationitemselected", _menuitem, _drawergravity);}
Debug.locals.put("MenuItem", _menuitem);
Debug.locals.put("DrawerGravity", _drawergravity);
 BA.debugLineNum = 874;BA.debugLine="Sub NavDrawer_NavigationItemSelected (MenuItem As";
Debug.ShouldStop(512);
 BA.debugLineNum = 875;BA.debugLine="LogColor(\"NavItem selected: \" & MenuItem.Title, C";
Debug.ShouldStop(1024);
main.mostCurrent.__c.runVoidMethod ("LogColor",(Object)(RemoteObject.concat(RemoteObject.createImmutable("NavItem selected: "),_menuitem.runMethod(true,"getTitle"))),(Object)(main.mostCurrent.__c.getField(false,"Colors").getField(true,"Green")));
 BA.debugLineNum = 876;BA.debugLine="Log(MenuItem.Id )";
Debug.ShouldStop(2048);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(_menuitem.runMethod(true,"getId"))));
 BA.debugLineNum = 881;BA.debugLine="If MenuItem.Id = 2 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_menuitem.runMethod(true,"getId"),BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 882;BA.debugLine="sw_gyro.Checked = Not(sw_gyro.Checked)";
Debug.ShouldStop(131072);
main.mostCurrent._sw_gyro.runMethodAndSync(true,"setChecked",main.mostCurrent.__c.runMethod(true,"Not",(Object)(main.mostCurrent._sw_gyro.runMethod(true,"getChecked"))));
 BA.debugLineNum = 883;BA.debugLine="Return";
Debug.ShouldStop(262144);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 892;BA.debugLine="NavDrawer.CloseDrawer2(DrawerGravity)";
Debug.ShouldStop(134217728);
main.mostCurrent._navdrawer.runVoidMethod ("CloseDrawer2",(Object)(_drawergravity));
 BA.debugLineNum = 893;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _off_btn_click() throws Exception{
try {
		Debug.PushSubsStack("off_btn_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1137);
if (RapidSub.canDelegate("off_btn_click")) { return com.calypsoinstruments.anemotracker.main.remoteMe.runUserSub(false, "main","off_btn_click");}
RemoteObject _result = RemoteObject.createImmutable(0);
 BA.debugLineNum = 1137;BA.debugLine="Sub off_btn_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 1138;BA.debugLine="NavDrawer.CloseDrawers";
Debug.ShouldStop(131072);
main.mostCurrent._navdrawer.runVoidMethod ("CloseDrawers");
 BA.debugLineNum = 1140;BA.debugLine="Dim result As Int";
Debug.ShouldStop(524288);
_result = RemoteObject.createImmutable(0);Debug.locals.put("result", _result);
 BA.debugLineNum = 1141;BA.debugLine="result = Msgbox2( \"This function changes the offs";
Debug.ShouldStop(1048576);
_result = main.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("This function changes the offset of the compass. Use it only if you need to modify the bearing. Do you wish to continue?")),(Object)(BA.ObjectToCharSequence("Compass offset")),(Object)(BA.ObjectToString("Yes")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((main.mostCurrent.__c.getField(false,"Null"))),main.mostCurrent.activityBA);Debug.locals.put("result", _result);
 BA.debugLineNum = 1142;BA.debugLine="If result = DialogResponse.NEGATIVE Then Return";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, main.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE")))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 1155;BA.debugLine="touchpanel.BringToFront";
Debug.ShouldStop(4);
main.mostCurrent._touchpanel.runVoidMethod ("BringToFront");
 BA.debugLineNum = 1156;BA.debugLine="btnDis.Visible = True";
Debug.ShouldStop(8);
main.mostCurrent._btndis.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1157;BA.debugLine="offname_lbl.Visible = True";
Debug.ShouldStop(16);
main.mostCurrent._offname_lbl.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1158;BA.debugLine="offset_lbl.Visible = True";
Debug.ShouldStop(32);
main.mostCurrent._offset_lbl.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1159;BA.debugLine="offset_lbl.Text = NumberFormat( offset_angle, 1,";
Debug.ShouldStop(64);
main.mostCurrent._offset_lbl.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(main._offset_angle),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 0))),RemoteObject.createImmutable("°"))));
 BA.debugLineNum = 1160;BA.debugLine="sw_realnorth.Visible = True";
Debug.ShouldStop(128);
main.mostCurrent._sw_realnorth.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1162;BA.debugLine="edit_tags(tag_list, 0xFFFFFF, 10dip, 0dip, 0xFF00";
Debug.ShouldStop(512);
_edit_tags(main.mostCurrent._tag_list,BA.numberCast(int.class, 0xffffff),main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10))),main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),BA.numberCast(int.class, 0xff000000),main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1164;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
actble_subs_0._process_globals();
actlisttracks_subs_0._process_globals();
actnavigation_subs_0._process_globals();
acttcpip_subs_0._process_globals();
starter_subs_0._process_globals();
dbutils_subs_0._process_globals();
actcalcomp_subs_0._process_globals();
actdevinfo_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("com.calypsoinstruments.anemotracker.main");
actble.myClass = BA.getDeviceClass ("com.calypsoinstruments.anemotracker.actble");
actlisttracks.myClass = BA.getDeviceClass ("com.calypsoinstruments.anemotracker.actlisttracks");
actnavigation.myClass = BA.getDeviceClass ("com.calypsoinstruments.anemotracker.actnavigation");
acttcpip.myClass = BA.getDeviceClass ("com.calypsoinstruments.anemotracker.acttcpip");
starter.myClass = BA.getDeviceClass ("com.calypsoinstruments.anemotracker.starter");
dbutils.myClass = BA.getDeviceClass ("com.calypsoinstruments.anemotracker.dbutils");
keyvaluestore.myClass = BA.getDeviceClass ("com.calypsoinstruments.anemotracker.keyvaluestore");
windcalcs.myClass = BA.getDeviceClass ("com.calypsoinstruments.anemotracker.windcalcs");
scale.myClass = BA.getDeviceClass ("com.calypsoinstruments.anemotracker.scale");
customlistview.myClass = BA.getDeviceClass ("com.calypsoinstruments.anemotracker.customlistview");
actcalcomp.myClass = BA.getDeviceClass ("com.calypsoinstruments.anemotracker.actcalcomp");
actdevinfo.myClass = BA.getDeviceClass ("com.calypsoinstruments.anemotracker.actdevinfo");
autotextsizelabel.myClass = BA.getDeviceClass ("com.calypsoinstruments.anemotracker.autotextsizelabel");
tag.myClass = BA.getDeviceClass ("com.calypsoinstruments.anemotracker.tag");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 29;BA.debugLine="Dim kvs As KeyValueStore";
main._kvs = RemoteObject.createNew ("com.calypsoinstruments.anemotracker.keyvaluestore");
 //BA.debugLineNum = 30;BA.debugLine="Dim portrait As Boolean";
main._portrait = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 31;BA.debugLine="Dim rp As RuntimePermissions";
main._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");
 //BA.debugLineNum = 32;BA.debugLine="Dim GPSEnabled = False As Boolean";
main._gpsenabled = main.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 33;BA.debugLine="Dim bPaused = False As Boolean";
main._bpaused = main.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 34;BA.debugLine="Dim bmp_calypso, bmp_cups, bmp_ultra, bmp_nmea, b";
main._bmp_calypso = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
main._bmp_cups = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
main._bmp_ultra = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
main._bmp_nmea = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
main._bmp_bt = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private NativeMe As JavaObject 'Para meter codigo";
main._nativeme = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
 //BA.debugLineNum = 38;BA.debugLine="Dim offset_angle As Double";
main._offset_angle = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 39;BA.debugLine="Dim dec As Double";
main._dec = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 41;BA.debugLine="Dim IntToBool() As Boolean";
main._inttobool = RemoteObject.createNewArray ("boolean", new int[] {0}, new Object[]{});
 //BA.debugLineNum = 42;BA.debugLine="IntToBool = Array As Boolean(False, True)";
main._inttobool = RemoteObject.createNewArray("boolean",new int[] {2},new Object[] {main.mostCurrent.__c.getField(true,"False"),main.mostCurrent.__c.getField(true,"True")});
 //BA.debugLineNum = 44;BA.debugLine="Dim firstStart As Boolean = True";
main._firststart = main.mostCurrent.__c.getField(true,"True");
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _remove_secondary_drawer() throws Exception{
try {
		Debug.PushSubsStack("remove_secondary_drawer (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,573);
if (RapidSub.canDelegate("remove_secondary_drawer")) { return com.calypsoinstruments.anemotracker.main.remoteMe.runUserSub(false, "main","remove_secondary_drawer");}
 BA.debugLineNum = 573;BA.debugLine="Sub remove_secondary_drawer";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 574;BA.debugLine="pnl_equipment.RemoveAllViews";
Debug.ShouldStop(536870912);
main.mostCurrent._pnl_equipment.runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 580;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settiledbackground(RemoteObject _v,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetTiledBackground (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,688);
if (RapidSub.canDelegate("settiledbackground")) { return com.calypsoinstruments.anemotracker.main.remoteMe.runUserSub(false, "main","settiledbackground", _v, _b);}
RemoteObject _bd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
Debug.locals.put("v", _v);
Debug.locals.put("b", _b);
 BA.debugLineNum = 688;BA.debugLine="Sub SetTiledBackground(v As View, b As Bitmap)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 689;BA.debugLine="Dim bd As BitmapDrawable";
Debug.ShouldStop(65536);
_bd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("bd", _bd);
 BA.debugLineNum = 690;BA.debugLine="bd.Initialize(b)";
Debug.ShouldStop(131072);
_bd.runVoidMethod ("Initialize",(Object)((_b.getObject())));
 BA.debugLineNum = 693;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(1048576);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 694;BA.debugLine="r.Target = bd";
Debug.ShouldStop(2097152);
_r.setField ("Target",(_bd.getObject()));
 BA.debugLineNum = 695;BA.debugLine="r.RunMethod3(\"setTileModeXY\",\"REPEAT\", \"android.g";
Debug.ShouldStop(4194304);
_r.runVoidMethod ("RunMethod3",(Object)(BA.ObjectToString("setTileModeXY")),(Object)(BA.ObjectToString("REPEAT")),(Object)(BA.ObjectToString("android.graphics.Shader$TileMode")),(Object)(BA.ObjectToString("REPEAT")),(Object)(RemoteObject.createImmutable("android.graphics.Shader$TileMode")));
 BA.debugLineNum = 697;BA.debugLine="v.Background = bd";
Debug.ShouldStop(16777216);
_v.runMethod(false,"setBackground",(_bd.getObject()));
 BA.debugLineNum = 698;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sp_hz_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("sp_Hz_ItemClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,907);
if (RapidSub.canDelegate("sp_hz_itemclick")) { return com.calypsoinstruments.anemotracker.main.remoteMe.runUserSub(false, "main","sp_hz_itemclick", _position, _value);}
RemoteObject _str = RemoteObject.createImmutable("");
RemoteObject _bc = RemoteObject.declareNull("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 907;BA.debugLine="Sub sp_Hz_ItemClick (Position As Int, Value As Obj";
Debug.ShouldStop(1024);
 BA.debugLineNum = 909;BA.debugLine="If Position = 0 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 910;BA.debugLine="Dim str = \"01\" As String";
Debug.ShouldStop(8192);
_str = BA.ObjectToString("01");Debug.locals.put("str", _str);Debug.locals.put("str", _str);
 BA.debugLineNum = 911;BA.debugLine="Starter.calcs_1.refresh_hz = 1.0";
Debug.ShouldStop(16384);
main.mostCurrent._starter._calcs_1.setField ("_refresh_hz",BA.numberCast(float.class, 1.0));
 }else 
{ BA.debugLineNum = 912;BA.debugLine="Else If Position = 1 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 913;BA.debugLine="Dim str = \"04\" As String";
Debug.ShouldStop(65536);
_str = BA.ObjectToString("04");Debug.locals.put("str", _str);Debug.locals.put("str", _str);
 BA.debugLineNum = 914;BA.debugLine="Starter.calcs_1.refresh_hz = 4.0";
Debug.ShouldStop(131072);
main.mostCurrent._starter._calcs_1.setField ("_refresh_hz",BA.numberCast(float.class, 4.0));
 }else {
 BA.debugLineNum = 916;BA.debugLine="Dim str = \"08\" As String";
Debug.ShouldStop(524288);
_str = BA.ObjectToString("08");Debug.locals.put("str", _str);Debug.locals.put("str", _str);
 BA.debugLineNum = 917;BA.debugLine="Starter.calcs_1.refresh_hz = 8.0";
Debug.ShouldStop(1048576);
main.mostCurrent._starter._calcs_1.setField ("_refresh_hz",BA.numberCast(float.class, 8.0));
 }}
;
 BA.debugLineNum = 919;BA.debugLine="Starter.calcs_1.mean_checked( Starter.calcs_1.mea";
Debug.ShouldStop(4194304);
main.mostCurrent._starter._calcs_1.runClassMethod (com.calypsoinstruments.anemotracker.windcalcs.class, "_mean_checked",(Object)(main.mostCurrent._starter._calcs_1.getField(true,"_mean_sw")));
 BA.debugLineNum = 920;BA.debugLine="Dim bc As ByteConverter";
Debug.ShouldStop(8388608);
_bc = RemoteObject.createNew ("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");Debug.locals.put("bc", _bc);
 BA.debugLineNum = 921;BA.debugLine="bc.LittleEndian = True";
Debug.ShouldStop(16777216);
_bc.runMethod(true,"setLittleEndian",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 922;BA.debugLine="If Starter.connected And Starter.deviceType = 2 T";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean(".",main.mostCurrent._starter._connected) && RemoteObject.solveBoolean("=",main.mostCurrent._starter._devicetype,BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 923;BA.debugLine="Starter.Scan.WriteData( Starter.sUltra, Starter.";
Debug.ShouldStop(67108864);
main.mostCurrent._starter._scan.runVoidMethod ("WriteData",(Object)(main.mostCurrent._starter._sultra),(Object)(main.mostCurrent._starter._crate),(Object)(_bc.runMethod(false,"HexToBytes",(Object)(_str))));
 BA.debugLineNum = 924;BA.debugLine="Starter.Scan.ReadData2( Starter.sUltra, Starter.";
Debug.ShouldStop(134217728);
main.mostCurrent._starter._scan.runVoidMethod ("ReadData2",(Object)(main.mostCurrent._starter._sultra),(Object)(main.mostCurrent._starter._crate));
 };
 BA.debugLineNum = 926;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sp_period_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("sp_period_ItemClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,897);
if (RapidSub.canDelegate("sp_period_itemclick")) { return com.calypsoinstruments.anemotracker.main.remoteMe.runUserSub(false, "main","sp_period_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 897;BA.debugLine="Sub sp_period_ItemClick (Position As Int, Value As";
Debug.ShouldStop(1);
 BA.debugLineNum = 899;BA.debugLine="If Position = 0 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 900;BA.debugLine="Starter.Timer_sqlite.Interval = 1000";
Debug.ShouldStop(8);
main.mostCurrent._starter._timer_sqlite.runMethod(true,"setInterval",BA.numberCast(long.class, 1000));
 }else 
{ BA.debugLineNum = 901;BA.debugLine="Else If Position = 1 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 902;BA.debugLine="Starter.Timer_sqlite.Interval = 60000";
Debug.ShouldStop(32);
main.mostCurrent._starter._timer_sqlite.runMethod(true,"setInterval",BA.numberCast(long.class, 60000));
 }else {
 BA.debugLineNum = 904;BA.debugLine="Starter.Timer_sqlite.Interval = 300000";
Debug.ShouldStop(128);
main.mostCurrent._starter._timer_sqlite.runMethod(true,"setInterval",BA.numberCast(long.class, 300000));
 }}
;
 BA.debugLineNum = 906;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sw_gyro_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("sw_gyro_CheckedChange (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,932);
if (RapidSub.canDelegate("sw_gyro_checkedchange")) { return com.calypsoinstruments.anemotracker.main.remoteMe.runUserSub(false, "main","sw_gyro_checkedchange", _checked);}
RemoteObject _bc = RemoteObject.declareNull("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 932;BA.debugLine="Sub sw_gyro_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(8);
 BA.debugLineNum = 934;BA.debugLine="Dim bc As ByteConverter";
Debug.ShouldStop(32);
_bc = RemoteObject.createNew ("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");Debug.locals.put("bc", _bc);
 BA.debugLineNum = 935;BA.debugLine="bc.LittleEndian = True";
Debug.ShouldStop(64);
_bc.runMethod(true,"setLittleEndian",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 936;BA.debugLine="If Starter.connected Then";
Debug.ShouldStop(128);
if (main.mostCurrent._starter._connected.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 937;BA.debugLine="If Checked Then";
Debug.ShouldStop(256);
if (_checked.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 938;BA.debugLine="Starter.Scan.WriteData( Starter.sUltra, Starter";
Debug.ShouldStop(512);
main.mostCurrent._starter._scan.runVoidMethod ("WriteData",(Object)(main.mostCurrent._starter._sultra),(Object)(main.mostCurrent._starter._csensors),(Object)(_bc.runMethod(false,"HexToBytes",(Object)(RemoteObject.createImmutable("01")))));
 }else {
 BA.debugLineNum = 940;BA.debugLine="Starter.Scan.WriteData( Starter.sUltra, Starter";
Debug.ShouldStop(2048);
main.mostCurrent._starter._scan.runVoidMethod ("WriteData",(Object)(main.mostCurrent._starter._sultra),(Object)(main.mostCurrent._starter._csensors),(Object)(_bc.runMethod(false,"HexToBytes",(Object)(RemoteObject.createImmutable("00")))));
 };
 BA.debugLineNum = 942;BA.debugLine="gyroEnabled = Checked";
Debug.ShouldStop(8192);
main._gyroenabled = _checked;
 };
 BA.debugLineNum = 944;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sw_mean_checkedchanged(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("sw_mean_CheckedChanged (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,928);
if (RapidSub.canDelegate("sw_mean_checkedchanged")) { return com.calypsoinstruments.anemotracker.main.remoteMe.runUserSub(false, "main","sw_mean_checkedchanged", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 928;BA.debugLine="Sub sw_mean_CheckedChanged( Checked As Boolean )";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 929;BA.debugLine="Log(\"mean\"&Checked)";
Debug.ShouldStop(1);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("mean"),_checked)));
 BA.debugLineNum = 930;BA.debugLine="Starter.calcs_1.mean_checked( Checked )";
Debug.ShouldStop(2);
main.mostCurrent._starter._calcs_1.runClassMethod (com.calypsoinstruments.anemotracker.windcalcs.class, "_mean_checked",(Object)(_checked));
 BA.debugLineNum = 931;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sw_nmea_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("sw_nmea_CheckedChange (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,975);
if (RapidSub.canDelegate("sw_nmea_checkedchange")) { return com.calypsoinstruments.anemotracker.main.remoteMe.runUserSub(false, "main","sw_nmea_checkedchange", _checked);}
RemoteObject _bc = RemoteObject.declareNull("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 975;BA.debugLine="Sub sw_nmea_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 976;BA.debugLine="Log(\"sw_nmea \"&Checked)";
Debug.ShouldStop(32768);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("sw_nmea "),_checked)));
 BA.debugLineNum = 977;BA.debugLine="Dim bc As ByteConverter";
Debug.ShouldStop(65536);
_bc = RemoteObject.createNew ("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");Debug.locals.put("bc", _bc);
 BA.debugLineNum = 978;BA.debugLine="bc.LittleEndian = True";
Debug.ShouldStop(131072);
_bc.runMethod(true,"setLittleEndian",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 979;BA.debugLine="If Starter.connected Then";
Debug.ShouldStop(262144);
if (main.mostCurrent._starter._connected.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 980;BA.debugLine="If Checked Then";
Debug.ShouldStop(524288);
if (_checked.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 981;BA.debugLine="Starter.Scan.WriteData( Starter.sUltra, Starter";
Debug.ShouldStop(1048576);
main.mostCurrent._starter._scan.runVoidMethod ("WriteData",(Object)(main.mostCurrent._starter._sultra),(Object)(main.mostCurrent._starter._cnmea),(Object)(_bc.runMethod(false,"HexToBytes",(Object)(RemoteObject.createImmutable("01")))));
 }else {
 BA.debugLineNum = 983;BA.debugLine="Starter.Scan.WriteData( Starter.sUltra, Starter";
Debug.ShouldStop(4194304);
main.mostCurrent._starter._scan.runVoidMethod ("WriteData",(Object)(main.mostCurrent._starter._sultra),(Object)(main.mostCurrent._starter._cnmea),(Object)(_bc.runMethod(false,"HexToBytes",(Object)(RemoteObject.createImmutable("00")))));
 };
 };
 BA.debugLineNum = 986;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sw_realnorth_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("sw_realnorth_CheckedChange (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1181);
if (RapidSub.canDelegate("sw_realnorth_checkedchange")) { return com.calypsoinstruments.anemotracker.main.remoteMe.runUserSub(false, "main","sw_realnorth_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 1181;BA.debugLine="Sub sw_realnorth_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 1182;BA.debugLine="If Checked Then";
Debug.ShouldStop(536870912);
if (_checked.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1183;BA.debugLine="dec = verDeclinacion";
Debug.ShouldStop(1073741824);
main._dec = BA.numberCast(double.class, _verdeclinacion());
 BA.debugLineNum = 1184;BA.debugLine="offset_angle = offset_angle + dec";
Debug.ShouldStop(-2147483648);
main._offset_angle = RemoteObject.solve(new RemoteObject[] {main._offset_angle,main._dec}, "+",1, 0);
 BA.debugLineNum = 1185;BA.debugLine="ToastMessageShow(\"Mag declination: \" & dec, True";
Debug.ShouldStop(1);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Mag declination: "),main._dec))),(Object)(main.mostCurrent.__c.getField(true,"True")));
 }else {
 BA.debugLineNum = 1187;BA.debugLine="offset_angle = offset_angle - dec";
Debug.ShouldStop(4);
main._offset_angle = RemoteObject.solve(new RemoteObject[] {main._offset_angle,main._dec}, "-",1, 0);
 BA.debugLineNum = 1188;BA.debugLine="ToastMessageShow(\"Set to Magnetic North\", True)";
Debug.ShouldStop(8);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Set to Magnetic North")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 1190;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _sw_track_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("sw_track_CheckedChange (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,945);
if (RapidSub.canDelegate("sw_track_checkedchange")) { com.calypsoinstruments.anemotracker.main.remoteMe.runUserSub(false, "main","sw_track_checkedchange", _checked); return;}
ResumableSub_sw_track_CheckedChange rsub = new ResumableSub_sw_track_CheckedChange(null,_checked);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_sw_track_CheckedChange extends BA.ResumableSub {
public ResumableSub_sw_track_CheckedChange(com.calypsoinstruments.anemotracker.main parent,RemoteObject _checked) {
this.parent = parent;
this._checked = _checked;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
com.calypsoinstruments.anemotracker.main parent;
RemoteObject _checked;
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("sw_track_CheckedChange (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,945);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 946;BA.debugLine="Log(\"sw_track \"&Checked)";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("sw_track "),_checked)));
 BA.debugLineNum = 947;BA.debugLine="If Starter.navigation = 0 Then";
Debug.ShouldStop(262144);
if (true) break;

case 1:
//if
this.state = 22;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._starter._navigation,BA.numberCast(double.class, 0))) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 948;BA.debugLine="If Checked Then";
Debug.ShouldStop(524288);
if (true) break;

case 4:
//if
this.state = 7;
if (_checked.<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 949;BA.debugLine="StartActivity( actListTracks )";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((parent.mostCurrent._actlisttracks.getObject())));
 if (true) break;

case 7:
//C
this.state = 22;
;
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 953;BA.debugLine="If Checked Then";
Debug.ShouldStop(16777216);
if (true) break;

case 10:
//if
this.state = 21;
if (_checked.<Boolean>get().booleanValue()) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 21;
 BA.debugLineNum = 954;BA.debugLine="CallSubDelayed3( Starter, \"start_nav\", Starter.";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed3",main.processBA,(Object)((parent.mostCurrent._starter.getObject())),(Object)(BA.ObjectToString("start_nav")),(Object)((parent.mostCurrent._starter._navigation)),(Object)((RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString(parent.mostCurrent.__c.getField(false,"Null")),BA.ObjectToString(parent.mostCurrent.__c.getField(false,"Null"))}))));
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 956;BA.debugLine="Dim result As Int";
Debug.ShouldStop(134217728);
_result = RemoteObject.createImmutable(0);Debug.locals.put("result", _result);
 BA.debugLineNum = 957;BA.debugLine="result = Msgbox2( \"Track: \" & Starter.nav_name,";
Debug.ShouldStop(268435456);
_result = parent.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Track: "),parent.mostCurrent._starter._nav_name))),(Object)(BA.ObjectToCharSequence("Stop Tracking? ")),(Object)(BA.ObjectToString("Yes")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.mostCurrent.__c.getField(false,"Null"))),main.mostCurrent.activityBA);Debug.locals.put("result", _result);
 BA.debugLineNum = 960;BA.debugLine="If result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 15:
//if
this.state = 20;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 17;
}else {
this.state = 19;
}if (true) break;

case 17:
//C
this.state = 20;
 BA.debugLineNum = 961;BA.debugLine="CallSubDelayed( Starter, \"stop_nav\" )";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed",main.processBA,(Object)((parent.mostCurrent._starter.getObject())),(Object)(RemoteObject.createImmutable("stop_nav")));
 BA.debugLineNum = 962;BA.debugLine="Starter.navigation = 0";
Debug.ShouldStop(2);
parent.mostCurrent._starter._navigation = BA.numberCast(int.class, 0);
 BA.debugLineNum = 965;BA.debugLine="sw_track.Checked = False";
Debug.ShouldStop(16);
parent.mostCurrent._sw_track.runMethodAndSync(true,"setChecked",parent.mostCurrent.__c.getField(true,"False"));
 if (true) break;

case 19:
//C
this.state = 20;
 if (true) break;

case 20:
//C
this.state = 21;
;
 if (true) break;

case 21:
//C
this.state = 22;
;
 if (true) break;

case 22:
//C
this.state = -1;
;
 BA.debugLineNum = 971;BA.debugLine="Sleep(200)";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("Sleep",main.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this),BA.numberCast(int.class, 200));
this.state = 23;
return;
case 23:
//C
this.state = -1;
;
 BA.debugLineNum = 972;BA.debugLine="UpdateDrawer";
Debug.ShouldStop(2048);
_updatedrawer();
 BA.debugLineNum = 973;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
public static RemoteObject  _touchpanel_touch(RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("touchpanel_Touch (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1091);
if (RapidSub.canDelegate("touchpanel_touch")) { return com.calypsoinstruments.anemotracker.main.remoteMe.runUserSub(false, "main","touchpanel_touch", _action, _x, _y);}
RemoteObject _xc = RemoteObject.createImmutable(0);
RemoteObject _yc = RemoteObject.createImmutable(0);
RemoteObject _cop = RemoteObject.createImmutable(0);
RemoteObject _ccon = RemoteObject.createImmutable(0);
RemoteObject _angulo = RemoteObject.createImmutable(0);
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 1091;BA.debugLine="Sub touchpanel_Touch (Action As Int, X As Float, Y";
Debug.ShouldStop(4);
 BA.debugLineNum = 1092;BA.debugLine="Private Xc,Yc As Int";
Debug.ShouldStop(8);
_xc = RemoteObject.createImmutable(0);Debug.locals.put("Xc", _xc);
_yc = RemoteObject.createImmutable(0);Debug.locals.put("Yc", _yc);
 BA.debugLineNum = 1093;BA.debugLine="Private cOp, Ccon As Double";
Debug.ShouldStop(16);
_cop = RemoteObject.createImmutable(0);Debug.locals.put("cOp", _cop);
_ccon = RemoteObject.createImmutable(0);Debug.locals.put("Ccon", _ccon);
 BA.debugLineNum = 1095;BA.debugLine="Dim angulo As Double";
Debug.ShouldStop(64);
_angulo = RemoteObject.createImmutable(0);Debug.locals.put("angulo", _angulo);
 BA.debugLineNum = 1096;BA.debugLine="Xc = touchpanel.Left+touchpanel.Width/2";
Debug.ShouldStop(128);
_xc = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {main.mostCurrent._touchpanel.runMethod(true,"getLeft"),main.mostCurrent._touchpanel.runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "+/",1, 0));Debug.locals.put("Xc", _xc);
 BA.debugLineNum = 1097;BA.debugLine="Yc = touchpanel.top+touchpanel.Height/2";
Debug.ShouldStop(256);
_yc = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {main.mostCurrent._touchpanel.runMethod(true,"getTop"),main.mostCurrent._touchpanel.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "+/",1, 0));Debug.locals.put("Yc", _yc);
 BA.debugLineNum = 1098;BA.debugLine="Ccon = X - Xc";
Debug.ShouldStop(512);
_ccon = RemoteObject.solve(new RemoteObject[] {_x,_xc}, "-",1, 0);Debug.locals.put("Ccon", _ccon);
 BA.debugLineNum = 1099;BA.debugLine="cOp = Y -Yc";
Debug.ShouldStop(1024);
_cop = RemoteObject.solve(new RemoteObject[] {_y,_yc}, "-",1, 0);Debug.locals.put("cOp", _cop);
 BA.debugLineNum = 1100;BA.debugLine="angulo = ATan2D(cOp, Ccon) + 90";
Debug.ShouldStop(2048);
_angulo = RemoteObject.solve(new RemoteObject[] {main.mostCurrent.__c.runMethod(true,"ATan2D",(Object)(_cop),(Object)(_ccon)),RemoteObject.createImmutable(90)}, "+",1, 0);Debug.locals.put("angulo", _angulo);
 BA.debugLineNum = 1101;BA.debugLine="If angulo < 0 Then angulo = 360 + angulo";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("<",_angulo,BA.numberCast(double.class, 0))) { 
_angulo = RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(360),_angulo}, "+",1, 0);Debug.locals.put("angulo", _angulo);};
 BA.debugLineNum = 1103;BA.debugLine="If Action = Activity.ACTION_MOVE And DateTime.Now";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, main.mostCurrent._activity.getField(true,"ACTION_MOVE"))) && RemoteObject.solveBoolean(">",RemoteObject.solve(new RemoteObject[] {main.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"),RemoteObject.createImmutable(500)}, "-",1, 2),BA.numberCast(double.class, main._ttouch))) { 
 BA.debugLineNum = 1104;BA.debugLine="Log(\"angulo: \" & angulo)";
Debug.ShouldStop(32768);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("angulo: "),_angulo)));
 BA.debugLineNum = 1105;BA.debugLine="offset_angle = (angulo - startAngle) - offstart_";
Debug.ShouldStop(65536);
main._offset_angle = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_angulo,main._startangle}, "-",1, 0)),main._offstart_ang,main._offset_angle}, "-+",2, 0);
 BA.debugLineNum = 1106;BA.debugLine="offstart_ang = (angulo - startAngle)";
Debug.ShouldStop(131072);
main._offstart_ang = (RemoteObject.solve(new RemoteObject[] {_angulo,main._startangle}, "-",1, 0));
 BA.debugLineNum = 1107;BA.debugLine="If Not(moveTouch) Then moveTouch = True";
Debug.ShouldStop(262144);
if (main.mostCurrent.__c.runMethod(true,"Not",(Object)(main._movetouch)).<Boolean>get().booleanValue()) { 
main._movetouch = main.mostCurrent.__c.getField(true,"True");};
 }else 
{ BA.debugLineNum = 1109;BA.debugLine="Else If Action = Activity.ACTION_UP And moveTouch";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, main.mostCurrent._activity.getField(true,"ACTION_UP"))) && RemoteObject.solveBoolean("=",main._movetouch,main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1110;BA.debugLine="If Ccon > 0 Then 'click derecha";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean(">",_ccon,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1111;BA.debugLine="Log(\"click drch\")";
Debug.ShouldStop(4194304);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("click drch")));
 BA.debugLineNum = 1112;BA.debugLine="offset_angle = offset_angle + 1";
Debug.ShouldStop(8388608);
main._offset_angle = RemoteObject.solve(new RemoteObject[] {main._offset_angle,RemoteObject.createImmutable(1)}, "+",1, 0);
 }else {
 BA.debugLineNum = 1114;BA.debugLine="Log(\"click izq\")";
Debug.ShouldStop(33554432);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("click izq")));
 BA.debugLineNum = 1115;BA.debugLine="offset_angle = offset_angle - 1";
Debug.ShouldStop(67108864);
main._offset_angle = RemoteObject.solve(new RemoteObject[] {main._offset_angle,RemoteObject.createImmutable(1)}, "-",1, 0);
 };
 }else 
{ BA.debugLineNum = 1118;BA.debugLine="Else If Action = Activity.ACTION_DOWN Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, main.mostCurrent._activity.getField(true,"ACTION_DOWN")))) { 
 BA.debugLineNum = 1119;BA.debugLine="tTouch = DateTime.Now";
Debug.ShouldStop(1073741824);
main._ttouch = main.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow");
 BA.debugLineNum = 1120;BA.debugLine="moveTouch = False";
Debug.ShouldStop(-2147483648);
main._movetouch = main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 1121;BA.debugLine="startAngle = angulo";
Debug.ShouldStop(1);
main._startangle = _angulo;
 BA.debugLineNum = 1122;BA.debugLine="offstart_ang = 0";
Debug.ShouldStop(2);
main._offstart_ang = BA.numberCast(double.class, 0);
 }}}
;
 BA.debugLineNum = 1125;BA.debugLine="offset_lbl.Text = NumberFormat( offset_angle, 1,";
Debug.ShouldStop(16);
main.mostCurrent._offset_lbl.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(main._offset_angle),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 0))),RemoteObject.createImmutable("°"))));
 BA.debugLineNum = 1126;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _update(RemoteObject _selected) throws Exception{
try {
		Debug.PushSubsStack("Update (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,749);
if (RapidSub.canDelegate("update")) { com.calypsoinstruments.anemotracker.main.remoteMe.runUserSub(false, "main","update", _selected); return;}
ResumableSub_Update rsub = new ResumableSub_Update(null,_selected);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Update extends BA.ResumableSub {
public ResumableSub_Update(com.calypsoinstruments.anemotracker.main parent,RemoteObject _selected) {
this.parent = parent;
this._selected = _selected;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
com.calypsoinstruments.anemotracker.main parent;
RemoteObject _selected;
RemoteObject _lcontroles = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _control = RemoteObject.declareNull("Object");
RemoteObject group5;
int index5;
int groupLen5;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Update (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,749);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("selected", _selected);
 BA.debugLineNum = 759;BA.debugLine="If Not( bPaused ) Then";
Debug.ShouldStop(4194304);
if (true) break;

case 1:
//if
this.state = 8;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent._bpaused)).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 760;BA.debugLine="Dim lControles As List";
Debug.ShouldStop(8388608);
_lcontroles = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lControles", _lcontroles);
 BA.debugLineNum = 761;BA.debugLine="lControles.Initialize";
Debug.ShouldStop(16777216);
_lcontroles.runVoidMethod ("Initialize");
 BA.debugLineNum = 762;BA.debugLine="lControles = mControles.Get(iMenuSelected)";
Debug.ShouldStop(33554432);
_lcontroles.setObject(parent.mostCurrent._mcontroles.runMethod(false,"Get",(Object)((parent._imenuselected))));
 BA.debugLineNum = 763;BA.debugLine="For Each control As Object In lControles";
Debug.ShouldStop(67108864);
if (true) break;

case 4:
//for
this.state = 7;
group5 = _lcontroles;
index5 = 0;
groupLen5 = group5.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("control", _control);
this.state = 12;
if (true) break;

case 12:
//C
this.state = 7;
if (index5 < groupLen5) {
this.state = 6;
_control = group5.runMethod(false,"Get",index5);Debug.locals.put("control", _control);}
if (true) break;

case 13:
//C
this.state = 12;
index5++;
Debug.locals.put("control", _control);
if (true) break;

case 6:
//C
this.state = 13;
 BA.debugLineNum = 765;BA.debugLine="CallSubDelayed2( control, \"Update\", selected )";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",main.processBA,(Object)(_control),(Object)(BA.ObjectToString("Update")),(Object)((_selected)));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 8;
Debug.locals.put("control", _control);
;
 if (true) break;
;
 BA.debugLineNum = 769;BA.debugLine="If firstStart Then";
Debug.ShouldStop(1);

case 8:
//if
this.state = 11;
if (parent._firststart.<Boolean>get().booleanValue()) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 770;BA.debugLine="Log(\"Update firstTime\")";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Update firstTime")));
 BA.debugLineNum = 771;BA.debugLine="firstStart = False";
Debug.ShouldStop(4);
parent._firststart = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 772;BA.debugLine="Sleep (2000) 'wait to load finished";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("Sleep",main.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this),BA.numberCast(int.class, 2000));
this.state = 14;
return;
case 14:
//C
this.state = 11;
;
 BA.debugLineNum = 773;BA.debugLine="init_messages";
Debug.ShouldStop(16);
_init_messages();
 if (true) break;

case 11:
//C
this.state = -1;
;
 BA.debugLineNum = 775;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
public static RemoteObject  _updatedrawer() throws Exception{
try {
		Debug.PushSubsStack("UpdateDrawer (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,699);
if (RapidSub.canDelegate("updatedrawer")) { return com.calypsoinstruments.anemotracker.main.remoteMe.runUserSub(false, "main","updatedrawer");}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 699;BA.debugLine="Sub UpdateDrawer";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 703;BA.debugLine="If sw_track.IsInitialized Then";
Debug.ShouldStop(1073741824);
if (main.mostCurrent._sw_track.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 704;BA.debugLine="If Starter.Timer_sqlite.Enabled And Not( sw_trac";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean(".",main.mostCurrent._starter._timer_sqlite.runMethod(true,"getEnabled")) && RemoteObject.solveBoolean(".",main.mostCurrent.__c.runMethod(true,"Not",(Object)(main.mostCurrent._sw_track.runMethod(true,"getChecked"))))) { 
 BA.debugLineNum = 705;BA.debugLine="sw_track.Checked = True";
Debug.ShouldStop(1);
main.mostCurrent._sw_track.runMethodAndSync(true,"setChecked",main.mostCurrent.__c.getField(true,"True"));
 };
 BA.debugLineNum = 707;BA.debugLine="If Not(Starter.Timer_sqlite.Enabled) And sw_trac";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean(".",main.mostCurrent.__c.runMethod(true,"Not",(Object)(main.mostCurrent._starter._timer_sqlite.runMethod(true,"getEnabled")))) && RemoteObject.solveBoolean(".",main.mostCurrent._sw_track.runMethod(true,"getChecked"))) { 
 BA.debugLineNum = 708;BA.debugLine="sw_track.Checked = False";
Debug.ShouldStop(8);
main.mostCurrent._sw_track.runMethodAndSync(true,"setChecked",main.mostCurrent.__c.getField(true,"False"));
 };
 };
 BA.debugLineNum = 711;BA.debugLine="If Starter.navigation = 0 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",main.mostCurrent._starter._navigation,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 712;BA.debugLine="lbl_track.Text = \"No Track\"";
Debug.ShouldStop(128);
main.mostCurrent._lbl_track.runMethod(true,"setText",BA.ObjectToCharSequence("No Track"));
 }else {
 BA.debugLineNum = 714;BA.debugLine="Dim m = DBUtils.ExecuteMap( Starter.sql1, \"selec";
Debug.ShouldStop(512);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = main.mostCurrent._dbutils.runMethod(false,"_executemap",main.mostCurrent.activityBA,(Object)(main.mostCurrent._starter._sql1),(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from navigation where [id] = "),main.mostCurrent._starter._navigation)),(Object)((main.mostCurrent.__c.getField(false,"Null"))));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 715;BA.debugLine="lbl_track.Text = m.Get(\"name\" )";
Debug.ShouldStop(1024);
main.mostCurrent._lbl_track.runMethod(true,"setText",BA.ObjectToCharSequence(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name"))))));
 };
 BA.debugLineNum = 718;BA.debugLine="If Starter.connected Then";
Debug.ShouldStop(8192);
if (main.mostCurrent._starter._connected.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 719;BA.debugLine="lbl_bt.Text = Starter.actual_ultra.MacAddress";
Debug.ShouldStop(16384);
main.mostCurrent._lbl_bt.runMethod(true,"setText",BA.ObjectToCharSequence(main.mostCurrent._starter._actual_ultra.getField(true,"MacAddress")));
 BA.debugLineNum = 720;BA.debugLine="btn_bt.Text = \"Disconn\"";
Debug.ShouldStop(32768);
main.mostCurrent._btn_bt.runMethod(true,"setText",BA.ObjectToCharSequence("Disconn"));
 BA.debugLineNum = 721;BA.debugLine="If Starter.bleEnabled Then btn_bt.Enabled = True";
Debug.ShouldStop(65536);
if (main.mostCurrent._starter._bleenabled.<Boolean>get().booleanValue()) { 
main.mostCurrent._btn_bt.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));};
 }else {
 BA.debugLineNum = 723;BA.debugLine="lbl_bt.Text = \"Not connected\"";
Debug.ShouldStop(262144);
main.mostCurrent._lbl_bt.runMethod(true,"setText",BA.ObjectToCharSequence("Not connected"));
 BA.debugLineNum = 724;BA.debugLine="If Starter.tScan.Enabled Then";
Debug.ShouldStop(524288);
if (main.mostCurrent._starter._tscan.runMethod(true,"getEnabled").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 725;BA.debugLine="btn_bt.Enabled = False";
Debug.ShouldStop(1048576);
main.mostCurrent._btn_bt.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 726;BA.debugLine="btn_bt.Text = \"Scanning\"";
Debug.ShouldStop(2097152);
main.mostCurrent._btn_bt.runMethod(true,"setText",BA.ObjectToCharSequence("Scanning"));
 }else {
 BA.debugLineNum = 728;BA.debugLine="If Starter.bleEnabled Then btn_bt.Enabled = Tru";
Debug.ShouldStop(8388608);
if (main.mostCurrent._starter._bleenabled.<Boolean>get().booleanValue()) { 
main.mostCurrent._btn_bt.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));};
 BA.debugLineNum = 729;BA.debugLine="btn_bt.Text = \"Scan\"";
Debug.ShouldStop(16777216);
main.mostCurrent._btn_bt.runMethod(true,"setText",BA.ObjectToCharSequence("Scan"));
 };
 };
 BA.debugLineNum = 733;BA.debugLine="If Starter.connected Then";
Debug.ShouldStop(268435456);
if (main.mostCurrent._starter._connected.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 734;BA.debugLine="If sw_mean.IsInitialized Then";
Debug.ShouldStop(536870912);
if (main.mostCurrent._sw_mean.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 735;BA.debugLine="sw_mean.Checked = Starter.calcs_1.mean_sw";
Debug.ShouldStop(1073741824);
main.mostCurrent._sw_mean.runMethodAndSync(true,"setChecked",main.mostCurrent._starter._calcs_1.getField(true,"_mean_sw"));
 };
 };
 BA.debugLineNum = 739;BA.debugLine="If Not( Starter.connected ) Then";
Debug.ShouldStop(4);
if (main.mostCurrent.__c.runMethod(true,"Not",(Object)(main.mostCurrent._starter._connected)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 740;BA.debugLine="imv_equipment.Bitmap = Null";
Debug.ShouldStop(8);
main.mostCurrent._imv_equipment.runMethod(false,"setBitmap",(main.mostCurrent.__c.getField(false,"Null")));
 }else 
{ BA.debugLineNum = 741;BA.debugLine="else If Starter.devicetype = 1 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",main.mostCurrent._starter._devicetype,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 742;BA.debugLine="imv_equipment.bitmap = LoadBitmapResize(File.Dir";
Debug.ShouldStop(32);
main.mostCurrent._imv_equipment.runMethod(false,"setBitmap",(main.mostCurrent.__c.runMethod(false,"LoadBitmapResize",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("cups.jpg")),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))),(Object)(main.mostCurrent.__c.getField(true,"True"))).getObject()));
 }else 
{ BA.debugLineNum = 743;BA.debugLine="else if  Starter.devicetype = 2 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",main.mostCurrent._starter._devicetype,BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 744;BA.debugLine="imv_equipment.bitmap = LoadBitmapResize(File.Dir";
Debug.ShouldStop(128);
main.mostCurrent._imv_equipment.runMethod(false,"setBitmap",(main.mostCurrent.__c.runMethod(false,"LoadBitmapResize",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("ultra.jpg")),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))),(Object)(main.mostCurrent.__c.getField(true,"True"))).getObject()));
 }else {
 BA.debugLineNum = 746;BA.debugLine="imv_equipment.bitmap = LoadBitmapResize(File.Dir";
Debug.ShouldStop(512);
main.mostCurrent._imv_equipment.runMethod(false,"setBitmap",(main.mostCurrent.__c.runMethod(false,"LoadBitmapResize",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("nmea.jpg")),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))),(Object)(main.mostCurrent.__c.getField(true,"True"))).getObject()));
 }}}
;
 BA.debugLineNum = 748;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _verdeclinacion() throws Exception{
try {
		Debug.PushSubsStack("verDeclinacion (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1037);
if (RapidSub.canDelegate("verdeclinacion")) { return com.calypsoinstruments.anemotracker.main.remoteMe.runUserSub(false, "main","verdeclinacion");}
RemoteObject _millis = RemoteObject.createImmutable(0L);
RemoteObject _bo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _heading = RemoteObject.createImmutable(0f);
 BA.debugLineNum = 1037;BA.debugLine="Sub verDeclinacion As Float";
Debug.ShouldStop(4096);
 BA.debugLineNum = 1038;BA.debugLine="Dim millis As Long = NativeMe.RunMethod(\"getTimeM";
Debug.ShouldStop(8192);
_millis = BA.numberCast(long.class, main._nativeme.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getTimeMillis")),(Object)((main.mostCurrent.__c.getField(false,"Null")))));Debug.locals.put("millis", _millis);Debug.locals.put("millis", _millis);
 BA.debugLineNum = 1040;BA.debugLine="Dim bo As JavaObject";
Debug.ShouldStop(32768);
_bo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("bo", _bo);
 BA.debugLineNum = 1041;BA.debugLine="bo.InitializeNewInstance(\"android.hardware.Geomag";
Debug.ShouldStop(65536);
_bo.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("android.hardware.GeomagneticField")),(Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(main.mostCurrent._starter._calcs_1.getField(true,"_latitude")),(main.mostCurrent._starter._calcs_1.getField(true,"_longitude")),(main.mostCurrent._starter._calcs_1.getField(true,"_altitude")),(_millis)})));
 BA.debugLineNum = 1042;BA.debugLine="Dim heading As Float = bo.RunMethod(\"getDeclinati";
Debug.ShouldStop(131072);
_heading = BA.numberCast(float.class, _bo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getDeclination")),(Object)((main.mostCurrent.__c.getField(false,"Null")))));Debug.locals.put("heading", _heading);Debug.locals.put("heading", _heading);
 BA.debugLineNum = 1044;BA.debugLine="Return heading";
Debug.ShouldStop(524288);
if (true) return _heading;
 BA.debugLineNum = 1045;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}