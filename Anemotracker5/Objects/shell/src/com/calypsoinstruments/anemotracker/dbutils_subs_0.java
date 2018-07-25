package com.calypsoinstruments.anemotracker;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class dbutils_subs_0 {


public static RemoteObject  _copydbfromassets(RemoteObject _ba,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("CopyDBFromAssets (dbutils) ","dbutils",6,_ba,dbutils.mostCurrent,30);
if (RapidSub.canDelegate("copydbfromassets")) { return com.calypsoinstruments.anemotracker.dbutils.remoteMe.runUserSub(false, "dbutils","copydbfromassets", _ba, _filename);}
RemoteObject _targetdir = RemoteObject.createImmutable("");
;
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 30;BA.debugLine="Sub CopyDBFromAssets (FileName As String) As Strin";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 31;BA.debugLine="Dim TargetDir As String";
Debug.ShouldStop(1073741824);
_targetdir = RemoteObject.createImmutable("");Debug.locals.put("TargetDir", _targetdir);
 BA.debugLineNum = 32;BA.debugLine="If File.ExternalWritable Then TargetDir = File.Di";
Debug.ShouldStop(-2147483648);
if (dbutils.mostCurrent.__c.getField(false,"File").runMethod(true,"getExternalWritable").<Boolean>get().booleanValue()) { 
_targetdir = dbutils.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal");Debug.locals.put("TargetDir", _targetdir);}
else {
_targetdir = dbutils.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal");Debug.locals.put("TargetDir", _targetdir);};
 BA.debugLineNum = 33;BA.debugLine="If File.Exists(TargetDir, FileName) = False Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",dbutils.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(_targetdir),(Object)(_filename)),dbutils.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 34;BA.debugLine="File.Copy(File.DirAssets, FileName, TargetDir, F";
Debug.ShouldStop(2);
dbutils.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(dbutils.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(_filename),(Object)(_targetdir),(Object)(_filename));
 };
 BA.debugLineNum = 36;BA.debugLine="Return TargetDir";
Debug.ShouldStop(8);
if (true) return _targetdir;
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createtable(RemoteObject _ba,RemoteObject _sql,RemoteObject _tablename,RemoteObject _fieldsandtypes,RemoteObject _primarykey,RemoteObject _auto) throws Exception{
try {
		Debug.PushSubsStack("CreateTable (dbutils) ","dbutils",6,_ba,dbutils.mostCurrent,43);
if (RapidSub.canDelegate("createtable")) { return com.calypsoinstruments.anemotracker.dbutils.remoteMe.runUserSub(false, "dbutils","createtable", _ba, _sql, _tablename, _fieldsandtypes, _primarykey, _auto);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
int _i = 0;
RemoteObject _field = RemoteObject.createImmutable("");
RemoteObject _ftype = RemoteObject.createImmutable("");
RemoteObject _query = RemoteObject.createImmutable("");
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("TableName", _tablename);
Debug.locals.put("FieldsAndTypes", _fieldsandtypes);
Debug.locals.put("PrimaryKey", _primarykey);
Debug.locals.put("Auto", _auto);
 BA.debugLineNum = 43;BA.debugLine="Sub CreateTable(SQL As SQL, TableName As String, F";
Debug.ShouldStop(1024);
 BA.debugLineNum = 44;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(2048);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 45;BA.debugLine="sb.Initialize";
Debug.ShouldStop(4096);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 46;BA.debugLine="sb.Append(\"(\")";
Debug.ShouldStop(8192);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("(")));
 BA.debugLineNum = 47;BA.debugLine="For i = 0 To FieldsAndTypes.Size - 1";
Debug.ShouldStop(16384);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_fieldsandtypes.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 48;BA.debugLine="Dim field, ftype As String";
Debug.ShouldStop(32768);
_field = RemoteObject.createImmutable("");Debug.locals.put("field", _field);
_ftype = RemoteObject.createImmutable("");Debug.locals.put("ftype", _ftype);
 BA.debugLineNum = 49;BA.debugLine="field = FieldsAndTypes.GetKeyAt(i)";
Debug.ShouldStop(65536);
_field = BA.ObjectToString(_fieldsandtypes.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("field", _field);
 BA.debugLineNum = 50;BA.debugLine="ftype = FieldsAndTypes.GetValueAt(i)";
Debug.ShouldStop(131072);
_ftype = BA.ObjectToString(_fieldsandtypes.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("ftype", _ftype);
 BA.debugLineNum = 51;BA.debugLine="If i > 0 Then sb.Append(\", \")";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0))) { 
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", ")));};
 BA.debugLineNum = 52;BA.debugLine="sb.Append(\"[\").Append(field).Append(\"] \").Append";
Debug.ShouldStop(524288);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("["))).runMethod(false,"Append",(Object)(_field)).runMethod(false,"Append",(Object)(RemoteObject.createImmutable("] "))).runVoidMethod ("Append",(Object)(_ftype));
 BA.debugLineNum = 53;BA.debugLine="If field = PrimaryKey Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_field,_primarykey)) { 
 BA.debugLineNum = 54;BA.debugLine="sb.Append(\" PRIMARY KEY\")";
Debug.ShouldStop(2097152);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" PRIMARY KEY")));
 BA.debugLineNum = 55;BA.debugLine="If Auto = True Then sb.Append(\" AUTOINCRE";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_auto,dbutils.mostCurrent.__c.getField(true,"True"))) { 
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" AUTOINCREMENT")));};
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 59;BA.debugLine="sb.Append(\")\")";
Debug.ShouldStop(67108864);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(")")));
 BA.debugLineNum = 60;BA.debugLine="Dim query As String";
Debug.ShouldStop(134217728);
_query = RemoteObject.createImmutable("");Debug.locals.put("query", _query);
 BA.debugLineNum = 61;BA.debugLine="query = \"CREATE TABLE IF NOT EXISTS [\" & TableNam";
Debug.ShouldStop(268435456);
_query = RemoteObject.concat(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS ["),_tablename,RemoteObject.createImmutable("] "),_sb.runMethod(true,"ToString"));Debug.locals.put("query", _query);
 BA.debugLineNum = 62;BA.debugLine="Log(\"CreateTable: \" & query)";
Debug.ShouldStop(536870912);
dbutils.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("CreateTable: "),_query)));
 BA.debugLineNum = 63;BA.debugLine="SQL.ExecNonQuery(query)";
Debug.ShouldStop(1073741824);
_sql.runVoidMethod ("ExecNonQuery",(Object)(_query));
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _deleterecord(RemoteObject _ba,RemoteObject _sql,RemoteObject _tablename,RemoteObject _wherefieldequals) throws Exception{
try {
		Debug.PushSubsStack("DeleteRecord (dbutils) ","dbutils",6,_ba,dbutils.mostCurrent,420);
if (RapidSub.canDelegate("deleterecord")) { return com.calypsoinstruments.anemotracker.dbutils.remoteMe.runUserSub(false, "dbutils","deleterecord", _ba, _sql, _tablename, _wherefieldequals);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _args = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("TableName", _tablename);
Debug.locals.put("WhereFieldEquals", _wherefieldequals);
 BA.debugLineNum = 420;BA.debugLine="Sub DeleteRecord(SQL As SQL, TableName As String,";
Debug.ShouldStop(8);
 BA.debugLineNum = 421;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(16);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 422;BA.debugLine="sb.Initialize";
Debug.ShouldStop(32);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 423;BA.debugLine="sb.Append(\"DELETE FROM [\").Append(TableName).A";
Debug.ShouldStop(64);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("DELETE FROM ["))).runMethod(false,"Append",(Object)(_tablename)).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("] WHERE ")));
 BA.debugLineNum = 424;BA.debugLine="If WhereFieldEquals.Size = 0 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_wherefieldequals.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 425;BA.debugLine="Log(\"WhereFieldEquals map empty!\")";
Debug.ShouldStop(256);
dbutils.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("WhereFieldEquals map empty!")));
 BA.debugLineNum = 426;BA.debugLine="Return";
Debug.ShouldStop(512);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 428;BA.debugLine="Dim args As List";
Debug.ShouldStop(2048);
_args = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("args", _args);
 BA.debugLineNum = 429;BA.debugLine="args.Initialize";
Debug.ShouldStop(4096);
_args.runVoidMethod ("Initialize");
 BA.debugLineNum = 430;BA.debugLine="For i = 0 To WhereFieldEquals.Size - 1";
