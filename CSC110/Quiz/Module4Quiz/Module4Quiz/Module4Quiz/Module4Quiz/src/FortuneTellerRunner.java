import java.io.BufferedReader;
import java.util.Scanner;

/* IF YOUR PROJECT DOESN'T RUN:
*  1. File > Project Structure
*  2. Under ProjectSettings > Project make sure an SDK is selected. (any SDK >= 11)
*/
public class FortuneTellerRunner {

    public void run(){
        String coinQuestion ="Did the coin land on heads";
        askCoin(coinQuestion);
        String eightBallQuestion = "Will I pass this Test";
        askEightBall(eightBallQuestion);
        String magicianQuestion = "";
        String magicianYear = "";
        askMagician(magicianQuestion, magicianYear);
    }

    /**
     * Write out the question to the console
     * Create an instance of the Coin class and call flip coin
     * Print out the result of the method call
     * (E.g. "The answer is yes" )
     * @param question the question to ask the Coin
     */
    public void askCoin(String question){
        System.out.println(question);
        Coin coin1 = new Coin();
        if (coin1.flipCoin()) {
            System.out.println("The answer is yes");
        } else {
            System.out.println("The answer is no");
        }
    }

    /**
     * Write out the question to the console
     * Create instance of EightBall class and call the shake method
     * Print out the result of the method call
     * (E.g. "The Magic 8 Ball says: My reply is no")
     * @param question the question to ask the Eight Ball
     */
    public void askEightBall(String question){
        System.out.println(question);
        EightBall question1 = new EightBall();
        System.out.println(question1.shake());

    }

    /**
     * Write out the question to the console
     * Create an instance of the Magician class and call the whatYear method
     * Print out the results of the method call
     * (E.g. "In the year 2025, that will happen")
     * @param question the question to ask the Magician
     * @param userProvidedNumber The random positive number the person asking question provides
     */
    public void askMagician(String question, String userProvidedNumber){

    }
}
