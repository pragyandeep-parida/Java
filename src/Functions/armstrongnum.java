package Functions;

public class armstrongnum
{
    public static void main(String[] args)
    {
     /* Scanner input = new Scanner(System.in);

      System.out.print("enter the number you want to check: ");
      int number = input.nextInt();

        System.out.println(isArmstrong(number));*/

        for (int i = 100; i < 1000 ; i++)
        {
            if (isArmstrong(i))
            {
                System.out.print(i + " ");
            }
        }

    }

    static boolean isArmstrong(int n)
    {
        int num = n;
        int sum = 0;

        while (n>0)
        {
            int rem = n%10;
            n = n/10;
            sum = sum + (rem*rem*rem);
        }
        return sum == num;
    }

}