Debug.ShouldStop(8192);
{
final int step10 = 1;
final int limit10 = RemoteObject.solve(new RemoteObject[] {_wherefieldequals.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step10 > 0 && _i <= limit10) || (step10 < 0 && _i >= limit10) ;_i = ((int)(0 + _i + step10))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 431;BA.debugLine="If i > 0 Then sb.Append(\" AND \")";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0))) { 
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" AND ")));};
 BA.debugLineNum = 432;BA.debugLine="sb.Append(\"[\").Append(WhereFieldEquals.GetKeyAt(";
Debug.ShouldStop(32768);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("["))).runMethod(false,"Append",(Object)(BA.ObjectToString(_wherefieldequals.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i)))))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("] = ?")));
 BA.debugLineNum = 433;BA.debugLine="args.Add(WhereFieldEquals.GetValueAt(i))";
Debug.ShouldStop(65536);
_args.runVoidMethod ("Add",(Object)(_wherefieldequals.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i)))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 435;BA.debugLine="Log(\"DeleteRecord: \" & sb.ToString)";
Debug.ShouldStop(262144);
dbutils.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("DeleteRecord: "),_sb.runMethod(true,"ToString"))));
 BA.debugLineNum = 436;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, args)";
Debug.ShouldStop(524288);
_sql.runVoidMethod ("ExecNonQuery2",(Object)(_sb.runMethod(true,"ToString")),(Object)(_args));
 BA.debugLineNum = 437;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _deleterecordid(RemoteObject _ba,RemoteObject _sql,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("DeleteRecordID (dbutils) ","dbutils",6,_ba,dbutils.mostCurrent,439);
if (RapidSub.canDelegate("deleterecordid")) { return com.calypsoinstruments.anemotracker.dbutils.remoteMe.runUserSub(false, "dbutils","deleterecordid", _ba, _sql, _id);}
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("id", _id);
 BA.debugLineNum = 439;BA.debugLine="Sub DeleteRecordID(SQL As SQL, id As Int)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 440;BA.debugLine="SQL.BeginTransaction";
Debug.ShouldStop(8388608);
_sql.runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 442;BA.debugLine="SQL.ExecNonQuery(\"DELETE FROM navigation WHERE ke";
Debug.ShouldStop(33554432);
_sql.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("DELETE FROM navigation WHERE key = "),_id)));
 BA.debugLineNum = 443;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _droptable(RemoteObject _ba,RemoteObject _sql,RemoteObject _tablename) throws Exception{
try {
		Debug.PushSubsStack("DropTable (dbutils) ","dbutils",6,_ba,dbutils.mostCurrent,67);
if (RapidSub.canDelegate("droptable")) { return com.calypsoinstruments.anemotracker.dbutils.remoteMe.runUserSub(false, "dbutils","droptable", _ba, _sql, _tablename);}
RemoteObject _query = RemoteObject.createImmutable("");
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("TableName", _tablename);
 BA.debugLineNum = 67;BA.debugLine="Sub DropTable(SQL As SQL, TableName As String)";
Debug.ShouldStop(4);
 BA.debugLineNum = 68;BA.debugLine="Dim query As String";
Debug.ShouldStop(8);
_query = RemoteObject.createImmutable("");Debug.locals.put("query", _query);
 BA.debugLineNum = 69;BA.debugLine="query = \"DROP TABLE IF EXISTS [\" & TableName & \"]";
Debug.ShouldStop(16);
_query = RemoteObject.concat(RemoteObject.createImmutable("DROP TABLE IF EXISTS ["),_tablename,RemoteObject.createImmutable("]"));Debug.locals.put("query", _query);
 BA.debugLineNum = 70;BA.debugLine="Log(\"DropTable: \" & query)";
Debug.ShouldStop(32);
dbutils.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("DropTable: "),_query)));
 BA.debugLineNum = 71;BA.debugLine="SQL.ExecNonQuery(query)";
Debug.ShouldStop(64);
_sql.runVoidMethod ("ExecNonQuery",(Object)(_query));
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _executehtml(RemoteObject _ba,RemoteObject _sql,RemoteObject _query,RemoteObject _stringargs,RemoteObject _limit,RemoteObject _clickable) throws Exception{
try {
		Debug.PushSubsStack("ExecuteHtml (dbutils) ","dbutils",6,_ba,dbutils.mostCurrent,339);
if (RapidSub.canDelegate("executehtml")) { return com.calypsoinstruments.anemotracker.dbutils.remoteMe.runUserSub(false, "dbutils","executehtml", _ba, _sql, _query, _stringargs, _limit, _clickable);}
RemoteObject _table = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cur = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
int _i = 0;
int _row = 0;
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("Query", _query);
Debug.locals.put("StringArgs", _stringargs);
Debug.locals.put("Limit", _limit);
Debug.locals.put("Clickable", _clickable);
 BA.debugLineNum = 339;BA.debugLine="Sub ExecuteHtml(SQL As SQL, Query As String, Strin";
Debug.ShouldStop(262144);
 BA.debugLineNum = 340;BA.debugLine="Dim Table As List";
Debug.ShouldStop(524288);
_table = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Table", _table);
 BA.debugLineNum = 341;BA.debugLine="Dim cur As Cursor";
Debug.ShouldStop(1048576);
_cur = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("cur", _cur);
 BA.debugLineNum = 342;BA.debugLine="If StringArgs <> Null Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("N",_stringargs)) { 
 BA.debugLineNum = 343;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
Debug.ShouldStop(4194304);
_cur.setObject(_sql.runMethod(false,"ExecQuery2",(Object)(_query),(Object)(_stringargs)));
 }else {
 BA.debugLineNum = 345;BA.debugLine="cur = SQL.ExecQuery(Query)";
Debug.ShouldStop(16777216);
_cur.setObject(_sql.runMethod(false,"ExecQuery",(Object)(_query)));
 };
 BA.debugLineNum = 347;BA.debugLine="Log(\"ExecuteHtml: \" & Query)";
Debug.ShouldStop(67108864);
dbutils.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("ExecuteHtml: "),_query)));
 BA.debugLineNum = 348;BA.debugLine="If Limit > 0 Then Limit = Min(Limit, cur.RowCount";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean(">",_limit,BA.numberCast(double.class, 0))) { 
_limit = BA.numberCast(int.class, dbutils.mostCurrent.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, _limit)),(Object)(BA.numberCast(double.class, _cur.runMethod(true,"getRowCount")))));Debug.locals.put("Limit", _limit);}
else {
_limit = _cur.runMethod(true,"getRowCount");Debug.locals.put("Limit", _limit);};
 BA.debugLineNum = 349;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(268435456);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 350;BA.debugLine="sb.Initialize";
