package Arrays_and_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class multidimentionalarray
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int[][] arr = new int[3][3];

        for (int row =0; row< arr.length; row++)           // here instead of arr.length we can directly write no.of rows which is 3 same for coloumn aswell
        {
            for ( int coloumn = 0; coloumn < arr[row].length; coloumn++)
            {
                arr[row][coloumn]= input.nextInt();
            }
        }

       /* for (int row =0; row< arr.length; row++)
        {
            for ( int coloumn = 0; coloumn < arr[row].length; coloumn++)
            {
                System.out.print(arr[row][coloumn] + " ");
            }
            System.out.println();
        }*/

        for (int row =0; row< arr.length; row++)        // use option + enter to see enhanced for loop you can also use ehhanced for loop
        {
            System.out.println(Arrays.toString(arr[row]));
        }



    }
}
