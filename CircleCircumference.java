
/**
 * Name: Bill Mao
 * Date: 9/18/17
 * School: East Chapel Hill High School
 * Program: Program 54c (circles)
 * Description: This program stores the constant Pi as a double final variable with a value of 3.14159.
 * The program then stores the radius of a circle, 4.532, as a double.
 * The circumference and area of the circle are then calculated using the first two variables, and are also stored as 64 bit floating point values.
 * The program finally prints the area, circumference, and radius of the circle.
 * and calculate the area and circumference. It then prints the result of these calculations along with the radius
 * Difficulties: When I created this program, I originally rounded to two decimal places instead of three.
 * What I Learned: In this exercise, I learned how to store values as final variable in Java.
 * I also got more practice with the println function, the mathematical calculations used to round numbers, and mathematical operations in general.
 */

public class CircleCircumference
{
    public static void main(String args[])
    {
        //Stores the constant Pi as a final variable and the radius as a variable
        final double PI = 3.14159;
        double radius = 4.532;
        //Uses geometric formulas to calculate circumference and radius
        double circumference = 2*PI*radius;
        double area = PI*radius*radius;
        //Rounds circumference and area to three decimal places
        circumference = (int)(circumference*1000+.05)/1000.0;
        area = (int)(area*1000+.05)/1000.0;
        //Prints the results of the calculations
        System.out.println("The Radius of the circle =        " + radius);
        System.out.println("The Area of the circle =          " + area);
        System.out.println("The Circumference of the circle = " + circumference);
    }
}

//The Radius of the circle =        4.532
//The Area of the circle =          64.525
//The Circumference of the circle = 28.475

