package Functions;

import java.util.Arrays;

public class VarArgs
{
    public static void main(String[] args)
    {
        fun(1,2,3);

        System.out.println();

        multiple(10,20,"Bhubaneswar","delhi");

    }
    static int[] fun(int ...v)              //i am using returntype int[] in varargs you need to use arrays simple int wont work
    {
        System.out.println(Arrays.toString(v));
        return v;
    }

    static void multiple(int a, int b, String ...v)
    {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("v = " + Arrays.toString(v));
                                                                // System.out.println((int a, int b, String ...v)); //this is not possible you cant print it like this
    }
}
