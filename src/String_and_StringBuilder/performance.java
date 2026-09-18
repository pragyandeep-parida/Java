package String_and_StringBuilder;

public class performance
{
    public static void main(String[] args)
    {
        String series = "";
        for(int i = 0; i<26;i++)
        {
            char ch = (char)('a' + i);
            System.out.println(ch);

            series = series + " " + ch;       // i added "" in between to give space between abcd....
        }
        System.out.println(series);
    }

}

/*
this above code of using loop in string series consumes a lot of space
1- a
2-ab                //do debugging to see how abcd..xyz is created its a very long process
3- abc
...
26 - abcdef....xyz

so many string objects are created and are without ref variable so we need string performance to effectively
use string operations we will need StingBuilder or Stringbuffer
 */