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

public class acttcpip extends Activity implements B4AActivity{
	public static acttcpip mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = true;
    public static WeakReference<Activity> previousOne;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "com.calypsoinstruments.anemotracker", "com.calypsoinstruments.anemotracker.acttcpip");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (acttcpip).");
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
		activityBA = new BA(this, layout, processBA, "com.calypsoinstruments.anemotracker", "com.calypsoinstruments.anemotracker.acttcpip");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "com.calypsoinstruments.anemotracker.acttcpip", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (acttcpip) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (acttcpip) Resume **");
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
		return acttcpip.class;
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
        BA.LogInfo("** Activity (acttcpip) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            acttcpip mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (acttcpip) Resume **");
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
public static anywheresoftware.b4a.objects.SocketWrapper _socket1 = null;
public static anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper _serversocket1 = null;
public static anywheresoftware.b4a.randomaccessfile.AsyncStreams _astreams = null;
public static anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _outputstream1 = null;
public static anywheresoftware.b4a.agraham.byteconverter.ByteConverter _conv = null;
public static anywheresoftware.b4a.objects.Timer _timer1 = null;
public static String _myip = "";
public static String _serverip = "";
public static String _istr = "";
public anywheresoftware.b4a.objects.LabelWrapper _lblconnect = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnconnect = null;
public anywheresoftware.b4a.objects.ListViewWrapper _lvlog = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmsg = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp_background = null;
public wifi.MLwifi.MLWifiScanner _mls = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _sp_wifi = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txt_pass = null;
public static int _ap_index = 0;
public anywheresoftware.b4a.objects.collections.JSONParser _jsonrcv = null;
public static boolean _isconfigu = false;
public com.calypsoinstruments.anemotracker.main _main = null;
public com.calypsoinstruments.anemotracker.actble _actble = null;
public com.calypsoinstruments.anemotracker.actlisttracks _actlisttracks = null;
public com.calypsoinstruments.anemotracker.actnavigation _actnavigation = null;
public com.calypsoinstruments.anemotracker.starter _starter = null;
public com.calypsoinstruments.anemotracker.dbutils _dbutils = null;
public com.calypsoinstruments.anemotracker.actcalcomp _actcalcomp = null;
public com.calypsoinstruments.anemotracker.actdevinfo _actdevinfo = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="acttcpip";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=5242883;
 //BA.debugLineNum = 5242883;BA.debugLine="Activity.LoadLayout(\"tcp\")";
mostCurrent._activity.LoadLayout("tcp",mostCurrent.activityBA);
RDebugUtils.currentLine=5242884;
 //BA.debugLineNum = 5242884;BA.debugLine="btnConnect.Enabled = False";
mostCurrent._btnconnect.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=5242887;
 //BA.debugLineNum = 5242887;BA.debugLine="lvLog.SingleLineLayout.ItemHeight = 16dip";
mostCurrent._lvlog.getSingleLineLayout().setItemHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (16)));
RDebugUtils.currentLine=5242888;
 //BA.debugLineNum = 5242888;BA.debugLine="lvLog.SingleLineLayout.Label.TextSize = 12";
mostCurrent._lvlog.getSingleLineLayout().Label.setTextSize((float) (12));
RDebugUtils.currentLine=5242889;
 //BA.debugLineNum = 5242889;BA.debugLine="MyIP = ServerSocket1.GetMyIP";
_myip = _serversocket1.GetMyIP();
RDebugUtils.currentLine=5242890;
 //BA.debugLineNum = 5242890;BA.debugLine="lblConnect.Text = MyIP";
mostCurrent._lblconnect.setText(BA.ObjectToCharSequence(_myip));
RDebugUtils.currentLine=5242892;
 //BA.debugLineNum = 5242892;BA.debugLine="If FirstTime = True Then";
if (_firsttime==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=5242893;
 //BA.debugLineNum = 5242893;BA.debugLine="btnConnect_Click";
_btnconnect_click();
 };
