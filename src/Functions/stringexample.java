package Functions;

public class stringexample
{
    public static void main(String[] args)
    {
        String message = letter();
        System.out.println( message);
    }
    static String letter()
    {
        String name = " JAI JAGANNATH";
        return name;
    }
}

//return name; sends the value of the variable name (which is " JAI JAGANNATH") back to where the method was called.
//The return statement sends " JAI JAGANNATH" back to main() → It gets stored in the variable (message).
