package com.company;

public class Main {

    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters('5.0', '10.0');
        double cm = calcFeetAndInchesToCentimeters('5.00', '10.00');
        System.out.println("cm = " + cm);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || inches < 0 || inches > 12) {
            return -1;
        }

        //1 feet = 30 centimeters
        //1 inches = 2.54 centimeters

        double centimeter = (30 * feet);
        centimeter += 2.5 * inches;
        return centimeter;
    }
}