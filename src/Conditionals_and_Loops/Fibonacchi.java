package Conditionals_and_Loops;

import java.util.Scanner;

public class Fibonacchi
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print(" Enter the value of n :");
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int COUNT = 2;

        while ( COUNT <= n)
        {
            int temp = b;
            b = b+a;
            a = temp;
            COUNT++;
        }

        System.out.println(" the nth value :"+ b +"is fibonachhi number ");
    }
}
