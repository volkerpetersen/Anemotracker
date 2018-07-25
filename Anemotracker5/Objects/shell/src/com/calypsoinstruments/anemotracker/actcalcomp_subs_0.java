package com.calypsoinstruments.anemotracker;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class actcalcomp_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (actcalcomp) ","actcalcomp",11,actcalcomp.mostCurrent.activityBA,actcalcomp.mostCurrent,33);
if (RapidSub.canDelegate("activity_create")) { return com.calypsoinstruments.anemotracker.actcalcomp.remoteMe.runUserSub(false, "actcalcomp","activity_create", _firsttime);}
RemoteObject _ac = RemoteObject.declareNull("de.amberhome.objects.appcompat.AppCompatBase");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 33;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1);
 BA.debugLineNum = 36;BA.debugLine="Activity.LoadLayout(\"actCalComp\")";
Debug.ShouldStop(8);
actcalcomp.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("actCalComp")),actcalcomp.mostCurrent.activityBA);
 BA.debugLineNum = 37;BA.debugLine="Activity.Title = \"Compass Calibration\"";
Debug.ShouldStop(16);
actcalcomp.mostCurrent._activity.runMethod(false,"setTitle",BA.ObjectToCharSequence("Compass Calibration"));
 BA.debugLineNum = 39;BA.debugLine="lbl_messages.Text = \"Rotate the device slowly\"";
Debug.ShouldStop(64);
actcalcomp.mostCurrent._lbl_messages.runMethod(true,"setText",BA.ObjectToCharSequence("Rotate the device slowly"));
 BA.debugLineNum = 40;BA.debugLine="tuto = LoadBitmap(File.DirAssets, \"Cal brujula-01";
Debug.ShouldStop(128);
actcalcomp.mostCurrent._tuto = actcalcomp.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(actcalcomp.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("Cal brujula-01.png")));
 BA.debugLineNum = 41;BA.debugLine="img_tutorial.Bitmap = tuto";
Debug.ShouldStop(256);
actcalcomp.mostCurrent._img_tutorial.runMethod(false,"setBitmap",(actcalcomp.mostCurrent._tuto.getObject()));
 BA.debugLineNum = 42;BA.debugLine="img_tutorial.Height = tuto.Height * img_tutorial.";
Debug.ShouldStop(512);
actcalcomp.mostCurrent._img_tutorial.runMethod(true,"setHeight",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {actcalcomp.mostCurrent._tuto.runMethod(true,"getHeight"),actcalcomp.mostCurrent._img_tutorial.runMethod(true,"getWidth"),actcalcomp.mostCurrent._tuto.runMethod(true,"getWidth")}, "*/",0, 0)));
 BA.debugLineNum = 43;BA.debugLine="bmp_background = LoadBitmapResize( File.DirAssets";
Debug.ShouldStop(1024);
actcalcomp.mostCurrent._bmp_background = actcalcomp.mostCurrent.__c.runMethod(false,"LoadBitmapResize",(Object)(actcalcomp.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("Textura fibra carbono.jpg")),(Object)(BA.numberCast(int.class, 800)),(Object)(BA.numberCast(int.class, 800)),(Object)(actcalcomp.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 45;BA.debugLine="SetTiledBackground( bmp_background )";
Debug.ShouldStop(4096);
_settiledbackground(actcalcomp.mostCurrent._bmp_background);
 BA.debugLineNum = 47;BA.debugLine="toolbar.Initialize(\"tb\")";
Debug.ShouldStop(16384);
actcalcomp.mostCurrent._toolbar.runVoidMethod ("Initialize",actcalcomp.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("tb")));
 BA.debugLineNum = 48;BA.debugLine="toolbar.Title = \"Compass Calibration\"";
Debug.ShouldStop(32768);
actcalcomp.mostCurrent._toolbar.runMethod(true,"setTitle",BA.ObjectToCharSequence("Compass Calibration"));
 BA.debugLineNum = 49;BA.debugLine="toolbar.SetAsActionBar";
Debug.ShouldStop(65536);
actcalcomp.mostCurrent._toolbar.runVoidMethod ("SetAsActionBar",actcalcomp.mostCurrent.activityBA);
 BA.debugLineNum = 50;BA.debugLine="toolbar.NavigationIconBitmap = LoadBitmap( File.D";
Debug.ShouldStop(131072);
actcalcomp.mostCurrent._toolbar.runVoidMethod ("setNavigationIconBitmap",(actcalcomp.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(actcalcomp.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("track.png"))).getObject()));
 BA.debugLineNum = 52;BA.debugLine="Dim ac As AppCompat";
