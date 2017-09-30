import java.util.*;
import java.io.*;
/**
 * Name: Bill Mao
 * Date: 9/29/17
 * School: East Chapel Hill High School
 * Program: Program 82c (Road Trip)
 * Description: This program is designed to calculate the cost of a road trip.
 * It first asks the user for three data points related to the road trip: The average cost of gasoline, the distance to the destination, and the miles per gallon efficency of the car.
 * It then divides the miles to the destination by the miles per gallon, and multiplies by the price of the gas to find the cost of the trip.
 * The cost of the trip is then rounded to two decimal places.
 * The miles to the destination, miles per gallon of the car, the price of the gas, and the cost of the trip rounded are then printed for the user to see.
 * Difficulties: I originally set the milesToDest as an integer, and encountered an error when I tried to save a floating point to it.
 * What I Learned: I got some more practice with the scanner class and user input. I also practiced casting and printing to the console.
 */
public class roadTrip
{
    public static void main(String args[])
    {
        Scanner kbInput = new Scanner(System.in); //Creates a new scanner object in order to use user input
        //Asks the user for the miles to the destination, price of gas, and the efficiency of the car in miles per gallon
        System.out.println("Enter miles to your destination (one way):_");
        double milesToDest = kbInput.nextDouble();
        System.out.println("Enter estimated cost of gas:_");
        double priceOfGas = kbInput.nextDouble();
        System.out.println("Enter mpg for your vehicle:_");
        int milesPerGallon = kbInput.nextInt();
        //The cost of the gas for the trip is then calculated by dividing the distance by the efficency and then multiplying by the price of gas
        double gasCost = (milesToDest / milesPerGallon) * priceOfGas; 
        //The cost of gas for the trip is then rounded to two decimal places
        double gasCostRound = (int) (gasCost * 100 + .5) / 100.0;
        //The user input and the cost of the trip are then printed for the user to see
        System.out.println("The cost of traveling " + milesToDest + " miles, in a car that averages " + milesPerGallon + " mpg, with gasoline cost " 
        + priceOfGas + "  would be " + gasCostRound + ".");
    }
}

//Output:
//Enter miles to your destination (one way):_
//2974.12
//Enter estimated cost of gas:_
//1.719
//Enter mpg for your vehicle:_
//30
//The cost of traveling 2974.12 miles, in a car that averages 30 mpg, with gasoline cost 1.719  would be 170.42.
