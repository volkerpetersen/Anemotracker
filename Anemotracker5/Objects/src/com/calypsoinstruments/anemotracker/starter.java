package com.calypsoinstruments.anemotracker;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.objects.ServiceHelper;
import anywheresoftware.b4a.debug.*;

public class starter extends  android.app.Service{
	public static class starter_BR extends android.content.BroadcastReceiver {

		@Override
		public void onReceive(android.content.Context context, android.content.Intent intent) {
            BA.LogInfo("** Receiver (starter) OnReceive **");
			android.content.Intent in = new android.content.Intent(context, starter.class);
			if (intent != null)
				in.putExtra("b4a_internal_intent", intent);
            ServiceHelper.StarterHelper.startServiceFromReceiver (context, in, true, anywheresoftware.b4a.ShellBA.class);
		}

	}
    static starter mostCurrent;
	public static BA processBA;
    private ServiceHelper _service;
    public static Class<?> getObject() {
		return starter.class;
	}
	@Override
	public void onCreate() {
        super.onCreate();
        mostCurrent = this;
        if (processBA == null) {
		    processBA = new anywheresoftware.b4a.ShellBA(this, null, null, "com.calypsoinstruments.anemotracker", "com.calypsoinstruments.anemotracker.starter");
            if (BA.isShellModeRuntimeCheck(processBA)) {
                processBA.raiseEvent2(null, true, "SHELL", false);
		    }
            try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            processBA.loadHtSubs(this.getClass());
            ServiceHelper.init();
        }
        _service = new ServiceHelper(this);
        processBA.service = this;
        
        if (BA.isShellModeRuntimeCheck(processBA)) {
			processBA.raiseEvent2(null, true, "CREATE", true, "com.calypsoinstruments.anemotracker.starter", processBA, _service, anywheresoftware.b4a.keywords.Common.Density);
		}
        if (!true && ServiceHelper.StarterHelper.startFromServiceCreate(processBA, false) == false) {
				
		}
		else {
            processBA.setActivityPaused(false);
            BA.LogInfo("*** Service (starter) Create ***");
            processBA.raiseEvent(null, "service_create");
        }
        processBA.runHook("oncreate", this, null);
        if (true) {
			ServiceHelper.StarterHelper.runWaitForLayouts();
		}
    }
		@Override
	public void onStart(android.content.Intent intent, int startId) {
		onStartCommand(intent, 0, 0);
    }
    @Override
    public int onStartCommand(final android.content.Intent intent, int flags, int startId) {
    	if (ServiceHelper.StarterHelper.onStartCommand(processBA, new Runnable() {
            public void run() {
                handleStart(intent);
            }}))
			;
		else {
			ServiceHelper.StarterHelper.addWaitForLayout (new Runnable() {
				public void run() {
                    processBA.setActivityPaused(false);
                    BA.LogInfo("** Service (starter) Create **");
                    processBA.raiseEvent(null, "service_create");
					handleStart(intent);
                    ServiceHelper.StarterHelper.removeWaitForLayout();
				}
			});
		}
        processBA.runHook("onstartcommand", this, new Object[] {intent, flags, startId});
		return android.app.Service.START_NOT_STICKY;
    }
    public void onTaskRemoved(android.content.Intent rootIntent) {
        super.onTaskRemoved(rootIntent);
        if (true)
            processBA.raiseEvent(null, "service_taskremoved");
            
    }
    private void handleStart(android.content.Intent intent) {
    	BA.LogInfo("** Service (starter) Start **");
    	java.lang.reflect.Method startEvent = processBA.htSubs.get("service_start");
    	if (startEvent != null) {
    		if (startEvent.getParameterTypes().length > 0) {
    			anywheresoftware.b4a.objects.IntentWrapper iw = ServiceHelper.StarterHelper.handleStartIntent(intent, _service, processBA);
    			processBA.raiseEvent(null, "service_start", iw);
    		}
    		else {
    			processBA.raiseEvent(null, "service_start");
    		}
    	}
    }
	
	@Override
	public void onDestroy() {
        super.onDestroy();
        if (true) {
            BA.LogInfo("** Service (starter) Destroy (ignored)**");
        }
        else {
            BA.LogInfo("** Service (starter) Destroy **");
		    processBA.raiseEvent(null, "service_destroy");
            processBA.service = null;
		    mostCurrent = null;
		    processBA.setActivityPaused(true);
            processBA.runHook("ondestroy", this, null);
        }
	}

@Override
	public android.os.IBinder onBind(android.content.Intent intent) {
		return null;
	}
public static class _tultra{
public boolean IsInitialized;
public String Name;
public String MacAddress;
public double RSSI;
public void Initialize() {
IsInitialized = true;
Name = "";
MacAddress = "";
RSSI = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.phone.Phone.PhoneSensors _orientation = null;
public static float _forientation = 0f;
public static anywheresoftware.b4a.gps.GPS _gps1 = null;
public static boolean _gps_changed = false;
public static anywheresoftware.b4a.gps.LocationWrapper _gps_location = null;
public static anywheresoftware.b4a.objects.BleManager2 _scan = null;
public static anywheresoftware.b4a.objects.Timer _tscan = null;
public static anywheresoftware.b4a.objects.Timer _timer_ble = null;
public static anywheresoftware.b4a.objects.Timer _trefresh = null;
public static String _chprincipal = "";
public static com.calypsoinstruments.anemotracker.starter._tultra _actual_ultra = null;
public static boolean _connected = false;
public static boolean _bselectble = false;
public static boolean _bsetnotify = false;
public static boolean _bhz = false;
public static anywheresoftware.b4a.objects.collections.Map _devices = null;
public static anywheresoftware.b4a.objects.collections.List _last_ultra = null;
public static String _sultra = "";
public static String _cnormal = "";
public static String _crate = "";
public static String _csensors = "";
public static String _cstatus = "";
public static String _cnmea = "";
public static String _ccalcomp = "";
public static String _mid = "";
public static String _uid = "";
public static int _devicetype = 0;
public static anywheresoftware.b4a.objects.collections.Map _deviceinfo = null;
public static com.calypsoinstruments.anemotracker.windcalcs _calcs_1 = null;
public static anywheresoftware.b4a.agraham.reflection.Reflection _obj1 = null;
public static anywheresoftware.b4a.objects.collections.Map _dt_historic = null;
public static boolean _sync_cloud = false;
public static anywheresoftware.b4a.sql.SQL _sql1 = null;
public static anywheresoftware.b4a.objects.Timer _timer_sqlite = null;
public static int _navigation = 0;
public static String _nav_name = "";
public static boolean _b_nav = false;
public static boolean _b_true = false;
public static boolean _b_net = false;
public static boolean _manual_disconnect = false;
public static anywheresoftware.b4a.objects.NotificationWrapper _n = null;
public static float _tang = 0f;
public static float _tvel = 0f;
public static int _c_ble = 0;
public static boolean _bleenabled = false;
public static boolean _gps1enabled = false;
public static int _trytimes = 0;
public static anywheresoftware.b4a.keywords.StringBuilderWrapper _logs = null;
public static anywheresoftware.b4a.phone.Phone.LogCat _logcat = null;
public static boolean _allowreport = false;
public static long _temporizador = 0L;
public com.calypsoinstruments.anemotracker.main _main = null;
public com.calypsoinstruments.anemotracker.actble _actble = null;
public com.calypsoinstruments.anemotracker.actlisttracks _actlisttracks = null;
public com.calypsoinstruments.anemotracker.actnavigation _actnavigation = null;
public com.calypsoinstruments.anemotracker.acttcpip _acttcpip = null;
public com.calypsoinstruments.anemotracker.dbutils _dbutils = null;
public com.calypsoinstruments.anemotracker.actcalcomp _actcalcomp = null;
public com.calypsoinstruments.anemotracker.actdevinfo _actdevinfo = null;
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "application_error"))
	 {return ((Boolean) Debug.delegate(processBA, "application_error", new Object[] {_error,_stacktrace}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
long _l = 0L;
anywheresoftware.b4a.phone.Phone.Email _email = null;
anywheresoftware.b4a.phone.Phone _ph = null;
RDebugUtils.currentLine=6291456;
 //BA.debugLineNum = 6291456;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
RDebugUtils.currentLine=6291457;
 //BA.debugLineNum = 6291457;BA.debugLine="If allowReport = False Then Return True";
if (_allowreport==anywheresoftware.b4a.keywords.Common.False) { 
if (true) return anywheresoftware.b4a.keywords.Common.True;};
RDebugUtils.currentLine=6291459;
 //BA.debugLineNum = 6291459;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=6291460;
 //BA.debugLineNum = 6291460;BA.debugLine="Dim l As Long = 500";
_l = (long) (500);
RDebugUtils.currentLine=6291461;
 //BA.debugLineNum = 6291461;BA.debugLine="jo.InitializeStatic(\"java.lang.Thread\").RunMethod";
_jo.InitializeStatic("java.lang.Thread").RunMethod("sleep",new Object[]{(Object)(_l)});
RDebugUtils.currentLine=6291462;
 //BA.debugLineNum = 6291462;BA.debugLine="logcat.LogCatStop";
_logcat.LogCatStop();
RDebugUtils.currentLine=6291463;
 //BA.debugLineNum = 6291463;BA.debugLine="logs.Append(StackTrace)";
_logs.Append(_stacktrace);
RDebugUtils.currentLine=6291464;
 //BA.debugLineNum = 6291464;BA.debugLine="Dim email As Email";
_email = new anywheresoftware.b4a.phone.Phone.Email();
RDebugUtils.currentLine=6291465;
 //BA.debugLineNum = 6291465;BA.debugLine="Dim ph As Phone";
_ph = new anywheresoftware.b4a.phone.Phone();
RDebugUtils.currentLine=6291466;
 //BA.debugLineNum = 6291466;BA.debugLine="email.To.Add(\"anemotrackerdev@gmail.com\")";
_email.To.Add((Object)("anemotrackerdev@gmail.com"));
RDebugUtils.currentLine=6291467;
 //BA.debugLineNum = 6291467;BA.debugLine="email.Subject = \"App crash report \" & actual_ultr";
_email.Subject = "App crash report "+_actual_ultra.MacAddress+" "+_ph.getManufacturer()+" "+_ph.getModel()+" "+_ph.getProduct();
RDebugUtils.currentLine=6291468;
 //BA.debugLineNum = 6291468;BA.debugLine="email.Body = logs";
_email.Body = BA.ObjectToString(_logs);
RDebugUtils.currentLine=6291469;
 //BA.debugLineNum = 6291469;BA.debugLine="StartActivity(email.GetIntent)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(_email.GetIntent()));
RDebugUtils.currentLine=6291471;
 //BA.debugLineNum = 6291471;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=6291472;
 //BA.debugLineNum = 6291472;BA.debugLine="End Sub";
return false;
}
public static String  _ble_connected(anywheresoftware.b4a.objects.collections.List _services) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "ble_connected"))
	 {return ((String) Debug.delegate(processBA, "ble_connected", new Object[] {_services}));}
String _s = "";
RDebugUtils.currentLine=6946816;
 //BA.debugLineNum = 6946816;BA.debugLine="Sub ble_Connected (Services As List)";
RDebugUtils.currentLine=6946817;
 //BA.debugLineNum = 6946817;BA.debugLine="Scan.StopScan";
_scan.StopScan();
RDebugUtils.currentLine=6946818;
 //BA.debugLineNum = 6946818;BA.debugLine="tScan.Enabled = False";
_tscan.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=6946819;
 //BA.debugLineNum = 6946819;BA.debugLine="Main.kvs.PutObject( \"last_ultra\", actual_ultra )";
mostCurrent._main._kvs._putobject(null,"last_ultra",(Object)(_actual_ultra));
RDebugUtils.currentLine=6946820;
 //BA.debugLineNum = 6946820;BA.debugLine="bSetNotify = False";
_bsetnotify = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=6946821;
 //BA.debugLineNum = 6946821;BA.debugLine="bHz = False";
_bhz = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=6946822;
 //BA.debugLineNum = 6946822;BA.debugLine="For Each s As String In Services";
{
final anywheresoftware.b4a.BA.IterableList group6 = _services;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_s = BA.ObjectToString(group6.Get(index6));
RDebugUtils.currentLine=6946823;
 //BA.debugLineNum = 6946823;BA.debugLine="Log(s)";
anywheresoftware.b4a.keywords.Common.Log(_s);
 }
};
RDebugUtils.currentLine=6946825;
 //BA.debugLineNum = 6946825;BA.debugLine="Timer_ble.Enabled = True";