Debug.ShouldStop(524288);
_ac = RemoteObject.createNew ("de.amberhome.objects.appcompat.AppCompatBase");Debug.locals.put("ac", _ac);
 BA.debugLineNum = 53;BA.debugLine="ac.SetElevation(toolbar, 8dip)";
Debug.ShouldStop(1048576);
_ac.runVoidMethod ("SetElevation",(Object)((actcalcomp.mostCurrent._toolbar.getObject())),(Object)(BA.numberCast(float.class, actcalcomp.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8))))));
 BA.debugLineNum = 55;BA.debugLine="Activity.AddView( toolbar, 0%x, 0%y, 100%x, 55dip";
Debug.ShouldStop(4194304);
actcalcomp.mostCurrent._activity.runVoidMethod ("AddView",(Object)((actcalcomp.mostCurrent._toolbar.getObject())),(Object)(actcalcomp.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),actcalcomp.mostCurrent.activityBA)),(Object)(actcalcomp.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 0)),actcalcomp.mostCurrent.activityBA)),(Object)(actcalcomp.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),actcalcomp.mostCurrent.activityBA)),(Object)(actcalcomp.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 55)))));
 BA.debugLineNum = 58;BA.debugLine="lbl_messages.Top = img_tutorial.Height + img_tuto";
Debug.ShouldStop(33554432);
actcalcomp.mostCurrent._lbl_messages.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {actcalcomp.mostCurrent._img_tutorial.runMethod(true,"getHeight"),actcalcomp.mostCurrent._img_tutorial.runMethod(true,"getTop"),actcalcomp.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "++",2, 1));
 BA.debugLineNum = 59;BA.debugLine="lbl_vueltas.Top = lbl_messages.Height + lbl_messa";
Debug.ShouldStop(67108864);
actcalcomp.mostCurrent._lbl_vueltas.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {actcalcomp.mostCurrent._lbl_messages.runMethod(true,"getHeight"),actcalcomp.mostCurrent._lbl_messages.runMethod(true,"getTop"),actcalcomp.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "++",2, 1));
 BA.debugLineNum = 60;BA.debugLine="add_btn.Top = lbl_messages.Height + lbl_messages.";
Debug.ShouldStop(134217728);
actcalcomp.mostCurrent._add_btn.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {actcalcomp.mostCurrent._lbl_messages.runMethod(true,"getHeight"),actcalcomp.mostCurrent._lbl_messages.runMethod(true,"getTop"),actcalcomp.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "++",2, 1));
 BA.debugLineNum = 61;BA.debugLine="btn_abr.Top = lbl_vueltas.Height + lbl_vueltas.To";
Debug.ShouldStop(268435456);
actcalcomp.mostCurrent._btn_abr.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {actcalcomp.mostCurrent._lbl_vueltas.runMethod(true,"getHeight"),actcalcomp.mostCurrent._lbl_vueltas.runMethod(true,"getTop"),actcalcomp.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "++",2, 1));
 BA.debugLineNum = 64;BA.debugLine="vueltas = 0 'reiniciamos variable sin tener q rei";
Debug.ShouldStop(-2147483648);
actcalcomp._vueltas = BA.numberCast(int.class, 0);
 BA.debugLineNum = 65;BA.debugLine="secs = 0";