Debug.ShouldStop(536870912);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 351;BA.debugLine="sb.Append(\"<html><body>\").Append(CRLF)";
Debug.ShouldStop(1073741824);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<html><body>"))).runVoidMethod ("Append",(Object)(dbutils.mostCurrent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 352;BA.debugLine="sb.Append(\"<style type='text/css'>\").Append(HtmlC";
Debug.ShouldStop(-2147483648);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<style type='text/css'>"))).runMethod(false,"Append",(Object)(dbutils._htmlcss)).runMethod(false,"Append",(Object)(RemoteObject.createImmutable("</style>"))).runVoidMethod ("Append",(Object)(dbutils.mostCurrent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 353;BA.debugLine="sb.Append(\"<table><tr>\").Append(CRLF)";
Debug.ShouldStop(1);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<table><tr>"))).runVoidMethod ("Append",(Object)(dbutils.mostCurrent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 354;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
Debug.ShouldStop(2);
{
final int step15 = 1;
final int limit15 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step15 > 0 && _i <= limit15) || (step15 < 0 && _i >= limit15) ;_i = ((int)(0 + _i + step15))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 355;BA.debugLine="sb.Append(\"<th>\").Append(cur.GetColumnName(i)).A";
Debug.ShouldStop(4);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<th>"))).runMethod(false,"Append",(Object)(_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("</th>")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 366;BA.debugLine="sb.Append(\"</tr>\").Append(CRLF)";
Debug.ShouldStop(8192);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("</tr>"))).runVoidMethod ("Append",(Object)(dbutils.mostCurrent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 367;BA.debugLine="For row = 0 To Limit - 1";
Debug.ShouldStop(16384);
{
final int step19 = 1;
final int limit19 = RemoteObject.solve(new RemoteObject[] {_limit,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = 0 ;
for (;(step19 > 0 && _row <= limit19) || (step19 < 0 && _row >= limit19) ;_row = ((int)(0 + _row + step19))  ) {
Debug.locals.put("row", _row);
 BA.debugLineNum = 368;BA.debugLine="cur.Position = row";
Debug.ShouldStop(32768);
_cur.runMethod(true,"setPosition",BA.numberCast(int.class, _row));
 BA.debugLineNum = 369;BA.debugLine="If row Mod 2 = 0 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_row),RemoteObject.createImmutable(2)}, "%",0, 1),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 370;BA.debugLine="sb.Append(\"<tr>\")";
Debug.ShouldStop(131072);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("<tr>")));
 }else {
 BA.debugLineNum = 372;BA.debugLine="sb.Append(\"<tr class='odd'>\")";
Debug.ShouldStop(524288);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("<tr class='odd'>")));
 };
 BA.debugLineNum = 374;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
Debug.ShouldStop(2097152);
{
final int step26 = 1;
final int limit26 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step26 > 0 && _i <= limit26) || (step26 < 0 && _i >= limit26) ;_i = ((int)(0 + _i + step26))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 375;BA.debugLine="sb.Append(\"<td>\")";
Debug.ShouldStop(4194304);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("<td>")));
 BA.debugLineNum = 376;BA.debugLine="If Clickable Then";
Debug.ShouldStop(8388608);
if (_clickable.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 377;BA.debugLine="sb.Append(\"<a href='http://\").Append(i).Append";
Debug.ShouldStop(16777216);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<a href='http://"))).runMethod(false,"Append",(Object)(BA.NumberToString(_i))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(".")));
 BA.debugLineNum = 378;BA.debugLine="sb.Append(row)";
Debug.ShouldStop(33554432);
_sb.runVoidMethod ("Append",(Object)(BA.NumberToString(_row)));
 BA.debugLineNum = 379;BA.debugLine="sb.Append(\".com'>\").Append(cur.GetString2(i)).";
Debug.ShouldStop(67108864);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable(".com'>"))).runMethod(false,"Append",(Object)(_cur.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, _i))))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("</a>")));
 }else {
 BA.debugLineNum = 381;BA.debugLine="sb.Append(cur.GetString2(i))";
Debug.ShouldStop(268435456);
_sb.runVoidMethod ("Append",(Object)(_cur.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, _i)))));
 };
 BA.debugLineNum = 383;BA.debugLine="sb.Append(\"</td>\")";
Debug.ShouldStop(1073741824);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("</td>")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 385;BA.debugLine="sb.Append(\"</tr>\").Append(CRLF)";
Debug.ShouldStop(1);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("</tr>"))).runVoidMethod ("Append",(Object)(dbutils.mostCurrent.__c.getField(true,"CRLF")));
 }
}Debug.locals.put("row", _row);
;
 BA.debugLineNum = 387;BA.debugLine="cur.Close";
Debug.ShouldStop(4);
_cur.runVoidMethod ("Close");
 BA.debugLineNum = 388;BA.debugLine="sb.Append(\"</table></body></html>\")";
Debug.ShouldStop(8);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("</table></body></html>")));
 BA.debugLineNum = 389;BA.debugLine="Return sb.ToString";
Debug.ShouldStop(16);
if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 390;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _executejson(RemoteObject _ba,RemoteObject _sql,RemoteObject _query,RemoteObject _stringargs,RemoteObject _limit,RemoteObject _dbtypes) throws Exception{
try {
		Debug.PushSubsStack("ExecuteJSON (dbutils) ","dbutils",6,_ba,dbutils.mostCurrent,300);
if (RapidSub.canDelegate("executejson")) { return com.calypsoinstruments.anemotracker.dbutils.remoteMe.runUserSub(false, "dbutils","executejson", _ba, _sql, _query, _stringargs, _limit, _dbtypes);}
RemoteObject _table = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cur = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _row = 0;
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i = 0;
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("Query", _query);
Debug.locals.put("StringArgs", _stringargs);
Debug.locals.put("Limit", _limit);
Debug.locals.put("DBTypes", _dbtypes);
 BA.debugLineNum = 300;BA.debugLine="Sub ExecuteJSON (SQL As SQL, Query As String, Stri";
Debug.ShouldStop(2048);
 BA.debugLineNum = 301;BA.debugLine="Dim table As List";
Debug.ShouldStop(4096);
_table = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("table", _table);
 BA.debugLineNum = 302;BA.debugLine="Dim cur As Cursor";
Debug.ShouldStop(8192);
_cur = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("cur", _cur);
 BA.debugLineNum = 303;BA.debugLine="If StringArgs <> Null Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("N",_stringargs)) { 
 BA.debugLineNum = 304;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
Debug.ShouldStop(32768);
_cur.setObject(_sql.runMethod(false,"ExecQuery2",(Object)(_query),(Object)(_stringargs)));
 }else {
 BA.debugLineNum = 306;BA.debugLine="cur = SQL.ExecQuery(Query)";
Debug.ShouldStop(131072);
_cur.setObject(_sql.runMethod(false,"ExecQuery",(Object)(_query)));
 };
 BA.debugLineNum = 308;BA.debugLine="Log(\"ExecuteJSON: \" & Query)";
Debug.ShouldStop(524288);
dbutils.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("ExecuteJSON: "),_query)));
 BA.debugLineNum = 309;BA.debugLine="Dim table As List";
Debug.ShouldStop(1048576);
_table = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("table", _table);
 BA.debugLineNum = 310;BA.debugLine="table.Initialize";
Debug.ShouldStop(2097152);
_table.runVoidMethod ("Initialize");
 BA.debugLineNum = 311;BA.debugLine="If Limit > 0 Then Limit = Min(Limit, cur.RowCount";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean(">",_limit,BA.numberCast(double.class, 0))) { 
_limit = BA.numberCast(int.class, dbutils.mostCurrent.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, _limit)),(Object)(BA.numberCast(double.class, _cur.runMethod(true,"getRowCount")))));Debug.locals.put("Limit", _limit);}
else {
_limit = _cur.runMethod(true,"getRowCount");Debug.locals.put("Limit", _limit);};
 BA.debugLineNum = 312;BA.debugLine="For row = 0 To Limit - 1";
Debug.ShouldStop(8388608);
{
final int step12 = 1;
final int limit12 = RemoteObject.solve(new RemoteObject[] {_limit,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = 0 ;
for (;(step12 > 0 && _row <= limit12) || (step12 < 0 && _row >= limit12) ;_row = ((int)(0 + _row + step12))  ) {
Debug.locals.put("row", _row);
 BA.debugLineNum = 313;BA.debugLine="cur.Position = row";
Debug.ShouldStop(16777216);
_cur.runMethod(true,"setPosition",BA.numberCast(int.class, _row));
 BA.debugLineNum = 314;BA.debugLine="Dim m As Map";
Debug.ShouldStop(33554432);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 315;BA.debugLine="m.Initialize";
Debug.ShouldStop(67108864);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 316;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
Debug.ShouldStop(134217728);
{
final int step16 = 1;
final int limit16 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step16 > 0 && _i <= limit16) || (step16 < 0 && _i >= limit16) ;_i = ((int)(0 + _i + step16))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 317;BA.debugLine="Select DBTypes.Get(i)";
Debug.ShouldStop(268435456);
switch (BA.switchObjectToInt(_dbtypes.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))),(dbutils._db_text),(dbutils._db_integer),(dbutils._db_real))) {
case 0: {
 BA.debugLineNum = 319;BA.debugLine="m.Put(cur.GetColumnName(i), cur.GetString2(i)";
Debug.ShouldStop(1073741824);
_m.runVoidMethod ("Put",(Object)((_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))))),(Object)((_cur.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, _i))))));
 break; }
case 1: {
 BA.debugLineNum = 321;BA.debugLine="m.Put(cur.GetColumnName(i), cur.GetLong2(i))";
Debug.ShouldStop(1);
_m.runVoidMethod ("Put",(Object)((_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))))),(Object)((_cur.runMethod(true,"GetLong2",(Object)(BA.numberCast(int.class, _i))))));
 break; }
case 2: {
 BA.debugLineNum = 323;BA.debugLine="m.Put(cur.GetColumnName(i), cur.GetDouble2(i)";
Debug.ShouldStop(4);
_m.runVoidMethod ("Put",(Object)((_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))))),(Object)((_cur.runMethod(true,"GetDouble2",(Object)(BA.numberCast(int.class, _i))))));
 break; }
