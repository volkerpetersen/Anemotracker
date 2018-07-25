
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

public class main implements IRemote{
	public static main mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public main() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("main"), "com.calypsoinstruments.anemotracker.main");
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
		pcBA = new PCBA(this, main.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _kvs = RemoteObject.declareNull("com.calypsoinstruments.anemotracker.keyvaluestore");
public static RemoteObject _portrait = RemoteObject.createImmutable(false);
public static RemoteObject _rp = RemoteObject.declareNull("anywheresoftware.b4a.objects.RuntimePermissions");
public static RemoteObject _gpsenabled = RemoteObject.createImmutable(false);
public static RemoteObject _bpaused = RemoteObject.createImmutable(false);
public static RemoteObject _bmp_calypso = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
public static RemoteObject _bmp_cups = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
public static RemoteObject _bmp_ultra = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
public static RemoteObject _bmp_nmea = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
public static RemoteObject _bmp_bt = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
public static RemoteObject _nativeme = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
public static RemoteObject _offset_angle = RemoteObject.createImmutable(0);
public static RemoteObject _dec = RemoteObject.createImmutable(0);
public static RemoteObject _inttobool = null;
public static RemoteObject _firststart = RemoteObject.createImmutable(false);
public static RemoteObject _xml = RemoteObject.declareNull("anywheresoftware.b4a.object.XmlLayoutBuilder");
public static RemoteObject _dsb = RemoteObject.declareNull("de.amberhome.objects.BottomNavigationViewWrapper");
public static RemoteObject _navdrawer = RemoteObject.declareNull("de.amberhome.objects.NavigationDrawerWrapper");
public static RemoteObject _pnl_header = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _imv_calypso = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imv_equipment = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _panel_secondary = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _sw_mean = RemoteObject.declareNull("de.amberhome.objects.appcompat.ACSwitchCompatWrapper");
public static RemoteObject _sw_track = RemoteObject.declareNull("de.amberhome.objects.appcompat.ACSwitchCompatWrapper");
public static RemoteObject _sw_gyro = RemoteObject.declareNull("de.amberhome.objects.appcompat.ACSwitchCompatWrapper");
public static RemoteObject _sp_hz = RemoteObject.declareNull("de.amberhome.objects.appcompat.ACSpinnerWrapper");
public static RemoteObject _sp_track_period = RemoteObject.declareNull("de.amberhome.objects.appcompat.ACSpinnerWrapper");
public static RemoteObject _headerlabel = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _panel1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _scalebasic = RemoteObject.declareNull("com.calypsoinstruments.anemotracker.scale");
public static RemoteObject _tagbasic1 = RemoteObject.declareNull("com.calypsoinstruments.anemotracker.tag");
public static RemoteObject _tagbasic2 = RemoteObject.declareNull("com.calypsoinstruments.anemotracker.tag");
public static RemoteObject _panel4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _tagfour1 = RemoteObject.declareNull("com.calypsoinstruments.anemotracker.tag");
public static RemoteObject _tagfour2 = RemoteObject.declareNull("com.calypsoinstruments.anemotracker.tag");
public static RemoteObject _tagfour3 = RemoteObject.declareNull("com.calypsoinstruments.anemotracker.tag");
public static RemoteObject _tagfour4 = RemoteObject.declareNull("com.calypsoinstruments.anemotracker.tag");
public static RemoteObject _scalefour = RemoteObject.declareNull("com.calypsoinstruments.anemotracker.scale");
public static RemoteObject _panel2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _scalemap = RemoteObject.declareNull("com.calypsoinstruments.anemotracker.scale");
public static RemoteObject _tagmap1 = RemoteObject.declareNull("com.calypsoinstruments.anemotracker.tag");
public static RemoteObject _tagmap2 = RemoteObject.declareNull("com.calypsoinstruments.anemotracker.tag");
public static RemoteObject _panel3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _tagtri1 = RemoteObject.declareNull("com.calypsoinstruments.anemotracker.tag");
public static RemoteObject _tagtri2 = RemoteObject.declareNull("com.calypsoinstruments.anemotracker.tag");
public static RemoteObject _tagtri3 = RemoteObject.declareNull("com.calypsoinstruments.anemotracker.tag");
public static RemoteObject _currentpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelm = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _tagm1 = RemoteObject.declareNull("com.calypsoinstruments.anemotracker.tag");
public static RemoteObject _tagm2 = RemoteObject.declareNull("com.calypsoinstruments.anemotracker.tag");
public static RemoteObject _tagm3 = RemoteObject.declareNull("com.calypsoinstruments.anemotracker.tag");
public static RemoteObject _tagm4 = RemoteObject.declareNull("com.calypsoinstruments.anemotracker.tag");
public static RemoteObject _tagm5 = RemoteObject.declareNull("com.calypsoinstruments.anemotracker.tag");
public static RemoteObject _tagm6 = RemoteObject.declareNull("com.calypsoinstruments.anemotracker.tag");
public static RemoteObject _mcontroles = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _imenuselected = RemoteObject.createImmutable(0);
public static RemoteObject _sp_period = RemoteObject.declareNull("de.amberhome.objects.appcompat.ACSpinnerWrapper");
public static RemoteObject _lbl_track = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_bt = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _btn_bt = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _lbl_mac = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_a = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_b = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_c = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_refresh = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _bmp_background = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
public static RemoteObject _pnl_equipment = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _sw_nmea = RemoteObject.declareNull("de.amberhome.objects.appcompat.ACSwitchCompatWrapper");
public static RemoteObject _btn_wifi = RemoteObject.declareNull("de.amberhome.objects.appcompat.ACButtonWrapper");
public static RemoteObject _btn_calcomp = RemoteObject.declareNull("de.amberhome.objects.appcompat.ACButtonWrapper");
public static RemoteObject _gyroenabled = RemoteObject.createImmutable(false);
public static RemoteObject _touchpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _off_btn = RemoteObject.declareNull("de.amberhome.objects.appcompat.ACButtonWrapper");
public static RemoteObject _btndis = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _offname_lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _offset_lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _startangle = RemoteObject.createImmutable(0);
public static RemoteObject _sw_realnorth = RemoteObject.declareNull("de.amberhome.objects.appcompat.ACSwitchCompatWrapper");
public static RemoteObject _offstart_ang = RemoteObject.createImmutable(0);
public static RemoteObject _olbleenabled = RemoteObject.createImmutable(false);
public static RemoteObject _movetouch = RemoteObject.createImmutable(false);
public static RemoteObject _ttouch = RemoteObject.createImmutable(0L);
public static RemoteObject _tag_list = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static com.calypsoinstruments.anemotracker.actble _actble = null;
public static com.calypsoinstruments.anemotracker.actlisttracks _actlisttracks = null;
public static com.calypsoinstruments.anemotracker.actnavigation _actnavigation = null;
public static com.calypsoinstruments.anemotracker.acttcpip _acttcpip = null;
public static com.calypsoinstruments.anemotracker.starter _starter = null;
public static com.calypsoinstruments.anemotracker.dbutils _dbutils = null;
public static com.calypsoinstruments.anemotracker.actcalcomp _actcalcomp = null;
public static com.calypsoinstruments.anemotracker.actdevinfo _actdevinfo = null;
  public Object[] GetGlobals() {
		return new Object[] {"actBLE",Debug.moduleToString(com.calypsoinstruments.anemotracker.actble.class),"actCalComp",Debug.moduleToString(com.calypsoinstruments.anemotracker.actcalcomp.class),"actDevInfo",Debug.moduleToString(com.calypsoinstruments.anemotracker.actdevinfo.class),"Activity",main.mostCurrent._activity,"actListTracks",Debug.moduleToString(com.calypsoinstruments.anemotracker.actlisttracks.class),"actNavigation",Debug.moduleToString(com.calypsoinstruments.anemotracker.actnavigation.class),"actTCPip",Debug.moduleToString(com.calypsoinstruments.anemotracker.acttcpip.class),"bmp_background",main.mostCurrent._bmp_background,"bmp_bt",main._bmp_bt,"bmp_calypso",main._bmp_calypso,"bmp_cups",main._bmp_cups,"bmp_nmea",main._bmp_nmea,"bmp_ultra",main._bmp_ultra,"bPaused",main._bpaused,"btn_bt",main.mostCurrent._btn_bt,"btn_calComp",main.mostCurrent._btn_calcomp,"btn_wifi",main.mostCurrent._btn_wifi,"btnDis",main.mostCurrent._btndis,"currentPanel",main.mostCurrent._currentpanel,"DBUtils",Debug.moduleToString(com.calypsoinstruments.anemotracker.dbutils.class),"dec",main._dec,"DSB",main.mostCurrent._dsb,"firstStart",main._firststart,"GPSEnabled",main._gpsenabled,"gyroEnabled",main._gyroenabled,"HeaderLabel",main.mostCurrent._headerlabel,"iMenuSelected",main._imenuselected,"imv_calypso",main.mostCurrent._imv_calypso,"imv_equipment",main.mostCurrent._imv_equipment,"IntToBool",main._inttobool,"kvs",main._kvs,"lbl_a",main.mostCurrent._lbl_a,"lbl_b",main.mostCurrent._lbl_b,"lbl_bt",main.mostCurrent._lbl_bt,"lbl_c",main.mostCurrent._lbl_c,"lbl_mac",main.mostCurrent._lbl_mac,"lbl_refresh",main.mostCurrent._lbl_refresh,"lbl_track",main.mostCurrent._lbl_track,"mControles",main.mostCurrent._mcontroles,"moveTouch",main._movetouch,"NativeMe",main._nativeme,"NavDrawer",main.mostCurrent._navdrawer,"off_btn",main.mostCurrent._off_btn,"offname_lbl",main.mostCurrent._offname_lbl,"offset_angle",main._offset_angle,"offset_lbl",main.mostCurrent._offset_lbl,"offstart_ang",main._offstart_ang,"olBleEnabled",main._olbleenabled,"panel_secondary",main.mostCurrent._panel_secondary,"Panel1",main.mostCurrent._panel1,"Panel2",main.mostCurrent._panel2,"Panel3",main.mostCurrent._panel3,"Panel4",main.mostCurrent._panel4,"PanelM",main.mostCurrent._panelm,"pnl_equipment",main.mostCurrent._pnl_equipment,"pnl_header",main.mostCurrent._pnl_header,"portrait",main._portrait,"rp",main._rp,"ScaleBasic",main.mostCurrent._scalebasic,"ScaleFour",main.mostCurrent._scalefour,"ScaleMap",main.mostCurrent._scalemap,"sp_Hz",main.mostCurrent._sp_hz,"sp_period",main.mostCurrent._sp_period,"sp_track_period",main.mostCurrent._sp_track_period,"startAngle",main._startangle,"Starter",Debug.moduleToString(com.calypsoinstruments.anemotracker.starter.class),"sw_gyro",main.mostCurrent._sw_gyro,"sw_mean",main.mostCurrent._sw_mean,"sw_nmea",main.mostCurrent._sw_nmea,"sw_realnorth",main.mostCurrent._sw_realnorth,"sw_track",main.mostCurrent._sw_track,"tag_list",main.mostCurrent._tag_list,"TagBasic1",main.mostCurrent._tagbasic1,"TagBasic2",main.mostCurrent._tagbasic2,"TagFour1",main.mostCurrent._tagfour1,"TagFour2",main.mostCurrent._tagfour2,"TagFour3",main.mostCurrent._tagfour3,"TagFour4",main.mostCurrent._tagfour4,"TagM1",main.mostCurrent._tagm1,"TagM2",main.mostCurrent._tagm2,"TagM3",main.mostCurrent._tagm3,"TagM4",main.mostCurrent._tagm4,"TagM5",main.mostCurrent._tagm5,"TagM6",main.mostCurrent._tagm6,"TagMap1",main.mostCurrent._tagmap1,"TagMap2",main.mostCurrent._tagmap2,"TagTri1",main.mostCurrent._tagtri1,"TagTri2",main.mostCurrent._tagtri2,"TagTri3",main.mostCurrent._tagtri3,"touchpanel",main.mostCurrent._touchpanel,"tTouch",main._ttouch,"xml",main.mostCurrent._xml};
}
}