/**
 * Name: Bill Mao
 *
 * Date: 11/6/2017
 *
 * School: East Chapel Hill High School
 *
 * Program: Program 213g (solving linear equations)
 *
 * Description: This program is designed to ask the user for a linear equation and solve it.
 * Variables needed in the program are first initialized.
 * A do..while loop surrounding the calculations program then executes.
 * The loop is designed to repeat the calculation if the user types yes to a question asking them if they want to do another calculation
 * At the beginning of the loop, the user is first asked for the slope and y-intercept of the equation in order to solve it.
 * An if decision tree then executes, and answers with either infinite or no answers are first excluded from the solution calculation.
 * Once answers with only one numbers are isolated, the solution is calculated from the y-intercept and slope, rounded to 5 decimal places, and is printed for the user to see.
 * As previously stated, the program then asks if the user wants to repeat the solution calculation, and does so if the user answer yes.
 *
 * Difficulties: I had some difficulty tweaking the small details in this program, such as rounding the answer to five decimal spaces, and...
 * using doubles instead of integers for the A and B variables in case the user wanted to use a decimal for either of these values.
 * I had to change the program each time I encountered one of these issues because I did not adequately first consider these scenarios.
 * In the future, I would first try to consider any changes I would need to make to these small details before running the program in order to be more efficient.
 *
 * What I Learned: I got some more practice with loops, decision making with with if statements, and getting and asking for user input.
 */

import java.util.*;
import java.io.*;

public class linearEquation
{
    public static void main(String args[])
    {
        //Variables needed outside of the scope of the loop are first initialized
        double variableA = 0; //Represents the A portion of the linear equation (slope)
        double variableB = 0; //Represents the B portion of the linear equation (y-intercept)
        double solution = 0; //Represents the solution of the linear equation at a y value of 0
        String recalculate = "yes"; //Used to see if the user wants to continue solving equations
        Scanner kbInput = new Scanner(System.in); //Used for user input
        do
        {
            //User is first asked for the slope and y intercept of the linear equation they are trying to solve
            System.out.println("Enter A: ");
            variableA = kbInput.nextDouble();
            System.out.println("Enter B: ");
            variableB = kbInput.nextDouble();
            //The equation is then printed for them to see
            System.out.println(variableA + "x" + " + " + variableB + " = 0");
            //An if statement first filters out answers that do not have one number value
            //It then calculations the solution to the linear equation
            if(variableA == 0 && variableB == 0)
            {
                //Lets the user know if both A and B are zero, there are infinite solutions
                System.out.println("There are infinite solutions");
            }
            else if(variableB != 0 && variableA == 0)
            {
                //Tells the user that there are no solutions if the slope is zero and there is a y intercept
                System.out.println("There are no solutions");
            }
            else
            {
                //Calculates and prints the solution to the linear equation if the answer has only one number value
                //The solution is rounded to five decimal points via the EasyFormat class
                solution = (-1 * variableB) / variableA;
                System.out.println("The solution is x= " + EasyFormat.format(solution, 0, 5) + "\n");
            }
            //Asks the user if they want to solve another linear equation and stores the input
            System.out.println("Do you wish to solve another linear equation?");
            recalculate = kbInput.next();
            System.out.println("\n"); //New line for spacing
        }
        while(recalculate.equalsIgnoreCase("yes")); //The do..while loop surrounding the entire program repeats the program if the user types in yes to the previous question
    }
}
//Output:
//Enter A:
//4
//Enter B:
//-5
//4.0x + -5.0 = 0
//The solution is x= 1.25000
//
//Do you wish to solve another linear equation?
//yes
//
//
//Enter A:
//7
//Enter B:
//12
//7.0x + 12.0 = 0
//The solution is x= -1.71429
//
//Do you wish to solve another linear equation?
//yes
//
//
//Enter A:
//0
//Enter B:
//0
//0.0x + 0.0 = 0
//There are infinite solutions
//Do you wish to solve another linear equation?
//yes
//
//
//Enter A:
//0
//Enter B:
//7
//0.0x + 7.0 = 0
//There are no solutions
//Do you wish to solve another linear equation?
//yes
//
//
//Enter A:
//3.5
//Enter B:
//-1.6
//3.5x + -1.6 = 0
//The solution is x= 0.45714
//
//Do you wish to solve another linear equation?
//yes
//
//
//Enter A:
//5
//Enter B:
//1.3
//5.0x + 1.3 = 0
//The solution is x= -0.26000
//
//Do you wish to solve another linear equation?
//yes
//
//
//Enter A:
//8
//Enter B:
//2.5
//8.0x + 2.5 = 0
//The solution is x= -0.31250
//
//Do you wish to solve another linear equation?
//no
