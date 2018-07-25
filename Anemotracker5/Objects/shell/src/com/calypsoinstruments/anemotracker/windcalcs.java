
package com.calypsoinstruments.anemotracker;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class windcalcs {
    public static RemoteObject myClass;
	public windcalcs() {
	}
    public static PCBA staticBA = new PCBA(null, windcalcs.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _orig_vane = RemoteObject.createImmutable(0f);
public static RemoteObject _orig_anemo = RemoteObject.createImmutable(0f);
public static RemoteObject _vane = RemoteObject.createImmutable(0f);
public static RemoteObject _anemo = RemoteObject.createImmutable(0f);
public static RemoteObject _speed = RemoteObject.createImmutable(0f);
public static RemoteObject _bearing = RemoteObject.createImmutable(0f);
public static RemoteObject _latitude = RemoteObject.createImmutable(0f);
public static RemoteObject _longitude = RemoteObject.createImmutable(0f);
public static RemoteObject _altitude = RemoteObject.createImmutable(0f);
public static RemoteObject _compass = RemoteObject.createImmutable(0f);
public static RemoteObject _awm = RemoteObject.createImmutable(0f);
public static RemoteObject _awa = RemoteObject.createImmutable(0f);
public static RemoteObject _twm = RemoteObject.createImmutable(0f);
public static RemoteObject _twa = RemoteObject.createImmutable(0f);
public static RemoteObject _twn = RemoteObject.createImmutable(0f);
public static RemoteObject _simulated = RemoteObject.createImmutable(false);
public static RemoteObject _swm = RemoteObject.createImmutable(0f);
public static RemoteObject _swa = RemoteObject.createImmutable(0f);
public static RemoteObject _knots = RemoteObject.createImmutable(0f);
public static RemoteObject _speed_min = RemoteObject.createImmutable(0f);
public static RemoteObject _speed_sw = RemoteObject.createImmutable(false);
public static RemoteObject _speed_low = RemoteObject.createImmutable(false);
public static RemoteObject _speed_bearing = RemoteObject.createImmutable(0f);
public static RemoteObject _mean_sw = RemoteObject.createImmutable(false);
public static RemoteObject _offset = RemoteObject.createImmutable(0f);
public static RemoteObject _m_anemo = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _m_x = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _m_y = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _battery = RemoteObject.createImmutable(0);
public static RemoteObject _temp = RemoteObject.createImmutable(0);
public static RemoteObject _roll = RemoteObject.createImmutable(0);
public static RemoteObject _pitch = RemoteObject.createImmutable(0);
public static RemoteObject _ecompass = RemoteObject.createImmutable(0);
public static RemoteObject _kx = RemoteObject.declareNull("com.calypsoinstruments.anemotracker.windcalcs._tkalman");
public static RemoteObject _ky = RemoteObject.declareNull("com.calypsoinstruments.anemotracker.windcalcs._tkalman");
public static RemoteObject _kx2 = RemoteObject.declareNull("com.calypsoinstruments.anemotracker.windcalcs._tkalman2");
public static RemoteObject _ky2 = RemoteObject.declareNull("com.calypsoinstruments.anemotracker.windcalcs._tkalman2");
public static RemoteObject _kx3 = RemoteObject.declareNull("com.calypsoinstruments.anemotracker.windcalcs._tkalman3");
public static RemoteObject _ky3 = RemoteObject.declareNull("com.calypsoinstruments.anemotracker.windcalcs._tkalman3");
public static RemoteObject _refresh_hz = RemoteObject.createImmutable(0f);
public static RemoteObject _selected_compass = RemoteObject.createImmutable(0f);
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
		return new Object[] {"altitude",_ref.getField(false, "_altitude"),"anemo",_ref.getField(false, "_anemo"),"awa",_ref.getField(false, "_awa"),"awm",_ref.getField(false, "_awm"),"battery",_ref.getField(false, "_battery"),"bearing",_ref.getField(false, "_bearing"),"compass",_ref.getField(false, "_compass"),"ecompass",_ref.getField(false, "_ecompass"),"knots",_ref.getField(false, "_knots"),"kX",_ref.getField(false, "_kx"),"kX2",_ref.getField(false, "_kx2"),"kX3",_ref.getField(false, "_kx3"),"kY",_ref.getField(false, "_ky"),"kY2",_ref.getField(false, "_ky2"),"kY3",_ref.getField(false, "_ky3"),"latitude",_ref.getField(false, "_latitude"),"longitude",_ref.getField(false, "_longitude"),"m_anemo",_ref.getField(false, "_m_anemo"),"m_x",_ref.getField(false, "_m_x"),"m_y",_ref.getField(false, "_m_y"),"mean_sw",_ref.getField(false, "_mean_sw"),"offset",_ref.getField(false, "_offset"),"orig_anemo",_ref.getField(false, "_orig_anemo"),"orig_vane",_ref.getField(false, "_orig_vane"),"pitch",_ref.getField(false, "_pitch"),"refresh_hz",_ref.getField(false, "_refresh_hz"),"roll",_ref.getField(false, "_roll"),"selected_compass",_ref.getField(false, "_selected_compass"),"simulated",_ref.getField(false, "_simulated"),"speed",_ref.getField(false, "_speed"),"speed_bearing",_ref.getField(false, "_speed_bearing"),"speed_low",_ref.getField(false, "_speed_low"),"speed_min",_ref.getField(false, "_speed_min"),"speed_sw",_ref.getField(false, "_speed_sw"),"swa",_ref.getField(false, "_swa"),"swm",_ref.getField(false, "_swm"),"temp",_ref.getField(false, "_temp"),"twa",_ref.getField(false, "_twa"),"twm",_ref.getField(false, "_twm"),"twN",_ref.getField(false, "_twn"),"vane",_ref.getField(false, "_vane")};
}
}