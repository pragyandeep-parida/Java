package Functions;

public class Greetings
{
    public static void main(String[] args)
    {
        Greeting();
        Greeting(); //i can print hello world 10 times as greeting prints 5 times then again greeting prints 5  so i can print as many times  i want

    }
    static void Greeting()
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.println("hello world");
        }
    }
}
