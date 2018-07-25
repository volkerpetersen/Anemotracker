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

public class actble extends android.support.v7.app.AppCompatActivity implements B4AActivity{
	public static actble mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = true;
	public static final boolean includeTitle = true;
    public static WeakReference<Activity> previousOne;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "com.calypsoinstruments.anemotracker", "com.calypsoinstruments.anemotracker.actble");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (actble).");
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
		activityBA = new BA(this, layout, processBA, "com.calypsoinstruments.anemotracker", "com.calypsoinstruments.anemotracker.actble");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "com.calypsoinstruments.anemotracker.actble", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (actble) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (actble) Resume **");
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
		return actble.class;
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
        BA.LogInfo("** Activity (actble) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            actble mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (actble) Resume **");
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
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.collections.Map _cs = null;
public static anywheresoftware.b4a.objects.collections.Map _cc = null;
public static anywheresoftware.b4a.objects.collections.Map _devices = null;
public static anywheresoftware.b4a.objects.collections.List _ldevices = null;
public de.amberhome.objects.appcompat.ACToolbarLightWrapper _toolbar = null;
public anywheresoftware.b4a.objects.ListViewWrapper _clv = null;
public de.amberhome.objects.FloatingActionButtonWrapper _fab1 = null;
public com.calypsoinstruments.anemotracker.main _main = null;
public com.calypsoinstruments.anemotracker.actlisttracks _actlisttracks = null;
public com.calypsoinstruments.anemotracker.actnavigation _actnavigation = null;
public com.calypsoinstruments.anemotracker.acttcpip _acttcpip = null;
public com.calypsoinstruments.anemotracker.starter _starter = null;
public com.calypsoinstruments.anemotracker.dbutils _dbutils = null;
public com.calypsoinstruments.anemotracker.actcalcomp _actcalcomp = null;
public com.calypsoinstruments.anemotracker.actdevinfo _actdevinfo = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="actble";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
anywheresoftware.b4a.object.XmlLayoutBuilder _xml = null;
de.amberhome.objects.appcompat.AppCompatBase _ac = null;
anywheresoftware.b4a.objects.drawable.BitmapDrawable _bmp = null;
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="devices.Initialize";
_devices.Initialize();
RDebugUtils.currentLine=3014661;
 //BA.debugLineNum = 3014661;BA.debugLine="lDevices.Initialize";
_ldevices.Initialize();
RDebugUtils.currentLine=3014663;
 //BA.debugLineNum = 3014663;BA.debugLine="Dim xml As XmlLayoutBuilder";
_xml = new anywheresoftware.b4a.object.XmlLayoutBuilder();
RDebugUtils.currentLine=3014664;
 //BA.debugLineNum = 3014664;BA.debugLine="Activity.Initialize(\"Activity\")";
mostCurrent._activity.Initialize(mostCurrent.activityBA,"Activity");
RDebugUtils.currentLine=3014665;
 //BA.debugLineNum = 3014665;BA.debugLine="Activity.Title = \"BLE Connection\"";
mostCurrent._activity.setTitle(BA.ObjectToCharSequence("BLE Connection"));
RDebugUtils.currentLine=3014667;
 //BA.debugLineNum = 3014667;BA.debugLine="toolbar.Initialize(\"tb\")";
mostCurrent._toolbar.Initialize(mostCurrent.activityBA,"tb");
RDebugUtils.currentLine=3014668;
 //BA.debugLineNum = 3014668;BA.debugLine="toolbar.SubTitle = \"Select bluetooth device to co";
mostCurrent._toolbar.setSubTitle(BA.ObjectToCharSequence("Select bluetooth device to connect"));
RDebugUtils.currentLine=3014669;
 //BA.debugLineNum = 3014669;BA.debugLine="toolbar.Title = \"Ble connection\"";
mostCurrent._toolbar.setTitle(BA.ObjectToCharSequence("Ble connection"));
RDebugUtils.currentLine=3014670;
 //BA.debugLineNum = 3014670;BA.debugLine="toolbar.SetAsActionBar";
