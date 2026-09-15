package Functions;

public class methodscope
{
    public static void main(String[] args)
        {
            sayHello();
           //System.out.println(message);
        }

        static void sayHello()
        {
            String message = "Hello, World!";
            System.out.println(message);
        }


}


// here the message cant be printed in the main() as the string(" hello world") belongs to sayhello
