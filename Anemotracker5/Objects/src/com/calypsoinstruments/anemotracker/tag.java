package com.calypsoinstruments.anemotracker;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class tag extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "com.calypsoinstruments.anemotracker.tag");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.calypsoinstruments.anemotracker.tag.class).invoke(this, new Object[] {null});
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
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.PanelWrapper _mbase = null;
public int _defaultcolorconstant = 0;
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltext = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblvalue = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblunit = null;
public com.calypsoinstruments.anemotracker.autotextsizelabel _atlabel = null;
public anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog _tagdialog = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _sp_tag = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _sp_unit = null;
public anywheresoftware.b4a.objects.collections.List _ltags = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper _cvs = null;
public com.calypsoinstruments.anemotracker.main _main = null;
public com.calypsoinstruments.anemotracker.actble _actble = null;
public com.calypsoinstruments.anemotracker.actlisttracks _actlisttracks = null;
public com.calypsoinstruments.anemotracker.actnavigation _actnavigation = null;
public com.calypsoinstruments.anemotracker.acttcpip _acttcpip = null;
public com.calypsoinstruments.anemotracker.starter _starter = null;
public com.calypsoinstruments.anemotracker.dbutils _dbutils = null;
public com.calypsoinstruments.anemotracker.actcalcomp _actcalcomp = null;
public com.calypsoinstruments.anemotracker.actdevinfo _actdevinfo = null;
public anywheresoftware.b4a.objects.PanelWrapper  _getbase(com.calypsoinstruments.anemotracker.tag __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tag";
if (Debug.shouldDelegate(ba, "getbase"))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "getbase", null));}
RDebugUtils.currentLine=16646144;
 //BA.debugLineNum = 16646144;BA.debugLine="Public Sub GetBase As Panel";
RDebugUtils.currentLine=16646145;
 //BA.debugLineNum = 16646145;BA.debugLine="Return mBase";
if (true) return __ref._mbase;
RDebugUtils.currentLine=16646146;
 //BA.debugLineNum = 16646146;BA.debugLine="End Sub";
