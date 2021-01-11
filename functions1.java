package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main
{

    public static void print1To100() {
        for (int index = 1; index <= 100; index++) {
            System.out.println(index);
        }
    }
    public static void print1ToMax(int max) { // argument parameter
        for (int index = 1; index <= max; index++) {
            System.out.println(index);
        }
    }
    public static void main(String[] args)  {

        Scanner s = new Scanner(System.in);
        Random r = new Random();

        print1To100();
        //print1To200();
        print1ToMax(300);
        print1ToMax(500);
        System.out.println("hello");
        System.out.println("goodbye");

        System.out.println("Please enter a number:");
        int number1 = s.nextInt();
        System.out.println("Please enter a 2nd number:");
        int number2 = s.nextInt();
        //System.out.println(number1 + number2);
        sum2Numbers(5, 10);
        sum2Numbers(number1, number2);
        // create function for minus/mul/div
        // *etgar in div -- check that num2 is not zero -- if so, do not divide
    }
    private static void sum2Numbers(int num1, int num2) {
        System.out.println(num1 + num2);
    }

}
