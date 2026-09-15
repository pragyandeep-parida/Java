package Basic_Java;

import java.util.Scanner;

public class Sum2Number
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);

        System.out.print("Enter value of number1 : ");   //i removed println so that the number does not go to the next line
        int number1 = input.nextInt();

        System.out.print("Enter value of number2 : ");
        int number2 = input.nextInt();

        int sum = number1 + number2;

        System.out.println("The sum of two numbers is: " + sum);

    }
}

// if you want simple, sum the above mentioned includes strings which i made
// int a = input.nextInt();
// int b =input.nextInt();
// int sum = int a + int b ;
//  System.out.println(sum)