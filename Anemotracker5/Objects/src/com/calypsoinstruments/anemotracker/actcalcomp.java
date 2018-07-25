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

public class actcalcomp extends android.support.v7.app.AppCompatActivity implements B4AActivity{
	public static actcalcomp mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "com.calypsoinstruments.anemotracker", "com.calypsoinstruments.anemotracker.actcalcomp");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (actcalcomp).");
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
		activityBA = new BA(this, layout, processBA, "com.calypsoinstruments.anemotracker", "com.calypsoinstruments.anemotracker.actcalcomp");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "com.calypsoinstruments.anemotracker.actcalcomp", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (actcalcomp) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (actcalcomp) Resume **");
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
		return actcalcomp.class;
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
        BA.LogInfo("** Activity (actcalcomp) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            actcalcomp mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (actcalcomp) Resume **");
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
public static int _vueltas = 0;
public static boolean _isnew = false;
public static int _secs = 0;
public anywheresoftware.b4a.objects.ImageViewWrapper _img_tutorial = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_messages = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_vueltas = null;
public anywheresoftware.b4a.objects.LabelWrapper _test_lbl = null;
public anywheresoftware.b4a.objects.ButtonWrapper _add_btn = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_abr = null;
public de.amberhome.objects.appcompat.ACToolbarLightWrapper _toolbar = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp_background = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _tuto = null;
public com.calypsoinstruments.anemotracker.main _main = null;
public com.calypsoinstruments.anemotracker.actble _actble = null;
public com.calypsoinstruments.anemotracker.actlisttracks _actlisttracks = null;
public com.calypsoinstruments.anemotracker.actnavigation _actnavigation = null;
public com.calypsoinstruments.anemotracker.acttcpip _acttcpip = null;
public com.calypsoinstruments.anemotracker.starter _starter = null;
public com.calypsoinstruments.anemotracker.dbutils _dbutils = null;
public com.calypsoinstruments.anemotracker.actdevinfo _actdevinfo = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="actcalcomp";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
de.amberhome.objects.appcompat.AppCompatBase _ac = null;
RDebugUtils.currentLine=15073280;
 //BA.debugLineNum = 15073280;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=15073283;
 //BA.debugLineNum = 15073283;BA.debugLine="Activity.LoadLayout(\"actCalComp\")";
mostCurrent._activity.LoadLayout("actCalComp",mostCurrent.activityBA);
RDebugUtils.currentLine=15073284;
 //BA.debugLineNum = 15073284;BA.debugLine="Activity.Title = \"Compass Calibration\"";
mostCurrent._activity.setTitle(BA.ObjectToCharSequence("Compass Calibration"));
RDebugUtils.currentLine=15073286;
 //BA.debugLineNum = 15073286;BA.debugLine="lbl_messages.Text = \"Rotate the device slowly\"";
mostCurrent._lbl_messages.setText(BA.ObjectToCharSequence("Rotate the device slowly"));
RDebugUtils.currentLine=15073287;
 //BA.debugLineNum = 15073287;BA.debugLine="tuto = LoadBitmap(File.DirAssets, \"Cal brujula-01";
mostCurrent._tuto = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"Cal brujula-01.png");
RDebugUtils.currentLine=15073288;
 //BA.debugLineNum = 15073288;BA.debugLine="img_tutorial.Bitmap = tuto";
mostCurrent._img_tutorial.setBitmap((android.graphics.Bitmap)(mostCurrent._tuto.getObject()));
RDebugUtils.currentLine=15073289;
 //BA.debugLineNum = 15073289;BA.debugLine="img_tutorial.Height = tuto.Height * img_tutorial.";
mostCurrent._img_tutorial.setHeight((int) (mostCurrent._tuto.getHeight()*mostCurrent._img_tutorial.getWidth()/(double)mostCurrent._tuto.getWidth()));
RDebugUtils.currentLine=15073290;
 //BA.debugLineNum = 15073290;BA.debugLine="bmp_background = LoadBitmapResize( File.DirAssets";