default: {
 BA.debugLineNum = 325;BA.debugLine="Log(\"Invalid type: \" & DBTypes.Get(i))";
Debug.ShouldStop(16);
dbutils.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Invalid type: "),_dbtypes.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));
 break; }
}
;
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 328;BA.debugLine="table.Add(m)";
Debug.ShouldStop(128);
_table.runVoidMethod ("Add",(Object)((_m.getObject())));
 }
}Debug.locals.put("row", _row);
;
 BA.debugLineNum = 330;BA.debugLine="cur.Close";
Debug.ShouldStop(512);
_cur.runVoidMethod ("Close");
 BA.debugLineNum = 331;BA.debugLine="Dim root As Map";
Debug.ShouldStop(1024);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("root", _root);
 BA.debugLineNum = 332;BA.debugLine="root.Initialize";
Debug.ShouldStop(2048);
_root.runVoidMethod ("Initialize");
 BA.debugLineNum = 333;BA.debugLine="root.Put(\"root\", table)";
Debug.ShouldStop(4096);
_root.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("root"))),(Object)((_table.getObject())));
 BA.debugLineNum = 334;BA.debugLine="Return root";
Debug.ShouldStop(8192);
if (true) return _root;
 BA.debugLineNum = 335;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _executelistview(RemoteObject _ba,RemoteObject _sql,RemoteObject _query,RemoteObject _stringargs,RemoteObject _limit,RemoteObject _listview1,RemoteObject _twolines) throws Exception{
try {
		Debug.PushSubsStack("ExecuteListView (dbutils) ","dbutils",6,_ba,dbutils.mostCurrent,275);
if (RapidSub.canDelegate("executelistview")) { return com.calypsoinstruments.anemotracker.dbutils.remoteMe.runUserSub(false, "dbutils","executelistview", _ba, _sql, _query, _stringargs, _limit, _listview1, _twolines);}
RemoteObject _table = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cols = null;
int _i = 0;
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("Query", _query);
Debug.locals.put("StringArgs", _stringargs);
Debug.locals.put("Limit", _limit);
Debug.locals.put("ListView1", _listview1);
Debug.locals.put("TwoLines", _twolines);
 BA.debugLineNum = 275;BA.debugLine="Sub ExecuteListView(SQL As SQL, Query As String, S";
Debug.ShouldStop(262144);
 BA.debugLineNum = 277;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(1048576);
_listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 278;BA.debugLine="Dim Table As List";
Debug.ShouldStop(2097152);
_table = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Table", _table);
 BA.debugLineNum = 279;BA.debugLine="Table = ExecuteMemoryTable(SQL, Query, StringArgs";
Debug.ShouldStop(4194304);
_table = _executememorytable(_ba,_sql,_query,_stringargs,_limit);Debug.locals.put("Table", _table);
 BA.debugLineNum = 280;BA.debugLine="Dim Cols() As String";
Debug.ShouldStop(8388608);
_cols = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("Cols", _cols);
 BA.debugLineNum = 281;BA.debugLine="For i = 0 To Table.Size - 1";
Debug.ShouldStop(16777216);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_table.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 282;BA.debugLine="Cols = Table.Get(i)";
Debug.ShouldStop(33554432);
_cols = (_table.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Cols", _cols);
 BA.debugLineNum = 283;BA.debugLine="If TwoLines Then";
Debug.ShouldStop(67108864);
if (_twolines.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 284;BA.debugLine="ListView1.AddTwoLines2(Cols(0), Cols(1), Cols)";
Debug.ShouldStop(134217728);
_listview1.runVoidMethod ("AddTwoLines2",(Object)(BA.ObjectToCharSequence(_cols.getArrayElement(true,BA.numberCast(int.class, 0)))),(Object)(BA.ObjectToCharSequence(_cols.getArrayElement(true,BA.numberCast(int.class, 1)))),(Object)((_cols)));
 }else {
 BA.debugLineNum = 286;BA.debugLine="ListView1.AddSingleLine2(Cols(0), Cols)";
Debug.ShouldStop(536870912);
_listview1.runVoidMethod ("AddSingleLine2",(Object)(BA.ObjectToCharSequence(_cols.getArrayElement(true,BA.numberCast(int.class, 0)))),(Object)((_cols)));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 289;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _executemap(RemoteObject _ba,RemoteObject _sql,RemoteObject _query,RemoteObject _stringargs) throws Exception{
try {
		Debug.PushSubsStack("ExecuteMap (dbutils) ","dbutils",6,_ba,dbutils.mostCurrent,237);
if (RapidSub.canDelegate("executemap")) { return com.calypsoinstruments.anemotracker.dbutils.remoteMe.runUserSub(false, "dbutils","executemap", _ba, _sql, _query, _stringargs);}
RemoteObject _cur = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i = 0;
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("Query", _query);
Debug.locals.put("StringArgs", _stringargs);
 BA.debugLineNum = 237;BA.debugLine="Sub ExecuteMap(SQL As SQL, Query As String, String";
Debug.ShouldStop(4096);
 BA.debugLineNum = 238;BA.debugLine="Dim cur As Cursor";
Debug.ShouldStop(8192);
_cur = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("cur", _cur);
 BA.debugLineNum = 239;BA.debugLine="If StringArgs <> Null Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("N",_stringargs)) { 
 BA.debugLineNum = 240;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
Debug.ShouldStop(32768);
_cur.setObject(_sql.runMethod(false,"ExecQuery2",(Object)(_query),(Object)(_stringargs)));
 }else {
 BA.debugLineNum = 242;BA.debugLine="cur = SQL.ExecQuery(Query)";
Debug.ShouldStop(131072);
_cur.setObject(_sql.runMethod(false,"ExecQuery",(Object)(_query)));
 };
 BA.debugLineNum = 244;BA.debugLine="Log(\"ExecuteMap: \" & Query)";
Debug.ShouldStop(524288);
dbutils.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("ExecuteMap: "),_query)));
 BA.debugLineNum = 245;BA.debugLine="If cur.RowCount = 0 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 246;BA.debugLine="Log(\"No records found.\")";
Debug.ShouldStop(2097152);
dbutils.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("No records found.")));
 BA.debugLineNum = 247;BA.debugLine="Return Null";
Debug.ShouldStop(4194304);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), dbutils.mostCurrent.__c.getField(false,"Null"));
 };
 BA.debugLineNum = 249;BA.debugLine="Dim res As Map";
Debug.ShouldStop(16777216);
_res = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("res", _res);
 BA.debugLineNum = 250;BA.debugLine="res.Initialize";
Debug.ShouldStop(33554432);
_res.runVoidMethod ("Initialize");
 BA.debugLineNum = 251;BA.debugLine="cur.Position = 0";
Debug.ShouldStop(67108864);
_cur.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 252;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
Debug.ShouldStop(134217728);
{
final int step15 = 1;
final int limit15 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step15 > 0 && _i <= limit15) || (step15 < 0 && _i >= limit15) ;_i = ((int)(0 + _i + step15))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 253;BA.debugLine="res.Put(cur.GetColumnName(i).ToLowerCase, cur.Ge";
Debug.ShouldStop(268435456);
_res.runVoidMethod ("Put",(Object)((_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))).runMethod(true,"toLowerCase"))),(Object)((_cur.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, _i))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 255;BA.debugLine="cur.Close";
Debug.ShouldStop(1073741824);
_cur.runVoidMethod ("Close");
 BA.debugLineNum = 256;BA.debugLine="Return res";
