/**
 * Name: Bill Mao
 *
 * Date: 10/20/17
 *
 * School: East Chapel Hill High School
 *
 * Program: Prog 671a Time Converter
 *
 * Description: This program is designed to convert units of time based on what the user selects.
 * The program begins by declaring any variables needed in the main method.
 * The program then prints out a menu with five time conversion and asks the user for which one they want.
 * The time conversion are:
 * Hours To Minutes (1)
 * Days To Hours (2)
 * Minutes To Hours (3)
 * Hours To Days (4)
 * Elapsed Time(5)
 * The time conversion that the user wanted is then stored via a scanner object as an integer from 1-5.
 * A switch statement then executes the corresponding method that does the conversion and prints out the result.
 *
 * Difficulties: I originally was confused as to how methods were supposed to be documented (pre and post statements), but I figured it out
 * by looking at my notes and at the word documents from Monday.
 *
 * What I Learned: I learned how create multiple methods in Java, how to document them, and I got some more practice with the switch statement.
 */

import java.util.*;
import java.io.*;
import java.text.*;

public class TimeConvert
{
    /**
     * Menu for the user to select a time conversion method.
     * post: Time conversion method selected and executed.
     */

    public static void main(String args[])
    {
        int selection = 0; //Variable representing what time conversion the user wants.
        Scanner kbInput = new Scanner(System.in); //Scanner to get user input
        //Tells user of to select a time conversion methods by typing in an integer from 1-5
        System.out.println("Conversion Tasks");
        System.out.println("1.  hours to minutes\n2.  days to hours\n3.  minutes to hours\n4.  hours to days\n5.  elapsed time between two times");
        System.out.println("Enter a Number: ");
        ///...and then assigns the number to the selection variable.
        selection = kbInput.nextInt();
        //Switch statement runs a method that converts the measurements of time based on what number the user entered.
        //1 is Hours to minutes, 2 is Days to hours...
        switch(selection)
        {
            case 1: HoursToMinutes();
                    break;
            case 2: DaysToHours();
                    break;
            case 3: MinutesToHours();
                    break;
            case 4: HoursToDays();
                    break;
            case 5: ElapsedTime();
                    break;
            default: System.out.println("Please enter a valid number"); //If the number is not in the range [1,5], an error message is printed
                    break;
        }
    }

    /**
     * Converts a number of hours given by the user to minutes
     * post: Time in hours printed in minutes
     */

    public static void HoursToMinutes()
    {
        int hours, minutes; //Hours and minutes variables declared
        Scanner kbInput = new Scanner(System.in); //Scanner to get user input constructed
        //User asked for number of hours to be converted and then gets user input
        System.out.println("Enter the number of hours: ");
        hours = kbInput.nextInt();
        minutes = hours * 60; //Hours converted to minutes by multiplying by 60
        System.out.println("The number of minutes is " + minutes); //Number of minutes printed
    }

    /**
     * Converts a number of days given by the user to hours
     * post: Time in days printed in hours
     */
    public static void DaysToHours()
    {
        int days, hours; //Days and hours variables declared
        Scanner kbInput = new Scanner(System.in); //Scanner to get user input constructed
        //User asked for number of days to be converted and then gets user input
        System.out.println("Enter the number of days: ");
        days = kbInput.nextInt();
        hours = days * 24; //Days converted to Hours by multiplying by 60
        System.out.println("The number of hours is " + hours); //Number of hours printed
    }

    /**
     * Converts a number of minutes given by the user to hours
     * post: Time in minutes printed in hours
     */
    public static void MinutesToHours()
    {
        double minutes, hours; //Minutes and hours variables declared
        DecimalFormat df = new DecimalFormat("0.##"); //Decimal format constructed to format number of hours
        Scanner kbInput = new Scanner(System.in); //Scanner to get user input constructed
        //User asked for number of minutes to be converted and then gets user input
        System.out.println("Enter the number of minutes: ");
        minutes = kbInput.nextDouble();
        hours = minutes / 60; //Minutes converted to Hours by dividing by by 60
        System.out.println("The number of hours is " + df.format(hours)); //Number of hours printed rounded to two decimal places
    }

    /**
     * Converts a number of hours given by the user to minutes
     * post: Time in hours printed in minutes
     */
    public static void HoursToDays()
    {
        double days, hours; //Days and hours variables declared
        DecimalFormat df = new DecimalFormat("0.##"); //Decimal format constructed to format number of days
        Scanner kbInput = new Scanner(System.in);  //Scanner to get user input constructed
        //User asked for number of minutes to be converted and then gets user input
        System.out.println("Enter the number of hours: ");
        hours = kbInput.nextDouble();
        days = hours / 24; //Hours  converted to days by dividing by by 24
        System.out.println("The number of days is " + df.format(days)); //Number of days printed rounded to two decimal places
    }

