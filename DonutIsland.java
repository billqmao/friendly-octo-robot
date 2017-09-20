
/**
 * Name: Bill Mao
 * Date: 9/18/17
 * School: East Chapel Hill High School
 * Program: Program 54h (donut island)
 * Description: This program stores the constant Pi as a double final variable with a value of 3.14159.
 * The program then stores the radius of a circle, 4.532, as a double.
 * The circumference and area of the circle are then calculated using the first two variables, and are also stored as 64 bit floating point values.
 * The program finally prints the area, circumference, and radius of the circle.
 * and calculate the area and circumference. It then prints the result of these calculations along with the radius
 * Difficulties: When I created this program, I originally rounded to two decimal places instead of three.
 * What I Learned: In this exercise, I learned how to store values as final varaible in Java.
 * I also got more practice with the println function, the mathematical calculations used to round numbers, and mathematical operations in general.
 */

public class DonutIsland
{
    public static void main(String args[])
    {
        //Stores all constants and values provided in the instructions
        //All values in this program are in miles unless otherwise specified
        final double PI = 3.14159; //the constant Pi is stored with the final modifier
        double islandDiameter = 4.16;
        double lakeRadius = .95;
        //Uses formulas to calculate the total farmable area of the island
        double islandRadius = islandDiameter / 2; //The radius of the island is first calculated
        double lakeArea = PI * lakeRadius * lakeRadius;//The areas of the lake and the island are then found
        double islandArea = PI * islandRadius * islandRadius;
        double fertileArea = islandArea - lakeArea;//Finally, the area of the island is subtracted from the area of the lake to find the total farmable area
        //Rounds farmable area to two decimal places
        double fertileAreaRounded = (int) (fertileArea * 100 + .5) / 100.0;
        //Prints the results of the calculations
        System.out.println("Donut island with a diameter of 4.16 miles that contains a circular lake of .95 miles has " + fertileAreaRounded + 
        " square miles of cultivatable land.");
    }
}

//Sample Output:
//Donut island with a diameter of 4.16 miles that contains a circular lake of .95 miles has 10.76 square miles of cultivatable land.


