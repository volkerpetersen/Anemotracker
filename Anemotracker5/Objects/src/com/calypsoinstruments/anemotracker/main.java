package com.calypsoinstruments.anemotracker;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class main extends android.support.v7.app.AppCompatActivity implements B4AActivity{
	public static main mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = true;
	public static final boolean includeTitle = false;
    public static WeakReference<Activity> previousOne;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "com.calypsoinstruments.anemotracker", "com.calypsoinstruments.anemotracker.main");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (main).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "com.calypsoinstruments.anemotracker", "com.calypsoinstruments.anemotracker.main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "com.calypsoinstruments.anemotracker.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (main) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (main) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        BA.LogInfo("** Activity (main) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        processBA.setActivityPaused(true);
        mostCurrent = null;
        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            main mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (main) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }



public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}
public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
vis = vis | (actble.mostCurrent != null);
vis = vis | (actlisttracks.mostCurrent != null);
vis = vis | (actnavigation.mostCurrent != null);
vis = vis | (acttcpip.mostCurrent != null);
vis = vis | (actcalcomp.mostCurrent != null);
vis = vis | (actdevinfo.mostCurrent != null);
return vis;}

private static BA killProgramHelper(BA ba) {
    if (ba == null)
        return null;
    anywheresoftware.b4a.BA.SharedProcessBA sharedProcessBA = ba.sharedProcessBA;
    if (sharedProcessBA == null || sharedProcessBA.activityBA == null)
        return null;
    return sharedProcessBA.activityBA.get();
}
public static void killProgram() {
     {
            Activity __a = null;
            if (main.previousOne != null) {
				__a = main.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(main.mostCurrent == null ? null : main.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (actble.previousOne != null) {
				__a = actble.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(actble.mostCurrent == null ? null : actble.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (actlisttracks.previousOne != null) {
				__a = actlisttracks.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(actlisttracks.mostCurrent == null ? null : actlisttracks.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (actnavigation.previousOne != null) {
				__a = actnavigation.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(actnavigation.mostCurrent == null ? null : actnavigation.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (acttcpip.previousOne != null) {
				__a = acttcpip.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(acttcpip.mostCurrent == null ? null : acttcpip.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, starter.class));
 {
            Activity __a = null;
            if (actcalcomp.previousOne != null) {
				__a = actcalcomp.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(actcalcomp.mostCurrent == null ? null : actcalcomp.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (actdevinfo.previousOne != null) {
				__a = actdevinfo.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(actdevinfo.mostCurrent == null ? null : actdevinfo.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

}
public anywheresoftware.b4a.keywords.Common __c = null;
public static com.calypsoinstruments.anemotracker.keyvaluestore _kvs = null;
public static boolean _portrait = false;
public static anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
public static boolean _gpsenabled = false;
public static boolean _bpaused = false;
public static anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp_calypso = null;
public static anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp_cups = null;
public static anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp_ultra = null;
public static anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp_nmea = null;
public static anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp_bt = null;
public static anywheresoftware.b4j.object.JavaObject _nativeme = null;
public static double _offset_angle = 0;
public static double _dec = 0;
public static boolean[] _inttobool = null;
public static boolean _firststart = false;
public anywheresoftware.b4a.object.XmlLayoutBuilder _xml = null;
public de.amberhome.objects.BottomNavigationViewWrapper _dsb = null;
public de.amberhome.objects.NavigationDrawerWrapper _navdrawer = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_header = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imv_calypso = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imv_equipment = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel_secondary = null;
public de.amberhome.objects.appcompat.ACSwitchCompatWrapper _sw_mean = null;
public de.amberhome.objects.appcompat.ACSwitchCompatWrapper _sw_track = null;
public de.amberhome.objects.appcompat.ACSwitchCompatWrapper _sw_gyro = null;
public de.amberhome.objects.appcompat.ACSpinnerWrapper _sp_hz = null;
public de.amberhome.objects.appcompat.ACSpinnerWrapper _sp_track_period = null;
public anywheresoftware.b4a.objects.LabelWrapper _headerlabel = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public com.calypsoinstruments.anemotracker.scale _scalebasic = null;
public com.calypsoinstruments.anemotracker.tag _tagbasic1 = null;
public com.calypsoinstruments.anemotracker.tag _tagbasic2 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel4 = null;
public com.calypsoinstruments.anemotracker.tag _tagfour1 = null;
public com.calypsoinstruments.anemotracker.tag _tagfour2 = null;
public com.calypsoinstruments.anemotracker.tag _tagfour3 = null;
public com.calypsoinstruments.anemotracker.tag _tagfour4 = null;
public com.calypsoinstruments.anemotracker.scale _scalefour = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel2 = null;
public com.calypsoinstruments.anemotracker.scale _scalemap = null;
public com.calypsoinstruments.anemotracker.tag _tagmap1 = null;
public com.calypsoinstruments.anemotracker.tag _tagmap2 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel3 = null;
public com.calypsoinstruments.anemotracker.tag _tagtri1 = null;
public com.calypsoinstruments.anemotracker.tag _tagtri2 = null;
public com.calypsoinstruments.anemotracker.tag _tagtri3 = null;
public anywheresoftware.b4a.objects.PanelWrapper _currentpanel = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelm = null;
public com.calypsoinstruments.anemotracker.tag _tagm1 = null;
public com.calypsoinstruments.anemotracker.tag _tagm2 = null;
public com.calypsoinstruments.anemotracker.tag _tagm3 = null;
public com.calypsoinstruments.anemotracker.tag _tagm4 = null;
public com.calypsoinstruments.anemotracker.tag _tagm5 = null;
public com.calypsoinstruments.anemotracker.tag _tagm6 = null;
public anywheresoftware.b4a.objects.collections.Map _mcontroles = null;
public static int _imenuselected = 0;
public de.amberhome.objects.appcompat.ACSpinnerWrapper _sp_period = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_track = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_bt = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_bt = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_mac = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_a = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_b = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_c = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_refresh = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp_background = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_equipment = null;
public de.amberhome.objects.appcompat.ACSwitchCompatWrapper _sw_nmea = null;
public de.amberhome.objects.appcompat.ACButtonWrapper _btn_wifi = null;
public de.amberhome.objects.appcompat.ACButtonWrapper _btn_calcomp = null;
public static boolean _gyroenabled = false;
public anywheresoftware.b4a.objects.PanelWrapper _touchpanel = null;
public de.amberhome.objects.appcompat.ACButtonWrapper _off_btn = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btndis = null;
public anywheresoftware.b4a.objects.LabelWrapper _offname_lbl = null;
public anywheresoftware.b4a.objects.LabelWrapper _offset_lbl = null;
public static double _startangle = 0;
public de.amberhome.objects.appcompat.ACSwitchCompatWrapper _sw_realnorth = null;
public static double _offstart_ang = 0;
public static boolean _olbleenabled = false;
public static boolean _movetouch = false;
public static long _ttouch = 0L;
public anywheresoftware.b4a.objects.collections.List _tag_list = null;
public com.calypsoinstruments.anemotracker.actble _actble = null;
public com.calypsoinstruments.anemotracker.actlisttracks _actlisttracks = null;
public com.calypsoinstruments.anemotracker.actnavigation _actnavigation = null;
public com.calypsoinstruments.anemotracker.acttcpip _acttcpip = null;
public com.calypsoinstruments.anemotracker.starter _starter = null;
public com.calypsoinstruments.anemotracker.dbutils _dbutils = null;
public com.calypsoinstruments.anemotracker.actcalcomp _actcalcomp = null;
public com.calypsoinstruments.anemotracker.actdevinfo _actdevinfo = null;
public static String  _acbutton1_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "acbutton1_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "acbutton1_click", null));}
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Sub ACButton1_Click";
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="DSB.CheckedItem=1";
mostCurrent._dsb.setCheckedItem((int) (1));
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="End Sub";
return "";
}
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
anywheresoftware.b4a.keywords.constants.TypefaceWrapper _pirulen = null;
anywheresoftware.b4a.keywords.constants.TypefaceWrapper _dsdigi = null;
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=131073;
 //BA.debugLineNum = 131073;BA.debugLine="Dim xml As XmlLayoutBuilder";
mostCurrent._xml = new anywheresoftware.b4a.object.XmlLayoutBuilder();
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="If FirstTime Then";
if (_firsttime) { 
RDebugUtils.currentLine=131077;
 //BA.debugLineNum = 131077;BA.debugLine="bmp_bt = LoadBitmap( File.DirAssets, \"bt.jpg\" )";
_bmp_bt = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"bt.jpg");
RDebugUtils.currentLine=131078;
 //BA.debugLineNum = 131078;BA.debugLine="bmp_calypso = LoadBitmap( File.DirAssets, \"calyp";
_bmp_calypso = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"calypso_drawer.jpg");
RDebugUtils.currentLine=131079;
 //BA.debugLineNum = 131079;BA.debugLine="bmp_cups = LoadBitmap( File.DirAssets, \"cups.jpg";
_bmp_cups = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"cups.jpg");
RDebugUtils.currentLine=131080;
 //BA.debugLineNum = 131080;BA.debugLine="bmp_ultra = LoadBitmap( File.DirAssets, \"ultra.j";
_bmp_ultra = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"ultra.jpg");
RDebugUtils.currentLine=131081;
 //BA.debugLineNum = 131081;BA.debugLine="bmp_nmea = LoadBitmap( File.DirAssets, \"nmea.jpg";
_bmp_nmea = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"nmea.jpg");
RDebugUtils.currentLine=131082;
 //BA.debugLineNum = 131082;BA.debugLine="Activity.SetBackgroundImage(LoadBitmapResize( Fi";
mostCurrent._activity.SetBackgroundImageNew((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmapResize(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"ultra.jpg",anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.True).getObject())).setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
RDebugUtils.currentLine=131084;
 //BA.debugLineNum = 131084;BA.debugLine="NativeMe.InitializeContext 'Para meter codigo ja";
_nativeme.InitializeContext(processBA);
 };
RDebugUtils.currentLine=131089;
 //BA.debugLineNum = 131089;BA.debugLine="If Activity.Width > Activity.Height Then";
if (mostCurrent._activity.getWidth()>mostCurrent._activity.getHeight()) { 
RDebugUtils.currentLine=131090;
 //BA.debugLineNum = 131090;BA.debugLine="portrait = False";
_portrait = anywheresoftware.b4a.keywords.Common.False;
 }else {
RDebugUtils.currentLine=131092;
 //BA.debugLineNum = 131092;BA.debugLine="portrait = True";
_portrait = anywheresoftware.b4a.keywords.Common.True;
 };
RDebugUtils.currentLine=131099;
 //BA.debugLineNum = 131099;BA.debugLine="NavDrawer.Initialize2(\"NavDrawer\", Activity, NavD";
mostCurrent._navdrawer.Initialize2(mostCurrent.activityBA,"NavDrawer",(anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(mostCurrent._activity.getObject())),mostCurrent._navdrawer.getDefaultDrawerWidth(),mostCurrent._navdrawer.GRAVITY_START);
RDebugUtils.currentLine=131102;
 //BA.debugLineNum = 131102;BA.debugLine="Activity.LoadLayout(\"layout1\")";
mostCurrent._activity.LoadLayout("layout1",mostCurrent.activityBA);
RDebugUtils.currentLine=131115;
 //BA.debugLineNum = 131115;BA.debugLine="bmp_background = LoadBitmapResize( File.DirAssets";
mostCurrent._bmp_background = anywheresoftware.b4a.keywords.Common.LoadBitmapResize(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"Textura fibra carbono.jpg",(int) (800),(int) (800),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=131119;
 //BA.debugLineNum = 131119;BA.debugLine="init_drawer";
_init_drawer();
RDebugUtils.currentLine=131120;
 //BA.debugLineNum = 131120;BA.debugLine="init_dsb";
_init_dsb();
RDebugUtils.currentLine=131121;
 //BA.debugLineNum = 131121;BA.debugLine="add_controls";
_add_controls();
RDebugUtils.currentLine=131127;
 //BA.debugLineNum = 131127;BA.debugLine="SetTiledBackground( DSB, bmp_background )";
_settiledbackground((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._dsb.getObject())),mostCurrent._bmp_background);
RDebugUtils.currentLine=131151;
 //BA.debugLineNum = 131151;BA.debugLine="Dim pirulen, dsdigi As Typeface";
_pirulen = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
_dsdigi = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
RDebugUtils.currentLine=131152;
 //BA.debugLineNum = 131152;BA.debugLine="pirulen = Typeface.LoadFromAssets(\"pirulen_rg.ttf";
_pirulen.setObject((android.graphics.Typeface)(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("pirulen_rg.ttf")));
RDebugUtils.currentLine=131153;
 //BA.debugLineNum = 131153;BA.debugLine="dsdigi = Typeface.LoadFromAssets(\"ds-digi.ttf\")";
_dsdigi.setObject((android.graphics.Typeface)(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("ds-digi.ttf")));
RDebugUtils.currentLine=131155;
 //BA.debugLineNum = 131155;BA.debugLine="touchpanel.Initialize( \"touchpanel\" )";
mostCurrent._touchpanel.Initialize(mostCurrent.activityBA,"touchpanel");
RDebugUtils.currentLine=131156;
 //BA.debugLineNum = 131156;BA.debugLine="Activity.AddView( touchpanel, 0, (Activity.Height";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._touchpanel.getObject()),(int) (0),(int) ((mostCurrent._activity.getHeight()-mostCurrent._activity.getWidth())/(double)2-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50))),mostCurrent._activity.getWidth(),mostCurrent._activity.getWidth());
RDebugUtils.currentLine=131157;
 //BA.debugLineNum = 131157;BA.debugLine="touchpanel.SendToBack";
mostCurrent._touchpanel.SendToBack();
RDebugUtils.currentLine=131159;
 //BA.debugLineNum = 131159;BA.debugLine="btnDis.Initialize( \"btnDis\" )";
mostCurrent._btndis.Initialize(mostCurrent.activityBA,"btnDis");
RDebugUtils.currentLine=131160;
 //BA.debugLineNum = 131160;BA.debugLine="Activity.AddView( btnDis, Activity.Width/2 - 150/";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._btndis.getObject()),(int) (mostCurrent._activity.getWidth()/(double)2-150/(double)2),(int) (mostCurrent._activity.getHeight()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (150))),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (150)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
RDebugUtils.currentLine=131161;
 //BA.debugLineNum = 131161;BA.debugLine="btnDis.Text = \"End offset adjust\"";
mostCurrent._btndis.setText(BA.ObjectToCharSequence("End offset adjust"));
RDebugUtils.currentLine=131163;
 //BA.debugLineNum = 131163;BA.debugLine="offname_lbl.Initialize( \"offname_lbl\" )";
mostCurrent._offname_lbl.Initialize(mostCurrent.activityBA,"offname_lbl");
RDebugUtils.currentLine=131164;
 //BA.debugLineNum = 131164;BA.debugLine="Activity.AddView( offname_lbl, Activity.Width/2 -";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._offname_lbl.getObject()),(int) (mostCurrent._activity.getWidth()/(double)2-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (120))),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (30)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (240)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
RDebugUtils.currentLine=131165;
 //BA.debugLineNum = 131165;BA.debugLine="offname_lbl.TextColor = 0xFFFFFFFF";
mostCurrent._offname_lbl.setTextColor((int) (0xffffffff));
RDebugUtils.currentLine=131166;
 //BA.debugLineNum = 131166;BA.debugLine="offname_lbl.TextSize = 22";
mostCurrent._offname_lbl.setTextSize((float) (22));
RDebugUtils.currentLine=131167;
 //BA.debugLineNum = 131167;BA.debugLine="offname_lbl.Typeface = pirulen";
mostCurrent._offname_lbl.setTypeface((android.graphics.Typeface)(_pirulen.getObject()));
RDebugUtils.currentLine=131168;
 //BA.debugLineNum = 131168;BA.debugLine="offname_lbl.Text = \"Offset Angle:\"";
mostCurrent._offname_lbl.setText(BA.ObjectToCharSequence("Offset Angle:"));
RDebugUtils.currentLine=131169;
 //BA.debugLineNum = 131169;BA.debugLine="offname_lbl.Visible = False";
mostCurrent._offname_lbl.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131171;
 //BA.debugLineNum = 131171;BA.debugLine="offset_lbl.Initialize( \"offset_lbl\" )";
mostCurrent._offset_lbl.Initialize(mostCurrent.activityBA,"offset_lbl");
RDebugUtils.currentLine=131172;
 //BA.debugLineNum = 131172;BA.debugLine="Activity.AddView( offset_lbl, Activity.Width/2 -";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._offset_lbl.getObject()),(int) (mostCurrent._activity.getWidth()/(double)2-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (120))),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (70)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (240)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (60)));
RDebugUtils.currentLine=131173;
 //BA.debugLineNum = 131173;BA.debugLine="offset_lbl.TextColor = 0xFFFFFFFF";
mostCurrent._offset_lbl.setTextColor((int) (0xffffffff));
RDebugUtils.currentLine=131174;
 //BA.debugLineNum = 131174;BA.debugLine="offset_lbl.TextSize = 24";
mostCurrent._offset_lbl.setTextSize((float) (24));
RDebugUtils.currentLine=131175;
 //BA.debugLineNum = 131175;BA.debugLine="offset_lbl.Typeface = dsdigi";
mostCurrent._offset_lbl.setTypeface((android.graphics.Typeface)(_dsdigi.getObject()));
RDebugUtils.currentLine=131176;
 //BA.debugLineNum = 131176;BA.debugLine="offset_lbl.Visible = False";
mostCurrent._offset_lbl.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131178;
 //BA.debugLineNum = 131178;BA.debugLine="sw_realnorth.Initialize(\"sw_realnorth\")";
mostCurrent._sw_realnorth.Initialize(mostCurrent.activityBA,"sw_realnorth");
RDebugUtils.currentLine=131179;
 //BA.debugLineNum = 131179;BA.debugLine="sw_realnorth.Text = \"Use real North\"";
mostCurrent._sw_realnorth.setText(BA.ObjectToCharSequence("Use real North"));
RDebugUtils.currentLine=131180;
 //BA.debugLineNum = 131180;BA.debugLine="Activity.AddView( sw_realnorth, 50dip, Activity.H";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._sw_realnorth.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)),(int) (mostCurrent._activity.getHeight()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (150))),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (160)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
RDebugUtils.currentLine=131181;
 //BA.debugLineNum = 131181;BA.debugLine="sw_realnorth.TextColor = 0xFFFFFFFF";
mostCurrent._sw_realnorth.setTextColor((int) (0xffffffff));
RDebugUtils.currentLine=131182;
 //BA.debugLineNum = 131182;BA.debugLine="sw_realnorth.TextSize = 18";
mostCurrent._sw_realnorth.setTextSize((float) (18));
RDebugUtils.currentLine=131183;
 //BA.debugLineNum = 131183;BA.debugLine="sw_realnorth.Visible = False";
mostCurrent._sw_realnorth.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131185;
 //BA.debugLineNum = 131185;BA.debugLine="btnDis.Visible = False";
mostCurrent._btndis.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131187;
 //BA.debugLineNum = 131187;BA.debugLine="tag_list.Initialize";
mostCurrent._tag_list.Initialize();
RDebugUtils.currentLine=131188;
 //BA.debugLineNum = 131188;BA.debugLine="tag_list.AddAll(Array As Tag(TagFour1,TagFour2,Ta";
mostCurrent._tag_list.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new com.calypsoinstruments.anemotracker.tag[]{mostCurrent._tagfour1,mostCurrent._tagfour2,mostCurrent._tagfour3,mostCurrent._tagfour4}));
RDebugUtils.currentLine=131193;
 //BA.debugLineNum = 131193;BA.debugLine="UpdateDrawer";
_updatedrawer();
RDebugUtils.currentLine=131195;
 //BA.debugLineNum = 131195;BA.debugLine="End Sub";
return "";
}
public static String  _init_drawer() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "init_drawer"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "init_drawer", null));}
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub init_drawer";
RDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="pnl_header.Initialize(\"\")";
mostCurrent._pnl_header.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="imv_calypso.Initialize(\"\")";
mostCurrent._imv_calypso.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="imv_calypso.Bitmap = LoadBitmapResize( File.DirAs";
mostCurrent._imv_calypso.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmapResize(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"calypso_drawer.jpg",anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (80)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (80)),anywheresoftware.b4a.keywords.Common.True).getObject()));
RDebugUtils.currentLine=458760;
 //BA.debugLineNum = 458760;BA.debugLine="imv_equipment.Initialize(\"\")";
