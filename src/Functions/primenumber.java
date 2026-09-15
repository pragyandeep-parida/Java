package Functions;

import java.util.Scanner;

public class primenumber
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number you want to check: ");
        int num = input.nextInt();

        if (isprime(num))
        {
            System.out.println(num + "is prime number");
        }
        else
        {
            System.out.println(num + "is not prime");
        }
    }
    static boolean isprime(int n)
    {
        if (n <= 1)
        {
            return false;
        }
        int c = 2;

        while (c * c <= n)
        {
            if (n % c == 0)
            {
                return false;
            }
            c++;
        }
        return true;
    }

}