_timer_ble.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=6946826;
 //BA.debugLineNum = 6946826;BA.debugLine="connected = True";
_connected = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=6946827;
 //BA.debugLineNum = 6946827;BA.debugLine="cNormal = \"\"";
_cnormal = "";
RDebugUtils.currentLine=6946828;
 //BA.debugLineNum = 6946828;BA.debugLine="cRate = \"\"";
_crate = "";
RDebugUtils.currentLine=6946829;
 //BA.debugLineNum = 6946829;BA.debugLine="cSensors = \"\"";
_csensors = "";
RDebugUtils.currentLine=6946830;
 //BA.debugLineNum = 6946830;BA.debugLine="cStatus = \"\"";
_cstatus = "";
RDebugUtils.currentLine=6946831;
 //BA.debugLineNum = 6946831;BA.debugLine="cNmea = \"\"";
_cnmea = "";
RDebugUtils.currentLine=6946832;
 //BA.debugLineNum = 6946832;BA.debugLine="ToastMessageShow( \"Connected \"&uId, True )";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Connected "+_uid),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=6946833;
 //BA.debugLineNum = 6946833;BA.debugLine="For Each s As String In Services";
{
final anywheresoftware.b4a.BA.IterableList group17 = _services;
final int groupLen17 = group17.getSize()
;int index17 = 0;
;
for (; index17 < groupLen17;index17++){
_s = BA.ObjectToString(group17.Get(index17));
RDebugUtils.currentLine=6946834;
 //BA.debugLineNum = 6946834;BA.debugLine="If s.StartsWith( \"0000180d\" ) Then";
if (_s.startsWith("0000180d")) { 
RDebugUtils.currentLine=6946835;
 //BA.debugLineNum = 6946835;BA.debugLine="sUltra = s";
_sultra = _s;
RDebugUtils.currentLine=6946836;
 //BA.debugLineNum = 6946836;BA.debugLine="Scan.ReadData(s)";
_scan.ReadData(_s);
 }else 
{RDebugUtils.currentLine=6946837;
 //BA.debugLineNum = 6946837;BA.debugLine="Else If s.StartsWith( \"0000180a\" ) Then";
if (_s.startsWith("0000180a")) { 
RDebugUtils.currentLine=6946838;
 //BA.debugLineNum = 6946838;BA.debugLine="sUltra = s";
_sultra = _s;
RDebugUtils.currentLine=6946839;
 //BA.debugLineNum = 6946839;BA.debugLine="Scan.ReadData(s)";
_scan.ReadData(_s);
 }}
;
 }
};
RDebugUtils.currentLine=6946877;
 //BA.debugLineNum = 6946877;BA.debugLine="End Sub";
return "";
}
public static String  _ble_dataavailable(String _serviceid,anywheresoftware.b4a.objects.collections.Map _characteristics) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "ble_dataavailable"))
	 {return ((String) Debug.delegate(processBA, "ble_dataavailable", new Object[] {_serviceid,_characteristics}));}
String _id = "";
anywheresoftware.b4a.agraham.byteconverter.ByteConverter _bc = null;
byte[] _bvars = null;
short[] _svars = null;
float _velocidad = 0f;
float _direccion = 0f;
RDebugUtils.currentLine=7340032;
 //BA.debugLineNum = 7340032;BA.debugLine="Sub ble_DataAvailable (ServiceId As String, Charac";
RDebugUtils.currentLine=7340033;
 //BA.debugLineNum = 7340033;BA.debugLine="If ServiceId.StartsWith( \"0000180d\" ) Then";
if (_serviceid.startsWith("0000180d")) { 
RDebugUtils.currentLine=7340034;
 //BA.debugLineNum = 7340034;BA.debugLine="If Not( bSetNotify ) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_bsetnotify)) { 
RDebugUtils.currentLine=7340039;
 //BA.debugLineNum = 7340039;BA.debugLine="For Each id As String In Characteristics.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _characteristics.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_id = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=7340040;
 //BA.debugLineNum = 7340040;BA.debugLine="If id.StartsWith( \"00002a39\" ) Then";
if (_id.startsWith("00002a39")) { 
RDebugUtils.currentLine=7340041;
 //BA.debugLineNum = 7340041;BA.debugLine="cNormal = id";
_cnormal = _id;
RDebugUtils.currentLine=7340042;
 //BA.debugLineNum = 7340042;BA.debugLine="Dim bc As ByteConverter";
_bc = new anywheresoftware.b4a.agraham.byteconverter.ByteConverter();
RDebugUtils.currentLine=7340043;
 //BA.debugLineNum = 7340043;BA.debugLine="Scan.SetNotify( sUltra, cNormal, True )";
_scan.SetNotify(_sultra,_cnormal,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=7340044;
 //BA.debugLineNum = 7340044;BA.debugLine="bSetNotify = True";
_bsetnotify = anywheresoftware.b4a.keywords.Common.True;
 };
RDebugUtils.currentLine=7340046;
 //BA.debugLineNum = 7340046;BA.debugLine="If id.StartsWith( \"0000a002\" ) Then";
if (_id.startsWith("0000a002")) { 
RDebugUtils.currentLine=7340047;
 //BA.debugLineNum = 7340047;BA.debugLine="cRate = id";
_crate = _id;
 };
RDebugUtils.currentLine=7340057;
 //BA.debugLineNum = 7340057;BA.debugLine="If id.StartsWith( \"0000a003\" ) Then";
if (_id.startsWith("0000a003")) { 
RDebugUtils.currentLine=7340058;
 //BA.debugLineNum = 7340058;BA.debugLine="cSensors = id";
_csensors = _id;
 };
RDebugUtils.currentLine=7340060;
 //BA.debugLineNum = 7340060;BA.debugLine="If id.StartsWith( \"0000a001\" ) Then";
if (_id.startsWith("0000a001")) { 
RDebugUtils.currentLine=7340061;
 //BA.debugLineNum = 7340061;BA.debugLine="cStatus = id";
_cstatus = _id;
 };
RDebugUtils.currentLine=7340063;
 //BA.debugLineNum = 7340063;BA.debugLine="If id.StartsWith( \"0000b001\" ) Then";
if (_id.startsWith("0000b001")) { 
RDebugUtils.currentLine=7340064;
 //BA.debugLineNum = 7340064;BA.debugLine="cNmea = id";
_cnmea = _id;
 };
RDebugUtils.currentLine=7340066;
 //BA.debugLineNum = 7340066;BA.debugLine="If id.StartsWith( \"0000a00b\" ) Then";
if (_id.startsWith("0000a00b")) { 
RDebugUtils.currentLine=7340067;
 //BA.debugLineNum = 7340067;BA.debugLine="cCalComp = id";
_ccalcomp = _id;
 };
RDebugUtils.currentLine=7340078;
 //BA.debugLineNum = 7340078;BA.debugLine="If sUltra.StartsWith( \"0000180d\" ) Then";
if (_sultra.startsWith("0000180d")) { 
RDebugUtils.currentLine=7340079;
 //BA.debugLineNum = 7340079;BA.debugLine="CallSubDelayed( Main, \"UpdateDrawer\" )";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(mostCurrent._main.getObject()),"UpdateDrawer");
RDebugUtils.currentLine=7340080;
 //BA.debugLineNum = 7340080;BA.debugLine="CallSubDelayed( Main, \"add_secondary_drawer\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(mostCurrent._main.getObject()),"add_secondary_drawer");
 };
 }
};
 };
RDebugUtils.currentLine=7340087;
 //BA.debugLineNum = 7340087;BA.debugLine="If Characteristics.ContainsKey( cNormal ) Then";
if (_characteristics.ContainsKey((Object)(_cnormal))) { 
RDebugUtils.currentLine=7340089;
 //BA.debugLineNum = 7340089;BA.debugLine="Dim bc As ByteConverter";
_bc = new anywheresoftware.b4a.agraham.byteconverter.ByteConverter();
RDebugUtils.currentLine=7340090;
 //BA.debugLineNum = 7340090;BA.debugLine="bc.LittleEndian = True";
_bc.setLittleEndian(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=7340092;
 //BA.debugLineNum = 7340092;BA.debugLine="Dim bVars(4) As Byte";
_bvars = new byte[(int) (4)];
;
RDebugUtils.currentLine=7340093;
 //BA.debugLineNum = 7340093;BA.debugLine="Dim sVars() As Short";
_svars = new short[(int) (0)];
;
RDebugUtils.currentLine=7340094;
 //BA.debugLineNum = 7340094;BA.debugLine="bc.ArrayCopy(Characteristics.Get(cNormal), 0, b";
_bc.ArrayCopy(_characteristics.Get((Object)(_cnormal)),(int) (0),(Object)(_bvars),(int) (0),(int) (4));
RDebugUtils.currentLine=7340095;
 //BA.debugLineNum = 7340095;BA.debugLine="sVars = bc.ShortsFromBytes( bVars )";
_svars = _bc.ShortsFromBytes(_bvars);
RDebugUtils.currentLine=7340096;
 //BA.debugLineNum = 7340096;BA.debugLine="Dim velocidad, direccion As Float";
_velocidad = 0f;
_direccion = 0f;
RDebugUtils.currentLine=7340097;
 //BA.debugLineNum = 7340097;BA.debugLine="velocidad = sVars(0)";
_velocidad = (float) (_svars[(int) (0)]);
RDebugUtils.currentLine=7340098;
 //BA.debugLineNum = 7340098;BA.debugLine="direccion = sVars(1)";
_direccion = (float) (_svars[(int) (1)]);
RDebugUtils.currentLine=7340099;
 //BA.debugLineNum = 7340099;BA.debugLine="calcs_1.orig_vane = direccion";
_calcs_1._orig_vane = _direccion;
RDebugUtils.currentLine=7340100;
 //BA.debugLineNum = 7340100;BA.debugLine="calcs_1.orig_anemo = velocidad/100";
_calcs_1._orig_anemo = (float) (_velocidad/(double)100);
RDebugUtils.currentLine=7340101;
 //BA.debugLineNum = 7340101;BA.debugLine="calcs_1.vane  = direccion";
_calcs_1._vane = _direccion;
RDebugUtils.currentLine=7340102;
 //BA.debugLineNum = 7340102;BA.debugLine="calcs_1.calc_anemo_k( velocidad / 100, direccio";
_calcs_1._calc_anemo_k(null,(float) (_velocidad/(double)100),_direccion);
RDebugUtils.currentLine=7340104;
 //BA.debugLineNum = 7340104;BA.debugLine="If deviceType = 2 Then  ' solo ultra, cups y nm";
if (_devicetype==2) { 
RDebugUtils.currentLine=7340105;
 //BA.debugLineNum = 7340105;BA.debugLine="bc.ArrayCopy(Characteristics.Get(cNormal), 4,";
_bc.ArrayCopy(_characteristics.Get((Object)(_cnormal)),(int) (4),(Object)(_bvars),(int) (0),(int) (4));
RDebugUtils.currentLine=7340107;
 //BA.debugLineNum = 7340107;BA.debugLine="calcs_1.battery = ToUnsigned(bVars(0))*10";
_calcs_1._battery = (int) (_tounsigned(_bvars[(int) (0)])*10);
RDebugUtils.currentLine=7340108;
 //BA.debugLineNum = 7340108;BA.debugLine="calcs_1.temp = ToUnsigned(bVars(1)) - 100";
_calcs_1._temp = (int) (_tounsigned(_bvars[(int) (1)])-100);
RDebugUtils.currentLine=7340109;
 //BA.debugLineNum = 7340109;BA.debugLine="calcs_1.roll = ToUnsigned(bVars(2)) - 90";
_calcs_1._roll = (int) (_tounsigned(_bvars[(int) (2)])-90);
RDebugUtils.currentLine=7340110;
 //BA.debugLineNum = 7340110;BA.debugLine="calcs_1.pitch = ToUnsigned(bVars(3)) - 90";
_calcs_1._pitch = (int) (_tounsigned(_bvars[(int) (3)])-90);
RDebugUtils.currentLine=7340113;
 //BA.debugLineNum = 7340113;BA.debugLine="bc.ArrayCopy(Characteristics.Get(cNormal), 8,";
_bc.ArrayCopy(_characteristics.Get((Object)(_cnormal)),(int) (8),(Object)(_bvars),(int) (0),(int) (2));
RDebugUtils.currentLine=7340114;
 //BA.debugLineNum = 7340114;BA.debugLine="sVars = bc.ShortsFromBytes( bVars )";
_svars = _bc.ShortsFromBytes(_bvars);
RDebugUtils.currentLine=7340115;
 //BA.debugLineNum = 7340115;BA.debugLine="calcs_1.ecompass = 360-sVars(0) + Main.offset_";
_calcs_1._ecompass = (int) (360-_svars[(int) (0)]+mostCurrent._main._offset_angle);
 };
RDebugUtils.currentLine=7340121;
 //BA.debugLineNum = 7340121;BA.debugLine="c_ble = c_ble + 1";
_c_ble = (int) (_c_ble+1);
RDebugUtils.currentLine=7340122;
 //BA.debugLineNum = 7340122;BA.debugLine="calcs_1.calc";
_calcs_1._calc(null);
RDebugUtils.currentLine=7340123;
 //BA.debugLineNum = 7340123;BA.debugLine="If Not( Main.bPaused ) Then";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._main._bpaused)) { 
RDebugUtils.currentLine=7340124;
 //BA.debugLineNum = 7340124;BA.debugLine="CallSubDelayed2( Main, \"Update\", False)";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._main.getObject()),"Update",(Object)(anywheresoftware.b4a.keywords.Common.False));
 };
 };