RDebugUtils.currentLine=5242896;
 //BA.debugLineNum = 5242896;BA.debugLine="bmp_background = LoadBitmapResize( File.DirAssets";
mostCurrent._bmp_background = anywheresoftware.b4a.keywords.Common.LoadBitmapResize(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"Textura fibra carbono.jpg",(int) (800),(int) (800),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=5242897;
 //BA.debugLineNum = 5242897;BA.debugLine="SetTiledBackground( bmp_background )";
_settiledbackground(mostCurrent._bmp_background);
RDebugUtils.currentLine=5242899;
 //BA.debugLineNum = 5242899;BA.debugLine="End Sub";
return "";
}
public static String  _btnconnect_click() throws Exception{
RDebugUtils.currentModule="acttcpip";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnconnect_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnconnect_click", null));}
RDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="Sub btnConnect_Click";
RDebugUtils.currentLine=5505025;
 //BA.debugLineNum = 5505025;BA.debugLine="Select Case btnConnect.Text";
switch (BA.switchObjectToInt(mostCurrent._btnconnect.getText(),"Connect","Disconnect")) {
case 0: {
RDebugUtils.currentLine=5505027;
 //BA.debugLineNum = 5505027;BA.debugLine="btnConnect.Text = \"Disconnect\"";
mostCurrent._btnconnect.setText(BA.ObjectToCharSequence("Disconnect"));
RDebugUtils.currentLine=5505028;
 //BA.debugLineNum = 5505028;BA.debugLine="Socket1.Initialize(\"Socket1\")";
_socket1.Initialize("Socket1");
RDebugUtils.currentLine=5505030;
 //BA.debugLineNum = 5505030;BA.debugLine="Socket1.Connect(\"192.168.4.1\",50000,5000)";
_socket1.Connect(processBA,"192.168.4.1",(int) (50000),(int) (5000));
 break; }
case 1: {
RDebugUtils.currentLine=5505032;
 //BA.debugLineNum = 5505032;BA.debugLine="btnConnect.Text = \"Connect\"";
mostCurrent._btnconnect.setText(BA.ObjectToCharSequence("Connect"));
RDebugUtils.currentLine=5505033;
 //BA.debugLineNum = 5505033;BA.debugLine="Socket1.Close";
_socket1.Close();
 break; }
default: {
 break; }
}
;
RDebugUtils.currentLine=5505037;
 //BA.debugLineNum = 5505037;BA.debugLine="End Sub";
return "";
}
public static String  _settiledbackground(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _b) throws Exception{
RDebugUtils.currentModule="acttcpip";
if (Debug.shouldDelegate(mostCurrent.activityBA, "settiledbackground"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "settiledbackground", new Object[] {_b}));}
anywheresoftware.b4a.objects.drawable.BitmapDrawable _bd = null;
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Sub SetTiledBackground( b As Bitmap)";
RDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="Dim bd As BitmapDrawable";
_bd = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="bd.Initialize(b)";
_bd.Initialize((android.graphics.Bitmap)(_b.getObject()));
RDebugUtils.currentLine=5308420;
 //BA.debugLineNum = 5308420;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=5308421;
 //BA.debugLineNum = 5308421;BA.debugLine="r.Target = bd";
_r.Target = (Object)(_bd.getObject());
RDebugUtils.currentLine=5308422;
 //BA.debugLineNum = 5308422;BA.debugLine="r.RunMethod3(\"setTileModeXY\",\"REPEAT\", \"android.g";
_r.RunMethod3("setTileModeXY","REPEAT","android.graphics.Shader$TileMode","REPEAT","android.graphics.Shader$TileMode");
RDebugUtils.currentLine=5308424;
 //BA.debugLineNum = 5308424;BA.debugLine="Activity.Background = bd";
