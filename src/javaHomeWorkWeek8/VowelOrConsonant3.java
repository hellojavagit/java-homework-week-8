package javaHomeWorkWeek8;

import java.util.Scanner;
// program to find vowel or consonant from the input entered by user

public class VowelOrConsonant3 {
    public static void main(String[] args) {
        char ch;
        VowelOrConsonant3 vc = new VowelOrConsonant3();
        System.out.println("Enter a character");
        String str = (new Scanner(System.in)).next();
        ch = str.charAt(0);
        if (str.length() > 1)
            System.out.println("Wrong Input");
        else
            vc.check(ch);
    }
    //method created to check if entered char is vowel or consonant
    public void check( char ch) {
        if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
    }


    }


