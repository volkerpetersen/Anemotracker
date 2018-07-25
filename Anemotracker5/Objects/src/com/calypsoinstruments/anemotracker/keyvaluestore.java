package com.calypsoinstruments.anemotracker;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class keyvaluestore extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "com.calypsoinstruments.anemotracker.keyvaluestore");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.calypsoinstruments.anemotracker.keyvaluestore.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.sql.SQL _sql1 = null;
public String _tempfolder = "";
public String _tempfile = "";
public com.calypsoinstruments.anemotracker.main _main = null;
public com.calypsoinstruments.anemotracker.actble _actble = null;
public com.calypsoinstruments.anemotracker.actlisttracks _actlisttracks = null;
public com.calypsoinstruments.anemotracker.actnavigation _actnavigation = null;
public com.calypsoinstruments.anemotracker.acttcpip _acttcpip = null;
public com.calypsoinstruments.anemotracker.starter _starter = null;
public com.calypsoinstruments.anemotracker.dbutils _dbutils = null;
public com.calypsoinstruments.anemotracker.actcalcomp _actcalcomp = null;
public com.calypsoinstruments.anemotracker.actdevinfo _actdevinfo = null;
public boolean  _putsimple(com.calypsoinstruments.anemotracker.keyvaluestore __ref,String _key,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "putsimple"))
	 {return ((Boolean) Debug.delegate(ba, "putsimple", new Object[] {_key,_value}));}
RDebugUtils.currentLine=9306112;
 //BA.debugLineNum = 9306112;BA.debugLine="Public Sub PutSimple(Key As String, Value As Objec";
RDebugUtils.currentLine=9306113;
 //BA.debugLineNum = 9306113;BA.debugLine="Try";
try {RDebugUtils.currentLine=9306114;
 //BA.debugLineNum = 9306114;BA.debugLine="start(Key)";
__ref._start(null,_key);
RDebugUtils.currentLine=9306115;
 //BA.debugLineNum = 9306115;BA.debugLine="insertQuery(Key, Value)";
__ref._insertquery(null,_key,_value);
RDebugUtils.currentLine=9306116;
 //BA.debugLineNum = 9306116;BA.debugLine="Return complete(True)";
if (true) return __ref._complete(null,__c.True);
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=9306118;
 //BA.debugLineNum = 9306118;BA.debugLine="Return complete(False)";
if (true) return __ref._complete(null,__c.False);
 };
RDebugUtils.currentLine=9306120;
 //BA.debugLineNum = 9306120;BA.debugLine="End Sub";
return false;
}
public boolean  _containskey(com.calypsoinstruments.anemotracker.keyvaluestore __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "containskey"))
	 {return ((Boolean) Debug.delegate(ba, "containskey", new Object[] {_key}));}
RDebugUtils.currentLine=9764864;
 //BA.debugLineNum = 9764864;BA.debugLine="Public Sub ContainsKey(Key As String) As Boolean";
RDebugUtils.currentLine=9764865;
 //BA.debugLineNum = 9764865;BA.debugLine="Return sql1.ExecQuerySingleResult2(\"SELECT count(";
if (true) return (double)(Double.parseDouble(__ref._sql1.ExecQuerySingleResult2("SELECT count(key) FROM main WHERE key = ?",new String[]{_key})))>0;
RDebugUtils.currentLine=9764867;
 //BA.debugLineNum = 9764867;BA.debugLine="End Sub";