RDebugUtils.currentLine=7340127;
 //BA.debugLineNum = 7340127;BA.debugLine="If Characteristics.ContainsKey(cRate) Then";
if (_characteristics.ContainsKey((Object)(_crate))) { 
RDebugUtils.currentLine=7340128;
 //BA.debugLineNum = 7340128;BA.debugLine="Log( Characteristics.Get(cRate) )";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_characteristics.Get((Object)(_crate))));
 };
 }else 
{RDebugUtils.currentLine=7340131;
 //BA.debugLineNum = 7340131;BA.debugLine="Else If ServiceId.StartsWith( \"0000180a\" ) Then";
if (_serviceid.startsWith("0000180a")) { 
RDebugUtils.currentLine=7340133;
 //BA.debugLineNum = 7340133;BA.debugLine="Dim bc As ByteConverter";
_bc = new anywheresoftware.b4a.agraham.byteconverter.ByteConverter();
RDebugUtils.currentLine=7340134;
 //BA.debugLineNum = 7340134;BA.debugLine="bc.LittleEndian = True";
_bc.setLittleEndian(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=7340135;
 //BA.debugLineNum = 7340135;BA.debugLine="deviceInfo.Initialize";
_deviceinfo.Initialize();
RDebugUtils.currentLine=7340136;
 //BA.debugLineNum = 7340136;BA.debugLine="For Each id As String In Characteristics.Keys";
{
final anywheresoftware.b4a.BA.IterableList group68 = _characteristics.Keys();
final int groupLen68 = group68.getSize()
;int index68 = 0;
;
for (; index68 < groupLen68;index68++){
_id = BA.ObjectToString(group68.Get(index68));
RDebugUtils.currentLine=7340137;
 //BA.debugLineNum = 7340137;BA.debugLine="If id.StartsWith(\"00002a29\") Then 'Manufacturer";
if (_id.startsWith("00002a29")) { 
RDebugUtils.currentLine=7340138;
 //BA.debugLineNum = 7340138;BA.debugLine="deviceInfo.Put(\"Manufacturer Name\", bc.StringF";
_deviceinfo.Put((Object)("Manufacturer Name"),(Object)(_bc.StringFromBytes((byte[])(_characteristics.Get((Object)(_id))),"ASCII")));
 }else 
{RDebugUtils.currentLine=7340139;
 //BA.debugLineNum = 7340139;BA.debugLine="else if id.StartsWith(\"00002a24\") Then 'Model n";
if (_id.startsWith("00002a24")) { 
RDebugUtils.currentLine=7340140;
 //BA.debugLineNum = 7340140;BA.debugLine="deviceInfo.Put(\"Model Number\", bc.StringFromBy";
_deviceinfo.Put((Object)("Model Number"),(Object)(_bc.StringFromBytes((byte[])(_characteristics.Get((Object)(_id))),"ASCII")));
 }else 
{RDebugUtils.currentLine=7340141;
 //BA.debugLineNum = 7340141;BA.debugLine="else if id.StartsWith(\"00002a25\") Then 'Serial";
if (_id.startsWith("00002a25")) { 
RDebugUtils.currentLine=7340142;
 //BA.debugLineNum = 7340142;BA.debugLine="deviceInfo.Put(\"Serial Number\", bc.StringFromB";
_deviceinfo.Put((Object)("Serial Number"),(Object)(_bc.StringFromBytes((byte[])(_characteristics.Get((Object)(_id))),"ASCII")));
 }else 
{RDebugUtils.currentLine=7340143;
 //BA.debugLineNum = 7340143;BA.debugLine="else if id.StartsWith(\"00002a27\") Then 'HW revi";
if (_id.startsWith("00002a27")) { 
RDebugUtils.currentLine=7340144;
 //BA.debugLineNum = 7340144;BA.debugLine="deviceInfo.Put(\"Hardware Revision\", bc.StringF";
_deviceinfo.Put((Object)("Hardware Revision"),(Object)(_bc.StringFromBytes((byte[])(_characteristics.Get((Object)(_id))),"ASCII")));
 }else 
{RDebugUtils.currentLine=7340145;
 //BA.debugLineNum = 7340145;BA.debugLine="else if id.StartsWith(\"00002a26\") Then 'FW revi";
if (_id.startsWith("00002a26")) { 
RDebugUtils.currentLine=7340146;
 //BA.debugLineNum = 7340146;BA.debugLine="deviceInfo.Put(\"Firmware Revision\", bc.StringF";
_deviceinfo.Put((Object)("Firmware Revision"),(Object)(_bc.StringFromBytes((byte[])(_characteristics.Get((Object)(_id))),"ASCII")));
 }else 
{RDebugUtils.currentLine=7340147;
 //BA.debugLineNum = 7340147;BA.debugLine="else if id.StartsWith(\"00002a28\") Then 'SW revi";
if (_id.startsWith("00002a28")) { 
RDebugUtils.currentLine=7340148;
 //BA.debugLineNum = 7340148;BA.debugLine="deviceInfo.Put(\"Software Revision\", bc.StringF";
_deviceinfo.Put((Object)("Software Revision"),(Object)(_bc.StringFromBytes((byte[])(_characteristics.Get((Object)(_id))),"ASCII")));
 }}}}}}
;
 }
};
 }}
;
RDebugUtils.currentLine=7340154;
 //BA.debugLineNum = 7340154;BA.debugLine="End Sub";
return "";
}
public static int  _tounsigned(byte _b) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "tounsigned"))
	 {return ((Integer) Debug.delegate(processBA, "tounsigned", new Object[] {_b}));}
RDebugUtils.currentLine=7405568;
 //BA.debugLineNum = 7405568;BA.debugLine="Sub ToUnsigned(b As Byte) As Int";
RDebugUtils.currentLine=7405569;
 //BA.debugLineNum = 7405569;BA.debugLine="Return Bit.And(0xFF, b)";
if (true) return anywheresoftware.b4a.keywords.Common.Bit.And((int) (0xff),(int) (_b));
RDebugUtils.currentLine=7405570;
 //BA.debugLineNum = 7405570;BA.debugLine="End Sub";
return 0;
}
public static String  _ble_devicefound(String _name,String _macaddress,anywheresoftware.b4a.objects.collections.Map _advertisingdata,double _rssi) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "ble_devicefound"))
	 {return ((String) Debug.delegate(processBA, "ble_devicefound", new Object[] {_name,_macaddress,_advertisingdata,_rssi}));}
com.calypsoinstruments.anemotracker.starter._tultra _ultra = null;
RDebugUtils.currentLine=6815744;
 //BA.debugLineNum = 6815744;BA.debugLine="Sub ble_DeviceFound (name As String, MacAddress As";
RDebugUtils.currentLine=6815750;
 //BA.debugLineNum = 6815750;BA.debugLine="Dim ultra As tUltra";
_ultra = new com.calypsoinstruments.anemotracker.starter._tultra();
RDebugUtils.currentLine=6815751;
 //BA.debugLineNum = 6815751;BA.debugLine="ultra.Name = name";
_ultra.Name = _name;
RDebugUtils.currentLine=6815752;
 //BA.debugLineNum = 6815752;BA.debugLine="ultra.MacAddress = MacAddress";
_ultra.MacAddress = _macaddress;
RDebugUtils.currentLine=6815753;
 //BA.debugLineNum = 6815753;BA.debugLine="ultra.RSSI = RSSI";
_ultra.RSSI = _rssi;
RDebugUtils.currentLine=6815755;
 //BA.debugLineNum = 6815755;BA.debugLine="devices.Put( MacAddress, ultra )";
_devices.Put((Object)(_macaddress),(Object)(_ultra));
RDebugUtils.currentLine=6815757;
 //BA.debugLineNum = 6815757;BA.debugLine="If bSelectBLE = True Then CallSubDelayed( actBLE,";
if (_bselectble==anywheresoftware.b4a.keywords.Common.True) { 
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(mostCurrent._actble.getObject()),"addToListRT");};
RDebugUtils.currentLine=6815763;
 //BA.debugLineNum = 6815763;BA.debugLine="End Sub";
return "";
}
public static String  _ble_disconnected() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "ble_disconnected"))
	 {return ((String) Debug.delegate(processBA, "ble_disconnected", null));}
RDebugUtils.currentLine=7012352;
 //BA.debugLineNum = 7012352;BA.debugLine="Sub ble_Disconnected";
RDebugUtils.currentLine=7012354;
 //BA.debugLineNum = 7012354;BA.debugLine="connected = False";
_connected = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=7012356;
 //BA.debugLineNum = 7012356;BA.debugLine="Timer_ble.Enabled = False";
_timer_ble.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=7012357;
 //BA.debugLineNum = 7012357;BA.debugLine="tScan.Enabled = False";
_tscan.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=7012358;
 //BA.debugLineNum = 7012358;BA.debugLine="ToastMessageShow( \"Disconnected from \" & actual_u";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Disconnected from "+_actual_ultra.MacAddress),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=7012359;
 //BA.debugLineNum = 7012359;BA.debugLine="Log(\"disconnected\")";
anywheresoftware.b4a.keywords.Common.Log("disconnected");
RDebugUtils.currentLine=7012369;
 //BA.debugLineNum = 7012369;BA.debugLine="CallSubDelayed( Main, \"remove_secondary_drawer\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(mostCurrent._main.getObject()),"remove_secondary_drawer");
RDebugUtils.currentLine=7012371;
 //BA.debugLineNum = 7012371;BA.debugLine="CallSubDelayed( Main, \"Disconnect\" )";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(mostCurrent._main.getObject()),"Disconnect");
RDebugUtils.currentLine=7012373;
 //BA.debugLineNum = 7012373;BA.debugLine="calcs_1.anemo = 0";
_calcs_1._anemo = (float) (0);
RDebugUtils.currentLine=7012374;
 //BA.debugLineNum = 7012374;BA.debugLine="calcs_1.vane  = 0";
_calcs_1._vane = (float) (0);
RDebugUtils.currentLine=7012375;
 //BA.debugLineNum = 7012375;BA.debugLine="calcs_1.calc";
_calcs_1._calc(null);
RDebugUtils.currentLine=7012376;
 //BA.debugLineNum = 7012376;BA.debugLine="CallSubDelayed2( Main, \"Update\", True )";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._main.getObject()),"Update",(Object)(anywheresoftware.b4a.keywords.Common.True));
RDebugUtils.currentLine=7012377;
 //BA.debugLineNum = 7012377;BA.debugLine="End Sub";
return "";
}
public static String  _ble_discoveryfinished() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "ble_discoveryfinished"))
	 {return ((String) Debug.delegate(processBA, "ble_discoveryfinished", null));}
RDebugUtils.currentLine=7143424;
 //BA.debugLineNum = 7143424;BA.debugLine="Sub ble_DiscoveryFinished";
RDebugUtils.currentLine=7143426;
 //BA.debugLineNum = 7143426;BA.debugLine="If bSelectBLE Then";