mostCurrent._toolbar.SetAsActionBar(mostCurrent.activityBA);
RDebugUtils.currentLine=3014672;
 //BA.debugLineNum = 3014672;BA.debugLine="toolbar.NavigationIconBitmap = LoadBitmap( File.D";
mostCurrent._toolbar.setNavigationIconBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"bt.png").getObject()));
RDebugUtils.currentLine=3014675;
 //BA.debugLineNum = 3014675;BA.debugLine="Dim AC As AppCompat";
_ac = new de.amberhome.objects.appcompat.AppCompatBase();
RDebugUtils.currentLine=3014676;
 //BA.debugLineNum = 3014676;BA.debugLine="AC.SetElevation(toolbar, 8dip)";
_ac.SetElevation((android.view.View)(mostCurrent._toolbar.getObject()),(float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (8))));
RDebugUtils.currentLine=3014678;
 //BA.debugLineNum = 3014678;BA.debugLine="Activity.AddView( toolbar, 0%x, 0%y, 100%x, 55dip";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._toolbar.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (0),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (0),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (55)));
RDebugUtils.currentLine=3014680;
 //BA.debugLineNum = 3014680;BA.debugLine="clv.Initialize( \"clv\" )";
mostCurrent._clv.Initialize(mostCurrent.activityBA,"clv");
RDebugUtils.currentLine=3014681;
 //BA.debugLineNum = 3014681;BA.debugLine="Activity.AddView( clv, 0%x, 55dip, 100%x,100%y-55";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._clv.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (0),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (55)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),(int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (55))));
RDebugUtils.currentLine=3014684;
 //BA.debugLineNum = 3014684;BA.debugLine="Dim xml As XmlLayoutBuilder";
_xml = new anywheresoftware.b4a.object.XmlLayoutBuilder();
RDebugUtils.currentLine=3014685;
 //BA.debugLineNum = 3014685;BA.debugLine="fab1.Initialize( \"Fab1\" )";
mostCurrent._fab1.Initialize(mostCurrent.activityBA,"Fab1");
RDebugUtils.currentLine=3014686;
 //BA.debugLineNum = 3014686;BA.debugLine="Activity.AddView( fab1, Activity.Width-70dip, Act";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._fab1.getObject()),(int) (mostCurrent._activity.getWidth()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (70))),(int) (mostCurrent._activity.getHeight()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (70))),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (55)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (55)));
RDebugUtils.currentLine=3014688;
 //BA.debugLineNum = 3014688;BA.debugLine="Dim bmp As BitmapDrawable";
_bmp = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=3014689;
 //BA.debugLineNum = 3014689;BA.debugLine="bmp.Initialize( LoadBitmapResize( File.DirAssets,";
_bmp.Initialize((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmapResize(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"connection.png",(int) (256),(int) (256),anywheresoftware.b4a.keywords.Common.True).getObject()));
RDebugUtils.currentLine=3014690;
 //BA.debugLineNum = 3014690;BA.debugLine="bmp.Gravity = Gravity.FILL";
_bmp.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.FILL);
RDebugUtils.currentLine=3014691;
 //BA.debugLineNum = 3014691;BA.debugLine="fab1.SetIcon( bmp )";
mostCurrent._fab1.SetIcon((android.graphics.drawable.Drawable)(_bmp.getObject()));
RDebugUtils.currentLine=3014698;
 //BA.debugLineNum = 3014698;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="actble";
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=3276803;
 //BA.debugLineNum = 3276803;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="actble";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="clv.Clear";
mostCurrent._clv.Clear();
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="clv.Invalidate";
mostCurrent._clv.Invalidate();
RDebugUtils.currentLine=3145733;
 //BA.debugLineNum = 3145733;BA.debugLine="SearchBLE(False)";
_searchble(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3145734;
 //BA.debugLineNum = 3145734;BA.debugLine="End Sub";
return "";
}
public static String  _searchble(boolean _test) throws Exception{
RDebugUtils.currentModule="actble";
if (Debug.shouldDelegate(mostCurrent.activityBA, "searchble"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "searchble", new Object[] {_test}));}
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Sub SearchBLE(test As Boolean)";
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="devices.Initialize";
_devices.Initialize();
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="clv.Clear";
mostCurrent._clv.Clear();
RDebugUtils.currentLine=3080196;
 //BA.debugLineNum = 3080196;BA.debugLine="clv.Invalidate";
