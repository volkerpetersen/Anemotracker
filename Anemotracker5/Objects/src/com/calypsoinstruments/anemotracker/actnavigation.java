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

public class actnavigation extends android.support.v7.app.AppCompatActivity implements B4AActivity{
	public static actnavigation mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "com.calypsoinstruments.anemotracker", "com.calypsoinstruments.anemotracker.actnavigation");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (actnavigation).");
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
		activityBA = new BA(this, layout, processBA, "com.calypsoinstruments.anemotracker", "com.calypsoinstruments.anemotracker.actnavigation");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "com.calypsoinstruments.anemotracker.actnavigation", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (actnavigation) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (actnavigation) Resume **");
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
		return actnavigation.class;
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
        BA.LogInfo("** Activity (actnavigation) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            actnavigation mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (actnavigation) Resume **");
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
public static int _mode = 0;
public static int _id = 0;
public anywheresoftware.b4a.objects.EditTextWrapper _edittext1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittext2 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_init = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_cancel = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_delete = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_excel = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_kml = null;
public de.amberhome.objects.appcompat.ACToolbarLightWrapper _toolbar = null;
public com.calypsoinstruments.anemotracker.main _main = null;
public com.calypsoinstruments.anemotracker.actble _actble = null;
public com.calypsoinstruments.anemotracker.actlisttracks _actlisttracks = null;
public com.calypsoinstruments.anemotracker.acttcpip _acttcpip = null;
public com.calypsoinstruments.anemotracker.starter _starter = null;
public com.calypsoinstruments.anemotracker.dbutils _dbutils = null;
public com.calypsoinstruments.anemotracker.actcalcomp _actcalcomp = null;
public com.calypsoinstruments.anemotracker.actdevinfo _actdevinfo = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="actnavigation";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
de.amberhome.objects.appcompat.AppCompatBase _ac = null;
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="Activity.LoadLayout(\"actNavigation\")";
mostCurrent._activity.LoadLayout("actNavigation",mostCurrent.activityBA);
RDebugUtils.currentLine=4456451;
 //BA.debugLineNum = 4456451;BA.debugLine="Activity.Title = \"New Track\"";
mostCurrent._activity.setTitle(BA.ObjectToCharSequence("New Track"));
RDebugUtils.currentLine=4456454;
 //BA.debugLineNum = 4456454;BA.debugLine="toolbar.Initialize(\"tb\")";
mostCurrent._toolbar.Initialize(mostCurrent.activityBA,"tb");
RDebugUtils.currentLine=4456455;
 //BA.debugLineNum = 4456455;BA.debugLine="toolbar.Title = \"New Track\"";
mostCurrent._toolbar.setTitle(BA.ObjectToCharSequence("New Track"));
RDebugUtils.currentLine=4456456;
 //BA.debugLineNum = 4456456;BA.debugLine="toolbar.SetAsActionBar";
mostCurrent._toolbar.SetAsActionBar(mostCurrent.activityBA);
RDebugUtils.currentLine=4456457;
 //BA.debugLineNum = 4456457;BA.debugLine="toolbar.NavigationIconBitmap = LoadBitmap( File.D";
mostCurrent._toolbar.setNavigationIconBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"track.png").getObject()));
RDebugUtils.currentLine=4456459;
 //BA.debugLineNum = 4456459;BA.debugLine="Dim AC As AppCompat";
_ac = new de.amberhome.objects.appcompat.AppCompatBase();
RDebugUtils.currentLine=4456460;
 //BA.debugLineNum = 4456460;BA.debugLine="AC.SetElevation(toolbar, 8dip)";
_ac.SetElevation((android.view.View)(mostCurrent._toolbar.getObject()),(float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (8))));
RDebugUtils.currentLine=4456462;
 //BA.debugLineNum = 4456462;BA.debugLine="Activity.AddView( toolbar, 0%x, 0%y, 100%x, 55dip";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._toolbar.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (0),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (0),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (55)));
RDebugUtils.currentLine=4456463;
 //BA.debugLineNum = 4456463;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="actnavigation";
RDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="actnavigation";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="If mode = 0 Then";
if (_mode==0) { 
RDebugUtils.currentLine=4521987;
 //BA.debugLineNum = 4521987;BA.debugLine="toolbar.Title = \"New Track\"";
mostCurrent._toolbar.setTitle(BA.ObjectToCharSequence("New Track"));
RDebugUtils.currentLine=4521988;
 //BA.debugLineNum = 4521988;BA.debugLine="btn_init.Text = \"Create\" & CRLF & \"& Init\"";
mostCurrent._btn_init.setText(BA.ObjectToCharSequence("Create"+anywheresoftware.b4a.keywords.Common.CRLF+"& Init"));
RDebugUtils.currentLine=4521989;
 //BA.debugLineNum = 4521989;BA.debugLine="btn_excel.Visible = False";
mostCurrent._btn_excel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=4521990;
 //BA.debugLineNum = 4521990;BA.debugLine="btn_kml.Visible = False";
mostCurrent._btn_kml.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=4521991;
 //BA.debugLineNum = 4521991;BA.debugLine="btn_delete.Visible = False";
mostCurrent._btn_delete.setVisible(anywheresoftware.b4a.keywords.Common.False);
 }else {
RDebugUtils.currentLine=4521993;
 //BA.debugLineNum = 4521993;BA.debugLine="Dim m = DBUtils.ExecuteMap( Starter.sql1, \"selec";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = mostCurrent._dbutils._executemap(mostCurrent.activityBA,mostCurrent._starter._sql1,"select * from navigation where [id] = "+BA.NumberToString(_id),(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=4521994;
 //BA.debugLineNum = 4521994;BA.debugLine="EditText1.Text = m.Get(\"name\" )";
mostCurrent._edittext1.setText(BA.ObjectToCharSequence(_m.Get((Object)("name"))));
RDebugUtils.currentLine=4521995;
 //BA.debugLineNum = 4521995;BA.debugLine="EditText2.Text = m.Get(\"description\" )";
mostCurrent._edittext2.setText(BA.ObjectToCharSequence(_m.Get((Object)("description"))));
RDebugUtils.currentLine=4521996;
 //BA.debugLineNum = 4521996;BA.debugLine="toolbar.Title = \"Edit Track\"";
mostCurrent._toolbar.setTitle(BA.ObjectToCharSequence("Edit Track"));
RDebugUtils.currentLine=4521997;
 //BA.debugLineNum = 4521997;BA.debugLine="btn_init.Text = \"Save\"";
mostCurrent._btn_init.setText(BA.ObjectToCharSequence("Save"));
RDebugUtils.currentLine=4521998;
 //BA.debugLineNum = 4521998;BA.debugLine="btn_excel.Visible = True";
mostCurrent._btn_excel.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=4521999;
 //BA.debugLineNum = 4521999;BA.debugLine="btn_kml.Visible = True";
mostCurrent._btn_kml.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=4522000;
 //BA.debugLineNum = 4522000;BA.debugLine="btn_delete.Visible = True";
mostCurrent._btn_delete.setVisible(anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=4522002;
 //BA.debugLineNum = 4522002;BA.debugLine="End Sub";
return "";
}
public static String  _borrado(anywheresoftware.b4a.objects.collections.Map _borrar) throws Exception{
RDebugUtils.currentModule="actnavigation";
if (Debug.shouldDelegate(mostCurrent.activityBA, "borrado"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "borrado", new Object[] {_borrar}));}
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4a.objects.collections.List _l = null;
anywheresoftware.b4a.objects.collections.List _lista = null;
anywheresoftware.b4a.objects.collections.Map _n = null;
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Sub borrado(borrar As Map)";
RDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=4849667;
 //BA.debugLineNum = 4849667;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=4849668;
 //BA.debugLineNum = 4849668;BA.debugLine="m.Put(\"id\", DBUtils.DB_INTEGER)";
_m.Put((Object)("id"),(Object)(mostCurrent._dbutils._db_integer));
RDebugUtils.currentLine=4849669;
 //BA.debugLineNum = 4849669;BA.debugLine="m.Put(\"name\", DBUtils.DB_TEXT)";
_m.Put((Object)("name"),(Object)(mostCurrent._dbutils._db_text));
RDebugUtils.currentLine=4849670;
 //BA.debugLineNum = 4849670;BA.debugLine="m.Put(\"description\", DBUtils.DB_TEXT)";
_m.Put((Object)("description"),(Object)(mostCurrent._dbutils._db_text));
RDebugUtils.currentLine=4849671;
 //BA.debugLineNum = 4849671;BA.debugLine="m.Put(\"date_start\", DBUtils.DB_INTEGER)";
_m.Put((Object)("date_start"),(Object)(mostCurrent._dbutils._db_integer));
RDebugUtils.currentLine=4849672;
 //BA.debugLineNum = 4849672;BA.debugLine="m.Put(\"boat_id\", DBUtils.DB_INTEGER)";
_m.Put((Object)("boat_id"),(Object)(mostCurrent._dbutils._db_integer));
RDebugUtils.currentLine=4849673;
 //BA.debugLineNum = 4849673;BA.debugLine="m.Put(\"e_id\", DBUtils.DB_INTEGER )";
_m.Put((Object)("e_id"),(Object)(mostCurrent._dbutils._db_integer));
RDebugUtils.currentLine=4849675;
 //BA.debugLineNum = 4849675;BA.debugLine="Dim l As List";
_l = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4849676;
 //BA.debugLineNum = 4849676;BA.debugLine="l.Initialize";
_l.Initialize();
RDebugUtils.currentLine=4849677;
 //BA.debugLineNum = 4849677;BA.debugLine="l = DBUtils.ExecuteMemoryMapList( Starter.sql1, \"";
_l = mostCurrent._dbutils._executememorymaplist(mostCurrent.activityBA,mostCurrent._starter._sql1,"select * from navigation",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0));
RDebugUtils.currentLine=4849678;
 //BA.debugLineNum = 4849678;BA.debugLine="DBUtils.DropTable( Starter.sql1, \"navigation\")";
mostCurrent._dbutils._droptable(mostCurrent.activityBA,mostCurrent._starter._sql1,"navigation");
RDebugUtils.currentLine=4849679;
 //BA.debugLineNum = 4849679;BA.debugLine="DBUtils.CreateTable(Starter.sql1, \"navigation\", m";
mostCurrent._dbutils._createtable(mostCurrent.activityBA,mostCurrent._starter._sql1,"navigation",_m,"id",anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=4849680;
 //BA.debugLineNum = 4849680;BA.debugLine="Dim lista As List";
_lista = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4849681;
 //BA.debugLineNum = 4849681;BA.debugLine="lista.Initialize";
_lista.Initialize();
RDebugUtils.currentLine=4849682;
 //BA.debugLineNum = 4849682;BA.debugLine="For Each n As Map In l";
_n = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group16 = _l;
final int groupLen16 = group16.getSize()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_n.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group16.Get(index16)));
RDebugUtils.currentLine=4849683;
 //BA.debugLineNum = 4849683;BA.debugLine="If n <> borrar Then";
if ((_n).equals(_borrar) == false) { 
RDebugUtils.currentLine=4849684;
 //BA.debugLineNum = 4849684;BA.debugLine="lista.Add(n)";
_lista.Add((Object)(_n.getObject()));
 };
 }
};
RDebugUtils.currentLine=4849687;
 //BA.debugLineNum = 4849687;BA.debugLine="DBUtils.InsertMaps(Starter.sql1, \"navigation\", li";
mostCurrent._dbutils._insertmaps(mostCurrent.activityBA,mostCurrent._starter._sql1,"navigation",_lista);
RDebugUtils.currentLine=4849688;
 //BA.debugLineNum = 4849688;BA.debugLine="End Sub";
