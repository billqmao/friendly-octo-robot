
/**
 * Write a description of class hourlyPay here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import java.io.*;
public class hourlyPay
{
    public static void main(String args[])
    {
        Scanner kbInput = new Scanner(System.in); //Creates a new scanner object in order to use user input
        System.out.println("Hours" + "\t" + "Pay");
        int pay;
        for(int hours = 1; hours <= 40; hours++)
        {
            pay = hours * 4;
            System.out.println(hours + "\t" + pay);
        }
    }
}
