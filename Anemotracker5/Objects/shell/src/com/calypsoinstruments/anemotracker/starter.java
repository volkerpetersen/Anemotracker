
package com.calypsoinstruments.anemotracker;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class starter implements IRemote{
	public static starter mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public starter() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("starter"), "com.calypsoinstruments.anemotracker.starter");
	}
     public static RemoteObject getObject() {
		return myClass;
	 }
	public RemoteObject _service;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
        _service = (RemoteObject) args[2];
        remoteMe = RemoteObject.declareNull("com.calypsoinstruments.anemotracker.starter");
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[3];
		pcBA = new PCBA(this, starter.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _orientation = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.PhoneSensors");
public static RemoteObject _forientation = RemoteObject.createImmutable(0f);
public static RemoteObject _gps1 = RemoteObject.declareNull("anywheresoftware.b4a.gps.GPS");
public static RemoteObject _gps_changed = RemoteObject.createImmutable(false);
public static RemoteObject _gps_location = RemoteObject.declareNull("anywheresoftware.b4a.gps.LocationWrapper");
public static RemoteObject _scan = RemoteObject.declareNull("anywheresoftware.b4a.objects.BleManager2");
public static RemoteObject _tscan = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _timer_ble = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _trefresh = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _chprincipal = RemoteObject.createImmutable("");
public static RemoteObject _actual_ultra = RemoteObject.declareNull("com.calypsoinstruments.anemotracker.starter._tultra");
public static RemoteObject _connected = RemoteObject.createImmutable(false);
public static RemoteObject _bselectble = RemoteObject.createImmutable(false);
public static RemoteObject _bsetnotify = RemoteObject.createImmutable(false);
public static RemoteObject _bhz = RemoteObject.createImmutable(false);
public static RemoteObject _devices = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _last_ultra = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _sultra = RemoteObject.createImmutable("");
public static RemoteObject _cnormal = RemoteObject.createImmutable("");
public static RemoteObject _crate = RemoteObject.createImmutable("");
public static RemoteObject _csensors = RemoteObject.createImmutable("");
public static RemoteObject _cstatus = RemoteObject.createImmutable("");
public static RemoteObject _cnmea = RemoteObject.createImmutable("");
public static RemoteObject _ccalcomp = RemoteObject.createImmutable("");
public static RemoteObject _mid = RemoteObject.createImmutable("");
public static RemoteObject _uid = RemoteObject.createImmutable("");
public static RemoteObject _devicetype = RemoteObject.createImmutable(0);
public static RemoteObject _deviceinfo = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _calcs_1 = RemoteObject.declareNull("com.calypsoinstruments.anemotracker.windcalcs");
public static RemoteObject _obj1 = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
public static RemoteObject _dt_historic = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _sync_cloud = RemoteObject.createImmutable(false);
public static RemoteObject _sql1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
public static RemoteObject _timer_sqlite = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _navigation = RemoteObject.createImmutable(0);
public static RemoteObject _nav_name = RemoteObject.createImmutable("");
public static RemoteObject _b_nav = RemoteObject.createImmutable(false);
public static RemoteObject _b_true = RemoteObject.createImmutable(false);
public static RemoteObject _b_net = RemoteObject.createImmutable(false);
public static RemoteObject _manual_disconnect = RemoteObject.createImmutable(false);
public static RemoteObject _n = RemoteObject.declareNull("anywheresoftware.b4a.objects.NotificationWrapper");
public static RemoteObject _tang = RemoteObject.createImmutable(0f);
public static RemoteObject _tvel = RemoteObject.createImmutable(0f);
public static RemoteObject _c_ble = RemoteObject.createImmutable(0);
public static RemoteObject _bleenabled = RemoteObject.createImmutable(false);
public static RemoteObject _gps1enabled = RemoteObject.createImmutable(false);
public static RemoteObject _trytimes = RemoteObject.createImmutable(0);
public static RemoteObject _logs = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
public static RemoteObject _logcat = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.LogCat");
public static RemoteObject _allowreport = RemoteObject.createImmutable(false);
public static RemoteObject _temporizador = RemoteObject.createImmutable(0L);
public static com.calypsoinstruments.anemotracker.main _main = null;
public static com.calypsoinstruments.anemotracker.actble _actble = null;
public static com.calypsoinstruments.anemotracker.actlisttracks _actlisttracks = null;
public static com.calypsoinstruments.anemotracker.actnavigation _actnavigation = null;
public static com.calypsoinstruments.anemotracker.acttcpip _acttcpip = null;
public static com.calypsoinstruments.anemotracker.dbutils _dbutils = null;
public static com.calypsoinstruments.anemotracker.actcalcomp _actcalcomp = null;
public static com.calypsoinstruments.anemotracker.actdevinfo _actdevinfo = null;
  public Object[] GetGlobals() {
		return new Object[] {"actBLE",Debug.moduleToString(com.calypsoinstruments.anemotracker.actble.class),"actCalComp",Debug.moduleToString(com.calypsoinstruments.anemotracker.actcalcomp.class),"actDevInfo",Debug.moduleToString(com.calypsoinstruments.anemotracker.actdevinfo.class),"actListTracks",Debug.moduleToString(com.calypsoinstruments.anemotracker.actlisttracks.class),"actNavigation",Debug.moduleToString(com.calypsoinstruments.anemotracker.actnavigation.class),"actTCPip",Debug.moduleToString(com.calypsoinstruments.anemotracker.acttcpip.class),"actual_ultra",starter._actual_ultra,"allowReport",starter._allowreport,"b_nav",starter._b_nav,"b_net",starter._b_net,"b_true",starter._b_true,"bHz",starter._bhz,"bleEnabled",starter._bleenabled,"bSelectBLE",starter._bselectble,"bSetNotify",starter._bsetnotify,"c_ble",starter._c_ble,"calcs_1",starter._calcs_1,"cCalComp",starter._ccalcomp,"chPrincipal",starter._chprincipal,"cNmea",starter._cnmea,"cNormal",starter._cnormal,"connected",starter._connected,"cRate",starter._crate,"cSensors",starter._csensors,"cStatus",starter._cstatus,"DBUtils",Debug.moduleToString(com.calypsoinstruments.anemotracker.dbutils.class),"deviceInfo",starter._deviceinfo,"devices",starter._devices,"deviceType",starter._devicetype,"dt_historic",starter._dt_historic,"fOrientation",starter._forientation,"gps_changed",starter._gps_changed,"gps_location",starter._gps_location,"gps1",starter._gps1,"gps1Enabled",starter._gps1enabled,"last_Ultra",starter._last_ultra,"logcat",starter._logcat,"logs",starter._logs,"Main",Debug.moduleToString(com.calypsoinstruments.anemotracker.main.class),"manual_disconnect",starter._manual_disconnect,"mId",starter._mid,"n",starter._n,"nav_name",starter._nav_name,"navigation",starter._navigation,"Obj1",starter._obj1,"orientation",starter._orientation,"Scan",starter._scan,"Service",starter.mostCurrent._service,"sql1",starter._sql1,"sUltra",starter._sultra,"sync_cloud",starter._sync_cloud,"tang",starter._tang,"temporizador",starter._temporizador,"Timer_ble",starter._timer_ble,"Timer_sqlite",starter._timer_sqlite,"tRefresh",starter._trefresh,"tryTimes",starter._trytimes,"tScan",starter._tscan,"tvel",starter._tvel,"uId",starter._uid};
}
}