return false;
}
public String  _getsimple(com.calypsoinstruments.anemotracker.keyvaluestore __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "getsimple"))
	 {return ((String) Debug.delegate(ba, "getsimple", new Object[] {_key}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _c = null;
String _res = "";
RDebugUtils.currentLine=9895936;
 //BA.debugLineNum = 9895936;BA.debugLine="Public Sub GetSimple(Key As String) As String";
RDebugUtils.currentLine=9895937;
 //BA.debugLineNum = 9895937;BA.debugLine="Dim c As Cursor = getCursor(Key)";
_c = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_c = __ref._getcursor(null,_key);
RDebugUtils.currentLine=9895938;
 //BA.debugLineNum = 9895938;BA.debugLine="If c.RowCount = 0 Then";
if (_c.getRowCount()==0) { 
RDebugUtils.currentLine=9895939;
 //BA.debugLineNum = 9895939;BA.debugLine="c.Close";
_c.Close();
RDebugUtils.currentLine=9895940;
 //BA.debugLineNum = 9895940;BA.debugLine="Return \"\"";
if (true) return "";
 };
RDebugUtils.currentLine=9895942;
 //BA.debugLineNum = 9895942;BA.debugLine="c.Position = 0";
_c.setPosition((int) (0));
RDebugUtils.currentLine=9895943;
 //BA.debugLineNum = 9895943;BA.debugLine="Dim res As String = c.GetString2(0)";
_res = _c.GetString2((int) (0));
RDebugUtils.currentLine=9895944;
 //BA.debugLineNum = 9895944;BA.debugLine="c.Close";
_c.Close();
RDebugUtils.currentLine=9895945;
 //BA.debugLineNum = 9895945;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=9895946;
 //BA.debugLineNum = 9895946;BA.debugLine="End Sub";
return "";
}
public boolean  _putobject(com.calypsoinstruments.anemotracker.keyvaluestore __ref,String _key,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "putobject"))
	 {return ((Boolean) Debug.delegate(ba, "putobject", new Object[] {_key,_value}));}
RDebugUtils.currentLine=9371648;
 //BA.debugLineNum = 9371648;BA.debugLine="Public Sub PutObject(Key As String, Value As Objec";
RDebugUtils.currentLine=9371649;
 //BA.debugLineNum = 9371649;BA.debugLine="Return putObjectInternal(Key, Value, False, \"\")";
if (true) return __ref._putobjectinternal(null,_key,_value,__c.False,"");
RDebugUtils.currentLine=9371650;
 //BA.debugLineNum = 9371650;BA.debugLine="End Sub";
return false;
}
public Object  _getobject(com.calypsoinstruments.anemotracker.keyvaluestore __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "getobject"))
	 {return ((Object) Debug.delegate(ba, "getobject", new Object[] {_key}));}
RDebugUtils.currentLine=10092544;
 //BA.debugLineNum = 10092544;BA.debugLine="Public Sub GetObject(Key As String) As Object";
RDebugUtils.currentLine=10092545;
 //BA.debugLineNum = 10092545;BA.debugLine="Return getObjectInternal(Key, False, \"\")";
if (true) return __ref._getobjectinternal(null,_key,__c.False,"");
RDebugUtils.currentLine=10092546;
 //BA.debugLineNum = 10092546;BA.debugLine="End Sub";
return null;
}
public String  _initialize(com.calypsoinstruments.anemotracker.keyvaluestore __ref,anywheresoftware.b4a.BA _ba,String _dir,String _filename) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_dir,_filename}));}
RDebugUtils.currentLine=9240576;
 //BA.debugLineNum = 9240576;BA.debugLine="Public Sub Initialize (Dir As String, FileName As";
RDebugUtils.currentLine=9240577;
 //BA.debugLineNum = 9240577;BA.debugLine="If sql1.IsInitialized Then sql1.Close";
if (__ref._sql1.IsInitialized()) { 
__ref._sql1.Close();};
RDebugUtils.currentLine=9240578;
 //BA.debugLineNum = 9240578;BA.debugLine="sql1.Initialize(Dir, FileName, True)";
__ref._sql1.Initialize(_dir,_filename,__c.True);
RDebugUtils.currentLine=9240579;
 //BA.debugLineNum = 9240579;BA.debugLine="CreateTable";
__ref._createtable(null);
RDebugUtils.currentLine=9240580;
 //BA.debugLineNum = 9240580;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(com.calypsoinstruments.anemotracker.keyvaluestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
RDebugUtils.currentLine=9175040;
 //BA.debugLineNum = 9175040;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=9175041;
 //BA.debugLineNum = 9175041;BA.debugLine="Private sql1 As SQL";
_sql1 = new anywheresoftware.b4a.sql.SQL();
RDebugUtils.currentLine=9175042;
 //BA.debugLineNum = 9175042;BA.debugLine="Private tempFolder = File.DirInternalCache, tempF";
_tempfolder = __c.File.getDirInternalCache();
_tempfile = "key_value_temp.dat";
RDebugUtils.currentLine=9175043;
 //BA.debugLineNum = 9175043;BA.debugLine="End Sub";
return "";
}
public String  _close(com.calypsoinstruments.anemotracker.keyvaluestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "close"))
	 {return ((String) Debug.delegate(ba, "close", null));}
RDebugUtils.currentLine=10223616;
 //BA.debugLineNum = 10223616;BA.debugLine="Public Sub Close";
RDebugUtils.currentLine=10223617;
 //BA.debugLineNum = 10223617;BA.debugLine="sql1.Close";