Debug.ShouldStop(1);
actcalcomp._secs = BA.numberCast(int.class, 0);
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (actcalcomp) ","actcalcomp",11,actcalcomp.mostCurrent.activityBA,actcalcomp.mostCurrent,134);
if (RapidSub.canDelegate("activity_pause")) { return com.calypsoinstruments.anemotracker.actcalcomp.remoteMe.runUserSub(false, "actcalcomp","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 134;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(32);
 BA.debugLineNum = 136;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (actcalcomp) ","actcalcomp",11,actcalcomp.mostCurrent.activityBA,actcalcomp.mostCurrent,80);
if (RapidSub.canDelegate("activity_resume")) { com.calypsoinstruments.anemotracker.actcalcomp.remoteMe.runUserSub(false, "actcalcomp","activity_resume"); return;}
ResumableSub_Activity_Resume rsub = new ResumableSub_Activity_Resume(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Activity_Resume extends BA.ResumableSub {
public ResumableSub_Activity_Resume(com.calypsoinstruments.anemotracker.actcalcomp parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
com.calypsoinstruments.anemotracker.actcalcomp parent;
RemoteObject _bc = RemoteObject.declareNull("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");
RemoteObject _olsecs = RemoteObject.createImmutable(0);
RemoteObject _acpos = RemoteObject.createImmutable(0);
RemoteObject _olpos = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (actcalcomp) ","actcalcomp",11,actcalcomp.mostCurrent.activityBA,actcalcomp.mostCurrent,80);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 81;BA.debugLine="Dim bc As ByteConverter";
Debug.ShouldStop(65536);
_bc = RemoteObject.createNew ("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");Debug.locals.put("bc", _bc);
 BA.debugLineNum = 82;BA.debugLine="bc.LittleEndian = True";
Debug.ShouldStop(131072);
_bc.runMethod(true,"setLittleEndian",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 83;BA.debugLine="If Starter.connected Then";
Debug.ShouldStop(262144);
if (true) break;

case 1:
//if
this.state = 25;
if (parent.mostCurrent._starter._connected.<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 87;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("Sleep",actcalcomp.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this),BA.numberCast(int.class, 1000));
this.state = 26;
return;
case 26:
//C
this.state = 4;
;
 BA.debugLineNum = 89;BA.debugLine="Starter.Scan.WriteData( Starter.sUltra, Starter.";
Debug.ShouldStop(16777216);
parent.mostCurrent._starter._scan.runVoidMethod ("WriteData",(Object)(parent.mostCurrent._starter._sultra),(Object)(parent.mostCurrent._starter._ccalcomp),(Object)(_bc.runMethod(false,"HexToBytes",(Object)(RemoteObject.createImmutable("01")))));
 BA.debugLineNum = 91;BA.debugLine="Dim olSecs As Int = 0";
Debug.ShouldStop(67108864);
_olsecs = BA.numberCast(int.class, 0);Debug.locals.put("olSecs", _olsecs);Debug.locals.put("olSecs", _olsecs);
 BA.debugLineNum = 92;BA.debugLine="Dim acPos, olPos As Int";
Debug.ShouldStop(134217728);
_acpos = RemoteObject.createImmutable(0);Debug.locals.put("acPos", _acpos);
_olpos = RemoteObject.createImmutable(0);Debug.locals.put("olPos", _olpos);
 BA.debugLineNum = 93;BA.debugLine="Do While vueltas < 3";
Debug.ShouldStop(268435456);
if (true) break;

case 4:
//do while
this.state = 24;
while (RemoteObject.solveBoolean("<",parent._vueltas,BA.numberCast(double.class, 3))) {
this.state = 6;
if (true) break;
}
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 94;BA.debugLine="secs = secs + 1";
Debug.ShouldStop(536870912);
parent._secs = RemoteObject.solve(new RemoteObject[] {parent._secs,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 95;BA.debugLine="acPos = Starter.calcs_1.ecompass";
Debug.ShouldStop(1073741824);
_acpos = parent.mostCurrent._starter._calcs_1.getField(true,"_ecompass");Debug.locals.put("acPos", _acpos);
 BA.debugLineNum = 96;BA.debugLine="If Abs(acPos - olPos) > 20 Then	'Variacion de m";
Debug.ShouldStop(-2147483648);
if (true) break;

case 7:
//if
this.state = 14;
if (RemoteObject.solveBoolean(">",parent.mostCurrent.__c.runMethod(true,"Abs",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_acpos,_olpos}, "-",1, 1)))),BA.numberCast(double.class, 20))) { 
this.state = 9;
}else 
{ BA.debugLineNum = 98;BA.debugLine="Else If Abs(acPos - olPos) < 2 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("<",parent.mostCurrent.__c.runMethod(true,"Abs",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_acpos,_olpos}, "-",1, 1)))),BA.numberCast(double.class, 2))) { 
this.state = 11;
}else {
this.state = 13;
}}
if (true) break;

case 9:
//C
this.state = 14;
 BA.debugLineNum = 97;BA.debugLine="lbl_messages.Text = \"Too Fast. Rotate Slowly\"";
Debug.ShouldStop(1);
parent.mostCurrent._lbl_messages.runMethod(true,"setText",BA.ObjectToCharSequence("Too Fast. Rotate Slowly"));
 if (true) break;

case 11:
//C
this.state = 14;
 BA.debugLineNum = 99;BA.debugLine="lbl_messages.Text = \"Please, rotate the device";
Debug.ShouldStop(4);
parent.mostCurrent._lbl_messages.runMethod(true,"setText",BA.ObjectToCharSequence("Please, rotate the device"));
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 101;BA.debugLine="lbl_messages.Text = \"Keep rotating\"";
Debug.ShouldStop(16);
parent.mostCurrent._lbl_messages.runMethod(true,"setText",BA.ObjectToCharSequence("Keep rotating"));
 if (true) break;

case 14:
//C
this.state = 15;
;
 BA.debugLineNum = 103;BA.debugLine="olPos = acPos";
Debug.ShouldStop(64);
_olpos = _acpos;Debug.locals.put("olPos", _olpos);
 BA.debugLineNum = 104;BA.debugLine="test_lbl.Text = \"Debug Pos: \" & acPos 'Debug";
Debug.ShouldStop(128);
parent.mostCurrent._test_lbl.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Debug Pos: "),_acpos)));
 BA.debugLineNum = 106;BA.debugLine="If (acPos < 10 Or acPos > 350) And isNew = True";
Debug.ShouldStop(512);
if (true) break;

case 15:
//if
this.state = 20;
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("<",_acpos,BA.numberCast(double.class, 10)) || RemoteObject.solveBoolean(">",_acpos,BA.numberCast(double.class, 350))))) && RemoteObject.solveBoolean("=",parent._isnew,parent.mostCurrent.__c.getField(true,"True")) && RemoteObject.solveBoolean(">",RemoteObject.solve(new RemoteObject[] {parent._secs,_olsecs}, "-",1, 1),BA.numberCast(double.class, 5))) { 
this.state = 17;
}else 
{ BA.debugLineNum = 111;BA.debugLine="Else If (acPos > 10 Or acPos < 350) And isNew =";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(">",_acpos,BA.numberCast(double.class, 10)) || RemoteObject.solveBoolean("<",_acpos,BA.numberCast(double.class, 350))))) && RemoteObject.solveBoolean("=",parent._isnew,parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 19;
}}
if (true) break;

