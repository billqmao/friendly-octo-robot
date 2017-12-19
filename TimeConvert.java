
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
        double hours, minutes;
        DecimalFormat df = new DecimalFormat("0.##");
        Scanner kbInput = new Scanner(System.in);
        System.out.println("Enter the number of hours: ");
        hours = kbInput.nextInt();
        minutes = hours * 60;
        System.out.println("The number of minutes is " + df.format(minutes));
    }
    
    public static void DaysToHours()
    {
        int days, hours;
        Scanner kbInput = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.##");
        System.out.println("Enter the number of days: ");
        days = kbInput.nextInt();
        hours = days * 24;
        System.out.println("The number of hours is " + df.format(hours));
    }
    
    public static void MinutesToHours()
    {
        double minutes, hours;
        DecimalFormat df = new DecimalFormat("0.##");
        Scanner kbInput = new Scanner(System.in);
        System.out.println("Enter the number of minutes: ");
        minutes = kbInput.nextInt();
        hours = minutes / 60;
        System.out.println("The number of hours is " + df.format(hours));
    }
    
    public static void HoursToDays()
    {
        double days, hours;
        DecimalFormat df = new DecimalFormat("0.##");
        Scanner kbInput = new Scanner(System.in);
        System.out.println("Enter the number of hours: ");
        hours = kbInput.nextInt();
        days = hours / 24;
        System.out.println("The number of days is " + df.format(days));
    }
    
    public static void ElapsedTime()
    {
        
    }
}