return "";
}
public static String  _btn_cancel_click() throws Exception{
RDebugUtils.currentModule="actnavigation";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_cancel_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_cancel_click", null));}
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Sub btn_cancel_Click ' Cancel";
RDebugUtils.currentLine=4718593;
 //BA.debugLineNum = 4718593;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="CallSubDelayed( actListTracks, \"refresh\" )";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(mostCurrent._actlisttracks.getObject()),"refresh");
RDebugUtils.currentLine=4718595;
 //BA.debugLineNum = 4718595;BA.debugLine="End Sub";
return "";
}
public static String  _btn_delete_click() throws Exception{
RDebugUtils.currentModule="actnavigation";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_delete_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_delete_click", null));}
int _result = 0;
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Sub btn_delete_Click";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="Dim result As Int";
_result = 0;
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="Dim m = DBUtils.ExecuteMap( Starter.sql1, \"select";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = mostCurrent._dbutils._executemap(mostCurrent.activityBA,mostCurrent._starter._sql1,"select * from navigation where [id] = "+BA.NumberToString(_id),(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=4915204;
 //BA.debugLineNum = 4915204;BA.debugLine="result = Msgbox2( \"Track: \" & m.Get(\"name\" ) & CR";
_result = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Track: "+BA.ObjectToString(_m.Get((Object)("name")))+anywheresoftware.b4a.keywords.Common.CRLF+BA.ObjectToString(_m.Get((Object)("description")))),BA.ObjectToCharSequence("Delete Track : "+BA.ObjectToString(_m.Get((Object)("name")))+" ? "),"Yes","","No",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=4915208;
 //BA.debugLineNum = 4915208;BA.debugLine="If result = DialogResponse.POSITIVE Then";
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=4915210;
 //BA.debugLineNum = 4915210;BA.debugLine="DBUtils.DeleteRecordID( Starter.sql1, m.Get(\"id\"";
mostCurrent._dbutils._deleterecordid(mostCurrent.activityBA,mostCurrent._starter._sql1,(int)(BA.ObjectToNumber(_m.Get((Object)("id")))));
RDebugUtils.currentLine=4915212;
 //BA.debugLineNum = 4915212;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=4915213;
 //BA.debugLineNum = 4915213;BA.debugLine="CallSubDelayed( actListTracks, \"refresh\" )";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(mostCurrent._actlisttracks.getObject()),"refresh");
 };
RDebugUtils.currentLine=4915215;
 //BA.debugLineNum = 4915215;BA.debugLine="End Sub";
return "";
}
public static String  _btn_excel_click() throws Exception{
RDebugUtils.currentModule="actnavigation";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_excel_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_excel_click", null));}
anywheresoftware.b4a.objects.WorkbookWrapper.WritableWorkbookWrapper _wb = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
anywheresoftware.b4a.objects.WorkbookWrapper.WritableSheetWrapper _sh1 = null;
anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellWrapper _c = null;
anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper _cf1 = null;
int _i = 0;
String[] _cols = null;
anywheresoftware.b4a.objects.collections.List _l = null;
String[] _j = null;
String _mf = "";
anywheresoftware.b4a.objects.IntentWrapper _intent1 = null;
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Sub btn_excel_Click";
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="Dim WB As WritableWorkbook";
_wb = new anywheresoftware.b4a.objects.WorkbookWrapper.WritableWorkbookWrapper();
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="Dim m = DBUtils.ExecuteMap( Starter.sql1, \"select";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = mostCurrent._dbutils._executemap(mostCurrent.activityBA,mostCurrent._starter._sql1,"select * from navigation where [id] = "+BA.NumberToString(_id),(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=4980739;
 //BA.debugLineNum = 4980739;BA.debugLine="Private rp As RuntimePermissions";
_rp = new anywheresoftware.b4a.objects.RuntimePermissions();
RDebugUtils.currentLine=4980740;
 //BA.debugLineNum = 4980740;BA.debugLine="WB.Initialize(rp.GetSafeDirDefaultExternal(\"\") ,";
_wb.Initialize(_rp.GetSafeDirDefaultExternal(""),BA.NumberToString(_id)+"_"+BA.ObjectToString(_m.Get((Object)("name")))+".xls");
RDebugUtils.currentLine=4980741;
 //BA.debugLineNum = 4980741;BA.debugLine="Dim sh1 As WritableSheet";
_sh1 = new anywheresoftware.b4a.objects.WorkbookWrapper.WritableSheetWrapper();
RDebugUtils.currentLine=4980742;
 //BA.debugLineNum = 4980742;BA.debugLine="sh1 = WB.AddSheet(m.Get(\"name\"), 0)";
_sh1 = _wb.AddSheet(BA.ObjectToString(_m.Get((Object)("name"))),(int) (0));
RDebugUtils.currentLine=4980743;
 //BA.debugLineNum = 4980743;BA.debugLine="Dim c As WritableCell";
_c = new anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellWrapper();
RDebugUtils.currentLine=4980745;
 //BA.debugLineNum = 4980745;BA.debugLine="Dim cf1 As WritableCellFormat";
_cf1 = new anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper();
RDebugUtils.currentLine=4980746;
 //BA.debugLineNum = 4980746;BA.debugLine="cf1.Initialize2(cf1.FONT_ARIAL, 12, True, False,";
_cf1.Initialize2(_cf1.FONT_ARIAL,(int) (12),anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.False,_cf1.COLOR_GREEN);
RDebugUtils.currentLine=4980748;
 //BA.debugLineNum = 4980748;BA.debugLine="cf1.HorizontalAlignment = cf1.HALIGN_CENTRE";
_cf1.setHorizontalAlignment(_cf1.HALIGN_CENTRE);
RDebugUtils.currentLine=4980749;
 //BA.debugLineNum = 4980749;BA.debugLine="cf1.SetBorder(cf1.BORDER_ALL, _ 				  cf1.BORDER_";
_cf1.SetBorder(_cf1.BORDER_ALL,_cf1.BORDER_STYLE_MEDIUM,_cf1.COLOR_BLACK);
RDebugUtils.currentLine=4980751;
 //BA.debugLineNum = 4980751;BA.debugLine="cf1.SetBorder(cf1.BORDER_BOTTOM, cf1.BORDER_STYLE";
_cf1.SetBorder(_cf1.BORDER_BOTTOM,_cf1.BORDER_STYLE_THICK,_cf1.COLOR_BLUE);
RDebugUtils.currentLine=4980753;
 //BA.debugLineNum = 4980753;BA.debugLine="cf1.VertivalAlignment = cf1.VALIGN_CENTRE";
_cf1.setVertivalAlignment(_cf1.VALIGN_CENTRE);
RDebugUtils.currentLine=4980754;
 //BA.debugLineNum = 4980754;BA.debugLine="cf1.BackgroundColor = cf1.COLOR_GREY_25_PERCENT";
_cf1.setBackgroundColor(_cf1.COLOR_GREY_25_PERCENT);
RDebugUtils.currentLine=4980755;
 //BA.debugLineNum = 4980755;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=4980758;
 //BA.debugLineNum = 4980758;BA.debugLine="Dim cols() As String = Array As String( \"Id\", \"La";
_cols = new String[]{"Id","Lat","Lon","Date","AppWindAngle","AppWindModulus","TrueWindAngle","TrueWindModulus","Bearing","Speed","Batt","Temp","Roll","Pitch","eCompass"};
RDebugUtils.currentLine=4980759;
 //BA.debugLineNum = 4980759;BA.debugLine="For i = 0 To cols.Length - 1";
{
final int step17 = 1;
final int limit17 = (int) (_cols.length-1);
_i = (int) (0) ;
for (;_i <= limit17 ;_i = _i + step17 ) {
RDebugUtils.currentLine=4980760;
 //BA.debugLineNum = 4980760;BA.debugLine="sh1.SetColumnWidth(i, 15)";
_sh1.SetColumnWidth(_i,(int) (15));
RDebugUtils.currentLine=4980761;
 //BA.debugLineNum = 4980761;BA.debugLine="If i = 3 Then";
if (_i==3) { 
RDebugUtils.currentLine=4980762;
 //BA.debugLineNum = 4980762;BA.debugLine="sh1.SetColumnWidth(i, 25)";
_sh1.SetColumnWidth(_i,(int) (25));
 };
RDebugUtils.currentLine=4980764;
 //BA.debugLineNum = 4980764;BA.debugLine="c.InitializeText(i,0, cols(i) )";
_c.InitializeText(_i,(int) (0),_cols[_i]);
RDebugUtils.currentLine=4980765;
 //BA.debugLineNum = 4980765;BA.debugLine="c.SetCellFormat( cf1 )";
_c.SetCellFormat(_cf1);
RDebugUtils.currentLine=4980766;
 //BA.debugLineNum = 4980766;BA.debugLine="sh1.AddCell( c )";
_sh1.AddCell((jxl.write.WritableCell)(_c.getObject()));
 }
};
RDebugUtils.currentLine=4980769;
 //BA.debugLineNum = 4980769;BA.debugLine="Dim l As List";
_l = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4980770;
 //BA.debugLineNum = 4980770;BA.debugLine="l = DBUtils.ExecuteMemoryTable( Starter.sql1, \"se";
_l = mostCurrent._dbutils._executememorytable(mostCurrent.activityBA,mostCurrent._starter._sql1,"select * from route5 where [navigation_id] ="+BA.NumberToString(_id),(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0));
RDebugUtils.currentLine=4980771;
 //BA.debugLineNum = 4980771;BA.debugLine="Dim j() As String";
_j = new String[(int) (0)];
java.util.Arrays.fill(_j,"");
RDebugUtils.currentLine=4980776;
 //BA.debugLineNum = 4980776;BA.debugLine="For i = 0 To l.Size - 1";
{
final int step29 = 1;
final int limit29 = (int) (_l.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit29 ;_i = _i + step29 ) {
RDebugUtils.currentLine=4980777;
 //BA.debugLineNum = 4980777;BA.debugLine="j = l.Get(i)";
_j = (String[])(_l.Get(_i));
RDebugUtils.currentLine=4980778;
 //BA.debugLineNum = 4980778;BA.debugLine="c.InitializeNumber(0,i+1, j(0) ) ' Id";
_c.InitializeNumber((int) (0),(int) (_i+1),(double)(Double.parseDouble(_j[(int) (0)])));
RDebugUtils.currentLine=4980779;
 //BA.debugLineNum = 4980779;BA.debugLine="sh1.AddCell(c)";
_sh1.AddCell((jxl.write.WritableCell)(_c.getObject()));
RDebugUtils.currentLine=4980780;
 //BA.debugLineNum = 4980780;BA.debugLine="c.InitializeNumber(1,i+1, j(2) ) ' Lat";
_c.InitializeNumber((int) (1),(int) (_i+1),(double)(Double.parseDouble(_j[(int) (2)])));
RDebugUtils.currentLine=4980781;
 //BA.debugLineNum = 4980781;BA.debugLine="sh1.AddCell(c)";
_sh1.AddCell((jxl.write.WritableCell)(_c.getObject()));
RDebugUtils.currentLine=4980782;
 //BA.debugLineNum = 4980782;BA.debugLine="c.InitializeNumber(2,i+1, j(3) ) ' Lon";
_c.InitializeNumber((int) (2),(int) (_i+1),(double)(Double.parseDouble(_j[(int) (3)])));
RDebugUtils.currentLine=4980783;
 //BA.debugLineNum = 4980783;BA.debugLine="sh1.AddCell(c)";
_sh1.AddCell((jxl.write.WritableCell)(_c.getObject()));
RDebugUtils.currentLine=4980784;
 //BA.debugLineNum = 4980784;BA.debugLine="c.InitializeText(3,i+1, DateTime.Date( j(4) ) &";
_c.InitializeText((int) (3),(int) (_i+1),anywheresoftware.b4a.keywords.Common.DateTime.Date((long)(Double.parseDouble(_j[(int) (4)])))+" "+anywheresoftware.b4a.keywords.Common.DateTime.Time((long)(Double.parseDouble(_j[(int) (4)]))));
RDebugUtils.currentLine=4980785;
 //BA.debugLineNum = 4980785;BA.debugLine="sh1.AddCell(c)";
_sh1.AddCell((jxl.write.WritableCell)(_c.getObject()));
RDebugUtils.currentLine=4980786;
 //BA.debugLineNum = 4980786;BA.debugLine="c.InitializeNumber(4,i+1, j(6) ) ' Awa";
_c.InitializeNumber((int) (4),(int) (_i+1),(double)(Double.parseDouble(_j[(int) (6)])));
RDebugUtils.currentLine=4980787;
 //BA.debugLineNum = 4980787;BA.debugLine="sh1.AddCell(c)";
_sh1.AddCell((jxl.write.WritableCell)(_c.getObject()));
RDebugUtils.currentLine=4980788;
 //BA.debugLineNum = 4980788;BA.debugLine="c.InitializeNumber(5,i+1, j(7) ) ' Awm";
_c.InitializeNumber((int) (5),(int) (_i+1),(double)(Double.parseDouble(_j[(int) (7)])));
RDebugUtils.currentLine=4980789;
 //BA.debugLineNum = 4980789;BA.debugLine="sh1.AddCell(c)";
_sh1.AddCell((jxl.write.WritableCell)(_c.getObject()));
RDebugUtils.currentLine=4980790;
 //BA.debugLineNum = 4980790;BA.debugLine="c.InitializeNumber(6,i+1, j(8) ) ' Twa";
_c.InitializeNumber((int) (6),(int) (_i+1),(double)(Double.parseDouble(_j[(int) (8)])));
RDebugUtils.currentLine=4980791;
 //BA.debugLineNum = 4980791;BA.debugLine="sh1.AddCell(c)";
_sh1.AddCell((jxl.write.WritableCell)(_c.getObject()));
RDebugUtils.currentLine=4980792;
 //BA.debugLineNum = 4980792;BA.debugLine="c.InitializeNumber(7,i+1, j(9) ) ' Twm";
_c.InitializeNumber((int) (7),(int) (_i+1),(double)(Double.parseDouble(_j[(int) (9)])));
RDebugUtils.currentLine=4980793;
 //BA.debugLineNum = 4980793;BA.debugLine="sh1.AddCell(c)";
_sh1.AddCell((jxl.write.WritableCell)(_c.getObject()));
RDebugUtils.currentLine=4980794;
 //BA.debugLineNum = 4980794;BA.debugLine="c.InitializeNumber(8,i+1, j(10) ) ' Bearing";
_c.InitializeNumber((int) (8),(int) (_i+1),(double)(Double.parseDouble(_j[(int) (10)])));
RDebugUtils.currentLine=4980795;
 //BA.debugLineNum = 4980795;BA.debugLine="sh1.AddCell(c)";
_sh1.AddCell((jxl.write.WritableCell)(_c.getObject()));
RDebugUtils.currentLine=4980796;
 //BA.debugLineNum = 4980796;BA.debugLine="c.InitializeNumber(9,i+1, j(11) ) ' Speed";
_c.InitializeNumber((int) (9),(int) (_i+1),(double)(Double.parseDouble(_j[(int) (11)])));
RDebugUtils.currentLine=4980797;
 //BA.debugLineNum = 4980797;BA.debugLine="sh1.AddCell(c)";
_sh1.AddCell((jxl.write.WritableCell)(_c.getObject()));
RDebugUtils.currentLine=4980798;
 //BA.debugLineNum = 4980798;BA.debugLine="c.InitializeNumber(10,i+1, j(12) ) ' Battery";
_c.InitializeNumber((int) (10),(int) (_i+1),(double)(Double.parseDouble(_j[(int) (12)])));
RDebugUtils.currentLine=4980799;
 //BA.debugLineNum = 4980799;BA.debugLine="sh1.AddCell(c)";
_sh1.AddCell((jxl.write.WritableCell)(_c.getObject()));
RDebugUtils.currentLine=4980800;
 //BA.debugLineNum = 4980800;BA.debugLine="c.InitializeNumber(11,i+1, j(13) ) ' Temp";
_c.InitializeNumber((int) (11),(int) (_i+1),(double)(Double.parseDouble(_j[(int) (13)])));
RDebugUtils.currentLine=4980801;
 //BA.debugLineNum = 4980801;BA.debugLine="sh1.AddCell(c)";
_sh1.AddCell((jxl.write.WritableCell)(_c.getObject()));
RDebugUtils.currentLine=4980802;
 //BA.debugLineNum = 4980802;BA.debugLine="c.InitializeNumber(12,i+1,j(14)) ' Roll";
_c.InitializeNumber((int) (12),(int) (_i+1),(double)(Double.parseDouble(_j[(int) (14)])));
RDebugUtils.currentLine=4980803;
 //BA.debugLineNum = 4980803;BA.debugLine="sh1.AddCell(c)";
_sh1.AddCell((jxl.write.WritableCell)(_c.getObject()));
RDebugUtils.currentLine=4980804;
 //BA.debugLineNum = 4980804;BA.debugLine="c.InitializeNumber(13,i+1,j(15)) ' Pitch";
_c.InitializeNumber((int) (13),(int) (_i+1),(double)(Double.parseDouble(_j[(int) (15)])));
RDebugUtils.currentLine=4980805;
 //BA.debugLineNum = 4980805;BA.debugLine="sh1.AddCell(c)";
_sh1.AddCell((jxl.write.WritableCell)(_c.getObject()));
RDebugUtils.currentLine=4980806;
 //BA.debugLineNum = 4980806;BA.debugLine="c.InitializeNumber(14, i+1,j(16)) ' Ecompass";
_c.InitializeNumber((int) (14),(int) (_i+1),(double)(Double.parseDouble(_j[(int) (16)])));
RDebugUtils.currentLine=4980807;
 //BA.debugLineNum = 4980807;BA.debugLine="sh1.AddCell(c)";
_sh1.AddCell((jxl.write.WritableCell)(_c.getObject()));
 }
};
RDebugUtils.currentLine=4980810;
 //BA.debugLineNum = 4980810;BA.debugLine="WB.Write";
_wb.Write();
RDebugUtils.currentLine=4980811;
 //BA.debugLineNum = 4980811;BA.debugLine="WB.Close";
_wb.Close();
RDebugUtils.currentLine=4980813;
 //BA.debugLineNum = 4980813;BA.debugLine="Dim mf As String";
_mf = "";
RDebugUtils.currentLine=4980815;
 //BA.debugLineNum = 4980815;BA.debugLine="mf = \"file://\" & File.Combine(rp.GetSafeDirDefaul";
_mf = "file://"+anywheresoftware.b4a.keywords.Common.File.Combine(_rp.GetSafeDirDefaultExternal(""),BA.NumberToString(_id)+"_"+BA.ObjectToString(_m.Get((Object)("name")))+".xls");
RDebugUtils.currentLine=4980816;
 //BA.debugLineNum = 4980816;BA.debugLine="Dim intent1 As Intent";
_intent1 = new anywheresoftware.b4a.objects.IntentWrapper();
RDebugUtils.currentLine=4980817;
 //BA.debugLineNum = 4980817;BA.debugLine="intent1.Initialize(intent1.ACTION_VIEW, mf)";
_intent1.Initialize(_intent1.ACTION_VIEW,_mf);
RDebugUtils.currentLine=4980818;
 //BA.debugLineNum = 4980818;BA.debugLine="intent1.SetType(\"application/vnd.ms-excel\")";
_intent1.SetType("application/vnd.ms-excel");
RDebugUtils.currentLine=4980819;
 //BA.debugLineNum = 4980819;BA.debugLine="intent1.WrapAsIntentChooser(\"Choose XLS Viewer\")";
_intent1.WrapAsIntentChooser("Choose XLS Viewer");
RDebugUtils.currentLine=4980820;
 //BA.debugLineNum = 4980820;BA.debugLine="StartActivity(intent1)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(_intent1.getObject()));
RDebugUtils.currentLine=4980821;
 //BA.debugLineNum = 4980821;BA.debugLine="End Sub";
return "";
}
public static String  _btn_init_click() throws Exception{
RDebugUtils.currentModule="actnavigation";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_init_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_init_click", null));}
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Sub btn_init_Click ' Init";
RDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="If mode = 0 Then";
if (_mode==0) { 
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="Starter.b_nav = True";
mostCurrent._starter._b_nav = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=4784131;
 //BA.debugLineNum = 4784131;BA.debugLine="CallSubDelayed3(Starter, \"start_nav\", 0, Array A";
anywheresoftware.b4a.keywords.Common.CallSubDelayed3(processBA,(Object)(mostCurrent._starter.getObject()),"start_nav",(Object)(0),(Object)(new String[]{mostCurrent._edittext1.getText(),mostCurrent._edittext2.getText()}));
RDebugUtils.currentLine=4784132;
 //BA.debugLineNum = 4784132;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=4784133;
 //BA.debugLineNum = 4784133;BA.debugLine="CallSubDelayed( actListTracks, \"finish\" )";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(mostCurrent._actlisttracks.getObject()),"finish");
 }else {
RDebugUtils.currentLine=4784135;
 //BA.debugLineNum = 4784135;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=4784136;
 //BA.debugLineNum = 4784136;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=4784137;
 //BA.debugLineNum = 4784137;BA.debugLine="m.Put( \"id\", id )";
_m.Put((Object)("id"),(Object)(_id));
RDebugUtils.currentLine=4784138;
 //BA.debugLineNum = 4784138;BA.debugLine="DBUtils.UpdateRecord( Starter.sql1, \"navigation\"";
mostCurrent._dbutils._updaterecord(mostCurrent.activityBA,mostCurrent._starter._sql1,"navigation","name",(Object)(mostCurrent._edittext1.getText()),_m);
RDebugUtils.currentLine=4784139;
 //BA.debugLineNum = 4784139;BA.debugLine="DBUtils.UpdateRecord( Starter.sql1, \"navigation\"";
mostCurrent._dbutils._updaterecord(mostCurrent.activityBA,mostCurrent._starter._sql1,"navigation","description",(Object)(mostCurrent._edittext2.getText()),_m);
RDebugUtils.currentLine=4784140;
 //BA.debugLineNum = 4784140;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=4784141;
 //BA.debugLineNum = 4784141;BA.debugLine="CallSubDelayed( actListTracks, \"refresh\" )";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(mostCurrent._actlisttracks.getObject()),"refresh");
 };
RDebugUtils.currentLine=4784143;
 //BA.debugLineNum = 4784143;BA.debugLine="End Sub";
return "";
}
public static String  _btn_kml_click() throws Exception{
RDebugUtils.currentModule="actnavigation";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_kml_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_kml_click", null));}
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _track = null;
String _coor = "";
anywheresoftware.b4a.objects.collections.List _li = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _n = null;
anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
String _mf = "";
anywheresoftware.b4a.objects.IntentWrapper _intent1 = null;
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Sub btn_kml_Click";
RDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="Dim m = DBUtils.ExecuteMap( Starter.sql1, \"select";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = mostCurrent._dbutils._executemap(mostCurrent.activityBA,mostCurrent._starter._sql1,"select * from navigation where [id] = "+BA.NumberToString(_id),(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=5046289;
 //BA.debugLineNum = 5046289;BA.debugLine="Dim sb, track As StringBuilder, coor As String";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
_track = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
_coor = "";
RDebugUtils.currentLine=5046290;
 //BA.debugLineNum = 5046290;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=5046291;
 //BA.debugLineNum = 5046291;BA.debugLine="track.Initialize";
_track.Initialize();
RDebugUtils.currentLine=5046292;
 //BA.debugLineNum = 5046292;BA.debugLine="sb.Append(\"<?xml version=\"& QUOTE & \"1.0\" & QUOTE";
_sb.Append("<?xml version="+anywheresoftware.b4a.keywords.Common.QUOTE+"1.0"+anywheresoftware.b4a.keywords.Common.QUOTE+" encoding="+anywheresoftware.b4a.keywords.Common.QUOTE+"UTF-8"+anywheresoftware.b4a.keywords.Common.QUOTE+"?>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=5046293;
 //BA.debugLineNum = 5046293;BA.debugLine="sb.Append(\"<kml xmlns=\" & QUOTE & \"http://www.ope";
_sb.Append("<kml xmlns="+anywheresoftware.b4a.keywords.Common.QUOTE+"http://www.opengis.net/kml/2.2"+anywheresoftware.b4a.keywords.Common.QUOTE+">").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=5046294;
 //BA.debugLineNum = 5046294;BA.debugLine="sb.Append(\"<Document>\").Append(CRLF)";
_sb.Append("<Document>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=5046297;
 //BA.debugLineNum = 5046297;BA.debugLine="Dim li As List";
_li = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=5046298;
 //BA.debugLineNum = 5046298;BA.debugLine="li = DBUtils.ExecuteMemoryMapList( Starter.sql1,";
_li = mostCurrent._dbutils._executememorymaplist(mostCurrent.activityBA,mostCurrent._starter._sql1,"select * from route5 where [navigation_id] ="+BA.NumberToString(_id),(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0));
RDebugUtils.currentLine=5046300;
 //BA.debugLineNum = 5046300;BA.debugLine="For i = 0 To li.Size - 1";
{
final int step10 = 1;
final int limit10 = (int) (_li.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=5046301;
 //BA.debugLineNum = 5046301;BA.debugLine="Dim n = li.Get(i) As Map";
_n = new anywheresoftware.b4a.objects.collections.Map();
_n.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_li.Get(_i)));
RDebugUtils.currentLine=5046303;
 //BA.debugLineNum = 5046303;BA.debugLine="sb.Append(\"<Placemark>\").Append(CRLF)";
_sb.Append("<Placemark>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=5046304;
 //BA.debugLineNum = 5046304;BA.debugLine="sb.Append(\"<name>\" & n.Get(\"id\") & \"</name>\").";
_sb.Append("<name>"+BA.ObjectToString(_n.Get((Object)("id")))+"</name>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=5046305;
 //BA.debugLineNum = 5046305;BA.debugLine="sb.Append(\"<description>\"& n.Get(\"id\") &\"</des";
_sb.Append("<description>"+BA.ObjectToString(_n.Get((Object)("id")))+"</description>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=5046306;
 //BA.debugLineNum = 5046306;BA.debugLine="sb.Append(\"<ExtendedData>\")";
_sb.Append("<ExtendedData>");
RDebugUtils.currentLine=5046307;
 //BA.debugLineNum = 5046307;BA.debugLine="sb.Append(\"<Data name=\"\"Id\"\"><value>\"&n.Get(\"i";
_sb.Append("<Data name=\"Id\"><value>"+BA.ObjectToString(_n.Get((Object)("id")))+"</value></Data>");
RDebugUtils.currentLine=5046308;
 //BA.debugLineNum = 5046308;BA.debugLine="sb.Append(\"<Data name=\"\"AppWindAngle\"\"><value>";
_sb.Append("<Data name=\"AppWindAngle\"><value>"+BA.ObjectToString(_n.Get((Object)("awa")))+"</value></Data>");
RDebugUtils.currentLine=5046309;
 //BA.debugLineNum = 5046309;BA.debugLine="sb.Append(\"<Data name=\"\"AppWindModule\"\"><value";
_sb.Append("<Data name=\"AppWindModule\"><value>"+BA.ObjectToString(_n.Get((Object)("awm")))+"</value></Data>");
RDebugUtils.currentLine=5046310;
 //BA.debugLineNum = 5046310;BA.debugLine="sb.Append(\"<Data name=\"\"TrueWindAngle\"\"><value";
_sb.Append("<Data name=\"TrueWindAngle\"><value>"+BA.ObjectToString(_n.Get((Object)("twa")))+"</value></Data>");
RDebugUtils.currentLine=5046311;
 //BA.debugLineNum = 5046311;BA.debugLine="sb.Append(\"<Data name=\"\"TrueWindModule\"\"><valu";
_sb.Append("<Data name=\"TrueWindModule\"><value>"+BA.ObjectToString(_n.Get((Object)("twm")))+"</value></Data>");
RDebugUtils.currentLine=5046312;
 //BA.debugLineNum = 5046312;BA.debugLine="sb.Append(\"<Data name=\"\"Bearing\"\"><value>\"&n.G";
_sb.Append("<Data name=\"Bearing\"><value>"+BA.ObjectToString(_n.Get((Object)("bearing")))+"</value></Data>");
RDebugUtils.currentLine=5046313;
 //BA.debugLineNum = 5046313;BA.debugLine="sb.Append(\"<Data name=\"\"Speed\"\"><value>\"&n.Get";
_sb.Append("<Data name=\"Speed\"><value>"+BA.ObjectToString(_n.Get((Object)("speed")))+"</value></Data>");
RDebugUtils.currentLine=5046315;
 //BA.debugLineNum = 5046315;BA.debugLine="sb.Append(\"<Data name=\"\"Battery\"\"><value>\"&n.Get";
_sb.Append("<Data name=\"Battery\"><value>"+BA.ObjectToString(_n.Get((Object)("battery")))+"</value></Data>");
RDebugUtils.currentLine=5046316;
 //BA.debugLineNum = 5046316;BA.debugLine="sb.Append(\"<Data name=\"\"Temp\"\"><value>\"&n.Get(\"t";
_sb.Append("<Data name=\"Temp\"><value>"+BA.ObjectToString(_n.Get((Object)("temp")))+"</value></Data>");
RDebugUtils.currentLine=5046317;
 //BA.debugLineNum = 5046317;BA.debugLine="sb.Append(\"<Data name=\"\"Roll\"\"><value>\"&n.Get(\"r";
_sb.Append("<Data name=\"Roll\"><value>"+BA.ObjectToString(_n.Get((Object)("roll")))+"</value></Data>");
RDebugUtils.currentLine=5046318;
 //BA.debugLineNum = 5046318;BA.debugLine="sb.Append(\"<Data name=\"\"Pitch\"\"><value>\"&n.Get(\"";
_sb.Append("<Data name=\"Pitch\"><value>"+BA.ObjectToString(_n.Get((Object)("pitch")))+"</value></Data>");
RDebugUtils.currentLine=5046319;
 //BA.debugLineNum = 5046319;BA.debugLine="sb.Append(\"<Data name=\"\"Compass\"\"><value>\"&n.Get";
_sb.Append("<Data name=\"Compass\"><value>"+BA.ObjectToString(_n.Get((Object)("ecompass")))+"</value></Data>");
RDebugUtils.currentLine=5046322;
 //BA.debugLineNum = 5046322;BA.debugLine="sb.Append(\"</ExtendedData>\")";
_sb.Append("</ExtendedData>");
RDebugUtils.currentLine=5046323;
 //BA.debugLineNum = 5046323;BA.debugLine="sb.Append(\"<Point>\").Append(CRLF)";
_sb.Append("<Point>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=5046324;
 //BA.debugLineNum = 5046324;BA.debugLine="coor = n.Get(\"lon\") & \",\" & n.Get(\"lat\")   ' L";
_coor = BA.ObjectToString(_n.Get((Object)("lon")))+","+BA.ObjectToString(_n.Get((Object)("lat")));
RDebugUtils.currentLine=5046325;
 //BA.debugLineNum = 5046325;BA.debugLine="sb.Append(\"<coordinates>\" & coor & \"</coordina";
_sb.Append("<coordinates>"+_coor+"</coordinates>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=5046326;
 //BA.debugLineNum = 5046326;BA.debugLine="sb.Append(\"</Point>\").Append(CRLF)";
_sb.Append("</Point>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=5046327;
 //BA.debugLineNum = 5046327;BA.debugLine="sb.Append(\"</Placemark>\").Append(CRLF)";
_sb.Append("</Placemark>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=5046329;
 //BA.debugLineNum = 5046329;BA.debugLine="track.Append(coor).Append(\",0\").Append(CRLF)";
_track.Append(_coor).Append(",0").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 }
};
RDebugUtils.currentLine=5046332;
 //BA.debugLineNum = 5046332;BA.debugLine="sb.Append(\"<Placemark>\").Append(CRLF)";
_sb.Append("<Placemark>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=5046333;
 //BA.debugLineNum = 5046333;BA.debugLine="sb.Append(\"<name>\" & \"Track\" & \"</name>\").Append(";
_sb.Append("<name>"+"Track"+"</name>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=5046334;
 //BA.debugLineNum = 5046334;BA.debugLine="sb.Append(\"<description></description>\").Append(C";
_sb.Append("<description></description>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=5046335;
 //BA.debugLineNum = 5046335;BA.debugLine="sb.Append(\"<LineString>\").Append(CRLF)";
_sb.Append("<LineString>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=5046336;
 //BA.debugLineNum = 5046336;BA.debugLine="sb.Append(\"<tessellate>1</tessellate>\").Append(CR";
_sb.Append("<tessellate>1</tessellate>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=5046338;
 //BA.debugLineNum = 5046338;BA.debugLine="sb.Append(\"<coordinates>\" & track.ToString & \"</c";
_sb.Append("<coordinates>"+_track.ToString()+"</coordinates>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=5046340;
 //BA.debugLineNum = 5046340;BA.debugLine="sb.Append(\"</LineString>\").Append(CRLF)";
_sb.Append("</LineString>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=5046341;
 //BA.debugLineNum = 5046341;BA.debugLine="sb.Append(\"</Placemark>\").Append(CRLF)";
_sb.Append("</Placemark>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=5046342;
 //BA.debugLineNum = 5046342;BA.debugLine="sb.Append(\"</Document>\").Append(CRLF)";
_sb.Append("</Document>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=5046343;
 //BA.debugLineNum = 5046343;BA.debugLine="sb.Append(\"</kml>\").Append(CRLF)";
_sb.Append("</kml>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=5046345;
 //BA.debugLineNum = 5046345;BA.debugLine="Dim rp As RuntimePermissions";
_rp = new anywheresoftware.b4a.objects.RuntimePermissions();
RDebugUtils.currentLine=5046346;
 //BA.debugLineNum = 5046346;BA.debugLine="File.WriteString(rp.GetSafeDirDefaultExternal(\"\")";
anywheresoftware.b4a.keywords.Common.File.WriteString(_rp.GetSafeDirDefaultExternal(""),BA.NumberToString(_id)+"_"+BA.ObjectToString(_m.Get((Object)("name")))+".kml",_sb.ToString());
RDebugUtils.currentLine=5046348;
 //BA.debugLineNum = 5046348;BA.debugLine="Dim mf As String";
_mf = "";
RDebugUtils.currentLine=5046349;
 //BA.debugLineNum = 5046349;BA.debugLine="mf = \"file://\" & File.Combine(rp.GetSafeDirDefaul";
_mf = "file://"+anywheresoftware.b4a.keywords.Common.File.Combine(_rp.GetSafeDirDefaultExternal(""),BA.NumberToString(_id)+"_"+BA.ObjectToString(_m.Get((Object)("name")))+".kml");
RDebugUtils.currentLine=5046350;
 //BA.debugLineNum = 5046350;BA.debugLine="Dim intent1 As Intent";
_intent1 = new anywheresoftware.b4a.objects.IntentWrapper();
RDebugUtils.currentLine=5046351;
 //BA.debugLineNum = 5046351;BA.debugLine="intent1.Initialize(intent1.ACTION_VIEW, mf)";
_intent1.Initialize(_intent1.ACTION_VIEW,_mf);
RDebugUtils.currentLine=5046352;
 //BA.debugLineNum = 5046352;BA.debugLine="intent1.SetType(\"application/vnd.google-earth.kml";
_intent1.SetType("application/vnd.google-earth.kml+xml");
RDebugUtils.currentLine=5046353;
 //BA.debugLineNum = 5046353;BA.debugLine="intent1.WrapAsIntentChooser(\"Choose KML Viewer\")";
_intent1.WrapAsIntentChooser("Choose KML Viewer");
RDebugUtils.currentLine=5046354;
 //BA.debugLineNum = 5046354;BA.debugLine="StartActivity(intent1)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(_intent1.getObject()));
RDebugUtils.currentLine=5046355;
 //BA.debugLineNum = 5046355;BA.debugLine="End Sub";
return "";
}
public static String  _start(String _tipo,int _id1) throws Exception{
RDebugUtils.currentModule="actnavigation";
if (Debug.shouldDelegate(mostCurrent.activityBA, "start"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "start", new Object[] {_tipo,_id1}));}
RDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Sub Start( tipo As String, id1 As Int )";
RDebugUtils.currentLine=4653057;
 //BA.debugLineNum = 4653057;BA.debugLine="id = id1";
_id = _id1;
RDebugUtils.currentLine=4653058;
 //BA.debugLineNum = 4653058;BA.debugLine="If tipo = \"add\" Then";
if ((_tipo).equals("add")) { 
RDebugUtils.currentLine=4653059;
 //BA.debugLineNum = 4653059;BA.debugLine="mode = 0";
_mode = (int) (0);
 }else 
{RDebugUtils.currentLine=4653060;
 //BA.debugLineNum = 4653060;BA.debugLine="Else If tipo = \"edit\" Then";
if ((_tipo).equals("edit")) { 
RDebugUtils.currentLine=4653061;
 //BA.debugLineNum = 4653061;BA.debugLine="mode = 1";
_mode = (int) (1);
 }}
;
RDebugUtils.currentLine=4653063;
 //BA.debugLineNum = 4653063;BA.debugLine="Activity_Resume";
_activity_resume();
RDebugUtils.currentLine=4653064;
 //BA.debugLineNum = 4653064;BA.debugLine="End Sub";
return "";
}
}