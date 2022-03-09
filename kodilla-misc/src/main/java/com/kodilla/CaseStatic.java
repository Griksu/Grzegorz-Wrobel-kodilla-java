package com.kodilla;

public class CaseStatic {
    private int instanceField;
    private static int staticField = 5;

    public CaseStatic(int instanceField) {
        this.instanceField = instanceField;
    }

    public static void main(String[] args) {
        System.out.println("Static field (by class): " +
                CaseStatic.staticField);

        CaseStatic object1 = new CaseStatic(10);

        System.out.println("Static field (by object): " +
                object1.staticField);
        CaseStatic object2 = new CaseStatic(15);
        object2.staticField = -20;

        System.out.println("Static field after modification (by class): " +
                CaseStatic.staticField);
    }
}