mostCurrent._clv.Invalidate();
RDebugUtils.currentLine=3080197;
 //BA.debugLineNum = 3080197;BA.debugLine="Activity.Invalidate";
mostCurrent._activity.Invalidate();
RDebugUtils.currentLine=3080198;
 //BA.debugLineNum = 3080198;BA.debugLine="toolbar.Title = \"Searching\"";
mostCurrent._toolbar.setTitle(BA.ObjectToCharSequence("Searching"));
RDebugUtils.currentLine=3080199;
 //BA.debugLineNum = 3080199;BA.debugLine="fab1.Hide";
mostCurrent._fab1.Hide();
RDebugUtils.currentLine=3080202;
 //BA.debugLineNum = 3080202;BA.debugLine="CallSubDelayed(Starter, \"ble_Scan\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(mostCurrent._starter.getObject()),"ble_Scan");
RDebugUtils.currentLine=3080203;
 //BA.debugLineNum = 3080203;BA.debugLine="End Sub";
return "";
}
public static String  _actv_end(String _mac) throws Exception{
RDebugUtils.currentModule="actble";
if (Debug.shouldDelegate(mostCurrent.activityBA, "actv_end"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "actv_end", new Object[] {_mac}));}
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Sub Actv_End( mac As String )";
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=3211267;
 //BA.debugLineNum = 3211267;BA.debugLine="Return";
if (true) return "";
RDebugUtils.currentLine=3211310;
 //BA.debugLineNum = 3211310;BA.debugLine="End Sub";
return "";
}
public static String  _addtolistrt() throws Exception{
RDebugUtils.currentModule="actble";
if (Debug.shouldDelegate(mostCurrent.activityBA, "addtolistrt"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "addtolistrt", null));}
Object _dev = null;
com.calypsoinstruments.anemotracker.starter._tultra _ultra = null;
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Sub addToListRT";
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="lDevices.Clear";
_ldevices.Clear();
RDebugUtils.currentLine=3342339;
 //BA.debugLineNum = 3342339;BA.debugLine="clv.Clear";
mostCurrent._clv.Clear();
RDebugUtils.currentLine=3342340;
 //BA.debugLineNum = 3342340;BA.debugLine="For Each dev In Starter.devices.Values";
{
final anywheresoftware.b4a.BA.IterableList group3 = mostCurrent._starter._devices.Values();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_dev = group3.Get(index3);
RDebugUtils.currentLine=3342341;
 //BA.debugLineNum = 3342341;BA.debugLine="lDevices.Add( dev )";
_ldevices.Add(_dev);
 }
};
RDebugUtils.currentLine=3342343;
 //BA.debugLineNum = 3342343;BA.debugLine="lDevices.SortType( \"RSSI\", False )";
_ldevices.SortType("RSSI",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3342346;
 //BA.debugLineNum = 3342346;BA.debugLine="For Each ultra As tUltra In lDevices";
{
final anywheresoftware.b4a.BA.IterableList group7 = _ldevices;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_ultra = (com.calypsoinstruments.anemotracker.starter._tultra)(group7.Get(index7));
RDebugUtils.currentLine=3342347;
 //BA.debugLineNum = 3342347;BA.debugLine="clv.AddTwoLines2( ultra.Name , ultra.MacAddress";
mostCurrent._clv.AddTwoLines2(BA.ObjectToCharSequence(_ultra.Name),BA.ObjectToCharSequence(_ultra.MacAddress+" rssi: "+BA.NumberToString(_ultra.RSSI)),(Object)(_ultra));
RDebugUtils.currentLine=3342348;
 //BA.debugLineNum = 3342348;BA.debugLine="clv.TwoLinesLayout.Label.TextColor = Colors.Blac";
mostCurrent._clv.getTwoLinesLayout().Label.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 }
};
RDebugUtils.currentLine=3342350;
 //BA.debugLineNum = 3342350;BA.debugLine="End Sub";