mostCurrent._bmp_background = anywheresoftware.b4a.keywords.Common.LoadBitmapResize(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"Textura fibra carbono.jpg",(int) (800),(int) (800),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=15073292;
 //BA.debugLineNum = 15073292;BA.debugLine="SetTiledBackground( bmp_background )";
_settiledbackground(mostCurrent._bmp_background);
RDebugUtils.currentLine=15073294;
 //BA.debugLineNum = 15073294;BA.debugLine="toolbar.Initialize(\"tb\")";
mostCurrent._toolbar.Initialize(mostCurrent.activityBA,"tb");
RDebugUtils.currentLine=15073295;
 //BA.debugLineNum = 15073295;BA.debugLine="toolbar.Title = \"Compass Calibration\"";
mostCurrent._toolbar.setTitle(BA.ObjectToCharSequence("Compass Calibration"));
RDebugUtils.currentLine=15073296;
 //BA.debugLineNum = 15073296;BA.debugLine="toolbar.SetAsActionBar";
mostCurrent._toolbar.SetAsActionBar(mostCurrent.activityBA);
RDebugUtils.currentLine=15073297;
 //BA.debugLineNum = 15073297;BA.debugLine="toolbar.NavigationIconBitmap = LoadBitmap( File.D";
mostCurrent._toolbar.setNavigationIconBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"track.png").getObject()));
RDebugUtils.currentLine=15073299;
 //BA.debugLineNum = 15073299;BA.debugLine="Dim ac As AppCompat";
_ac = new de.amberhome.objects.appcompat.AppCompatBase();
RDebugUtils.currentLine=15073300;
 //BA.debugLineNum = 15073300;BA.debugLine="ac.SetElevation(toolbar, 8dip)";
_ac.SetElevation((android.view.View)(mostCurrent._toolbar.getObject()),(float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (8))));
RDebugUtils.currentLine=15073302;
 //BA.debugLineNum = 15073302;BA.debugLine="Activity.AddView( toolbar, 0%x, 0%y, 100%x, 55dip";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._toolbar.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (0),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (0),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (55)));
RDebugUtils.currentLine=15073305;
 //BA.debugLineNum = 15073305;BA.debugLine="lbl_messages.Top = img_tutorial.Height + img_tuto";
mostCurrent._lbl_messages.setTop((int) (mostCurrent._img_tutorial.getHeight()+mostCurrent._img_tutorial.getTop()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20))));
RDebugUtils.currentLine=15073306;
 //BA.debugLineNum = 15073306;BA.debugLine="lbl_vueltas.Top = lbl_messages.Height + lbl_messa";
mostCurrent._lbl_vueltas.setTop((int) (mostCurrent._lbl_messages.getHeight()+mostCurrent._lbl_messages.getTop()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20))));
RDebugUtils.currentLine=15073307;
 //BA.debugLineNum = 15073307;BA.debugLine="add_btn.Top = lbl_messages.Height + lbl_messages.";
mostCurrent._add_btn.setTop((int) (mostCurrent._lbl_messages.getHeight()+mostCurrent._lbl_messages.getTop()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20))));
RDebugUtils.currentLine=15073308;
 //BA.debugLineNum = 15073308;BA.debugLine="btn_abr.Top = lbl_vueltas.Height + lbl_vueltas.To";
mostCurrent._btn_abr.setTop((int) (mostCurrent._lbl_vueltas.getHeight()+mostCurrent._lbl_vueltas.getTop()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20))));
RDebugUtils.currentLine=15073311;
 //BA.debugLineNum = 15073311;BA.debugLine="vueltas = 0 'reiniciamos variable sin tener q rei";
_vueltas = (int) (0);
RDebugUtils.currentLine=15073312;
 //BA.debugLineNum = 15073312;BA.debugLine="secs = 0";
_secs = (int) (0);
RDebugUtils.currentLine=15073314;
 //BA.debugLineNum = 15073314;BA.debugLine="End Sub";
return "";
}
public static String  _settiledbackground(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _b) throws Exception{
RDebugUtils.currentModule="actcalcomp";
if (Debug.shouldDelegate(mostCurrent.activityBA, "settiledbackground"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "settiledbackground", new Object[] {_b}));}
anywheresoftware.b4a.objects.drawable.BitmapDrawable _bd = null;
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
RDebugUtils.currentLine=15138816;
 //BA.debugLineNum = 15138816;BA.debugLine="Sub SetTiledBackground( b As Bitmap)";
RDebugUtils.currentLine=15138817;
 //BA.debugLineNum = 15138817;BA.debugLine="Dim bd As BitmapDrawable";