Debug.ShouldStop(-2147483648);
if (true) return _res;
 BA.debugLineNum = 257;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _executememorymaplist(RemoteObject _ba,RemoteObject _sql,RemoteObject _query,RemoteObject _stringargs,RemoteObject _limit) throws Exception{
try {
		Debug.PushSubsStack("ExecuteMemoryMapList (dbutils) ","dbutils",6,_ba,dbutils.mostCurrent,209);
if (RapidSub.canDelegate("executememorymaplist")) { return com.calypsoinstruments.anemotracker.dbutils.remoteMe.runUserSub(false, "dbutils","executememorymaplist", _ba, _sql, _query, _stringargs, _limit);}
RemoteObject _cur = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _table = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _row = 0;
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _col = 0;
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("Query", _query);
Debug.locals.put("StringArgs", _stringargs);
Debug.locals.put("Limit", _limit);
 BA.debugLineNum = 209;BA.debugLine="Public Sub ExecuteMemoryMapList(SQL As SQL, Query";
Debug.ShouldStop(65536);
 BA.debugLineNum = 210;BA.debugLine="Dim cur As Cursor";
Debug.ShouldStop(131072);
_cur = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("cur", _cur);
 BA.debugLineNum = 211;BA.debugLine="If StringArgs <> Null Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("N",_stringargs)) { 
 BA.debugLineNum = 212;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
Debug.ShouldStop(524288);
_cur.setObject(_sql.runMethod(false,"ExecQuery2",(Object)(_query),(Object)(_stringargs)));
 }else {
 BA.debugLineNum = 214;BA.debugLine="cur = SQL.ExecQuery(Query)";
Debug.ShouldStop(2097152);
_cur.setObject(_sql.runMethod(false,"ExecQuery",(Object)(_query)));
 };
 BA.debugLineNum = 216;BA.debugLine="Log(\"ExecuteMemoryMapList: \" & Query)";
Debug.ShouldStop(8388608);
dbutils.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("ExecuteMemoryMapList: "),_query)));
 BA.debugLineNum = 217;BA.debugLine="Dim table As List";
Debug.ShouldStop(16777216);
_table = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("table", _table);
 BA.debugLineNum = 218;BA.debugLine="table.Initialize";
Debug.ShouldStop(33554432);
_table.runVoidMethod ("Initialize");
 BA.debugLineNum = 219;BA.debugLine="If Limit > 0 Then Limit = Min(Limit, cur.RowCount";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean(">",_limit,BA.numberCast(double.class, 0))) { 
_limit = BA.numberCast(int.class, dbutils.mostCurrent.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, _limit)),(Object)(BA.numberCast(double.class, _cur.runMethod(true,"getRowCount")))));Debug.locals.put("Limit", _limit);}
else {
_limit = _cur.runMethod(true,"getRowCount");Debug.locals.put("Limit", _limit);};
 BA.debugLineNum = 220;BA.debugLine="For row = 0 To Limit - 1";
Debug.ShouldStop(134217728);
{
final int step11 = 1;
final int limit11 = RemoteObject.solve(new RemoteObject[] {_limit,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = 0 ;
for (;(step11 > 0 && _row <= limit11) || (step11 < 0 && _row >= limit11) ;_row = ((int)(0 + _row + step11))  ) {
Debug.locals.put("row", _row);
 BA.debugLineNum = 221;BA.debugLine="cur.Position = row";
Debug.ShouldStop(268435456);
_cur.runMethod(true,"setPosition",BA.numberCast(int.class, _row));
 BA.debugLineNum = 222;BA.debugLine="Dim res As Map";
Debug.ShouldStop(536870912);
_res = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("res", _res);
 BA.debugLineNum = 223;BA.debugLine="res.Initialize";
Debug.ShouldStop(1073741824);
_res.runVoidMethod ("Initialize");
 BA.debugLineNum = 224;BA.debugLine="For col = 0 To cur.ColumnCount - 1";
Debug.ShouldStop(-2147483648);
{
final int step15 = 1;
final int limit15 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = 0 ;
for (;(step15 > 0 && _col <= limit15) || (step15 < 0 && _col >= limit15) ;_col = ((int)(0 + _col + step15))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 225;BA.debugLine="res.Put( cur.GetColumnName(col).ToLowerCase, cu";
Debug.ShouldStop(1);
_res.runVoidMethod ("Put",(Object)((_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _col))).runMethod(true,"toLowerCase"))),(Object)((_cur.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, _col))))));
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 227;BA.debugLine="table.Add(res)";
Debug.ShouldStop(4);
_table.runVoidMethod ("Add",(Object)((_res.getObject())));
 }
}Debug.locals.put("row", _row);
;
 BA.debugLineNum = 229;BA.debugLine="cur.Close";
Debug.ShouldStop(16);
_cur.runVoidMethod ("Close");
 BA.debugLineNum = 230;BA.debugLine="Return table";
Debug.ShouldStop(32);
if (true) return _table;
 BA.debugLineNum = 231;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _executememorytable(RemoteObject _ba,RemoteObject _sql,RemoteObject _query,RemoteObject _stringargs,RemoteObject _limit) throws Exception{
try {
		Debug.PushSubsStack("ExecuteMemoryTable (dbutils) ","dbutils",6,_ba,dbutils.mostCurrent,186);
if (RapidSub.canDelegate("executememorytable")) { return com.calypsoinstruments.anemotracker.dbutils.remoteMe.runUserSub(false, "dbutils","executememorytable", _ba, _sql, _query, _stringargs, _limit);}
RemoteObject _cur = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _table = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _row = 0;
RemoteObject _values = null;
int _col = 0;
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("Query", _query);
Debug.locals.put("StringArgs", _stringargs);
Debug.locals.put("Limit", _limit);
 BA.debugLineNum = 186;BA.debugLine="Sub ExecuteMemoryTable(SQL As SQL, Query As String";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 187;BA.debugLine="Dim cur As Cursor";
Debug.ShouldStop(67108864);
_cur = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("cur", _cur);
 BA.debugLineNum = 188;BA.debugLine="If StringArgs <> Null Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("N",_stringargs)) { 
 BA.debugLineNum = 189;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
Debug.ShouldStop(268435456);
_cur.setObject(_sql.runMethod(false,"ExecQuery2",(Object)(_query),(Object)(_stringargs)));
 }else {
 BA.debugLineNum = 191;BA.debugLine="cur = SQL.ExecQuery(Query)";
Debug.ShouldStop(1073741824);
_cur.setObject(_sql.runMethod(false,"ExecQuery",(Object)(_query)));
 };
 BA.debugLineNum = 193;BA.debugLine="Log(\"ExecuteMemoryTable: \" & Query)";
Debug.ShouldStop(1);
dbutils.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("ExecuteMemoryTable: "),_query)));
 BA.debugLineNum = 194;BA.debugLine="Dim table As List";
Debug.ShouldStop(2);
_table = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("table", _table);
 BA.debugLineNum = 195;BA.debugLine="table.Initialize";
Debug.ShouldStop(4);
_table.runVoidMethod ("Initialize");
 BA.debugLineNum = 196;BA.debugLine="If Limit > 0 Then Limit = Min(Limit, cur.RowCount";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean(">",_limit,BA.numberCast(double.class, 0))) { 
_limit = BA.numberCast(int.class, dbutils.mostCurrent.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, _limit)),(Object)(BA.numberCast(double.class, _cur.runMethod(true,"getRowCount")))));Debug.locals.put("Limit", _limit);}
else {
_limit = _cur.runMethod(true,"getRowCount");Debug.locals.put("Limit", _limit);};
 BA.debugLineNum = 197;BA.debugLine="For row = 0 To Limit - 1";
