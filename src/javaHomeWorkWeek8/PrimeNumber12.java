package javaHomeWorkWeek8;

import java.util.Scanner;

//program to check if entered number is prime or not

public class PrimeNumber12 {
    public static void main(String[] args) {
        prime();
    }
    public static void prime() {
        int num, i, count = 0;
        System.out.println("Enter the number ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        // using for loop to intialize the i value and perform the loop
        for (i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count > 2) {
            System.out.println(num + " is not prime " );
        } else {
            System.out.println(num + " is Prime " );
        }
    }
}