_bd = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=15138818;
 //BA.debugLineNum = 15138818;BA.debugLine="bd.Initialize(b)";
_bd.Initialize((android.graphics.Bitmap)(_b.getObject()));
RDebugUtils.currentLine=15138820;
 //BA.debugLineNum = 15138820;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=15138821;
 //BA.debugLineNum = 15138821;BA.debugLine="r.Target = bd";
_r.Target = (Object)(_bd.getObject());
RDebugUtils.currentLine=15138822;
 //BA.debugLineNum = 15138822;BA.debugLine="r.RunMethod3(\"setTileModeXY\",\"REPEAT\", \"android.g";
_r.RunMethod3("setTileModeXY","REPEAT","android.graphics.Shader$TileMode","REPEAT","android.graphics.Shader$TileMode");
RDebugUtils.currentLine=15138824;
 //BA.debugLineNum = 15138824;BA.debugLine="Activity.Background = bd";
mostCurrent._activity.setBackground((android.graphics.drawable.Drawable)(_bd.getObject()));
RDebugUtils.currentLine=15138825;
 //BA.debugLineNum = 15138825;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="actcalcomp";
RDebugUtils.currentLine=15269888;
 //BA.debugLineNum = 15269888;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=15269890;
 //BA.debugLineNum = 15269890;BA.debugLine="End Sub";