case 17:
//C
this.state = 20;
 BA.debugLineNum = 107;BA.debugLine="vueltas = vueltas + 1";
Debug.ShouldStop(1024);
parent._vueltas = RemoteObject.solve(new RemoteObject[] {parent._vueltas,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 108;BA.debugLine="isNew = False";
Debug.ShouldStop(2048);
parent._isnew = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 110;BA.debugLine="olSecs = secs";
Debug.ShouldStop(8192);
_olsecs = parent._secs;Debug.locals.put("olSecs", _olsecs);
 if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 112;BA.debugLine="isNew = True";
Debug.ShouldStop(32768);
parent._isnew = parent.mostCurrent.__c.getField(true,"True");
 if (true) break;
;
 BA.debugLineNum = 115;BA.debugLine="If vueltas = 0 And secs > 30 Then";
Debug.ShouldStop(262144);

case 20:
//if
this.state = 23;
if (RemoteObject.solveBoolean("=",parent._vueltas,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(">",parent._secs,BA.numberCast(double.class, 30))) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 116;BA.debugLine="Msgbox(\"Press +1 button if you have completed";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Press +1 button if you have completed a turn but it has not been added to turns count")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),actcalcomp.mostCurrent.activityBA);
 BA.debugLineNum = 117;BA.debugLine="secs = 0";
Debug.ShouldStop(1048576);
parent._secs = BA.numberCast(int.class, 0);
 BA.debugLineNum = 118;BA.debugLine="olSecs = secs";
Debug.ShouldStop(2097152);
_olsecs = parent._secs;Debug.locals.put("olSecs", _olsecs);
 if (true) break;

case 23:
//C
this.state = 4;
;
 BA.debugLineNum = 121;BA.debugLine="lbl_vueltas.Text = \"Turns count: \" & vueltas";
Debug.ShouldStop(16777216);
parent.mostCurrent._lbl_vueltas.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Turns count: "),parent._vueltas)));
 BA.debugLineNum = 123;BA.debugLine="Sleep(1000) 'una vez por segundo";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("Sleep",actcalcomp.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this),BA.numberCast(int.class, 1000));
this.state = 27;
return;
case 27:
//C
this.state = 4;
;
 if (true) break;

case 24:
//C
this.state = 25;
;
 BA.debugLineNum = 126;BA.debugLine="lbl_messages.Text = \"Done\"";
Debug.ShouldStop(536870912);
parent.mostCurrent._lbl_messages.runMethod(true,"setText",BA.ObjectToCharSequence("Done"));
 BA.debugLineNum = 127;BA.debugLine="Starter.Scan.WriteData( Starter.sUltra, Starter.";
Debug.ShouldStop(1073741824);
parent.mostCurrent._starter._scan.runVoidMethod ("WriteData",(Object)(parent.mostCurrent._starter._sultra),(Object)(parent.mostCurrent._starter._ccalcomp),(Object)(_bc.runMethod(false,"HexToBytes",(Object)(RemoteObject.createImmutable("00")))));
 BA.debugLineNum = 128;BA.debugLine="ToastMessageShow( \"Compass calibrated successful";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Compass calibrated successfully")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 129;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 25:
//C
this.state = -1;
;
 BA.debugLineNum = 132;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
public static RemoteObject  _add_btn_click() throws Exception{
try {
		Debug.PushSubsStack("add_btn_Click (actcalcomp) ","actcalcomp",11,actcalcomp.mostCurrent.activityBA,actcalcomp.mostCurrent,138);
if (RapidSub.canDelegate("add_btn_click")) { return com.calypsoinstruments.anemotracker.actcalcomp.remoteMe.runUserSub(false, "actcalcomp","add_btn_click");}
 BA.debugLineNum = 138;BA.debugLine="Sub add_btn_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 139;BA.debugLine="vueltas = vueltas + 1";
Debug.ShouldStop(1024);
actcalcomp._vueltas = RemoteObject.solve(new RemoteObject[] {actcalcomp._vueltas,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 140;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_abr_click() throws Exception{
try {
		Debug.PushSubsStack("btn_abr_Click (actcalcomp) ","actcalcomp",11,actcalcomp.mostCurrent.activityBA,actcalcomp.mostCurrent,142);
if (RapidSub.canDelegate("btn_abr_click")) { return com.calypsoinstruments.anemotracker.actcalcomp.remoteMe.runUserSub(false, "actcalcomp","btn_abr_click");}
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _bc = RemoteObject.declareNull("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");
 BA.debugLineNum = 142;BA.debugLine="Sub btn_abr_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 144;BA.debugLine="Dim result As Int";
Debug.ShouldStop(32768);
_result = RemoteObject.createImmutable(0);Debug.locals.put("result", _result);
 BA.debugLineNum = 145;BA.debugLine="Dim bc As ByteConverter";
Debug.ShouldStop(65536);
_bc = RemoteObject.createNew ("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");Debug.locals.put("bc", _bc);
 BA.debugLineNum = 146;BA.debugLine="bc.LittleEndian = True";
Debug.ShouldStop(131072);
_bc.runMethod(true,"setLittleEndian",actcalcomp.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 147;BA.debugLine="result = Msgbox2( \"The calibration may not be fin";
Debug.ShouldStop(262144);
_result = actcalcomp.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("The calibration may not be finished. Do you wish to abort it?")),(Object)(BA.ObjectToCharSequence("Abort")),(Object)(BA.ObjectToString("Abort")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((actcalcomp.mostCurrent.__c.getField(false,"Null"))),actcalcomp.mostCurrent.activityBA);Debug.locals.put("result", _result);
 BA.debugLineNum = 148;BA.debugLine="If result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, actcalcomp.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 149;BA.debugLine="Starter.Scan.WriteData( Starter.sUltra, Starter.";
Debug.ShouldStop(1048576);
actcalcomp.mostCurrent._starter._scan.runVoidMethod ("WriteData",(Object)(actcalcomp.mostCurrent._starter._sultra),(Object)(actcalcomp.mostCurrent._starter._ccalcomp),(Object)(_bc.runMethod(false,"HexToBytes",(Object)(RemoteObject.createImmutable("00")))));
 BA.debugLineNum = 150;BA.debugLine="ToastMessageShow( \"Calibration aborted\" , False";
Debug.ShouldStop(2097152);
actcalcomp.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Calibration aborted")),(Object)(actcalcomp.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 151;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4194304);
actcalcomp.mostCurrent._activity.runVoidMethod ("Finish");
 };
 BA.debugLineNum = 153;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 20;BA.debugLine="Dim img_tutorial As ImageView";
actcalcomp.mostCurrent._img_tutorial = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Dim lbl_messages As Label";
actcalcomp.mostCurrent._lbl_messages = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Dim lbl_vueltas As Label";
actcalcomp.mostCurrent._lbl_vueltas = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Dim test_lbl As Label";
actcalcomp.mostCurrent._test_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Dim add_btn As Button";
actcalcomp.mostCurrent._add_btn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Dim btn_abr As Button";
actcalcomp.mostCurrent._btn_abr = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Dim toolbar As ACToolBarLight";
actcalcomp.mostCurrent._toolbar = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACToolbarLightWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Dim bmp_background As Bitmap";
actcalcomp.mostCurrent._bmp_background = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Dim tuto As Bitmap";
actcalcomp.mostCurrent._tuto = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Dim vueltas As Int = 0";
actcalcomp._vueltas = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 11;BA.debugLine="Dim isNew As Boolean = False";
actcalcomp._isnew = actcalcomp.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 13;BA.debugLine="Dim secs As Int";
actcalcomp._secs = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _settiledbackground(RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetTiledBackground (actcalcomp) ","actcalcomp",11,actcalcomp.mostCurrent.activityBA,actcalcomp.mostCurrent,69);
if (RapidSub.canDelegate("settiledbackground")) { return com.calypsoinstruments.anemotracker.actcalcomp.remoteMe.runUserSub(false, "actcalcomp","settiledbackground", _b);}
RemoteObject _bd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
Debug.locals.put("b", _b);
 BA.debugLineNum = 69;BA.debugLine="Sub SetTiledBackground( b As Bitmap)";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="Dim bd As BitmapDrawable";
Debug.ShouldStop(32);
_bd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("bd", _bd);
 BA.debugLineNum = 71;BA.debugLine="bd.Initialize(b)";
Debug.ShouldStop(64);
_bd.runVoidMethod ("Initialize",(Object)((_b.getObject())));
 BA.debugLineNum = 73;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(256);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 74;BA.debugLine="r.Target = bd";
Debug.ShouldStop(512);
_r.setField ("Target",(_bd.getObject()));
 BA.debugLineNum = 75;BA.debugLine="r.RunMethod3(\"setTileModeXY\",\"REPEAT\", \"android.g";
Debug.ShouldStop(1024);
_r.runVoidMethod ("RunMethod3",(Object)(BA.ObjectToString("setTileModeXY")),(Object)(BA.ObjectToString("REPEAT")),(Object)(BA.ObjectToString("android.graphics.Shader$TileMode")),(Object)(BA.ObjectToString("REPEAT")),(Object)(RemoteObject.createImmutable("android.graphics.Shader$TileMode")));
 BA.debugLineNum = 77;BA.debugLine="Activity.Background = bd";
Debug.ShouldStop(4096);
actcalcomp.mostCurrent._activity.runMethod(false,"setBackground",(_bd.getObject()));
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
}