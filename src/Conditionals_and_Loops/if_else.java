package Conditionals_and_Loops;

import java.util.Scanner;

public class if_else
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("enter the salary : ");
        int salary = input.nextInt();

        if (salary > 10000)
        {
           salary = salary + 2000;              // salary+= 2000 (short form for   salary = salary + 2000)
        }
        else if (salary > 20000 )
        {
            salary = salary + 1500;
        }
        else
        {
            salary += 3000;
        }

        System.out.print("The new salary will be: "+ salary);

    }
}