/**
 * Name: Bill Mao
 *
 * Date: 11/7/2017
 *
 * School: East Chapel Hill High School
 *
 * Program: Program 214a (random walk)
 *
 * Description: This program is designed to simulate how many steps a man will take until he steps off a bridge.
 * The program is designed to run 100 times before printing the average amount of steps taken and the greatest amount of steps taken.
 * It prints this information 20 times for 20 runs.
 * The program first begins by declaring all variables needed further in the program, and printing the header of the table of statistics.
 * The program then executes a series of loops to run the simulation.
 * The first for loop repeats the entire set of instructions within it 20 times to simulate the 20 runs.
 * Variables that stay constant between runs are reset, and the data is printed for the user for each run
 * The second for loop repeats the instructions in it 1000 times for the 1000 simulations per run.
 * Variables that stay constant between simulations are reset for each simulation run, and relevant data is calculated.
 * The innermost while loop is designed to run the actual simulation.
 * It is controlled by the boolean that turns true when the second if statement compares the position of the man to see if he has stepped of the bridge.
 * The first if statement is designed to run the individual steps the man takes.
 * A random number that is 0 or 1 is generated, and the man moves forward if the number is 1 and backwards if it is 0.
 *
 * Difficulties: I forgot that the random integer function requires you to chose a number 1 higher than the numbers that are randomly selected
 * Ex: nextInt(2) is correct for this problem, while nextInt(1) is not
 *
 * What I Learned: I got some more practice with decision making using if statements and nested loops.
 */

import java.util.*;
import java.io.*;

public class frogger
{
    public static void main(String args[])
    {
        //Variables needed throughout the program are first initialized for clarity purposes
        Scanner readFile = null;
        int run = 1; //Run number; there are 1000 simulations in 1 run
        int simulationNumber = 1; //Simulation number
        double average = 0; //Average of all the steps taken for every 1000 simulations (1 run)
        int greatestSteps = 0; //Greatest amount of steps taken in 1 run of 1000 simulations
        int steps = 0; //Steps taken in one simulation
        double bridgePosition = 3.5; //Position of the man on the bridge in terms of feet.
        //He exits the bridge at any value less than 0 feet or any value greater than 7 feet.
        boolean crossed = false; //Boolean representing whether the man has crossed or not, used to terminate each simulation
        try
        {
            //Scanner object attempts to read the Prog213a.dat file
            readFile = new Scanner (new File("frogger.txt"));
        }
        catch (FileNotFoundException e)
        {
            //If it is not found, an error message is printed and the program exits.
            System.out.println ("File not found!");
            System.exit (0);
        }
        for(simulationNumber = 1; simulationNumber <= 5; simulationNumber++) //2nd for loop executes the instructions inside for 100 simulations
        {
            //Variables regarding whether the man has crossed, where he is, and how many steps are taken are reset before each simulation
            bridgePosition = 3;
            steps = 0;
            crossed = false;
            while(crossed == false) //Simulation keeps running until the man has crossed the bridge
            {
                if(readFile.nextInt() >= 5) //Random number is generate to simulate the man walking; 1 is forward
                {
                    steps++; //Man has taken one step
                    bridgePosition += 1; //..and moved forward one foot
                }
                else //0 is backwards
                {
                    steps++; //Man has taken one step
                    bridgePosition -= 1; //,,and moved backwards one foot
                }
                if(bridgePosition < 1 || bridgePosition > 5 || steps >= 6)
                {
                    //If the man has traveled forward 7 feet or more or backwards beyond 0 feet, he has stepped off the bridge and crossed
                    //This if statement checks that and stops the simulation if it is true
                    crossed = true;
                    average += steps; //Amount of steps taken is added to the average so the average can be calculated later
                    System.out.println(steps);
                }
            }
        }
    }
}
//Output:
//Run        Average        Greatest Number of Steps
//Run#1        15.704        86
//Run#2        15.712        88
//Run#3        16.28        88
//Run#4        16.704        108
//Run#5        16.572        108
//Run#6        16.152        78
//Run#7        15.802        84
//Run#8        16.098        78
//Run#9        15.786        120
//Run#10    16.514        144
//Run#11    16.114        80
//Run#12    15.674        92
//Run#13    16.53        88
//Run#14    16.422        90
//Run#15    16.702        124
//Run#16    15.574        98
//Run#17    16.272        124
//Run#18    16.25        116
//Run#19    15.512        80
//Run#20    16.43        114

