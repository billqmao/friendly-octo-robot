
/**
 * Name: Bill Mao
 * 
 * Date: 10/23/17
 * 
 * School: East Chapel Hill High School
 * 
 * Program: Prog164f (Triple Silly Sequence)
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
        //Variables needed outside of the scope of one specific loop are declared here
        int growth = 1; //Amount the number 1-10 squared grows or shrinks by as the numbers increase and decrease
        int numberSquared = 1; //1-10 squared
        for(numberSquared = 1; numberSquared <= 100; numberSquared += growth) 
        {
            //For loop iterates through 1-10^2 inclusive and adds the amount of growth so that 1-10 squared is the resullt
            //Printing happens first, so the number 1-10 inclusivley need to be executed
            System.out.print(numberSquared + " "); //1-10 squared is printed
            growth += 2; // Two is added for each iteration as this is quadratic growth (growth grows at a constant rate)
        }
        System.out.println("\n"); //Line break for spacing
        //Starting number and intial growth are redeclared since the while loop shrinks
        numberSquared = 100; 
        growth = 19;
        while(numberSquared >= 1)
        {
            //For the while loop, printing still happenes first, so the loop iterates through 1-10^2 inclusive
            System.out.print(numberSquared + " ");
            numberSquared -= growth;
            growth -= 2; //The growth shrinks as we are starting from 10^2 and going to 1
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
