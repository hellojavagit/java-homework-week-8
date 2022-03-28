package javaHomeWorkWeek8;
// program to print sum of even digits in a number and return -1 if number is neagtive
//else return the sum.

public class EvenDigitSum11 {
    public static void main(String[] args) {
        System.out.println(sum(123456789));
        System.out.println(sum(252));
        System.out.println(sum(-22));

    }
    public static int sum(int number)
    {
        if(number < 0 )
        {
            return -1;
        }
        int ldigit = 0, sum = 0;
        while(number !=0) {
            ldigit = number % 10;
            if (ldigit % 2 == 0)
            {
                sum = sum + ldigit;
            }
            number = number / 10;
        }
         return sum;
            }
        }