mostCurrent._activity.setBackground((android.graphics.drawable.Drawable)(_bd.getObject()));
RDebugUtils.currentLine=5308425;
 //BA.debugLineNum = 5308425;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="acttcpip";
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="acttcpip";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="End Sub";
return "";
}
public static String  _astreams_newdata(byte[] _buffer) throws Exception{
RDebugUtils.currentModule="acttcpip";
if (Debug.shouldDelegate(mostCurrent.activityBA, "astreams_newdata"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "astreams_newdata", new Object[] {_buffer}));}
String _msg = "";
String _cmsg = "";
String _t = "";
int _x = 0;
int _unsignedi = 0;
byte _signedb = (byte)0;
anywheresoftware.b4a.objects.collections.Map _mapj = null;
anywheresoftware.b4a.objects.collections.List _ifconfig = null;
boolean _a = false;
int _i = 0;
RDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Sub AStreams_NewData (Buffer() As Byte)";
RDebugUtils.currentLine=5636097;
 //BA.debugLineNum = 5636097;BA.debugLine="Dim msg As String";
_msg = "";
RDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="Dim cMsg As String";
_cmsg = "";
RDebugUtils.currentLine=5636099;
 //BA.debugLineNum = 5636099;BA.debugLine="Dim t As String";
_t = "";
RDebugUtils.currentLine=5636100;
 //BA.debugLineNum = 5636100;BA.debugLine="Dim x As Int";
_x = 0;
RDebugUtils.currentLine=5636101;
 //BA.debugLineNum = 5636101;BA.debugLine="Dim unsignedi As Int";
_unsignedi = 0;
RDebugUtils.currentLine=5636102;
 //BA.debugLineNum = 5636102;BA.debugLine="Dim signedb As Byte";
_signedb = (byte)0;
RDebugUtils.currentLine=5636104;
 //BA.debugLineNum = 5636104;BA.debugLine="msg = BytesToString(Buffer, 0, Buffer.Length, \"AS";
_msg = anywheresoftware.b4a.keywords.Common.BytesToString(_buffer,(int) (0),_buffer.length,"ASCII");
RDebugUtils.currentLine=5636105;
 //BA.debugLineNum = 5636105;BA.debugLine="If isConfigU Then";
if (_isconfigu) { 
RDebugUtils.currentLine=5636106;
 //BA.debugLineNum = 5636106;BA.debugLine="isConfigU = False";
_isconfigu = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=5636107;
 //BA.debugLineNum = 5636107;BA.debugLine="Dim mapJ As Map";
_mapj = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=5636108;
 //BA.debugLineNum = 5636108;BA.debugLine="JSONrcv.Initialize(msg)";
mostCurrent._jsonrcv.Initialize(_msg);
RDebugUtils.currentLine=5636109;
 //BA.debugLineNum = 5636109;BA.debugLine="mapJ = JSONrcv.NextObject";
_mapj = mostCurrent._jsonrcv.NextObject();
RDebugUtils.currentLine=5636110;
 //BA.debugLineNum = 5636110;BA.debugLine="Try";
try {RDebugUtils.currentLine=5636111;
 //BA.debugLineNum = 5636111;BA.debugLine="Dim ifconfig As List";
_ifconfig = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=5636112;
 //BA.debugLineNum = 5636112;BA.debugLine="ifconfig.Initialize";
_ifconfig.Initialize();
RDebugUtils.currentLine=5636113;
 //BA.debugLineNum = 5636113;BA.debugLine="ifconfig = mapJ.Get(\"ifconfig\")";
_ifconfig.setObject((java.util.List)(_mapj.Get((Object)("ifconfig"))));
RDebugUtils.currentLine=5636115;
 //BA.debugLineNum = 5636115;BA.debugLine="Dim a As Boolean = mls.connectWifiAP(ap_index)";
_a = mostCurrent._mls.connectWifiAP(_ap_index);
RDebugUtils.currentLine=5636116;
 //BA.debugLineNum = 5636116;BA.debugLine="If Not(a) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_a)) { 
RDebugUtils.currentLine=5636117;
 //BA.debugLineNum = 5636117;BA.debugLine="ToastMessageShow(\"Unable to connect to wifi\",";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Unable to connect to wifi"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=5636118;
 //BA.debugLineNum = 5636118;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=5636121;
 //BA.debugLineNum = 5636121;BA.debugLine="Socket1.Close";
_socket1.Close();
RDebugUtils.currentLine=5636122;
 //BA.debugLineNum = 5636122;BA.debugLine="Socket1.Initialize(\"Socket1\")";
_socket1.Initialize("Socket1");
RDebugUtils.currentLine=5636123;
 //BA.debugLineNum = 5636123;BA.debugLine="Socket1.Connect(ifconfig.Get(0),50000,5000)";
_socket1.Connect(processBA,BA.ObjectToString(_ifconfig.Get((int) (0))),(int) (50000),(int) (5000));
RDebugUtils.currentLine=5636124;
 //BA.debugLineNum = 5636124;BA.debugLine="ToastMessageShow(\"Done\", True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Done"),anywheresoftware.b4a.keywords.Common.True);
 } 
       catch (Exception e27) {
			processBA.setLastException(e27);RDebugUtils.currentLine=5636126;
 //BA.debugLineNum = 5636126;BA.debugLine="ToastMessageShow(\"Unable to get the ip\", True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Unable to get the ip"),anywheresoftware.b4a.keywords.Common.True);
 };
 };
