package com.company;

public class Main {

    public static void main(String[] args) {
        // this is to call a method; with different values
        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200);
        int secondMethod = calScore(true,2791,4,50);
        int secondsMethod = calScore(true,0,500,25);
    }

    public static void calculateScore(boolean gameOver, int score, int levels, int bonus) {

        if (gameOver) {
            int finalScore = score + (levels * bonus);
            finalScore += 2000;
            System.out.println("your  final Score is = " + finalScore);
        }
    }

    public static int calScore(boolean gameOver, int score, int levels, int bonus) {

        if (gameOver) {
            int finalScore = score + (levels * bonus);
            finalScore += 2000;
            System.out.println("your  final Score is = " + finalScore);
            return finalScore;
        } else {
            return -1;
        }
    }
}