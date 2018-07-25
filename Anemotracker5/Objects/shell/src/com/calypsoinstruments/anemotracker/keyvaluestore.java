
package com.calypsoinstruments.anemotracker;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class keyvaluestore {
    public static RemoteObject myClass;
	public keyvaluestore() {
	}
    public static PCBA staticBA = new PCBA(null, keyvaluestore.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _sql1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
public static RemoteObject _tempfolder = RemoteObject.createImmutable("");
public static RemoteObject _tempfile = RemoteObject.createImmutable("");
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
		return new Object[] {"sql1",_ref.getField(false, "_sql1"),"tempFile",_ref.getField(false, "_tempfile"),"tempFolder",_ref.getField(false, "_tempfolder")};
}
}