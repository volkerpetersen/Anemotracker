package com.calypsoinstruments.anemotracker.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_navheaderlayout{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
if ((anywheresoftware.b4a.keywords.LayoutBuilder.getScreenSize()>6.5d)) { 
;
//BA.debugLineNum = 5;BA.debugLine="lbl_drawer_1.SetLeftAndRight(24dip, panel_drawer.Width - 24dip)"[navheaderlayout/General script]
views.get("lbl_drawer_1").vw.setLeft((int)((24d * scale)));
views.get("lbl_drawer_1").vw.setWidth((int)((views.get("panel_drawer").vw.getWidth())-(24d * scale) - ((24d * scale))));
//BA.debugLineNum = 6;BA.debugLine="lbl_drawer_2.SetLeftAndRight(24dip, panel_drawer.Width - 24dip)"[navheaderlayout/General script]
views.get("lbl_drawer_2").vw.setLeft((int)((24d * scale)));
views.get("lbl_drawer_2").vw.setWidth((int)((views.get("panel_drawer").vw.getWidth())-(24d * scale) - ((24d * scale))));
//BA.debugLineNum = 7;BA.debugLine="End If"[navheaderlayout/General script]
;};

}
}