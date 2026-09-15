package Basic_Java;

import java.util.Scanner;

public class rough
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the tempertature in celcius: ");
        float temp = input.nextFloat();

        float fahrenite = (temp * 1.8f ) + 32;

        System.out.println("The temperature in fahrenite is: " + fahrenite);
    }
}