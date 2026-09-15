package Functions;

import java.util.Arrays;

public class overloading
{
    public static void main(String[] args)
    {
        fun(12);                    // when we are calling a function with integer it goes to fun(int a)
        fun("java");                // when we are calling a function with string it goes to fun(String b)
        fun(1,5);                // when i write (1,5) it is automatically calling the c + d method

        fun(12,23,34,45);
        fun("java","python", "golang");     // same goes for VarArgs also
    }
    static void fun(int a)
    {
        System.out.println(a);
    }
    static void fun(String b)
    {
        System.out.println(b);
    }
    static int fun(int c,int d)
    {
        return c + d;
    }
    static void fun(int ...v)           //you can use  variable length arguments in the overloading
    {
        System.out.println(Arrays.toString(v));
    }
    static void fun(String ...v)
    {
        System.out.println(Arrays.toString(v));
    }

}

/*static int fun(int e,int f)      // here this wont work as int c and int d  type is already defined you can write int e,f,g it will take 3 variable
{
    return e+ f;
}*/