package Functions;

public class blockscope
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 20;

        /* {
            int a = 20         // already initialised outside the block so cant be initialised again, but we can change the value like give a=40 and use sout(a) it will print a in this block and also outside as we are re assigning a to 40
             int c = 200      //here int a won't work because of block scoping. Values initialised in this block will remain in this block
        }
        System.out.println(c);
        */                    //here c also will show error because if we specifically create a value for that block it is going to be used in that block

    }
}
