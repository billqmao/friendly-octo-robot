/**
 * Name: Bill Mao
 *
 * Date: 11/11/2017
 *
 * School: East Chapel Hill High School
 *
 * Program: Program 212a (passing trains)
 *
 * Description: This program is designed to find whether a freight train going 50 mph and a passenger train ever meet.
 * The program first initializes any variables needed further in the program for clarity purposes.
 * It then asks the user for the speed of the passenger train, and checks the speed using the if statement.
 * If the speed of the passenger train is 50 mph or less, the two trains will never meet, and the if statement will set some variables that make the program not perform any calculations...
 * relating to whether the two trains meet each other.
 * A while loop then executes that calculates the distance the two trains have travelled from 11:00 and whether the passenger train has crossed or overtaken the freight train.
 * Once the while loops finds the time at which the two trains cross each other, an if statement decision tree then...
 * prints the time when the two trains cross for the user to see.
 * One hour is given if the two trains crossed at a hour with no minutes (ex: 12:00), while a range is given if the trains crossed in between two hours.
 * The program then finally prints the speeds of the two trains.
 *
 * Difficulties: I originally intended to print the time at which the trains crossed with two if statements trees, one that printed the hours and one that printed the days.
 * I realised that incorporating then into one large if statement tree would be simpler to understand and more expandable in the future.
 *
 * What I Learned: I got some more practice with decision trees using if statements, loops, and mathematical operations in Java.
 */

import java.util.*;
import java.io.*;

public class trainTimes
{
    public static void main(String args[])
    {
        //Variables used later in the program are first initialized for clarity
        int freightSpeed = 50; //Speed of the freight train in mph
        int passengerSpeed = 0; //Speed of the passenger train in mph
        int freightDist = 100; //Distance the freight train has traveled in miles
        int passengerDist = 0; //Distance the freight train has travelled in miles
        int hours = 0; //Hours elapsed since the passenger train started travelling
        boolean crossed = false; //Represents whether the passenger train has passed the freight train
        boolean overtaken = false; //Represents whether the passenger train has overtaken the freight train
        Scanner kbInput = new Scanner(System.in); //Used to get user input
        //Prompts user for the speed of the train
        System.out.println("Enter the speed of the passenger train");
        passengerSpeed = kbInput.nextInt();
        if(passengerSpeed <= 50)
        {
            //If the speed of the passenger train is 50 mph or below, the two trains will never meet
            //Variables used in the calculations below are then set to values that will not result in anything printing except for the speed of the trains
            System.out.println("The passenger train will never catch up to the freight train");
            crossed = true;
            hours = 150;
        }
        while(crossed == false)
        {
            //This while loop calculates how far the trains have travelled per hour
            freightDist += freightSpeed; //Calculates how far the freight train has gone in one hour
            passengerDist += passengerSpeed; //Calculates how far the passenger train has gone in one hour
            hours++; //Adds one to the hours elapsed counter
            if(freightDist == passengerDist)
            {
                //When the two distances are equal, the loop is terminated so the time when they intersected can be printed by setting the crossed boolean to true
                crossed = true;
            }
            else if(passengerDist > freightDist)
            {
                //If the time the passenger train overtook the freight train is not an integer, the loop is both terminated and the overtaken boolean is set to true...
                //so that a range is printed in the later if decision tree
                crossed = true;
                overtaken = true;
            }
        }
        //If decision tree then prints out when the two trains met each other
        //The responses differ by the day they met, and whether they met on an hour or between two hours
        if(overtaken == false && hours <= 13) //First day, met on an hour
        {
            System.out.println("The passenger train passed the freight train at " + (hours + 11) +":00 on the first day");
        }
        else if(overtaken == true && hours <= 13) //First day, met between two hours
        {
            System.out.println("The passenger train passed the freight train between " + (hours + 10) +":00 and " + (hours + 11) + ":00 on the first day");
        }
        else if(overtaken == false && hours <= 37) //Second day, met on an hour
        {
            System.out.println("The passenger train passed the freight train at " + (hours - 13) +":00 on the second day");
        }
        else if(overtaken == true && hours <= 37) //Second day, met between two hours
        {
            System.out.println("The passenger train passed the freight train between " + (hours - 14) +":00 and " + (hours - 13) + ":00 on the second day");
        }
        else if(overtaken == false && hours <= 61) //Third day, met on an hour
        {
            System.out.println("The passenger train passed the freight train at " + (hours - 37) +":00 on the third day");
        }
        else if(overtaken == true && hours <= 61) //Third day, met between two hours
        {
            System.out.println("The passenger train passed the freight train between " + (hours - 38) +":00 and " + (hours - 37) + ":00 on the third day");
        }
        else if(overtaken == false && hours <= 85) //Fourth day, met on an hour
        {
            System.out.println("The passenger train passed the freight train at " + (hours - 61) +":00 on the fourth day");
        }
        else if(overtaken == true && hours <= 85) //Fourth day, met between two hours
        {
            System.out.println("The passenger train passed the freight train between " + (hours - 62) +":00 and " + (hours - 61) + ":00 on the fourth day");
        }
        else if(overtaken == false && hours <= 109) //Fifth day, met on an hour
        {
            System.out.println("The passenger train passed the freight train at " + (hours - 85) +":00 on the fifth day");
        }
        else if(overtaken == true && hours <= 109) //Fifth day, met between two hours
        {
            System.out.println("The passenger train passed the freight train between " + (hours - 86) +":00 and " + (hours - 85) + ":00 on the fifth day");
        }
        //Final print statement then prints out the speeds of the two trains
        System.out.println("The freight train was traveling " + freightSpeed +" mph\nThe passenger train was traveling " + passengerSpeed + " mph");
    }
}
//Output:
//Enter the speed of the passenger train
//80
//The passenger train passed the freight train between 14:00 and 15:00 on the first day
//The freight train was traveling 50 mph
//The passenger train was traveling 80 mph
//
//Enter the speed of the passenger train
//75
//The passenger train passed the freight train at 15:00 on the first day
//The freight train was traveling 50 mph
//The passenger train was traveling 75 mph
//
//Enter the speed of the passenger train
//85
//The passenger train passed the freight train between 13:00 and 14:00 on the first day
//The freight train was traveling 50 mph
//The passenger train was traveling 85 mph
//
//Enter the speed of the passenger train
//60
//The passenger train passed the freight train at 21:00 on the first day
//The freight train was traveling 50 mph
//The passenger train was traveling 60 mph
//
//Enter the speed of the passenger train
//40
//The passenger train will never catch up to the freight train
//The freight train was traveling 50 mph
//The passenger train was traveling 40 mph