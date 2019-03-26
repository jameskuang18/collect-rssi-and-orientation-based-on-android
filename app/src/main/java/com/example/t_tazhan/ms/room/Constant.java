package com.example.t_tazhan.ms.room;

import java.util.Set;
import java.util.TreeMap;
/*
if couldn't search out a beacon,then make the missing one as 0
 */
public class Constant {
    public static final String A = "F0:F8:F2:D0:45:B5";
    public static final String B = "F0:F8:F2:D0:48:4C";
    public static final String C = "F0:F8:F2:D0:49:C1";
    public static final String D = "F0:F8:F2:D0:48:48";
    public static final String E = "F0:F8:F2:D0:49:AE";
    public static final String F = "F0:F8:F2:D0:48:79";
    public static final String G = "F0:F8:F2:D0:49:A7";
    public static final String H = "F0:F8:F2:D0:3C:59";
    public static String getBeacon(String beacon) {
        String value;
        switch (beacon) {
            case A :
                value = "A";
                break;
            case B :
                value = "B";
                break;
            case C :
                value = "C";
                break;
            case D :
                value = "D";
                break;
            case E :
                value = "E";
                break;
            case F :
                value = "F";
                break;
            case G :
                value = "G";
                break;
                //找不到G
            case H :
                value = "H";
                break;
            default:
                value = "mac";
        }
        return value;
    }
    public static TreeMap<String,String> map = new TreeMap<String, String>();
    public static void storageValue(String key,String value) {
        map.put(key,value);
    }
    public static Set<String> set ;
    //未搜索到，信标RSSI置为0
    public static void ifConclude( ) {
        set = map.keySet();
        if (!set.contains("A")) {
            map.put("A","0");
        }
        if (!set.contains("B")) {
            map.put("B","0");
        }
        if (!set.contains("C")) {
            map.put("C","0");
        }
        if (!set.contains("D")) {
            map.put("D","0");
        }
        if (!set.contains("E")) {
            map.put("E","0");
        }
        if (!set.contains("F")) {
            map.put("F","0");
        }
        if (!set.contains("G")) {
            map.put("G","0");
        }
        if (!set.contains("H")) {
            map.put("H","0");
        }
    }
}
