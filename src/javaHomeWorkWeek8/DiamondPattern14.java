package javaHomeWorkWeek8;
//program to print '*' in a diamond pattern using while loop and for loop.

public class DiamondPattern14 {
    public static void main(String[] args)
    {
        diamondPattern();
    }

    public static void diamondPattern() {
        int n = 1;
        for (int i = 3; i > 0; i--) {
            int temp = i;
            while (temp > 1) {
                System.out.print(" ");
                temp--;
            }
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println("");
            n = n + 2;
        }
        for (int k = 2; k > 1; k--) {
            System.out.print(" ");
        }
        int temp2 = 3;
        while (temp2 > 0) {
            System.out.print("*");
            temp2--;
        }
        System.out.println("");
        System.out.println("  *");
    }
}