mostCurrent._imv_equipment.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=458764;
 //BA.debugLineNum = 458764;BA.debugLine="NavDrawer.NavigationView.AddHeaderView( pnl_heade";
mostCurrent._navdrawer.getNavigationView().AddHeaderView((android.view.View)(mostCurrent._pnl_header.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)));
RDebugUtils.currentLine=458765;
 //BA.debugLineNum = 458765;BA.debugLine="pnl_header.Width =  300dip ' NavDrawer.DefaultHea";
mostCurrent._pnl_header.setWidth(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (300)));
RDebugUtils.currentLine=458767;
 //BA.debugLineNum = 458767;BA.debugLine="pnl_header.AddView( imv_calypso, 0,0.1*pnl_header";
mostCurrent._pnl_header.AddView((android.view.View)(mostCurrent._imv_calypso.getObject()),(int) (0),(int) (0.1*mostCurrent._pnl_header.getHeight()),(int) (0.5*mostCurrent._pnl_header.getWidth()),(int) (0.8*mostCurrent._pnl_header.getHeight()));
RDebugUtils.currentLine=458768;
 //BA.debugLineNum = 458768;BA.debugLine="pnl_header.AddView( imv_equipment, 0.5*pnl_header";
mostCurrent._pnl_header.AddView((android.view.View)(mostCurrent._imv_equipment.getObject()),(int) (0.5*mostCurrent._pnl_header.getWidth()),(int) (0),(int) (0.5*mostCurrent._pnl_header.getWidth()),mostCurrent._pnl_header.getHeight());
RDebugUtils.currentLine=458788;
 //BA.debugLineNum = 458788;BA.debugLine="NavDrawer.NavigationView.LoadLayout(\"navHeaderLay";
mostCurrent._navdrawer.getNavigationView().LoadLayout(mostCurrent.activityBA,"navHeaderLayout",anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (800)));
RDebugUtils.currentLine=458809;
 //BA.debugLineNum = 458809;BA.debugLine="sp_period.Prompt = \"Track period\"";
mostCurrent._sp_period.setPrompt(BA.ObjectToCharSequence("Track period"));
RDebugUtils.currentLine=458810;
 //BA.debugLineNum = 458810;BA.debugLine="sp_period.Add(\"Racing(5sec)\")";
mostCurrent._sp_period.Add(BA.ObjectToCharSequence("Racing(5sec)"));
RDebugUtils.currentLine=458811;
 //BA.debugLineNum = 458811;BA.debugLine="sp_period.Add(\"Daysail(1min)\")";
mostCurrent._sp_period.Add(BA.ObjectToCharSequence("Daysail(1min)"));
RDebugUtils.currentLine=458812;
 //BA.debugLineNum = 458812;BA.debugLine="sp_period.Add(\"Cruising(5min)\")";
mostCurrent._sp_period.Add(BA.ObjectToCharSequence("Cruising(5min)"));
RDebugUtils.currentLine=458816;
 //BA.debugLineNum = 458816;BA.debugLine="If Starter.connected Then ' hemos hecho cambio la";
if (mostCurrent._starter._connected) { 
RDebugUtils.currentLine=458817;
 //BA.debugLineNum = 458817;BA.debugLine="add_secondary_drawer";
_add_secondary_drawer();
 };
RDebugUtils.currentLine=458820;
 //BA.debugLineNum = 458820;BA.debugLine="End Sub";
return "";
}
public static String  _init_dsb() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "init_dsb"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "init_dsb", null));}
de.amberhome.objects.appcompat.ACMenuItemWrapper _item = null;
anywheresoftware.b4a.objects.drawable.BitmapDrawable _bd = null;
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Sub init_dsb";
RDebugUtils.currentLine=327686;
 //BA.debugLineNum = 327686;BA.debugLine="Dim item As ACMenuItem";
_item = new de.amberhome.objects.appcompat.ACMenuItemWrapper();
RDebugUtils.currentLine=327687;
 //BA.debugLineNum = 327687;BA.debugLine="Dim bd As BitmapDrawable";
_bd = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=327688;
 //BA.debugLineNum = 327688;BA.debugLine="bd.Initialize(LoadBitmap(File.DirAssets,\"Basic ic";
_bd.Initialize((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"Basic icon-01.png").getObject()));
RDebugUtils.currentLine=327689;
 //BA.debugLineNum = 327689;BA.debugLine="bd.Gravity = Gravity.CENTER";
_bd.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
RDebugUtils.currentLine=327701;
 //BA.debugLineNum = 327701;BA.debugLine="DSB.SetItemIconColors( Colors.Gray, Colors.White,";
mostCurrent._dsb.SetItemIconColors(anywheresoftware.b4a.keywords.Common.Colors.Gray,anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=327702;
 //BA.debugLineNum = 327702;BA.debugLine="DSB.SetItemTextColors( Colors.Gray, Colors.White,";
mostCurrent._dsb.SetItemTextColors(anywheresoftware.b4a.keywords.Common.Colors.Gray,anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=327704;
 //BA.debugLineNum = 327704;BA.debugLine="DSB.Menu.Add(2, 2, \"Four\", LoadBitmap(File.DirAss";
mostCurrent._dsb.getMenu().Add((int) (2),(int) (2),BA.ObjectToCharSequence("Four"),(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"Basic icon-01.png").getObject())).setChecked(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327705;
 //BA.debugLineNum = 327705;BA.debugLine="DSB.Menu.Add(3, 3, \"Map\", LoadBitmap(File.DirAsse";
mostCurrent._dsb.getMenu().Add((int) (3),(int) (3),BA.ObjectToCharSequence("Map"),(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"Map icon-01.png").getObject()));
RDebugUtils.currentLine=327706;
 //BA.debugLineNum = 327706;BA.debugLine="DSB.Menu.Add(4, 4, \"Tri\", LoadBitmap(File.DirAsse";
mostCurrent._dsb.getMenu().Add((int) (4),(int) (4),BA.ObjectToCharSequence("Tri"),(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"Tridata icon-01.png").getObject()));
RDebugUtils.currentLine=327707;
 //BA.debugLineNum = 327707;BA.debugLine="DSB.Menu.Add(5, 5, \"Multiple\", LoadBitmap(File.Di";
mostCurrent._dsb.getMenu().Add((int) (5),(int) (5),BA.ObjectToCharSequence("Multiple"),(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"Multi icon-01.png").getObject()));
RDebugUtils.currentLine=327717;
 //BA.debugLineNum = 327717;BA.debugLine="Panel4.LoadLayout(\"Four\")";
mostCurrent._panel4.LoadLayout("Four",mostCurrent.activityBA);
RDebugUtils.currentLine=327718;
 //BA.debugLineNum = 327718;BA.debugLine="SetTiledBackground( Panel4, bmp_background )";
