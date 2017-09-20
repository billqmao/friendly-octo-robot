
/**
 * Name: Bill Mao
 * Date: 9/14/2017
 * School: East Chapel Hill High School
 * Program: Sum and Average
 * Description: This program is designed to calculate the sum and the average of the four values specificed in the instructions.
 * It then takes the sum and average and prints them.
 * Difficulties: When I created this program, I again still had some difficulting in remembering to add semicolons to the end of every line of code.
 * What I Learned: I got some more practice with concatenation, mathematical operations, and primitive data types in Java.
 */
public class SumandAverage
{
    public static void main(String args[])
    {
        //Assigns 4 variables number specified by the instructions
        int calc1 = 475;
        int calc2 = 821;
        int calc3 = 369;
        int calc4 = 562;
        //Computes the sum and average of the four numbers
        int sum = calc1+calc2+calc3+calc4;
        double average = sum/4.0;
        //Prints the results of the two calculations\
        System.out.println("Thank you for entering your four numbers! Your results are:");
        System.out.println("The sum of the four numbers is " + sum + " and the average is " + average);
    }
}

/*Sample Output:
 *Thank you for entering your four numbers! Your results are:
 *The sum of the four numbers is 2227 and the average is 556.75
 */