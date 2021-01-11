package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)  {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        int[] arr = {1,2,3};
        int[] brr = {-100, 700, 800000, 0};
        int[] crr = {};
        System.out.println("arr");
        printArray(arr);
        System.out.println("brr");
        printArray(brr);
        System.out.println("crr");
        printArray(crr);
        zeroArray(arr);
        zeroArray(brr);
        System.out.println("arr");
        printArray(arr);
        // function myCompare(String s1, String s2) -- print "equal" or "not equal"

        getNumberFromUser(s, "Please enter number:");
        getNumberFromUser(s, "Please enter grade:");
        getNumberFromUser(s, "Please enter your year of birth:");

        getAndPrintRandomNumber(r);
        
        // create a function that gets an array of int[] and prints the average
        // create a function that gets an array of String[] and prints it in one line
        // create a function that gets 2 arrays and prints the array with the larger size 
    }
    private static void getNumberFromUser(Scanner s, String message)
    {
        System.out.println(message);
        int number = s.nextInt();
    }
    private static void getAndPrintRandomNumber(Random r) {
        int number = r.nextInt();
        System.out.println(number);
    }
    private static void myCompare(String s1, String s2) {
        // a == b
        // s1 == s2
        if (s1.equals(s2)) {
            System.out.println("equals");
        }
        else {
            System.out.println("not equal");
        }
    }
    private static void zeroArray(int[] fn_arr) {
        for (int index = 0; index < fn_arr.length; index++) {
            fn_arr[index] = 0;
        }
    }
    private static void myAdd(int a, int b) {
        System.out.println(String.format("%d + %d = %d", a, b, a+b));
    }
    private static void printArray(int[] fn_arr) {
        for (int index = 0; index < fn_arr.length; index++) {
            System.out.println(fn_arr[index]);
        }
    }
}
