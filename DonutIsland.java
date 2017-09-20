
/**
 * Name: Bill Mao
 * Date: 9/19/17
 * School: East Chapel Hill High School
 * Program: Program 54h (donut island)
 * Description: This program is designed to calculate the total farmable area of donut island.
 * It accomplishes this by storing the constant Pi, the diameter of the island, and the radius of the lake as variables.
 * It then finds the radius of the island, and the areas of the lake and the island,
 * The program then subtracts the area if the island from the lake to find the total farmable area. The total farmable area is then rounded to two decimal places.
 * The program finally prints the total farmable area along with the diameter of the island and the radius of the lake.
 * Difficulties: When I created this program, I forgot to use the island radius instead of the diameter.
 * What I Learned: In this exercise, I got some more practice with storing final variables, Java formatting best practices, casting, and mathematical operations.
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

