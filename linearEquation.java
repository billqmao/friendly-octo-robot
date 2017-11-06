
/**
 * Name: Bill Mao
 *
 * Date: 10/30/2017
 *
 * School: East Chapel Hill High School
 *
 * Program: Program 213g (solving linear equations)
 *
 * Description: This program is designed to calculate the maximum height of a bullet fired with a muzzle velocity of 960 feet per second
 * The program first begins by declaring three variables that will be used outside of the scope of the loops,
 * These are the seconds elapsed, the height of the bullet, and the height of the bullet 1 second before the current time.
 * A for loop then iterates through the first to sixtieth second the bullet is in the air.
 * The loop first stores the current height to the previous height, and then calculates the new height for the new time.
 * An if statement then executes that terminates the loop is the previous height is larger than or equal to the new height,,,,
 * indicating that the apex has been reached.
 * The program then finally prints out the time the bullet reached the maximum time and the bullet height.
 *
 * Difficulties: I first set the program to iterate for seconds 0-60 inclusive, but I realized that this arrangement would not work since...
 * there is no bullet height that corresponds to -1 seconds for the previous height.
 *
 * What I Learned: I learned how to implement decision making in programs using the if statement and the break statement.
 */

import java.util.*;
import java.io.*;

public class linearEquation
{
    public static void main(String args[])
    {
        //Variables needed outside of the scope of the loop are first initialized
        int variableA = 0; 
        int variableB = 0; 
        double solution = 0;
        String recalculate = "yes";
        Scanner kbInput = new Scanner(System.in);
        do
        {
            System.out.println("Enter A: ");
            variableA = kbInput.nextInt();
            System.out.println("Enter B: ");
            variableB = kbInput.nextInt();
            System.out.println(variableA + "x" + " + " + variableB + " = 0");
            if(variableA == 0 && variableB == 0)
            {
                System.out.println("There are infinite solutions");
            }
            else if(variableB != 0 && variableA == 0)
            {
                System.out.println("There are no solutions");
            }
            else
            {
                solution = (double) (-1 * variableB) / variableA;
                System.out.println("The solution is x= " + solution + "\n");
            }
            System.out.println("Do you wish to solve another linear equation?");
            recalculate = kbInput.next();
        }
        while(recalculate.equalsIgnoreCase("yes"));
    }
}
//Output:
//The maximum height reached by the bullet is 14400 feet after 30 seconds



