package Arrays_and_ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        int[] numbers = new int[5];

        numbers[0]=10;
        numbers[1]=20;
        numbers[2]=30;
        numbers[3]=40;
        numbers[4]=50;

        System.out.println(numbers[2]);

        // or

        int[] num = {10,20,30,40,50};
        System.out.println(num[4]);

        //for string

        String[] arr = {"atlassian", "google","Microsoft"};
        System.out.println(arr[0]);                 // we are giving index values so its printing one string
                                                    // to print entire string - System.out.println(Arrays.toString(arr)) same for above integer and all to print entire array use Arrays.toString()
    }
}