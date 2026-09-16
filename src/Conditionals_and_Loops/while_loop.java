package Conditionals_and_Loops;

public class while_loop
{
    public static void main(String[] args)
    {
        int i=1;
        while (i<=5)
        {
            System.out.println(i);
            i++;
        }
    }
}


/* example(that includes scanner)

import java.util.Scanner;

public class test
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number :");
        int n = input.nextInt();

        System.out.println("enter the value of num:");
        int num = input.nextInt();

        while(num<=n)
        {
            System.out.println(num);
            num++;
        }
    }
}

 */