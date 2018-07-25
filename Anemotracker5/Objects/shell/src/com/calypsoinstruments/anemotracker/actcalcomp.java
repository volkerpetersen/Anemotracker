
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

public class actcalcomp implements IRemote{
	public static actcalcomp mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public actcalcomp() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("actcalcomp"), "com.calypsoinstruments.anemotracker.actcalcomp");
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
		pcBA = new PCBA(this, actcalcomp.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _vueltas = RemoteObject.createImmutable(0);
public static RemoteObject _isnew = RemoteObject.createImmutable(false);
public static RemoteObject _secs = RemoteObject.createImmutable(0);
public static RemoteObject _img_tutorial = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _lbl_messages = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_vueltas = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _test_lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _add_btn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btn_abr = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _toolbar = RemoteObject.declareNull("de.amberhome.objects.appcompat.ACToolbarLightWrapper");
public static RemoteObject _bmp_background = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
public static RemoteObject _tuto = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
public static com.calypsoinstruments.anemotracker.main _main = null;
public static com.calypsoinstruments.anemotracker.actble _actble = null;
public static com.calypsoinstruments.anemotracker.actlisttracks _actlisttracks = null;
public static com.calypsoinstruments.anemotracker.actnavigation _actnavigation = null;
public static com.calypsoinstruments.anemotracker.acttcpip _acttcpip = null;
public static com.calypsoinstruments.anemotracker.starter _starter = null;
public static com.calypsoinstruments.anemotracker.dbutils _dbutils = null;
public static com.calypsoinstruments.anemotracker.actdevinfo _actdevinfo = null;
  public Object[] GetGlobals() {
		return new Object[] {"actBLE",Debug.moduleToString(com.calypsoinstruments.anemotracker.actble.class),"actDevInfo",Debug.moduleToString(com.calypsoinstruments.anemotracker.actdevinfo.class),"Activity",actcalcomp.mostCurrent._activity,"actListTracks",Debug.moduleToString(com.calypsoinstruments.anemotracker.actlisttracks.class),"actNavigation",Debug.moduleToString(com.calypsoinstruments.anemotracker.actnavigation.class),"actTCPip",Debug.moduleToString(com.calypsoinstruments.anemotracker.acttcpip.class),"add_btn",actcalcomp.mostCurrent._add_btn,"bmp_background",actcalcomp.mostCurrent._bmp_background,"btn_abr",actcalcomp.mostCurrent._btn_abr,"DBUtils",Debug.moduleToString(com.calypsoinstruments.anemotracker.dbutils.class),"img_tutorial",actcalcomp.mostCurrent._img_tutorial,"isNew",actcalcomp._isnew,"lbl_messages",actcalcomp.mostCurrent._lbl_messages,"lbl_vueltas",actcalcomp.mostCurrent._lbl_vueltas,"Main",Debug.moduleToString(com.calypsoinstruments.anemotracker.main.class),"secs",actcalcomp._secs,"Starter",Debug.moduleToString(com.calypsoinstruments.anemotracker.starter.class),"test_lbl",actcalcomp.mostCurrent._test_lbl,"toolbar",actcalcomp.mostCurrent._toolbar,"tuto",actcalcomp.mostCurrent._tuto,"vueltas",actcalcomp._vueltas};
}
}