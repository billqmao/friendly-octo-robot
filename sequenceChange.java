/**
 * Name: Bill Mao
 *
 * Date: 11/3/2017
 *
 * School: East Chapel Hill High School
 *
 * Program: Program 202a (sequence with interval change)
 *
 * Description: This program is designed to print a specific sequence found in the instructions of this assignment.
 * The program first begins by declaring any variables needed further in the program.
 * The program then executes a while loop that prints the sequence of numbers.
 * In the loop, an if statement is first executed to see if the amount to be added to the previous number in the sequence needs to be increased
 * The previous sequence number then is increased and printed.
 * This happens for all numbers in the sequence.
 * Once the entire sequence has been printed, the loop and the program end.
 *
 * Difficulties: I originally reversed the order of the += operation and had the number in the sequence added to the amount that needs to be added to each new number...
 * instead of the other way around (addition += sequence). This caused an infinite loop that had to be terminated in the debugger.
 *
 * What I Learned: I got some more practice with loops, mathematical operations, and decision making using if statements.
 */

import java.util.*;
import java.io.*;

public class sequenceChange
{
    public static void main(String args[])
    {
        //Variables used in the program are first initialized for clarity purposes
        int addition = 2; //Number to be added to the previous sequence number to get the new sequence number
        int sequence = 0; //Previous number in the sequence
        while(sequence < 69)
        {
            //while statement terminates the sequence at the number 69, which was provided in the instructions
            if(sequence == 20 || sequence == 41)
            {
                //If statement adds one to the addition variable at the specified times in the instructions in order to get the sequence specified
                addition++;
            }
            sequence += addition; //Previous number in the sequence has the specified value in the the instructions added to it to get the new number in the sequence
            System.out.println(sequence); //New number in the sequence is then printed
        }
    }   
}
//Output:
//2
//4
//6
//8
//10
//12
//14
//16
//18
//20
//23
//26
//29
//32
//35
//38
//41
//45
//49
//53
//57
//61
//65
//69