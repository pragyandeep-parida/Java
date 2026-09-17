package Switch_and_Nested;

import java.util.Scanner;

public class enhacedswitch
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the fruit name: ");
        String fruit = input.next();

        switch (fruit)      // press option+enter after selecting switch(double tap) then choose enhanced
        {
            case "apple" -> System.out.println(" Healthy fruit");
            case "banana" -> System.out.println("great energy source");
            case "mango" -> System.out.println("king of fruits");
            case "strawberry" -> System.out.println("has anti oxidant");
            default -> System.out.println("enter a valid fruit");
        }
    }
}
