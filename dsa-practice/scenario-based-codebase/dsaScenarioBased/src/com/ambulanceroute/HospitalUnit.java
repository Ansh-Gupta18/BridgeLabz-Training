package com.ambulanceroute;

public class HospitalUnit {
    String unitName;
    boolean isAvailable;
    HospitalUnit next;

    public HospitalUnit(String unitName, boolean isAvailable) {
        this.unitName = unitName;
        this.isAvailable = isAvailable;
        this.next = null;
    }
}