RDebugUtils.currentLine=5636131;
 //BA.debugLineNum = 5636131;BA.debugLine="lvLog.AddSingleLine (msg)";
mostCurrent._lvlog.AddSingleLine(BA.ObjectToCharSequence(_msg));
RDebugUtils.currentLine=5636132;
 //BA.debugLineNum = 5636132;BA.debugLine="Log(msg)";
anywheresoftware.b4a.keywords.Common.Log(_msg);
RDebugUtils.currentLine=5636133;
 //BA.debugLineNum = 5636133;BA.debugLine="For i = 0 To msg.Length -1";
{
final int step32 = 1;
final int limit32 = (int) (_msg.length()-1);
_i = (int) (0) ;
for (;_i <= limit32 ;_i = _i + step32 ) {
RDebugUtils.currentLine=5636134;
 //BA.debugLineNum = 5636134;BA.debugLine="signedb = Buffer(i)";
_signedb = _buffer[_i];
RDebugUtils.currentLine=5636135;
 //BA.debugLineNum = 5636135;BA.debugLine="unsignedi = Bit.And(0xff, signedb)";
_unsignedi = anywheresoftware.b4a.keywords.Common.Bit.And((int) (0xff),(int) (_signedb));
RDebugUtils.currentLine=5636136;
 //BA.debugLineNum = 5636136;BA.debugLine="cMsg = cMsg & Chr(unsignedi)";
_cmsg = _cmsg+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr(_unsignedi));
 }
};
RDebugUtils.currentLine=5636138;
 //BA.debugLineNum = 5636138;BA.debugLine="lvLog.AddSingleLine(cMsg)";
mostCurrent._lvlog.AddSingleLine(BA.ObjectToCharSequence(_cmsg));
RDebugUtils.currentLine=5636139;
 //BA.debugLineNum = 5636139;BA.debugLine="Log(cMsg)";
anywheresoftware.b4a.keywords.Common.Log(_cmsg);
RDebugUtils.currentLine=5636140;
 //BA.debugLineNum = 5636140;BA.debugLine="lblMsg.Text = x & \" / \" & msg.Length & \" - \" & ms";
mostCurrent._lblmsg.setText(BA.ObjectToCharSequence(BA.NumberToString(_x)+" / "+BA.NumberToString(_msg.length())+" - "+_msg));
RDebugUtils.currentLine=5636145;
 //BA.debugLineNum = 5636145;BA.debugLine="End Sub";
