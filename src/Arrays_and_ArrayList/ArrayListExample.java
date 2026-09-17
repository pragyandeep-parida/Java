package Arrays_and_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

       /* list.add(10);  // use .add to add values in array

        list.add(1, 25);       //use .add(index, value) to specifically assign a value to an index
        list.add(2, 35);
        list.add(3, 45);

        System.out.println(list.contains(25));     // list.contains checks if the array contains a value you want to check it will return in true/false

        System.out.println(list);

        list.add(0, 12);        // overwrites the 0th index which was 10 now it will show 12
        list.remove(3);                 // removes the value in 3rd index but adds 10 because 10 is not assigned to any index

        System.out.println(list);*/

        for (int i = 0; i < 5; i++)
        {
         list.add(input.nextInt());
        }
        System.out.println(list);
    }



}
