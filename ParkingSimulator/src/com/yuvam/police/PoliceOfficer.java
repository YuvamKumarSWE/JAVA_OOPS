package com.yuvam.police;

public class PoliceOfficer {
    private String fullName; // hold names of officer
    private int badgeNumber; // hold badge number


    public PoliceOfficer(String names, int badge) {
        fullName = names;
        badgeNumber = badge;
    }

    public PoliceOfficer(PoliceOfficer details) {
        fullName = details.fullName;
        badgeNumber = details.badgeNumber;
    }

    public void setOfficerDetails(String names, int badge) {
        fullName = names;
        badgeNumber = badge;
    }

    public String toString() {
        String str = fullName + ", badge #: " + badgeNumber;
        return str;
    }

}
