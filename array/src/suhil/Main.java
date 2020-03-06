package suhil;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int myIntegers[] = getIntegers(5);

        int[] sorted = sortedArray(myIntegers);
        printArray(sorted);


    }

    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        for (int i = 0; i < capacity; i++) {
            System.out.println("please enter the value");
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("enter the value of " + i + " is " + array[i]);
        }
    }

    public static int[] sortedArray(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}