return null;
}
public float  _auto_size1(com.calypsoinstruments.anemotracker.tag __ref,anywheresoftware.b4a.objects.LabelWrapper _lbl) throws Exception{
__ref = this;
RDebugUtils.currentModule="tag";
if (Debug.shouldDelegate(ba, "auto_size1"))
	 {return ((Float) Debug.delegate(ba, "auto_size1", new Object[] {_lbl}));}
anywheresoftware.b4a.objects.StringUtils _su = null;
int _size = 0;
RDebugUtils.currentLine=17367040;
 //BA.debugLineNum = 17367040;BA.debugLine="Sub AUTO_SIZE1(lbl As Label) As Float";
RDebugUtils.currentLine=17367041;
 //BA.debugLineNum = 17367041;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=17367048;
 //BA.debugLineNum = 17367048;BA.debugLine="For size = 2 To 1024";
{
final int step2 = 1;
final int limit2 = (int) (1024);
_size = (int) (2) ;
for (;_size <= limit2 ;_size = _size + step2 ) {
RDebugUtils.currentLine=17367049;
 //BA.debugLineNum = 17367049;BA.debugLine="lbl.TextSize = size";
_lbl.setTextSize((float) (_size));
RDebugUtils.currentLine=17367052;
 //BA.debugLineNum = 17367052;BA.debugLine="If cvs.MeasureStringWidth(lbl.Text, lbl.Typefac";
if (__ref._cvs.MeasureStringWidth(_lbl.getText(),_lbl.getTypeface(),(float) (_size))>_lbl.getWidth() || _su.MeasureMultilineTextHeight((android.widget.TextView)(_lbl.getObject()),BA.ObjectToCharSequence(_lbl.getText()))>_lbl.getHeight()) { 
RDebugUtils.currentLine=17367054;
 //BA.debugLineNum = 17367054;BA.debugLine="size = size-0.5";
_size = (int) (_size-0.5);
RDebugUtils.currentLine=17367055;
 //BA.debugLineNum = 17367055;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=17367063;
 //BA.debugLineNum = 17367063;BA.debugLine="lbl.TextSize = size";
_lbl.setTextSize((float) (_size));
RDebugUtils.currentLine=17367065;
 //BA.debugLineNum = 17367065;BA.debugLine="End Sub";
return 0f;
}
public String  _base_resize(com.calypsoinstruments.anemotracker.tag __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="tag";
if (Debug.shouldDelegate(ba, "base_resize"))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=16580608;
 //BA.debugLineNum = 16580608;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=16580609;
 //BA.debugLineNum = 16580609;BA.debugLine="lblText.left= 0.05*mBase.width";
__ref._lbltext.setLeft((int) (0.05*__ref._mbase.getWidth()));
RDebugUtils.currentLine=16580610;
 //BA.debugLineNum = 16580610;BA.debugLine="lblText.Top= 0.05*mBase.height";
__ref._lbltext.setTop((int) (0.05*__ref._mbase.getHeight()));
RDebugUtils.currentLine=16580611;
 //BA.debugLineNum = 16580611;BA.debugLine="lblText.Width= 0.6*mBase.width";
__ref._lbltext.setWidth((int) (0.6*__ref._mbase.getWidth()));
RDebugUtils.currentLine=16580612;
 //BA.debugLineNum = 16580612;BA.debugLine="lblText.Height= 0.2*mBase.height";
__ref._lbltext.setHeight((int) (0.2*__ref._mbase.getHeight()));
RDebugUtils.currentLine=16580613;
 //BA.debugLineNum = 16580613;BA.debugLine="lblValue.Left= 0.05*mBase.width";
__ref._lblvalue.setLeft((int) (0.05*__ref._mbase.getWidth()));
RDebugUtils.currentLine=16580614;
 //BA.debugLineNum = 16580614;BA.debugLine="lblValue.Top=0.25*mBase.height";
__ref._lblvalue.setTop((int) (0.25*__ref._mbase.getHeight()));
RDebugUtils.currentLine=16580615;
 //BA.debugLineNum = 16580615;BA.debugLine="lblValue.Width=0.9*mBase.width";
__ref._lblvalue.setWidth((int) (0.9*__ref._mbase.getWidth()));
RDebugUtils.currentLine=16580616;
 //BA.debugLineNum = 16580616;BA.debugLine="lblValue.Height=0.72*mBase.height";
__ref._lblvalue.setHeight((int) (0.72*__ref._mbase.getHeight()));
RDebugUtils.currentLine=16580617;
 //BA.debugLineNum = 16580617;BA.debugLine="lblUnit.Left= 0.65*mBase.Width";
__ref._lblunit.setLeft((int) (0.65*__ref._mbase.getWidth()));
RDebugUtils.currentLine=16580618;
 //BA.debugLineNum = 16580618;BA.debugLine="lblUnit.Top= 0.05*mBase.height";
__ref._lblunit.setTop((int) (0.05*__ref._mbase.getHeight()));
RDebugUtils.currentLine=16580619;
 //BA.debugLineNum = 16580619;BA.debugLine="lblUnit.Width=mBase.width*0.31";
__ref._lblunit.setWidth((int) (__ref._mbase.getWidth()*0.31));
RDebugUtils.currentLine=16580620;
 //BA.debugLineNum = 16580620;BA.debugLine="lblUnit.Height=0.20*mBase.height";
__ref._lblunit.setHeight((int) (0.20*__ref._mbase.getHeight()));
RDebugUtils.currentLine=16580621;
 //BA.debugLineNum = 16580621;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(com.calypsoinstruments.anemotracker.tag __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tag";
RDebugUtils.currentLine=16384000;
 //BA.debugLineNum = 16384000;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=16384001;
 //BA.debugLineNum = 16384001;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=16384002;
 //BA.debugLineNum = 16384002;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=16384003;
 //BA.debugLineNum = 16384003;BA.debugLine="Dim mBase As Panel";
_mbase = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=16384004;
 //BA.debugLineNum = 16384004;BA.debugLine="Private Const DefaultColorConstant As Int = -9848";
_defaultcolorconstant = (int) (-984833);
RDebugUtils.currentLine=16384007;
 //BA.debugLineNum = 16384007;BA.debugLine="Private Panel1 As Panel";
_panel1 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=16384009;
 //BA.debugLineNum = 16384009;BA.debugLine="Public lblText, lblValue, lblUnit As Label";
_lbltext = new anywheresoftware.b4a.objects.LabelWrapper();
_lblvalue = new anywheresoftware.b4a.objects.LabelWrapper();
_lblunit = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=16384011;
 //BA.debugLineNum = 16384011;BA.debugLine="Public atlabel As AutoTextSizeLabel";
_atlabel = new com.calypsoinstruments.anemotracker.autotextsizelabel();
RDebugUtils.currentLine=16384014;
 //BA.debugLineNum = 16384014;BA.debugLine="Private TagDialog As CustomLayoutDialog";
_tagdialog = new anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog();
RDebugUtils.currentLine=16384016;
 //BA.debugLineNum = 16384016;BA.debugLine="Private sp_tag As Spinner";
_sp_tag = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=16384017;
 //BA.debugLineNum = 16384017;BA.debugLine="Private sp_unit As Spinner";
_sp_unit = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=16384023;
 //BA.debugLineNum = 16384023;BA.debugLine="Private lTags = Array As String( \"AWA\", \"AWM\", \"S";
_ltags = new anywheresoftware.b4a.objects.collections.List();
_ltags = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"AWA","AWM","Speed","TWA","TWM","Batt","Temp","Roll","Pitch","Mag HDG"});
RDebugUtils.currentLine=16384024;
 //BA.debugLineNum = 16384024;BA.debugLine="Dim cvs As Canvas";
_cvs = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=16384025;
 //BA.debugLineNum = 16384025;BA.debugLine="End Sub";
return "";
}
public String  _convert(com.calypsoinstruments.anemotracker.tag __ref,float _value,String _unit) throws Exception{
__ref = this;
RDebugUtils.currentModule="tag";
if (Debug.shouldDelegate(ba, "convert"))
	 {return ((String) Debug.delegate(ba, "convert", new Object[] {_value,_unit}));}
RDebugUtils.currentLine=16842752;
 //BA.debugLineNum = 16842752;BA.debugLine="Sub convert( value As Float, unit As String )";
RDebugUtils.currentLine=16842753;
 //BA.debugLineNum = 16842753;BA.debugLine="Select unit";
switch (BA.switchObjectToInt(_unit,"m/s","knots","km/h","ºC","ºF","degrees","%")) {
case 0: {
RDebugUtils.currentLine=16842755;
 //BA.debugLineNum = 16842755;BA.debugLine="Return value";
if (true) return BA.NumberToString(_value);
 break; }
case 1: {
RDebugUtils.currentLine=16842757;
 //BA.debugLineNum = 16842757;BA.debugLine="Return value * 3600 / 1852";
if (true) return BA.NumberToString(_value*3600/(double)1852);
 break; }
case 2: {
RDebugUtils.currentLine=16842759;
 //BA.debugLineNum = 16842759;BA.debugLine="Return value*3.6";
if (true) return BA.NumberToString(_value*3.6);
 break; }
case 3: {
RDebugUtils.currentLine=16842761;
 //BA.debugLineNum = 16842761;BA.debugLine="Return value";
if (true) return BA.NumberToString(_value);
 break; }
case 4: {
RDebugUtils.currentLine=16842763;
 //BA.debugLineNum = 16842763;BA.debugLine="Return  value * 1.8 + 32";
if (true) return BA.NumberToString(_value*1.8+32);
 break; }
case 5: 
case 6: {
RDebugUtils.currentLine=16842765;
 //BA.debugLineNum = 16842765;BA.debugLine="Return value";
if (true) return BA.NumberToString(_value);
 break; }
}
;
RDebugUtils.currentLine=16842768;
 //BA.debugLineNum = 16842768;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(com.calypsoinstruments.anemotracker.tag __ref,anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="tag";
if (Debug.shouldDelegate(ba, "designercreateview"))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
int _d = 0;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper _r1 = null;
anywheresoftware.b4a.keywords.constants.TypefaceWrapper _pirulen = null;
anywheresoftware.b4a.keywords.constants.TypefaceWrapper _dsdigi = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4a.objects.collections.List _ltag = null;
RDebugUtils.currentLine=16515072;
 //BA.debugLineNum = 16515072;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
RDebugUtils.currentLine=16515073;
 //BA.debugLineNum = 16515073;BA.debugLine="mBase = Base";
__ref._mbase = _base;
RDebugUtils.currentLine=16515075;
 //BA.debugLineNum = 16515075;BA.debugLine="Dim d As Int";
_d = 0;
RDebugUtils.currentLine=16515076;
 //BA.debugLineNum = 16515076;BA.debugLine="Dim r1 As Rect";
_r1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper();
RDebugUtils.currentLine=16515077;
 //BA.debugLineNum = 16515077;BA.debugLine="Panel1.Initialize( \"Panel1\" )";
__ref._panel1.Initialize(ba,"Panel1");
RDebugUtils.currentLine=16515078;
 //BA.debugLineNum = 16515078;BA.debugLine="mBase.AddView( Panel1, 0, 0, mBase.Width, mBase.H";
__ref._mbase.AddView((android.view.View)(__ref._panel1.getObject()),(int) (0),(int) (0),__ref._mbase.getWidth(),__ref._mbase.getHeight());
RDebugUtils.currentLine=16515081;
 //BA.debugLineNum = 16515081;BA.debugLine="lblText.Initialize(\"\")";
__ref._lbltext.Initialize(ba,"");
RDebugUtils.currentLine=16515082;
 //BA.debugLineNum = 16515082;BA.debugLine="lblUnit.Initialize(\"\")";
__ref._lblunit.Initialize(ba,"");
RDebugUtils.currentLine=16515083;
 //BA.debugLineNum = 16515083;BA.debugLine="lblValue.Initialize(\"\")";
__ref._lblvalue.Initialize(ba,"");
RDebugUtils.currentLine=16515085;
 //BA.debugLineNum = 16515085;BA.debugLine="Dim pirulen, dsdigi As Typeface";
_pirulen = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
_dsdigi = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
RDebugUtils.currentLine=16515086;
 //BA.debugLineNum = 16515086;BA.debugLine="pirulen = Typeface.LoadFromAssets(\"pirulen_rg.tt";
_pirulen.setObject((android.graphics.Typeface)(__c.Typeface.LoadFromAssets("pirulen_rg.ttf")));
RDebugUtils.currentLine=16515087;
 //BA.debugLineNum = 16515087;BA.debugLine="dsdigi = Typeface.LoadFromAssets(\"ds-digi.ttf\")";
_dsdigi.setObject((android.graphics.Typeface)(__c.Typeface.LoadFromAssets("ds-digi.ttf")));
RDebugUtils.currentLine=16515099;
 //BA.debugLineNum = 16515099;BA.debugLine="lblText.textColor = Colors.ARGB( 128, 255,255,255";
__ref._lbltext.setTextColor(__c.Colors.ARGB((int) (128),(int) (255),(int) (255),(int) (255)));
RDebugUtils.currentLine=16515101;
 //BA.debugLineNum = 16515101;BA.debugLine="lblValue.textColor = Colors.ARGB( 255, 255,255,25";
__ref._lblvalue.setTextColor(__c.Colors.ARGB((int) (255),(int) (255),(int) (255),(int) (255)));
RDebugUtils.currentLine=16515103;
 //BA.debugLineNum = 16515103;BA.debugLine="lblUnit.textColor = Colors.ARGB( 128, 255,255,255";
__ref._lblunit.setTextColor(__c.Colors.ARGB((int) (128),(int) (255),(int) (255),(int) (255)));
RDebugUtils.currentLine=16515106;
 //BA.debugLineNum = 16515106;BA.debugLine="lblText.Typeface = pirulen";
__ref._lbltext.setTypeface((android.graphics.Typeface)(_pirulen.getObject()));
RDebugUtils.currentLine=16515107;
 //BA.debugLineNum = 16515107;BA.debugLine="lblText.Gravity = Bit.Or( Gravity.LEFT, Gravity.";
__ref._lbltext.setGravity(__c.Bit.Or(__c.Gravity.LEFT,__c.Gravity.TOP));
RDebugUtils.currentLine=16515108;
 //BA.debugLineNum = 16515108;BA.debugLine="lblValue.Typeface = dsdigi";
__ref._lblvalue.setTypeface((android.graphics.Typeface)(_dsdigi.getObject()));
RDebugUtils.currentLine=16515109;
 //BA.debugLineNum = 16515109;BA.debugLine="lblValue.Padding = Array As Int(0, 0, 0, 0)";
__ref._lblvalue.setPadding(new int[]{(int) (0),(int) (0),(int) (0),(int) (0)});
RDebugUtils.currentLine=16515110;
 //BA.debugLineNum = 16515110;BA.debugLine="Dim jo As JavaObject = lblValue";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo.setObject((java.lang.Object)(__ref._lblvalue.getObject()));
RDebugUtils.currentLine=16515111;
 //BA.debugLineNum = 16515111;BA.debugLine="jo.RunMethod(\"setIncludeFontPadding\", Array(Fals";
_jo.RunMethod("setIncludeFontPadding",new Object[]{(Object)(__c.False)});
RDebugUtils.currentLine=16515112;
 //BA.debugLineNum = 16515112;BA.debugLine="lblValue.Gravity = Bit.Or( Gravity.CENTER_HORIZO";
__ref._lblvalue.setGravity(__c.Bit.Or(__c.Gravity.CENTER_HORIZONTAL,__c.Gravity.BOTTOM));
RDebugUtils.currentLine=16515113;
 //BA.debugLineNum = 16515113;BA.debugLine="lblUnit.Typeface = pirulen";
__ref._lblunit.setTypeface((android.graphics.Typeface)(_pirulen.getObject()));
RDebugUtils.currentLine=16515114;
 //BA.debugLineNum = 16515114;BA.debugLine="lblUnit.Gravity = Bit.Or( Gravity.RIGHT, Gravity";
__ref._lblunit.setGravity(__c.Bit.Or(__c.Gravity.RIGHT,__c.Gravity.TOP));
RDebugUtils.currentLine=16515119;
 //BA.debugLineNum = 16515119;BA.debugLine="mBase.AddView( lblText, 0.05*mBase.width, 0.05*mB";
__ref._mbase.AddView((android.view.View)(__ref._lbltext.getObject()),(int) (0.05*__ref._mbase.getWidth()),(int) (0.05*__ref._mbase.getHeight()),(int) (0.6*__ref._mbase.getWidth()),(int) (0.2*__ref._mbase.getHeight()));
RDebugUtils.currentLine=16515122;
 //BA.debugLineNum = 16515122;BA.debugLine="mBase.AddView( lblValue, 0.05*mBase.width, 0.25*m";
__ref._mbase.AddView((android.view.View)(__ref._lblvalue.getObject()),(int) (0.05*__ref._mbase.getWidth()),(int) (0.25*__ref._mbase.getHeight()),(int) (0.9*__ref._mbase.getWidth()),(int) (0.72*__ref._mbase.getHeight()));
RDebugUtils.currentLine=16515123;
 //BA.debugLineNum = 16515123;BA.debugLine="mBase.AddView( lblUnit, 0.65*mBase.Width, 0.05*mB";
__ref._mbase.AddView((android.view.View)(__ref._lblunit.getObject()),(int) (0.65*__ref._mbase.getWidth()),(int) (0.05*__ref._mbase.getHeight()),(int) (__ref._mbase.getWidth()*0.31),(int) (0.20*__ref._mbase.getHeight()));
RDebugUtils.currentLine=16515125;
 //BA.debugLineNum = 16515125;BA.debugLine="SetText( Props.Get(\"Txt\") )";
__ref._settext(null,BA.ObjectToString(_props.Get((Object)("Txt"))));
RDebugUtils.currentLine=16515126;
 //BA.debugLineNum = 16515126;BA.debugLine="SetValue( \"00.0\")";
__ref._setvalue(null,"00.0");
RDebugUtils.currentLine=16515127;
 //BA.debugLineNum = 16515127;BA.debugLine="SetUnit( Props.Get(\"Unit\") )";
__ref._setunit(null,BA.ObjectToString(_props.Get((Object)("Unit"))));
RDebugUtils.currentLine=16515128;
 //BA.debugLineNum = 16515128;BA.debugLine="If Main.kvs.ContainsKey(mEventName) Then";
if (_main._kvs._containskey(null,__ref._meventname)) { 
RDebugUtils.currentLine=16515129;
 //BA.debugLineNum = 16515129;BA.debugLine="Dim lTag = Main.kvs.GetObject( mEventName ) As L";
_ltag = new anywheresoftware.b4a.objects.collections.List();
_ltag.setObject((java.util.List)(_main._kvs._getobject(null,__ref._meventname)));
RDebugUtils.currentLine=16515130;
 //BA.debugLineNum = 16515130;BA.debugLine="SetText( lTag.Get(0) )";
__ref._settext(null,BA.ObjectToString(_ltag.Get((int) (0))));
RDebugUtils.currentLine=16515131;
 //BA.debugLineNum = 16515131;BA.debugLine="SetUnit( lTag.Get(1) )";
__ref._setunit(null,BA.ObjectToString(_ltag.Get((int) (1))));
 };
RDebugUtils.currentLine=16515134;
 //BA.debugLineNum = 16515134;BA.debugLine="AUTO_SIZE1(lblText)";
__ref._auto_size1(null,__ref._lbltext);
RDebugUtils.currentLine=16515135;
 //BA.debugLineNum = 16515135;BA.debugLine="AUTO_SIZE1(lblValue)";
__ref._auto_size1(null,__ref._lblvalue);
RDebugUtils.currentLine=16515136;
 //BA.debugLineNum = 16515136;BA.debugLine="AUTO_SIZE1(lblUnit)";
__ref._auto_size1(null,__ref._lblunit);
RDebugUtils.currentLine=16515148;
 //BA.debugLineNum = 16515148;BA.debugLine="End Sub";
return "";
}
public String  _settext(com.calypsoinstruments.anemotracker.tag __ref,String _txt) throws Exception{
__ref = this;
RDebugUtils.currentModule="tag";
if (Debug.shouldDelegate(ba, "settext"))
	 {return ((String) Debug.delegate(ba, "settext", new Object[] {_txt}));}
RDebugUtils.currentLine=16908288;
 //BA.debugLineNum = 16908288;BA.debugLine="Public Sub SetText( txt As String )";
RDebugUtils.currentLine=16908289;
 //BA.debugLineNum = 16908289;BA.debugLine="lblText.Text = txt";
__ref._lbltext.setText(BA.ObjectToCharSequence(_txt));
RDebugUtils.currentLine=16908291;
 //BA.debugLineNum = 16908291;BA.debugLine="AUTO_SIZE1(lblText)";
__ref._auto_size1(null,__ref._lbltext);
RDebugUtils.currentLine=16908292;
 //BA.debugLineNum = 16908292;BA.debugLine="AUTO_SIZE1(lblValue)";
__ref._auto_size1(null,__ref._lblvalue);
RDebugUtils.currentLine=16908293;
 //BA.debugLineNum = 16908293;BA.debugLine="AUTO_SIZE1(lblUnit)";
__ref._auto_size1(null,__ref._lblunit);
RDebugUtils.currentLine=16908298;
 //BA.debugLineNum = 16908298;BA.debugLine="End Sub";
return "";
}
public String  _setvalue(com.calypsoinstruments.anemotracker.tag __ref,String _txt) throws Exception{
__ref = this;
RDebugUtils.currentModule="tag";
if (Debug.shouldDelegate(ba, "setvalue"))
	 {return ((String) Debug.delegate(ba, "setvalue", new Object[] {_txt}));}
RDebugUtils.currentLine=16973824;
 //BA.debugLineNum = 16973824;BA.debugLine="Public Sub SetValue( txt As String )";
RDebugUtils.currentLine=16973825;
 //BA.debugLineNum = 16973825;BA.debugLine="lblValue.Text = txt";
__ref._lblvalue.setText(BA.ObjectToCharSequence(_txt));
RDebugUtils.currentLine=16973829;
 //BA.debugLineNum = 16973829;BA.debugLine="End Sub";
return "";
}
public String  _setunit(com.calypsoinstruments.anemotracker.tag __ref,String _txt) throws Exception{
__ref = this;
RDebugUtils.currentModule="tag";
if (Debug.shouldDelegate(ba, "setunit"))
	 {return ((String) Debug.delegate(ba, "setunit", new Object[] {_txt}));}
RDebugUtils.currentLine=17039360;
 //BA.debugLineNum = 17039360;BA.debugLine="Public Sub SetUnit( txt As String )";
RDebugUtils.currentLine=17039361;
 //BA.debugLineNum = 17039361;BA.debugLine="lblUnit.Text = txt";
__ref._lblunit.setText(BA.ObjectToCharSequence(_txt));
RDebugUtils.currentLine=17039363;
 //BA.debugLineNum = 17039363;BA.debugLine="AUTO_SIZE1(lblText)";
__ref._auto_size1(null,__ref._lbltext);
RDebugUtils.currentLine=17039364;
 //BA.debugLineNum = 17039364;BA.debugLine="AUTO_SIZE1(lblValue)";
__ref._auto_size1(null,__ref._lblvalue);
RDebugUtils.currentLine=17039365;
 //BA.debugLineNum = 17039365;BA.debugLine="AUTO_SIZE1(lblUnit)";
__ref._auto_size1(null,__ref._lblunit);
RDebugUtils.currentLine=17039370;
 //BA.debugLineNum = 17039370;BA.debugLine="End Sub";
return "";
}
public String  _initialize(com.calypsoinstruments.anemotracker.tag __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="tag";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
RDebugUtils.currentLine=16449536;
 //BA.debugLineNum = 16449536;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=16449537;
 //BA.debugLineNum = 16449537;BA.debugLine="mEventName = EventName";
__ref._meventname = _eventname;
RDebugUtils.currentLine=16449538;
 //BA.debugLineNum = 16449538;BA.debugLine="mCallBack = Callback";
__ref._mcallback = _callback;
RDebugUtils.currentLine=16449540;
 //BA.debugLineNum = 16449540;BA.debugLine="Dim bmp As Bitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=16449541;
 //BA.debugLineNum = 16449541;BA.debugLine="bmp.InitializeMutable(1,1) 'ignore";
_bmp.InitializeMutable((int) (1),(int) (1));
RDebugUtils.currentLine=16449542;
 //BA.debugLineNum = 16449542;BA.debugLine="cvs.Initialize2(bmp)";
__ref._cvs.Initialize2((android.graphics.Bitmap)(_bmp.getObject()));
RDebugUtils.currentLine=16449544;
 //BA.debugLineNum = 16449544;BA.debugLine="End Sub";
return "";
}
public void  _panel1_longclick(com.calypsoinstruments.anemotracker.tag __ref) throws Exception{
RDebugUtils.currentModule="tag";
if (Debug.shouldDelegate(ba, "panel1_longclick"))
	 {Debug.delegate(ba, "panel1_longclick", null); return;}
ResumableSub_Panel1_LongClick rsub = new ResumableSub_Panel1_LongClick(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Panel1_LongClick extends BA.ResumableSub {
public ResumableSub_Panel1_LongClick(com.calypsoinstruments.anemotracker.tag parent,com.calypsoinstruments.anemotracker.tag __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
com.calypsoinstruments.anemotracker.tag __ref;
com.calypsoinstruments.anemotracker.tag parent;
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
int _res = 0;
boolean _flagpositive = false;
anywheresoftware.b4a.objects.collections.List _ltag = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="tag";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=17104899;
 //BA.debugLineNum = 17104899;BA.debugLine="If SubExists(mCallBack, mEventName & \"_LongClick";
if (true) break;

case 1:
//if
this.state = 4;
if (parent.__c.SubExists(ba,__ref._mcallback,__ref._meventname+"_LongClick")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=17104900;
 //BA.debugLineNum = 17104900;BA.debugLine="CallSub( mCallBack, mEventName & \"_LongClick\" )";
parent.__c.CallSubNew(ba,__ref._mcallback,__ref._meventname+"_LongClick");
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=17104910;
 //BA.debugLineNum = 17104910;BA.debugLine="Dim sf As Object = TagDialog.ShowAsync(\"Enter va";
_sf = __ref._tagdialog.ShowAsync("Enter variable","Ok","Cancel","",ba,(android.graphics.Bitmap)(parent.__c.LoadBitmap(parent.__c.File.getDirAssets(),"form.png").getObject()),parent.__c.True);
RDebugUtils.currentLine=17104911;
 //BA.debugLineNum = 17104911;BA.debugLine="TagDialog.SetSize(100%x, 400dip)";
__ref._tagdialog.SetSize(parent.__c.PerXToCurrent((float) (100),ba),parent.__c.DipToCurrent((int) (400)));
RDebugUtils.currentLine=17104912;
 //BA.debugLineNum = 17104912;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "tag", "panel1_longclick"), _sf);
this.state = 12;
return;
case 12:
//C
this.state = 5;
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=17104913;
 //BA.debugLineNum = 17104913;BA.debugLine="pnl.LoadLayout(\"dlg_tag\")";
_pnl.LoadLayout("dlg_tag",ba);
RDebugUtils.currentLine=17104934;
 //BA.debugLineNum = 17104934;BA.debugLine="sp_tag.AddAll( lTags )";
__ref._sp_tag.AddAll(__ref._ltags);
RDebugUtils.currentLine=17104935;
 //BA.debugLineNum = 17104935;BA.debugLine="sp_tag.SelectedIndex = lTags.IndexOf( lblText.Te";
__ref._sp_tag.setSelectedIndex(__ref._ltags.IndexOf((Object)(__ref._lbltext.getText())));
RDebugUtils.currentLine=17104936;
 //BA.debugLineNum = 17104936;BA.debugLine="sp_tag_ItemClick( 0,0)";
__ref._sp_tag_itemclick(null,(int) (0),(Object)(0));
RDebugUtils.currentLine=17104952;
 //BA.debugLineNum = 17104952;BA.debugLine="Wait For (sf) Dialog_Result (res As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "tag", "panel1_longclick"), _sf);
this.state = 13;
return;
case 13:
//C
this.state = 5;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=17104953;
 //BA.debugLineNum = 17104953;BA.debugLine="Dim flagPositive = False As Boolean";
_flagpositive = parent.__c.False;
RDebugUtils.currentLine=17104967;
 //BA.debugLineNum = 17104967;BA.debugLine="If res = DialogResponse.POSITIVE Then";
if (true) break;

case 5:
//if
this.state = 8;
if (_res==parent.__c.DialogResponse.POSITIVE) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=17104969;
 //BA.debugLineNum = 17104969;BA.debugLine="SetText( sp_tag.SelectedItem )";
__ref._settext(null,__ref._sp_tag.getSelectedItem());
RDebugUtils.currentLine=17104970;
 //BA.debugLineNum = 17104970;BA.debugLine="SetUnit( sp_unit.SelectedItem )";
__ref._setunit(null,__ref._sp_unit.getSelectedItem());
RDebugUtils.currentLine=17104971;
 //BA.debugLineNum = 17104971;BA.debugLine="flagPositive = True";
_flagpositive = parent.__c.True;
 if (true) break;
;
RDebugUtils.currentLine=17104974;
 //BA.debugLineNum = 17104974;BA.debugLine="If flagPositive Then";

case 8:
//if
this.state = 11;
if (_flagpositive) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=17104975;
 //BA.debugLineNum = 17104975;BA.debugLine="Dim lTag As List";
_ltag = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=17104976;
 //BA.debugLineNum = 17104976;BA.debugLine="lTag.Initialize";
_ltag.Initialize();
RDebugUtils.currentLine=17104977;
 //BA.debugLineNum = 17104977;BA.debugLine="lTag.Add( lblText.Text )";
_ltag.Add((Object)(__ref._lbltext.getText()));
RDebugUtils.currentLine=17104978;
 //BA.debugLineNum = 17104978;BA.debugLine="lTag.Add( lblUnit.Text )";
_ltag.Add((Object)(__ref._lblunit.getText()));
RDebugUtils.currentLine=17104979;
 //BA.debugLineNum = 17104979;BA.debugLine="Main.kvs.PutObject( mEventName, lTag )";
parent._main._kvs._putobject(null,__ref._meventname,(Object)(_ltag.getObject()));
 if (true) break;

case 11:
//C
this.state = -1;
;
RDebugUtils.currentLine=17104987;
 //BA.debugLineNum = 17104987;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _sp_tag_itemclick(com.calypsoinstruments.anemotracker.tag __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="tag";
if (Debug.shouldDelegate(ba, "sp_tag_itemclick"))
	 {return ((String) Debug.delegate(ba, "sp_tag_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=17235968;
 //BA.debugLineNum = 17235968;BA.debugLine="Sub sp_tag_ItemClick (Position As Int, Value As Ob";
RDebugUtils.currentLine=17235970;
 //BA.debugLineNum = 17235970;BA.debugLine="sp_unit.Clear";
__ref._sp_unit.Clear();
RDebugUtils.currentLine=17235971;
 //BA.debugLineNum = 17235971;BA.debugLine="Select sp_tag.SelectedItem As String";
switch (BA.switchObjectToInt(__ref._sp_tag.getSelectedItem(),"AWA","TWA","AWM","TWM","Speed","Temp","Batt","Mag HDG","Roll","Pitch")) {
case 0: 
case 1: {
RDebugUtils.currentLine=17235973;
 //BA.debugLineNum = 17235973;BA.debugLine="sp_unit.AddAll( Array As String( \"degrees\" ) )";
__ref._sp_unit.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"degrees"}));
 break; }
case 2: 
case 3: 
case 4: {
RDebugUtils.currentLine=17235975;
 //BA.debugLineNum = 17235975;BA.debugLine="sp_unit.addall( Array As String( \"knots\", \"m/s\"";
__ref._sp_unit.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"knots","m/s","km/h"}));
 break; }
case 5: {
RDebugUtils.currentLine=17235977;
 //BA.debugLineNum = 17235977;BA.debugLine="sp_unit.AddAll( Array As String( \"ºC\", \"ºF\" ))";
__ref._sp_unit.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"ºC","ºF"}));
 break; }
case 6: {
RDebugUtils.currentLine=17235979;
 //BA.debugLineNum = 17235979;BA.debugLine="sp_unit.AddAll( Array As String (\"%\"))";
__ref._sp_unit.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"%"}));
 break; }
