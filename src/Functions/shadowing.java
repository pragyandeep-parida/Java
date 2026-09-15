package Functions;

public class shadowing
{
    static int x = 10;              //this will be shadowed at line 8
    public static void main(String[] args)
    {
        System.out.println(x);         // this will also print 10
        int x;
       // System.out.println(x);       // this will show error as the scope will begin when the value is initialised
        x=40;
        System.out.println(x);          //this will print 40 as the x=10 is shadowed
        fun();
    }

    static void fun()
    {
        System.out.println(x);          // this will print 10 because it follows the static x at first which is for all the blocks
    }
}