Debug.ShouldStop(16);
{
final int step11 = 1;
final int limit11 = RemoteObject.solve(new RemoteObject[] {_limit,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = 0 ;
for (;(step11 > 0 && _row <= limit11) || (step11 < 0 && _row >= limit11) ;_row = ((int)(0 + _row + step11))  ) {
Debug.locals.put("row", _row);
 BA.debugLineNum = 198;BA.debugLine="cur.Position = row";
Debug.ShouldStop(32);
_cur.runMethod(true,"setPosition",BA.numberCast(int.class, _row));
 BA.debugLineNum = 199;BA.debugLine="Dim values(cur.ColumnCount) As String";
Debug.ShouldStop(64);
_values = RemoteObject.createNewArray ("String", new int[] {_cur.runMethod(true,"getColumnCount").<Integer>get().intValue()}, new Object[]{});Debug.locals.put("values", _values);
 BA.debugLineNum = 200;BA.debugLine="For col = 0 To cur.ColumnCount - 1";
Debug.ShouldStop(128);
{
final int step14 = 1;
final int limit14 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = 0 ;
for (;(step14 > 0 && _col <= limit14) || (step14 < 0 && _col >= limit14) ;_col = ((int)(0 + _col + step14))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 201;BA.debugLine="values(col) = cur.GetString2(col)";
Debug.ShouldStop(256);
_values.setArrayElement (_cur.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, _col))),BA.numberCast(int.class, _col));
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 203;BA.debugLine="table.Add(values)";
Debug.ShouldStop(1024);
_table.runVoidMethod ("Add",(Object)((_values)));
 }
}Debug.locals.put("row", _row);
;
 BA.debugLineNum = 205;BA.debugLine="cur.Close";
Debug.ShouldStop(4096);
_cur.runVoidMethod ("Close");
 BA.debugLineNum = 206;BA.debugLine="Return table";
Debug.ShouldStop(8192);
if (true) return _table;
 BA.debugLineNum = 207;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _executespinner(RemoteObject _ba,RemoteObject _sql,RemoteObject _query,RemoteObject _stringargs,RemoteObject _limit,RemoteObject _spinner1) throws Exception{
try {
		Debug.PushSubsStack("ExecuteSpinner (dbutils) ","dbutils",6,_ba,dbutils.mostCurrent,260);
if (RapidSub.canDelegate("executespinner")) { return com.calypsoinstruments.anemotracker.dbutils.remoteMe.runUserSub(false, "dbutils","executespinner", _ba, _sql, _query, _stringargs, _limit, _spinner1);}
RemoteObject _table = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cols = null;
int _i = 0;
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("Query", _query);
Debug.locals.put("StringArgs", _stringargs);
Debug.locals.put("Limit", _limit);
Debug.locals.put("Spinner1", _spinner1);
 BA.debugLineNum = 260;BA.debugLine="Sub ExecuteSpinner(SQL As SQL, Query As String, St";
Debug.ShouldStop(8);
 BA.debugLineNum = 261;BA.debugLine="Spinner1.Clear";
Debug.ShouldStop(16);
_spinner1.runVoidMethod ("Clear");
 BA.debugLineNum = 262;BA.debugLine="Dim Table As List";
Debug.ShouldStop(32);
_table = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Table", _table);
 BA.debugLineNum = 263;BA.debugLine="Table = ExecuteMemoryTable(SQL, Query, StringArgs";
Debug.ShouldStop(64);
_table = _executememorytable(_ba,_sql,_query,_stringargs,_limit);Debug.locals.put("Table", _table);
 BA.debugLineNum = 264;BA.debugLine="Dim Cols() As String";
Debug.ShouldStop(128);
_cols = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("Cols", _cols);
 BA.debugLineNum = 265;BA.debugLine="For i = 0 To Table.Size - 1";
Debug.ShouldStop(256);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_table.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 266;BA.debugLine="Cols = Table.Get(i)";
Debug.ShouldStop(512);
_cols = (_table.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Cols", _cols);
 BA.debugLineNum = 267;BA.debugLine="Spinner1.Add(Cols(0))";
Debug.ShouldStop(1024);
_spinner1.runVoidMethod ("Add",(Object)(_cols.getArrayElement(true,BA.numberCast(int.class, 0))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 269;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdbversion(RemoteObject _ba,RemoteObject _sql) throws Exception{
try {
		Debug.PushSubsStack("GetDBVersion (dbutils) ","dbutils",6,_ba,dbutils.mostCurrent,394);
if (RapidSub.canDelegate("getdbversion")) { return com.calypsoinstruments.anemotracker.dbutils.remoteMe.runUserSub(false, "dbutils","getdbversion", _ba, _sql);}
RemoteObject _count = RemoteObject.createImmutable(0);
RemoteObject _version = RemoteObject.createImmutable(0);
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
;
Debug.locals.put("SQL", _sql);
 BA.debugLineNum = 394;BA.debugLine="Sub GetDBVersion (SQL As SQL) As Int";
Debug.ShouldStop(512);
 BA.debugLineNum = 395;BA.debugLine="Dim count, version As Int";
Debug.ShouldStop(1024);
_count = RemoteObject.createImmutable(0);Debug.locals.put("count", _count);
_version = RemoteObject.createImmutable(0);Debug.locals.put("version", _version);
 BA.debugLineNum = 396;BA.debugLine="count = SQL.ExecQuerySingleResult(\"SELECT count(*";
Debug.ShouldStop(2048);
_count = BA.numberCast(int.class, _sql.runMethod(true,"ExecQuerySingleResult",(Object)(RemoteObject.createImmutable("SELECT count(*) FROM sqlite_master WHERE Type='table' AND name='DBVersion'"))));Debug.locals.put("count", _count);
 BA.debugLineNum = 397;BA.debugLine="If count > 0 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean(">",_count,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 398;BA.debugLine="version = SQL.ExecQuerySingleResult(\"SELECT vers";
Debug.ShouldStop(8192);
_version = BA.numberCast(int.class, _sql.runMethod(true,"ExecQuerySingleResult",(Object)(RemoteObject.createImmutable("SELECT version FROM DBVersion"))));Debug.locals.put("version", _version);
 }else {
 BA.debugLineNum = 401;BA.debugLine="Dim m As Map";
Debug.ShouldStop(65536);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 402;BA.debugLine="m.Initialize";
Debug.ShouldStop(131072);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 403;BA.debugLine="m.Put(\"version\", DB_INTEGER)";
Debug.ShouldStop(262144);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("version"))),(Object)((dbutils._db_integer)));
 BA.debugLineNum = 404;BA.debugLine="CreateTable(SQL, \"DBVersion\", m, \"version\", Fals";
Debug.ShouldStop(524288);
_createtable(_ba,_sql,BA.ObjectToString("DBVersion"),_m,BA.ObjectToString("version"),dbutils.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 406;BA.debugLine="SQL.ExecNonQuery(\"INSERT INTO DBVersion VALUES (";
Debug.ShouldStop(2097152);
_sql.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("INSERT INTO DBVersion VALUES (1)")));
 BA.debugLineNum = 408;BA.debugLine="version = 1";
Debug.ShouldStop(8388608);
_version = BA.numberCast(int.class, 1);Debug.locals.put("version", _version);
 };
 BA.debugLineNum = 411;BA.debugLine="Return version";
Debug.ShouldStop(67108864);
if (true) return _version;
 BA.debugLineNum = 412;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _insertmaps(RemoteObject _ba,RemoteObject _sql,RemoteObject _tablename,RemoteObject _listofmaps) throws Exception{
try {
		Debug.PushSubsStack("InsertMaps (dbutils) ","dbutils",6,_ba,dbutils.mostCurrent,78);
if (RapidSub.canDelegate("insertmaps")) { return com.calypsoinstruments.anemotracker.dbutils.remoteMe.runUserSub(false, "dbutils","insertmaps", _ba, _sql, _tablename, _listofmaps);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _columns = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _values = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
int _i1 = 0;
RemoteObject _listofvalues = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i2 = 0;
RemoteObject _col = RemoteObject.createImmutable("");
RemoteObject _value = RemoteObject.declareNull("Object");
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("TableName", _tablename);
Debug.locals.put("ListOfMaps", _listofmaps);
 BA.debugLineNum = 78;BA.debugLine="Sub InsertMaps(SQL As SQL, TableName As String, Li";
Debug.ShouldStop(8192);
 BA.debugLineNum = 79;BA.debugLine="Dim sb, columns, values As StringBuilder";
Debug.ShouldStop(16384);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
_columns = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("columns", _columns);
_values = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("values", _values);
 BA.debugLineNum = 81;BA.debugLine="If ListOfMaps.Size > 1 And ListOfMaps.Get(0) = Li";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",_listofmaps.runMethod(true,"getSize"),BA.numberCast(double.class, 1)) && RemoteObject.solveBoolean("=",_listofmaps.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))),_listofmaps.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))))) { 
 BA.debugLineNum = 82;BA.debugLine="Log(\"Same Map found twice in list. Each item in";
Debug.ShouldStop(131072);
dbutils.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Same Map found twice in list. Each item in the list should include a different map object.")));
 BA.debugLineNum = 83;BA.debugLine="ToastMessageShow(\"Same Map found twice in list.";
Debug.ShouldStop(262144);
dbutils.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Same Map found twice in list. Each item in the list should include a different map object.")),(Object)(dbutils.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 84;BA.debugLine="Return";
Debug.ShouldStop(524288);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 86;BA.debugLine="SQL.BeginTransaction";
Debug.ShouldStop(2097152);
_sql.runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 87;BA.debugLine="Try";
Debug.ShouldStop(4194304);
try { BA.debugLineNum = 88;BA.debugLine="For i1 = 0 To ListOfMaps.Size - 1";
Debug.ShouldStop(8388608);
{
final int step9 = 1;
final int limit9 = RemoteObject.solve(new RemoteObject[] {_listofmaps.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i1 = 0 ;
for (;(step9 > 0 && _i1 <= limit9) || (step9 < 0 && _i1 >= limit9) ;_i1 = ((int)(0 + _i1 + step9))  ) {
Debug.locals.put("i1", _i1);
 BA.debugLineNum = 89;BA.debugLine="sb.Initialize";
Debug.ShouldStop(16777216);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 90;BA.debugLine="columns.Initialize";
Debug.ShouldStop(33554432);
_columns.runVoidMethod ("Initialize");
 BA.debugLineNum = 91;BA.debugLine="values.Initialize";
Debug.ShouldStop(67108864);
_values.runVoidMethod ("Initialize");
 BA.debugLineNum = 92;BA.debugLine="Dim listOfValues As List";
Debug.ShouldStop(134217728);
_listofvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("listOfValues", _listofvalues);
 BA.debugLineNum = 93;BA.debugLine="listOfValues.Initialize";
Debug.ShouldStop(268435456);
_listofvalues.runVoidMethod ("Initialize");
 BA.debugLineNum = 94;BA.debugLine="sb.Append(\"INSERT INTO [\" & TableName & \"] (\")";
Debug.ShouldStop(536870912);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO ["),_tablename,RemoteObject.createImmutable("] ("))));
 BA.debugLineNum = 95;BA.debugLine="Dim m As Map";
Debug.ShouldStop(1073741824);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 96;BA.debugLine="m = ListOfMaps.Get(i1)";
Debug.ShouldStop(-2147483648);
_m.setObject(_listofmaps.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i1))));
 BA.debugLineNum = 97;BA.debugLine="For i2 = 0 To m.Size - 1";
Debug.ShouldStop(1);
{
final int step18 = 1;
final int limit18 = RemoteObject.solve(new RemoteObject[] {_m.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i2 = 0 ;
for (;(step18 > 0 && _i2 <= limit18) || (step18 < 0 && _i2 >= limit18) ;_i2 = ((int)(0 + _i2 + step18))  ) {
Debug.locals.put("i2", _i2);
 BA.debugLineNum = 98;BA.debugLine="Dim col As String";
Debug.ShouldStop(2);
_col = RemoteObject.createImmutable("");Debug.locals.put("col", _col);
 BA.debugLineNum = 99;BA.debugLine="Dim value As Object";
Debug.ShouldStop(4);
_value = RemoteObject.createNew ("Object");Debug.locals.put("value", _value);
 BA.debugLineNum = 100;BA.debugLine="col = m.GetKeyAt(i2)";
Debug.ShouldStop(8);
_col = BA.ObjectToString(_m.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i2))));Debug.locals.put("col", _col);
 BA.debugLineNum = 101;BA.debugLine="value = m.GetValueAt(i2)";
Debug.ShouldStop(16);
_value = _m.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i2)));Debug.locals.put("value", _value);
 BA.debugLineNum = 102;BA.debugLine="If i2 > 0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_i2),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 103;BA.debugLine="columns.Append(\", \")";
Debug.ShouldStop(64);
_columns.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", ")));
 BA.debugLineNum = 104;BA.debugLine="values.Append(\", \")";
Debug.ShouldStop(128);
_values.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", ")));
 };
 BA.debugLineNum = 106;BA.debugLine="columns.Append(\"[\").Append(col).Append(\"]\")";
Debug.ShouldStop(512);
_columns.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("["))).runMethod(false,"Append",(Object)(_col)).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("]")));
 BA.debugLineNum = 107;BA.debugLine="values.Append(\"?\")";
