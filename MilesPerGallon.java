
/**
 * Name: Bill Mao
 * Date: 9/14/2017
 * School: East Chapel Hill High School
 * Program: Miles Per Gallon
 * Description: This program is designed to calculate the miles per gallon of the four vehicles specificed in the instructions.
 * It then takes this value, rounds it to the tenths place, and prints the result.
 * Difficulties: When I created this program, I still had some difficulting in remembering to add semicolons to the end of every line of code.
 * I forgot that line breaks needed to be added inside the string and not outside of it. 
 * I also had to adjust some of the rounding to multiply and divide by 10 because the MPG values only went to one decimal place.
 * What I Learned: I learned how to cast values in Java to different primitive data types, and how those data types affect math operations.
 * I also learned how to concatenate together variables and strings in Java.
 * In the future, I would also simplify this program by declaring less variables and doing some of the calculations directly.
 */
public class MilesPerGallon
{
    public static void main(String args[])
    {
        //Defines miles travelled for each car as integers
        //Defines gallons of gas used for each car as doubles
        int vwBugMiles = 286;
        double vwBugGallons = 9.0;
        int firebirdMiles = 412;
        double firebirdGallons = 40.0;
        int subaruMiles = 361;
        double subaruGallons = 18.0;
        int cutlassMiles = 161;
        double cutlassGallons = 11.0;
        //Calculates miles per gallon for each car
        double vwBugMPG = vwBugMiles/vwBugGallons;
        double firebirdMPG = firebirdMiles/firebirdGallons;
        double subaruMPG = subaruMiles/subaruGallons;
        double cutlassMPG = cutlassMiles/cutlassGallons;
        //Rounds all 4 mpg variables to the nearest tenths
        double vwMPGRounded = (int)(vwBugMPG*10+.5)/10.0;
        double firebirdMPGRounded = (int)(firebirdMPG*10+.5)/10.0;
        double subaruMPGRounded = (int)(subaruMPG*10+.5)/10.0;
        double cutlassMPGRounded = (int)(cutlassMPG*10+.5)/10.0;
        //Prints miles per gallon results
        System.out.println("Kansas City Grand Prix\nMiles Per Gallon\n");
        System.out.println("1970 VW Bug averaged:" + " " + vwMPGRounded + " mpg"); 
        System.out.println("1979 Firebird averaged:" + " " + firebirdMPGRounded + " mpg");
        System.out.println("1980 Subaru averaged:" + " " + subaruMPGRounded + " mpg");
        System.out.println("1975 Cutlass averaged:" + " " + cutlassMPGRounded + " mpg");
    }
}

/*Sample Output:
 *Kansas City Grand Prix
 *Miles Per Gallon
 *
 *1970 VW Bug averaged: 31.8 mpg
 *1979 Firebird averaged: 10.3 mpg
 *1980 Subaru averaged: 20.1 mpg
 *1975 Cutlass averaged: 14.6 mpg
 */