import java.util.*;
import java.io.*;
/**
 * Name: Bill Mao
 * Date: 9/20/17
 * School: East Chapel Hill High School
 * Program: Program 54h (roots)
 * Description: This program is designed to the take coefficients of a standard quadratic equation, and calculate its roots.
 * It first imports classes required for keyboard input, and then initializes the Scanner object that allows for keyboard input.
 * It then asks the user to type in the three coefficients for the quadratic equations.
 * The coefficients are then stored separately as doubles, and the square root of the discriminant is found first.
 * The program then plus in the square root of the discriminant into the full equation to find the two roots, and then stores them as doubles.
 * The program finally prints out the roots of the equation. The values are not rounded as the user may want to chose the level of precision.
 * Difficulties: When I created this program, I originally intended to do the quadratic equation in one go,...
 * but I split the calculation of the discriminant and the root.
 * This was done in order to reduce the amount of parentheses in one line of code and to improve readability.
 * What I Learned: In this exercise, I learned how to import classes and create objects.
 * I also learned how to store input from the keyboard, and use the Math class.
 */

public class QuadraticRoots
{
    public static void main(String args[])
    {
        Scanner keyboardInput = new Scanner(System.in); //Creating the scanner object in order to use it
        //Asks for A,B,and C in for the quadratic equation
        System.out.println("Quadratic Equation Solver");
        System.out.println("Enter A B C [all on one line and in order, with spaces in between each number]");
        //Stores three inputted numbers as doubles.
        double quadraticA = keyboardInput.nextDouble();
        double quadraticB = keyboardInput.nextDouble();
        double quadraticC = keyboardInput.nextDouble();
        //Performs the quadratic equation twice to find the two roots
        //The square roof of the discriminant is first calculated... 
        //then inserted into the quadratic equation twice to calculate the two roots.
        double SqrtDiscriminant = Math.sqrt((Math.pow(quadraticB, 2) - (4 * quadraticA * quadraticC)));
        double quadraticMinus = (-quadraticB - SqrtDiscriminant) / (2*quadraticA);
        double quadraticPlus =  (-quadraticB + SqrtDiscriminant) / (2*quadraticA);
        //Prints the results of the quadratic equation
        System.out.println("The roots are: " + quadraticMinus + " " + quadraticPlus);
        

        
    }
}

//Example Output with coefficient 1 0 0:
//Quadratic Equation Solver
//Enter A B C [all on one line and in order, with spaces in between each number]
//1 0 0
//The roots are: -0.0 0.0