_settiledbackground((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._panel4.getObject())),mostCurrent._bmp_background);
RDebugUtils.currentLine=327721;
 //BA.debugLineNum = 327721;BA.debugLine="ScaleFour.GetBase().Height = ScaleFour.getbase().";
mostCurrent._scalefour._getbase(null).setHeight(mostCurrent._scalefour._getbase(null).getWidth());
RDebugUtils.currentLine=327734;
 //BA.debugLineNum = 327734;BA.debugLine="Panel3.LoadLayout(\"Tridata\")";
mostCurrent._panel3.LoadLayout("Tridata",mostCurrent.activityBA);
RDebugUtils.currentLine=327735;
 //BA.debugLineNum = 327735;BA.debugLine="SetTiledBackground( Panel3, bmp_background )";
_settiledbackground((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._panel3.getObject())),mostCurrent._bmp_background);
RDebugUtils.currentLine=327736;
 //BA.debugLineNum = 327736;BA.debugLine="TagTri1.mbase.Height = 0.33*Panel3.Height";
mostCurrent._tagtri1._mbase.setHeight((int) (0.33*mostCurrent._panel3.getHeight()));
RDebugUtils.currentLine=327737;
 //BA.debugLineNum = 327737;BA.debugLine="TagTri1.mbase.Top = 0";
mostCurrent._tagtri1._mbase.setTop((int) (0));
RDebugUtils.currentLine=327738;
 //BA.debugLineNum = 327738;BA.debugLine="TagTri2.mbase.height = 0.33*Panel3.Height";
mostCurrent._tagtri2._mbase.setHeight((int) (0.33*mostCurrent._panel3.getHeight()));
RDebugUtils.currentLine=327739;
 //BA.debugLineNum = 327739;BA.debugLine="TagTri2.mbase.Top = 0.33*Panel3.Height";
mostCurrent._tagtri2._mbase.setTop((int) (0.33*mostCurrent._panel3.getHeight()));
RDebugUtils.currentLine=327740;
 //BA.debugLineNum = 327740;BA.debugLine="TagTri3.mbase.height = 0.33*Panel3.Height";
mostCurrent._tagtri3._mbase.setHeight((int) (0.33*mostCurrent._panel3.getHeight()));
RDebugUtils.currentLine=327741;
 //BA.debugLineNum = 327741;BA.debugLine="TagTri3.mbase.Top = 0.66*Panel3.Height";
mostCurrent._tagtri3._mbase.setTop((int) (0.66*mostCurrent._panel3.getHeight()));
RDebugUtils.currentLine=327743;
 //BA.debugLineNum = 327743;BA.debugLine="PanelM.LoadLayout(\"Multiple\")";
mostCurrent._panelm.LoadLayout("Multiple",mostCurrent.activityBA);
RDebugUtils.currentLine=327744;
 //BA.debugLineNum = 327744;BA.debugLine="SetTiledBackground( PanelM, bmp_background )";
_settiledbackground((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._panelm.getObject())),mostCurrent._bmp_background);
RDebugUtils.currentLine=327747;
 //BA.debugLineNum = 327747;BA.debugLine="currentPanel = Panel4";
mostCurrent._currentpanel = mostCurrent._panel4;
RDebugUtils.currentLine=327748;
 //BA.debugLineNum = 327748;BA.debugLine="iMenuSelected = 2";
_imenuselected = (int) (2);
RDebugUtils.currentLine=327756;
 //BA.debugLineNum = 327756;BA.debugLine="End Sub";
return "";
}
public static String  _add_controls() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "add_controls"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "add_controls", null));}
anywheresoftware.b4a.objects.collections.List _lcontroles = null;
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Sub add_controls";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="Dim lControles As List";
_lcontroles = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="mControles.Initialize";
mostCurrent._mcontroles.Initialize();
RDebugUtils.currentLine=655365;
 //BA.debugLineNum = 655365;BA.debugLine="lControles.Initialize";
_lcontroles.Initialize();
RDebugUtils.currentLine=655366;
 //BA.debugLineNum = 655366;BA.debugLine="lControles.Add( ScaleBasic )";
_lcontroles.Add((Object)(mostCurrent._scalebasic));
RDebugUtils.currentLine=655367;
 //BA.debugLineNum = 655367;BA.debugLine="lControles.AddAll( Array As Tag( TagBasic1, TagBa";
_lcontroles.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new com.calypsoinstruments.anemotracker.tag[]{mostCurrent._tagbasic1,mostCurrent._tagbasic2}));
RDebugUtils.currentLine=655368;
 //BA.debugLineNum = 655368;BA.debugLine="mControles.Put( 1, lControles )";
mostCurrent._mcontroles.Put((Object)(1),(Object)(_lcontroles.getObject()));
RDebugUtils.currentLine=655370;
 //BA.debugLineNum = 655370;BA.debugLine="lControles.Initialize";
_lcontroles.Initialize();
RDebugUtils.currentLine=655371;
 //BA.debugLineNum = 655371;BA.debugLine="lControles.Add( ScaleFour )";
_lcontroles.Add((Object)(mostCurrent._scalefour));
RDebugUtils.currentLine=655372;
 //BA.debugLineNum = 655372;BA.debugLine="lControles.AddAll( Array As Tag( TagFour1, TagFou";
_lcontroles.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new com.calypsoinstruments.anemotracker.tag[]{mostCurrent._tagfour1,mostCurrent._tagfour2,mostCurrent._tagfour3,mostCurrent._tagfour4}));
RDebugUtils.currentLine=655373;
 //BA.debugLineNum = 655373;BA.debugLine="mControles.Put( 2, lControles )";
mostCurrent._mcontroles.Put((Object)(2),(Object)(_lcontroles.getObject()));
RDebugUtils.currentLine=655375;
 //BA.debugLineNum = 655375;BA.debugLine="lControles.Initialize";
_lcontroles.Initialize();
RDebugUtils.currentLine=655376;
 //BA.debugLineNum = 655376;BA.debugLine="lControles.Add( ScaleMap )";
_lcontroles.Add((Object)(mostCurrent._scalemap));
RDebugUtils.currentLine=655377;
 //BA.debugLineNum = 655377;BA.debugLine="lControles.Addall( Array As Tag( TagMap1, TagMap2";
_lcontroles.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new com.calypsoinstruments.anemotracker.tag[]{mostCurrent._tagmap1,mostCurrent._tagmap2}));
RDebugUtils.currentLine=655378;
 //BA.debugLineNum = 655378;BA.debugLine="mControles.Put( 3, lControles )";
mostCurrent._mcontroles.Put((Object)(3),(Object)(_lcontroles.getObject()));
RDebugUtils.currentLine=655380;
 //BA.debugLineNum = 655380;BA.debugLine="lControles.Initialize";
_lcontroles.Initialize();
RDebugUtils.currentLine=655381;
 //BA.debugLineNum = 655381;BA.debugLine="lControles.Addall( Array As Tag( TagTri1, TagTri2";
_lcontroles.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new com.calypsoinstruments.anemotracker.tag[]{mostCurrent._tagtri1,mostCurrent._tagtri2,mostCurrent._tagtri3}));
RDebugUtils.currentLine=655382;
 //BA.debugLineNum = 655382;BA.debugLine="mControles.Put( 4, lControles )";
mostCurrent._mcontroles.Put((Object)(4),(Object)(_lcontroles.getObject()));
RDebugUtils.currentLine=655384;
 //BA.debugLineNum = 655384;BA.debugLine="lControles.Initialize";
_lcontroles.Initialize();
RDebugUtils.currentLine=655385;
 //BA.debugLineNum = 655385;BA.debugLine="lControles.AddAll( Array As Tag( TagM1, TagM2, Ta";
_lcontroles.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new com.calypsoinstruments.anemotracker.tag[]{mostCurrent._tagm1,mostCurrent._tagm2,mostCurrent._tagm3,mostCurrent._tagm4,mostCurrent._tagm5,mostCurrent._tagm6}));
RDebugUtils.currentLine=655386;
 //BA.debugLineNum = 655386;BA.debugLine="mControles.Put( 5, lControles )";
mostCurrent._mcontroles.Put((Object)(5),(Object)(_lcontroles.getObject()));
RDebugUtils.currentLine=655387;
 //BA.debugLineNum = 655387;BA.debugLine="Update(True)";
_update(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=655388;
 //BA.debugLineNum = 655388;BA.debugLine="End Sub";
return "";
}
public static String  _settiledbackground(anywheresoftware.b4a.objects.ConcreteViewWrapper _v,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _b) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "settiledbackground"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "settiledbackground", new Object[] {_v,_b}));}
anywheresoftware.b4a.objects.drawable.BitmapDrawable _bd = null;
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Sub SetTiledBackground(v As View, b As Bitmap)";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Dim bd As BitmapDrawable";
_bd = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="bd.Initialize(b)";
_bd.Initialize((android.graphics.Bitmap)(_b.getObject()));
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=917510;
 //BA.debugLineNum = 917510;BA.debugLine="r.Target = bd";
_r.Target = (Object)(_bd.getObject());
RDebugUtils.currentLine=917511;
 //BA.debugLineNum = 917511;BA.debugLine="r.RunMethod3(\"setTileModeXY\",\"REPEAT\", \"android.g";
_r.RunMethod3("setTileModeXY","REPEAT","android.graphics.Shader$TileMode","REPEAT","android.graphics.Shader$TileMode");
RDebugUtils.currentLine=917513;
 //BA.debugLineNum = 917513;BA.debugLine="v.Background = bd";
_v.setBackground((android.graphics.drawable.Drawable)(_bd.getObject()));
RDebugUtils.currentLine=917514;
 //BA.debugLineNum = 917514;BA.debugLine="End Sub";
return "";
}
public static String  _updatedrawer() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "updatedrawer"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "updatedrawer", null));}
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Sub UpdateDrawer";
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="If sw_track.IsInitialized Then";
if (mostCurrent._sw_track.IsInitialized()) { 
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="If Starter.Timer_sqlite.Enabled And Not( sw_trac";
if (mostCurrent._starter._timer_sqlite.getEnabled() && anywheresoftware.b4a.keywords.Common.Not(mostCurrent._sw_track.getChecked())) { 
RDebugUtils.currentLine=983046;
 //BA.debugLineNum = 983046;BA.debugLine="sw_track.Checked = True";
mostCurrent._sw_track.setChecked(anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=983048;
 //BA.debugLineNum = 983048;BA.debugLine="If Not(Starter.Timer_sqlite.Enabled) And sw_trac";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._starter._timer_sqlite.getEnabled()) && mostCurrent._sw_track.getChecked()) { 
RDebugUtils.currentLine=983049;
 //BA.debugLineNum = 983049;BA.debugLine="sw_track.Checked = False";
mostCurrent._sw_track.setChecked(anywheresoftware.b4a.keywords.Common.False);
 };
 };
RDebugUtils.currentLine=983052;
 //BA.debugLineNum = 983052;BA.debugLine="If Starter.navigation = 0 Then";
if (mostCurrent._starter._navigation==0) { 
RDebugUtils.currentLine=983053;
 //BA.debugLineNum = 983053;BA.debugLine="lbl_track.Text = \"No Track\"";
mostCurrent._lbl_track.setText(BA.ObjectToCharSequence("No Track"));
 }else {
RDebugUtils.currentLine=983055;
 //BA.debugLineNum = 983055;BA.debugLine="Dim m = DBUtils.ExecuteMap( Starter.sql1, \"selec";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = mostCurrent._dbutils._executemap(mostCurrent.activityBA,mostCurrent._starter._sql1,"select * from navigation where [id] = "+BA.NumberToString(mostCurrent._starter._navigation),(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=983056;
 //BA.debugLineNum = 983056;BA.debugLine="lbl_track.Text = m.Get(\"name\" )";
mostCurrent._lbl_track.setText(BA.ObjectToCharSequence(_m.Get((Object)("name"))));
 };
RDebugUtils.currentLine=983059;
 //BA.debugLineNum = 983059;BA.debugLine="If Starter.connected Then";
if (mostCurrent._starter._connected) { 
RDebugUtils.currentLine=983060;
 //BA.debugLineNum = 983060;BA.debugLine="lbl_bt.Text = Starter.actual_ultra.MacAddress";
mostCurrent._lbl_bt.setText(BA.ObjectToCharSequence(mostCurrent._starter._actual_ultra.MacAddress));
RDebugUtils.currentLine=983061;
 //BA.debugLineNum = 983061;BA.debugLine="btn_bt.Text = \"Disconn\"";
mostCurrent._btn_bt.setText(BA.ObjectToCharSequence("Disconn"));
RDebugUtils.currentLine=983062;
 //BA.debugLineNum = 983062;BA.debugLine="If Starter.bleEnabled Then btn_bt.Enabled = True";
if (mostCurrent._starter._bleenabled) { 
mostCurrent._btn_bt.setEnabled(anywheresoftware.b4a.keywords.Common.True);};
 }else {
RDebugUtils.currentLine=983064;
 //BA.debugLineNum = 983064;BA.debugLine="lbl_bt.Text = \"Not connected\"";
mostCurrent._lbl_bt.setText(BA.ObjectToCharSequence("Not connected"));
RDebugUtils.currentLine=983065;
 //BA.debugLineNum = 983065;BA.debugLine="If Starter.tScan.Enabled Then";
if (mostCurrent._starter._tscan.getEnabled()) { 
RDebugUtils.currentLine=983066;
 //BA.debugLineNum = 983066;BA.debugLine="btn_bt.Enabled = False";
mostCurrent._btn_bt.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=983067;
 //BA.debugLineNum = 983067;BA.debugLine="btn_bt.Text = \"Scanning\"";
mostCurrent._btn_bt.setText(BA.ObjectToCharSequence("Scanning"));
 }else {
RDebugUtils.currentLine=983069;
 //BA.debugLineNum = 983069;BA.debugLine="If Starter.bleEnabled Then btn_bt.Enabled = Tru";
if (mostCurrent._starter._bleenabled) { 
mostCurrent._btn_bt.setEnabled(anywheresoftware.b4a.keywords.Common.True);};
RDebugUtils.currentLine=983070;
 //BA.debugLineNum = 983070;BA.debugLine="btn_bt.Text = \"Scan\"";
mostCurrent._btn_bt.setText(BA.ObjectToCharSequence("Scan"));
 };
 };
RDebugUtils.currentLine=983074;
 //BA.debugLineNum = 983074;BA.debugLine="If Starter.connected Then";
if (mostCurrent._starter._connected) { 
RDebugUtils.currentLine=983075;
 //BA.debugLineNum = 983075;BA.debugLine="If sw_mean.IsInitialized Then";
if (mostCurrent._sw_mean.IsInitialized()) { 
RDebugUtils.currentLine=983076;
 //BA.debugLineNum = 983076;BA.debugLine="sw_mean.Checked = Starter.calcs_1.mean_sw";
mostCurrent._sw_mean.setChecked(mostCurrent._starter._calcs_1._mean_sw);
 };
 };
RDebugUtils.currentLine=983080;
 //BA.debugLineNum = 983080;BA.debugLine="If Not( Starter.connected ) Then";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._starter._connected)) { 
RDebugUtils.currentLine=983081;
 //BA.debugLineNum = 983081;BA.debugLine="imv_equipment.Bitmap = Null";
mostCurrent._imv_equipment.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null));
 }else 
{RDebugUtils.currentLine=983082;
 //BA.debugLineNum = 983082;BA.debugLine="else If Starter.devicetype = 1 Then";
if (mostCurrent._starter._devicetype==1) { 
RDebugUtils.currentLine=983083;
 //BA.debugLineNum = 983083;BA.debugLine="imv_equipment.bitmap = LoadBitmapResize(File.Dir";
mostCurrent._imv_equipment.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmapResize(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"cups.jpg",anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.True).getObject()));
 }else 
{RDebugUtils.currentLine=983084;
 //BA.debugLineNum = 983084;BA.debugLine="else if  Starter.devicetype = 2 Then";
if (mostCurrent._starter._devicetype==2) { 
RDebugUtils.currentLine=983085;
 //BA.debugLineNum = 983085;BA.debugLine="imv_equipment.bitmap = LoadBitmapResize(File.Dir";
mostCurrent._imv_equipment.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmapResize(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"ultra.jpg",anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.True).getObject()));
 }else {
RDebugUtils.currentLine=983087;
 //BA.debugLineNum = 983087;BA.debugLine="imv_equipment.bitmap = LoadBitmapResize(File.Dir";
mostCurrent._imv_equipment.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmapResize(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"nmea.jpg",anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.True).getObject()));
 }}}
