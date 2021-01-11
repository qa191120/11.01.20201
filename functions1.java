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
        //sum2Numbers(5, 10);
        sum2Numbers(number1, number2);
        diff2Numbers(number1, number2);
        mul2Numbers(number1, number2);
        div2Numbers(number1, number2);

    }
    private static void sum2Numbers(int num1, int num2) {
        System.out.println(String.format("%d + %d = %d", num1, num2, num1+num2));
    }
    private static void diff2Numbers(int num1, int num2) {
        System.out.println(String.format("%d - %d = %d", num1, num2, num1-num2));
    }
    private static void mul2Numbers(int num1, int num2) {
        System.out.println(String.format("%d * %d = %d", num1, num2, num1*num2));
    }
    private static void div2Numbers(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Cannot divide by zero!");
        }
        else {
            System.out.println(String.format("%d / %d = %f", num1, num2, (float) num1 / num2));
        }
    }
}