__ref._sql1.Close();
RDebugUtils.currentLine=10223618;
 //BA.debugLineNum = 10223618;BA.debugLine="End Sub";
return "";
}
public boolean  _complete(com.calypsoinstruments.anemotracker.keyvaluestore __ref,boolean _success) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "complete"))
	 {return ((Boolean) Debug.delegate(ba, "complete", new Object[] {_success}));}
RDebugUtils.currentLine=10616832;
 //BA.debugLineNum = 10616832;BA.debugLine="Private Sub complete(success As Boolean) As Boolea";
RDebugUtils.currentLine=10616833;
 //BA.debugLineNum = 10616833;BA.debugLine="If success Then";
if (_success) { 
RDebugUtils.currentLine=10616834;
 //BA.debugLineNum = 10616834;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1.TransactionSuccessful();
 }else {
RDebugUtils.currentLine=10616836;
 //BA.debugLineNum = 10616836;BA.debugLine="Log(\"Error saving object: \" & LastException)";
__c.Log("Error saving object: "+BA.ObjectToString(__c.LastException(getActivityBA())));
 };
RDebugUtils.currentLine=10616838;
 //BA.debugLineNum = 10616838;BA.debugLine="sql1.EndTransaction";
__ref._sql1.EndTransaction();
RDebugUtils.currentLine=10616839;
 //BA.debugLineNum = 10616839;BA.debugLine="Return success";
if (true) return _success;
RDebugUtils.currentLine=10616840;
 //BA.debugLineNum = 10616840;BA.debugLine="End Sub";
return false;
}
public String  _createtable(com.calypsoinstruments.anemotracker.keyvaluestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "createtable"))
	 {return ((String) Debug.delegate(ba, "createtable", null));}
RDebugUtils.currentLine=10485760;
 //BA.debugLineNum = 10485760;BA.debugLine="Private Sub CreateTable";
RDebugUtils.currentLine=10485761;
 //BA.debugLineNum = 10485761;BA.debugLine="sql1.ExecNonQuery(\"CREATE TABLE IF NOT EXISTS mai";
__ref._sql1.ExecNonQuery("CREATE TABLE IF NOT EXISTS main(key TEXT PRIMARY KEY, value NONE)");
RDebugUtils.currentLine=10485762;
 //BA.debugLineNum = 10485762;BA.debugLine="End Sub";
return "";
}
public String  _deleteall(com.calypsoinstruments.anemotracker.keyvaluestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "deleteall"))
	 {return ((String) Debug.delegate(ba, "deleteall", null));}
RDebugUtils.currentLine=9830400;
 //BA.debugLineNum = 9830400;BA.debugLine="Public Sub DeleteAll";
RDebugUtils.currentLine=9830401;
 //BA.debugLineNum = 9830401;BA.debugLine="sql1.ExecNonQuery(\"DROP TABLE main\")";
__ref._sql1.ExecNonQuery("DROP TABLE main");
RDebugUtils.currentLine=9830402;
 //BA.debugLineNum = 9830402;BA.debugLine="CreateTable";