;
RDebugUtils.currentLine=983089;
 //BA.debugLineNum = 983089;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress"))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
int _result = 0;
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then  ' the Ba";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="Dim result As Int";
_result = 0;
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="result = Msgbox2( \"AnemoTracker exit\", \"Do you w";
_result = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("AnemoTracker exit"),BA.ObjectToCharSequence("Do you want to exit"),"Yes","","No",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=2293764;
 //BA.debugLineNum = 2293764;BA.debugLine="If result = DialogResponse.POSITIVE Then";
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=2293765;
 //BA.debugLineNum = 2293765;BA.debugLine="Starter.n.Cancel(1)";
mostCurrent._starter._n.Cancel((int) (1));
RDebugUtils.currentLine=2293766;
 //BA.debugLineNum = 2293766;BA.debugLine="Starter.Scan.Disconnect";
mostCurrent._starter._scan.Disconnect();
RDebugUtils.currentLine=2293767;
 //BA.debugLineNum = 2293767;BA.debugLine="StopService( Starter )";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(mostCurrent._starter.getObject()));
RDebugUtils.currentLine=2293768;
 //BA.debugLineNum = 2293768;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
RDebugUtils.currentLine=2293769;
 //BA.debugLineNum = 2293769;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 }else {
RDebugUtils.currentLine=2293771;
 //BA.debugLineNum = 2293771;BA.debugLine="Return True 'returns to the Activity instead of";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
 };
RDebugUtils.currentLine=2293774;
 //BA.debugLineNum = 2293774;BA.debugLine="End Sub";
return false;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="bPaused = True";
_bpaused = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=262148;
 //BA.debugLineNum = 262148;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="bPaused = False";
_bpaused = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=196611;
 //BA.debugLineNum = 196611;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=196612;
 //BA.debugLineNum = 196612;BA.debugLine="r.RunStaticMethod(\"java.lang.System\", \"gc\", Null,";
_r.RunStaticMethod("java.lang.System","gc",(Object[])(anywheresoftware.b4a.keywords.Common.Null),(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=196613;
 //BA.debugLineNum = 196613;BA.debugLine="End Sub";
return "";
}
public static void  _update(boolean _selected) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "update"))
	 {Debug.delegate(mostCurrent.activityBA, "update", new Object[] {_selected}); return;}
ResumableSub_Update rsub = new ResumableSub_Update(null,_selected);
rsub.resume(processBA, null);
}
public static class ResumableSub_Update extends BA.ResumableSub {
public ResumableSub_Update(com.calypsoinstruments.anemotracker.main parent,boolean _selected) {
this.parent = parent;
this._selected = _selected;
}
com.calypsoinstruments.anemotracker.main parent;
boolean _selected;
anywheresoftware.b4a.objects.collections.List _lcontroles = null;
Object _control = null;
anywheresoftware.b4a.BA.IterableList group5;
int index5;
int groupLen5;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1048586;
 //BA.debugLineNum = 1048586;BA.debugLine="If Not( bPaused ) Then";
if (true) break;

case 1:
//if
this.state = 8;
if (anywheresoftware.b4a.keywords.Common.Not(parent._bpaused)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=1048587;
 //BA.debugLineNum = 1048587;BA.debugLine="Dim lControles As List";
_lcontroles = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1048588;
 //BA.debugLineNum = 1048588;BA.debugLine="lControles.Initialize";
_lcontroles.Initialize();
RDebugUtils.currentLine=1048589;
 //BA.debugLineNum = 1048589;BA.debugLine="lControles = mControles.Get(iMenuSelected)";
_lcontroles.setObject((java.util.List)(parent.mostCurrent._mcontroles.Get((Object)(parent._imenuselected))));
RDebugUtils.currentLine=1048590;
 //BA.debugLineNum = 1048590;BA.debugLine="For Each control As Object In lControles";
if (true) break;

case 4:
//for
this.state = 7;
group5 = _lcontroles;
index5 = 0;
groupLen5 = group5.getSize();
this.state = 12;
if (true) break;

case 12:
//C
this.state = 7;
if (index5 < groupLen5) {
this.state = 6;
_control = group5.Get(index5);}
if (true) break;

case 13:
//C
this.state = 12;
index5++;
if (true) break;

case 6:
//C
this.state = 13;
RDebugUtils.currentLine=1048592;
 //BA.debugLineNum = 1048592;BA.debugLine="CallSubDelayed2( control, \"Update\", selected )";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,_control,"Update",(Object)(_selected));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 8;
;
 if (true) break;
;
RDebugUtils.currentLine=1048596;
 //BA.debugLineNum = 1048596;BA.debugLine="If firstStart Then";

case 8:
//if
this.state = 11;
if (parent._firststart) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=1048597;
 //BA.debugLineNum = 1048597;BA.debugLine="Log(\"Update firstTime\")";
anywheresoftware.b4a.keywords.Common.Log("Update firstTime");
RDebugUtils.currentLine=1048598;
 //BA.debugLineNum = 1048598;BA.debugLine="firstStart = False";
parent._firststart = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=1048599;
 //BA.debugLineNum = 1048599;BA.debugLine="Sleep (2000) 'wait to load finished";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "update"),(int) (2000));
this.state = 14;
return;
case 14:
//C
this.state = 11;
;
RDebugUtils.currentLine=1048600;
 //BA.debugLineNum = 1048600;BA.debugLine="init_messages";
_init_messages();
 if (true) break;

case 11:
//C
this.state = -1;
;
RDebugUtils.currentLine=1048602;
 //BA.debugLineNum = 1048602;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _add_secondary_drawer() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "add_secondary_drawer"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "add_secondary_drawer", null));}
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub add_secondary_drawer";
RDebugUtils.currentLine=524308;
 //BA.debugLineNum = 524308;BA.debugLine="pnl_equipment.LoadLayout(\"navheaderlayout2\")";
mostCurrent._pnl_equipment.LoadLayout("navheaderlayout2",mostCurrent.activityBA);
RDebugUtils.currentLine=524309;
 //BA.debugLineNum = 524309;BA.debugLine="HeaderLabel.Text = \"\" 'Starter.actual_mac";
mostCurrent._headerlabel.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=524336;
 //BA.debugLineNum = 524336;BA.debugLine="If Starter.deviceType = 2 Or Starter.deviceType =";
if (mostCurrent._starter._devicetype==2 || mostCurrent._starter._devicetype==3) { 
RDebugUtils.currentLine=524342;
 //BA.debugLineNum = 524342;BA.debugLine="sp_Hz.Add(\"1Hz\")";
mostCurrent._sp_hz.Add(BA.ObjectToCharSequence("1Hz"));
RDebugUtils.currentLine=524343;
 //BA.debugLineNum = 524343;BA.debugLine="sp_Hz.Add(\"4Hz\")";
mostCurrent._sp_hz.Add(BA.ObjectToCharSequence("4Hz"));
RDebugUtils.currentLine=524344;
 //BA.debugLineNum = 524344;BA.debugLine="sp_Hz.Add(\"8Hz\")";
mostCurrent._sp_hz.Add(BA.ObjectToCharSequence("8Hz"));
RDebugUtils.currentLine=524345;
 //BA.debugLineNum = 524345;BA.debugLine="sp_Hz.SelectedIndex = 1 ' contador comienza en 0";
mostCurrent._sp_hz.setSelectedIndex((int) (1));
 }else {
RDebugUtils.currentLine=524349;
 //BA.debugLineNum = 524349;BA.debugLine="sp_Hz.Visible = False";
mostCurrent._sp_hz.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=524350;
 //BA.debugLineNum = 524350;BA.debugLine="sw_gyro.Visible = False";
mostCurrent._sw_gyro.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=524351;
 //BA.debugLineNum = 524351;BA.debugLine="lbl_refresh.Visible = False";
mostCurrent._lbl_refresh.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=524353;
 //BA.debugLineNum = 524353;BA.debugLine="If Starter.deviceType = 3 Then";
if (mostCurrent._starter._devicetype==3) { 
 }else {
RDebugUtils.currentLine=524355;
 //BA.debugLineNum = 524355;BA.debugLine="sw_nmea.Visible = False";
mostCurrent._sw_nmea.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=524363;
 //BA.debugLineNum = 524363;BA.debugLine="End Sub";
return "";
}
public static String  _bluetoothad() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "bluetoothad"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "bluetoothad", null));}
int _result = 0;
boolean _activarble = false;
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Sub bluetoothAd";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="Dim result As Int";
_result = 0;
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="result = Msgbox2( \"Bluetooth is disabled. Do you";
_result = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Bluetooth is disabled. Do you want to enable it?"),BA.ObjectToCharSequence("Advise"),"Yes","","No",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="If result = DialogResponse.POSITIVE Then";
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="Dim activarBle As Boolean = NativeMe.RunMethod(\"";
_activarble = BA.ObjectToBoolean(_nativeme.RunMethod("setBluetooth",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=2359301;
 //BA.debugLineNum = 2359301;BA.debugLine="Log(\"activarBle \" & activarBle)";
anywheresoftware.b4a.keywords.Common.Log("activarBle "+BA.ObjectToString(_activarble));
 }else {
RDebugUtils.currentLine=2359303;
 //BA.debugLineNum = 2359303;BA.debugLine="Msgbox(\"Some functions will not be usable\", \"Blu";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Some functions will not be usable"),BA.ObjectToCharSequence("Bluetooth warning"),mostCurrent.activityBA);
 };
RDebugUtils.currentLine=2359305;
 //BA.debugLineNum = 2359305;BA.debugLine="End Sub";
return "";
}
public static String  _btn_bt_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_bt_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_bt_click", null));}
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Sub btn_bt_Click";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="If Starter.connected Then";
if (mostCurrent._starter._connected) { 
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="Starter.manual_disconnect = True";
mostCurrent._starter._manual_disconnect = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="Starter.Scan.Disconnect";
mostCurrent._starter._scan.Disconnect();
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="btn_bt.Text = \"Scan\"";
mostCurrent._btn_bt.setText(BA.ObjectToCharSequence("Scan"));
RDebugUtils.currentLine=1179653;
 //BA.debugLineNum = 1179653;BA.debugLine="btn_bt.Enabled = True";
mostCurrent._btn_bt.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=1179655;
 //BA.debugLineNum = 1179655;BA.debugLine="Starter.Scan.StopScan";
mostCurrent._starter._scan.StopScan();
RDebugUtils.currentLine=1179656;
 //BA.debugLineNum = 1179656;BA.debugLine="btn_bt.Enabled = False";
mostCurrent._btn_bt.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1179657;
 //BA.debugLineNum = 1179657;BA.debugLine="btn_bt.Text = \"Scanning\"";
mostCurrent._btn_bt.setText(BA.ObjectToCharSequence("Scanning"));
RDebugUtils.currentLine=1179658;
 //BA.debugLineNum = 1179658;BA.debugLine="btn_bt.Invalidate";
mostCurrent._btn_bt.Invalidate();
RDebugUtils.currentLine=1179659;
 //BA.debugLineNum = 1179659;BA.debugLine="Starter.Scan.Disconnect";
mostCurrent._starter._scan.Disconnect();
RDebugUtils.currentLine=1179660;
 //BA.debugLineNum = 1179660;BA.debugLine="Starter.bSelectBLE = True";
mostCurrent._starter._bselectble = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=1179661;
 //BA.debugLineNum = 1179661;BA.debugLine="Starter.temporizador = 10000";
mostCurrent._starter._temporizador = (long) (10000);
RDebugUtils.currentLine=1179662;
 //BA.debugLineNum = 1179662;BA.debugLine="StartActivity( actBLE )";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._actble.getObject()));
 };
