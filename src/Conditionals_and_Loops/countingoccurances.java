package Conditionals_and_Loops;

import java.util.Scanner;

public class countingoccurances
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = input.nextInt();

        System.out.print(" Enter the digit to check: ");
        int digitcheck = input.nextInt();

        int COUNT = 0;
        int newnumber = num;

        while (num>0)
        {
            if (num % 10 == digitcheck)
            {
                COUNT++;
            }
            num = num/10;
        }

        System.out.println("The digit: " + String.valueOf(digitcheck).trim()  + " was repeated " + COUNT + " times in number :" + newnumber);
    }

}
