package com.jetBrains;

import java.util.Scanner;

public class Pyramid {

    public static void main(String[] args) {
        // write your code here
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the pyramid height: ");
        int userNum = scnr.nextInt();
        triangle(userNum);
    }

    public static int triangle(int userInput) {
        int lala = 0;
        int reverse = 1;
        int uI = userInput;
        while (reverse < uI + 1) {
            for (int i = 0; i < userInput; i++) {
                for (int j = 0; j < userInput; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < reverse; j++) {
                    System.out.print("* ");
                }
                for (int j = 0; j < userInput; j++) {
                    System.out.print(" ");
                }
                System.out.println(" ");
                userInput -= 1;
                reverse += 1;
            }
        }
        return lala;
    }
}