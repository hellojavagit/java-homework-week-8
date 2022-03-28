package javaHomeWorkWeek8;

import java.util.Scanner;
//program to enter 2 digits and check if they have same digits or not

public class SharedDigit13 {
    public static void main(String[] args) {
       // hasSharedDigit(12,23);//all outputs working correct
        //hasSharedDigit(9,99);
       // hasSharedDigit(15,55);

        System.out.println("Enter first number" );
        Scanner sc = new Scanner(System.in);
        int fnumber = sc.nextInt();
        System.out.println("Enter Second Number");
        int snumber = sc.nextInt();
        System.out.println(hasSharedDigit(fnumber, snumber));
        sc.close();
    }

    public static boolean hasSharedDigit(int fnumber, int snumber) {
        {
            if ((fnumber >= 10 && fnumber <= 99) && (snumber >= 10 && snumber <= 99)) {
                int firstnum = fnumber % 10;
                int secondnum = snumber % 10;
                fnumber = firstnum / 10;
                snumber = snumber / 10;
                int num1= fnumber;
                int num2= snumber;
                if ((num1 == num2 || secondnum == fnumber) || num1  == secondnum|| firstnum == secondnum || firstnum == num2) {
                    return true;
                }

            }
        }
        return false;
    }
}