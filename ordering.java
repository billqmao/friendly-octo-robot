
/**
 * Name: Bill Mao
 *
 * Date: 11/13/17
 *
 * School: East Chapel Hill High School
 *
 * Program: Program 213b (Quantity Ordering)
 *
 * Description: This program is designed to find the cost of the items a customer orders.
 * The price per item varies based on how many items the customer orders.
 * The program first declares any variables needed later in the program.
 * It then asks the user for how many items they want to order.
 * An if-else decision tree then finds the price per item based on how many items the user input.
 * The total cost of the items is then found and rounded to two digits.
 * Finally, the price and total amount due are then printed.
 *
 * Difficulties: I originally intended to use the switch Statement to do the decision making for the price,...
 * but I found that the range of quantities was better suited for the if else if statement due to its complexity.
 *
 * What I Learned: I got some more practice with obtaining user input in Java, decision trees using if statements,...
 * and mathematical operations.
 */

import java.util.*;
import java.io.*;

public class ordering
{
    public static void main(String args[])
    {
        //Variables needed later in the program are first initialized for clarity
        Scanner kbInput = new Scanner(System.in); //Scanner that gets user input
        int quantity = 0; //Amount of items that the user wants to order
        double price = 0; //Price per item in dollars
        double amtDue = 0; //Amount of money the customer must pay to get their items
        System.out.println("Enter quantity: "); //Asks the user for how much items they want to order
        quantity = kbInput.nextInt(); //Stores the amount of items the customer inputs
        //Price per item is then calculated based on the amount of items ordered
        if(quantity >= 0 && quantity <= 99)
        {
            //Price for 0-99 items inclusive
            price = 7.95;
        }
        else if(quantity >= 100 && quantity <= 199)
        {
            //Prise for 100-199 items inclusive
            price = 7.75;
        }
        else if(quantity >= 200 && quantity <= 299)
        {
            //Price for 200-299 items inclusive
            price = 7.4;
        }
        else if(quantity >= 300)
        {
            //Price for 300 or more items inclusive
            price = 7.15;
        }
        else
        {
            //Error statement that is printed if the number of items is nonsensical (ie: negative)
            System.out.println("Please enter a positive integer value for the quantity");
        }
        //The total cost for all the items is then calculated and rounded to two digits
        amtDue = (int) ((quantity * price) * 100 + .5) / 100.0;
        //The price per item and total cost are then printed
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
//
//Enter quantity:
//0
//Price = $7.95
//Amount Due = $0.0
//
//Enter quantity:
//80
//Price = $7.95
//Amount Due = $636.0
//
//Enter quantity:
//-10
//Please enter a positive integer value for the quantity
//Price = $0.0
//Amount Due = $0.0






