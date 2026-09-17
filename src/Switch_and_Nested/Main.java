package Switch_and_Nested;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the employee id: ");
        int employee = input.nextInt();

        System.out.println("Enter department: ");
        String department = input.next();

        switch(employee)
        {
            case 1 -> System.out.println("Rahul Sharma");
            case 2 -> System.out.println("Abhisek Tripathi");
            case 3 -> {
                switch (department)
                {
                    case "IT" -> System.out.println("IT department");
                    case "HR" -> System.out.println("HR department");
                    default -> System.out.println("Enter a valid department");
                }
            }
            default -> System.out.println("Enter a valid employee id");
        }

    }
}
