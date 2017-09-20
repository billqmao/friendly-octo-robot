
/**
 * Name: Bill Mao
 * Date: 9/15/2017
 * School: East Chapel Hill High School
 * Program: Election Results program
 * Description: This program is meant to take the results of an algebraic equation calculating how many votes Mary got, ...
 * and calculate the amount of votes the other cadidates recieved combined with the total amount of votes casted.
 * It then takes these values and prints them to the terminal.
 * Difficulties: When converting from algebra to Java, I at first added the votes from Mary rather than subtracted.
 * What I Learned: When writing this program, I learneed how our limited knowledge of Java effects how we write our programs.
 * I also got some more practice with mathematical operations in Java and formatting strings in the print function.
 * If given this assignment later in the year, I would solve the algebraic equation in Java.
 */

public class Classelection
{
    public static void main(String args[])
    {
        //Solving algebraic equations in Java requires a special library, ...
        //and knowledge of arrays, so this part will have to be done by hand
        //We know that the votes of Paul+Mary+Peter+Joan=9485
        //And that Peter+74(Votes)=Mary, Paul+23=Mary, and Joan+86=Mary
        //So Paul+Mary+Peter+Joan=9485, and Peter+Joan+Paul+183(74+23+86)=Mary*3
        //Subtracting these two equations gets us Mary*4=9668
        //From here we can start our Java program
        
        //Declares,initializes, and performs mathematical operations on variables that calulate how many votes Mary got
        int votesMarytimesfour = 9668;
        int votesMary = votesMarytimesfour / 4;
        
        //Calculates the amount of votes the other candidates got and total votes
        int votesPete = votesMary - 74;
        int votesPaul = votesMary - 23;
        int votesJoan = votesMary - 86;
        int totalvotes = votesPete + votesPaul + votesJoan + votesMary;
        
        //Prints the results of the election
        System.out.println("Mary won the election which gives her " + votesMary + " votes.");
        System.out.println("Pete has 74 less than Mary giving him " + votesPete + " votes.");
        System.out.println("Paul has 23 less than Mary giving him " + votesPaul + " votes.");
        System.out.println("Joan has 86 less than mary giving her " + votesJoan + " votes.\n");
        System.out.println("Total votes                           " + totalvotes + " votes.");
        
        
    }
}

//Sample Output:
//Mary won the election which gives her 2417 votes.
//Pete has 74 less than Mary giving him 2343 votes.
//Paul has 23 less than Mary giving him 2394 votes.
//Joan has 86 less than mary giving her 2331 votes.
//
//Total votes                           9485 votes.


