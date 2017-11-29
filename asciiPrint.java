/**
 * Name: Bill Mao
 *
 * Date: 11/22/17
 *
 * School: East Chapel Hill High School
 *
 * Program: Program 500a (Mr. Ascii)
 *
 * Description: This program is designed to print out a two column table of ascii characters from 32 to 122.
 * The program first initializes the variable that represents the ascii characters.
 * A loop then executes that increments the variable to even integer values of 32-120.
 * For each value, the ascii character that corresponds to the integer and the ascii character that is one greater are printed.
 * Once all the characters that correspond with those values are printed, the last character (z) is then manually printed...
 * since it does not fit in the two column format.
 *
 * Difficulties: I originally was unsure of how to format the lines of ascii values, but I settled on tabs as they would be the easiest to type out and use.
 * I also had some trouble including z in the two column table.
 *
 * What I Learned: I got more practice with the char primitive data type and loops in Java.
 */

import java.util.*;
import java.io.*;

public class asciiPrint
{
    public static void main(String args[])
    {
        char ascii = 0; //ascii character to be printed
        for(ascii = 32; ascii < 122; ascii += 2) //Loops iterates through 32-12 even char values so that they are all printed with no repeats.
        {
            System.out.println(ascii + "\t" + (int) ascii + "\t" + (char) (ascii + 1) + "\t" + (int) (ascii + 1)); //Prints out ascii characters and their integer values with 2 per line
            //Integer values are not their own variable but are rather the ascii value converted to an integer value
            if(ascii == 120) //Since there are 91 ascii characters that need to be printed, z does not fit in the 2 column design and must be manually printed at the end.
            {
                System.out.println((char) (ascii + 2) + "\t" + (int) (ascii + 2));
            }
        }
    }   
}
//Output:
//     32    !    33
//"    34    #    35
//$    36    %    37
//&    38    '    39
//(    40    )    41
//*    42    +    43
//,    44    -    45
//.    46    /    47
//0    48    1    49
//2    50    3    51
//4    52    5    53
//6    54    7    55
//8    56    9    57
//<    60    =    61
//>    62    ?    63
//@    64    A    65
//B    66    C    67
//D    68    E    69
//F    70    G    71
//H    72    I    73
//J    74    K    75
//L    76    M    77
//N    78    O    79
//P    80    Q    81
//R    82    S    83
//T    84    U    85
//V    86    W    87
//X    88    Y    89
//Z    90    [    91
//\    92    ]    93
//^    94    _    95
//`    96    a    97
//b    98    c    99
//d    100    e    101
//f    102    g    103
//h    104    i    105
//j    106    k    107
///l    108    m    109
//n    110    o    111
//p    112    q    113
//r    114    s    115
//t    116    u    117
//v    118    w    119
//x    120    y    121
//z    122