return "";
}
public static String  _clv_itemclick(int _position,com.calypsoinstruments.anemotracker.starter._tultra _ultra) throws Exception{
RDebugUtils.currentModule="actble";
if (Debug.shouldDelegate(mostCurrent.activityBA, "clv_itemclick"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "clv_itemclick", new Object[] {_position,_ultra}));}
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Sub clv_ItemClick (Position As Int, ultra As tUltr";
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="Starter.Scan.StopScan";
mostCurrent._starter._scan.StopScan();
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="If Starter.connected Then";
if (mostCurrent._starter._connected) { 
RDebugUtils.currentLine=3473411;
 //BA.debugLineNum = 3473411;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 }else {
RDebugUtils.currentLine=3473414;
 //BA.debugLineNum = 3473414;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=3473415;
 //BA.debugLineNum = 3473415;BA.debugLine="Log( ultra )";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_ultra));
RDebugUtils.currentLine=3473416;
 //BA.debugLineNum = 3473416;BA.debugLine="clv.Enabled = False";
mostCurrent._clv.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3473419;
 //BA.debugLineNum = 3473419;BA.debugLine="Starter.actual_ultra = ultra";
mostCurrent._starter._actual_ultra = _ultra;
RDebugUtils.currentLine=3473420;
 //BA.debugLineNum = 3473420;BA.debugLine="ToastMessageShow( \"Trying to connecto to \" & ult";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Trying to connecto to "+_ultra.MacAddress),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3473421;
 //BA.debugLineNum = 3473421;BA.debugLine="If ultra.Name.StartsWith(\"CUPS\") Then";
if (_ultra.Name.startsWith("CUPS")) { 
RDebugUtils.currentLine=3473422;
 //BA.debugLineNum = 3473422;BA.debugLine="Starter.deviceType = 1";
mostCurrent._starter._devicetype = (int) (1);
 }else 
{RDebugUtils.currentLine=3473423;
 //BA.debugLineNum = 3473423;BA.debugLine="else if ultra.Name.StartsWith(\"ULTRA\") Then";
if (_ultra.Name.startsWith("ULTRA")) { 
RDebugUtils.currentLine=3473424;
 //BA.debugLineNum = 3473424;BA.debugLine="Starter.deviceType = 2";
mostCurrent._starter._devicetype = (int) (2);
 }else 
{RDebugUtils.currentLine=3473425;
 //BA.debugLineNum = 3473425;BA.debugLine="else if ultra.Name.StartsWith(\"NMEA\") Then";
if (_ultra.Name.startsWith("NMEA")) { 
RDebugUtils.currentLine=3473426;
 //BA.debugLineNum = 3473426;BA.debugLine="Starter.deviceType = 3";
mostCurrent._starter._devicetype = (int) (3);
 }}}
;
RDebugUtils.currentLine=3473429;
 //BA.debugLineNum = 3473429;BA.debugLine="CallSubDelayed2( Starter, \"ConnectBle\", ultra )";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._starter.getObject()),"ConnectBle",(Object)(_ultra));
RDebugUtils.currentLine=3473430;
 //BA.debugLineNum = 3473430;BA.debugLine="Starter.uId = ultra.macaddress";
mostCurrent._starter._uid = _ultra.MacAddress;
RDebugUtils.currentLine=3473431;
 //BA.debugLineNum = 3473431;BA.debugLine="CallSubDelayed(Main, \"Connecting\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(mostCurrent._main.getObject()),"Connecting");
 };
RDebugUtils.currentLine=3473433;
 //BA.debugLineNum = 3473433;BA.debugLine="End Sub";
return "";
}
public static String  _discoveryfinished2() throws Exception{
RDebugUtils.currentModule="actble";
if (Debug.shouldDelegate(mostCurrent.activityBA, "discoveryfinished2"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "discoveryfinished2", null));}
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Sub DiscoveryFinished2";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="fab1.Show";
mostCurrent._fab1.Show();
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="End Sub";
return "";
}
public static String  _fab1_click() throws Exception{
RDebugUtils.currentModule="actble";
if (Debug.shouldDelegate(mostCurrent.activityBA, "fab1_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "fab1_click", null));}
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Sub Fab1_Click";
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="SearchBLE(False)";
_searchble(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="End Sub";
return "";
}
}