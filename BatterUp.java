import java.util.*;
import java.io.*;
/**
 * Name: Bill Mao
 * Date: 9/21/17
 * School: East Chapel Hill High School
 * Program: Program 54d (batter up)
 * Description: This program is designed to ask the user for a baseball player's name, adn three statistics related to baseball:...
 * the times at bat, number of hits, and number of walks for the player.
 * It then takes these statistics and calculates the batting average and on base percentage.
 * The batting average and on base percentage are then rounded to three decimal points, and are printed for the user to see.
 * Difficulties: When I created this program, I first rounded incorrectly by adding .05 instead of .5.
 * What I Learned: In this exercise, I got some more practice with casting variables and getting user input with the scanner class.
 * I also better understand how the rounding calculation works now.
 */

public class BatterUp
{
    public static void main(String args[])
    {
        Scanner keyboardInput = new Scanner(System.in); //Creating the scanner object in order to use it
        //Asks for the Player's name, waits for input, and then stores it as one string
        System.out.println("Enter Player's Name:_");
        String playerName = keyboardInput.nextLine();
        //Asks for statistic related to batting average, waits for input, and then stores that variable as an integer
        System.out.println("Enter Number of Times at bat:_");
        int timesAtBat = keyboardInput.nextInt();
        System.out.println("Enter Number of Hits:_");
        int numberOfHits = keyboardInput.nextInt();
        System.out.println("Enter Number of Walks:_");
        int numberOfWalks = keyboardInput.nextInt();
        //Calculates batting average by dividing the number of hits by the number of times at bat less the number of walks
        double battingAverage = numberOfHits / (double) (timesAtBat - numberOfWalks);
        //Calculates on base percentage by adding the number of hits and walks and then dividing the total by the number of at bats
        double onBasePercentage = (numberOfHits + numberOfWalks) / (double) timesAtBat;
        //Rounds the on base percentage and batting average to the thousandths place
        double battingRounded = (int) (battingAverage * 1000 + .5) / 1000.0;
        double onBaseRounded = (int) (onBasePercentage * 1000 + .5) / 1000.0;
        //Prints the results of the calculations
        System.out.println(playerName + " has a batting average of " + battingRounded + " and an On Base Percentage of " + onBaseRounded);
    }
}

//Example output of a player named John Doe with 100 times at bat, 20 hits, and five walks
//Enter Player's Name:_
//John Doe
//Enter Number of Times at bat:_
//100
//Enter Number of Hits:_
//20
//Enter Number of Walks:_
//5
//John Doe has a batting average of 0.211 and an On Base Percentage of 0.25


