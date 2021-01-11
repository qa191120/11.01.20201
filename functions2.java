package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)  {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        System.out.println(Math.pow(2, 8));
        // write function that gets a,b and prints a pow b (a , b are double)
        // 2, 8 ==> 2.0 ^ 8.0 = 256.0
        myPower(2.129783,8);
        myPower(2.129783);
        myPower();
        // myPower (4 parameters ) ==> print: a ^ b print: c ^ d
        // myAdd (int a, int b) prints a+b
        // myAdd (int a) prints a
        // myAdd () prints 0
        // write functions:
        // *etgar: function myCalc(String s, int a, int b)
        //  use switch-case: 
        // if s is "+" print (a+b)
        // if s is "-" print (a-b)
        // if s is "*" print (a*b)
        // if s is "/" print (a/b)
        // **etgar: function that gets (int a, int b) --> calls myCalc with "+" in s
        // *etgar: function that gets (int[] a) 
        // and puts random number in array
        // *etgar: function that gets (int[] a) 
        // and prints the array
    }
    private static void myPower(double a, double b) { // overloading
        System.out.println(String.format("%f ^ %f = %f", a, b, Math.pow(a,b)));
    }
    private static void myPower(double a) { // overloading
        System.out.println(String.format("%f ^ %f = %f", a, 0.0, Math.pow(a,0.0)));
    }
    private static void myPower() { // overloading
        System.out.println(String.format("%f ^ %f = %f", 0.0, 0.0, Math.pow(0.0,0.0)));
    }
}