if (_bselectble) { 
RDebugUtils.currentLine=7143427;
 //BA.debugLineNum = 7143427;BA.debugLine="CallSubDelayed( actBLE, \"DiscoveryFinished2\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(mostCurrent._actble.getObject()),"DiscoveryFinished2");
 }else {
RDebugUtils.currentLine=7143431;
 //BA.debugLineNum = 7143431;BA.debugLine="ToastMessageShow(\"Searching for last ultra conne";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Searching for last ultra connected"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=7143432;
 //BA.debugLineNum = 7143432;BA.debugLine="Scan.StopScan ' Importante, acelera el proceso..";
_scan.StopScan();
RDebugUtils.currentLine=7143434;
 //BA.debugLineNum = 7143434;BA.debugLine="If Main.kvs.ContainsKey( \"last_ultra\" ) Then";
if (mostCurrent._main._kvs._containskey(null,"last_ultra")) { 
RDebugUtils.currentLine=7143435;
 //BA.debugLineNum = 7143435;BA.debugLine="actual_ultra = Main.kvs.GetObject( \"last_ultra\"";
_actual_ultra = (com.calypsoinstruments.anemotracker.starter._tultra)(mostCurrent._main._kvs._getobject(null,"last_ultra"));
RDebugUtils.currentLine=7143437;
 //BA.debugLineNum = 7143437;BA.debugLine="If devices.ContainsKey( Main.kvs.GetObject( \"la";
if (_devices.ContainsKey(mostCurrent._main._kvs._getobject(null,"last_ultra"))) { 
RDebugUtils.currentLine=7143438;
 //BA.debugLineNum = 7143438;BA.debugLine="ToastMessageShow( \"Trying to connect to \" & ac";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Trying to connect to "+_actual_ultra.MacAddress),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=7143439;
 //BA.debugLineNum = 7143439;BA.debugLine="Scan.Connect2( actual_ultra.MacAddress, False)";
_scan.Connect2(_actual_ultra.MacAddress,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=7143440;
 //BA.debugLineNum = 7143440;BA.debugLine="CallSubDelayed(Main, \"Connecting\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(mostCurrent._main.getObject()),"Connecting");
 };
 };
RDebugUtils.currentLine=7143475;
 //BA.debugLineNum = 7143475;BA.debugLine="devices.Clear";
_devices.Clear();
RDebugUtils.currentLine=7143476;
 //BA.debugLineNum = 7143476;BA.debugLine="CallSubDelayed( Main, \"UpdateDrawer\" )";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(mostCurrent._main.getObject()),"UpdateDrawer");
 };
RDebugUtils.currentLine=7143479;
 //BA.debugLineNum = 7143479;BA.debugLine="End Sub";
return "";
}
public static void  _ble_scan() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "ble_scan"))
	 {Debug.delegate(processBA, "ble_scan", null); return;}
ResumableSub_ble_Scan rsub = new ResumableSub_ble_Scan(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_ble_Scan extends BA.ResumableSub {
public ResumableSub_ble_Scan(com.calypsoinstruments.anemotracker.starter parent) {
this.parent = parent;
}
com.calypsoinstruments.anemotracker.starter parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="starter";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="devices.Clear";
parent._devices.Clear();
RDebugUtils.currentLine=6750211;
 //BA.debugLineNum = 6750211;BA.debugLine="Scan.Disconnect";
parent._scan.Disconnect();
RDebugUtils.currentLine=6750212;
 //BA.debugLineNum = 6750212;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(processBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "starter", "ble_scan"),(int) (100));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=6750213;
 //BA.debugLineNum = 6750213;BA.debugLine="Scan.Scan2( Null, False )";
parent._scan.Scan2((anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=6750214;
 //BA.debugLineNum = 6750214;BA.debugLine="tScan.Initialize( \"tScan\", temporizador )";
parent._tscan.Initialize(processBA,"tScan",parent._temporizador);
RDebugUtils.currentLine=6750215;
 //BA.debugLineNum = 6750215;BA.debugLine="tScan.Enabled = True";
parent._tscan.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=6750216;
 //BA.debugLineNum = 6750216;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _ble_statechanged(int _state) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "ble_statechanged"))
	 {return ((String) Debug.delegate(processBA, "ble_statechanged", new Object[] {_state}));}
RDebugUtils.currentLine=7471104;
 //BA.debugLineNum = 7471104;BA.debugLine="Sub ble_StateChanged(state As Int)";
RDebugUtils.currentLine=7471105;
 //BA.debugLineNum = 7471105;BA.debugLine="If state = Scan.STATE_POWERED_ON Then";
if (_state==_scan.STATE_POWERED_ON) { 
RDebugUtils.currentLine=7471106;
 //BA.debugLineNum = 7471106;BA.debugLine="ToastMessageShow(\"ble habilitado\", True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("ble habilitado"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=7471107;
 //BA.debugLineNum = 7471107;BA.debugLine="bleEnabled = True";
_bleenabled = anywheresoftware.b4a.keywords.Common.True;
 }else 
{RDebugUtils.currentLine=7471109;
 //BA.debugLineNum = 7471109;BA.debugLine="Else If state = Scan.STATE_POWERED_OFF Then";
if (_state==_scan.STATE_POWERED_OFF) { 
RDebugUtils.currentLine=7471110;
 //BA.debugLineNum = 7471110;BA.debugLine="ToastMessageShow(\"ble deshabilitado\", True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("ble deshabilitado"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=7471111;
 //BA.debugLineNum = 7471111;BA.debugLine="bleEnabled = False";
_bleenabled = anywheresoftware.b4a.keywords.Common.False;
 }}
;
RDebugUtils.currentLine=7471113;
 //BA.debugLineNum = 7471113;BA.debugLine="End Sub";
return "";
}
public static String  _checkgps() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "checkgps"))
	 {return ((String) Debug.delegate(processBA, "checkgps", null));}
RDebugUtils.currentLine=6619136;
 //BA.debugLineNum = 6619136;BA.debugLine="Public Sub checkGps";
RDebugUtils.currentLine=6619137;
 //BA.debugLineNum = 6619137;BA.debugLine="If gps1.IsInitialized And gps1.GPSEnabled Then";
if (_gps1.IsInitialized() && _gps1.getGPSEnabled()) { 
RDebugUtils.currentLine=6619138;
 //BA.debugLineNum = 6619138;BA.debugLine="gps_start";
_gps_start();
 };
RDebugUtils.currentLine=6619140;
 //BA.debugLineNum = 6619140;BA.debugLine="End Sub";
return "";
}
public static String  _gps_start() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "gps_start"))
	 {return ((String) Debug.delegate(processBA, "gps_start", null));}
RDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Sub gps_start";
RDebugUtils.currentLine=6684674;
 //BA.debugLineNum = 6684674;BA.debugLine="If Main.GPSEnabled Then";
if (mostCurrent._main._gpsenabled) { 
RDebugUtils.currentLine=6684675;
 //BA.debugLineNum = 6684675;BA.debugLine="gps1.Start( 5000, 5 )";
_gps1.Start(processBA,(long) (5000),(float) (5));
 }else {
 };
RDebugUtils.currentLine=6684681;
 //BA.debugLineNum = 6684681;BA.debugLine="End Sub";
return "";
}
public static String  _connectble(com.calypsoinstruments.anemotracker.starter._tultra _ultra) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "connectble"))
	 {return ((String) Debug.delegate(processBA, "connectble", new Object[] {_ultra}));}
RDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Sub ConnectBle( ultra As tUltra )";
RDebugUtils.currentLine=6881281;
 //BA.debugLineNum = 6881281;BA.debugLine="Scan.StopScan";
_scan.StopScan();
RDebugUtils.currentLine=6881283;
 //BA.debugLineNum = 6881283;BA.debugLine="Try";
try {RDebugUtils.currentLine=6881284;
 //BA.debugLineNum = 6881284;BA.debugLine="actual_ultra = ultra";
_actual_ultra = _ultra;
RDebugUtils.currentLine=6881285;
 //BA.debugLineNum = 6881285;BA.debugLine="CallSubDelayed(Main, \"Connecting\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(mostCurrent._main.getObject()),"Connecting");
RDebugUtils.currentLine=6881286;
 //BA.debugLineNum = 6881286;BA.debugLine="Scan.Connect2(ultra.MacAddress, False)";
_scan.Connect2(_ultra.MacAddress,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=6881287;
 //BA.debugLineNum = 6881287;BA.debugLine="tryTimes = 0";
_trytimes = (int) (0);
 } 
       catch (Exception e8) {
			processBA.setLastException(e8);RDebugUtils.currentLine=6881289;
 //BA.debugLineNum = 6881289;BA.debugLine="Log(\"ConnectBle Exception: \" & LastException)";
anywheresoftware.b4a.keywords.Common.Log("ConnectBle Exception: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)));
RDebugUtils.currentLine=6881295;
 //BA.debugLineNum = 6881295;BA.debugLine="Log (\"ERROR. Se ha superado el numero de intent";
anywheresoftware.b4a.keywords.Common.Log("ERROR. Se ha superado el numero de intentos");
RDebugUtils.currentLine=6881296;
 //BA.debugLineNum = 6881296;BA.debugLine="ToastMessageShow(\"Unable to connect. Plese, try";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Unable to connect. Plese, try again later"),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=6881299;
 //BA.debugLineNum = 6881299;BA.debugLine="End Sub";
return "";
}
public static String  _gps_locationchanged(anywheresoftware.b4a.gps.LocationWrapper _location1) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "gps_locationchanged"))
	 {return ((String) Debug.delegate(processBA, "gps_locationchanged", new Object[] {_location1}));}
RDebugUtils.currentLine=6553600;
 //BA.debugLineNum = 6553600;BA.debugLine="Sub gps_LocationChanged (Location1 As Location)";
RDebugUtils.currentLine=6553602;
 //BA.debugLineNum = 6553602;BA.debugLine="calcs_1.speed = Round2( Location1.Speed, 2 )";
_calcs_1._speed = (float) (anywheresoftware.b4a.keywords.Common.Round2(_location1.getSpeed(),(int) (2)));
RDebugUtils.currentLine=6553603;
 //BA.debugLineNum = 6553603;BA.debugLine="calcs_1.bearing = Location1.Bearing";
_calcs_1._bearing = _location1.getBearing();
RDebugUtils.currentLine=6553604;
 //BA.debugLineNum = 6553604;BA.debugLine="calcs_1.latitude = Location1.Latitude";
_calcs_1._latitude = (float) (_location1.getLatitude());
RDebugUtils.currentLine=6553605;
 //BA.debugLineNum = 6553605;BA.debugLine="calcs_1.longitude = Location1.Longitude";
_calcs_1._longitude = (float) (_location1.getLongitude());
RDebugUtils.currentLine=6553606;
 //BA.debugLineNum = 6553606;BA.debugLine="calcs_1.altitude = Location1.Altitude";
_calcs_1._altitude = (float) (_location1.getAltitude());
RDebugUtils.currentLine=6553607;
 //BA.debugLineNum = 6553607;BA.debugLine="calcs_1.calc";
_calcs_1._calc(null);
RDebugUtils.currentLine=6553608;
 //BA.debugLineNum = 6553608;BA.debugLine="gps_changed = True";
_gps_changed = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=6553609;
 //BA.debugLineNum = 6553609;BA.debugLine="gps_location = Location1";
_gps_location = _location1;
RDebugUtils.currentLine=6553611;
 //BA.debugLineNum = 6553611;BA.debugLine="End Sub";
return "";
}
public static String  _gps_userenabled(boolean _enabled) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "gps_userenabled"))
	 {return ((String) Debug.delegate(processBA, "gps_userenabled", new Object[] {_enabled}));}
RDebugUtils.currentLine=6488064;
 //BA.debugLineNum = 6488064;BA.debugLine="Sub gps_UserEnabled (Enabled As Boolean)";
RDebugUtils.currentLine=6488065;
 //BA.debugLineNum = 6488065;BA.debugLine="If Enabled Then";
