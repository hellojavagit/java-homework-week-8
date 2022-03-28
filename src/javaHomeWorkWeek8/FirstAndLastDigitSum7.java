package javaHomeWorkWeek8;
//program to add first and last digits in an entered number and return total.

public class FirstAndLastDigitSum7 {
    public static void main(String[] args) {
        System.out.println(sumDigits(252));
        System.out.println(sumDigits(257));
        System.out.println(sumDigits(0));
        System.out.println(sumDigits(5));
        System.out.println(sumDigits(-10));
    }//method creation to calculate the total
    public static int sumDigits(int number) {

        if (number < 0) {
            return -1;
        }
        int firstdigit = number % 10;
        int lastdigit = 0;
        for (int i = number; i != 0; ) {
            lastdigit = i % 10;
            i = i / 10;
        }
         return (firstdigit + lastdigit);
    }
}