package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        double x = 20;
        double y = 80;
        double z = (x + y) * 100;
        System.out.println(z);

        double a = z % 40.00;

        System.out.println(a);

        boolean a1 = (a == 0) ? true : false;
        System.out.println(a1);
        if (!a1) {
            System.out.println("Got some reminder");
        }

    }


}
