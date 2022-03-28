package javaHomeWorkWeek8;

import java.util.Scanner;
//program to print number of rows of '@' symbol as entered by the user.

public class RightAngledTriangle8 {
    public static void main(String[] args) {
        rightAngledPattern();
    }
    public static void rightAngledPattern()
    {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter a number to print rows");
        int num = sc.nextInt();
        System.out.println("the right angled traingle pattern is ");
        for ( int i =1; i<=num;i++)
        {
            for (int j =1; j<=i;j++) {
                System.out.print("@");
            }
            System.out.println();
            }
        }
    }

