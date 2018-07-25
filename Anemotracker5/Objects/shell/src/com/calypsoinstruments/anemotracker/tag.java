
package com.calypsoinstruments.anemotracker;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class tag {
    public static RemoteObject myClass;
	public tag() {
	}
    public static PCBA staticBA = new PCBA(null, tag.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _defaultcolorconstant = RemoteObject.createImmutable(0);
public static RemoteObject _panel1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _lbltext = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblvalue = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblunit = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _atlabel = RemoteObject.declareNull("com.calypsoinstruments.anemotracker.autotextsizelabel");
public static RemoteObject _tagdialog = RemoteObject.declareNull("anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog");
public static RemoteObject _sp_tag = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _sp_unit = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _ltags = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _cvs = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
public static com.calypsoinstruments.anemotracker.main _main = null;
public static com.calypsoinstruments.anemotracker.actble _actble = null;
public static com.calypsoinstruments.anemotracker.actlisttracks _actlisttracks = null;
public static com.calypsoinstruments.anemotracker.actnavigation _actnavigation = null;
public static com.calypsoinstruments.anemotracker.acttcpip _acttcpip = null;
public static com.calypsoinstruments.anemotracker.starter _starter = null;
public static com.calypsoinstruments.anemotracker.dbutils _dbutils = null;
public static com.calypsoinstruments.anemotracker.actcalcomp _actcalcomp = null;
public static com.calypsoinstruments.anemotracker.actdevinfo _actdevinfo = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"atlabel",_ref.getField(false, "_atlabel"),"cvs",_ref.getField(false, "_cvs"),"DefaultColorConstant",_ref.getField(false, "_defaultcolorconstant"),"lblText",_ref.getField(false, "_lbltext"),"lblUnit",_ref.getField(false, "_lblunit"),"lblValue",_ref.getField(false, "_lblvalue"),"lTags",_ref.getField(false, "_ltags"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname"),"Panel1",_ref.getField(false, "_panel1"),"sp_tag",_ref.getField(false, "_sp_tag"),"sp_unit",_ref.getField(false, "_sp_unit"),"TagDialog",_ref.getField(false, "_tagdialog")};
}
}