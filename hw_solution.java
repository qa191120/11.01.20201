package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void printHello()  {
        System.out.println("Hello world!");
    }
    public static void print1To100() {
        for (int index = 1; index <= 100; index++) {
            System.out.println(index);
        }
    }
    
    public static void main(String[] args)  {

        Scanner s = new Scanner(System.in);
        Random r = new Random();

        printHello();
        print1To100();
        zugiOrNotZugi();
    }
    public static void zugiOrNotZugi() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = s.nextInt();
        // 9 % 2 == 1
        // 8 % 2 == 0
        if (number % 2 == 0) {
            System.out.println(String.format("%d is even", number));
        }
        else {
            System.out.println(String.format("%d is odd", number));
        }
    }

}
