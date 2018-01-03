
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

public class SalesChart
{
    public static void main(String args[])
    {
        int calendarDay = 0;
        int dayOfTheWeek = 1;
        int dailySales = 0;
        System.out.println("Sales for October");
        System.out.println("Day/t/tDaily/t/tSales Graph");
        while(calendarDay >= 31)
        {
            dailySales = salesGenerator(dayOfTheWeek);
            if(dayOfTheWeek != 1)
            {
                histogramPrint(calendarDay, dailySales); 
            }
            calendarDay++;
            dayOfTheWeek++;
            if(dayOfTheWeek == 8)
            {
                dayOfTheWeek = 1;
            }
        }
    }

    public static int salesGenerator(int dayOfTheWeek)
    {
        Random randCash = new Random();
        int salesInCash = randCash.nextInt(40001) + 10000;
        while(dayOfTheWeek == 2 && salesInCash <= 30000)
        {
            salesInCash = randCash.nextInt(40001) + 10000;
        }
        while(dayOfTheWeek == 3 && salesInCash <= 20000)
        {
            salesInCash = randCash.nextInt(40001) + 10000;
        }
        while(dayOfTheWeek == 7 && salesInCash >= 15000)
        {
            salesInCash = randCash.nextInt(40001) + 10000;
        }
        return salesInCash;
    }
    
    public static void histogramPrint(int calendarDay, int dailySales)
    {
        
    }
}