__ref._createtable(null);
RDebugUtils.currentLine=9830403;
 //BA.debugLineNum = 9830403;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _getbitmap(com.calypsoinstruments.anemotracker.keyvaluestore __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "getbitmap"))
	 {return ((anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) Debug.delegate(ba, "getbitmap", new Object[] {_key}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _c = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _b = null;
byte[] _buffer = null;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
RDebugUtils.currentLine=10027008;
 //BA.debugLineNum = 10027008;BA.debugLine="Public Sub GetBitmap(Key As String) As Bitmap";
RDebugUtils.currentLine=10027009;
 //BA.debugLineNum = 10027009;BA.debugLine="Dim c As Cursor = getCursor(Key)";
_c = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_c = __ref._getcursor(null,_key);
RDebugUtils.currentLine=10027010;
 //BA.debugLineNum = 10027010;BA.debugLine="Dim b As Bitmap";
_b = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=10027011;
 //BA.debugLineNum = 10027011;BA.debugLine="If c.RowCount = 0 Then";
if (_c.getRowCount()==0) { 
RDebugUtils.currentLine=10027012;
 //BA.debugLineNum = 10027012;BA.debugLine="c.Close";
_c.Close();
RDebugUtils.currentLine=10027013;
 //BA.debugLineNum = 10027013;BA.debugLine="Return b";
if (true) return _b;
 };
RDebugUtils.currentLine=10027015;
 //BA.debugLineNum = 10027015;BA.debugLine="c.Position = 0";
_c.setPosition((int) (0));
RDebugUtils.currentLine=10027016;
 //BA.debugLineNum = 10027016;BA.debugLine="Dim buffer() As Byte = c.GetBlob2(0)";
_buffer = _c.GetBlob2((int) (0));
RDebugUtils.currentLine=10027017;
 //BA.debugLineNum = 10027017;BA.debugLine="Dim In As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=10027018;
 //BA.debugLineNum = 10027018;BA.debugLine="In.InitializeFromBytesArray(buffer, 0, buffer.Len";
_in.InitializeFromBytesArray(_buffer,(int) (0),_buffer.length);
RDebugUtils.currentLine=10027019;
 //BA.debugLineNum = 10027019;BA.debugLine="b.Initialize2(In)";
_b.Initialize2((java.io.InputStream)(_in.getObject()));
RDebugUtils.currentLine=10027020;
 //BA.debugLineNum = 10027020;BA.debugLine="In.Close";
_in.Close();
RDebugUtils.currentLine=10027021;
 //BA.debugLineNum = 10027021;BA.debugLine="c.Close";
_c.Close();
RDebugUtils.currentLine=10027022;
 //BA.debugLineNum = 10027022;BA.debugLine="Return b";
if (true) return _b;
RDebugUtils.currentLine=10027023;
 //BA.debugLineNum = 10027023;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.sql.SQL.CursorWrapper  _getcursor(com.calypsoinstruments.anemotracker.keyvaluestore __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "getcursor"))
	 {return ((anywheresoftware.b4a.sql.SQL.CursorWrapper) Debug.delegate(ba, "getcursor", new Object[] {_key}));}
RDebugUtils.currentLine=10354688;
 //BA.debugLineNum = 10354688;BA.debugLine="Private Sub getCursor(Key As String) As Cursor";
RDebugUtils.currentLine=10354689;
 //BA.debugLineNum = 10354689;BA.debugLine="Return sql1.ExecQuery2(\"SELECT value FROM main WH";
if (true) return (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(__ref._sql1.ExecQuery2("SELECT value FROM main WHERE key = ?",new String[]{_key})));
RDebugUtils.currentLine=10354690;
 //BA.debugLineNum = 10354690;BA.debugLine="End Sub";
return null;
}
public Object  _getencryptedobject(com.calypsoinstruments.anemotracker.keyvaluestore __ref,String _key,String _password) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "getencryptedobject"))
	 {return ((Object) Debug.delegate(ba, "getencryptedobject", new Object[] {_key,_password}));}
RDebugUtils.currentLine=10158080;
 //BA.debugLineNum = 10158080;BA.debugLine="Public Sub GetEncryptedObject(Key As String, Passw";
RDebugUtils.currentLine=10158081;
 //BA.debugLineNum = 10158081;BA.debugLine="Return getObjectInternal(Key, True, Password)";
if (true) return __ref._getobjectinternal(null,_key,__c.True,_password);
RDebugUtils.currentLine=10158082;
 //BA.debugLineNum = 10158082;BA.debugLine="End Sub";
