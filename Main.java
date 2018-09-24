package com.smylay;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i = 0;
        int t = 9;
        while (i <= 10 || t >= 0) {
            System.out.println("Hello World");
            i++;
            t--;
        }
        System.out.println("Enter a number: ");
        int n = reader.nextInt();
        System.out.println("Your number is " + n);
    }
}