if (_enabled) { 
RDebugUtils.currentLine=6488066;
 //BA.debugLineNum = 6488066;BA.debugLine="ToastMessageShow(\"GPS device enabled\", True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("GPS device enabled"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=6488067;
 //BA.debugLineNum = 6488067;BA.debugLine="gps1Enabled = True";
_gps1enabled = anywheresoftware.b4a.keywords.Common.True;
 }else {
RDebugUtils.currentLine=6488069;
 //BA.debugLineNum = 6488069;BA.debugLine="ToastMessageShow(\"GPS device disabled\", True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("GPS device disabled"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=6488070;
 //BA.debugLineNum = 6488070;BA.debugLine="gps1Enabled = False";
_gps1enabled = anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=6488072;
 //BA.debugLineNum = 6488072;BA.debugLine="End Sub";
return "";
}
public static String  _logcat_logcatdata(byte[] _buffer,int _length) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "logcat_logcatdata"))
	 {return ((String) Debug.delegate(processBA, "logcat_logcatdata", new Object[] {_buffer,_length}));}
RDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Private Sub logcat_LogCatData (Buffer() As Byte, L";
RDebugUtils.currentLine=6225921;
 //BA.debugLineNum = 6225921;BA.debugLine="logs.Append(BytesToString(Buffer, 0, Length, \"utf";
_logs.Append(anywheresoftware.b4a.keywords.Common.BytesToString(_buffer,(int) (0),_length,"utf8"));
RDebugUtils.currentLine=6225922;
 //BA.debugLineNum = 6225922;BA.debugLine="If logs.Length > 5000 Then";
if (_logs.getLength()>5000) { 
RDebugUtils.currentLine=6225923;
 //BA.debugLineNum = 6225923;BA.debugLine="logs.Remove(0, logs.Length - 4000)";
_logs.Remove((int) (0),(int) (_logs.getLength()-4000));
 };
RDebugUtils.currentLine=6225925;
 //BA.debugLineNum = 6225925;BA.debugLine="End Sub";
return "";
}
public static String  _orientation_sensorchanged(float[] _values) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "orientation_sensorchanged"))
	 {return ((String) Debug.delegate(processBA, "orientation_sensorchanged", new Object[] {_values}));}
RDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="Sub orientation_SensorChanged (Values() As Float)";
RDebugUtils.currentLine=6422530;
 //BA.debugLineNum = 6422530;BA.debugLine="fOrientation = Values(0)";
_forientation = _values[(int) (0)];
RDebugUtils.currentLine=6422531;
 //BA.debugLineNum = 6422531;BA.debugLine="If Not( Main.portrait ) Then";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._main._portrait)) { 
RDebugUtils.currentLine=6422532;
 //BA.debugLineNum = 6422532;BA.debugLine="fOrientation = fOrientation + 90";
_forientation = (float) (_forientation+90);
 };
RDebugUtils.currentLine=6422536;
 //BA.debugLineNum = 6422536;BA.debugLine="calcs_1.compass = 360-fOrientation";
_calcs_1._compass = (float) (360-_forientation);
RDebugUtils.currentLine=6422542;
 //BA.debugLineNum = 6422542;BA.debugLine="calcs_1.calc";
_calcs_1._calc(null);
RDebugUtils.currentLine=6422543;
 //BA.debugLineNum = 6422543;BA.debugLine="End Sub";
return "";
}
public static String  _selectedble(String _ret_char) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "selectedble"))
	 {return ((String) Debug.delegate(processBA, "selectedble", new Object[] {_ret_char}));}
RDebugUtils.currentLine=7208960;
 //BA.debugLineNum = 7208960;BA.debugLine="Sub SelectedBLE( ret_char As String )  	' Called f";
RDebugUtils.currentLine=7208983;
 //BA.debugLineNum = 7208983;BA.debugLine="End Sub";
return "";
}
public static String  _service_create() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "service_create"))
	 {return ((String) Debug.delegate(processBA, "service_create", null));}
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=6029312;
 //BA.debugLineNum = 6029312;BA.debugLine="Sub Service_Create";
RDebugUtils.currentLine=6029316;
 //BA.debugLineNum = 6029316;BA.debugLine="n.Initialize";
_n.Initialize();
RDebugUtils.currentLine=6029317;
 //BA.debugLineNum = 6029317;BA.debugLine="n.Icon = \"icon\"";
_n.setIcon("icon");
RDebugUtils.currentLine=6029318;
 //BA.debugLineNum = 6029318;BA.debugLine="n.light = False";
