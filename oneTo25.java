
/**
 * Name: Bill Mao
 *
 * Date: 10/13/2017
 *
 * School: East Chapel Hill High School
 *
 * Program: Program 123a (Counting 25 formatted numbers)
 *
 * Description: This program is designed to print out a table of number from one to twenty five.
 * It begins by printing out a header for the table.
 * A do..while loop inside a for loop is designed to iterate through the numbers 1-5 plus the last number of the row before it
 * A for loop outside of the do..while loop is designed to iterate through the five rows necessary to print 1-25.
 * These two nested loops combine to point out the table of the number 1-25.
 *
 * Difficulties: I reversed all of the greater than/less than signs at first.
 *
 * What I Learned: I got some more practice with nested loops in this program,...
 * and it helped me better understand how they work.
 */

public class oneTo25
{
    public static void main(String args[])
    {
        System.out.println("Numbers 1 to 25"); //Table header is printed
        for(int count = 0; count <= 4; count++) //First loop cycles through the 5 rows, 0-4 for counting purposes
        {
            int number = 1 + count * 5; //The number cycles through 1-5 + last number of the previous row, or 0 if there was no last row
            do
            {
                //The number is first printed, then incremented
                System.out.print(number + "\t");
                number++;
            }
            //The last number of the previous row is subtracted to get to the original 1-5 numbers. Once it hits five, it iterates for the last time, and goes back to the first loop for another row
            while((number - count * 5) <= 5);
            //Prints a new line to separate out the rows.
            System.out.println("\n");
        }
    }
}
//Output:
//Numbers 1 to 25
//1 2   3   4   5
//
//6 7   8   9   10
//
//11    12  13  14  15
//
//16    17  18  19  20
//
//21    22  23  24  25



