
/**
 * Name: Bill Mao
 * 
 * Date: 12/4/2017
 * 
 * School: East Chapel Hill High School
 * 
 * Program: Prog505c in between
 * 
 * Description: This program is designed to print out the name of an animal and whether it is between the words dinosaur and walrus in the dictionary.
 * The program begins by first begins by initializing a scanner object that reads from a .dat file containing the names of the animals.
 * If the file is not found, and error message is printed and the program terminates.
 * The string that will contain each individual animal name is the initialized.
 * A while loop then executes as long as there are still names in the file.
 * In the loop, a name is assigned to the previously initialized variable and is printed.
 * The name is then sent to lowercase in order to compare the name to the two dictionary words without worrying about case.
 * An if statement then executes that compares the animal name to the two names.
 * If it is in between the two names, a statement is printed saying so.
 * If not, an opposite statement is printed.
 * 
 * Difficulties: I originally did not send the animal names to lowercase and got incorrect answers because the names in the .dat file were capitalized.
 * 
 * What I Learned: I got some more practice with importing files in Java, loops, and String methods.
 */

import java.util.*;
import java.io.*;

public class AnimalDictionary
{
    public static void main(String args[])
    {
        //Any primitive variables or objects needed for later operations are first initialized ared here for clarity purposes
        Scanner readFile = null; //Scanner that will get data in a file
        try
        {
            // Create a scanner to read the file
            readFile = new Scanner (new File("Prog505c.dat"));
        }
        catch (FileNotFoundException e)
        {
            System.out.println ("File not found!");
            //If the file is not found, error message is printed and program terminates
            System.exit(0);
        }
        String animal = ""; //String with the animal name in it
        while(readFile.hasNext() == true) //While there are still names to be read...
        {
            animal = readFile.next(); //A name is read and assigned to the animal variable
            System.out.print(animal); //The name is then printed
            animal = animal.toLowerCase();//and is then sent to lowercase in order to compare without case being an issue
            if(animal.compareTo("dinosaur") > 0 && animal.compareTo("walrus") < 0)
            {
                //If the value of the animal name comes after dinosaur, and before walrus
                System.out.printf("\t\tbetween\n"); //A message is printed stating that the word is between the two specified words
            }
            else
            {
                System.out.printf("\t\tnot between\n"); //Otherwise, the user is notified that the word is outside the range.

            }
        }
    }

}
//Output:
//Vampire		between
//Monkay		between
//Elephant		between
//Ape		not between
//Lion		between
//Hippopotamus		between
//Ant		not between
//Zebra		not between
//Yak		not between
//Antelope		not between
//Dingo		not between
//Whale		not between
//Dog		between
//Cat		not between
//Moose		between
//Panda		between