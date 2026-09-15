package Functions;

public class test
{
    public static void main(String[] args)
    {
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter the number you want to check: ");
//        int num = input.nextInt();

        for (int i = 100; i < 1000 ; i++)
        {
          armstong(i);
        }

    }
    static int armstong(int n )
    {
        int armnum = 0;
        int checknum = n;

        while(n > 0)
        {
            int rem = n % 10;
            n = n / 10;
            armnum = armnum + (rem * rem * rem);
        }
        if (checknum == armnum)
        {
            System.out.println(checknum + " is arm strong number");
        }
//        else {System.out.println(checknum + " is  not arm strong number");}

        return armnum;
    }
}