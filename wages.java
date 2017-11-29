/**
 * Name: Bill Mao
 *
 * Date: 11/20/17
 *
 * School: East Chapel Hill High School
 *
 * Program: Program 213a (weird wages)
 *
 * Description: This program is designed to find how much a programmer needs to be paid.
 * All variables used in the program are first initialized so that they can be used outside of their respective scopes.
 * An external data file is then imported so that it can be read.
 * This data file contains how many hours the programmer has worked per day.
 * A while loop then executes that keeps running until there are no more numbers to be read.
 * In the while loop, the pay is calculated by first importing the hours for one day and printing it.
 * The base ($30) and daily overtime ($25.5) pay are then first calculated.
 * This is followed by weekly overtime pay ($15).
 * The saturday and sunday bonuses are then added to the daily pay.
 * Once the pay for one day has been found, the daily pay is added to the total weekly pay, and the day and pay variables are set to the next day's values.
 * This process repeats until 7 day's worth of pay (1 week) has been found.
 * Once this occurs, the weekly pay is printed, and any variables used to calculate the daily pay are reset to their original values.
 * Once the pay calculations for the programmer have finished, the loop terminates, and the program prints a statement saying that it is done and exits.
 *
 * Difficulties: I originally set the pay variables to the pay amount instead of adding them. (Ex: instead of adding 100 to pay, pay was set to 100.)
 * I also forgot to add the over40 = true; to if statement calculating weekly overtime pay, which resulted in too much of this overtime pay being added.
 * I found both of these errors with the BlueJ debugger.
 *
 * What I Learned: I got more practice with debugging a program using the built in BlueJ debugger, if statement decision trees, and loops.
 */

import java.util.*;
import java.io.*;

public class wages
{
    public static void main(String args[])
    {
        //Variables needed later in the program are first initialized for clarity
        Scanner readFile = null; //Scanner is first initialized in order to prepare to read the .dat file
        double normalRate = 30; //Hourly wage for the programmer
        double pay = 0; //Pay for the day
        double totalPay = 0; //Total pay for the programmer in one week
        double dayOvertime = 25.5; //Extra hourly wage if the programmer works more than 8 hours in one day
        double weekOvertime = 15; //Extra hourly wage if the programmer works more than 40 hours in one week
        double saturdayBonus = 2.25; //Saturday bonus for the worker
        double sundayBonus = 1.5; //Sunday  bonus for the worker
        int hours = 0; //Hours the programmer has worked in one day
        int totalHours = 0; //Hours the programmer has worked in one week
        boolean over40 = false; //Used to calculate the programmer's pay when he has worked over 40 hours
        int day = 1; //Day that he is being paid for (day 1 = Monday, day 2 = Tuesday..._)
        int week = 0; //Week that the programmer is being paid for
        try
        {
            //Scanner object attempts to read the Prog213a.dat file
            readFile = new Scanner (new File("Prog213a.dat"));
        }
        catch (FileNotFoundException e)
        {
            //If it is not found, an error message is printed and the program exits.
            System.out.println ("File not found!");
            System.exit (0);
        }
        System.out.print("Hours Worked: "); //First Hours worked is printed separately
        while(readFile.hasNext() == true)
        {
            //Program calculates pay for each separate day
            hours = readFile.nextInt(); //Hours in one day is read from the external file
            totalHours += hours; //... and is added to the total hours
            System.out.print(hours + " "); //The hours worked in the day is then printed
            if(hours <= 8)
            {
                pay = pay + hours * normalRate; //First if statement finds how much the programmer is paid with no adjustments at $30 per hour if they worked less than 8 hours...
            }
            else
            {
                pay = pay + hours * normalRate + (hours - 8) * (dayOvertime); //... and adds daily overtime pay to the previous if they have worked more than 8 hours in one day
            }
            if(over40 == true) //If the program has already found that the programmer is eligible for weekly overtime pay...
            {
                pay = pay + hours * weekOvertime; //..It is added
            }
            else if(totalHours >= 40) //Otherwise, the program finds if the programmer needs weekly overtime pay...
            {
                pay = pay + (totalHours - 40) * weekOvertime;  //Find how much extra he is owed if he does...
                over40 = true; //And then turns this boolean to true so that any extra pay automatically gets weekly overtime.
            }
            if(day == 6)
            {
                pay = pay * saturdayBonus; //The program then finally adds the 125% saturday bonus if it saturday (day 6)
            }
            else if(day == 7)
            {
                pay = pay * sundayBonus; //...or the 50% Sunday bonus if it is sunday (day 7)
            }
            totalPay = totalPay + pay; //Once the day's pay is found, it is added to the total pay,
            pay = 0; //The days pay is reset
            day++; //... and the day counter is incremented to keep track of the days.
            if(day > 7) //When a week has been reached...
            {
                week++; //the week counter is incremented to keep track of the weeks.
                System.out.print("\nWeek # " + week + " $ " + EasyFormat.format(totalPay, 0 ,2)); //The week's wages are printed to the penny
                if(readFile.hasNext() == true) //If there are more week's wages to be found
                {
                    System.out.print("\n\nHours Worked: "); //...this header is printed.
                }
                //Values related to calculating the weekly wage are then reset to their original values so that a new week's wages can be found.
                day = 1;
                hours = 0;
                totalHours = 0;
                totalPay = 0;
                pay = 0;
                over40 = false;
            }
        }
        System.out.println("\n\nHours Worked: End of reading from file."); //Once all week's wages have been found, the program ends and prints a statement saying so.
    }   
}
//Output:
//Note: While only the third week matches the sample output, I have stepped through the pay calculation day by day in the debugger and verified them by hand multiple times.
//Hours Worked: 9 8 10 8 9 9 5
//Week # 1 $ 2788.12
//
//Hours Worked: 7 8 8 8 0 8 9
//Week # 2 $ 2093.25
//
//Hours Worked: 6 10 5 0 0 0 0
//Week # 3 $ 681.00
//
//Hours Worked: 9 5 1 5 10 5 4
//Week # 4 $ 1494.00
//
//Hours Worked: 5 8 10 0 1 3 1
//Week # 5 $ 1018.50
//
//Hours Worked: 0 4 5 0 7 0 8
//Week # 6 $ 840.00
//
//Hours Worked: End of reading from file.