/**
 * Name: Bill Mao
 *
 * Date: 10/9/17
 *
 * School: East Chapel Hill High School
 *
 * Program: Program 162a (small factorials)
 *
 * Description: This program is designed to find the factoralized number that the user provides.
 * The program first begins by initializing and declaring all variables neede in the progrma so that they can be used...
 * throughout the program.
 * The first loop then starts by Asking the user for the number they want to factorialize.
 * The number is the assigned to a different variable that is used in a for loop that multiplies...
 * the starting number with the integers less than it until it reaches zero.
 * The factorial calculation isthen printed for the user to see.
 * The program then asks the user if they want to repeat the calcuation, and sets a boolean to true if the answer is yes.
 * The boolean repeats the calculation contained in a do..while loop if it is true.
 * The program ends and prints out an ending rsponse if the user answeres anything other than yes.
 *
 * Difficulties: I had some difficulty making the if statement case insensitive,...
 * but I looked over my notes and eventually found the toLowerCase modifier.
 *
 * What I Learned: I learned how to use nested loops in Java, and I got some more practice with loops and user input in general.
 */

import java.util.*;
import java.io.*;

public class smallFac{
    public static void main(String args[])
    {
        Scanner kbInput = new Scanner(System.in); //Creates a new scanner object in order to use user input
        //Most variables are declared before the loop in order to use them throughout the program
        int number = 0; //Used for the number the user provides
        int product = 1; //Used for the calculation/end result
        boolean anothernum = true; //Used to repeat the do...while loop
        String yesNo = "Yes"; //Used for yes/no user input for repeat calculations
        String yesNoLower = "yes"; //Used for yes/no user input for repeat calculations
        do{
            //Asks user for a number that will be factorialed and stores it
            System.out.println("Enter a number:_");
            number = kbInput.nextInt();
            for(int count = number; count > 0; count--)
            {
                //Stores the number to be factorialized as count as the original number needs to be used later
                //For loop mulitplies numbers beginning with the starting number until it reaches zero
                product = product * count;
            }
            //Prints out the result of the factorial calculation
            System.out.println("The value of " + number + "! is " + product);
            //Asks the user if they want to do another calculation
            //Stores their answer as a string and converts it to lowercase so that the answer is case insentitive
            System.out.println("Would you like to calculate another number?");
            yesNo = kbInput.next();
            yesNoLower = yesNo.toLowerCase();
            if( yesNoLower == "yes")
            {
                //If statement sets the boolean that repeats the do..while loop...
                //if the answer is yes
                //If the answer is anything other than yes, the boolean is set to false
                anothernum = true;
            } else {
                anothernum = false;
            } 
        }
        while(anothernum == true); //If the user answered yes, the while statement repeats the entire calcualtion. If not, it ends the loop
        //Prints an ending response to let the user know that the program has terminated.
        System.out.println("End Factorial Processing");
    }
}