RDebugUtils.currentLine=1179665;
 //BA.debugLineNum = 1179665;BA.debugLine="UpdateDrawer";
_updatedrawer();
RDebugUtils.currentLine=1179666;
 //BA.debugLineNum = 1179666;BA.debugLine="End Sub";
return "";
}
public static String  _btn_calcomp_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_calcomp_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_calcomp_click", null));}
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Sub btn_calComp_Click";
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="Log(\"btn_calComp clicked\")";
anywheresoftware.b4a.keywords.Common.Log("btn_calComp clicked");
RDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="If gyroEnabled Then";
if (_gyroenabled) { 
RDebugUtils.currentLine=2162692;
 //BA.debugLineNum = 2162692;BA.debugLine="StartActivity( actCalComp )";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._actcalcomp.getObject()));
 }else {
RDebugUtils.currentLine=2162694;
 //BA.debugLineNum = 2162694;BA.debugLine="Msgbox(\"You sould enable gyro first\", \"Warning\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("You sould enable gyro first"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 };
RDebugUtils.currentLine=2162696;
 //BA.debugLineNum = 2162696;BA.debugLine="End Sub";
return "";
}
public static String  _btn_info_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_info_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_info_click", null));}
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Sub btn_info_Click";
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="StartActivity(actDevInfo)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._actdevinfo.getObject()));
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="End Sub";
return "";
}
public static String  _btn_wifi_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_wifi_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_wifi_click", null));}
wifi.MLwifi _ml = null;
boolean _isultrawifi = false;
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Sub btn_wifi_Click";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="Dim ml As MLwifi";
_ml = new wifi.MLwifi();
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="Dim isUltraWifi As Boolean = ml.WifiSSID.StartsWi";
_isultrawifi = _ml.WifiSSID().startsWith("UltraWifi");
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="ToastMessageShow(\"Is connected to WiFi: \" &  ml.i";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Is connected to WiFi: "+BA.ObjectToString(_ml.isOnline())+anywheresoftware.b4a.keywords.Common.CRLF+"SSID:"+_ml.WifiSSID()+anywheresoftware.b4a.keywords.Common.CRLF+"is Ultra: "+BA.ObjectToString(_isultrawifi)),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2097156;
 //BA.debugLineNum = 2097156;BA.debugLine="StartActivity(actTCPip)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._acttcpip.getObject()));
RDebugUtils.currentLine=2097157;
 //BA.debugLineNum = 2097157;BA.debugLine="End Sub";
return "";
}
public static String  _btndis_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btndis_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btndis_click", null));}
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Sub btnDis_Click";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="touchpanel.SendToBack";
mostCurrent._touchpanel.SendToBack();
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="btnDis.Visible = False";
mostCurrent._btndis.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="offname_lbl.Visible = False";
mostCurrent._offname_lbl.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2686980;
 //BA.debugLineNum = 2686980;BA.debugLine="offset_lbl.Visible = False";
mostCurrent._offset_lbl.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2686981;
 //BA.debugLineNum = 2686981;BA.debugLine="sw_realnorth.Visible = False";
mostCurrent._sw_realnorth.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2686983;
 //BA.debugLineNum = 2686983;BA.debugLine="edit_tags(tag_list, 0xFFFFFF, 10dip, 3dip, 0xFF00";
_edit_tags(mostCurrent._tag_list,(int) (0xffffff),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (3)),(int) (0xff000000),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2686986;
 //BA.debugLineNum = 2686986;BA.debugLine="kvs.PutSimple( \"calibration_offset\" , offset_angl";
_kvs._putsimple(null,"calibration_offset",(Object)(_offset_angle));
RDebugUtils.currentLine=2686987;
 //BA.debugLineNum = 2686987;BA.debugLine="Starter.calcs_1.offset = offset_angle";
mostCurrent._starter._calcs_1._offset = (float) (_offset_angle);
RDebugUtils.currentLine=2686989;
 //BA.debugLineNum = 2686989;BA.debugLine="End Sub";
return "";
}
public static String  _edit_tags(anywheresoftware.b4a.objects.collections.List _stag,int _color,int _cradius,int _bwidth,int _bcolor,boolean _svisible) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edit_tags"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edit_tags", new Object[] {_stag,_color,_cradius,_bwidth,_bcolor,_svisible}));}
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd = null;
com.calypsoinstruments.anemotracker.tag _elem = null;
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Sub edit_tags (sTag As List, color As Int , cRadiu";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="Dim cd As ColorDrawable";
_cd = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="cd.Initialize2(color, cRadius, bWidth, bColor)";
_cd.Initialize2(_color,_cradius,_bwidth,_bcolor);
RDebugUtils.currentLine=2555907;
 //BA.debugLineNum = 2555907;BA.debugLine="For Each elem As Tag In sTag";
{
final anywheresoftware.b4a.BA.IterableList group3 = _stag;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_elem = (com.calypsoinstruments.anemotracker.tag)(group3.Get(index3));
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="elem.GetBase.Background = cd";
_elem._getbase(null).setBackground((android.graphics.drawable.Drawable)(_cd.getObject()));
 }
};
RDebugUtils.currentLine=2555911;
 //BA.debugLineNum = 2555911;BA.debugLine="End Sub";
return "";
}
public static String  _connecting() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "connecting"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "connecting", null));}
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Sub Connecting";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="btn_bt.Enabled = False";
mostCurrent._btn_bt.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="btn_bt.Text = \"Connecting\"";
mostCurrent._btn_bt.setText(BA.ObjectToCharSequence("Connecting"));
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="btn_bt.Invalidate";
mostCurrent._btn_bt.Invalidate();
RDebugUtils.currentLine=1245189;
 //BA.debugLineNum = 1245189;BA.debugLine="End Sub";
return "";
}
public static String  _disconnect() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "disconnect"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "disconnect", null));}
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Sub Disconnect";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="btn_bt.Enabled = True";
mostCurrent._btn_bt.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="btn_bt.Text = \"Scan\"";
mostCurrent._btn_bt.setText(BA.ObjectToCharSequence("Scan"));
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="btn_bt.Invalidate";
mostCurrent._btn_bt.Invalidate();
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="End Sub";
return "";
}
public static String  _dsb_navigationitemselected(de.amberhome.objects.appcompat.ACMenuItemWrapper _menuitem) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "dsb_navigationitemselected"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "dsb_navigationitemselected", new Object[] {_menuitem}));}
anywheresoftware.b4a.objects.PanelWrapper _newpanel = null;
anywheresoftware.b4a.objects.collections.List _lcontroles = null;
Object _control = null;
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Sub DSB_NavigationItemSelected(MenuItem As ACMenuI";
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="Dim newPanel As Panel";
_newpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=851974;
 //BA.debugLineNum = 851974;BA.debugLine="Dim lControles As List";
_lcontroles = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=851975;
 //BA.debugLineNum = 851975;BA.debugLine="lControles.Initialize";
_lcontroles.Initialize();
RDebugUtils.currentLine=851976;
 //BA.debugLineNum = 851976;BA.debugLine="lControles = mControles.Get(iMenuSelected)";
_lcontroles.setObject((java.util.List)(mostCurrent._mcontroles.Get((Object)(_imenuselected))));
RDebugUtils.currentLine=851977;
 //BA.debugLineNum = 851977;BA.debugLine="For Each control As Object In lControles";
{
final anywheresoftware.b4a.BA.IterableList group5 = _lcontroles;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_control = group5.Get(index5);
RDebugUtils.currentLine=851978;
 //BA.debugLineNum = 851978;BA.debugLine="CallSubDelayed( control, \"Pause\" )";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,_control,"Pause");
 }
};
RDebugUtils.currentLine=851981;
 //BA.debugLineNum = 851981;BA.debugLine="iMenuSelected  = MenuItem.Id";
_imenuselected = _menuitem.getId();
RDebugUtils.currentLine=851982;
 //BA.debugLineNum = 851982;BA.debugLine="Select MenuItem.Id";
switch (BA.switchObjectToInt(_menuitem.getId(),(int) (1),(int) (2),(int) (3),(int) (4),(int) (5))) {
case 0: {
RDebugUtils.currentLine=851984;
 //BA.debugLineNum = 851984;BA.debugLine="newPanel = Panel1";
_newpanel = mostCurrent._panel1;
 break; }
case 1: {
RDebugUtils.currentLine=851986;
 //BA.debugLineNum = 851986;BA.debugLine="newPanel = Panel4";
_newpanel = mostCurrent._panel4;
 break; }
case 2: {
RDebugUtils.currentLine=851988;
 //BA.debugLineNum = 851988;BA.debugLine="newPanel = Panel2";
_newpanel = mostCurrent._panel2;
 break; }
case 3: {
RDebugUtils.currentLine=851990;
 //BA.debugLineNum = 851990;BA.debugLine="newPanel = Panel3";
_newpanel = mostCurrent._panel3;
 break; }
case 4: {
RDebugUtils.currentLine=851992;
 //BA.debugLineNum = 851992;BA.debugLine="newPanel = PanelM";
_newpanel = mostCurrent._panelm;
 break; }
}
;
RDebugUtils.currentLine=851997;
 //BA.debugLineNum = 851997;BA.debugLine="If currentPanel <> newPanel Then";
