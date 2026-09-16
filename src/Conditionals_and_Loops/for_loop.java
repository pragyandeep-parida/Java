package Conditionals_and_Loops;

import java.util.Scanner;

public class for_loop
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);         // this code is for taking input and printing the number that many times

        System.out.println(" enter the number : ");
        int n = input.nextInt();

        for (int num = 1; num <=n ; num++)
        {
            System.out.println(num);
        }


    }
}





/*

 int i;
        for (i=1; i <= 5; i++)
        {
            System.out.println(i);
        }

to write hello world or any string multiple times just write that string inside the bracket
   eg - System.out.println( " hello world " );
 */
