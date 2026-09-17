package Arrays_and_ArrayList;

public class Maxvalue
{
    public static void main(String[] args)
    {
     int[] arr = {60,2,43,32,3};

        System.out.println(max(arr));
    }

    static int max(int[] arr)
    {
        int maxvalue = arr[0];

        for (int i = 1; i < arr.length; i++)
        {
            if (maxvalue < arr[i])
            {
             maxvalue = arr[i];
            }
        }
        return maxvalue;
    }
}
