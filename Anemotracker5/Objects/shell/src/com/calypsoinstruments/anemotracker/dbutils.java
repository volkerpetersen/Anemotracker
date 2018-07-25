
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

public class dbutils implements IRemote{
	public static dbutils mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public dbutils() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
     private static PCBA pcBA = new PCBA(null, dbutils.class);
    static {
		mostCurrent = new dbutils();
        remoteMe = RemoteObject.declareNull("com.calypsoinstruments.anemotracker.dbutils");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("dbutils"), "com.calypsoinstruments.anemotracker.dbutils");
        RDebug.INSTANCE.eventTargets.put(new DeviceClass("com.calypsoinstruments.anemotracker.dbutils"), new java.lang.ref.WeakReference<PCBA> (pcBA));
	}
   
	public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
	public PCBA create(Object[] args) throws ClassNotFoundException{
        throw new RuntimeException("CREATE is not supported.");
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _db_real = RemoteObject.createImmutable("");
public static RemoteObject _db_integer = RemoteObject.createImmutable("");
public static RemoteObject _db_blob = RemoteObject.createImmutable("");
public static RemoteObject _db_text = RemoteObject.createImmutable("");
public static RemoteObject _htmlcss = RemoteObject.createImmutable("");
public static com.calypsoinstruments.anemotracker.main _main = null;
public static com.calypsoinstruments.anemotracker.actble _actble = null;
public static com.calypsoinstruments.anemotracker.actlisttracks _actlisttracks = null;
public static com.calypsoinstruments.anemotracker.actnavigation _actnavigation = null;
public static com.calypsoinstruments.anemotracker.acttcpip _acttcpip = null;
public static com.calypsoinstruments.anemotracker.starter _starter = null;
public static com.calypsoinstruments.anemotracker.actcalcomp _actcalcomp = null;
public static com.calypsoinstruments.anemotracker.actdevinfo _actdevinfo = null;
  public Object[] GetGlobals() {
		return new Object[] {"actBLE",Debug.moduleToString(com.calypsoinstruments.anemotracker.actble.class),"actCalComp",Debug.moduleToString(com.calypsoinstruments.anemotracker.actcalcomp.class),"actDevInfo",Debug.moduleToString(com.calypsoinstruments.anemotracker.actdevinfo.class),"actListTracks",Debug.moduleToString(com.calypsoinstruments.anemotracker.actlisttracks.class),"actNavigation",Debug.moduleToString(com.calypsoinstruments.anemotracker.actnavigation.class),"actTCPip",Debug.moduleToString(com.calypsoinstruments.anemotracker.acttcpip.class),"DB_BLOB",dbutils._db_blob,"DB_INTEGER",dbutils._db_integer,"DB_REAL",dbutils._db_real,"DB_TEXT",dbutils._db_text,"HtmlCSS",dbutils._htmlcss,"Main",Debug.moduleToString(com.calypsoinstruments.anemotracker.main.class),"Starter",Debug.moduleToString(com.calypsoinstruments.anemotracker.starter.class)};
}
}