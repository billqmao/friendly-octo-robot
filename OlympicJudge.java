
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
import java.text.*;

public class OlympicJudge
{
    public static void main(String args[])
    {
        String contestantScores = "";
        int contestantCount = 1;
        try
        {
            //Creates a scanner to read the file
            Scanner fileInput = new Scanner(new File("Prog215h.dat"));
        }
        catch (FileNotFoundException e)
        {
            System.out.println ("File not found!");
            //If the file is not found, error message is printed and program terminates
            System.exit(0);
        }
        while(fileInput.hasNextLine() == true)
        {
            System.out.println("Contestant " + contestantCount );
            contestantCount++;
            contestantScores = fileInput.nextLine();
            calculateScore(contestantScores);
        }
    }
    
    public static void calculateScore(String lineOfScores)
    {   double score = 0;
        double largestScore = 0;
        double smallestScore = 0;
        int scoreCount = 0;
        Scanner readLine = new Scanner(System.in);
        while(readLine.hasNext() == true)
        {
            score = readLine.nextDouble();
            if(score > largestScore)
            {
                largestScore = score;
            }
        }
    }
}
