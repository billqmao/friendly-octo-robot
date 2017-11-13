
/**
 * Name: Bill Mao
 * 
 * Date: 9/5/2017
 * 
 * School: East Chapel Hill High School
 * 
 * Program: Hello World Program
 * 
 * Description: This is the first program I have made in Java, and it is designed to print "Hello World!" to the terminal.
 * 
 * Difficulties: I originally intended to use the switch Statement to do the decision making for the price,...
 * but I found that the range of quantities was better suited for the if else if statement due to its complexity.
 * 
 * What I Learned: I leared how to print text strings to the terminal in Java, how to put comments in Java,
 * and the basic structure of most Java programs.
 */

import java.util.*;
import java.io.*;

public class ordering
{
    public static void main(String args[])
    {
        Scanner kbInput = new Scanner(System.in);
        int quantity = 0;
        double price = 0;
        double amtDue = 0;
        System.out.println("Enter quantity: ");
        quantity = kbInput.nextInt();
        if(quantity >= 0 && quantity <= 99)
        {
            price = 7.95;
        }
        else if(quantity >= 100 && quantity <= 199)
        {
            price = 7.75;
        }
        else if(quantity >= 200 && quantity <= 299)
        {
            price = 7.4;
        }
        else if(quantity >= 300)
        {
            price = 7.15;
        }
        else
        {
            System.out.println("Please enter a positive integer value for the quantity");
        }
        amtDue = (int) ((quantity * price) * 100 + .5) / 100.0;
        System.out.println("Price = $" + price);
        System.out.println("Amount Due = $" + amtDue);
    }
}
//Output:
//Enter quantity: 
//50
//Price = $7.95
//Amount Due = $397.5
//
//Enter quantity: 
//199
//Price = $7.75
//Amount Due = $1542.25
//
//Enter quantity: 
//200
//Price = $7.4
//Amount Due = $1480.0
//
//Enter quantity: 
//475
//Price = $7.15
//Amount Due = $3396.25