return "";
}
public static void  _btntest_click() throws Exception{
RDebugUtils.currentModule="acttcpip";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btntest_click"))
	 {Debug.delegate(mostCurrent.activityBA, "btntest_click", null); return;}
ResumableSub_btnTest_Click rsub = new ResumableSub_btnTest_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_btnTest_Click extends BA.ResumableSub {
public ResumableSub_btnTest_Click(com.calypsoinstruments.anemotracker.acttcpip parent) {
this.parent = parent;
}
com.calypsoinstruments.anemotracker.acttcpip parent;
anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog _cd = null;
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _dialogpanel = null;
anywheresoftware.b4a.objects.collections.List _lsn = null;
String _s = "";
int _result = 0;
anywheresoftware.b4a.BA.IterableList group11;
int index11;
int groupLen11;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="acttcpip";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=5832705;
 //BA.debugLineNum = 5832705;BA.debugLine="isConfigU = True";
parent._isconfigu = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=5832706;
 //BA.debugLineNum = 5832706;BA.debugLine="Socket1.Close";
parent._socket1.Close();
RDebugUtils.currentLine=5832707;
 //BA.debugLineNum = 5832707;BA.debugLine="Socket1.Initialize(\"Socket1\")";
parent._socket1.Initialize("Socket1");
RDebugUtils.currentLine=5832709;
 //BA.debugLineNum = 5832709;BA.debugLine="Socket1.Connect(\"192.168.4.1\",8000,5000)";
parent._socket1.Connect(processBA,"192.168.4.1",(int) (8000),(int) (5000));
RDebugUtils.currentLine=5832711;
 //BA.debugLineNum = 5832711;BA.debugLine="Dim cd As CustomLayoutDialog";
_cd = new anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog();
RDebugUtils.currentLine=5832712;
 //BA.debugLineNum = 5832712;BA.debugLine="Dim sf As Object = cd.ShowAsync(\"Wifi Connect\", \"";
_sf = _cd.ShowAsync("Wifi Connect","Yes","Cancel","No",mostCurrent.activityBA,(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=5832713;
 //BA.debugLineNum = 5832713;BA.debugLine="cd.SetSize(100%x, 400dip)";
_cd.SetSize(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (400)));
RDebugUtils.currentLine=5832714;
 //BA.debugLineNum = 5832714;BA.debugLine="Wait For (sf) Dialog_Ready (DialogPanel As Panel)";
anywheresoftware.b4a.keywords.Common.WaitFor("dialog_ready", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "acttcpip", "btntest_click"), _sf);
this.state = 9;
return;
case 9:
//C
this.state = 1;
_dialogpanel = (anywheresoftware.b4a.objects.PanelWrapper) result[0];
;
RDebugUtils.currentLine=5832715;
 //BA.debugLineNum = 5832715;BA.debugLine="DialogPanel.LoadLayout(\"wifi_dlg\")";
_dialogpanel.LoadLayout("wifi_dlg",mostCurrent.activityBA);
RDebugUtils.currentLine=5832716;
 //BA.debugLineNum = 5832716;BA.debugLine="Dim lsn As List = mls.listSavedNetworks";
_lsn = new anywheresoftware.b4a.objects.collections.List();
_lsn.setObject((java.util.List)(parent.mostCurrent._mls.listSavedNetworks()));
RDebugUtils.currentLine=5832717;
 //BA.debugLineNum = 5832717;BA.debugLine="For Each s As String In lsn";
if (true) break;

case 1:
//for
this.state = 4;
group11 = _lsn;
index11 = 0;
groupLen11 = group11.getSize();
this.state = 10;
if (true) break;

case 10:
//C
this.state = 4;
if (index11 < groupLen11) {
this.state = 3;
_s = BA.ObjectToString(group11.Get(index11));}
if (true) break;

case 11:
//C
this.state = 10;
index11++;
if (true) break;

case 3:
//C
this.state = 11;
RDebugUtils.currentLine=5832718;
 //BA.debugLineNum = 5832718;BA.debugLine="sp_wifi.Add(s.SubString2(1,s.IndexOf(\"\"\",\"))) 'n";
parent.mostCurrent._sp_wifi.Add(_s.substring((int) (1),_s.indexOf("\",")));
 if (true) break;
if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=5832721;
 //BA.debugLineNum = 5832721;BA.debugLine="Wait For (sf) Dialog_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("dialog_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "acttcpip", "btntest_click"), _sf);
this.state = 12;
return;
case 12:
//C
this.state = 5;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=5832722;
 //BA.debugLineNum = 5832722;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 5:
//if
this.state = 8;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=5832724;
 //BA.debugLineNum = 5832724;BA.debugLine="ap_index = sp_wifi.SelectedIndex";
parent._ap_index = parent.mostCurrent._sp_wifi.getSelectedIndex();
RDebugUtils.currentLine=5832725;
 //BA.debugLineNum = 5832725;BA.debugLine="SendData(jsonEdit(sp_wifi.SelectedItem,txt_pass.";
_senddata(_jsonedit(parent.mostCurrent._sp_wifi.getSelectedItem(),parent.mostCurrent._txt_pass.getText()));
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=5832729;
 //BA.debugLineNum = 5832729;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _senddata(String _msg) throws Exception{
RDebugUtils.currentModule="acttcpip";
if (Debug.shouldDelegate(mostCurrent.activityBA, "senddata"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "senddata", new Object[] {_msg}));}
byte[] _buffer = null;
RDebugUtils.currentLine=5767168;
 //BA.debugLineNum = 5767168;BA.debugLine="Sub SendData(msg As String)";
RDebugUtils.currentLine=5767169;
 //BA.debugLineNum = 5767169;BA.debugLine="Dim Buffer() As Byte";
_buffer = new byte[(int) (0)];
;
RDebugUtils.currentLine=5767171;
 //BA.debugLineNum = 5767171;BA.debugLine="Buffer = msg.GetBytes(\"UTF8\")";
_buffer = _msg.getBytes("UTF8");
RDebugUtils.currentLine=5767172;
 //BA.debugLineNum = 5767172;BA.debugLine="AStreams.Write(Buffer)";
_astreams.Write(_buffer);
RDebugUtils.currentLine=5767173;
 //BA.debugLineNum = 5767173;BA.debugLine="AStreams.Write(Array As Byte(1024))";
_astreams.Write(new byte[]{(byte) (1024)});
RDebugUtils.currentLine=5767175;
 //BA.debugLineNum = 5767175;BA.debugLine="End Sub";
return "";
}
public static String  _jsonedit(String _cssid,String _cpass) throws Exception{
RDebugUtils.currentModule="acttcpip";
if (Debug.shouldDelegate(mostCurrent.activityBA, "jsonedit"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "jsonedit", new Object[] {_cssid,_cpass}));}
anywheresoftware.b4a.objects.collections.JSONParser _json = null;
anywheresoftware.b4a.objects.collections.Map _map1 = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jsongenerator = null;
String _str_json = "";
RDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Sub jsonEdit (cSSID As String, cPass As String) As";
RDebugUtils.currentLine=5701633;
 //BA.debugLineNum = 5701633;BA.debugLine="Dim JSON As JSONParser";