    /**
     * Finds amount of time between two discrete times in one day in hours and minutes
     * post: Elapsed time in hours and minutes or error message printed to console
     */
    public static void ElapsedTime()
    {
        int beginHour, beginMinute, endHour, endMinute; //Beginning and ending minutes and hours declared
        int elapsedHour, elapsedMinute; //Elapsed minutes and hours declared
        Scanner kbInput = new Scanner(System.in); //Scanner object used to get user input constructed
        //User is asked for the beginning time in hours and minutes along with am/pm; values assigned to their respective variables
        System.out.println("Enter the beginning hour: ");
        beginHour = kbInput.nextInt();
        System.out.println("Enter the beginning minute: ");
        beginMinute = kbInput.nextInt();
        System.out.println("Enter am/pm: ");
        if(kbInput.next().equalsIgnoreCase("pm"))
        {
            //If the time is pm, it is converted to military time by adding 12 hours to the hours variable.
            beginHour += 12;
        }
        //User is asked for the end time in hours and minutes along with am/pm; values assigned to their respective variables
        System.out.println("Enter the ending hour: ");
        endHour = kbInput.nextInt();
        System.out.println("Enter the ending minute: ");
        endMinute = kbInput.nextInt();
        System.out.println("Enter am/pm: ");
        if(kbInput.next().equalsIgnoreCase("pm"))
        {
            //If the time is pm, it is converted to military time by adding 12 hours to the hours variable.
            endHour += 12;
        }
        elapsedHour = endHour - beginHour; //Amount of hours elapsed is found by subtracting the end and beginning hours
        elapsedMinute = endMinute - beginMinute; //Amount of minutes elapsed is found by subtracting the end and beginning minutes
        if(elapsedHour < 0 || elapsedMinute < 0)
        {
            //If the elapsed hours or minutes are negative (nonsensical), an error message is printed
            System.out.println("Please enter an end time that is later than the beginning time.");
        }
        else
        {
            //Otherwise, the amount of hours and minutes elapsed are printed.
            System.out.println("The elapsed time is " + elapsedHour + " hours and " + elapsedMinute + " minute(s).");
        }
    }
}
//Output:
//Conversion Tasks
//1.  hours to minutes
//2.  days to hours
//3.  minutes to hours
//4.  hours to days
//5.  elapsed time between two times
//Enter a Number:
//1
//Enter the number of hours:
//5
//The number of minutes is 300
//
//Conversion Tasks
//1.  hours to minutes
//2.  days to hours
//3.  minutes to hours
//4.  hours to days
//5.  elapsed time between two times
//Enter a Number:
//2
//Enter the number of days:
//6
//The number of hours is 144
//
//Conversion Tasks
//1.  hours to minutes
//2.  days to hours
//3.  minutes to hours
//4.  hours to days
//5.  elapsed time between two times
//Enter a Number:
//3
//Enter the number of minutes:
//100
//The number of hours is 1.67
//
//Conversion Tasks
//1.  hours to minutes
//2.  days to hours
//3.  minutes to hours
//4.  hours to days
//5.  elapsed time between two times
//Enter a Number:
//4
//Enter the number of hours:
//32
//The number of days is 1.33
//
//Conversion Tasks
//1.  hours to minutes
//2.  days to hours
//3.  minutes to hours
//4.  hours to days
//5.  elapsed time between two times
//Enter a Number:
//5
//Enter the beginning hour:
//8
//Enter the beginning minute:
//14
//Enter am/pm:
//am
//Enter the ending hour:
//2
//Enter the ending minute:
//47
//Enter am/pm:
//pm
//The elapsed time is 6 hours and 33 minute(s).
//
//Conversion Tasks
//1.  hours to minutes
//2.  days to hours
//3.  minutes to hours
//4.  hours to days
//5.  elapsed time between two times
//Enter a Number:
//5
//Enter the beginning hour:
//9
//Enter the beginning minute:
//5
//Enter am/pm:
//am
//Enter the ending hour:
//5
//Enter the ending minute:
//15
//Enter am/pm:
//pm
//The elapsed time is 8 hours and 10 minute(s).
//
//Conversion Tasks
//1.  hours to minutes
//2.  days to hours
//3.  minutes to hours
//4.  hours to days
//5.  elapsed time between two times
//Enter a Number:
//5
//Enter the beginning hour:
//0
//Enter the beginning minute:
//1
//Enter am/pm:
//am
//Enter the ending hour:
//11
//Enter the ending minute:
//59
//Enter am/pm:
//pm
//The elapsed time is 23 hours and 58 minute(s).
//
//Conversion Tasks
//1.  hours to minutes
//2.  days to hours
//3.  minutes to hours
//4.  hours to days
//5.  elapsed time between two times
//Enter a Number:
//5
//Enter the beginning hour:
//3
//Enter the beginning minute:
//22
//Enter am/pm:
//pm
//Enter the ending hour:
//5
//Enter the ending minute:
//7
//Enter am/pm:
//am
//Please enter an end time that is later than the beginning time.
//
//Conversion Tasks
//1.  hours to minutes
//2.  days to hours
//3.  minutes to hours
//4.  hours to days
//5.  elapsed time between two times
//Enter a Number:
//6
//Please enter a valid number