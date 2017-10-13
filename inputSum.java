/**
 * Name: Bill Mao
 *
 * Date: 10/11/17
 *
 * School: East Chapel Hill High School
 *
 * Program: Program 155t (finding sum and average)
 *
 * Description: This program is designed to calculate the sum, number of test scores, and average from a .dat file containing test scores.
 * Any variables needed outside of the scope of a specific loop are declared first.
 * The program then creates a scanner object that reads from the ini.dat file containing the test scores.
 * If the Java VM throws a FileNotFoundException, the program will catch that...
 * , and tell the user that they need to put the ini.dat file in the same folder as the program.
 * The program then prints the Scores table header.
 * A while loop then iterates until no more data is left in the .dat file.
 * In the loop, the individual test scores, which are integers, are retrieved by the fileInput scanner object,...
 * printed, added to the sum of the integers variable, and a count variable that stores the amount of integers in the file is incremented.
 * The average of all the integers is then calculated and rounded to two decimal places.
 * The results of the calculation are then printed for the user to see.
 *
 * Difficulties: I had some difficulty finding how to iterate the loop until no more integers were left, but I managed to find the .hasNext method by looking at the provided examples.
 *
 * What I Learned: I learned how get integers from files on the computer, learned how to catch exceptions in Java, and how to iterate a loop as long as more objects/data is available.
 * I also got some more practice with the while loop.
 */

import java.util.*;
import java.io.*;

public class inputSum{
    public static void main(String args[])
    {
        Scanner fileInput = null; //Used to get integer input from the dat file
        int num = 0; //Used to store the individual integers in the dat file
        int sum = 0; //Used for the sum of all integers in the file
        int count = 0; //Used for the amount of integers in the file
        try
        {
            //Creates a scanner to read the ini.dat file
            fileInput = new Scanner(new File("ini.dat"));
        }
        catch (FileNotFoundException e)
        {
            System.out.println ("Please check that the ini.dat file is in the same folder as this program.");
            //Stops the program if the ini.dat file is not found, and notifies the user
            System.exit(0);
        }
        System.out.println("Scores"); //Scores (Table Header) is printed out
        while(fileInput.hasNext()) //Loop executes as long as there is another integer, ends when none are left
        {       
            num = fileInput.nextInt(); //Gets the next integer
            sum += num; //Adds it to the sum
            System.out.println(num); //Prints it out
            count++; //Adds one to the count of the integers
        }
        double average = (int) (100 * ((double) sum / count) + .5) / 100.0; //The average of the integers is calculated and rounded to two decimal places
        //The sum of the integers, number of integers, and average are printed for the user to see
        System.out.println("The sum of the numbers = " + sum);
        System.out.println("The number of scores = " + count);
        System.out.println("The average of the numbers = " + average);
        //Closes the dat file
        fileInput.close();
    }
}
//Scores
//3
//8
//1
//13
//18
//15
//7
//17
//1
//14
//0
//12
//3
//2
//5
//4
//The sum of the numbers = 123
//The number of scores = 16
//The average of the numbers = 7.69



