package Switch_and_Nested;

import java.util.Scanner;

public class switchcase
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the fruit name: ");
        String fruit = input.next();

        switch (fruit)
        {
            case "apple":
                System.out.println(" Healthy fruit");
                break;

            case "banana":
                System.out.println("great energy source");
                break;

            case "mango":
                System.out.println("king of fruits");
                break;

            case "strawberry":
                System.out.println("has anti oxidant");
                break;

            default:
                System.out.println("enter a valid fruit");

        }
    }
}
