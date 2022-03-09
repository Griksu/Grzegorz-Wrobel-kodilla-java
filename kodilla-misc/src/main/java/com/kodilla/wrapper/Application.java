package com.kodilla.wrapper;

public class Application {

    public static void main(String[] args) {
        Integer ageO = new Integer(4);
        Double scalesO = 5.78;
        Character sexO = new Character('F');

        int age = 4;
        double scales = 5.78;
        char sex = 'F';

        if(ageO == age) {
            System.out.printf("int jest równy Integer");
        }
    }
}
