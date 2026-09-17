package Arrays_and_ArrayList;

public class example
{
    public static void main(String[] args)
    {
       int[] array = {0,12,32,45,8,54,98,76};

        System.out.println("The max value is: " + maxrange(array,1,7));

    }

    static int maxrange(int arr[], int start, int end)
    {
        int maxvalue = arr[start];

        for ( int i = start; i < end; i++)
        {
            if (arr[i] > maxvalue)
            {
                maxvalue = arr[i];
            }
        }

        return maxvalue;
    }
}