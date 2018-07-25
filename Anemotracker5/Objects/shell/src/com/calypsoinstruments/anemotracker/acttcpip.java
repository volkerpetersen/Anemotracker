
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

public class acttcpip implements IRemote{
	public static acttcpip mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public acttcpip() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("acttcpip"), "com.calypsoinstruments.anemotracker.acttcpip");
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
		pcBA = new PCBA(this, acttcpip.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _socket1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.SocketWrapper");
public static RemoteObject _serversocket1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper");
public static RemoteObject _astreams = RemoteObject.declareNull("anywheresoftware.b4a.randomaccessfile.AsyncStreams");
public static RemoteObject _outputstream1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
public static RemoteObject _conv = RemoteObject.declareNull("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");
public static RemoteObject _timer1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _myip = RemoteObject.createImmutable("");
public static RemoteObject _serverip = RemoteObject.createImmutable("");
public static RemoteObject _istr = RemoteObject.createImmutable("");
public static RemoteObject _lblconnect = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _btnconnect = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _lvlog = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
public static RemoteObject _lblmsg = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _bmp_background = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
public static RemoteObject _mls = RemoteObject.declareNull("wifi.MLwifi.MLWifiScanner");
public static RemoteObject _sp_wifi = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _txt_pass = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _ap_index = RemoteObject.createImmutable(0);
public static RemoteObject _jsonrcv = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
public static RemoteObject _isconfigu = RemoteObject.createImmutable(false);
public static com.calypsoinstruments.anemotracker.main _main = null;
public static com.calypsoinstruments.anemotracker.actble _actble = null;
public static com.calypsoinstruments.anemotracker.actlisttracks _actlisttracks = null;
public static com.calypsoinstruments.anemotracker.actnavigation _actnavigation = null;
public static com.calypsoinstruments.anemotracker.starter _starter = null;
public static com.calypsoinstruments.anemotracker.dbutils _dbutils = null;
public static com.calypsoinstruments.anemotracker.actcalcomp _actcalcomp = null;
public static com.calypsoinstruments.anemotracker.actdevinfo _actdevinfo = null;
  public Object[] GetGlobals() {
		return new Object[] {"actBLE",Debug.moduleToString(com.calypsoinstruments.anemotracker.actble.class),"actCalComp",Debug.moduleToString(com.calypsoinstruments.anemotracker.actcalcomp.class),"actDevInfo",Debug.moduleToString(com.calypsoinstruments.anemotracker.actdevinfo.class),"Activity",acttcpip.mostCurrent._activity,"actListTracks",Debug.moduleToString(com.calypsoinstruments.anemotracker.actlisttracks.class),"actNavigation",Debug.moduleToString(com.calypsoinstruments.anemotracker.actnavigation.class),"ap_index",acttcpip._ap_index,"AStreams",acttcpip._astreams,"bmp_background",acttcpip.mostCurrent._bmp_background,"btnConnect",acttcpip.mostCurrent._btnconnect,"Conv",acttcpip._conv,"DBUtils",Debug.moduleToString(com.calypsoinstruments.anemotracker.dbutils.class),"isConfigU",acttcpip._isconfigu,"iStr",acttcpip._istr,"JSONrcv",acttcpip.mostCurrent._jsonrcv,"lblConnect",acttcpip.mostCurrent._lblconnect,"lblMsg",acttcpip.mostCurrent._lblmsg,"lvLog",acttcpip.mostCurrent._lvlog,"Main",Debug.moduleToString(com.calypsoinstruments.anemotracker.main.class),"mls",acttcpip.mostCurrent._mls,"MyIP",acttcpip._myip,"OutputStream1",acttcpip._outputstream1,"ServerIp",acttcpip._serverip,"ServerSocket1",acttcpip._serversocket1,"Socket1",acttcpip._socket1,"sp_wifi",acttcpip.mostCurrent._sp_wifi,"Starter",Debug.moduleToString(com.calypsoinstruments.anemotracker.starter.class),"Timer1",acttcpip._timer1,"txt_pass",acttcpip.mostCurrent._txt_pass};
}
}