Debug.ShouldStop(1024);
_values.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("?")));
 BA.debugLineNum = 108;BA.debugLine="listOfValues.Add(value)";
Debug.ShouldStop(2048);
_listofvalues.runVoidMethod ("Add",(Object)(_value));
 }
}Debug.locals.put("i2", _i2);
;
 BA.debugLineNum = 110;BA.debugLine="sb.Append(columns.ToString).Append(\") VALUES (\"";
Debug.ShouldStop(8192);
_sb.runMethod(false,"Append",(Object)(_columns.runMethod(true,"ToString"))).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(") VALUES ("))).runMethod(false,"Append",(Object)(_values.runMethod(true,"ToString"))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(")")));
 BA.debugLineNum = 112;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, listOfValues)";
Debug.ShouldStop(32768);
_sql.runVoidMethod ("ExecNonQuery2",(Object)(_sb.runMethod(true,"ToString")),(Object)(_listofvalues));
 }
}Debug.locals.put("i1", _i1);
;
 BA.debugLineNum = 114;BA.debugLine="SQL.TransactionSuccessful";
Debug.ShouldStop(131072);
_sql.runVoidMethod ("TransactionSuccessful");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e36) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e36.toString()); BA.debugLineNum = 116;BA.debugLine="ToastMessageShow(LastException.Message, True)";
Debug.ShouldStop(524288);
dbutils.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(dbutils.mostCurrent.__c.runMethod(false,"LastException",_ba).runMethod(true,"getMessage"))),(Object)(dbutils.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 117;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1048576);
dbutils.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(dbutils.mostCurrent.__c.runMethod(false,"LastException",_ba))));
 };
 BA.debugLineNum = 119;BA.debugLine="SQL.EndTransaction";
Debug.ShouldStop(4194304);
_sql.runVoidMethod ("EndTransaction");
 BA.debugLineNum = 120;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 13;BA.debugLine="Dim DB_REAL, DB_INTEGER, DB_BLOB, DB_TEXT As Stri";
dbutils._db_real = RemoteObject.createImmutable("");
dbutils._db_integer = RemoteObject.createImmutable("");
dbutils._db_blob = RemoteObject.createImmutable("");
dbutils._db_text = RemoteObject.createImmutable("");
 //BA.debugLineNum = 14;BA.debugLine="DB_REAL = \"REAL\"";
dbutils._db_real = BA.ObjectToString("REAL");
 //BA.debugLineNum = 15;BA.debugLine="DB_INTEGER = \"INTEGER\"";
dbutils._db_integer = BA.ObjectToString("INTEGER");
 //BA.debugLineNum = 16;BA.debugLine="DB_BLOB = \"BLOB\"";
dbutils._db_blob = BA.ObjectToString("BLOB");
 //BA.debugLineNum = 17;BA.debugLine="DB_TEXT = \"TEXT\"";
dbutils._db_text = BA.ObjectToString("TEXT");
 //BA.debugLineNum = 18;BA.debugLine="Dim HtmlCSS As String";
dbutils._htmlcss = RemoteObject.createImmutable("");
 //BA.debugLineNum = 19;BA.debugLine="HtmlCSS = \"table {width: 100%;border: 1px solid #";
dbutils._htmlcss = RemoteObject.concat(RemoteObject.createImmutable("table {width: 100%;border: 1px solid #cef;text-align: left; }"),RemoteObject.createImmutable(" th { font-weight: bold;	background-color: #acf;	border-bottom: 1px solid #cef; }"),RemoteObject.createImmutable("td,th {	padding: 4px 5px; }"),RemoteObject.createImmutable(".odd {background-color: #def; } .odd td {border-bottom: 1px solid #cef; }"),RemoteObject.createImmutable("a { text-decoration:none; color: #000;}"));
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _setdbversion(RemoteObject _ba,RemoteObject _sql,RemoteObject _version) throws Exception{
try {
		Debug.PushSubsStack("SetDBVersion (dbutils) ","dbutils",6,_ba,dbutils.mostCurrent,415);
if (RapidSub.canDelegate("setdbversion")) { return com.calypsoinstruments.anemotracker.dbutils.remoteMe.runUserSub(false, "dbutils","setdbversion", _ba, _sql, _version);}
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("Version", _version);
 BA.debugLineNum = 415;BA.debugLine="Sub SetDBVersion (SQL As SQL, Version As Int)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 416;BA.debugLine="SQL.ExecNonQuery2(\"UPDATE DBVersion set version =";
Debug.ShouldStop(-2147483648);
_sql.runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("UPDATE DBVersion set version = ?")),(Object)(dbutils.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_version)})))));
 BA.debugLineNum = 417;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updaterecord(RemoteObject _ba,RemoteObject _sql,RemoteObject _tablename,RemoteObject _field,RemoteObject _newvalue,RemoteObject _wherefieldequals) throws Exception{
try {
		Debug.PushSubsStack("UpdateRecord (dbutils) ","dbutils",6,_ba,dbutils.mostCurrent,124);
if (RapidSub.canDelegate("updaterecord")) { return com.calypsoinstruments.anemotracker.dbutils.remoteMe.runUserSub(false, "dbutils","updaterecord", _ba, _sql, _tablename, _field, _newvalue, _wherefieldequals);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _args = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("TableName", _tablename);
Debug.locals.put("Field", _field);
Debug.locals.put("NewValue", _newvalue);
Debug.locals.put("WhereFieldEquals", _wherefieldequals);
 BA.debugLineNum = 124;BA.debugLine="Sub UpdateRecord(SQL As SQL, TableName As String,";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 126;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(536870912);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 127;BA.debugLine="sb.Initialize";
Debug.ShouldStop(1073741824);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 128;BA.debugLine="sb.Append(\"UPDATE [\").Append(TableName).Append(\"]";
Debug.ShouldStop(-2147483648);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("UPDATE ["))).runMethod(false,"Append",(Object)(_tablename)).runMethod(false,"Append",(Object)(RemoteObject.createImmutable("] SET ["))).runMethod(false,"Append",(Object)(_field)).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("] = ? WHERE ")));
 BA.debugLineNum = 129;BA.debugLine="If WhereFieldEquals.Size = 0 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_wherefieldequals.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 130;BA.debugLine="Log(\"WhereFieldEquals map empty!\")";
Debug.ShouldStop(2);
dbutils.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("WhereFieldEquals map empty!")));
 BA.debugLineNum = 131;BA.debugLine="Return";
