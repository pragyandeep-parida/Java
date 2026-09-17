package Switch_and_Nested;

import java.util.Scanner;

public class rough
{
    public static void main(String[] args)
    {
      Scanner input = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = input.nextInt();

        switch (num)
        {
            case 1:
                System.out.println("banana");
                break;

            case 2:
                System.out.print("apple");
                break;

            case 3:
                System.out.println("strawberry");
                break;

            default:
                System.out.println("enter a valid number");
        }
    }
}