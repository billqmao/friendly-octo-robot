/**
 * Name: Bill Mao
 *
 * Date: 10/20/2017
 *
 * School: East Chapel Hill High School
 *
 * Program: Program 168h (challenging crossing numbers)
 *
 * Description: This program prints out an X made of for x characters line by line horizontally
 * It does this by using two for loops to print two large V's.
 * Four numbers are first declared so that they can be outside of the scope of all the loops.
 * These numbers represent what line of the X the program is printing, the amount of space in the middle...,
 * the amount of space before the first x, and a variable used to control the amount of x's printed.
 * The first right side up V is created using nested loops.
 * An outer for loop iterates the program from line 1 to line 11, where it stops.
 * Inside the loop, the middle and first spaces are calculated, depending on the line number.
 * The middle space decreases as the line number increases, while the first space increases.
 * Once the program reaches the last line, it only prints one star.
 * The first for loop then ,ends and then a mirror second loop prints out the other V of the X.
 * The only difference with the second for loop is that it does not need to check if only one star needs to be printed...,
 * and the middle space grows as the lines get bigger, while the first space shrinks.
 *
 * Difficulties: I had some difficulties getting only one star to print at line 11...,
 * and getting the whitespace between the x's to grow and shrink properly, but I eventually figured out how to...
 * set up the while loops to do this. I also had some difficulties with infinite loops occurring.
 *
 * What I Learned: I got some more practice with nested loops and mathematical calculations.
 */

public class printCross
{
    public static void main(String args[])
    {
        int xNum = 0; //Used to control the line number of the cross
        int middleSpace = 0; //Used to control the amount of spaces between the two x's
        int firstSpace = 0; //Used to control the amount of spaces before the first x
        int lastX = 0; //Used to see if two or one crosses need to be printed.
        for(xNum = 10; xNum >= 0; xNum--) //First for loop iterates from the starting line 0 to 10
        {
            //Middle space and first space are calculated based on the line number.
            middleSpace = 2 * xNum - 1; //Middle space is odd so that the x's converge properly
            firstSpace = 10 - xNum;
            while(firstSpace >= 1)
            {
                //While loop prints out the requisite number of first spaces
                System.out.print(" ");
                firstSpace--;
            }
            System.out.print("x"); //The first x is then printed
            while(middleSpace >= 1)
            {
                //The middle spaces are then printed out based on this while loop
                System.out.print(" ");
                middleSpace--;
            }
            lastX = xNum; //Sets the line number to the amount of x's variable
            while(lastX > 0)
            {
                //If the line number of the large X is not zero (not the last line), the second x prints once.
                //If it is the last line, the while loop does not run and the x is not printed.
                System.out.print("x");
                lastX = 0; //Prevents an infinite loop from occurring
            }
            System.out.println(""); //New line is printed for a new line number
        }
        //Second loop starts here
        for(xNum = 9; xNum >= 0; xNum--) //Second for loop iterates from the starting line 0 to 9, as there is one less line
        {
            //Middle space and first space are calculated based on the line number.
            middleSpace = 2 * (9 - xNum) + 1; //Middle space is odd so that the x's converge properly
            firstSpace = xNum;
            while(firstSpace >= 1 )
            {
                //While loop prints out the requisite number of first spaces
                System.out.print(" ");
                firstSpace--;
            }
            System.out.print("x"); //The first x is then printed
            while(middleSpace >= 1)
            {
                //The middle spaces are then printed out based on this while loop
                System.out.print(" ");
                middleSpace--;
            }
            System.out.print("x"); //The second x is then printed
            System.out.println(""); //New line is printed for a new line number
        }

    }
}

//Output:
//x                   x
// x                 x
//  x               x
//   x             x
//    x           x
//     x         x
//      x       x
//       x     x
//        x   x
//         x x
//          x
//         x x
//        x   x
//       x     x
//      x       x
//     x         x
//    x           x
//   x             x
//  x               x
// x                 x
//x                   x