Debug.ShouldStop(4);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 133;BA.debugLine="Dim args As List";
Debug.ShouldStop(16);
_args = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("args", _args);
 BA.debugLineNum = 134;BA.debugLine="args.Initialize";
Debug.ShouldStop(32);
_args.runVoidMethod ("Initialize");
 BA.debugLineNum = 135;BA.debugLine="args.Add(NewValue)";
Debug.ShouldStop(64);
_args.runVoidMethod ("Add",(Object)(_newvalue));
 BA.debugLineNum = 136;BA.debugLine="For i = 0 To WhereFieldEquals.Size - 1";
Debug.ShouldStop(128);
{
final int step11 = 1;
final int limit11 = RemoteObject.solve(new RemoteObject[] {_wherefieldequals.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11) ;_i = ((int)(0 + _i + step11))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 137;BA.debugLine="If i > 0 Then sb.Append(\" AND \")";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0))) { 
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" AND ")));};
 BA.debugLineNum = 138;BA.debugLine="sb.Append(\"[\").Append(WhereFieldEquals.GetKeyAt(";
Debug.ShouldStop(512);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("["))).runMethod(false,"Append",(Object)(BA.ObjectToString(_wherefieldequals.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i)))))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("] = ?")));
 BA.debugLineNum = 139;BA.debugLine="args.Add(WhereFieldEquals.GetValueAt(i))";
Debug.ShouldStop(1024);
_args.runVoidMethod ("Add",(Object)(_wherefieldequals.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i)))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 141;BA.debugLine="Log(\"UpdateRecord: \" & sb.ToString)";
Debug.ShouldStop(4096);
dbutils.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("UpdateRecord: "),_sb.runMethod(true,"ToString"))));
 BA.debugLineNum = 142;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, args)";
Debug.ShouldStop(8192);
_sql.runVoidMethod ("ExecNonQuery2",(Object)(_sb.runMethod(true,"ToString")),(Object)(_args));
 BA.debugLineNum = 143;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updaterecord2(RemoteObject _ba,RemoteObject _sql,RemoteObject _tablename,RemoteObject _fields,RemoteObject _wherefieldequals) throws Exception{
try {
		Debug.PushSubsStack("UpdateRecord2 (dbutils) ","dbutils",6,_ba,dbutils.mostCurrent,147);
if (RapidSub.canDelegate("updaterecord2")) { return com.calypsoinstruments.anemotracker.dbutils.remoteMe.runUserSub(false, "dbutils","updaterecord2", _ba, _sql, _tablename, _fields, _wherefieldequals);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _args = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("TableName", _tablename);
Debug.locals.put("Fields", _fields);
Debug.locals.put("WhereFieldEquals", _wherefieldequals);
 BA.debugLineNum = 147;BA.debugLine="Sub UpdateRecord2(SQL As SQL, TableName As String,";
Debug.ShouldStop(262144);
 BA.debugLineNum = 148;BA.debugLine="If WhereFieldEquals.Size = 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_wherefieldequals.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 149;BA.debugLine="Log(\"WhereFieldEquals map empty!\")";
Debug.ShouldStop(1048576);
dbutils.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("WhereFieldEquals map empty!")));
 BA.debugLineNum = 150;BA.debugLine="Return";
Debug.ShouldStop(2097152);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 152;BA.debugLine="If Fields.Size = 0 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_fields.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 153;BA.debugLine="Log(\"Fields empty\")";
Debug.ShouldStop(16777216);
dbutils.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Fields empty")));
 BA.debugLineNum = 154;BA.debugLine="Return";
Debug.ShouldStop(33554432);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 156;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(134217728);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 157;BA.debugLine="sb.Initialize";
Debug.ShouldStop(268435456);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 158;BA.debugLine="sb.Append(\"UPDATE [\").Append(TableName).Append(\"]";
Debug.ShouldStop(536870912);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("UPDATE ["))).runMethod(false,"Append",(Object)(_tablename)).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("] SET ")));
 BA.debugLineNum = 159;BA.debugLine="Dim args As List";
Debug.ShouldStop(1073741824);
_args = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("args", _args);
 BA.debugLineNum = 160;BA.debugLine="args.Initialize";
Debug.ShouldStop(-2147483648);
_args.runVoidMethod ("Initialize");
 BA.debugLineNum = 161;BA.debugLine="For i=0 To Fields.Size-1";
Debug.ShouldStop(1);
{
final int step14 = 1;
final int limit14 = RemoteObject.solve(new RemoteObject[] {_fields.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14) ;_i = ((int)(0 + _i + step14))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 162;BA.debugLine="If i<>Fields.Size-1 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(_i),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_fields.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)))) { 
 BA.debugLineNum = 163;BA.debugLine="sb.Append(\"[\").Append(Fields.GetKeyAt(i)).Appen";
Debug.ShouldStop(4);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("["))).runMethod(false,"Append",(Object)(BA.ObjectToString(_fields.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i)))))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("]=?,")));
 }else {
 BA.debugLineNum = 165;BA.debugLine="sb.Append(\"[\").Append(Fields.GetKeyAt(i)).Appen";
Debug.ShouldStop(16);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("["))).runMethod(false,"Append",(Object)(BA.ObjectToString(_fields.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i)))))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("]=?")));
 };
 BA.debugLineNum = 167;BA.debugLine="args.Add(Fields.GetValueAt(i))";
Debug.ShouldStop(64);
_args.runVoidMethod ("Add",(Object)(_fields.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i)))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 170;BA.debugLine="sb.Append(\" WHERE \")";
Debug.ShouldStop(512);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" WHERE ")));
 BA.debugLineNum = 171;BA.debugLine="For i = 0 To WhereFieldEquals.Size - 1";
Debug.ShouldStop(1024);
{
final int step23 = 1;
final int limit23 = RemoteObject.solve(new RemoteObject[] {_wherefieldequals.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step23 > 0 && _i <= limit23) || (step23 < 0 && _i >= limit23) ;_i = ((int)(0 + _i + step23))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 172;BA.debugLine="If i > 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 173;BA.debugLine="sb.Append(\" AND \")";
Debug.ShouldStop(4096);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" AND ")));
 };
 BA.debugLineNum = 175;BA.debugLine="sb.Append(\"[\").Append(WhereFieldEquals.GetKeyAt(";
Debug.ShouldStop(16384);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("["))).runMethod(false,"Append",(Object)(BA.ObjectToString(_wherefieldequals.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i)))))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("] = ?")));
 BA.debugLineNum = 176;BA.debugLine="args.Add(WhereFieldEquals.GetValueAt(i))";
Debug.ShouldStop(32768);
_args.runVoidMethod ("Add",(Object)(_wherefieldequals.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i)))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 178;BA.debugLine="Log(\"UpdateRecord: \" & sb.ToString)";
Debug.ShouldStop(131072);
dbutils.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("UpdateRecord: "),_sb.runMethod(true,"ToString"))));
 BA.debugLineNum = 179;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, args)";
Debug.ShouldStop(262144);
_sql.runVoidMethod ("ExecNonQuery2",(Object)(_sb.runMethod(true,"ToString")),(Object)(_args));
 BA.debugLineNum = 180;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}