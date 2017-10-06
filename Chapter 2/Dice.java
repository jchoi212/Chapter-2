
// **************************************************
//   LuckyNumbers.java
//
//   To generate two random "lucky" numbers
// **************************************************
 
import java.util.Random;
 
public class Dice
{
   public static void main (String[] args)
   {
          Random generator = new Random();
          int Die1, Die2, diceSum;
          Die1 = (int) (generator.nextFloat()*6) + 1;
          
          Die2 = (int) (generator.nextFloat()*6) + 1;
          
          diceSum  = Die1 + Die2;
          System.out.println (Die1);
          System.out.println (Die2);
          System.out.println ("Your Dice sum is " + diceSum);
        }
}