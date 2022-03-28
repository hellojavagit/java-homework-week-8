package javaHomeWorkWeek8;
// program to find if given numbers are  armstrong or not

public class ArmstrongNumber10 {
    public static void main(String[] args) {
        armstrongNumber(153);
        armstrongNumber(154);//calling static method with parameter.
    }

    public static void armstrongNumber(int num) {
        int sum = 0, remainder = 0;
        int number = num;
        while (num > 0) {
            remainder = num % 10;
            sum = sum + remainder * remainder * remainder;
            num = num / 10;
        }
        if (number == sum) {
            System.out.println("armstrong");
        } else {
            System.out.println("not armstrong");
        }
    }
}