return null;
}
public Object  _getobjectinternal(com.calypsoinstruments.anemotracker.keyvaluestore __ref,String _key,boolean _decrypt,String _password) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "getobjectinternal"))
	 {return ((Object) Debug.delegate(ba, "getobjectinternal", new Object[] {_key,_decrypt,_password}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _c = null;
byte[] _buffer = null;
anywheresoftware.b4a.randomaccessfile.RandomAccessFile _raf = null;
Object _res = null;
RDebugUtils.currentLine=10289152;
 //BA.debugLineNum = 10289152;BA.debugLine="Private Sub getObjectInternal(Key As String, decry";
RDebugUtils.currentLine=10289153;
 //BA.debugLineNum = 10289153;BA.debugLine="Dim c As Cursor = getCursor(Key)";
_c = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_c = __ref._getcursor(null,_key);
RDebugUtils.currentLine=10289154;
 //BA.debugLineNum = 10289154;BA.debugLine="If c.RowCount = 0 Then";
if (_c.getRowCount()==0) { 
RDebugUtils.currentLine=10289155;
 //BA.debugLineNum = 10289155;BA.debugLine="c.Close";
_c.Close();
RDebugUtils.currentLine=10289156;
 //BA.debugLineNum = 10289156;BA.debugLine="Return Null";
if (true) return __c.Null;
 };
RDebugUtils.currentLine=10289158;
 //BA.debugLineNum = 10289158;BA.debugLine="c.Position = 0";
_c.setPosition((int) (0));
RDebugUtils.currentLine=10289159;
 //BA.debugLineNum = 10289159;BA.debugLine="Dim buffer() As Byte = c.GetBlob2(0)";
_buffer = _c.GetBlob2((int) (0));
RDebugUtils.currentLine=10289160;
 //BA.debugLineNum = 10289160;BA.debugLine="Dim raf As RandomAccessFile";
_raf = new anywheresoftware.b4a.randomaccessfile.RandomAccessFile();
RDebugUtils.currentLine=10289161;
 //BA.debugLineNum = 10289161;BA.debugLine="raf.Initialize3(buffer, False)";
_raf.Initialize3(_buffer,__c.False);
RDebugUtils.currentLine=10289162;
 //BA.debugLineNum = 10289162;BA.debugLine="Dim res As Object";
_res = new Object();
RDebugUtils.currentLine=10289163;
 //BA.debugLineNum = 10289163;BA.debugLine="If decrypt Then";
if (_decrypt) { 
RDebugUtils.currentLine=10289164;
 //BA.debugLineNum = 10289164;BA.debugLine="res = raf.ReadEncryptedObject(password, raf.Curr";
_res = _raf.ReadEncryptedObject(_password,_raf.CurrentPosition);
 }else {
RDebugUtils.currentLine=10289166;
 //BA.debugLineNum = 10289166;BA.debugLine="res = raf.ReadObject(raf.CurrentPosition)";
_res = _raf.ReadObject(_raf.CurrentPosition);
 };
RDebugUtils.currentLine=10289168;
 //BA.debugLineNum = 10289168;BA.debugLine="raf.Close";
_raf.Close();
RDebugUtils.currentLine=10289169;
 //BA.debugLineNum = 10289169;BA.debugLine="c.Close";
_c.Close();
RDebugUtils.currentLine=10289170;
 //BA.debugLineNum = 10289170;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=10289171;
 //BA.debugLineNum = 10289171;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.streams.File.InputStreamWrapper  _getinputstream(com.calypsoinstruments.anemotracker.keyvaluestore __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "getinputstream"))
	 {return ((anywheresoftware.b4a.objects.streams.File.InputStreamWrapper) Debug.delegate(ba, "getinputstream", new Object[] {_key}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _c = null;
byte[] _buffer = null;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
RDebugUtils.currentLine=9961472;
 //BA.debugLineNum = 9961472;BA.debugLine="Public Sub GetInputStream(Key As String) As InputS";
RDebugUtils.currentLine=9961473;
 //BA.debugLineNum = 9961473;BA.debugLine="Dim c As Cursor = getCursor(Key)";
_c = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_c = __ref._getcursor(null,_key);
RDebugUtils.currentLine=9961474;
 //BA.debugLineNum = 9961474;BA.debugLine="If c.RowCount = 0 Then";
if (_c.getRowCount()==0) { 
RDebugUtils.currentLine=9961475;
 //BA.debugLineNum = 9961475;BA.debugLine="c.Close";
_c.Close();
RDebugUtils.currentLine=9961476;
 //BA.debugLineNum = 9961476;BA.debugLine="Return Null";
if (true) return (anywheresoftware.b4a.objects.streams.File.InputStreamWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper(), (java.io.InputStream)(__c.Null));
 };
RDebugUtils.currentLine=9961478;
 //BA.debugLineNum = 9961478;BA.debugLine="c.Position = 0";
_c.setPosition((int) (0));
RDebugUtils.currentLine=9961479;
 //BA.debugLineNum = 9961479;BA.debugLine="Dim buffer() As Byte = c.GetBlob2(0)";
_buffer = _c.GetBlob2((int) (0));
RDebugUtils.currentLine=9961480;
 //BA.debugLineNum = 9961480;BA.debugLine="Dim In As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=9961481;
 //BA.debugLineNum = 9961481;BA.debugLine="In.InitializeFromBytesArray(buffer, 0, buffer.Len";
_in.InitializeFromBytesArray(_buffer,(int) (0),_buffer.length);
RDebugUtils.currentLine=9961482;
 //BA.debugLineNum = 9961482;BA.debugLine="c.Close";
_c.Close();
RDebugUtils.currentLine=9961483;
 //BA.debugLineNum = 9961483;BA.debugLine="Return In";
if (true) return _in;
RDebugUtils.currentLine=9961484;
 //BA.debugLineNum = 9961484;BA.debugLine="End Sub";
return null;
}
public String  _insertquery(com.calypsoinstruments.anemotracker.keyvaluestore __ref,String _key,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "insertquery"))
	 {return ((String) Debug.delegate(ba, "insertquery", new Object[] {_key,_value}));}
RDebugUtils.currentLine=10420224;
 //BA.debugLineNum = 10420224;BA.debugLine="Private Sub insertQuery(Key As String, Value As Ob";
RDebugUtils.currentLine=10420225;
 //BA.debugLineNum = 10420225;BA.debugLine="sql1.ExecNonQuery2(\"INSERT INTO main VALUES(?, ?)";
__ref._sql1.ExecNonQuery2("INSERT INTO main VALUES(?, ?)",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_key),_value}));
RDebugUtils.currentLine=10420226;
 //BA.debugLineNum = 10420226;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _listkeys(com.calypsoinstruments.anemotracker.keyvaluestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "listkeys"))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "listkeys", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _c = null;
anywheresoftware.b4a.objects.collections.List _res = null;
int _row = 0;
RDebugUtils.currentLine=9699328;
 //BA.debugLineNum = 9699328;BA.debugLine="Public Sub ListKeys As List";
RDebugUtils.currentLine=9699329;
 //BA.debugLineNum = 9699329;BA.debugLine="Dim c As Cursor = sql1.ExecQuery(\"SELECT key FROM";
_c = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_c.setObject((android.database.Cursor)(__ref._sql1.ExecQuery("SELECT key FROM main")));
RDebugUtils.currentLine=9699330;
 //BA.debugLineNum = 9699330;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=9699331;
 //BA.debugLineNum = 9699331;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=9699332;
 //BA.debugLineNum = 9699332;BA.debugLine="For row = 0 To c.RowCount - 1";
{
final int step4 = 1;
final int limit4 = (int) (_c.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit4 ;_row = _row + step4 ) {
RDebugUtils.currentLine=9699333;
 //BA.debugLineNum = 9699333;BA.debugLine="c.Position = row";
_c.setPosition(_row);
RDebugUtils.currentLine=9699334;
 //BA.debugLineNum = 9699334;BA.debugLine="res.Add(c.GetString2(0))";
_res.Add((Object)(_c.GetString2((int) (0))));
 }
};
RDebugUtils.currentLine=9699336;
 //BA.debugLineNum = 9699336;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=9699337;
 //BA.debugLineNum = 9699337;BA.debugLine="End Sub";
return null;
}
public boolean  _putbitmap(com.calypsoinstruments.anemotracker.keyvaluestore __ref,String _key,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "putbitmap"))
	 {return ((Boolean) Debug.delegate(ba, "putbitmap", new Object[] {_key,_value}));}
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _b = null;
RDebugUtils.currentLine=9502720;
 //BA.debugLineNum = 9502720;BA.debugLine="Public Sub PutBitmap(Key As String, Value As Bitma";
