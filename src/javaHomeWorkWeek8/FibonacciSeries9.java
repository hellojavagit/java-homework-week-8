package javaHomeWorkWeek8;

import java.util.Scanner;
//program to print the fibonacci series as per the number of terms entered by user.

public class FibonacciSeries9 {
    public static void main(String[] args)
    {
        printFibonacci();
    }
    public static void printFibonacci()
    {
        int num1 =0, num2 = 1 , i = 1;
        System.out.println("Enter how many terms you like to print");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("First  " + number + " terms of Fibonacci series is ");
        while(i<=number)
        {
            System.out.print(num1 + "  ");
            int sum = num1 + num2;
            num1= num2;
            num2= sum;
            i++;
        }

    }
}
