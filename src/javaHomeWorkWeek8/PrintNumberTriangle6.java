package javaHomeWorkWeek8;
import java.util.Scanner;

//program to input a number and print that many rows of numbers in a
// triangle format using loops and method calling.

public class PrintNumberTriangle6 {
    public static void main(String[] args) {
        PrintNumberTriangle6 pt = new PrintNumberTriangle6();
        pt.traingle();
    }

    public void traingle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int num = sc.nextInt();
        int i = 1;
        while (i <= num) {
            int j = 1;
            while (j <= i) {
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }
    }

}
