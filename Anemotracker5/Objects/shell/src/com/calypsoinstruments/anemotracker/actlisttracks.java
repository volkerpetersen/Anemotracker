
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

public class actlisttracks implements IRemote{
	public static actlisttracks mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public actlisttracks() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("actlisttracks"), "com.calypsoinstruments.anemotracker.actlisttracks");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, actlisttracks.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _clv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
public static RemoteObject _fab1 = RemoteObject.declareNull("de.amberhome.objects.FloatingActionButtonWrapper");
public static RemoteObject _toolbar = RemoteObject.declareNull("de.amberhome.objects.appcompat.ACToolbarLightWrapper");
public static com.calypsoinstruments.anemotracker.main _main = null;
public static com.calypsoinstruments.anemotracker.actble _actble = null;
public static com.calypsoinstruments.anemotracker.actnavigation _actnavigation = null;
public static com.calypsoinstruments.anemotracker.acttcpip _acttcpip = null;
public static com.calypsoinstruments.anemotracker.starter _starter = null;
public static com.calypsoinstruments.anemotracker.dbutils _dbutils = null;
public static com.calypsoinstruments.anemotracker.actcalcomp _actcalcomp = null;
public static com.calypsoinstruments.anemotracker.actdevinfo _actdevinfo = null;
  public Object[] GetGlobals() {
		return new Object[] {"actBLE",Debug.moduleToString(com.calypsoinstruments.anemotracker.actble.class),"actCalComp",Debug.moduleToString(com.calypsoinstruments.anemotracker.actcalcomp.class),"actDevInfo",Debug.moduleToString(com.calypsoinstruments.anemotracker.actdevinfo.class),"Activity",actlisttracks.mostCurrent._activity,"actNavigation",Debug.moduleToString(com.calypsoinstruments.anemotracker.actnavigation.class),"actTCPip",Debug.moduleToString(com.calypsoinstruments.anemotracker.acttcpip.class),"clv",actlisttracks.mostCurrent._clv,"DBUtils",Debug.moduleToString(com.calypsoinstruments.anemotracker.dbutils.class),"fab1",actlisttracks.mostCurrent._fab1,"Main",Debug.moduleToString(com.calypsoinstruments.anemotracker.main.class),"Starter",Debug.moduleToString(com.calypsoinstruments.anemotracker.starter.class),"toolbar",actlisttracks.mostCurrent._toolbar};
}
}