package javaHomeWorkWeek8;

import java.util.Scanner;
// program to enter a number and print that many number of rows of '*'
// in leftangled triangle pattern

public class LeftAngledTriangle15 {
    public static void main(String[] args)
    {
        leftAngleTri();
    }


    public static void leftAngleTri() {
        System.out.println("Enter a number ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < (num + 1); i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}