_json = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="Dim Map1 As Map";
_map1 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=5701635;
 //BA.debugLineNum = 5701635;BA.debugLine="JSON.Initialize(\"{\"\"essid\"\": \"\"a\"\", \"\"pass\"\": \"\"b";
_json.Initialize("{\"essid\": \"a\", \"pass\": \"b\"}");
RDebugUtils.currentLine=5701636;
 //BA.debugLineNum = 5701636;BA.debugLine="Map1 = JSON.NextObject";
_map1 = _json.NextObject();
RDebugUtils.currentLine=5701637;
 //BA.debugLineNum = 5701637;BA.debugLine="Map1.Put(\"essid\", cSSID)";
_map1.Put((Object)("essid"),(Object)(_cssid));
RDebugUtils.currentLine=5701638;
 //BA.debugLineNum = 5701638;BA.debugLine="Map1.Put(\"pass\", cPass)";
_map1.Put((Object)("pass"),(Object)(_cpass));
RDebugUtils.currentLine=5701641;
 //BA.debugLineNum = 5701641;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=5701642;
 //BA.debugLineNum = 5701642;BA.debugLine="JSONGenerator.Initialize(Map1)";
_jsongenerator.Initialize(_map1);
RDebugUtils.currentLine=5701643;
 //BA.debugLineNum = 5701643;BA.debugLine="Dim str_json As String = JSONGenerator.ToString &";
