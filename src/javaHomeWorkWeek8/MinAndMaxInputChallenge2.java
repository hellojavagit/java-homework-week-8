package javaHomeWorkWeek8;

// program to find the minimum and maximum number in given numbers using loops and object creation.
import java.util.Scanner;

public class MinAndMaxInputChallenge2 {
    public static void main(String[] args)
    {
        MinAndMaxInputChallenge2 mmi = new MinAndMaxInputChallenge2();
        mmi.minMax();
    }
    public void minMax()
    {
        Scanner sc = new Scanner(System.in);
        int min = 0, max = 0;
        boolean first = true;
        while (true) {

            System.out.println("Enter number:");
            boolean b = sc.hasNextInt();
            if (b) {
                int number = sc.nextInt();
                if (first) {
                    first = false;
                    min = number;
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
                if (number > max) {
                    max = number;
                }

                } else {
                    break;
                }
                sc.nextLine();
            }
            System.out.println("Minimum number  = " + min);
            System.out.println("Maximum number = " + max);
            sc.close();
        }
    }