if ((mostCurrent._currentpanel).equals(_newpanel) == false) { 
RDebugUtils.currentLine=851999;
 //BA.debugLineNum = 851999;BA.debugLine="newPanel.SetVisibleAnimated(0, False)";
_newpanel.SetVisibleAnimated((int) (0),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=852000;
 //BA.debugLineNum = 852000;BA.debugLine="newPanel.BringToFront";
_newpanel.BringToFront();
RDebugUtils.currentLine=852001;
 //BA.debugLineNum = 852001;BA.debugLine="newPanel.SetVisibleAnimated(0, True)";
_newpanel.SetVisibleAnimated((int) (0),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=852002;
 //BA.debugLineNum = 852002;BA.debugLine="currentPanel = newPanel";
mostCurrent._currentpanel = _newpanel;
RDebugUtils.currentLine=852003;
 //BA.debugLineNum = 852003;BA.debugLine="Update( True )";
_update(anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=852005;
 //BA.debugLineNum = 852005;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4j.object.JavaObject  _getba() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getba"))
	 {return ((anywheresoftware.b4j.object.JavaObject) Debug.delegate(mostCurrent.activityBA, "getba", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
String _cls = "";
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Sub GetBA As JavaObject";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="Dim cls As String = Me";
_cls = BA.ObjectToString(main.getObject());
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="cls = cls.SubString(\"class \".Length)";
_cls = _cls.substring("class ".length());
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="jo.InitializeStatic(cls)";
_jo.InitializeStatic(_cls);
RDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="Return jo.GetFieldJO(\"processBA\")";
if (true) return _jo.GetFieldJO("processBA");
RDebugUtils.currentLine=786439;
 //BA.debugLineNum = 786439;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4j.object.JavaObject  _getcontext() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getcontext"))
	 {return ((anywheresoftware.b4j.object.JavaObject) Debug.delegate(mostCurrent.activityBA, "getcontext", null));}
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Sub GetContext As JavaObject";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Return GetBA.GetField(\"context\")";
if (true) return (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_getba().GetField("context")));
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="End Sub";
return null;
}
public static String  _init_drawer2() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "init_drawer2"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "init_drawer2", null));}
de.amberhome.objects.appcompat.ACMenuItemWrapper _actionviewitem = null;
de.amberhome.objects.appcompat.ACSpinnerWrapper _menuhz = null;
de.amberhome.objects.appcompat.ACSubMenuWrapper _submenu = null;
int _i = 0;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
String _pagename = "";
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Sub init_drawer2";
RDebugUtils.currentLine=393236;
 //BA.debugLineNum = 393236;BA.debugLine="NavDrawer.NavigationView.LoadLayout( \"navheaderLa";
mostCurrent._navdrawer.getNavigationView().LoadLayout(mostCurrent.activityBA,"navheaderLayout.bal",mostCurrent._navdrawer.getDefaultHeaderHeight());
RDebugUtils.currentLine=393241;
 //BA.debugLineNum = 393241;BA.debugLine="NavDrawer.NavigationView.Menu.AddWithGroup2(1, 1,";
mostCurrent._navdrawer.getNavigationView().getMenu().AddWithGroup2((int) (1),(int) (1),(int) (1),BA.ObjectToCharSequence("Home"),mostCurrent._xml.GetDrawable("ic_home_black_24dp")).setChecked(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=393245;
 //BA.debugLineNum = 393245;BA.debugLine="Dim actionViewItem As ACMenuItem";
_actionviewitem = new de.amberhome.objects.appcompat.ACMenuItemWrapper();
RDebugUtils.currentLine=393247;
 //BA.debugLineNum = 393247;BA.debugLine="actionViewItem = NavDrawer.NavigationView.Menu.Ad";
_actionviewitem = mostCurrent._navdrawer.getNavigationView().getMenu().AddWithGroup2((int) (1),(int) (2),(int) (2),BA.ObjectToCharSequence("A Switch"),mostCurrent._xml.GetDrawable("ic_android_black_24dp"));
RDebugUtils.currentLine=393249;
 //BA.debugLineNum = 393249;BA.debugLine="sw_gyro.Initialize(\"switch\")";
mostCurrent._sw_gyro.Initialize(mostCurrent.activityBA,"switch");
RDebugUtils.currentLine=393252;
 //BA.debugLineNum = 393252;BA.debugLine="actionViewItem.ActionView = sw_gyro";
_actionviewitem.setActionView((android.view.View)(mostCurrent._sw_gyro.getObject()));
RDebugUtils.currentLine=393255;
 //BA.debugLineNum = 393255;BA.debugLine="NavDrawer.NavigationView.Menu.SetGroupCheckable(1";
mostCurrent._navdrawer.getNavigationView().getMenu().SetGroupCheckable((int) (1),anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=393257;
 //BA.debugLineNum = 393257;BA.debugLine="actionViewItem.Checkable = False";
_actionviewitem.setCheckable(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393259;
 //BA.debugLineNum = 393259;BA.debugLine="actionViewItem = NavDrawer.NavigationView.Menu.Ad";
_actionviewitem = mostCurrent._navdrawer.getNavigationView().getMenu().AddWithGroup2((int) (1),(int) (2),(int) (3),BA.ObjectToCharSequence("Menu"),mostCurrent._xml.GetDrawable("ic_android_black_24dp"));
RDebugUtils.currentLine=393260;
 //BA.debugLineNum = 393260;BA.debugLine="Dim menuHz As ACSpinner";
_menuhz = new de.amberhome.objects.appcompat.ACSpinnerWrapper();
RDebugUtils.currentLine=393261;
 //BA.debugLineNum = 393261;BA.debugLine="menuHz.Initialize(\"menuHz\")";
_menuhz.Initialize(mostCurrent.activityBA,"menuHz");
RDebugUtils.currentLine=393262;
 //BA.debugLineNum = 393262;BA.debugLine="menuHz.Add(\"1Hz\")";
_menuhz.Add(BA.ObjectToCharSequence("1Hz"));
RDebugUtils.currentLine=393263;
 //BA.debugLineNum = 393263;BA.debugLine="menuHz.Add(\"1Hz\")";
_menuhz.Add(BA.ObjectToCharSequence("1Hz"));
RDebugUtils.currentLine=393264;
 //BA.debugLineNum = 393264;BA.debugLine="menuHz.Add(\"1Hz\")";
_menuhz.Add(BA.ObjectToCharSequence("1Hz"));
RDebugUtils.currentLine=393265;
 //BA.debugLineNum = 393265;BA.debugLine="actionViewItem.ActionView = menuHz";
_actionviewitem.setActionView((android.view.View)(_menuhz.getObject()));
RDebugUtils.currentLine=393266;
 //BA.debugLineNum = 393266;BA.debugLine="actionViewItem.Checkable = False";
_actionviewitem.setCheckable(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393269;
 //BA.debugLineNum = 393269;BA.debugLine="NavDrawer.NavigationView.Menu.AddWithGroup2(2, 10";
mostCurrent._navdrawer.getNavigationView().getMenu().AddWithGroup2((int) (2),(int) (10),(int) (1000),BA.ObjectToCharSequence("Settings"),mostCurrent._xml.GetDrawable("ic_settings_black_24dp"));
RDebugUtils.currentLine=393270;
 //BA.debugLineNum = 393270;BA.debugLine="NavDrawer.NavigationView.Menu.AddWithGroup2(2, 11";
mostCurrent._navdrawer.getNavigationView().getMenu().AddWithGroup2((int) (2),(int) (11),(int) (1100),BA.ObjectToCharSequence("Feedback"),mostCurrent._xml.GetDrawable("ic_feedback_black_24dp"));
RDebugUtils.currentLine=393271;
 //BA.debugLineNum = 393271;BA.debugLine="NavDrawer.NavigationView.Menu.AddWithGroup2(2, 12";
mostCurrent._navdrawer.getNavigationView().getMenu().AddWithGroup2((int) (2),(int) (12),(int) (1200),BA.ObjectToCharSequence("Help"),mostCurrent._xml.GetDrawable("ic_help_black_24dp"));
RDebugUtils.currentLine=393272;
 //BA.debugLineNum = 393272;BA.debugLine="NavDrawer.NavigationView.Menu.SetGroupCheckable(2";
mostCurrent._navdrawer.getNavigationView().getMenu().SetGroupCheckable((int) (2),anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=393275;
 //BA.debugLineNum = 393275;BA.debugLine="NavDrawer.AddSecondaryDrawer(150dip, NavDrawer.GR";
mostCurrent._navdrawer.AddSecondaryDrawer(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (150)),mostCurrent._navdrawer.GRAVITY_END);
RDebugUtils.currentLine=393278;
 //BA.debugLineNum = 393278;BA.debugLine="NavDrawer.SecondaryNavigationView.LoadLayout(\"nav";
mostCurrent._navdrawer.getSecondaryNavigationView().LoadLayout(mostCurrent.activityBA,"navHeaderLayout2",anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)));
RDebugUtils.currentLine=393280;
 //BA.debugLineNum = 393280;BA.debugLine="NavDrawer.SecondaryNavigationView.LoadLayout(\"nav";
mostCurrent._navdrawer.getSecondaryNavigationView().LoadLayout(mostCurrent.activityBA,"navHeaderLayout2",anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
RDebugUtils.currentLine=393284;
 //BA.debugLineNum = 393284;BA.debugLine="NavDrawer.SecondaryNavigationView.ItemIconColor =";
mostCurrent._navdrawer.getSecondaryNavigationView().setItemIconColor(anywheresoftware.b4a.keywords.Common.Colors.Red);
RDebugUtils.currentLine=393285;
 //BA.debugLineNum = 393285;BA.debugLine="NavDrawer.SecondaryNavigationView.SetItemTextColo";
mostCurrent._navdrawer.getSecondaryNavigationView().SetItemTextColors(anywheresoftware.b4a.keywords.Common.Colors.Gray,anywheresoftware.b4a.keywords.Common.Colors.Red,anywheresoftware.b4a.keywords.Common.Colors.Red,anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=393290;
 //BA.debugLineNum = 393290;BA.debugLine="Dim subMenu As ACSubMenu";
_submenu = new de.amberhome.objects.appcompat.ACSubMenuWrapper();
RDebugUtils.currentLine=393291;
 //BA.debugLineNum = 393291;BA.debugLine="subMenu = NavDrawer.SecondaryNavigationView.Menu.";
_submenu = mostCurrent._navdrawer.getSecondaryNavigationView().getMenu().AddSubMenu((int) (3),(int) (20),(int) (20),BA.ObjectToCharSequence("Pages"));
RDebugUtils.currentLine=393293;
 //BA.debugLineNum = 393293;BA.debugLine="For i = 0 To 2";
{
final int step28 = 1;
final int limit28 = (int) (2);
_i = (int) (0) ;
for (;_i <= limit28 ;_i = _i + step28 ) {
RDebugUtils.currentLine=393295;
 //BA.debugLineNum = 393295;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=393296;
 //BA.debugLineNum = 393296;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=393297;
 //BA.debugLineNum = 393297;BA.debugLine="p.Color = Colors.RGB(Rnd(0,256), Rnd(0,256), Rnd";
_p.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB(anywheresoftware.b4a.keywords.Common.Rnd((int) (0),(int) (256)),anywheresoftware.b4a.keywords.Common.Rnd((int) (0),(int) (256)),anywheresoftware.b4a.keywords.Common.Rnd((int) (0),(int) (256))));
RDebugUtils.currentLine=393298;
 //BA.debugLineNum = 393298;BA.debugLine="Dim pageName As String";
_pagename = "";
RDebugUtils.currentLine=393299;
 //BA.debugLineNum = 393299;BA.debugLine="pageName = \"Page \" & i";
_pagename = "Page "+BA.NumberToString(_i);
RDebugUtils.currentLine=393301;
 //BA.debugLineNum = 393301;BA.debugLine="subMenu.AddWithGroup2(3, 100+i, 100+i, pageName,";
_submenu.AddWithGroup2((int) (3),(int) (100+_i),(int) (100+_i),BA.ObjectToCharSequence(_pagename),mostCurrent._xml.GetDrawable("ic_bookmark_black_24dp"));
 }
};
RDebugUtils.currentLine=393303;
 //BA.debugLineNum = 393303;BA.debugLine="NavDrawer.SecondaryNavigationView.CheckedItem = 1";
mostCurrent._navdrawer.getSecondaryNavigationView().setCheckedItem((int) (100));
RDebugUtils.currentLine=393304;
 //BA.debugLineNum = 393304;BA.debugLine="subMenu.SetGroupCheckable(3, True, True)";
_submenu.SetGroupCheckable((int) (3),anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=393305;
 //BA.debugLineNum = 393305;BA.debugLine="End Sub";
return "";
}
public static String  _init_messages() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "init_messages"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "init_messages", null));}
int _result = 0;
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Sub init_messages";
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="If Starter.bleEnabled = False Then";
if (mostCurrent._starter._bleenabled==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="Try";
try {RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="bluetoothAd";
_bluetoothad();
RDebugUtils.currentLine=1114117;
 //BA.debugLineNum = 1114117;BA.debugLine="btn_bt.Enabled = False";
mostCurrent._btn_bt.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1114118;
 //BA.debugLineNum = 1114118;BA.debugLine="olBleEnabled = False";
_olbleenabled = anywheresoftware.b4a.keywords.Common.False;
 } 
       catch (Exception e7) {
			processBA.setLastException(e7);RDebugUtils.currentLine=1114120;
 //BA.debugLineNum = 1114120;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 };
 }else {
RDebugUtils.currentLine=1114123;
 //BA.debugLineNum = 1114123;BA.debugLine="Try";
try {RDebugUtils.currentLine=1114124;
 //BA.debugLineNum = 1114124;BA.debugLine="If olBleEnabled = False Then 'evitamos que este";
if (_olbleenabled==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=1114125;
 //BA.debugLineNum = 1114125;BA.debugLine="btn_bt.Enabled = True";
mostCurrent._btn_bt.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1114126;
 //BA.debugLineNum = 1114126;BA.debugLine="olBleEnabled = True";
_olbleenabled = anywheresoftware.b4a.keywords.Common.True;
 };
 } 
       catch (Exception e16) {
			processBA.setLastException(e16);RDebugUtils.currentLine=1114129;
 //BA.debugLineNum = 1114129;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 };
 };
RDebugUtils.currentLine=1114133;
 //BA.debugLineNum = 1114133;BA.debugLine="Try";
try {RDebugUtils.currentLine=1114134;
 //BA.debugLineNum = 1114134;BA.debugLine="If Starter.gps1Enabled = False And rp.Check(rp.P";
if (mostCurrent._starter._gps1enabled==anywheresoftware.b4a.keywords.Common.False && _rp.Check(_rp.PERMISSION_ACCESS_FINE_LOCATION) && _olbleenabled==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=1114135;
 //BA.debugLineNum = 1114135;BA.debugLine="locationAd";
_locationad();
 };
 } 
       catch (Exception e24) {
			processBA.setLastException(e24);RDebugUtils.currentLine=1114138;
 //BA.debugLineNum = 1114138;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 };
RDebugUtils.currentLine=1114141;
 //BA.debugLineNum = 1114141;BA.debugLine="Try";
try {RDebugUtils.currentLine=1114142;
 //BA.debugLineNum = 1114142;BA.debugLine="If Not ( kvs.ContainsKey( \"first_time\" ) ) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_kvs._containskey(null,"first_time"))) { 
RDebugUtils.currentLine=1114143;
 //BA.debugLineNum = 1114143;BA.debugLine="Dim result As Int";
_result = 0;
RDebugUtils.currentLine=1114144;
 //BA.debugLineNum = 1114144;BA.debugLine="result = Msgbox2( \"Please, let the app to colle";
_result = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Please, let the app to collect some information about the app usage. All information is anonimous"+anywheresoftware.b4a.keywords.Common.CRLF+"Do you allow the app to send us reports?"),BA.ObjectToCharSequence("Feedback"),"Yes","","No",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=1114145;
 //BA.debugLineNum = 1114145;BA.debugLine="If result = DialogResponse.POSITIVE Then";
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=1114146;
 //BA.debugLineNum = 1114146;BA.debugLine="Starter.allowReport = True";
mostCurrent._starter._allowreport = anywheresoftware.b4a.keywords.Common.True;
 }else {
RDebugUtils.currentLine=1114148;
 //BA.debugLineNum = 1114148;BA.debugLine="Starter.allowReport = False";
mostCurrent._starter._allowreport = anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=1114150;
 //BA.debugLineNum = 1114150;BA.debugLine="kvs.PutSimple( \"first_time\" , Starter.allowRepo";
_kvs._putsimple(null,"first_time",(Object)(mostCurrent._starter._allowreport));
 }else {
RDebugUtils.currentLine=1114152;
 //BA.debugLineNum = 1114152;BA.debugLine="Starter.allowReport = IntToBool(kvs.GetSimple(\"";
mostCurrent._starter._allowreport = _inttobool[(int)(Double.parseDouble(_kvs._getsimple(null,"first_time")))];
 };
 } 
       catch (Exception e40) {
			processBA.setLastException(e40);RDebugUtils.currentLine=1114155;
 //BA.debugLineNum = 1114155;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 };
RDebugUtils.currentLine=1114157;
 //BA.debugLineNum = 1114157;BA.debugLine="End Sub";
return "";
}
public static String  _locationad() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "locationad"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "locationad", null));}
int _result = 0;
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Sub locationAd";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="Dim result As Int";
_result = 0;
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="result = Msgbox2( \"Location is disabled. Do you w";
_result = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Location is disabled. Do you want to enable it?"),BA.ObjectToCharSequence("Advise"),"Yes","","No",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="If result = DialogResponse.POSITIVE Then";
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="NativeMe.RunMethod(\"enableLocation\", Null)";
_nativeme.RunMethod("enableLocation",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
 }else {
RDebugUtils.currentLine=2424838;
 //BA.debugLineNum = 2424838;BA.debugLine="Msgbox(\"Please, enable location to allow using G";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please, enable location to allow using GPS"),BA.ObjectToCharSequence("Location service"),mostCurrent.activityBA);
 };
RDebugUtils.currentLine=2424840;
 //BA.debugLineNum = 2424840;BA.debugLine="End Sub";
return "";
}
public static String  _navdrawer_drawerclosed(int _drawergravity) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "navdrawer_drawerclosed"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "navdrawer_drawerclosed", new Object[] {_drawergravity}));}
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Sub NavDrawer_DrawerClosed (DrawerGravity As Int)";
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="End Sub";
return "";
}
public static String  _navdrawer_draweropened(int _drawergravity) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "navdrawer_draweropened"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "navdrawer_draweropened", new Object[] {_drawergravity}));}
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Sub NavDrawer_DrawerOpened (DrawerGravity As Int)";
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="UpdateDrawer";
_updatedrawer();
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="End Sub";
return "";
}
public static String  _navdrawer_drawerslide(float _position,int _drawergravity) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "navdrawer_drawerslide"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "navdrawer_drawerslide", new Object[] {_position,_drawergravity}));}
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Sub NavDrawer_DrawerSlide (Position As Float, Draw";
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="End Sub";
return "";
}
public static String  _navdrawer_navigationitemselected(de.amberhome.objects.appcompat.ACMenuItemWrapper _menuitem,int _drawergravity) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "navdrawer_navigationitemselected"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "navdrawer_navigationitemselected", new Object[] {_menuitem,_drawergravity}));}
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Sub NavDrawer_NavigationItemSelected (MenuItem As";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="LogColor(\"NavItem selected: \" & MenuItem.Title, C";
anywheresoftware.b4a.keywords.Common.LogColor("NavItem selected: "+_menuitem.getTitle(),anywheresoftware.b4a.keywords.Common.Colors.Green);
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="Log(MenuItem.Id )";
anywheresoftware.b4a.keywords.Common.Log(BA.NumberToString(_menuitem.getId()));
RDebugUtils.currentLine=1638407;
 //BA.debugLineNum = 1638407;BA.debugLine="If MenuItem.Id = 2 Then";
if (_menuitem.getId()==2) { 
RDebugUtils.currentLine=1638408;
 //BA.debugLineNum = 1638408;BA.debugLine="sw_gyro.Checked = Not(sw_gyro.Checked)";
mostCurrent._sw_gyro.setChecked(anywheresoftware.b4a.keywords.Common.Not(mostCurrent._sw_gyro.getChecked()));
RDebugUtils.currentLine=1638409;
 //BA.debugLineNum = 1638409;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=1638418;
 //BA.debugLineNum = 1638418;BA.debugLine="NavDrawer.CloseDrawer2(DrawerGravity)";
mostCurrent._navdrawer.CloseDrawer2(_drawergravity);
RDebugUtils.currentLine=1638419;
 //BA.debugLineNum = 1638419;BA.debugLine="End Sub";
return "";
}
public static String  _off_btn_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "off_btn_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "off_btn_click", null));}
int _result = 0;
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Sub off_btn_Click";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="NavDrawer.CloseDrawers";
mostCurrent._navdrawer.CloseDrawers();
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="Dim result As Int";
_result = 0;
RDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="result = Msgbox2( \"This function changes the offs";
_result = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("This function changes the offset of the compass. Use it only if you need to modify the bearing. Do you wish to continue?"),BA.ObjectToCharSequence("Compass offset"),"Yes","","No",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=2621445;
 //BA.debugLineNum = 2621445;BA.debugLine="If result = DialogResponse.NEGATIVE Then Return";
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.NEGATIVE) { 
if (true) return "";};
RDebugUtils.currentLine=2621458;
 //BA.debugLineNum = 2621458;BA.debugLine="touchpanel.BringToFront";
mostCurrent._touchpanel.BringToFront();
RDebugUtils.currentLine=2621459;
 //BA.debugLineNum = 2621459;BA.debugLine="btnDis.Visible = True";
mostCurrent._btndis.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2621460;
 //BA.debugLineNum = 2621460;BA.debugLine="offname_lbl.Visible = True";
mostCurrent._offname_lbl.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2621461;
 //BA.debugLineNum = 2621461;BA.debugLine="offset_lbl.Visible = True";
mostCurrent._offset_lbl.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2621462;
 //BA.debugLineNum = 2621462;BA.debugLine="offset_lbl.Text = NumberFormat( offset_angle, 1,";
mostCurrent._offset_lbl.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat(_offset_angle,(int) (1),(int) (0))+"°"));
RDebugUtils.currentLine=2621463;
 //BA.debugLineNum = 2621463;BA.debugLine="sw_realnorth.Visible = True";
