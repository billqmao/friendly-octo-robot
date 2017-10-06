/**
 * Name: Bill Mao
 *
 * Date: 10/5/17
 *
 * School: East Chapel Hill High School
 *
 * Program: Program 122c (function chart)
 *
 * Description: This program is designed to find all even numbers between 0 and 50 inclusive, and print them...
 * along with the even number plus one, multiplied by two, and squared.
 * The program first enters into a for loop that loops 25 times for each even number and increments by two.
 * In the loop, the program then finds the three modifications of the even number listed above.
 * The even number and even+1, even*2, and even^2 are then printed in four columns.
 * Again, this is repeated 25 times to create the table.
 *
 * Difficulties: I had some trouble with using the EasyFormat class and how much spacing to use.
 *
 * What I Learned: I got some more practice with the EasyFormat class, and mathematical operations.
 */

import java.util.*;
import java.io.*;

public class functionChart
{
    public static void main(String args[])
    {
        //Loops the function 25 times for even numbers between 1 and 50
        for(int even = 0; even <= 50; even += 2)
        {
            int column2 = even +1; //Finds even number + 1 for the second column
            int column3 = 2 * even; //Finds 2 times even number for column three
            int column4 = (int) Math.pow(even, 2); //Squares even number
            //Prints the even number, even + 1, even * 2, and even squared in four columns
            System.out.println(EasyFormat.format(even, 0) + EasyFormat.format(column2, 12) + EasyFormat.format(column3, 12) + EasyFormat.format(column4, 12) + "\n");
        }
    }
}

//Output:
//0           1           0           0

//2           3           4           4

//4           5           8          16

//6           7          12          36

//8           9          16          64

//10          11          20         100

//12          13          24         144

//14          15          28         196

//16          17          32         256

//18          19          36         324

//20          21          40         400

//22          23          44         484

//24          25          48         576

//26          27          52         676

//28          29          56         784

//30          31          60         900

//32          33          64        1024

//34          35          68        1156

//36          37          72        1296

//38          39          76        1444

//40          41          80        1600

//42          43          84        1764

//44          45          88        1936

//46          47          92        2116

//48          49          96        2304

//50          51         100        2500