return "";
}
public static void  _activity_resume() throws Exception{
RDebugUtils.currentModule="actcalcomp";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	 {Debug.delegate(mostCurrent.activityBA, "activity_resume", null); return;}
ResumableSub_Activity_Resume rsub = new ResumableSub_Activity_Resume(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Activity_Resume extends BA.ResumableSub {
public ResumableSub_Activity_Resume(com.calypsoinstruments.anemotracker.actcalcomp parent) {
this.parent = parent;
}
com.calypsoinstruments.anemotracker.actcalcomp parent;
anywheresoftware.b4a.agraham.byteconverter.ByteConverter _bc = null;
int _olsecs = 0;
int _acpos = 0;
int _olpos = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="actcalcomp";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=15204353;
 //BA.debugLineNum = 15204353;BA.debugLine="Dim bc As ByteConverter";
_bc = new anywheresoftware.b4a.agraham.byteconverter.ByteConverter();
RDebugUtils.currentLine=15204354;
 //BA.debugLineNum = 15204354;BA.debugLine="bc.LittleEndian = True";
_bc.setLittleEndian(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=15204355;
 //BA.debugLineNum = 15204355;BA.debugLine="If Starter.connected Then";
if (true) break;

case 1:
//if
this.state = 25;
if (parent.mostCurrent._starter._connected) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=15204359;
 //BA.debugLineNum = 15204359;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "actcalcomp", "activity_resume"),(int) (1000));
this.state = 26;
return;
case 26:
//C
this.state = 4;
;
RDebugUtils.currentLine=15204361;
 //BA.debugLineNum = 15204361;BA.debugLine="Starter.Scan.WriteData( Starter.sUltra, Starter.";
parent.mostCurrent._starter._scan.WriteData(parent.mostCurrent._starter._sultra,parent.mostCurrent._starter._ccalcomp,_bc.HexToBytes("01"));
RDebugUtils.currentLine=15204363;
 //BA.debugLineNum = 15204363;BA.debugLine="Dim olSecs As Int = 0";
_olsecs = (int) (0);
RDebugUtils.currentLine=15204364;
 //BA.debugLineNum = 15204364;BA.debugLine="Dim acPos, olPos As Int";
_acpos = 0;
_olpos = 0;
RDebugUtils.currentLine=15204365;
 //BA.debugLineNum = 15204365;BA.debugLine="Do While vueltas < 3";
if (true) break;

case 4:
//do while
this.state = 24;
while (parent._vueltas<3) {
this.state = 6;
if (true) break;
}
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=15204366;
 //BA.debugLineNum = 15204366;BA.debugLine="secs = secs + 1";
parent._secs = (int) (parent._secs+1);
RDebugUtils.currentLine=15204367;
 //BA.debugLineNum = 15204367;BA.debugLine="acPos = Starter.calcs_1.ecompass";
_acpos = parent.mostCurrent._starter._calcs_1._ecompass;
RDebugUtils.currentLine=15204368;
 //BA.debugLineNum = 15204368;BA.debugLine="If Abs(acPos - olPos) > 20 Then	'Variacion de m";
if (true) break;

case 7:
//if
this.state = 14;
if (anywheresoftware.b4a.keywords.Common.Abs(_acpos-_olpos)>20) { 
this.state = 9;
}else 
{RDebugUtils.currentLine=15204370;
 //BA.debugLineNum = 15204370;BA.debugLine="Else If Abs(acPos - olPos) < 2 Then";
if (anywheresoftware.b4a.keywords.Common.Abs(_acpos-_olpos)<2) { 
this.state = 11;
}else {
this.state = 13;
}}
if (true) break;

case 9:
//C
this.state = 14;
RDebugUtils.currentLine=15204369;
 //BA.debugLineNum = 15204369;BA.debugLine="lbl_messages.Text = \"Too Fast. Rotate Slowly\"";
parent.mostCurrent._lbl_messages.setText(BA.ObjectToCharSequence("Too Fast. Rotate Slowly"));
 if (true) break;

case 11:
//C
this.state = 14;
RDebugUtils.currentLine=15204371;
 //BA.debugLineNum = 15204371;BA.debugLine="lbl_messages.Text = \"Please, rotate the device";
parent.mostCurrent._lbl_messages.setText(BA.ObjectToCharSequence("Please, rotate the device"));
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=15204373;
 //BA.debugLineNum = 15204373;BA.debugLine="lbl_messages.Text = \"Keep rotating\"";
parent.mostCurrent._lbl_messages.setText(BA.ObjectToCharSequence("Keep rotating"));
 if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=15204375;
 //BA.debugLineNum = 15204375;BA.debugLine="olPos = acPos";
_olpos = _acpos;
RDebugUtils.currentLine=15204376;
 //BA.debugLineNum = 15204376;BA.debugLine="test_lbl.Text = \"Debug Pos: \" & acPos 'Debug";
parent.mostCurrent._test_lbl.setText(BA.ObjectToCharSequence("Debug Pos: "+BA.NumberToString(_acpos)));
RDebugUtils.currentLine=15204378;
 //BA.debugLineNum = 15204378;BA.debugLine="If (acPos < 10 Or acPos > 350) And isNew = True";
if (true) break;

case 15:
//if
this.state = 20;
if ((_acpos<10 || _acpos>350) && parent._isnew==anywheresoftware.b4a.keywords.Common.True && parent._secs-_olsecs>5) { 
this.state = 17;
}else 
{RDebugUtils.currentLine=15204383;
 //BA.debugLineNum = 15204383;BA.debugLine="Else If (acPos > 10 Or acPos < 350) And isNew =";
if ((_acpos>10 || _acpos<350) && parent._isnew==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 19;
}}
if (true) break;

case 17:
//C
this.state = 20;
RDebugUtils.currentLine=15204379;
 //BA.debugLineNum = 15204379;BA.debugLine="vueltas = vueltas + 1";
parent._vueltas = (int) (parent._vueltas+1);
RDebugUtils.currentLine=15204380;
 //BA.debugLineNum = 15204380;BA.debugLine="isNew = False";
parent._isnew = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=15204382;
 //BA.debugLineNum = 15204382;BA.debugLine="olSecs = secs";
_olsecs = parent._secs;
 if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=15204384;
 //BA.debugLineNum = 15204384;BA.debugLine="isNew = True";
parent._isnew = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;
;
RDebugUtils.currentLine=15204387;
 //BA.debugLineNum = 15204387;BA.debugLine="If vueltas = 0 And secs > 30 Then";

case 20:
//if
this.state = 23;
if (parent._vueltas==0 && parent._secs>30) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=15204388;
 //BA.debugLineNum = 15204388;BA.debugLine="Msgbox(\"Press +1 button if you have completed";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Press +1 button if you have completed a turn but it has not been added to turns count"),BA.ObjectToCharSequence(""),mostCurrent.activityBA);
RDebugUtils.currentLine=15204389;
 //BA.debugLineNum = 15204389;BA.debugLine="secs = 0";
parent._secs = (int) (0);
RDebugUtils.currentLine=15204390;
 //BA.debugLineNum = 15204390;BA.debugLine="olSecs = secs";
_olsecs = parent._secs;
 if (true) break;

case 23:
//C
this.state = 4;
;
RDebugUtils.currentLine=15204393;
 //BA.debugLineNum = 15204393;BA.debugLine="lbl_vueltas.Text = \"Turns count: \" & vueltas";
parent.mostCurrent._lbl_vueltas.setText(BA.ObjectToCharSequence("Turns count: "+BA.NumberToString(parent._vueltas)));
RDebugUtils.currentLine=15204395;
 //BA.debugLineNum = 15204395;BA.debugLine="Sleep(1000) 'una vez por segundo";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "actcalcomp", "activity_resume"),(int) (1000));
this.state = 27;
return;
case 27:
//C
this.state = 4;
;
 if (true) break;

case 24:
//C
this.state = 25;
;
RDebugUtils.currentLine=15204398;
 //BA.debugLineNum = 15204398;BA.debugLine="lbl_messages.Text = \"Done\"";
parent.mostCurrent._lbl_messages.setText(BA.ObjectToCharSequence("Done"));
RDebugUtils.currentLine=15204399;
 //BA.debugLineNum = 15204399;BA.debugLine="Starter.Scan.WriteData( Starter.sUltra, Starter.";
parent.mostCurrent._starter._scan.WriteData(parent.mostCurrent._starter._sultra,parent.mostCurrent._starter._ccalcomp,_bc.HexToBytes("00"));
RDebugUtils.currentLine=15204400;
 //BA.debugLineNum = 15204400;BA.debugLine="ToastMessageShow( \"Compass calibrated successful";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Compass calibrated successfully"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=15204401;
 //BA.debugLineNum = 15204401;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 25:
//C
this.state = -1;
;
RDebugUtils.currentLine=15204404;
 //BA.debugLineNum = 15204404;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _add_btn_click() throws Exception{
RDebugUtils.currentModule="actcalcomp";
if (Debug.shouldDelegate(mostCurrent.activityBA, "add_btn_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "add_btn_click", null));}
RDebugUtils.currentLine=15335424;
 //BA.debugLineNum = 15335424;BA.debugLine="Sub add_btn_Click";
RDebugUtils.currentLine=15335425;
 //BA.debugLineNum = 15335425;BA.debugLine="vueltas = vueltas + 1";
_vueltas = (int) (_vueltas+1);
RDebugUtils.currentLine=15335426;
 //BA.debugLineNum = 15335426;BA.debugLine="End Sub";
return "";
}
public static String  _btn_abr_click() throws Exception{
RDebugUtils.currentModule="actcalcomp";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_abr_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_abr_click", null));}
int _result = 0;
anywheresoftware.b4a.agraham.byteconverter.ByteConverter _bc = null;
RDebugUtils.currentLine=15400960;
 //BA.debugLineNum = 15400960;BA.debugLine="Sub btn_abr_Click";
RDebugUtils.currentLine=15400962;
 //BA.debugLineNum = 15400962;BA.debugLine="Dim result As Int";
_result = 0;
RDebugUtils.currentLine=15400963;
 //BA.debugLineNum = 15400963;BA.debugLine="Dim bc As ByteConverter";
_bc = new anywheresoftware.b4a.agraham.byteconverter.ByteConverter();
RDebugUtils.currentLine=15400964;
 //BA.debugLineNum = 15400964;BA.debugLine="bc.LittleEndian = True";
_bc.setLittleEndian(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=15400965;
 //BA.debugLineNum = 15400965;BA.debugLine="result = Msgbox2( \"The calibration may not be fin";
_result = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("The calibration may not be finished. Do you wish to abort it?"),BA.ObjectToCharSequence("Abort"),"Abort","","No",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=15400966;
 //BA.debugLineNum = 15400966;BA.debugLine="If result = DialogResponse.POSITIVE Then";
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=15400967;
 //BA.debugLineNum = 15400967;BA.debugLine="Starter.Scan.WriteData( Starter.sUltra, Starter.";
mostCurrent._starter._scan.WriteData(mostCurrent._starter._sultra,mostCurrent._starter._ccalcomp,_bc.HexToBytes("00"));
RDebugUtils.currentLine=15400968;
 //BA.debugLineNum = 15400968;BA.debugLine="ToastMessageShow( \"Calibration aborted\" , False";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Calibration aborted"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=15400969;
 //BA.debugLineNum = 15400969;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
RDebugUtils.currentLine=15400971;
 //BA.debugLineNum = 15400971;BA.debugLine="End Sub";
return "";
}
}