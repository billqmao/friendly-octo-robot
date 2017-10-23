
/**
 * Name: Bill Mao
 * 
 * Date: 9/5/2017
 * 
 * School: East Chapel Hill High School
 * 
 * Program: Hello World Program
 * 
 * Description: This is the first program I have made in Java, and it is designed to print "Hello World!" to the terminal.
 * 
 * Difficulties: I encountered no difficulties creating this program.
 * 
 * What I Learned: I leared how to print text strings to the terminal in Java, how to put comments in Java,
 * and the basic structure of most Java programs.
 */

public class tripleSilly
{
    public static void main(String args[])
    {
        int growth = 1;
        int numberSquared = 1;
        for(numberSquared = 1; numberSquared <= 100; numberSquared += growth)
        {
            System.out.print(numberSquared + " ");
            growth += 2;
        }
        System.out.println("\n");
        numberSquared = 100;
        growth = 19;
        while(numberSquared >= 1)
        {
            System.out.print(numberSquared + " ");
            numberSquared -= growth;
            growth -= 2;
        }
        System.out.println("\n");
        numberSquared = 1;
        growth = 1;
        do
        {
            System.out.print(numberSquared + " ");
            growth += 2;
            numberSquared += growth;
        }
        while(numberSquared <= 100);
    }
}