RDebugUtils.currentLine=9502721;
 //BA.debugLineNum = 9502721;BA.debugLine="Try";
try {RDebugUtils.currentLine=9502722;
 //BA.debugLineNum = 9502722;BA.debugLine="start(Key)";
__ref._start(null,_key);
RDebugUtils.currentLine=9502723;
 //BA.debugLineNum = 9502723;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=9502724;
 //BA.debugLineNum = 9502724;BA.debugLine="out.InitializeToBytesArray(100)";
_out.InitializeToBytesArray((int) (100));
RDebugUtils.currentLine=9502725;
 //BA.debugLineNum = 9502725;BA.debugLine="Dim b As Bitmap = Value";
_b = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_b = _value;
RDebugUtils.currentLine=9502726;
 //BA.debugLineNum = 9502726;BA.debugLine="b.WriteToStream(out, 100, \"PNG\")";
_b.WriteToStream((java.io.OutputStream)(_out.getObject()),(int) (100),BA.getEnumFromString(android.graphics.Bitmap.CompressFormat.class,"PNG"));
RDebugUtils.currentLine=9502727;
 //BA.debugLineNum = 9502727;BA.debugLine="insertQuery(Key, out.ToBytesArray)";
__ref._insertquery(null,_key,(Object)(_out.ToBytesArray()));
RDebugUtils.currentLine=9502728;
 //BA.debugLineNum = 9502728;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=9502729;
 //BA.debugLineNum = 9502729;BA.debugLine="Return complete(True)";
if (true) return __ref._complete(null,__c.True);
 } 
       catch (Exception e11) {
			ba.setLastException(e11);RDebugUtils.currentLine=9502731;
 //BA.debugLineNum = 9502731;BA.debugLine="Return complete(False)";
if (true) return __ref._complete(null,__c.False);
 };