case 7: 
case 8: 
case 9: {
RDebugUtils.currentLine=17235981;
 //BA.debugLineNum = 17235981;BA.debugLine="sp_unit.AddAll( Array As String( \"degrees\" ) )";
__ref._sp_unit.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"degrees"}));
 break; }
}
;
RDebugUtils.currentLine=17235984;
 //BA.debugLineNum = 17235984;BA.debugLine="End Sub";
return "";
}
public String  _pause(com.calypsoinstruments.anemotracker.tag __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tag";
if (Debug.shouldDelegate(ba, "pause"))
	 {return ((String) Debug.delegate(ba, "pause", null));}
RDebugUtils.currentLine=16711680;
 //BA.debugLineNum = 16711680;BA.debugLine="Public Sub Pause";
RDebugUtils.currentLine=16711682;
 //BA.debugLineNum = 16711682;BA.debugLine="End Sub";
return "";
}
public String  _pk_tag_itemselected(com.calypsoinstruments.anemotracker.tag __ref,int _column,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="tag";
if (Debug.shouldDelegate(ba, "pk_tag_itemselected"))
	 {return ((String) Debug.delegate(ba, "pk_tag_itemselected", new Object[] {_column,_row}));}
RDebugUtils.currentLine=17301504;
 //BA.debugLineNum = 17301504;BA.debugLine="Sub pk_tag_ItemSelected (Column As Int, Row As Int";
RDebugUtils.currentLine=17301522;
 //BA.debugLineNum = 17301522;BA.debugLine="End Sub";
return "";
}
public String  _sp_unit_itemclick(com.calypsoinstruments.anemotracker.tag __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="tag";
if (Debug.shouldDelegate(ba, "sp_unit_itemclick"))
	 {return ((String) Debug.delegate(ba, "sp_unit_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=17170432;
 //BA.debugLineNum = 17170432;BA.debugLine="Sub sp_unit_ItemClick (Position As Int, Value As O";
RDebugUtils.currentLine=17170434;
 //BA.debugLineNum = 17170434;BA.debugLine="End Sub";
return "";
}
public String  _update(com.calypsoinstruments.anemotracker.tag __ref,boolean _selected) throws Exception{
__ref = this;
RDebugUtils.currentModule="tag";
if (Debug.shouldDelegate(ba, "update"))
	 {return ((String) Debug.delegate(ba, "update", new Object[] {_selected}));}
com.calypsoinstruments.anemotracker.windcalcs _calcs = null;
float _value = 0f;
String _strv = "";
RDebugUtils.currentLine=16777216;
 //BA.debugLineNum = 16777216;BA.debugLine="Public Sub Update( selected As Boolean )";
RDebugUtils.currentLine=16777220;
 //BA.debugLineNum = 16777220;BA.debugLine="Dim calcs = Starter.calcs_1 As WindCalcs";
_calcs = _starter._calcs_1;
RDebugUtils.currentLine=16777225;
 //BA.debugLineNum = 16777225;BA.debugLine="Dim value As Float";
_value = 0f;
RDebugUtils.currentLine=16777226;
 //BA.debugLineNum = 16777226;BA.debugLine="Dim strv As String";
_strv = "";
RDebugUtils.currentLine=16777227;
 //BA.debugLineNum = 16777227;BA.debugLine="Select lblText.Text";
switch (BA.switchObjectToInt(__ref._lbltext.getText(),"AWM","AWA","TWM","TWA","Speed","Temp","Batt","Roll","Pitch","Mag HDG")) {
case 0: {
RDebugUtils.currentLine=16777229;
 //BA.debugLineNum = 16777229;BA.debugLine="value = calcs.awm";
_value = _calcs._awm;
 break; }
case 1: {
RDebugUtils.currentLine=16777231;
 //BA.debugLineNum = 16777231;BA.debugLine="value = calcs.awa";
_value = _calcs._awa;
 break; }
case 2: {
RDebugUtils.currentLine=16777233;
 //BA.debugLineNum = 16777233;BA.debugLine="value = calcs.twm";
_value = _calcs._twm;
 break; }
case 3: {
RDebugUtils.currentLine=16777235;
 //BA.debugLineNum = 16777235;BA.debugLine="value = calcs.twa";
_value = _calcs._twa;
 break; }
case 4: {
RDebugUtils.currentLine=16777237;
 //BA.debugLineNum = 16777237;BA.debugLine="value = calcs.speed";
_value = _calcs._speed;
 break; }
case 5: {
RDebugUtils.currentLine=16777239;
 //BA.debugLineNum = 16777239;BA.debugLine="value = calcs.temp";
_value = (float) (_calcs._temp);
 break; }
case 6: {
RDebugUtils.currentLine=16777241;
 //BA.debugLineNum = 16777241;BA.debugLine="value = calcs.battery";
_value = (float) (_calcs._battery);
 break; }
case 7: {
RDebugUtils.currentLine=16777243;
 //BA.debugLineNum = 16777243;BA.debugLine="value = calcs.roll";
_value = (float) (_calcs._roll);
 break; }
case 8: {
RDebugUtils.currentLine=16777245;
 //BA.debugLineNum = 16777245;BA.debugLine="value = calcs.pitch";
_value = (float) (_calcs._pitch);
 break; }
case 9: {
RDebugUtils.currentLine=16777247;
 //BA.debugLineNum = 16777247;BA.debugLine="value = calcs.ecompass";
_value = (float) (_calcs._ecompass);
 break; }
}
;
RDebugUtils.currentLine=16777251;
 //BA.debugLineNum = 16777251;BA.debugLine="value = convert( value, lblUnit.Text )";
_value = (float)(Double.parseDouble(__ref._convert(null,_value,__ref._lblunit.getText())));
RDebugUtils.currentLine=16777252;
 //BA.debugLineNum = 16777252;BA.debugLine="Select lblText.Text";
switch (BA.switchObjectToInt(__ref._lbltext.getText(),"AWA","TWA","Roll","Pitch","Batt","Mag HDG","AWM","TWM","Speed","Temp")) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: 
case 5: {
RDebugUtils.currentLine=16777254;
 //BA.debugLineNum = 16777254;BA.debugLine="strv = NumberFormat( value, 3, 0 )";
_strv = __c.NumberFormat(_value,(int) (3),(int) (0));
 break; }
case 6: 
case 7: 
case 8: {
RDebugUtils.currentLine=16777256;
 //BA.debugLineNum = 16777256;BA.debugLine="If lblUnit.Text = \"km/h\" Then";
if ((__ref._lblunit.getText()).equals("km/h")) { 
RDebugUtils.currentLine=16777257;
 //BA.debugLineNum = 16777257;BA.debugLine="strv = NumberFormat2( value, 3, 1, 1, False )";
_strv = __c.NumberFormat2(_value,(int) (3),(int) (1),(int) (1),__c.False);
 }else {
RDebugUtils.currentLine=16777259;
 //BA.debugLineNum = 16777259;BA.debugLine="strv = NumberFormat2( value, 2, 1, 1, False )";
_strv = __c.NumberFormat2(_value,(int) (2),(int) (1),(int) (1),__c.False);
 };
 break; }
case 9: {
RDebugUtils.currentLine=16777262;
 //BA.debugLineNum = 16777262;BA.debugLine="strv = NumberFormat( value, 2, 1 )";
_strv = __c.NumberFormat(_value,(int) (2),(int) (1));
 break; }
}
;
RDebugUtils.currentLine=16777266;
 //BA.debugLineNum = 16777266;BA.debugLine="SetValue( strv  )";
__ref._setvalue(null,_strv);
RDebugUtils.currentLine=16777268;
 //BA.debugLineNum = 16777268;BA.debugLine="End Sub";
return "";
}
}