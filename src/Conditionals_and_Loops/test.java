package Conditionals_and_Loops;

import java.util.Scanner;

public class test
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number you want to reverse: ");
        int num = input.nextInt();

        int revnum = 0;

        while (num > 0)
        {
            int rem = num % 10;
            num = num/10;
            revnum = (revnum * 10) + rem;
        }

        System.out.println("The reverse number is : " + revnum);

    }
}