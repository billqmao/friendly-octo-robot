/**
 * Name: Bill Mao
 *
 * Date: 11/8/2017
 *
 * School: East Chapel Hill High School
 *
 * Program: Program 230b (Ulam hypothesis)
 *
 * Description: This program is designed to print the results of ulam's hypothesis on the numbers 1-25
 * Variables used throughout the program are first declared.
 * A for loop then runs that cycles through the numbers 1-25, with each run of the for loop performing ulam's hyphetiss on the number.
 * In each run, a do..while loop executes an if statement that divides the number by two if it is even and multiplies it by three and adds one if it is odd.
 * This process happens until the number 1 is reached.
 * Once one is reached, the run terminates, and the for loop goes up one to a new number and performs ulam's hypothesis again.
 *
 * Difficulties: I originally thought I could do this program with one variable representing both the run number and the number being operated on,...
 * but I realised that his would not be feasible, as the run loop would have issues iterating through the numbers 1-25.
 *
 * What I Learned: I got some more practice with nested loops, mathematical operations, and decision making using if statements in Java.
 */

public class ulam
{
    public static void main(String args[])
    {
        //Variables used later in the program are first initialized for clarity
        int run = 1; //Run number
        int number = 1; //Number used to see if the run number approaches one
        for(run = 1; run <= 25; run++)
        {
            //For loops iterates the run numbers from 1-25
            //The number used to calculate is reset to the run number for each new run
            number = run;
            System.out.print(run + ": "); //Prints a small header signifying what number is being used
            do
            {
                if(number % 2 == 0)
                {
                    //If statement divides the number by 2 if the number is even
                    number /= 2;
                    System.out.print(number + " "); //Number is printed
                }
                else
                {
                    //If statement multiples by three and adds one if the
                    number = (number * 3) + 1;
                    System.out.print(number + " "); //Number is printed

                }
            }
            while(number != 1);
            System.out.println(""); //Starts a new line for each new run
        }
    }
}

//Output:
//1: 4 2 1
//2: 1
//3: 10 5 16 8 4 2 1
//4: 2 1
//5: 16 8 4 2 1
//6: 3 10 5 16 8 4 2 1
//7: 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1
//8: 4 2 1
//9: 28 14 7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1
//10: 5 16 8 4 2 1
//11: 34 17 52 26 13 40 20 10 5 16 8 4 2 1
//12: 6 3 10 5 16 8 4 2 1
//13: 40 20 10 5 16 8 4 2 1
//14: 7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1
//15: 46 23 70 35 106 53 160 80 40 20 10 5 16 8 4 2 1
//16: 8 4 2 1
//17: 52 26 13 40 20 10 5 16 8 4 2 1
//18: 9 28 14 7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1
//19: 58 29 88 44 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1
//20: 10 5 16 8 4 2 1
//21: 64 32 16 8 4 2 1
//22: 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1
//23: 70 35 106 53 160 80 40 20 10 5 16 8 4 2 1
//24: 12 6 3 10 5 16 8 4 2 1
//25: 76 38 19 58 29 88 44 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1




