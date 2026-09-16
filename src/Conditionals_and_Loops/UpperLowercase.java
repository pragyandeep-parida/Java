package Conditionals_and_Loops;

import java.util.Scanner;

public class UpperLowercase
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the word : ");
        char ch=input.next().trim().charAt(0);

        if ( ch >='a' && ch<='z')
        {
            System.out.println(" the character: " + ch+ " is lower case");
        }
        else
        {
            System.out.println(" the character: " + ch + " is upper case ");
        }

    }

}