_n.setLight(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=6029319;
 //BA.debugLineNum = 6029319;BA.debugLine="n.Sound = False";
_n.setSound(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=6029320;
 //BA.debugLineNum = 6029320;BA.debugLine="n.Vibrate = False";
_n.setVibrate(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=6029321;
 //BA.debugLineNum = 6029321;BA.debugLine="n.OnGoingEvent = True";
_n.setOnGoingEvent(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=6029322;
 //BA.debugLineNum = 6029322;BA.debugLine="n.SetInfo(\"AnemoTracker running\", \"Gps and compas";
_n.SetInfoNew(processBA,BA.ObjectToCharSequence("AnemoTracker running"),BA.ObjectToCharSequence("Gps and compass active"),(Object)(mostCurrent._main.getObject()));
RDebugUtils.currentLine=6029323;
 //BA.debugLineNum = 6029323;BA.debugLine="Service.StartForeground( 1, n )";
mostCurrent._service.StartForeground((int) (1),(android.app.Notification)(_n.getObject()));
RDebugUtils.currentLine=6029326;
 //BA.debugLineNum = 6029326;BA.debugLine="b_nav = False";
_b_nav = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=6029328;
 //BA.debugLineNum = 6029328;BA.debugLine="b_true = True";
_b_true = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=6029329;
 //BA.debugLineNum = 6029329;BA.debugLine="navigation = 0";
_navigation = (int) (0);
RDebugUtils.currentLine=6029331;
 //BA.debugLineNum = 6029331;BA.debugLine="b_net = False";
_b_net = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=6029333;
 //BA.debugLineNum = 6029333;BA.debugLine="orientation.Initialize2(orientation.TYPE_ORIENTAT";
_orientation.Initialize2(_orientation.TYPE_ORIENTATION,(int) (3));
RDebugUtils.currentLine=6029335;
 //BA.debugLineNum = 6029335;BA.debugLine="Scan.Initialize(\"ble\")";
_scan.Initialize(processBA,"ble");
RDebugUtils.currentLine=6029336;
 //BA.debugLineNum = 6029336;BA.debugLine="gps1.Initialize(\"gps\")";
_gps1.Initialize("gps");
RDebugUtils.currentLine=6029339;
 //BA.debugLineNum = 6029339;BA.debugLine="calcs_1.Initialize";
_calcs_1._initialize(null,processBA);
RDebugUtils.currentLine=6029341;
 //BA.debugLineNum = 6029341;BA.debugLine="devices.Initialize";
_devices.Initialize();
RDebugUtils.currentLine=6029344;
 //BA.debugLineNum = 6029344;BA.debugLine="sql1.Initialize(File.DirInternal, \"sailwind.db\",";
_sql1.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"sailwind.db",anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=6029347;
 //BA.debugLineNum = 6029347;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=6029348;
 //BA.debugLineNum = 6029348;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=6029349;
 //BA.debugLineNum = 6029349;BA.debugLine="m.Put(\"id\", DBUtils.DB_INTEGER)";
_m.Put((Object)("id"),(Object)(mostCurrent._dbutils._db_integer));
RDebugUtils.currentLine=6029350;
 //BA.debugLineNum = 6029350;BA.debugLine="m.Put(\"name\", DBUtils.DB_TEXT)";
_m.Put((Object)("name"),(Object)(mostCurrent._dbutils._db_text));
RDebugUtils.currentLine=6029351;
 //BA.debugLineNum = 6029351;BA.debugLine="m.Put(\"description\", DBUtils.DB_TEXT)";
_m.Put((Object)("description"),(Object)(mostCurrent._dbutils._db_text));
RDebugUtils.currentLine=6029352;
 //BA.debugLineNum = 6029352;BA.debugLine="m.Put(\"e_id\", DBUtils.DB_INTEGER )";
_m.Put((Object)("e_id"),(Object)(mostCurrent._dbutils._db_integer));
RDebugUtils.currentLine=6029353;
 //BA.debugLineNum = 6029353;BA.debugLine="DBUtils.CreateTable(sql1, \"boat\", m, \"id\", True )";
mostCurrent._dbutils._createtable(processBA,_sql1,"boat",_m,"id",anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=6029355;
 //BA.debugLineNum = 6029355;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=6029356;
 //BA.debugLineNum = 6029356;BA.debugLine="m.Put(\"id\", DBUtils.DB_INTEGER)";
_m.Put((Object)("id"),(Object)(mostCurrent._dbutils._db_integer));
RDebugUtils.currentLine=6029357;
 //BA.debugLineNum = 6029357;BA.debugLine="m.Put(\"name\", DBUtils.DB_TEXT)";
_m.Put((Object)("name"),(Object)(mostCurrent._dbutils._db_text));
RDebugUtils.currentLine=6029358;
 //BA.debugLineNum = 6029358;BA.debugLine="m.Put(\"description\", DBUtils.DB_TEXT)";
_m.Put((Object)("description"),(Object)(mostCurrent._dbutils._db_text));
RDebugUtils.currentLine=6029359;
 //BA.debugLineNum = 6029359;BA.debugLine="m.Put(\"date_start\", DBUtils.DB_INTEGER)";
_m.Put((Object)("date_start"),(Object)(mostCurrent._dbutils._db_integer));
RDebugUtils.currentLine=6029360;
 //BA.debugLineNum = 6029360;BA.debugLine="m.Put(\"boat_id\", DBUtils.DB_INTEGER)";
_m.Put((Object)("boat_id"),(Object)(mostCurrent._dbutils._db_integer));
RDebugUtils.currentLine=6029361;
 //BA.debugLineNum = 6029361;BA.debugLine="m.Put(\"e_id\", DBUtils.DB_INTEGER )";
_m.Put((Object)("e_id"),(Object)(mostCurrent._dbutils._db_integer));
RDebugUtils.currentLine=6029362;
 //BA.debugLineNum = 6029362;BA.debugLine="DBUtils.CreateTable(sql1, \"navigation\", m, \"id\",";
mostCurrent._dbutils._createtable(processBA,_sql1,"navigation",_m,"id",anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=6029364;
 //BA.debugLineNum = 6029364;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=6029365;
 //BA.debugLineNum = 6029365;BA.debugLine="m.Put(\"id\", DBUtils.DB_INTEGER)";
_m.Put((Object)("id"),(Object)(mostCurrent._dbutils._db_integer));
RDebugUtils.currentLine=6029366;
 //BA.debugLineNum = 6029366;BA.debugLine="m.Put(\"navigation_id\", DBUtils.DB_INTEGER)";
_m.Put((Object)("navigation_id"),(Object)(mostCurrent._dbutils._db_integer));
RDebugUtils.currentLine=6029367;
 //BA.debugLineNum = 6029367;BA.debugLine="m.Put(\"lat\", DBUtils.DB_REAL)";
_m.Put((Object)("lat"),(Object)(mostCurrent._dbutils._db_real));
RDebugUtils.currentLine=6029368;
 //BA.debugLineNum = 6029368;BA.debugLine="m.Put(\"lon\", DBUtils.DB_REAL)";
_m.Put((Object)("lon"),(Object)(mostCurrent._dbutils._db_real));
RDebugUtils.currentLine=6029369;
 //BA.debugLineNum = 6029369;BA.debugLine="m.Put(\"date\", DBUtils.DB_INTEGER)";
_m.Put((Object)("date"),(Object)(mostCurrent._dbutils._db_integer));
RDebugUtils.currentLine=6029370;
 //BA.debugLineNum = 6029370;BA.debugLine="m.Put(\"e_id\", DBUtils.DB_INTEGER )";
_m.Put((Object)("e_id"),(Object)(mostCurrent._dbutils._db_integer));
RDebugUtils.currentLine=6029371;
 //BA.debugLineNum = 6029371;BA.debugLine="m.Put(\"awa\", DBUtils.DB_REAL)";
_m.Put((Object)("awa"),(Object)(mostCurrent._dbutils._db_real));
RDebugUtils.currentLine=6029372;
 //BA.debugLineNum = 6029372;BA.debugLine="m.Put(\"awm\", DBUtils.DB_REAL)";
_m.Put((Object)("awm"),(Object)(mostCurrent._dbutils._db_real));
RDebugUtils.currentLine=6029373;
 //BA.debugLineNum = 6029373;BA.debugLine="m.Put(\"twa\", DBUtils.DB_REAL)";
_m.Put((Object)("twa"),(Object)(mostCurrent._dbutils._db_real));
RDebugUtils.currentLine=6029374;
 //BA.debugLineNum = 6029374;BA.debugLine="m.Put(\"twm\", DBUtils.DB_REAL)";
_m.Put((Object)("twm"),(Object)(mostCurrent._dbutils._db_real));
RDebugUtils.currentLine=6029375;
 //BA.debugLineNum = 6029375;BA.debugLine="m.Put(\"bearing\", DBUtils.DB_REAL)";
_m.Put((Object)("bearing"),(Object)(mostCurrent._dbutils._db_real));
RDebugUtils.currentLine=6029376;
 //BA.debugLineNum = 6029376;BA.debugLine="m.Put(\"speed\", DBUtils.DB_REAL)";
_m.Put((Object)("speed"),(Object)(mostCurrent._dbutils._db_real));
RDebugUtils.currentLine=6029378;
 //BA.debugLineNum = 6029378;BA.debugLine="m.Put(\"battery\", DBUtils.DB_REAL )";
_m.Put((Object)("battery"),(Object)(mostCurrent._dbutils._db_real));
RDebugUtils.currentLine=6029379;
 //BA.debugLineNum = 6029379;BA.debugLine="m.Put(\"temp\", DBUtils.DB_REAL )";
_m.Put((Object)("temp"),(Object)(mostCurrent._dbutils._db_real));
RDebugUtils.currentLine=6029380;
 //BA.debugLineNum = 6029380;BA.debugLine="m.Put(\"roll\", DBUtils.DB_REAL)";
_m.Put((Object)("roll"),(Object)(mostCurrent._dbutils._db_real));
RDebugUtils.currentLine=6029381;
 //BA.debugLineNum = 6029381;BA.debugLine="m.Put(\"pitch\", DBUtils.DB_REAL)";
_m.Put((Object)("pitch"),(Object)(mostCurrent._dbutils._db_real));
RDebugUtils.currentLine=6029382;
 //BA.debugLineNum = 6029382;BA.debugLine="m.Put(\"ecompass\", DBUtils.DB_REAL)";
_m.Put((Object)("ecompass"),(Object)(mostCurrent._dbutils._db_real));
RDebugUtils.currentLine=6029384;
 //BA.debugLineNum = 6029384;BA.debugLine="DBUtils.CreateTable(sql1, \"route5\", m, \"id\", True";
mostCurrent._dbutils._createtable(processBA,_sql1,"route5",_m,"id",anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=6029386;
 //BA.debugLineNum = 6029386;BA.debugLine="logs.Initialize";
_logs.Initialize();
RDebugUtils.currentLine=6029391;
 //BA.debugLineNum = 6029391;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "service_destroy"))
	 {return ((String) Debug.delegate(processBA, "service_destroy", null));}
RDebugUtils.currentLine=6356992;
 //BA.debugLineNum = 6356992;BA.debugLine="Sub Service_Destroy";
RDebugUtils.currentLine=6356993;
 //BA.debugLineNum = 6356993;BA.debugLine="gps1.stop";
_gps1.Stop();
RDebugUtils.currentLine=6356994;
 //BA.debugLineNum = 6356994;BA.debugLine="orientation.StopListening";
_orientation.StopListening(processBA);
RDebugUtils.currentLine=6356995;
 //BA.debugLineNum = 6356995;BA.debugLine="End Sub";
return "";
}
public static String  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "service_start"))
	 {return ((String) Debug.delegate(processBA, "service_start", new Object[] {_startingintent}));}
RDebugUtils.currentLine=6094848;
 //BA.debugLineNum = 6094848;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
RDebugUtils.currentLine=6094850;
 //BA.debugLineNum = 6094850;BA.debugLine="Timer_ble.Initialize( \"Timer_ble\", 5000 )";
_timer_ble.Initialize(processBA,"Timer_ble",(long) (5000));
RDebugUtils.currentLine=6094851;
 //BA.debugLineNum = 6094851;BA.debugLine="Timer_ble.Enabled = False";
_timer_ble.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=6094852;
 //BA.debugLineNum = 6094852;BA.debugLine="Timer_sqlite.Initialize( \"Timer_sqlite\", 5000 )";
_timer_sqlite.Initialize(processBA,"Timer_sqlite",(long) (5000));
RDebugUtils.currentLine=6094854;
 //BA.debugLineNum = 6094854;BA.debugLine="If gps1.IsInitialized Then";
if (_gps1.IsInitialized()) { 
RDebugUtils.currentLine=6094855;
 //BA.debugLineNum = 6094855;BA.debugLine="If gps1.GPSEnabled And Main.rp.Check(Main.rp.PER";
if (_gps1.getGPSEnabled() && mostCurrent._main._rp.Check(mostCurrent._main._rp.PERMISSION_ACCESS_FINE_LOCATION)) { 
RDebugUtils.currentLine=6094856;
 //BA.debugLineNum = 6094856;BA.debugLine="gps_start";
_gps_start();
 }else 
{RDebugUtils.currentLine=6094857;
 //BA.debugLineNum = 6094857;BA.debugLine="Else if Main.rp.Check(Main.rp.PERMISSION_ACCESS_";
if (mostCurrent._main._rp.Check(mostCurrent._main._rp.PERMISSION_ACCESS_FINE_LOCATION)==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=6094858;
 //BA.debugLineNum = 6094858;BA.debugLine="gps1Enabled = False";
_gps1enabled = anywheresoftware.b4a.keywords.Common.False;
 }}
;
 };
RDebugUtils.currentLine=6094861;
 //BA.debugLineNum = 6094861;BA.debugLine="gps_changed = False";
_gps_changed = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=6094865;
 //BA.debugLineNum = 6094865;BA.debugLine="If Scan.State = 12 Then '12 es todo activo";
if (_scan.getState()==12) { 
RDebugUtils.currentLine=6094867;
 //BA.debugLineNum = 6094867;BA.debugLine="temporizador = 10000";
_temporizador = (long) (10000);
RDebugUtils.currentLine=6094868;
 //BA.debugLineNum = 6094868;BA.debugLine="ToastMessageShow( \"Searching BLE devices\", True";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Searching BLE devices"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=6094869;
 //BA.debugLineNum = 6094869;BA.debugLine="ble_Scan";
_ble_scan();
RDebugUtils.currentLine=6094870;
 //BA.debugLineNum = 6094870;BA.debugLine="bleEnabled = True";
_bleenabled = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=6094871;
 //BA.debugLineNum = 6094871;BA.debugLine="bSelectBLE = False";
_bselectble = anywheresoftware.b4a.keywords.Common.False;
 }else {
RDebugUtils.currentLine=6094873;
 //BA.debugLineNum = 6094873;BA.debugLine="bleEnabled = False";
_bleenabled = anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=6094876;
 //BA.debugLineNum = 6094876;BA.debugLine="Main.kvs.Initialize(File.DirInternal, \"kvs\")";
mostCurrent._main._kvs._initialize(null,processBA,anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"kvs");
RDebugUtils.currentLine=6094877;
 //BA.debugLineNum = 6094877;BA.debugLine="If Main.kvs.ContainsKey( \"calibration_offset\" ) T";
if (mostCurrent._main._kvs._containskey(null,"calibration_offset")) { 
RDebugUtils.currentLine=6094878;
 //BA.debugLineNum = 6094878;BA.debugLine="calcs_1.offset =  Main.kvs.GetSimple( \"calibrati";
_calcs_1._offset = (float)(Double.parseDouble(mostCurrent._main._kvs._getsimple(null,"calibration_offset")));
RDebugUtils.currentLine=6094879;
 //BA.debugLineNum = 6094879;BA.debugLine="Main.offset_angle = calcs_1.offset";
mostCurrent._main._offset_angle = _calcs_1._offset;
 }else {
RDebugUtils.currentLine=6094881;
 //BA.debugLineNum = 6094881;BA.debugLine="calcs_1.offset = 0";
_calcs_1._offset = (float) (0);
RDebugUtils.currentLine=6094882;
 //BA.debugLineNum = 6094882;BA.debugLine="Main.offset_angle = 0";
mostCurrent._main._offset_angle = 0;
 };
RDebugUtils.currentLine=6094884;
 //BA.debugLineNum = 6094884;BA.debugLine="orientation.StartListening(\"orientation\")";
_orientation.StartListening(processBA,"orientation");
RDebugUtils.currentLine=6094885;
 //BA.debugLineNum = 6094885;BA.debugLine="CallSubDelayed( Main, \"UpdateDrawer\" )";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(mostCurrent._main.getObject()),"UpdateDrawer");
RDebugUtils.currentLine=6094886;
 //BA.debugLineNum = 6094886;BA.debugLine="End Sub";
return "";
}
public static String  _service_taskremoved() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "service_taskremoved"))
	 {return ((String) Debug.delegate(processBA, "service_taskremoved", null));}
RDebugUtils.currentLine=6160384;
 //BA.debugLineNum = 6160384;BA.debugLine="Sub Service_TaskRemoved";
RDebugUtils.currentLine=6160386;
 //BA.debugLineNum = 6160386;BA.debugLine="n.Cancel(1)";
_n.Cancel((int) (1));
RDebugUtils.currentLine=6160387;
 //BA.debugLineNum = 6160387;BA.debugLine="Scan.Disconnect";
_scan.Disconnect();
RDebugUtils.currentLine=6160388;
 //BA.debugLineNum = 6160388;BA.debugLine="Service_Destroy";
_service_destroy();
RDebugUtils.currentLine=6160389;
 //BA.debugLineNum = 6160389;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
RDebugUtils.currentLine=6160390;
 //BA.debugLineNum = 6160390;BA.debugLine="End Sub";
return "";
}
public static String  _start_nav(int _id,String[] _fields) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "start_nav"))
	 {return ((String) Debug.delegate(processBA, "start_nav", new Object[] {_id,_fields}));}
String _name = "";
String _descrip = "";
anywheresoftware.b4a.objects.collections.List _l = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=7536640;
 //BA.debugLineNum = 7536640;BA.debugLine="Sub start_nav( id As Int, fields() As String )";
RDebugUtils.currentLine=7536641;
 //BA.debugLineNum = 7536641;BA.debugLine="Dim name = fields(0) As String";
_name = _fields[(int) (0)];
RDebugUtils.currentLine=7536642;
 //BA.debugLineNum = 7536642;BA.debugLine="Dim descrip = fields(1) As String";
_descrip = _fields[(int) (1)];
RDebugUtils.currentLine=7536643;
 //BA.debugLineNum = 7536643;BA.debugLine="Timer_sqlite.Enabled = True";
_timer_sqlite.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=7536644;
 //BA.debugLineNum = 7536644;BA.debugLine="If navigation = 0 Then";
if (_navigation==0) { 
RDebugUtils.currentLine=7536645;
 //BA.debugLineNum = 7536645;BA.debugLine="If id > 0 Then";
if (_id>0) { 
RDebugUtils.currentLine=7536646;
 //BA.debugLineNum = 7536646;BA.debugLine="navigation = id";
_navigation = _id;
 }else {
RDebugUtils.currentLine=7536648;
 //BA.debugLineNum = 7536648;BA.debugLine="If Not( name = Null ) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_name== null)) { 
RDebugUtils.currentLine=7536649;
 //BA.debugLineNum = 7536649;BA.debugLine="Dim l As List";
_l = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7536650;
 //BA.debugLineNum = 7536650;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7536651;
 //BA.debugLineNum = 7536651;BA.debugLine="l.Initialize";
_l.Initialize();
RDebugUtils.currentLine=7536652;
 //BA.debugLineNum = 7536652;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=7536653;
 //BA.debugLineNum = 7536653;BA.debugLine="m.Put(\"name\", name )";
_m.Put((Object)("name"),(Object)(_name));
RDebugUtils.currentLine=7536654;
 //BA.debugLineNum = 7536654;BA.debugLine="m.Put(\"description\", descrip )";
_m.Put((Object)("description"),(Object)(_descrip));
RDebugUtils.currentLine=7536655;
 //BA.debugLineNum = 7536655;BA.debugLine="l.Add( m )";
_l.Add((Object)(_m.getObject()));
RDebugUtils.currentLine=7536656;
 //BA.debugLineNum = 7536656;BA.debugLine="DBUtils.InsertMaps( sql1, \"navigation\", l )";
mostCurrent._dbutils._insertmaps(processBA,_sql1,"navigation",_l);
 };
RDebugUtils.currentLine=7536658;
 //BA.debugLineNum = 7536658;BA.debugLine="m = DBUtils.ExecuteMap( sql1, \"select max(id) f";
_m = mostCurrent._dbutils._executemap(processBA,_sql1,"select max(id) from navigation",(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=7536659;
 //BA.debugLineNum = 7536659;BA.debugLine="navigation = m.Get( \"max(id)\" )";
_navigation = (int)(BA.ObjectToNumber(_m.Get((Object)("max(id)"))));
 };
RDebugUtils.currentLine=7536662;
 //BA.debugLineNum = 7536662;BA.debugLine="ToastMessageShow( \"Registering navigation\", True";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Registering navigation"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=7536667;
 //BA.debugLineNum = 7536667;BA.debugLine="Dim m = DBUtils.ExecuteMap( sql1, \"select * from";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = mostCurrent._dbutils._executemap(processBA,_sql1,"select * from navigation where [id] = "+BA.NumberToString(_navigation),(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=7536668;
 //BA.debugLineNum = 7536668;BA.debugLine="nav_name = m.Get(\"name\" )";
_nav_name = BA.ObjectToString(_m.Get((Object)("name")));
 };
RDebugUtils.currentLine=7536671;
 //BA.debugLineNum = 7536671;BA.debugLine="End Sub";
return "";
}
public static String  _start_net() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "start_net"))
	 {return ((String) Debug.delegate(processBA, "start_net", null));}
