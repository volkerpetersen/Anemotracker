package com.calypsoinstruments.anemotracker;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class keyvaluestore_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private sql1 As SQL";
keyvaluestore._sql1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");__ref.setField("_sql1",keyvaluestore._sql1);
 //BA.debugLineNum = 4;BA.debugLine="Private tempFolder = File.DirInternalCache, tempF";
keyvaluestore._tempfolder = keyvaluestore.__c.getField(false,"File").runMethod(true,"getDirInternalCache");__ref.setField("_tempfolder",keyvaluestore._tempfolder);
keyvaluestore._tempfile = BA.ObjectToString("key_value_temp.dat");__ref.setField("_tempfile",keyvaluestore._tempfile);
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _close(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Close (keyvaluestore) ","keyvaluestore",7,__ref.getField(false, "ba"),__ref,157);
if (RapidSub.canDelegate("close")) { return __ref.runUserSub(false, "keyvaluestore","close", __ref);}
 BA.debugLineNum = 157;BA.debugLine="Public Sub Close";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 158;BA.debugLine="sql1.Close";
Debug.ShouldStop(536870912);
__ref.getField(false,"_sql1").runVoidMethod ("Close");
 BA.debugLineNum = 159;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _complete(RemoteObject __ref,RemoteObject _success) throws Exception{
try {
		Debug.PushSubsStack("complete (keyvaluestore) ","keyvaluestore",7,__ref.getField(false, "ba"),__ref,200);
if (RapidSub.canDelegate("complete")) { return __ref.runUserSub(false, "keyvaluestore","complete", __ref, _success);}
Debug.locals.put("success", _success);
 BA.debugLineNum = 200;BA.debugLine="Private Sub complete(success As Boolean) As Boolea";
Debug.ShouldStop(128);
 BA.debugLineNum = 201;BA.debugLine="If success Then";
Debug.ShouldStop(256);
if (_success.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 202;BA.debugLine="sql1.TransactionSuccessful";
Debug.ShouldStop(512);
__ref.getField(false,"_sql1").runVoidMethod ("TransactionSuccessful");
 }else {
 BA.debugLineNum = 204;BA.debugLine="Log(\"Error saving object: \" & LastException)";
Debug.ShouldStop(2048);
keyvaluestore.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error saving object: "),keyvaluestore.__c.runMethod(false,"LastException",__ref.runMethod(false,"getActivityBA")))));
 };
 BA.debugLineNum = 206;BA.debugLine="sql1.EndTransaction";
Debug.ShouldStop(8192);
__ref.getField(false,"_sql1").runVoidMethod ("EndTransaction");
 BA.debugLineNum = 207;BA.debugLine="Return success";
Debug.ShouldStop(16384);
if (true) return _success;
 BA.debugLineNum = 208;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _containskey(RemoteObject __ref,RemoteObject _key) throws Exception{
try {
		Debug.PushSubsStack("ContainsKey (keyvaluestore) ","keyvaluestore",7,__ref.getField(false, "ba"),__ref,89);
if (RapidSub.canDelegate("containskey")) { return __ref.runUserSub(false, "keyvaluestore","containskey", __ref, _key);}
Debug.locals.put("Key", _key);
 BA.debugLineNum = 89;BA.debugLine="Public Sub ContainsKey(Key As String) As Boolean";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 90;BA.debugLine="Return sql1.ExecQuerySingleResult2(\"SELECT count(";
Debug.ShouldStop(33554432);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean(">",BA.numberCast(double.class, __ref.getField(false,"_sql1").runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("SELECT count(key) FROM main WHERE key = ?")),(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {_key})))),BA.numberCast(double.class, 0)));
 BA.debugLineNum = 92;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createtable(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateTable (keyvaluestore) ","keyvaluestore",7,__ref.getField(false, "ba"),__ref,191);
if (RapidSub.canDelegate("createtable")) { return __ref.runUserSub(false, "keyvaluestore","createtable", __ref);}
 BA.debugLineNum = 191;BA.debugLine="Private Sub CreateTable";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 192;BA.debugLine="sql1.ExecNonQuery(\"CREATE TABLE IF NOT EXISTS mai";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_sql1").runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS main(key TEXT PRIMARY KEY, value NONE)")));
 BA.debugLineNum = 193;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _deleteall(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DeleteAll (keyvaluestore) ","keyvaluestore",7,__ref.getField(false, "ba"),__ref,95);
if (RapidSub.canDelegate("deleteall")) { return __ref.runUserSub(false, "keyvaluestore","deleteall", __ref);}
 BA.debugLineNum = 95;BA.debugLine="Public Sub DeleteAll";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 96;BA.debugLine="sql1.ExecNonQuery(\"DROP TABLE main\")";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_sql1").runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("DROP TABLE main")));
 BA.debugLineNum = 97;BA.debugLine="CreateTable";
Debug.ShouldStop(1);
__ref.runClassMethod (com.calypsoinstruments.anemotracker.keyvaluestore.class, "_createtable");
 BA.debugLineNum = 98;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbitmap(RemoteObject __ref,RemoteObject _key) throws Exception{
try {
		Debug.PushSubsStack("GetBitmap (keyvaluestore) ","keyvaluestore",7,__ref.getField(false, "ba"),__ref,129);
if (RapidSub.canDelegate("getbitmap")) { return __ref.runUserSub(false, "keyvaluestore","getbitmap", __ref, _key);}
RemoteObject _c = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _buffer = null;
RemoteObject _in = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
Debug.locals.put("Key", _key);
 BA.debugLineNum = 129;BA.debugLine="Public Sub GetBitmap(Key As String) As Bitmap";
Debug.ShouldStop(1);
 BA.debugLineNum = 130;BA.debugLine="Dim c As Cursor = getCursor(Key)";
Debug.ShouldStop(2);
_c = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_c = __ref.runClassMethod (com.calypsoinstruments.anemotracker.keyvaluestore.class, "_getcursor",(Object)(_key));Debug.locals.put("c", _c);Debug.locals.put("c", _c);
 BA.debugLineNum = 131;BA.debugLine="Dim b As Bitmap";
Debug.ShouldStop(4);
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("b", _b);
 BA.debugLineNum = 132;BA.debugLine="If c.RowCount = 0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_c.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 133;BA.debugLine="c.Close";
Debug.ShouldStop(16);
_c.runVoidMethod ("Close");
 BA.debugLineNum = 134;BA.debugLine="Return b";
Debug.ShouldStop(32);
if (true) return _b;
 };
 BA.debugLineNum = 136;BA.debugLine="c.Position = 0";
Debug.ShouldStop(128);
_c.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 137;BA.debugLine="Dim buffer() As Byte = c.GetBlob2(0)";
Debug.ShouldStop(256);
_buffer = _c.runMethod(false,"GetBlob2",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("buffer", _buffer);Debug.locals.put("buffer", _buffer);
 BA.debugLineNum = 138;BA.debugLine="Dim In As InputStream";
Debug.ShouldStop(512);
_in = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");Debug.locals.put("In", _in);
 BA.debugLineNum = 139;BA.debugLine="In.InitializeFromBytesArray(buffer, 0, buffer.Len";
Debug.ShouldStop(1024);
_in.runVoidMethod ("InitializeFromBytesArray",(Object)(_buffer),(Object)(BA.numberCast(int.class, 0)),(Object)(_buffer.getField(true,"length")));
 BA.debugLineNum = 140;BA.debugLine="b.Initialize2(In)";
Debug.ShouldStop(2048);
_b.runVoidMethod ("Initialize2",(Object)((_in.getObject())));
 BA.debugLineNum = 141;BA.debugLine="In.Close";
Debug.ShouldStop(4096);
_in.runVoidMethod ("Close");
 BA.debugLineNum = 142;BA.debugLine="c.Close";
Debug.ShouldStop(8192);
_c.runVoidMethod ("Close");
 BA.debugLineNum = 143;BA.debugLine="Return b";
Debug.ShouldStop(16384);
if (true) return _b;
 BA.debugLineNum = 144;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcursor(RemoteObject __ref,RemoteObject _key) throws Exception{
try {
		Debug.PushSubsStack("getCursor (keyvaluestore) ","keyvaluestore",7,__ref.getField(false, "ba"),__ref,182);
if (RapidSub.canDelegate("getcursor")) { return __ref.runUserSub(false, "keyvaluestore","getcursor", __ref, _key);}
Debug.locals.put("Key", _key);
 BA.debugLineNum = 182;BA.debugLine="Private Sub getCursor(Key As String) As Cursor";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 183;BA.debugLine="Return sql1.ExecQuery2(\"SELECT value FROM main WH";
Debug.ShouldStop(4194304);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), __ref.getField(false,"_sql1").runMethod(false,"ExecQuery2",(Object)(BA.ObjectToString("SELECT value FROM main WHERE key = ?")),(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {_key}))));
 BA.debugLineNum = 184;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getencryptedobject(RemoteObject __ref,RemoteObject _key,RemoteObject _password) throws Exception{
try {
		Debug.PushSubsStack("GetEncryptedObject (keyvaluestore) ","keyvaluestore",7,__ref.getField(false, "ba"),__ref,152);
if (RapidSub.canDelegate("getencryptedobject")) { return __ref.runUserSub(false, "keyvaluestore","getencryptedobject", __ref, _key, _password);}
Debug.locals.put("Key", _key);
Debug.locals.put("Password", _password);
 BA.debugLineNum = 152;BA.debugLine="Public Sub GetEncryptedObject(Key As String, Passw";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 153;BA.debugLine="Return getObjectInternal(Key, True, Password)";
Debug.ShouldStop(16777216);
if (true) return __ref.runClassMethod (com.calypsoinstruments.anemotracker.keyvaluestore.class, "_getobjectinternal",(Object)(_key),(Object)(keyvaluestore.__c.getField(true,"True")),(Object)(_password));
 BA.debugLineNum = 154;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getinputstream(RemoteObject __ref,RemoteObject _key) throws Exception{
try {
		Debug.PushSubsStack("GetInputStream (keyvaluestore) ","keyvaluestore",7,__ref.getField(false, "ba"),__ref,114);
if (RapidSub.canDelegate("getinputstream")) { return __ref.runUserSub(false, "keyvaluestore","getinputstream", __ref, _key);}
RemoteObject _c = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _buffer = null;
RemoteObject _in = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
Debug.locals.put("Key", _key);
 BA.debugLineNum = 114;BA.debugLine="Public Sub GetInputStream(Key As String) As InputS";
Debug.ShouldStop(131072);
 BA.debugLineNum = 115;BA.debugLine="Dim c As Cursor = getCursor(Key)";
Debug.ShouldStop(262144);
_c = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_c = __ref.runClassMethod (com.calypsoinstruments.anemotracker.keyvaluestore.class, "_getcursor",(Object)(_key));Debug.locals.put("c", _c);Debug.locals.put("c", _c);
 BA.debugLineNum = 116;BA.debugLine="If c.RowCount = 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_c.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 117;BA.debugLine="c.Close";
Debug.ShouldStop(1048576);
_c.runVoidMethod ("Close");
 BA.debugLineNum = 118;BA.debugLine="Return Null";
Debug.ShouldStop(2097152);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper"), keyvaluestore.__c.getField(false,"Null"));
 };
 BA.debugLineNum = 120;BA.debugLine="c.Position = 0";
Debug.ShouldStop(8388608);
_c.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 121;BA.debugLine="Dim buffer() As Byte = c.GetBlob2(0)";
Debug.ShouldStop(16777216);
_buffer = _c.runMethod(false,"GetBlob2",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("buffer", _buffer);Debug.locals.put("buffer", _buffer);
 BA.debugLineNum = 122;BA.debugLine="Dim In As InputStream";
Debug.ShouldStop(33554432);
_in = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");Debug.locals.put("In", _in);
 BA.debugLineNum = 123;BA.debugLine="In.InitializeFromBytesArray(buffer, 0, buffer.Len";
Debug.ShouldStop(67108864);
_in.runVoidMethod ("InitializeFromBytesArray",(Object)(_buffer),(Object)(BA.numberCast(int.class, 0)),(Object)(_buffer.getField(true,"length")));
 BA.debugLineNum = 124;BA.debugLine="c.Close";
Debug.ShouldStop(134217728);
_c.runVoidMethod ("Close");
 BA.debugLineNum = 125;BA.debugLine="Return In";
Debug.ShouldStop(268435456);
if (true) return _in;
 BA.debugLineNum = 126;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getobject(RemoteObject __ref,RemoteObject _key) throws Exception{
try {
		Debug.PushSubsStack("GetObject (keyvaluestore) ","keyvaluestore",7,__ref.getField(false, "ba"),__ref,147);
if (RapidSub.canDelegate("getobject")) { return __ref.runUserSub(false, "keyvaluestore","getobject", __ref, _key);}
Debug.locals.put("Key", _key);
 BA.debugLineNum = 147;BA.debugLine="Public Sub GetObject(Key As String) As Object";
Debug.ShouldStop(262144);
 BA.debugLineNum = 148;BA.debugLine="Return getObjectInternal(Key, False, \"\")";
Debug.ShouldStop(524288);
if (true) return __ref.runClassMethod (com.calypsoinstruments.anemotracker.keyvaluestore.class, "_getobjectinternal",(Object)(_key),(Object)(keyvaluestore.__c.getField(true,"False")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 149;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getobjectinternal(RemoteObject __ref,RemoteObject _key,RemoteObject _decrypt,RemoteObject _password) throws Exception{
try {
		Debug.PushSubsStack("getObjectInternal (keyvaluestore) ","keyvaluestore",7,__ref.getField(false, "ba"),__ref,161);
if (RapidSub.canDelegate("getobjectinternal")) { return __ref.runUserSub(false, "keyvaluestore","getobjectinternal", __ref, _key, _decrypt, _password);}
RemoteObject _c = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _buffer = null;
RemoteObject _raf = RemoteObject.declareNull("anywheresoftware.b4a.randomaccessfile.RandomAccessFile");
RemoteObject _res = RemoteObject.declareNull("Object");
Debug.locals.put("Key", _key);
Debug.locals.put("decrypt", _decrypt);
Debug.locals.put("password", _password);
 BA.debugLineNum = 161;BA.debugLine="Private Sub getObjectInternal(Key As String, decry";
Debug.ShouldStop(1);
 BA.debugLineNum = 162;BA.debugLine="Dim c As Cursor = getCursor(Key)";
Debug.ShouldStop(2);
_c = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_c = __ref.runClassMethod (com.calypsoinstruments.anemotracker.keyvaluestore.class, "_getcursor",(Object)(_key));Debug.locals.put("c", _c);Debug.locals.put("c", _c);
 BA.debugLineNum = 163;BA.debugLine="If c.RowCount = 0 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_c.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 164;BA.debugLine="c.Close";
Debug.ShouldStop(8);
_c.runVoidMethod ("Close");
 BA.debugLineNum = 165;BA.debugLine="Return Null";
Debug.ShouldStop(16);
if (true) return keyvaluestore.__c.getField(false,"Null");
 };
 BA.debugLineNum = 167;BA.debugLine="c.Position = 0";
Debug.ShouldStop(64);
_c.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 168;BA.debugLine="Dim buffer() As Byte = c.GetBlob2(0)";
Debug.ShouldStop(128);
_buffer = _c.runMethod(false,"GetBlob2",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("buffer", _buffer);Debug.locals.put("buffer", _buffer);
 BA.debugLineNum = 169;BA.debugLine="Dim raf As RandomAccessFile";
Debug.ShouldStop(256);
_raf = RemoteObject.createNew ("anywheresoftware.b4a.randomaccessfile.RandomAccessFile");Debug.locals.put("raf", _raf);
 BA.debugLineNum = 170;BA.debugLine="raf.Initialize3(buffer, False)";
Debug.ShouldStop(512);
_raf.runVoidMethod ("Initialize3",(Object)(_buffer),(Object)(keyvaluestore.__c.getField(true,"False")));
 BA.debugLineNum = 171;BA.debugLine="Dim res As Object";
Debug.ShouldStop(1024);
_res = RemoteObject.createNew ("Object");Debug.locals.put("res", _res);
 BA.debugLineNum = 172;BA.debugLine="If decrypt Then";
Debug.ShouldStop(2048);
if (_decrypt.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 173;BA.debugLine="res = raf.ReadEncryptedObject(password, raf.Curr";
Debug.ShouldStop(4096);
_res = _raf.runMethod(false,"ReadEncryptedObject",(Object)(_password),(Object)(_raf.getField(true,"CurrentPosition")));Debug.locals.put("res", _res);
 }else {
 BA.debugLineNum = 175;BA.debugLine="res = raf.ReadObject(raf.CurrentPosition)";
Debug.ShouldStop(16384);
_res = _raf.runMethod(false,"ReadObject",(Object)(_raf.getField(true,"CurrentPosition")));Debug.locals.put("res", _res);
 };
 BA.debugLineNum = 177;BA.debugLine="raf.Close";
Debug.ShouldStop(65536);
_raf.runVoidMethod ("Close");
 BA.debugLineNum = 178;BA.debugLine="c.Close";
Debug.ShouldStop(131072);
_c.runVoidMethod ("Close");
 BA.debugLineNum = 179;BA.debugLine="Return res";
Debug.ShouldStop(262144);
if (true) return _res;
 BA.debugLineNum = 180;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsimple(RemoteObject __ref,RemoteObject _key) throws Exception{
try {
		Debug.PushSubsStack("GetSimple (keyvaluestore) ","keyvaluestore",7,__ref.getField(false, "ba"),__ref,101);
if (RapidSub.canDelegate("getsimple")) { return __ref.runUserSub(false, "keyvaluestore","getsimple", __ref, _key);}
RemoteObject _c = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _res = RemoteObject.createImmutable("");
Debug.locals.put("Key", _key);
 BA.debugLineNum = 101;BA.debugLine="Public Sub GetSimple(Key As String) As String";
Debug.ShouldStop(16);
 BA.debugLineNum = 102;BA.debugLine="Dim c As Cursor = getCursor(Key)";
Debug.ShouldStop(32);
_c = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_c = __ref.runClassMethod (com.calypsoinstruments.anemotracker.keyvaluestore.class, "_getcursor",(Object)(_key));Debug.locals.put("c", _c);Debug.locals.put("c", _c);
 BA.debugLineNum = 103;BA.debugLine="If c.RowCount = 0 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_c.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 104;BA.debugLine="c.Close";
Debug.ShouldStop(128);
_c.runVoidMethod ("Close");
 BA.debugLineNum = 105;BA.debugLine="Return \"\"";
Debug.ShouldStop(256);
if (true) return BA.ObjectToString("");
 };
 BA.debugLineNum = 107;BA.debugLine="c.Position = 0";
Debug.ShouldStop(1024);
_c.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 108;BA.debugLine="Dim res As String = c.GetString2(0)";
Debug.ShouldStop(2048);
_res = _c.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 109;BA.debugLine="c.Close";
Debug.ShouldStop(4096);
_c.runVoidMethod ("Close");
 BA.debugLineNum = 110;BA.debugLine="Return res";
Debug.ShouldStop(8192);
if (true) return _res;
 BA.debugLineNum = 111;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _dir,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("Initialize (keyvaluestore) ","keyvaluestore",7,__ref.getField(false, "ba"),__ref,8);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "keyvaluestore","initialize", __ref, _ba, _dir, _filename);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize (Dir As String, FileName As";
Debug.ShouldStop(128);
 BA.debugLineNum = 9;BA.debugLine="If sql1.IsInitialized Then sql1.Close";
Debug.ShouldStop(256);
if (__ref.getField(false,"_sql1").runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
__ref.getField(false,"_sql1").runVoidMethod ("Close");};
 BA.debugLineNum = 10;BA.debugLine="sql1.Initialize(Dir, FileName, True)";
Debug.ShouldStop(512);
__ref.getField(false,"_sql1").runVoidMethod ("Initialize",(Object)(_dir),(Object)(_filename),(Object)(keyvaluestore.__c.getField(true,"True")));
 BA.debugLineNum = 11;BA.debugLine="CreateTable";
Debug.ShouldStop(1024);
__ref.runClassMethod (com.calypsoinstruments.anemotracker.keyvaluestore.class, "_createtable");
 BA.debugLineNum = 12;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _insertquery(RemoteObject __ref,RemoteObject _key,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("insertQuery (keyvaluestore) ","keyvaluestore",7,__ref.getField(false, "ba"),__ref,186);
if (RapidSub.canDelegate("insertquery")) { return __ref.runUserSub(false, "keyvaluestore","insertquery", __ref, _key, _value);}
Debug.locals.put("Key", _key);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 186;BA.debugLine="Private Sub insertQuery(Key As String, Value As Ob";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 187;BA.debugLine="sql1.ExecNonQuery2(\"INSERT INTO main VALUES(?, ?)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_sql1").runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("INSERT INTO main VALUES(?, ?)")),(Object)(keyvaluestore.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_key),_value})))));
 BA.debugLineNum = 188;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listkeys(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ListKeys (keyvaluestore) ","keyvaluestore",7,__ref.getField(false, "ba"),__ref,77);
if (RapidSub.canDelegate("listkeys")) { return __ref.runUserSub(false, "keyvaluestore","listkeys", __ref);}
RemoteObject _c = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _row = 0;
 BA.debugLineNum = 77;BA.debugLine="Public Sub ListKeys As List";
Debug.ShouldStop(4096);
 BA.debugLineNum = 78;BA.debugLine="Dim c As Cursor = sql1.ExecQuery(\"SELECT key FROM";
Debug.ShouldStop(8192);
_c = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_c.setObject(__ref.getField(false,"_sql1").runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT key FROM main"))));Debug.locals.put("c", _c);
 BA.debugLineNum = 79;BA.debugLine="Dim res As List";
Debug.ShouldStop(16384);
_res = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("res", _res);
 BA.debugLineNum = 80;BA.debugLine="res.Initialize";
Debug.ShouldStop(32768);
_res.runVoidMethod ("Initialize");
 BA.debugLineNum = 81;BA.debugLine="For row = 0 To c.RowCount - 1";
Debug.ShouldStop(65536);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_c.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = 0 ;
for (;(step4 > 0 && _row <= limit4) || (step4 < 0 && _row >= limit4) ;_row = ((int)(0 + _row + step4))  ) {
Debug.locals.put("row", _row);
 BA.debugLineNum = 82;BA.debugLine="c.Position = row";
Debug.ShouldStop(131072);
_c.runMethod(true,"setPosition",BA.numberCast(int.class, _row));
 BA.debugLineNum = 83;BA.debugLine="res.Add(c.GetString2(0))";
Debug.ShouldStop(262144);
_res.runVoidMethod ("Add",(Object)((_c.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, 0))))));
 }
}Debug.locals.put("row", _row);
;
 BA.debugLineNum = 85;BA.debugLine="Return res";
Debug.ShouldStop(1048576);
if (true) return _res;
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _putbitmap(RemoteObject __ref,RemoteObject _key,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("PutBitmap (keyvaluestore) ","keyvaluestore",7,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("putbitmap")) { return __ref.runUserSub(false, "keyvaluestore","putbitmap", __ref, _key, _value);}
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
Debug.locals.put("Key", _key);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 40;BA.debugLine="Public Sub PutBitmap(Key As String, Value As Bitma";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="Try";
Debug.ShouldStop(256);
try { BA.debugLineNum = 42;BA.debugLine="start(Key)";
Debug.ShouldStop(512);
__ref.runClassMethod (com.calypsoinstruments.anemotracker.keyvaluestore.class, "_start",(Object)(_key));
 BA.debugLineNum = 43;BA.debugLine="Dim out As OutputStream";
Debug.ShouldStop(1024);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("out", _out);
 BA.debugLineNum = 44;BA.debugLine="out.InitializeToBytesArray(100)";
Debug.ShouldStop(2048);
_out.runVoidMethod ("InitializeToBytesArray",(Object)(BA.numberCast(int.class, 100)));
 BA.debugLineNum = 45;BA.debugLine="Dim b As Bitmap = Value";
Debug.ShouldStop(4096);
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
_b = _value;Debug.locals.put("b", _b);Debug.locals.put("b", _b);
 BA.debugLineNum = 46;BA.debugLine="b.WriteToStream(out, 100, \"PNG\")";
Debug.ShouldStop(8192);
_b.runVoidMethod ("WriteToStream",(Object)((_out.getObject())),(Object)(BA.numberCast(int.class, 100)),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Bitmap.CompressFormat"),RemoteObject.createImmutable("PNG"))));
 BA.debugLineNum = 47;BA.debugLine="insertQuery(Key, out.ToBytesArray)";
Debug.ShouldStop(16384);
__ref.runClassMethod (com.calypsoinstruments.anemotracker.keyvaluestore.class, "_insertquery",(Object)(_key),(Object)((_out.runMethod(false,"ToBytesArray"))));
 BA.debugLineNum = 48;BA.debugLine="out.Close";
Debug.ShouldStop(32768);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 49;BA.debugLine="Return complete(True)";
Debug.ShouldStop(65536);
Debug.CheckDeviceExceptions();if (true) return __ref.runClassMethod (com.calypsoinstruments.anemotracker.keyvaluestore.class, "_complete",(Object)(keyvaluestore.__c.getField(true,"True")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e11) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e11.toString()); BA.debugLineNum = 51;BA.debugLine="Return complete(False)";
Debug.ShouldStop(262144);
if (true) return __ref.runClassMethod (com.calypsoinstruments.anemotracker.keyvaluestore.class, "_complete",(Object)(keyvaluestore.__c.getField(true,"False")));
 };
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _putencyptedobject(RemoteObject __ref,RemoteObject _key,RemoteObject _value,RemoteObject _password) throws Exception{
try {
		Debug.PushSubsStack("PutEncyptedObject (keyvaluestore) ","keyvaluestore",7,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("putencyptedobject")) { return __ref.runUserSub(false, "keyvaluestore","putencyptedobject", __ref, _key, _value, _password);}
Debug.locals.put("Key", _key);
Debug.locals.put("Value", _value);
Debug.locals.put("Password", _password);
 BA.debugLineNum = 35;BA.debugLine="Public Sub PutEncyptedObject(Key As String, Value";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="Return putObjectInternal(Key, Value, True, Passwo";
Debug.ShouldStop(8);
if (true) return __ref.runClassMethod (com.calypsoinstruments.anemotracker.keyvaluestore.class, "_putobjectinternal",(Object)(_key),(Object)(_value),(Object)(keyvaluestore.__c.getField(true,"True")),(Object)(_password));
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _putinputstream(RemoteObject __ref,RemoteObject _key,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("PutInputStream (keyvaluestore) ","keyvaluestore",7,__ref.getField(false, "ba"),__ref,56);
if (RapidSub.canDelegate("putinputstream")) { return __ref.runUserSub(false, "keyvaluestore","putinputstream", __ref, _key, _value);}
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
Debug.locals.put("Key", _key);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 56;BA.debugLine="Public Sub PutInputStream(Key As String, Value As";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 57;BA.debugLine="Try";
Debug.ShouldStop(16777216);
try { BA.debugLineNum = 58;BA.debugLine="start(Key)";
Debug.ShouldStop(33554432);
__ref.runClassMethod (com.calypsoinstruments.anemotracker.keyvaluestore.class, "_start",(Object)(_key));
 BA.debugLineNum = 59;BA.debugLine="Dim out As OutputStream";
Debug.ShouldStop(67108864);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("out", _out);
 BA.debugLineNum = 60;BA.debugLine="out.InitializeToBytesArray(100)";
Debug.ShouldStop(134217728);
_out.runVoidMethod ("InitializeToBytesArray",(Object)(BA.numberCast(int.class, 100)));
 BA.debugLineNum = 61;BA.debugLine="File.Copy2(Value, out)";
Debug.ShouldStop(268435456);
keyvaluestore.__c.getField(false,"File").runVoidMethod ("Copy2",(Object)((_value.getObject())),(Object)((_out.getObject())));
 BA.debugLineNum = 62;BA.debugLine="Value.Close";
Debug.ShouldStop(536870912);
_value.runVoidMethod ("Close");
 BA.debugLineNum = 63;BA.debugLine="insertQuery(Key, out.ToBytesArray)";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (com.calypsoinstruments.anemotracker.keyvaluestore.class, "_insertquery",(Object)(_key),(Object)((_out.runMethod(false,"ToBytesArray"))));
 BA.debugLineNum = 64;BA.debugLine="out.Close";
Debug.ShouldStop(-2147483648);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 65;BA.debugLine="Return complete(True)";
Debug.ShouldStop(1);
Debug.CheckDeviceExceptions();if (true) return __ref.runClassMethod (com.calypsoinstruments.anemotracker.keyvaluestore.class, "_complete",(Object)(keyvaluestore.__c.getField(true,"True")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e11) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e11.toString()); BA.debugLineNum = 67;BA.debugLine="Return complete(False)";
Debug.ShouldStop(4);
if (true) return __ref.runClassMethod (com.calypsoinstruments.anemotracker.keyvaluestore.class, "_complete",(Object)(keyvaluestore.__c.getField(true,"False")));
 };
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _putobject(RemoteObject __ref,RemoteObject _key,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("PutObject (keyvaluestore) ","keyvaluestore",7,__ref.getField(false, "ba"),__ref,30);
if (RapidSub.canDelegate("putobject")) { return __ref.runUserSub(false, "keyvaluestore","putobject", __ref, _key, _value);}
Debug.locals.put("Key", _key);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 30;BA.debugLine="Public Sub PutObject(Key As String, Value As Objec";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 31;BA.debugLine="Return putObjectInternal(Key, Value, False, \"\")";
Debug.ShouldStop(1073741824);
if (true) return __ref.runClassMethod (com.calypsoinstruments.anemotracker.keyvaluestore.class, "_putobjectinternal",(Object)(_key),(Object)(_value),(Object)(keyvaluestore.__c.getField(true,"False")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _putobjectinternal(RemoteObject __ref,RemoteObject _key,RemoteObject _value,RemoteObject _encrypt,RemoteObject _password) throws Exception{
try {
		Debug.PushSubsStack("putObjectInternal (keyvaluestore) ","keyvaluestore",7,__ref.getField(false, "ba"),__ref,210);
if (RapidSub.canDelegate("putobjectinternal")) { return __ref.runUserSub(false, "keyvaluestore","putobjectinternal", __ref, _key, _value, _encrypt, _password);}
RemoteObject _raf = RemoteObject.declareNull("anywheresoftware.b4a.randomaccessfile.RandomAccessFile");
RemoteObject _buffer = null;
Debug.locals.put("Key", _key);
Debug.locals.put("Value", _value);
Debug.locals.put("encrypt", _encrypt);
Debug.locals.put("password", _password);
 BA.debugLineNum = 210;BA.debugLine="Private Sub putObjectInternal(Key As String, Value";
Debug.ShouldStop(131072);
 BA.debugLineNum = 211;BA.debugLine="Try";
Debug.ShouldStop(262144);
try { BA.debugLineNum = 212;BA.debugLine="start(Key)";
Debug.ShouldStop(524288);
__ref.runClassMethod (com.calypsoinstruments.anemotracker.keyvaluestore.class, "_start",(Object)(_key));
 BA.debugLineNum = 213;BA.debugLine="Dim raf As RandomAccessFile";
Debug.ShouldStop(1048576);
_raf = RemoteObject.createNew ("anywheresoftware.b4a.randomaccessfile.RandomAccessFile");Debug.locals.put("raf", _raf);
 BA.debugLineNum = 214;BA.debugLine="File.Delete(tempFolder, tempFile)";
Debug.ShouldStop(2097152);
keyvaluestore.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(__ref.getField(true,"_tempfolder")),(Object)(__ref.getField(true,"_tempfile")));
 BA.debugLineNum = 215;BA.debugLine="raf.Initialize(tempFolder, tempFile, False)";
Debug.ShouldStop(4194304);
_raf.runVoidMethod ("Initialize",(Object)(__ref.getField(true,"_tempfolder")),(Object)(__ref.getField(true,"_tempfile")),(Object)(keyvaluestore.__c.getField(true,"False")));
 BA.debugLineNum = 216;BA.debugLine="If encrypt Then";
Debug.ShouldStop(8388608);
if (_encrypt.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 217;BA.debugLine="raf.WriteEncryptedObject(Value, password, raf.C";
Debug.ShouldStop(16777216);
_raf.runVoidMethod ("WriteEncryptedObject",(Object)(_value),(Object)(_password),(Object)(_raf.getField(true,"CurrentPosition")));
 }else {
 BA.debugLineNum = 219;BA.debugLine="raf.WriteObject(Value, True, raf.CurrentPositio";
Debug.ShouldStop(67108864);
_raf.runVoidMethod ("WriteObject",(Object)(_value),(Object)(keyvaluestore.__c.getField(true,"True")),(Object)(_raf.getField(true,"CurrentPosition")));
 };
 BA.debugLineNum = 221;BA.debugLine="raf.Flush";
Debug.ShouldStop(268435456);
_raf.runVoidMethod ("Flush");
 BA.debugLineNum = 222;BA.debugLine="Dim buffer(raf.CurrentPosition) As Byte";
Debug.ShouldStop(536870912);
_buffer = RemoteObject.createNewArray ("byte", new int[] {(int) (0 + _raf.getField(true,"CurrentPosition").<Long>get().longValue())}, new Object[]{});Debug.locals.put("buffer", _buffer);
 BA.debugLineNum = 223;BA.debugLine="raf.ReadBytes(buffer, 0, buffer.Length, 0)";
Debug.ShouldStop(1073741824);
_raf.runVoidMethod ("ReadBytes",(Object)(_buffer),(Object)(BA.numberCast(int.class, 0)),(Object)(_buffer.getField(true,"length")),(Object)(BA.numberCast(long.class, 0)));
 BA.debugLineNum = 224;BA.debugLine="raf.Close";
Debug.ShouldStop(-2147483648);
_raf.runVoidMethod ("Close");
 BA.debugLineNum = 225;BA.debugLine="insertQuery(Key, buffer)";
Debug.ShouldStop(1);
__ref.runClassMethod (com.calypsoinstruments.anemotracker.keyvaluestore.class, "_insertquery",(Object)(_key),(Object)((_buffer)));
 BA.debugLineNum = 226;BA.debugLine="Return complete(True)";
Debug.ShouldStop(2);
Debug.CheckDeviceExceptions();if (true) return __ref.runClassMethod (com.calypsoinstruments.anemotracker.keyvaluestore.class, "_complete",(Object)(keyvaluestore.__c.getField(true,"True")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e18) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e18.toString()); BA.debugLineNum = 228;BA.debugLine="Return complete(False)";
Debug.ShouldStop(8);
if (true) return __ref.runClassMethod (com.calypsoinstruments.anemotracker.keyvaluestore.class, "_complete",(Object)(keyvaluestore.__c.getField(true,"False")));
 };
 BA.debugLineNum = 230;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _putsimple(RemoteObject __ref,RemoteObject _key,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("PutSimple (keyvaluestore) ","keyvaluestore",7,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("putsimple")) { return __ref.runUserSub(false, "keyvaluestore","putsimple", __ref, _key, _value);}
Debug.locals.put("Key", _key);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 16;BA.debugLine="Public Sub PutSimple(Key As String, Value As Objec";
Debug.ShouldStop(32768);
 BA.debugLineNum = 17;BA.debugLine="Try";
Debug.ShouldStop(65536);
try { BA.debugLineNum = 18;BA.debugLine="start(Key)";
Debug.ShouldStop(131072);
__ref.runClassMethod (com.calypsoinstruments.anemotracker.keyvaluestore.class, "_start",(Object)(_key));
 BA.debugLineNum = 19;BA.debugLine="insertQuery(Key, Value)";
Debug.ShouldStop(262144);
__ref.runClassMethod (com.calypsoinstruments.anemotracker.keyvaluestore.class, "_insertquery",(Object)(_key),(Object)(_value));
 BA.debugLineNum = 20;BA.debugLine="Return complete(True)";
Debug.ShouldStop(524288);
Debug.CheckDeviceExceptions();if (true) return __ref.runClassMethod (com.calypsoinstruments.anemotracker.keyvaluestore.class, "_complete",(Object)(keyvaluestore.__c.getField(true,"True")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e6.toString()); BA.debugLineNum = 22;BA.debugLine="Return complete(False)";
Debug.ShouldStop(2097152);
if (true) return __ref.runClassMethod (com.calypsoinstruments.anemotracker.keyvaluestore.class, "_complete",(Object)(keyvaluestore.__c.getField(true,"False")));
 };
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _remove(RemoteObject __ref,RemoteObject _key) throws Exception{
try {
		Debug.PushSubsStack("Remove (keyvaluestore) ","keyvaluestore",7,__ref.getField(false, "ba"),__ref,72);
if (RapidSub.canDelegate("remove")) { return __ref.runUserSub(false, "keyvaluestore","remove", __ref, _key);}
Debug.locals.put("Key", _key);
 BA.debugLineNum = 72;BA.debugLine="Public Sub Remove(Key As String)";
Debug.ShouldStop(128);
 BA.debugLineNum = 73;BA.debugLine="sql1.ExecNonQuery2(\"DELETE FROM main WHERE key =";
Debug.ShouldStop(256);
__ref.getField(false,"_sql1").runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("DELETE FROM main WHERE key = ?")),(Object)(keyvaluestore.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_key)})))));
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _start(RemoteObject __ref,RemoteObject _key) throws Exception{
try {
		Debug.PushSubsStack("start (keyvaluestore) ","keyvaluestore",7,__ref.getField(false, "ba"),__ref,195);
if (RapidSub.canDelegate("start")) { return __ref.runUserSub(false, "keyvaluestore","start", __ref, _key);}
Debug.locals.put("Key", _key);
 BA.debugLineNum = 195;BA.debugLine="Private Sub start (Key As String)";
Debug.ShouldStop(4);
 BA.debugLineNum = 196;BA.debugLine="sql1.BeginTransaction";
Debug.ShouldStop(8);
__ref.getField(false,"_sql1").runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 197;BA.debugLine="sql1.ExecNonQuery2(\"DELETE FROM main WHERE key =";
Debug.ShouldStop(16);
__ref.getField(false,"_sql1").runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("DELETE FROM main WHERE key = ?")),(Object)(keyvaluestore.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_key)})))));
 BA.debugLineNum = 198;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}