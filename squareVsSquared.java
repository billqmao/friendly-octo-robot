/**
 * Name: Bill Mao
 *
 * Date: 10/5/17
 *
 * School: East Chapel Hill High School
 *
 * Program: Program 122a (square vs squared)
 *
 * Description: This program is designed to print a table of the numbers 1-40, their squares, and their square roots in three columns.
 * The program firsts starts by printing the heading of the table containing Number, Square and Square Root.
 * A for loop in the program that loops 40 times from numbers 1 to 40 is then executed.
 * In the loop, the number of the loop is squared and square rooted separately, and is then printed with the loop number in the table format.
 *
 * Difficulties: I had some trouble formatting the square root values to be spaced correctly and to also print to four decimal places.
 *
 * What I Learned: I got some more practice with the for loop, the Math class in Java, and use of the EasyFormat class.
 */

import java.util.*;
import java.io.*;

public class squareVsSquared
{
    public static void main(String args[])
    {
        System.out.println("Number\t" + "Square\t" + "Square Root"); //Prints the header of the table
        //Loops the function 40 times for number 1-40 inclusive
        for(int num = 1; num <= 40; num++)
        {
            int numsquared = (int) Math.pow(num, 2); //Squares the number for the second column
            double numsquarert = Math.sqrt(num); //Square roots the number for the third column
            //Prints the numbers 1-40, the square of the number, and the square root
            System.out.println(num + " \t" + numsquared + "\t   " + EasyFormat.format(numsquarert, 0, 4));
        }
    }
}

//Output:
//Number    Square  Square Root
//1     1      1.0000
//2     4      1.4142
//3     9      1.7321
//4     16     2.0000
//5     25     2.2361
//6     36     2.4495
//7     49     2.6458
//8     64     2.8284
//9     81     3.0000
//10    100    3.1623
//11    121    3.3166
//12    144    3.4641
//13    169    3.6056
//14    196    3.7417
//15    225    3.8730
//16    256    4.0000
//17    289    4.1231
//18    324    4.2426
//19    361    4.3589
//20    400    4.4721
//21    441    4.5826
//22    484    4.6904
//23    529    4.7958
//24    576    4.8990
//25    625    5.0000
//26    676    5.0990
//27    729    5.1962
//28    784    5.2915
//29    841    5.3852
//30    900    5.4772
//31    961    5.5678
//32    1024   5.6569
//33    1089   5.7446
//34    1156   5.8310
//35    1225   5.9161
//36    1296   6.0000
//37    1369   6.0828
//38    1444   6.1644
//39    1521   6.2450
//40    1600   6.3246


