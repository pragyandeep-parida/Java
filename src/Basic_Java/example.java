package Basic_Java;

import java.util.Scanner;

public class example
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in celcius: ");
        float tempc = input.nextFloat();

        Float tempf = (tempc * 1.8f) + 32;

        System.out.println("The temperature " + tempc + " is " + tempf + " in fahrenite");
    }
}