RDebugUtils.currentLine=9502733;
 //BA.debugLineNum = 9502733;BA.debugLine="End Sub";
return false;
}
public String  _start(com.calypsoinstruments.anemotracker.keyvaluestore __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "start"))
	 {return ((String) Debug.delegate(ba, "start", new Object[] {_key}));}
RDebugUtils.currentLine=10551296;
 //BA.debugLineNum = 10551296;BA.debugLine="Private Sub start (Key As String)";
RDebugUtils.currentLine=10551297;
 //BA.debugLineNum = 10551297;BA.debugLine="sql1.BeginTransaction";
__ref._sql1.BeginTransaction();
RDebugUtils.currentLine=10551298;
 //BA.debugLineNum = 10551298;BA.debugLine="sql1.ExecNonQuery2(\"DELETE FROM main WHERE key =";
__ref._sql1.ExecNonQuery2("DELETE FROM main WHERE key = ?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_key)}));
RDebugUtils.currentLine=10551299;
 //BA.debugLineNum = 10551299;BA.debugLine="End Sub";
return "";
}
public boolean  _putencyptedobject(com.calypsoinstruments.anemotracker.keyvaluestore __ref,String _key,Object _value,String _password) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "putencyptedobject"))
	 {return ((Boolean) Debug.delegate(ba, "putencyptedobject", new Object[] {_key,_value,_password}));}
RDebugUtils.currentLine=9437184;
 //BA.debugLineNum = 9437184;BA.debugLine="Public Sub PutEncyptedObject(Key As String, Value";
RDebugUtils.currentLine=9437185;
 //BA.debugLineNum = 9437185;BA.debugLine="Return putObjectInternal(Key, Value, True, Passwo";
if (true) return __ref._putobjectinternal(null,_key,_value,__c.True,_password);
RDebugUtils.currentLine=9437186;
 //BA.debugLineNum = 9437186;BA.debugLine="End Sub";
return false;
}
public boolean  _putobjectinternal(com.calypsoinstruments.anemotracker.keyvaluestore __ref,String _key,Object _value,boolean _encrypt,String _password) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "putobjectinternal"))
	 {return ((Boolean) Debug.delegate(ba, "putobjectinternal", new Object[] {_key,_value,_encrypt,_password}));}
anywheresoftware.b4a.randomaccessfile.RandomAccessFile _raf = null;
byte[] _buffer = null;
RDebugUtils.currentLine=10682368;
 //BA.debugLineNum = 10682368;BA.debugLine="Private Sub putObjectInternal(Key As String, Value";
RDebugUtils.currentLine=10682369;
 //BA.debugLineNum = 10682369;BA.debugLine="Try";
try {RDebugUtils.currentLine=10682370;
 //BA.debugLineNum = 10682370;BA.debugLine="start(Key)";
__ref._start(null,_key);
RDebugUtils.currentLine=10682371;
 //BA.debugLineNum = 10682371;BA.debugLine="Dim raf As RandomAccessFile";
_raf = new anywheresoftware.b4a.randomaccessfile.RandomAccessFile();
RDebugUtils.currentLine=10682372;
 //BA.debugLineNum = 10682372;BA.debugLine="File.Delete(tempFolder, tempFile)";
__c.File.Delete(__ref._tempfolder,__ref._tempfile);
RDebugUtils.currentLine=10682373;
 //BA.debugLineNum = 10682373;BA.debugLine="raf.Initialize(tempFolder, tempFile, False)";
_raf.Initialize(__ref._tempfolder,__ref._tempfile,__c.False);
RDebugUtils.currentLine=10682374;
 //BA.debugLineNum = 10682374;BA.debugLine="If encrypt Then";
if (_encrypt) { 
RDebugUtils.currentLine=10682375;
 //BA.debugLineNum = 10682375;BA.debugLine="raf.WriteEncryptedObject(Value, password, raf.C";
_raf.WriteEncryptedObject(_value,_password,_raf.CurrentPosition);
 }else {
RDebugUtils.currentLine=10682377;
 //BA.debugLineNum = 10682377;BA.debugLine="raf.WriteObject(Value, True, raf.CurrentPositio";
_raf.WriteObject(_value,__c.True,_raf.CurrentPosition);
 };
RDebugUtils.currentLine=10682379;
 //BA.debugLineNum = 10682379;BA.debugLine="raf.Flush";
_raf.Flush();
RDebugUtils.currentLine=10682380;
 //BA.debugLineNum = 10682380;BA.debugLine="Dim buffer(raf.CurrentPosition) As Byte";
_buffer = new byte[(int) (_raf.CurrentPosition)];
;
RDebugUtils.currentLine=10682381;
 //BA.debugLineNum = 10682381;BA.debugLine="raf.ReadBytes(buffer, 0, buffer.Length, 0)";
_raf.ReadBytes(_buffer,(int) (0),_buffer.length,(long) (0));
RDebugUtils.currentLine=10682382;
 //BA.debugLineNum = 10682382;BA.debugLine="raf.Close";
_raf.Close();
RDebugUtils.currentLine=10682383;
 //BA.debugLineNum = 10682383;BA.debugLine="insertQuery(Key, buffer)";
__ref._insertquery(null,_key,(Object)(_buffer));
RDebugUtils.currentLine=10682384;
 //BA.debugLineNum = 10682384;BA.debugLine="Return complete(True)";
if (true) return __ref._complete(null,__c.True);
 } 
       catch (Exception e18) {
			ba.setLastException(e18);RDebugUtils.currentLine=10682386;
 //BA.debugLineNum = 10682386;BA.debugLine="Return complete(False)";
if (true) return __ref._complete(null,__c.False);
 };
