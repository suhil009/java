package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    boolean gameover = true;
    int score = 800;
    int bonus = 100;
    int levels = 5;

    if (gameover){
      int finalScore = score + (levels * bonus);
        System.out.println("your  final Score is = "+finalScore);
    }
    score = 10000;
    levels = 8;
    bonus = 200;
        if (gameover){
            int finalScore = score + (levels * bonus);
            System.out.println("your  final Score is = "+finalScore);
        }
    }
}
