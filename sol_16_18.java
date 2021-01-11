package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)  {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        String hello = "hello world!";
        int len = hello.length();
        String[] words = {"Hello", "world", "java", "", "tonight", "tomorrow"};
        int counter = 0;
        for (int index = 0; index < words.length; index++) {
            int length_of_word = words[index].length();
            counter += length_of_word;
        }
        System.out.println(String.format("Sum of characters: %d", counter));

        int[] arr = {9, 100, -10000, 49564, 123, 1};
        int max = arr[0];
        int min = arr[0];
        for (int index = 1; index < arr.length; index++) {
            if (arr[index] > max) {
                max = arr[index];
            }
            if (arr[index] < min) {
                min = arr[index];
            }
        }
        System.out.println(String.format("Maximum is %d", max));
        System.out.println(String.format("Minimum is %d", min));
    }
}