RDebugUtils.currentLine=7733248;
 //BA.debugLineNum = 7733248;BA.debugLine="Sub start_net";
RDebugUtils.currentLine=7733249;
 //BA.debugLineNum = 7733249;BA.debugLine="End Sub";
return "";
}
public static String  _stop_nav() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "stop_nav"))
	 {return ((String) Debug.delegate(processBA, "stop_nav", null));}
RDebugUtils.currentLine=7602176;
 //BA.debugLineNum = 7602176;BA.debugLine="Sub stop_nav";
RDebugUtils.currentLine=7602177;
 //BA.debugLineNum = 7602177;BA.debugLine="Timer_sqlite.Enabled = False";
_timer_sqlite.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=7602178;
 //BA.debugLineNum = 7602178;BA.debugLine="navigation = 0";
_navigation = (int) (0);
RDebugUtils.currentLine=7602179;
 //BA.debugLineNum = 7602179;BA.debugLine="End Sub";
return "";
}
public static String  _stop_net() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "stop_net"))
	 {return ((String) Debug.delegate(processBA, "stop_net", null));}
RDebugUtils.currentLine=7798784;
 //BA.debugLineNum = 7798784;BA.debugLine="Sub stop_net";
RDebugUtils.currentLine=7798785;
 //BA.debugLineNum = 7798785;BA.debugLine="End Sub";
return "";
}
public static String  _timer_ble_tick() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "timer_ble_tick"))
	 {return ((String) Debug.delegate(processBA, "timer_ble_tick", null));}
RDebugUtils.currentLine=7274496;
 //BA.debugLineNum = 7274496;BA.debugLine="Sub Timer_ble_tick( )								' This timer calls re";
RDebugUtils.currentLine=7274497;
 //BA.debugLineNum = 7274497;BA.debugLine="If deviceType = 2 Then ' Only portable";
if (_devicetype==2) { 
RDebugUtils.currentLine=7274498;
 //BA.debugLineNum = 7274498;BA.debugLine="Scan.ReadData2( sUltra, cRate )";
_scan.ReadData2(_sultra,_crate);
 };
RDebugUtils.currentLine=7274519;
 //BA.debugLineNum = 7274519;BA.debugLine="End Sub";
return "";
}
public static String  _timer_sqlite_tick() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "timer_sqlite_tick"))
	 {return ((String) Debug.delegate(processBA, "timer_sqlite_tick", null));}
anywheresoftware.b4a.objects.collections.List _l = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=7667712;
 //BA.debugLineNum = 7667712;BA.debugLine="Sub Timer_sqlite_tick";
RDebugUtils.currentLine=7667713;
 //BA.debugLineNum = 7667713;BA.debugLine="Dim l As List";
_l = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7667714;
 //BA.debugLineNum = 7667714;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7667715;
 //BA.debugLineNum = 7667715;BA.debugLine="l.Initialize";
_l.Initialize();
RDebugUtils.currentLine=7667716;
 //BA.debugLineNum = 7667716;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=7667717;
 //BA.debugLineNum = 7667717;BA.debugLine="m.Put(\"navigation_id\", navigation)  ' change to l";
_m.Put((Object)("navigation_id"),(Object)(_navigation));
RDebugUtils.currentLine=7667718;
 //BA.debugLineNum = 7667718;BA.debugLine="m.Put(\"lat\", calcs_1.latitude)";
_m.Put((Object)("lat"),(Object)(_calcs_1._latitude));
RDebugUtils.currentLine=7667719;
 //BA.debugLineNum = 7667719;BA.debugLine="m.Put(\"lon\", calcs_1.longitude)";
_m.Put((Object)("lon"),(Object)(_calcs_1._longitude));
RDebugUtils.currentLine=7667720;
 //BA.debugLineNum = 7667720;BA.debugLine="m.Put(\"date\", DateTime.Now )";
_m.Put((Object)("date"),(Object)(anywheresoftware.b4a.keywords.Common.DateTime.getNow()));
RDebugUtils.currentLine=7667722;
 //BA.debugLineNum = 7667722;BA.debugLine="m.Put(\"awa\", calcs_1.awa)";
_m.Put((Object)("awa"),(Object)(_calcs_1._awa));
RDebugUtils.currentLine=7667723;
 //BA.debugLineNum = 7667723;BA.debugLine="m.Put(\"awm\", calcs_1.awm)";
_m.Put((Object)("awm"),(Object)(_calcs_1._awm));
RDebugUtils.currentLine=7667724;
 //BA.debugLineNum = 7667724;BA.debugLine="m.Put(\"twa\", calcs_1.twa)";
_m.Put((Object)("twa"),(Object)(_calcs_1._twa));
RDebugUtils.currentLine=7667725;
 //BA.debugLineNum = 7667725;BA.debugLine="m.Put(\"twm\", calcs_1.twm)";
_m.Put((Object)("twm"),(Object)(_calcs_1._twm));
RDebugUtils.currentLine=7667726;
 //BA.debugLineNum = 7667726;BA.debugLine="m.Put(\"bearing\", calcs_1.bearing)";
_m.Put((Object)("bearing"),(Object)(_calcs_1._bearing));
RDebugUtils.currentLine=7667727;
 //BA.debugLineNum = 7667727;BA.debugLine="m.Put(\"speed\", calcs_1.speed)";
_m.Put((Object)("speed"),(Object)(_calcs_1._speed));
RDebugUtils.currentLine=7667729;
 //BA.debugLineNum = 7667729;BA.debugLine="m.Put(\"battery\", calcs_1.battery )";
_m.Put((Object)("battery"),(Object)(_calcs_1._battery));
RDebugUtils.currentLine=7667730;
 //BA.debugLineNum = 7667730;BA.debugLine="m.Put(\"temp\", calcs_1.temp )";
_m.Put((Object)("temp"),(Object)(_calcs_1._temp));
RDebugUtils.currentLine=7667731;
 //BA.debugLineNum = 7667731;BA.debugLine="m.Put(\"roll\", calcs_1.roll )";
_m.Put((Object)("roll"),(Object)(_calcs_1._roll));
RDebugUtils.currentLine=7667732;
 //BA.debugLineNum = 7667732;BA.debugLine="m.Put(\"pitch\", calcs_1.pitch )";
_m.Put((Object)("pitch"),(Object)(_calcs_1._pitch));
RDebugUtils.currentLine=7667733;
 //BA.debugLineNum = 7667733;BA.debugLine="m.Put(\"ecompass\", calcs_1.ecompass )";
_m.Put((Object)("ecompass"),(Object)(_calcs_1._ecompass));
RDebugUtils.currentLine=7667734;
 //BA.debugLineNum = 7667734;BA.debugLine="l.Add( m )";
_l.Add((Object)(_m.getObject()));
RDebugUtils.currentLine=7667735;
 //BA.debugLineNum = 7667735;BA.debugLine="DBUtils.InsertMaps( sql1, \"route5\", l )";
mostCurrent._dbutils._insertmaps(processBA,_sql1,"route5",_l);
RDebugUtils.currentLine=7667737;
 //BA.debugLineNum = 7667737;BA.debugLine="End Sub";
return "";
}
public static String  _tscan_tick() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "tscan_tick"))
	 {return ((String) Debug.delegate(processBA, "tscan_tick", null));}
RDebugUtils.currentLine=7077888;
 //BA.debugLineNum = 7077888;BA.debugLine="Sub tScan_Tick";
RDebugUtils.currentLine=7077890;
 //BA.debugLineNum = 7077890;BA.debugLine="tScan.Enabled = False";
_tscan.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=7077891;
 //BA.debugLineNum = 7077891;BA.debugLine="ble_DiscoveryFinished";
_ble_discoveryfinished();
RDebugUtils.currentLine=7077892;
 //BA.debugLineNum = 7077892;BA.debugLine="End Sub";
return "";
}
public static String  _xmlrpc_init() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "xmlrpc_init"))
	 {return ((String) Debug.delegate(processBA, "xmlrpc_init", null));}
Object[] _args = null;
String[] _types = null;
Object[] _args2 = null;
String[] _types2 = null;
RDebugUtils.currentLine=7864320;
 //BA.debugLineNum = 7864320;BA.debugLine="Sub xmlrpc_init";
RDebugUtils.currentLine=7864323;
 //BA.debugLineNum = 7864323;BA.debugLine="Dim args(1) As Object";
_args = new Object[(int) (1)];
{
int d0 = _args.length;
for (int i0 = 0;i0 < d0;i0++) {
_args[i0] = new Object();
}
}
;
RDebugUtils.currentLine=7864324;
 //BA.debugLineNum = 7864324;BA.debugLine="Dim types(1) As String";
_types = new String[(int) (1)];
java.util.Arrays.fill(_types,"");
RDebugUtils.currentLine=7864325;
 //BA.debugLineNum = 7864325;BA.debugLine="args(0) = \"http://192.168.0.218:8069/xmlrpc/commo";
_args[(int) (0)] = (Object)("http://192.168.0.218:8069/xmlrpc/common");
RDebugUtils.currentLine=7864326;
 //BA.debugLineNum = 7864326;BA.debugLine="types(0) = \"java.lang.String\"";
_types[(int) (0)] = "java.lang.String";
RDebugUtils.currentLine=7864327;
 //BA.debugLineNum = 7864327;BA.debugLine="Obj1.Target = Obj1.CreateObject2( \"org.xmlrpc.and";
_obj1.Target = _obj1.CreateObject2("org.xmlrpc.android.XMLRPCClient",_args,_types);
RDebugUtils.currentLine=7864328;
 //BA.debugLineNum = 7864328;BA.debugLine="Dim args2(4) As Object";
_args2 = new Object[(int) (4)];
{
int d0 = _args2.length;
for (int i0 = 0;i0 < d0;i0++) {
_args2[i0] = new Object();
}
}
;
RDebugUtils.currentLine=7864329;
 //BA.debugLineNum = 7864329;BA.debugLine="Dim types2(4) As String";
_types2 = new String[(int) (4)];
java.util.Arrays.fill(_types2,"");
RDebugUtils.currentLine=7864330;
 //BA.debugLineNum = 7864330;BA.debugLine="args2(0) = \"login\"";
_args2[(int) (0)] = (Object)("login");
RDebugUtils.currentLine=7864331;
 //BA.debugLineNum = 7864331;BA.debugLine="args2(1) = \"Pieralisi\"";
_args2[(int) (1)] = (Object)("Pieralisi");
RDebugUtils.currentLine=7864332;
 //BA.debugLineNum = 7864332;BA.debugLine="args2(2) = \"admin\"";
_args2[(int) (2)] = (Object)("admin");
RDebugUtils.currentLine=7864333;
 //BA.debugLineNum = 7864333;BA.debugLine="args2(3) = \"pieralisi_2013\"";
_args2[(int) (3)] = (Object)("pieralisi_2013");
RDebugUtils.currentLine=7864334;
 //BA.debugLineNum = 7864334;BA.debugLine="types2(0) = \"java.lang.String\"";
