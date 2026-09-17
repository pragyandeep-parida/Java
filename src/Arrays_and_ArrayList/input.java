package Arrays_and_ArrayList;

import java.util.Scanner;

public class input
{
    public static void main(String[] args)
    {
     Scanner input = new Scanner(System.in);

     int[] arr = new int[5];

     for (int i=0; i< arr.length;i++)
     {
         arr[i]=input.nextInt();
     }


     for (int i = 0; i < arr.length; i++)
     {
         System.out.println(arr[i]);
     }

       /* String[] str = new String[4];

        for (int i = 0; i < str.length; i++)
        {
            str[i] = input.next();
        }
        System.out.println(Arrays.toString(str));

        //modify

        str[1]="lovan"
          System.out.println(Arrays.toString(str)); // even if we give value aa bb cc dd index1 value is lovan when printing it will print aa lovan bb cc

        */
    }
}


/*
public static void main(String[] args)
{
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the range of array: ");
    int range = input.nextInt();

    int[] arr = new int[range];

    for (int i=0; i<range; i++)        // if we have already declared array length for(int i=0; i<arr.length; i++) it will take given array size
    {
        System.out.print("Enter the elements at " + i +": ");
        arr[i]=input.nextInt();
    }

    for (int i=0; i<range; i++)
    {
        System.out.println("The array elements at index "+ i + " are: " + arr[i]);
    }
}
*/
