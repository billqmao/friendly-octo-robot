// A class that computes the sample statistics of the ages of
// family members.
public class FamilyStats
{
    public static void main(String[] args)
    {
        /*
        math equations obtained from: */
        // http://mathworld.wolfram.com/SampleVariance.html //comment BETTER
        // define some ages
        int momsAge= 42;
        int dadsAge= 43; //first error, comma instead of semicolon
        int myAge= 22, sistersAge= 16;
        int dogsAge= 6;
        // get the mean
        double ageSum = (momsAge + dadsAge + myAge + sistersAge + dogsAge); //capitalization!
        double average = ageSum / 5; //semicolons lady!
           // calculate the sample variance (Errored for incomplete comments
        double variance= 0.0;
        variance += (momsAge - average)*(momsAge - average);
        variance += (dadsAge - average)*(dadsAge - average); //SRSLY you forgot a multiply sign
        variance += (myAge - average)*(myAge - average);
        variance += (sistersAge - average)*(sistersAge - average);
        variance += (dogsAge - average)*(dogsAge - average);
        variance = variance / 4;
        // get the std. dev
        double standardDev= Math.sqrt(variance);
        // output the results
        System.out.println("The sample age mean is:" + average); //Ohmygodstring
        System.out.println("The sample age variance is:" + variance);
        System.out.println("The sample age standard deviation is:" + standardDev);
    }
} //error #2 forgot closing bracket