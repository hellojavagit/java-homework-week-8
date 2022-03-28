package javaHomeWorkWeek8;

import java.util.Scanner;
//program to add  all the digits in a number that has been entered and print the result.

public class DigitSumChallenge4 {
    public static void main(String[] args)
    {
        System.out.println(sumDigits(123));
        System.out.println(sumDigits(1));
    }
    public static int sumDigits(int number)
    {
       System.out.println("Enter a number");
      Scanner scan = new Scanner(System.in);
        number = scan.nextInt();
        if (number < 10) {
            return -1;
        }
        int sum = 0;
        while (number != 0) {
            sum = sum + (number % 10);
            number = number / 10;
        }
        return sum;
    }
}
