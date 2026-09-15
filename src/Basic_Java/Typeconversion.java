package Basic_Java;

import java.util.Scanner;

public class Typeconversion
{
    public static void main(String[] args)
    {

     Scanner input = new Scanner(System.in);    // in this if i write integer it gives value in float but for float to integer it wont happen
     Float num = input.nextFloat();
     System.out.println(num);

    }
}

// In Type conversion the compiler automatically converts the data type from one to another if the
// destination type is bigger than the source type. float is bigger than integer so possible
// but vice versa is not possible as integer is smaller than float.