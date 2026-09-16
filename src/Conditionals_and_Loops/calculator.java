package Conditionals_and_Loops;

import java.util.Scanner;

public class calculator
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print(" enter num1 :");
        int num1 = input.nextInt();

        System.out.print(" Enter the operation you would like to perform (+,-,*,/): ");
        char op = input.next().trim().charAt(0);

        System.out.print(" enter num2 :");
        int num2 = input.nextInt();

        int value = 0;

        if(op == '+')
        {
            value = num1 + num2;
        }
        else if (op == '-')
        {
            value = num1 - num2;
        }
        else if (op == '*')
        {
            value = num1 * num2;
        }
        else if (op == '/')
        {
            if (num2 == 0)
            {
                System.out.println("not possible");
            }
            value = num1/num2;
        }

        System.out.print("The value is: " + value);

    }
}