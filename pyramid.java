
/**
 * Name: Bill Mao
 *
 * Date: 10/20/17
 *
 * School: East Chapel Hill High School
 *
 * Program: Program 166c (even more asterisk per asterisk)
 *
 * Description: This program is designed to print out a six line pyramid.
 * It begins by executing a large for loop that controls which line of the pyramid is being printed.
 * In the loop, the amount of stars and spaces need in a line are first calculated.
 * The number of spaces needed is then printed through iterations of one while loop.
 * The number of stars needed is printed after the spaces though a similarly formatted while loop
 * The program then ends once all the stars and spaces are printed, and six lines of a pyramid are on the console.
 *
 * Difficulties: I originally got an infinite loop of stars because I reversed the greater than or equal to signs to...
 * less than or equal to signs in the two while loops.
 *
 * What I Learned: I got some more practice with nested loops and formatting printed strings in the console.
 */

public class pyramid
{
    public static void main(String args[])
    {
        for(int pyramidLine = 0; pyramidLine <= 5; pyramidLine++) //Controls the printing of the pyramid line by line from line 0, up to 6 total lines.
        {
            int stars = 2 * pyramidLine + 1; //Number of stars is 2 times the pyramid line plus one.
            int spaces = 5 - pyramidLine; //Number of spaces that are printed is 5 minus the line of the pyramid
            //As the pyramid lines get larger, there are less initial spaces and more stars
            while(spaces >= 1) //Controls the printing of the spaces
            {
                System.out.print(" ");
                spaces--;
            }
            while(stars >= 1) //Controls the printing of the stars
            {
                System.out.print("*");
                stars--;
            }
            System.out.println(""); //An empty string is printed for very new pyramid line to separate the lines of the pyramid out
        }
    }
}
//Output:
//     *
//    ***
//   *****
//  *******
// *********
//***********



