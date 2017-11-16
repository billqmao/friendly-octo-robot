/**
 * Name: Bill Mao
 *
 * Date: 11/15/2017
 *
 * School: East Chapel Hill High School
 *
 * Program: Program 213d (Weather Forecasting)
 *
 * Description: This program is designed to find the temperature of the surrounding environment based on the amount of cricket chirps there are.
 * Variables used later in the program are first declared for clarity purposes.
 * The user is then asked for the amount of chirps in the environment.
 * The amount of chirps is the  converted to degrees fahrenheit, which itself is converted to degrees celsius.
 * The temperature in both celsius and fahrenheit is then printed for the user to see.
 * Finally, an if else decision tree prints a statement related to the severity of the temperature based on the temperature in degrees fahrenheit.
 *
 * Difficulties: I originally got a temperature of 0 celsius for all chirps, as I did not use doubles in the conversion ratio from fahrenheit to celsius.
 * Ex: (fahrenheit - 32) * (5 / 9) = (fahrenheit - 32) * 0 instead of (fahrenheit - 32) * (5.0 / 9.0)
 *
 * What I Learned: I got some more practice with mathematical calculations, primitive data types, and if else decision trees, and
 */

import java.util.*;
import java.io.*;

public class CricketTemp
{
    public static void main(String args[])
    {
        //Variables used later in the program are first declared for clarity purposes
        Scanner kbInput = new Scanner(System.in); //Used to get user input
        int chirps = 0; //Cricket chirps per minute
        double fahrenheit = 0; //Temperature in fahrenheit
        double celsius = 0; //Temperature in celsius
        //Asks the user for the amount of cricket chirps per minute
        System.out.println("Enter Cricket Chirps/Min:");
        chirps = kbInput.nextInt(); //Stores the chirps
        //The temperature of the environment is found in fahrenheit
        fahrenheit = (chirps + 40) / 4;
        //The temperature in celsius is then found and is  rounded to two decimal points
        celsius = (fahrenheit - 32) * (5.0 / 9.0);
        celsius = (int) (celsius * 100 + .5) / 100.0;
        //Prints the temperatures
        System.out.println("Fahrenheit = " + fahrenheit);
        System.out.println("Celsius = " + celsius);
        //Temperature in fahrenheit is used to print the severity of the temperature
        if(fahrenheit >= 109)
        {
            //Severity of the temperature at 109 and greater degrees fahrenheit
            System.out.println("Dead Cricket");
        }
        else if(fahrenheit >= 81 && fahrenheit <= 108)
        {
            //Severity of the temperature from 81 to 108 degrees fahrenheit
            System.out.println("Whew!");
        }
        else if(fahrenheit >= 65 && fahrenheit <= 80)
        {
            //Severity of the temperature from 65 to 80 degrees fahrenheit
            System.out.println("Ah-hhh");
        }
        else if(fahrenheit >= 45 && fahrenheit <= 64)
        {
            //Severity of the temperature from 45 to 64 degrees fahrenheit
            System.out.println("Take a jacket");
        }
        else if(fahrenheit < 45)
        {
           //Severity of the temperature at 44 and below degrees fahrenheit
            System.out.println("Bur-rrr");
        }
    }
}
//Output:
//Enter Cricket Chirps/Min:
//20
//Fahrenheit = 15.0
//Celsius = -9.43
//Bur-rrr
//
//Enter Cricket Chirps/Min:
//180
//Fahrenheit = 55.0
//Celsius = 12.78
//Take a jacket
//
//Enter Cricket Chirps/Min:
//240
//Fahrenheit = 70.0
//Celsius = 21.11
//Ah-hhh
//
//Enter Cricket Chirps/Min:
//360
//Fahrenheit = 100.0
//Celsius = 37.78
//Whew!
//
//Enter Cricket Chirps/Min:
//480
//Fahrenheit = 130.0
//Celsius = 54.44
//Dead Cricket