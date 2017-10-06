// *******************************************************************
//   PlusTest.java
//
//   Demonstrate the different behaviors of the + operator
// *******************************************************************
public class PlusTest
{
        // -------------------------------------------------
        // main prints some expressions using the + operator
        // -------------------------------------------------
        public static void main (String[] args)
        {
         System.out.println ("This is a long string that is the " +
                                 "concatenation of two shorter strings.");
                                 //The split of the string allows for easier reading
         System.out.println ("The first computer was invented about " + 55 +
                                 " years ago.");
                                 //The print below concatenation of 8 and 3
         System.out.println ("8 plus 5 is " + 8 + 5);
                                 //The print below adds 8 and 5 into 13
         System.out.println ("8 plus 5 is " + (8 + 5));
                                 //The Print below adds  and 5 without parenthesis
         System.out.println (8 + 5 + " equals 8 plus 5.");
        }
}