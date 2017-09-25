/**
 * Name: Bill Mao
 * Date: 9/22/17
 * School: East Chapel Hill High School
 * Program: Program 54j (Racing Cars)
 * Description: This program is designed to calculate how much faster a car would go around the earth if a similar car was travelling on a road 15 feet higher.
 * The values needed for the calculation are first stored, with Pi being stored as a final.
 * The distance the two cars travelled is then calculated, and the two values are subtracted to find how much farther one car travelled.
 * This extra distance is then divided by the speed of the two cars to find when the car with the shorter distance would cross the finish line first.
 * The time is then printed for the user to see.
 * Difficulties: When I created this program, I got a wrong answer at first because I did not correctly convert miles per hour to feet per second for the speed of the two vehicles.
 * What I Learned: In this exercise, I got some more practice with casting variables and rounding using casting.
 * I also got some practice with declaring variables and mathematical operations.
 */

public class RacingCars
{
    public static void main(String args[])
    {
        //Declares constant Pi as a final
        //Converts all values needed in the calculations and stores them as doubles or integers
        final double PI = 3.14159;
        double speed = 102.666666; //The speed of the cars is converted to feet per second from miles per hour
        int redDiameter = 42240000; //The diameter of the earth for the red car is converted to feet
        int blueDiameter = redDiameter + 15; //The Diameter for the blue car is also in feet, but is 15 feet longer due to the elevation of its road
        //Calculates Circumference/Distance travelled for both cars
        double redDistance = redDiameter * PI;
        double blueDistance = blueDiameter * PI;
        //Subtracts Distance travelled by Blue car from Red car to see how much farther the blue car travelled
        double extraDistance = blueDistance - redDistance;
        System.out.println(extraDistance);
        //Divides the extra distance by the speed to find how much faster the red car travelled
        double fasterSpeed = extraDistance / speed;
        //Rounds how much faster the red car travelled to three decimal points
        double fasterRounded = (int) (fasterSpeed * 1000 + .5) / 1000.0;
        //Prints the result of the calculations
        System.out.println("The Blue Car will cross the finish line " + fasterRounded + " seconds after the red car.");
    }
}

//Output:
//The Blue Car will cross the finish line 0.459 seconds after the red car.


