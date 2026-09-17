package Arrays_and_ArrayList;

import java.util.Arrays;

public class passinginfunction
{
    public static void main(String[] args)
    {
        int [] num = {1,2,3,4,5};

        change(num);            // unlike strings, arrays are mutable in java. so when calling function change the index 1 is changed as given in change function.

        System.out.println(Arrays.toString(num));

    }
    static void change( int[] arr)
    {
        arr[1]=99;
    }
}