mostCurrent._sw_realnorth.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2621465;
 //BA.debugLineNum = 2621465;BA.debugLine="edit_tags(tag_list, 0xFFFFFF, 10dip, 0dip, 0xFF00";
_edit_tags(mostCurrent._tag_list,(int) (0xffffff),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),(int) (0xff000000),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2621467;
 //BA.debugLineNum = 2621467;BA.debugLine="End Sub";
return "";
}
public static String  _remove_secondary_drawer() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "remove_secondary_drawer"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "remove_secondary_drawer", null));}
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub remove_secondary_drawer";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="pnl_equipment.RemoveAllViews";
mostCurrent._pnl_equipment.RemoveAllViews();
RDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="End Sub";
return "";
}
public static String  _sp_hz_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sp_hz_itemclick"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "sp_hz_itemclick", new Object[] {_position,_value}));}
String _str = "";
anywheresoftware.b4a.agraham.byteconverter.ByteConverter _bc = null;
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Sub sp_Hz_ItemClick (Position As Int, Value As Obj";
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="If Position = 0 Then";
if (_position==0) { 
RDebugUtils.currentLine=1769475;
 //BA.debugLineNum = 1769475;BA.debugLine="Dim str = \"01\" As String";
_str = "01";
RDebugUtils.currentLine=1769476;
 //BA.debugLineNum = 1769476;BA.debugLine="Starter.calcs_1.refresh_hz = 1.0";
mostCurrent._starter._calcs_1._refresh_hz = (float) (1.0);
 }else 
{RDebugUtils.currentLine=1769477;
 //BA.debugLineNum = 1769477;BA.debugLine="Else If Position = 1 Then";
if (_position==1) { 
RDebugUtils.currentLine=1769478;
 //BA.debugLineNum = 1769478;BA.debugLine="Dim str = \"04\" As String";
_str = "04";
RDebugUtils.currentLine=1769479;
 //BA.debugLineNum = 1769479;BA.debugLine="Starter.calcs_1.refresh_hz = 4.0";
mostCurrent._starter._calcs_1._refresh_hz = (float) (4.0);
 }else {
RDebugUtils.currentLine=1769481;
 //BA.debugLineNum = 1769481;BA.debugLine="Dim str = \"08\" As String";
_str = "08";
RDebugUtils.currentLine=1769482;
 //BA.debugLineNum = 1769482;BA.debugLine="Starter.calcs_1.refresh_hz = 8.0";
mostCurrent._starter._calcs_1._refresh_hz = (float) (8.0);
 }}
;
RDebugUtils.currentLine=1769484;
 //BA.debugLineNum = 1769484;BA.debugLine="Starter.calcs_1.mean_checked( Starter.calcs_1.mea";
mostCurrent._starter._calcs_1._mean_checked(null,mostCurrent._starter._calcs_1._mean_sw);
RDebugUtils.currentLine=1769485;
 //BA.debugLineNum = 1769485;BA.debugLine="Dim bc As ByteConverter";
_bc = new anywheresoftware.b4a.agraham.byteconverter.ByteConverter();
RDebugUtils.currentLine=1769486;
 //BA.debugLineNum = 1769486;BA.debugLine="bc.LittleEndian = True";
_bc.setLittleEndian(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1769487;
 //BA.debugLineNum = 1769487;BA.debugLine="If Starter.connected And Starter.deviceType = 2 T";
if (mostCurrent._starter._connected && mostCurrent._starter._devicetype==2) { 
RDebugUtils.currentLine=1769488;
 //BA.debugLineNum = 1769488;BA.debugLine="Starter.Scan.WriteData( Starter.sUltra, Starter.";
mostCurrent._starter._scan.WriteData(mostCurrent._starter._sultra,mostCurrent._starter._crate,_bc.HexToBytes(_str));
RDebugUtils.currentLine=1769489;
 //BA.debugLineNum = 1769489;BA.debugLine="Starter.Scan.ReadData2( Starter.sUltra, Starter.";
mostCurrent._starter._scan.ReadData2(mostCurrent._starter._sultra,mostCurrent._starter._crate);
 };
RDebugUtils.currentLine=1769491;
 //BA.debugLineNum = 1769491;BA.debugLine="End Sub";
return "";
}
public static String  _sp_period_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sp_period_itemclick"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "sp_period_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Sub sp_period_ItemClick (Position As Int, Value As";
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="If Position = 0 Then";
if (_position==0) { 
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="Starter.Timer_sqlite.Interval = 1000";
mostCurrent._starter._timer_sqlite.setInterval((long) (1000));
 }else 
{RDebugUtils.currentLine=1703940;
 //BA.debugLineNum = 1703940;BA.debugLine="Else If Position = 1 Then";
if (_position==1) { 
RDebugUtils.currentLine=1703941;
 //BA.debugLineNum = 1703941;BA.debugLine="Starter.Timer_sqlite.Interval = 60000";
mostCurrent._starter._timer_sqlite.setInterval((long) (60000));
 }else {
RDebugUtils.currentLine=1703943;
 //BA.debugLineNum = 1703943;BA.debugLine="Starter.Timer_sqlite.Interval = 300000";
mostCurrent._starter._timer_sqlite.setInterval((long) (300000));
 }}
;
RDebugUtils.currentLine=1703945;
 //BA.debugLineNum = 1703945;BA.debugLine="End Sub";
return "";
}
public static String  _sw_gyro_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sw_gyro_checkedchange"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "sw_gyro_checkedchange", new Object[] {_checked}));}
anywheresoftware.b4a.agraham.byteconverter.ByteConverter _bc = null;
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Sub sw_gyro_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="Dim bc As ByteConverter";
_bc = new anywheresoftware.b4a.agraham.byteconverter.ByteConverter();
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="bc.LittleEndian = True";
_bc.setLittleEndian(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="If Starter.connected Then";
if (mostCurrent._starter._connected) { 
RDebugUtils.currentLine=1900549;
 //BA.debugLineNum = 1900549;BA.debugLine="If Checked Then";
if (_checked) { 
RDebugUtils.currentLine=1900550;
 //BA.debugLineNum = 1900550;BA.debugLine="Starter.Scan.WriteData( Starter.sUltra, Starter";
mostCurrent._starter._scan.WriteData(mostCurrent._starter._sultra,mostCurrent._starter._csensors,_bc.HexToBytes("01"));
 }else {
RDebugUtils.currentLine=1900552;
 //BA.debugLineNum = 1900552;BA.debugLine="Starter.Scan.WriteData( Starter.sUltra, Starter";
mostCurrent._starter._scan.WriteData(mostCurrent._starter._sultra,mostCurrent._starter._csensors,_bc.HexToBytes("00"));
 };
RDebugUtils.currentLine=1900554;
 //BA.debugLineNum = 1900554;BA.debugLine="gyroEnabled = Checked";
_gyroenabled = _checked;
 };
RDebugUtils.currentLine=1900556;
 //BA.debugLineNum = 1900556;BA.debugLine="End Sub";
return "";
}
public static String  _sw_mean_checkedchanged(boolean _checked) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sw_mean_checkedchanged"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "sw_mean_checkedchanged", new Object[] {_checked}));}
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Sub sw_mean_CheckedChanged( Checked As Boolean )";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="Log(\"mean\"&Checked)";
anywheresoftware.b4a.keywords.Common.Log("mean"+BA.ObjectToString(_checked));
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="Starter.calcs_1.mean_checked( Checked )";
mostCurrent._starter._calcs_1._mean_checked(null,_checked);
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="End Sub";
return "";
}
public static String  _sw_nmea_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sw_nmea_checkedchange"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "sw_nmea_checkedchange", new Object[] {_checked}));}
anywheresoftware.b4a.agraham.byteconverter.ByteConverter _bc = null;
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Sub sw_nmea_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="Log(\"sw_nmea \"&Checked)";
anywheresoftware.b4a.keywords.Common.Log("sw_nmea "+BA.ObjectToString(_checked));
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="Dim bc As ByteConverter";
_bc = new anywheresoftware.b4a.agraham.byteconverter.ByteConverter();
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="bc.LittleEndian = True";
_bc.setLittleEndian(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2031620;
 //BA.debugLineNum = 2031620;BA.debugLine="If Starter.connected Then";
if (mostCurrent._starter._connected) { 
RDebugUtils.currentLine=2031621;
 //BA.debugLineNum = 2031621;BA.debugLine="If Checked Then";
if (_checked) { 
RDebugUtils.currentLine=2031622;
 //BA.debugLineNum = 2031622;BA.debugLine="Starter.Scan.WriteData( Starter.sUltra, Starter";
mostCurrent._starter._scan.WriteData(mostCurrent._starter._sultra,mostCurrent._starter._cnmea,_bc.HexToBytes("01"));
 }else {
RDebugUtils.currentLine=2031624;
 //BA.debugLineNum = 2031624;BA.debugLine="Starter.Scan.WriteData( Starter.sUltra, Starter";
mostCurrent._starter._scan.WriteData(mostCurrent._starter._sultra,mostCurrent._starter._cnmea,_bc.HexToBytes("00"));
 };
 };
RDebugUtils.currentLine=2031627;
 //BA.debugLineNum = 2031627;BA.debugLine="End Sub";
return "";
}
public static String  _sw_realnorth_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sw_realnorth_checkedchange"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "sw_realnorth_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Sub sw_realnorth_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="If Checked Then";
if (_checked) { 
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="dec = verDeclinacion";
_dec = _verdeclinacion();
RDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="offset_angle = offset_angle + dec";
_offset_angle = _offset_angle+_dec;
RDebugUtils.currentLine=2752516;
 //BA.debugLineNum = 2752516;BA.debugLine="ToastMessageShow(\"Mag declination: \" & dec, True";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Mag declination: "+BA.NumberToString(_dec)),anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=2752518;
 //BA.debugLineNum = 2752518;BA.debugLine="offset_angle = offset_angle - dec";
_offset_angle = _offset_angle-_dec;
RDebugUtils.currentLine=2752519;
 //BA.debugLineNum = 2752519;BA.debugLine="ToastMessageShow(\"Set to Magnetic North\", True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Set to Magnetic North"),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=2752521;
 //BA.debugLineNum = 2752521;BA.debugLine="End Sub";
return "";
}
public static float  _verdeclinacion() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "verdeclinacion"))
	 {return ((Float) Debug.delegate(mostCurrent.activityBA, "verdeclinacion", null));}
