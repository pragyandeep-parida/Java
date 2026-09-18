package String_and_StringBuilder;

import java.util.ArrayList;

public class operators
{
    public static void main(String[] args)
    {
        System.out.println('a' + 'b');      // all the below sout java converts char to ASCII value to add but it doesnt convert the string(string are inside " " n '' is for char)
        System.out.println("a" + "b");
        System.out.println((char)('a' + 3));

        System.out.println("a" + 3);        //here a is a string so it doesnt convert and adds 3 to it to give a3. Integer will be converted to integer that will call toString() method

        System.out.println("pragyandeep" + new ArrayList<>());  //

        System.out.println(new Integer(56 ) + "" + new ArrayList<>()); // it wont work as both are complex objects but add a string it will work without "" it wont work ask ChatGPT why
    }
}
