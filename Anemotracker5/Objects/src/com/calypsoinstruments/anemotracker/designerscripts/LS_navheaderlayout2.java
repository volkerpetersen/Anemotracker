package com.calypsoinstruments.anemotracker.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_navheaderlayout2{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("headerlabel").vw.setTop((int)((views.get("panel_secondary").vw.getTop() + views.get("panel_secondary").vw.getHeight()/2) - (views.get("headerlabel").vw.getHeight() / 2)));

}
}