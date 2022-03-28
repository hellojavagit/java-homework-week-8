package javaHomeWorkWeek8;
//program to check if a number is palindrome or not and returning true
//if it is a palindrome and false if it is not a palindrome.

public class Palindrome5 {
    public static void main(String[] args)
    {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(7007));
        System.out.println(isPalindrome(11216));
        System.out.println(isPalindrome(1234554321));
    }
    public static  boolean isPalindrome(int number)
    {
        int r, sum=0,temp;
        temp = number;
        while(number!=0) {
            r = number % 10;
            sum = (sum * 10) + r;
            number = number / 10;
        }
        if (temp == sum)
           return true;
        else
            return false;
    }
    }


