
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

import java.util.*;
import java.io.*;

public class AnimalDictionary
{
    public static void main(String args[])
    {
        Scanner readFile = null;
        try
        {
            // Create a scanner to read the file, file name is parameter
            readFile = new Scanner (new File("Prog505c.dat"));
        }
        catch (FileNotFoundException e)
        {
            System.out.println ("File not found!");
            // Stop program if no file found
            System.exit(0);
        }
        String animal = "";
        while(readFile.hasNext() == true)
        {
            animal = readFile.next();
            System.out.print(animal);
            animal = animal.toLowerCase();
            if(animal.compareTo("dinosaur") > 0 && animal.compareTo("walrus") < 0)
            {
                System.out.print("\t\tbetween\n");
            }
            else
            {
                System.out.print("\t\tnot between\n");

            }

        }
    }

}