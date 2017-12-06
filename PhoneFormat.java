
/**
 * Name: Bill Mao
 *
 * Date: 12/1/2017
 *
 * School: East Chapel Hill High School
 *
 * Program: Program 516a (alphabet 2 numbers)
 *
 * Description: This program is designed to format a phone number and print it for the user to dial.
 * The program first begins by asking the user for the phone number to be dialed.
 * The number then has any letters in it sent to lowercase, and has leading and trailing spaces removed.
 * The phone number then has any letters in it replaced with numbers.
 * Any characters used to format numbers, which are ()+-, are then removed from the phone number, leaving only a block of digits.
 * If the phone number does not have the US country code, one is added.
 * The phone number finally has spaced added between the blocks of digits resembling this pattern before it is printed for the user to see: (X XXX XXX XXXX)
 *
 * Difficulties: I originally mixed up the onlyNumbers and elevenDigits variables so that the incorrect onlyNumbers variable was used to create the final phone number...
 * instead of the current elevenDigits variable.
 *
 * What I Learned: I got some more practice with String methods, dot notation, and if decision trees.
 */

import java.util.*;
import java.io.*;

public class PhoneFormat
{
    public static void main(String args[])
    {
        //Variables used later in the program are first initialized/instantiated for clarity
        Scanner kbInput = new Scanner(System.in); //Scanner used to get user input
        String phone = ""; //Initial phone number given by the user
        String onlyNumbers = "";  //Phone number with only numbers
        String elevenDigits = ""; //Phone number with only numbers and lengthened to 11 digits
        String finalNumber = ""; //Final phone number that is printed for the user to see
        //Asks user for their phone number and assigns the result to a previously declared variable
        System.out.print("Enter the number: ");
        phone = kbInput.nextLine();
        //Phone number then has leading or trailing zeroes removed and all letters are converted to lowercase
        phone = phone.toLowerCase().trim();
        //Lowercase letters are then replaced with numbers via the .replace() method
        onlyNumbers = phone.replace('a', '2').replace('b', '2').replace('c', '2')
        .replace('d', '3').replace('e', '3').replace('f', '3')
        .replace('g', '4').replace('h', '4').replace('i', '4')
        .replace('j', '5').replace('k', '5').replace('l', '5')
        .replace('m', '6').replace('n', '6').replace('o', '6')
        .replace('p', '7').replace('q', '7').replace('r', '7').replace('s', '7')
        .replace('t', '8').replace('u', '8').replace('v', '8')
        .replace('w', '9').replace('x','9').replace('y', '9').replace('z', '9');
        //Characters used for formatting phone numbers are then replaced
        onlyNumbers = onlyNumbers.replace("+", "").replace(" ", "").replace("(", "").replace(")", "").replace("-", "");
        if(onlyNumbers.length() <= 10)
        {
            //If the phone number does not have a country code, one is added
            elevenDigits = '1' + onlyNumbers;
        }
        else
        {
            //Otherwise, it is assigned to elevenDigits without any modifications
            elevenDigits = onlyNumbers;
        }
        //The final phone number is then created by adding spaces betwen blocks of digits (X XXX XXX XXXX)
        finalNumber = elevenDigits.charAt(0) + " " + elevenDigits.substring(1, 4) + " " + elevenDigits.substring(4, 7) + " " + elevenDigits.substring(7, 11); // + onlyNumbers.substring(
        System.out.println("The number to dial is " + finalNumber);
    }
}
//Output:
//Enter the number: 1 800 call att
//The number to dial is 1 800 225 5288
//
//Enter the number: 1 800 4 SWBYPS
//The number to dial is 1 800 479 2977
//
//Enter the number: 816 We Teach
//The number to dial is 1 816 938 3224
//
//Enter the number: 919callmee
//The number to dial is 1 919 225 5633