_types2[(int) (0)] = "java.lang.String";
RDebugUtils.currentLine=7864335;
 //BA.debugLineNum = 7864335;BA.debugLine="types2(1) = \"java.lang.Object\"";
_types2[(int) (1)] = "java.lang.Object";
RDebugUtils.currentLine=7864336;
 //BA.debugLineNum = 7864336;BA.debugLine="types2(2) = \"java.lang.Object\"";
_types2[(int) (2)] = "java.lang.Object";
RDebugUtils.currentLine=7864337;
 //BA.debugLineNum = 7864337;BA.debugLine="types2(3) = \"java.lang.Object\"";
_types2[(int) (3)] = "java.lang.Object";
RDebugUtils.currentLine=7864338;
 //BA.debugLineNum = 7864338;BA.debugLine="Obj1.Target = Obj1.RunMethod4( \"call\", args2, typ";
_obj1.Target = _obj1.RunMethod4("call",_args2,_types2);
RDebugUtils.currentLine=7864339;
 //BA.debugLineNum = 7864339;BA.debugLine="Log( \"RETURN OF login ---------------------------";
anywheresoftware.b4a.keywords.Common.Log("RETURN OF login --------------------------------------------------------------------------------------");
RDebugUtils.currentLine=7864340;
 //BA.debugLineNum = 7864340;BA.debugLine="Log( Obj1.Target)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_obj1.Target));
RDebugUtils.currentLine=7864343;
 //BA.debugLineNum = 7864343;BA.debugLine="End Sub";
return "";
}
public static String  _xmlrpc_send_register() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "xmlrpc_send_register"))
	 {return ((String) Debug.delegate(processBA, "xmlrpc_send_register", null));}
Object[] _args = null;
String[] _types = null;
Object[] _args3 = null;
String[] _types3 = null;
RDebugUtils.currentLine=7929856;
 //BA.debugLineNum = 7929856;BA.debugLine="Sub xmlrpc_send_register";
RDebugUtils.currentLine=7929857;
 //BA.debugLineNum = 7929857;BA.debugLine="Dim args(1) As Object";
_args = new Object[(int) (1)];
{
int d0 = _args.length;
for (int i0 = 0;i0 < d0;i0++) {
_args[i0] = new Object();
}
}
;
RDebugUtils.currentLine=7929858;
 //BA.debugLineNum = 7929858;BA.debugLine="Dim types(1) As String";
_types = new String[(int) (1)];
java.util.Arrays.fill(_types,"");
RDebugUtils.currentLine=7929859;
 //BA.debugLineNum = 7929859;BA.debugLine="args(0) = \"http://192.168.0.218:8069/xmlrpc/objec";
_args[(int) (0)] = (Object)("http://192.168.0.218:8069/xmlrpc/object");
RDebugUtils.currentLine=7929860;
 //BA.debugLineNum = 7929860;BA.debugLine="Obj1.Target = Obj1.CreateObject2( \"org.xmlrpc.and";
_obj1.Target = _obj1.CreateObject2("org.xmlrpc.android.XMLRPCClient",_args,_types);
RDebugUtils.currentLine=7929861;
 //BA.debugLineNum = 7929861;BA.debugLine="dt_historic.Initialize";
_dt_historic.Initialize();
RDebugUtils.currentLine=7929862;
 //BA.debugLineNum = 7929862;BA.debugLine="dt_historic.Put( \"tag_id\", 1 )";
_dt_historic.Put((Object)("tag_id"),(Object)(1));
RDebugUtils.currentLine=7929863;
 //BA.debugLineNum = 7929863;BA.debugLine="dt_historic.Put( \"dated\", \"2013-12-25 00:00:00\" )";
_dt_historic.Put((Object)("dated"),(Object)("2013-12-25 00:00:00"));
RDebugUtils.currentLine=7929864;
 //BA.debugLineNum = 7929864;BA.debugLine="dt_historic.Put( \"value\", 25.0 )";
_dt_historic.Put((Object)("value"),(Object)(25.0));
RDebugUtils.currentLine=7929865;
 //BA.debugLineNum = 7929865;BA.debugLine="Dim args3( 7 ) As Object";
_args3 = new Object[(int) (7)];
{
int d0 = _args3.length;
for (int i0 = 0;i0 < d0;i0++) {
_args3[i0] = new Object();
}
}
;
RDebugUtils.currentLine=7929866;
 //BA.debugLineNum = 7929866;BA.debugLine="Dim types3( 7 ) As String";
_types3 = new String[(int) (7)];
java.util.Arrays.fill(_types3,"");
RDebugUtils.currentLine=7929867;
 //BA.debugLineNum = 7929867;BA.debugLine="args3(0) = \"execute\"";
_args3[(int) (0)] = (Object)("execute");
RDebugUtils.currentLine=7929868;
 //BA.debugLineNum = 7929868;BA.debugLine="args3(1) = \"Pieralisi\"";
_args3[(int) (1)] = (Object)("Pieralisi");
RDebugUtils.currentLine=7929869;
 //BA.debugLineNum = 7929869;BA.debugLine="args3(2) = 1";
_args3[(int) (2)] = (Object)(1);
RDebugUtils.currentLine=7929870;
 //BA.debugLineNum = 7929870;BA.debugLine="args3(3) = \"pieralisi_2013\"";
_args3[(int) (3)] = (Object)("pieralisi_2013");
RDebugUtils.currentLine=7929871;
 //BA.debugLineNum = 7929871;BA.debugLine="args3(4) = \"tag.historic\"";
_args3[(int) (4)] = (Object)("tag.historic");
RDebugUtils.currentLine=7929872;
 //BA.debugLineNum = 7929872;BA.debugLine="args3(5) = \"create\"";
_args3[(int) (5)] = (Object)("create");
RDebugUtils.currentLine=7929873;
 //BA.debugLineNum = 7929873;BA.debugLine="args3(6) = dt_historic";
_args3[(int) (6)] = (Object)(_dt_historic.getObject());
RDebugUtils.currentLine=7929874;
 //BA.debugLineNum = 7929874;BA.debugLine="types3(0) = \"java.lang.String\"";
_types3[(int) (0)] = "java.lang.String";
RDebugUtils.currentLine=7929875;
 //BA.debugLineNum = 7929875;BA.debugLine="types3(1) = \"java.lang.Object\"";
_types3[(int) (1)] = "java.lang.Object";
RDebugUtils.currentLine=7929876;
 //BA.debugLineNum = 7929876;BA.debugLine="types3(2) = \"java.lang.Object\"";
_types3[(int) (2)] = "java.lang.Object";
RDebugUtils.currentLine=7929877;
 //BA.debugLineNum = 7929877;BA.debugLine="types3(3) = \"java.lang.Object\"";
_types3[(int) (3)] = "java.lang.Object";
RDebugUtils.currentLine=7929878;
 //BA.debugLineNum = 7929878;BA.debugLine="types3(4) = \"java.lang.Object\"";
_types3[(int) (4)] = "java.lang.Object";
RDebugUtils.currentLine=7929879;
 //BA.debugLineNum = 7929879;BA.debugLine="types3(5) = \"java.lang.Object\"";
_types3[(int) (5)] = "java.lang.Object";
RDebugUtils.currentLine=7929880;
 //BA.debugLineNum = 7929880;BA.debugLine="types3(6) = \"java.lang.Object\"";
_types3[(int) (6)] = "java.lang.Object";
RDebugUtils.currentLine=7929881;
 //BA.debugLineNum = 7929881;BA.debugLine="Obj1.Target = Obj1.RunMethod4( \"call\", args3, typ";
_obj1.Target = _obj1.RunMethod4("call",_args3,_types3);
RDebugUtils.currentLine=7929884;
 //BA.debugLineNum = 7929884;BA.debugLine="Return";
if (true) return "";
RDebugUtils.currentLine=7929886;
 //BA.debugLineNum = 7929886;BA.debugLine="args(0) = \"http://192.168.0.218:8069/xmlrpc/objec";
_args[(int) (0)] = (Object)("http://192.168.0.218:8069/xmlrpc/object");
RDebugUtils.currentLine=7929887;
 //BA.debugLineNum = 7929887;BA.debugLine="Obj1.Target = Obj1.CreateObject2( \"org.xmlrpc.and";
_obj1.Target = _obj1.CreateObject2("org.xmlrpc.android.XMLRPCClient",_args,_types);
RDebugUtils.currentLine=7929888;
 //BA.debugLineNum = 7929888;BA.debugLine="dt_historic.Initialize";
_dt_historic.Initialize();
RDebugUtils.currentLine=7929892;
 //BA.debugLineNum = 7929892;BA.debugLine="Dim args3( 7 ) As Object";
_args3 = new Object[(int) (7)];
{
int d0 = _args3.length;
for (int i0 = 0;i0 < d0;i0++) {
_args3[i0] = new Object();
}
}
;
RDebugUtils.currentLine=7929893;
 //BA.debugLineNum = 7929893;BA.debugLine="Dim types3( 7 ) As String";
_types3 = new String[(int) (7)];
java.util.Arrays.fill(_types3,"");
RDebugUtils.currentLine=7929894;
 //BA.debugLineNum = 7929894;BA.debugLine="args3(0) = \"execute\"";
_args3[(int) (0)] = (Object)("execute");
RDebugUtils.currentLine=7929895;
 //BA.debugLineNum = 7929895;BA.debugLine="args3(1) = \"Pieralisi\"";
_args3[(int) (1)] = (Object)("Pieralisi");
RDebugUtils.currentLine=7929896;
 //BA.debugLineNum = 7929896;BA.debugLine="args3(2) = 1";
_args3[(int) (2)] = (Object)(1);
RDebugUtils.currentLine=7929897;
 //BA.debugLineNum = 7929897;BA.debugLine="args3(3) = \"pieralisi_2013\"";
_args3[(int) (3)] = (Object)("pieralisi_2013");
RDebugUtils.currentLine=7929898;
 //BA.debugLineNum = 7929898;BA.debugLine="args3(4) = \"tag.historic\"";
_args3[(int) (4)] = (Object)("tag.historic");
RDebugUtils.currentLine=7929899;
 //BA.debugLineNum = 7929899;BA.debugLine="args3(5) = \"create\"";
_args3[(int) (5)] = (Object)("create");
RDebugUtils.currentLine=7929900;
 //BA.debugLineNum = 7929900;BA.debugLine="args3(6) = dt_historic";
_args3[(int) (6)] = (Object)(_dt_historic.getObject());
RDebugUtils.currentLine=7929901;
 //BA.debugLineNum = 7929901;BA.debugLine="types3(0) = \"java.lang.String\"";
_types3[(int) (0)] = "java.lang.String";
RDebugUtils.currentLine=7929902;
 //BA.debugLineNum = 7929902;BA.debugLine="types3(1) = \"java.lang.Object\"";
_types3[(int) (1)] = "java.lang.Object";
RDebugUtils.currentLine=7929903;
 //BA.debugLineNum = 7929903;BA.debugLine="types3(2) = \"java.lang.Object\"";
_types3[(int) (2)] = "java.lang.Object";
RDebugUtils.currentLine=7929904;
 //BA.debugLineNum = 7929904;BA.debugLine="types3(3) = \"java.lang.Object\"";
_types3[(int) (3)] = "java.lang.Object";
RDebugUtils.currentLine=7929905;
 //BA.debugLineNum = 7929905;BA.debugLine="types3(4) = \"java.lang.Object\"";
_types3[(int) (4)] = "java.lang.Object";
RDebugUtils.currentLine=7929906;
 //BA.debugLineNum = 7929906;BA.debugLine="types3(5) = \"java.lang.Object\"";
_types3[(int) (5)] = "java.lang.Object";
RDebugUtils.currentLine=7929907;
 //BA.debugLineNum = 7929907;BA.debugLine="types3(6) = \"java.lang.Object\"";
_types3[(int) (6)] = "java.lang.Object";
RDebugUtils.currentLine=7929908;
 //BA.debugLineNum = 7929908;BA.debugLine="Obj1.Target = Obj1.RunMethod4( \"call\", args3, typ";
_obj1.Target = _obj1.RunMethod4("call",_args3,_types3);
RDebugUtils.currentLine=7929910;
 //BA.debugLineNum = 7929910;BA.debugLine="End Sub";
return "";
}
}