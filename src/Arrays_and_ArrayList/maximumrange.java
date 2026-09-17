package Arrays_and_ArrayList;

public class maximumrange
{
    public static void main(String[] args)
    {
     int[] arr = {1, 21, 3, 4,5 };

        System.out.println(maxrange(arr,1,3));


    }
    static int maxrange(int[] arr, int start, int end)
    {
        int max = start;

        for (int i = start; i <= end; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }
        return  max;
    }
}
