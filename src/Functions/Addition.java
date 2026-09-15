package Functions;

import java.util.Scanner;

public class Addition
{
    public static void main(String[] args)
    {
       int ans = sum2();
       System.out.println(ans);

        /*
        int ans = sum3(20,30); // it will ask to assign value. We can assign it inside the box
         System.out.println(ans);
         */

    }

    static int sum3(int a, int b)
    {
        int sum = a + b;
        return sum;
    }


    static int sum2()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = input.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum is : " + sum);

        return sum;  // after return you cannot write any new code return basically means the code is over anything after that it wont take
        //System.out.println(); // see sout will be highlighted in red as it wont take it remove comment// to see
    }

    static void sum1() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = input.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();

        System.out.println("The sum is : " + (num1 + num2));
    }
}