RDebugUtils.currentLine=10682388;
 //BA.debugLineNum = 10682388;BA.debugLine="End Sub";
return false;
}
public boolean  _putinputstream(com.calypsoinstruments.anemotracker.keyvaluestore __ref,String _key,anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "putinputstream"))
	 {return ((Boolean) Debug.delegate(ba, "putinputstream", new Object[] {_key,_value}));}
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
RDebugUtils.currentLine=9568256;
 //BA.debugLineNum = 9568256;BA.debugLine="Public Sub PutInputStream(Key As String, Value As";
RDebugUtils.currentLine=9568257;
 //BA.debugLineNum = 9568257;BA.debugLine="Try";
try {RDebugUtils.currentLine=9568258;
 //BA.debugLineNum = 9568258;BA.debugLine="start(Key)";
__ref._start(null,_key);
RDebugUtils.currentLine=9568259;
 //BA.debugLineNum = 9568259;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=9568260;
 //BA.debugLineNum = 9568260;BA.debugLine="out.InitializeToBytesArray(100)";
_out.InitializeToBytesArray((int) (100));
RDebugUtils.currentLine=9568261;
 //BA.debugLineNum = 9568261;BA.debugLine="File.Copy2(Value, out)";
__c.File.Copy2((java.io.InputStream)(_value.getObject()),(java.io.OutputStream)(_out.getObject()));
RDebugUtils.currentLine=9568262;
 //BA.debugLineNum = 9568262;BA.debugLine="Value.Close";
_value.Close();
RDebugUtils.currentLine=9568263;
 //BA.debugLineNum = 9568263;BA.debugLine="insertQuery(Key, out.ToBytesArray)";
__ref._insertquery(null,_key,(Object)(_out.ToBytesArray()));
RDebugUtils.currentLine=9568264;
 //BA.debugLineNum = 9568264;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=9568265;
 //BA.debugLineNum = 9568265;BA.debugLine="Return complete(True)";
if (true) return __ref._complete(null,__c.True);
 } 
       catch (Exception e11) {
			ba.setLastException(e11);RDebugUtils.currentLine=9568267;
 //BA.debugLineNum = 9568267;BA.debugLine="Return complete(False)";
if (true) return __ref._complete(null,__c.False);
 };
RDebugUtils.currentLine=9568269;
 //BA.debugLineNum = 9568269;BA.debugLine="End Sub";
return false;
}
public String  _remove(com.calypsoinstruments.anemotracker.keyvaluestore __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "remove"))
	 {return ((String) Debug.delegate(ba, "remove", new Object[] {_key}));}
RDebugUtils.currentLine=9633792;
 //BA.debugLineNum = 9633792;BA.debugLine="Public Sub Remove(Key As String)";
RDebugUtils.currentLine=9633793;
 //BA.debugLineNum = 9633793;BA.debugLine="sql1.ExecNonQuery2(\"DELETE FROM main WHERE key =";
__ref._sql1.ExecNonQuery2("DELETE FROM main WHERE key = ?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_key)}));
RDebugUtils.currentLine=9633794;
 //BA.debugLineNum = 9633794;BA.debugLine="End Sub";
return "";
}
}