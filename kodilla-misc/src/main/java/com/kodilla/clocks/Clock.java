package com.kodilla.clocks;

public class Clock {
    private String clockNumber;
    private int clockHour;
    private int clockMinute;

    //constructor
    public Clock (String clockNumber, int clockHour, int clockMinute) {
        this.clockNumber = clockNumber;
        this.clockHour = clockHour;
        this.clockMinute = clockMinute;
    }

    //getters
    public String getClockNumber() {
        return clockNumber;
    }

    public int getClockHour() {
        return clockHour;
    }

    public int getClockMinute() {
        return clockMinute;
    }

    public void tickOneMinute() {
        clockMinute = clockMinute + 1;
        clockHour = clockHour + clockMinute / 60;
        clockMinute = clockMinute % 60;
        clockHour = clockHour % 24;
    }

    public String strZero(int number, int len) {
        String s = "" + number;
        while (s.length() < len)
            s = "0" + s;
        return s;
    }

    public void showClock() {
        System.out.println(clockNumber + ": time " + strZero(clockHour, 2) + ":" + strZero(clockMinute, 2));
    }

}
