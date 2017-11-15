/**
 * Name: Bill Mao
 *
 * Date: 11/9/2017
 *
 * School: East Chapel Hill High School
 *
 * Program: Program 210c (Lower--Higher)
 *
 * Description: This program is designed to play a guessing game with the user in which the user has to guess a randomly generated number with the range of 1-100 inclusive.
 * The program first declares any needed variables and generates the random number.
 * A loop then executes, and the loop first asks the user for a guess.
 * An if decision tree then executes that compares the guess to the number to be guessed.
 * If the guess is higher or lower than the randomly generated number, the user is informed that he or she is incorrect and is told that he needs to guess lower or higher respectively.
 * If the guess is the same value as the number to be guessed, the user is told that they are correct and is also given the amount of total guesses they made.
 * The loop is then terminated by setting a boolean that controls the loop to true.
 *
 * Difficulties: I made the descriptions for the incorrect guesses (Guess lower instead of just lower) more detailed, as the original text provided in the sample output..
 * was ambiguous as to whether the answer was lower than the original guess or the guess was lower than the answer.
 * I also did not increment the count variable before the print statement when the guess was correct, which printed an incorrect number for the amount of guesses...
 * since the final guess was not added.
 *
 * What I Learned: I got some more practice with loops, decision trees using if statements, and generating random numbers in Java.
 */

import java.util.*;
import java.io.*;

public class highOrLow
{
    public static void main(String args[])
    {
        //Variables used later in the program are first initialized for clarity
        boolean correct = false; //Used to stop the game if the correct answer has been guessed
        Random randNum = new Random(); //Used to generate a random number
        Scanner kbInput = new Scanner(System.in); //Used to get user input
        int guess = 0; //Number that the user inputs as a guess
        int number = randNum.nextInt(100) + 1; //Random number between 1-100 that the user must guess
        int count = 0; //Number of guesses that the user has made
        System.out.println("I am thinking of a number between 1 and 100"); //Tells user the rules of the game
        while(correct == false)
        {
            System.out.println("What do you think it is?"); //Prints a statement telling the user to guess
            guess = kbInput.nextInt(); //Gets the user's guess
            if(guess > number) //If the guess is higher than the right answer
            {
                System.out.println("Guess Lower--Try Again"); //Tells the user his answer needs to be lower
                count++; //Adds one to the variable representing the amount of guesses made
            }
            else if(guess < number) //If the guess is lower than the right answer
            {
                System.out.println("Guess Higher--Try Again"); //Tells the user his answer needs to be higher
                count++; //Adds one to the variable representing the amount of guesses made
            }
            else if(number == guess) //If the guess is the right answer
            {
                count++; //Adds one to the variable representing the amount of guesses made
                System.out.println("You got it right in " + count + " guesses"); //Prints how many guesses the user has made and tells him his guess is correct
                correct = true; //Loop/the game stops when the correct answer has been guessed and the boolean is set to true
            }
        }
    }
}
//Output:
//I am thinking of a number between 1 and 100
//What do you think it is?
//50
//Guess Lower--Try Again
//What do you think it is?
//25
//Guess Higher--Try Again
//What do you think it is?
//30
//Guess Lower--Try Again
//What do you think it is?
//27
//Guess Lower--Try Again
//What do you think it is?
//26
//You got it right in 5 guesses