long _millis = 0L;
anywheresoftware.b4j.object.JavaObject _bo = null;
float _heading = 0f;
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Sub verDeclinacion As Float";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="Dim millis As Long = NativeMe.RunMethod(\"getTimeM";
_millis = BA.ObjectToLongNumber(_nativeme.RunMethod("getTimeMillis",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="Dim bo As JavaObject";
_bo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=2228228;
 //BA.debugLineNum = 2228228;BA.debugLine="bo.InitializeNewInstance(\"android.hardware.Geomag";
_bo.InitializeNewInstance("android.hardware.GeomagneticField",new Object[]{(Object)(mostCurrent._starter._calcs_1._latitude),(Object)(mostCurrent._starter._calcs_1._longitude),(Object)(mostCurrent._starter._calcs_1._altitude),(Object)(_millis)});
RDebugUtils.currentLine=2228229;
 //BA.debugLineNum = 2228229;BA.debugLine="Dim heading As Float = bo.RunMethod(\"getDeclinati";
_heading = (float)(BA.ObjectToNumber(_bo.RunMethod("getDeclination",(Object[])(anywheresoftware.b4a.keywords.Common.Null))));
RDebugUtils.currentLine=2228231;
 //BA.debugLineNum = 2228231;BA.debugLine="Return heading";
if (true) return _heading;
RDebugUtils.currentLine=2228232;
 //BA.debugLineNum = 2228232;BA.debugLine="End Sub";
return 0f;
}
public static void  _sw_track_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sw_track_checkedchange"))
	 {Debug.delegate(mostCurrent.activityBA, "sw_track_checkedchange", new Object[] {_checked}); return;}
ResumableSub_sw_track_CheckedChange rsub = new ResumableSub_sw_track_CheckedChange(null,_checked);
rsub.resume(processBA, null);
}
public static class ResumableSub_sw_track_CheckedChange extends BA.ResumableSub {
public ResumableSub_sw_track_CheckedChange(com.calypsoinstruments.anemotracker.main parent,boolean _checked) {
this.parent = parent;
this._checked = _checked;
}
com.calypsoinstruments.anemotracker.main parent;
boolean _checked;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="Log(\"sw_track \"&Checked)";
anywheresoftware.b4a.keywords.Common.Log("sw_track "+BA.ObjectToString(_checked));
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="If Starter.navigation = 0 Then";
if (true) break;

case 1:
//if
this.state = 22;
if (parent.mostCurrent._starter._navigation==0) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=1966083;
 //BA.debugLineNum = 1966083;BA.debugLine="If Checked Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_checked) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=1966084;
 //BA.debugLineNum = 1966084;BA.debugLine="StartActivity( actListTracks )";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._actlisttracks.getObject()));
 if (true) break;

case 7:
//C
this.state = 22;
;
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=1966088;
 //BA.debugLineNum = 1966088;BA.debugLine="If Checked Then";
if (true) break;

case 10:
//if
this.state = 21;
if (_checked) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 21;
RDebugUtils.currentLine=1966089;
 //BA.debugLineNum = 1966089;BA.debugLine="CallSubDelayed3( Starter, \"start_nav\", Starter.";
anywheresoftware.b4a.keywords.Common.CallSubDelayed3(processBA,(Object)(parent.mostCurrent._starter.getObject()),"start_nav",(Object)(parent.mostCurrent._starter._navigation),(Object)(new String[]{BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Null),BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Null)}));
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=1966091;
 //BA.debugLineNum = 1966091;BA.debugLine="Dim result As Int";
_result = 0;
RDebugUtils.currentLine=1966092;
 //BA.debugLineNum = 1966092;BA.debugLine="result = Msgbox2( \"Track: \" & Starter.nav_name,";
_result = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Track: "+parent.mostCurrent._starter._nav_name),BA.ObjectToCharSequence("Stop Tracking? "),"Yes","","No",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=1966095;
 //BA.debugLineNum = 1966095;BA.debugLine="If result = DialogResponse.POSITIVE Then";
if (true) break;

case 15:
//if
this.state = 20;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 17;
}else {
this.state = 19;
}if (true) break;

case 17:
//C
this.state = 20;
RDebugUtils.currentLine=1966096;
 //BA.debugLineNum = 1966096;BA.debugLine="CallSubDelayed( Starter, \"stop_nav\" )";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(parent.mostCurrent._starter.getObject()),"stop_nav");
RDebugUtils.currentLine=1966097;
 //BA.debugLineNum = 1966097;BA.debugLine="Starter.navigation = 0";
parent.mostCurrent._starter._navigation = (int) (0);
RDebugUtils.currentLine=1966100;
 //BA.debugLineNum = 1966100;BA.debugLine="sw_track.Checked = False";
parent.mostCurrent._sw_track.setChecked(anywheresoftware.b4a.keywords.Common.False);
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
RDebugUtils.currentLine=1966106;
 //BA.debugLineNum = 1966106;BA.debugLine="Sleep(200)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "sw_track_checkedchange"),(int) (200));
this.state = 23;
return;
case 23:
//C
this.state = -1;
;
RDebugUtils.currentLine=1966107;
 //BA.debugLineNum = 1966107;BA.debugLine="UpdateDrawer";
_updatedrawer();
RDebugUtils.currentLine=1966108;
 //BA.debugLineNum = 1966108;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _touchpanel_touch(int _action,float _x,float _y) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "touchpanel_touch"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "touchpanel_touch", new Object[] {_action,_x,_y}));}
int _xc = 0;
int _yc = 0;
double _cop = 0;
double _ccon = 0;
double _angulo = 0;
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Sub touchpanel_Touch (Action As Int, X As Float, Y";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="Private Xc,Yc As Int";
_xc = 0;
_yc = 0;
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="Private cOp, Ccon As Double";
_cop = 0;
_ccon = 0;
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="Dim angulo As Double";
_angulo = 0;
RDebugUtils.currentLine=2490373;
 //BA.debugLineNum = 2490373;BA.debugLine="Xc = touchpanel.Left+touchpanel.Width/2";
_xc = (int) (mostCurrent._touchpanel.getLeft()+mostCurrent._touchpanel.getWidth()/(double)2);
RDebugUtils.currentLine=2490374;
 //BA.debugLineNum = 2490374;BA.debugLine="Yc = touchpanel.top+touchpanel.Height/2";
_yc = (int) (mostCurrent._touchpanel.getTop()+mostCurrent._touchpanel.getHeight()/(double)2);
RDebugUtils.currentLine=2490375;
 //BA.debugLineNum = 2490375;BA.debugLine="Ccon = X - Xc";
_ccon = _x-_xc;
RDebugUtils.currentLine=2490376;
 //BA.debugLineNum = 2490376;BA.debugLine="cOp = Y -Yc";
_cop = _y-_yc;
RDebugUtils.currentLine=2490377;
 //BA.debugLineNum = 2490377;BA.debugLine="angulo = ATan2D(cOp, Ccon) + 90";
_angulo = anywheresoftware.b4a.keywords.Common.ATan2D(_cop,_ccon)+90;
RDebugUtils.currentLine=2490378;
 //BA.debugLineNum = 2490378;BA.debugLine="If angulo < 0 Then angulo = 360 + angulo";
if (_angulo<0) { 
_angulo = 360+_angulo;};
RDebugUtils.currentLine=2490380;
 //BA.debugLineNum = 2490380;BA.debugLine="If Action = Activity.ACTION_MOVE And DateTime.Now";
if (_action==mostCurrent._activity.ACTION_MOVE && anywheresoftware.b4a.keywords.Common.DateTime.getNow()-500>_ttouch) { 
RDebugUtils.currentLine=2490381;
 //BA.debugLineNum = 2490381;BA.debugLine="Log(\"angulo: \" & angulo)";
anywheresoftware.b4a.keywords.Common.Log("angulo: "+BA.NumberToString(_angulo));
RDebugUtils.currentLine=2490382;
 //BA.debugLineNum = 2490382;BA.debugLine="offset_angle = (angulo - startAngle) - offstart_";
_offset_angle = (_angulo-_startangle)-_offstart_ang+_offset_angle;
RDebugUtils.currentLine=2490383;
 //BA.debugLineNum = 2490383;BA.debugLine="offstart_ang = (angulo - startAngle)";
_offstart_ang = (_angulo-_startangle);
RDebugUtils.currentLine=2490384;
 //BA.debugLineNum = 2490384;BA.debugLine="If Not(moveTouch) Then moveTouch = True";
if (anywheresoftware.b4a.keywords.Common.Not(_movetouch)) { 
_movetouch = anywheresoftware.b4a.keywords.Common.True;};
 }else 
{RDebugUtils.currentLine=2490386;
 //BA.debugLineNum = 2490386;BA.debugLine="Else If Action = Activity.ACTION_UP And moveTouch";
if (_action==mostCurrent._activity.ACTION_UP && _movetouch==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=2490387;
 //BA.debugLineNum = 2490387;BA.debugLine="If Ccon > 0 Then 'click derecha";
if (_ccon>0) { 
RDebugUtils.currentLine=2490388;
 //BA.debugLineNum = 2490388;BA.debugLine="Log(\"click drch\")";
anywheresoftware.b4a.keywords.Common.Log("click drch");
RDebugUtils.currentLine=2490389;
 //BA.debugLineNum = 2490389;BA.debugLine="offset_angle = offset_angle + 1";
_offset_angle = _offset_angle+1;
 }else {
RDebugUtils.currentLine=2490391;
 //BA.debugLineNum = 2490391;BA.debugLine="Log(\"click izq\")";
anywheresoftware.b4a.keywords.Common.Log("click izq");
RDebugUtils.currentLine=2490392;
 //BA.debugLineNum = 2490392;BA.debugLine="offset_angle = offset_angle - 1";
_offset_angle = _offset_angle-1;
 };
 }else 
{RDebugUtils.currentLine=2490395;
 //BA.debugLineNum = 2490395;BA.debugLine="Else If Action = Activity.ACTION_DOWN Then";
if (_action==mostCurrent._activity.ACTION_DOWN) { 
RDebugUtils.currentLine=2490396;
 //BA.debugLineNum = 2490396;BA.debugLine="tTouch = DateTime.Now";
_ttouch = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
RDebugUtils.currentLine=2490397;
 //BA.debugLineNum = 2490397;BA.debugLine="moveTouch = False";
_movetouch = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=2490398;
 //BA.debugLineNum = 2490398;BA.debugLine="startAngle = angulo";
_startangle = _angulo;
RDebugUtils.currentLine=2490399;
 //BA.debugLineNum = 2490399;BA.debugLine="offstart_ang = 0";
_offstart_ang = 0;
 }}}
;
RDebugUtils.currentLine=2490402;
 //BA.debugLineNum = 2490402;BA.debugLine="offset_lbl.Text = NumberFormat( offset_angle, 1,";
mostCurrent._offset_lbl.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat(_offset_angle,(int) (1),(int) (0))+"°"));
RDebugUtils.currentLine=2490403;
 //BA.debugLineNum = 2490403;BA.debugLine="End Sub";
return "";
}
public long getTimeMillis() {
   return System.currentTimeMillis();
}

public void enableLocation(){
	final android.location.LocationManager manager = (android.location.LocationManager) getSystemService(android.content.Context.LOCATION_SERVICE);
	if (!manager.isProviderEnabled(android.location.LocationManager.GPS_PROVIDER)) {
		android.content.Intent intent = new android.content.Intent(android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS);
        startActivity(intent);
	}
}

//Habilita el bluetooth dentro de la app
public boolean setBluetooth() {
    android.bluetooth.BluetoothAdapter bluetoothAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
    boolean isEnabled = bluetoothAdapter.isEnabled();

    if (!isEnabled) {
		//activamos location tambien
		enableLocation();
        return bluetoothAdapter.enable();
    }
    // No need to change bluetooth state
    return true;
}
}