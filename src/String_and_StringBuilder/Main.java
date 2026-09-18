package String_and_StringBuilder;

public class Main
{
    public static void main(String[] args)
    {
        String a = "Apple";
        String b="Apple";

        System.out.println(a==b);           //true
        System.out.println(a.equals(b));      //true

        String c = new String("Banana");
        String d = new String("Banana");

        System.out.println(c==d);                 //false(see the notes why this is false)
        System.out.println(c.equals(d));           //true

    }
}