_str_json = _jsongenerator.ToString()+anywheresoftware.b4a.keywords.Common.CRLF;
RDebugUtils.currentLine=5701644;
 //BA.debugLineNum = 5701644;BA.debugLine="Msgbox(str_json, \"\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence(_str_json),BA.ObjectToCharSequence(""),mostCurrent.activityBA);
RDebugUtils.currentLine=5701646;
 //BA.debugLineNum = 5701646;BA.debugLine="Return str_json";
if (true) return _str_json;
RDebugUtils.currentLine=5701647;
 //BA.debugLineNum = 5701647;BA.debugLine="End Sub";
return "";
}
public static String  _close_click() throws Exception{
RDebugUtils.currentModule="acttcpip";
if (Debug.shouldDelegate(mostCurrent.activityBA, "close_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "close_click", null));}
RDebugUtils.currentLine=5898240;
 //BA.debugLineNum = 5898240;BA.debugLine="Sub close_Click";
RDebugUtils.currentLine=5898241;
 //BA.debugLineNum = 5898241;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=5898242;
 //BA.debugLineNum = 5898242;BA.debugLine="End Sub";
return "";
}
public static boolean  _socket1_connected(boolean _connected) throws Exception{
RDebugUtils.currentModule="acttcpip";
if (Debug.shouldDelegate(mostCurrent.activityBA, "socket1_connected"))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "socket1_connected", new Object[] {_connected}));}
RDebugUtils.currentLine=5570560;
 //BA.debugLineNum = 5570560;BA.debugLine="Sub Socket1_Connected(Connected As Boolean)As Bool";
RDebugUtils.currentLine=5570561;
 //BA.debugLineNum = 5570561;BA.debugLine="If Connected = True Then";
if (_connected==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="ToastMessageShow(\"Connected\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Connected"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=5570563;
 //BA.debugLineNum = 5570563;BA.debugLine="lvLog.AddSingleLine(\"Connected!\")";
mostCurrent._lvlog.AddSingleLine(BA.ObjectToCharSequence("Connected!"));
RDebugUtils.currentLine=5570564;
 //BA.debugLineNum = 5570564;BA.debugLine="AStreams.Initialize(Socket1.InputStream,Socket1.";
_astreams.Initialize(processBA,_socket1.getInputStream(),_socket1.getOutputStream(),"Astreams");
 }else {
RDebugUtils.currentLine=5570566;
 //BA.debugLineNum = 5570566;BA.debugLine="ToastMessageShow(\"Server not available\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Server not available"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=5570567;
 //BA.debugLineNum = 5570567;BA.debugLine="lvLog.AddSingleLine(\"Server not available\")";
mostCurrent._lvlog.AddSingleLine(BA.ObjectToCharSequence("Server not available"));
RDebugUtils.currentLine=5570568;
 //BA.debugLineNum = 5570568;BA.debugLine="btnConnect.Text = \"Connect\"";
mostCurrent._btnconnect.setText(BA.ObjectToCharSequence("Connect"));
 };
RDebugUtils.currentLine=5570570;
 //BA.debugLineNum = 5570570;BA.debugLine="btnConnect.Enabled = True";
mostCurrent._btnconnect.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=5570571;
 //BA.debugLineNum = 5570571;BA.debugLine="End Sub";
return false;
}
}