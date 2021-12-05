package com.kodilla.clocks;

import java.util.LinkedList;
import java.util.List;

public class Application {
    public static void main (String[] args) throws java.lang.Exception {

        Clock clock1 = new Clock("Clock 1", 23, 59);
        Clock clock2 = new Clock("Clock 1", 10, 33);
        Clock clock3 = new Clock("Clock 1", 20, 25);
        Clock clock4 = new Clock("Clock 1", 5, 59);
        Clock clock5 = new Clock("Clock 1", 0, 8);

        List<Clock> clockList = new LinkedList<>();
        clockList.add(clock1);
        clockList.add(clock2);
        clockList.add(clock3);
        clockList.add(clock4);
        clockList.add(clock5);

        System.out.println("Present time on our clocks:");
        for (Clock clocksNow : clockList) {
            clocksNow.showClock();
        }

        System.out.println("");
        System.out.println("Time on our clocks one minute later:");
        for (Clock clocksOneLater : clockList) {
            clocksOneLater.tickOneMinute();
            clocksOneLater.showClock();
        }
    }

}
