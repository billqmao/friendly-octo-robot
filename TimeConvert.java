
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

public class TimeConvert
{
    public static void main(String args[])
    {
        int selection = 0;
        Scanner kbInput = new Scanner(System.in);
        System.out.println("Conversion Tasks");
        System.out.println("1.  hours  minutes\n2.  days  hours\n3.  minuteshours\n4.  hoursdays\n5.  elapsed time between two times");
        System.out.println("Enter a Number: ");
        selection = kbInput.nextInt();
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
            default: System.out.println("Please enter a valid number");
                     break;

        }
    }

    public static void HoursToMinutes()
    {
        int hours, minutes;

        Scanner kbInput = new Scanner(System.in);
        System.out.println("Enter the number of hours: ");
        hours = kbInput.nextInt();
        minutes = hours * 60;
        System.out.println("The number of minutes is " + minutes);
    }

    public static void DaysToHours()
    {
        int days, hours;
        Scanner kbInput = new Scanner(System.in);
        System.out.println("Enter the number of days: ");
        days = kbInput.nextInt();
        hours = days * 24;
        System.out.println("The number of hours is " + hours);
    }

    public static void MinutesToHours()
    {
        double minutes, hours;
        DecimalFormat df = new DecimalFormat("0.##");
        Scanner kbInput = new Scanner(System.in);
        System.out.println("Enter the number of minutes: ");
        minutes = kbInput.nextDouble();
        hours = minutes / 60;
        System.out.println("The number of hours is " + df.format(hours));
    }

    public static void HoursToDays()
    {
        double days, hours;
        DecimalFormat df = new DecimalFormat("0.##");
        Scanner kbInput = new Scanner(System.in);
        System.out.println("Enter the number of hours: ");
        hours = kbInput.nextDouble();
        days = hours / 24;
        System.out.println("The number of days is " + df.format(days));
    }

    public static void ElapsedTime()
    {
        int beginHour, beginMinute, endHour, endMinute;
        int elapsedHour, elapsedMinute;
        Scanner kbInput = new Scanner(System.in);
        System.out.println("Enter the beginning hour: ");
        beginHour = kbInput.nextInt();
        System.out.println("Enter the beginning minute: ");
        beginMinute = kbInput.nextInt();
        System.out.println("Enter am/pm: ");
        if(kbInput.next().equalsIgnoreCase("pm"))
        {
            beginHour += 12;
        }
        System.out.println("Enter the ending hour: ");
        endHour = kbInput.nextInt();
        System.out.println("Enter the ending minute: ");
        endMinute = kbInput.nextInt();
        System.out.println("Enter am/pm: ");
        if(kbInput.next().equalsIgnoreCase("pm"))
        {
            endHour += 12;
        }
        elapsedHour = endHour - beginHour;
        elapsedMinute = endMinute - beginMinute;
        if(elapsedHour < 0 || elapsedMinute < 0)
        {
            System.out.println("Please enter an end time that is later than the beginning time.");
        }
        else
        {
            System.out.println("The elapsed time is " + elapsedHour + " hours and " + elapsedMinute + " minute(s).");
        }
        
    }
}
//Output:
//Conversion Tasks
//1.  hours  minutes
//2.  days  hours
//3.  minuteshours
//4.  hoursdays
//5.  elapsed time between two times
//Enter a Number: 
//1
//Enter the number of hours: 
//5
//The number of minutes is 300
//
//Conversion Tasks
//1.  hours  minutes
//2.  days  hours
//3.  minuteshours
//4.  hoursdays
//5.  elapsed time between two times
//Enter a Number: 
//2
//Enter the number of days: 
//6
//The number of hours is 144
//
//Conversion Tasks
//1.  hours  minutes
//2.  days  hours
//3.  minuteshours
//4.  hoursdays
//5.  elapsed time between two times
//Enter a Number: 
//3
//Enter the number of minutes: 
//100
//The number of hours is 1.67
//
//Conversion Tasks
//1.  hours  minutes
//2.  days  hours
//3.  minuteshours
//4.  hoursdays
//5.  elapsed time between two times
//Enter a Number: 
//4
//Enter the number of hours: 
//32
//The number of days is 1.33
//
//Conversion Tasks
//1.  hours  minutes
//2.  days  hours
//3.  minuteshours
//4.  hoursdays
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
//1.  hours  minutes
//2.  days  hours
//3.  minuteshours
//4.  hoursdays
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
//1.  hours  minutes
//2.  days  hours
//3.  minuteshours
//4.  hoursdays
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
//1.  hours  minutes
//2.  days  hours
//3.  minuteshours
//4.  hoursdays
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
//1.  hours  minutes
//2.  days  hours
//3.  minuteshours
//4.  hoursdays
//5.  elapsed time between two times
//Enter a Number: 
//6
//Please enter a valid number