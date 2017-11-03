/**
 * Name: Bill Mao
 *
 * Date: 11/2/2017
 *
 * School: East Chapel Hill High School
 *
 * Program: Program 230a (multiples of 3 and 7)
 *
 * Description: This program is designed to print all integer multiples of 3 or 7 between the integers 1 to 100
 * It first begins by declaring any variables used later in the loop.
 * The header for the table of integers is then printed.
 * A for loop then iterates  a variable through all integer values between 1-100
 * For each iteration, an if statement checks if the integer is a multiple of 3 or 7 and prints the variable if it is.
 *
 * Difficulties: I originally used two if statements to check the integer multiples but merged them into one if statement with an or operator.
 *
 * What I Learned: I learned how to use the or operator, and I got some more practice with decision making with if statements and the for loop.
 */

import java.util.*;
import java.io.*;

public class integerMultiples
{
    public static void main(String args[])
    {
        //Variables used in the loop are first declared for clarity purposes
        int multiple = 0; //Represents the potential integer multiple of 3 or 7
        System.out.println("Integers less than 100 that are evenly divisible by 3 or 7"); //Printing of table header
        for(multiple = 1; multiple < 100; multiple++)
        {
            //For loop iterates through the integers 1-100 so that they can be checked to see if they are a multiple of 3 or 7
            if((multiple % 3) == 0 || (multiple % 7) == 0)
            {
                //If statement checks if the integer is a potential multiple of 3 or 7 by performing a modulo operation and seeing if the remainder is zero
                //If the integer fits the definition, it is printed
                System.out.println(multiple);
            }
        }
    }
}
//Output:
//Integers less than 100 that are evenly divisible by 3 or 7
//3
//6
//7
//9
//12
//14
//15
//18
//21
//24
//27
//28
//30
//33
//35
//36
//39
//42
//45
//48
//49
//51
//54
//56
//57
//60
//63
//66
//69
//70
//72
//75
//77
//78
//81
//84
//87
//90
//91
//93
//96
//98
//99




