package Functions;

import java.util.Scanner;

public class multiplydivision
{
    public static void main(String[] args)
    {
        float ans = div(12.2f,0);
        System.out.println(ans);

    }
    static int multiply()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of num1: ");
        int num1 = input.nextInt();

        System.out.println("Enter the value of num1: ");
        int num2 = input.nextInt();

        int prod = num1*num2;

        System.out.println(" The product is: " + prod);

        return prod;
    }

    static float div(float c,float d)
    {
        float division = c/d;

        if (d == 0)
        {
            System.out.println("Invalid");
        }
        return division;

    }
}

