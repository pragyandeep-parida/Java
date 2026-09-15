package Functions;

import java.util.Scanner;

public class PrimeNumber2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = input.nextInt();

        prime(n);

    }
    static void prime(int num)
    {
        int count = 0;

        for (int i = 1; i <= num; i++)
        {
            if (num % i == 0)
            {
                count++;
            }
        }

        if (count == 2)
        {
            System.out.println("The number "+ num +" is prime");
        }
        else if (count > 2)
        {
            System.out.println("The number "+ num +" is not prime");
        }

    }
}

// https://www.youtube.com/watch?v=-edAgWN1mQk    //check this youtube link to understand this code

//a prime number is only divisible by 2 numbers so if the count == 2 then it is divisible by 2 numbers
//but if the count is exceeding 2 that means its divisible by many numbers so its not prime we are using for loop to check one by one number
