package Conditionals_and_Loops;

import java.util.Scanner;

public class LargeNumbers
{
    public static void main(String[] args)          // there are two more methods below the code check it
    {
        Scanner input = new Scanner(System.in);

        System.out.print("enter number 1: ");
        int num1 = input.nextInt();

        System.out.print("enter number 2: ");
        int num2 = input.nextInt();

        System.out.print("enter number 3: ");
        int num3 = input.nextInt();


        if( num1>num2 && num1>num3)
        {
            System.out.println(num1 + " num1 is larger ");
        }
        else if( num2>num1 && num2>num3)
        {
            System.out.println(num2 + " num2 is larger ");
        }
        else
        {
            System.out.println(num3 + " num3 is larger ");
        }

    }

}

/* Kunal kushwaha metghod

Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max = a;

        if (b>max)
        {
             max = b;
        }

        if (c>max)
        {
             max = c;
        }

        System.out.print( "the larger number is : " + max);


 */

/* there is also a math class

    Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

       int math = Math.max( a, Math.max( b,c ));

        System.out.println(math);

 */