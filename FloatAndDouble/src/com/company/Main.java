package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println("myMaxFloatValue = " + myMaxFloatValue);
        System.out.println("myMinFloatValue = " + myMinFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("myMaxDoubleValue = " + myMaxDoubleValue);
        System.out.println("myMinDoubleValue = " + myMinDoubleValue);

        int myIntValue = 5 / 2;
        float myFloatValue = 5.25f / 2;
        double myDoubleValue = 5.25678d / 6;

        System.out.println(myIntValue);
        System.out.println(myDoubleValue);
        System.out.println(myFloatValue);
        //calculate how many pound is equal to 1 kg

        double Pound = 1;
        double kg = Pound / 0.45359237d;
        System.out.println("1 kg = ?");
        System.out.println(kg);
        double pi = 3.1457578;
        int r = 20;
        double areaOfCircle = pi * r * r;
        System.out.println("area = "+ areaOfCircle);
    }
}
