import java.util.Scanner;
//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//***************************************************************
 
public class Paint
{
        public static void main(String[] args)
        {
            Scanner keyboard = new Scanner(System.in);
            final int COVERAGE = 350;  //paint covers 350 sq ft/gal
            //declare integers length, width, and height;
            int length; 
            int width; 
            int height;
            //declare double totalSqFt;
            double totalSqFt;
            //declare double paintNeeded;
            double paintNeeded;
            //Declare and initialize the length of the room
            System.out.print ("Please enter the length of the room.");
            length = keyboard.nextInt();
            //Declare and initialize the width of the room
            System.out.print ("Please enter the width of the room."); 
            width = keyboard.nextInt();
            //Declare and initialize the height of the room
            System.out.print ("Please enter the height of the walls."); 
            height = keyboard.nextInt();
            //Compute the total square feet to be painted--think
            //about the dimensions of each wall
            totalSqFt = 2*(length*height)+2*(width*height);
            System.out.println("The total Square feet to be painted is " +totalSqFt);
            //Compute the amount of paint needed
            paintNeeded = Math.ceil(totalSqFt/COVERAGE);
            System.out.println("Total gallons needed are " + paintNeeded);
            //Print the length, width, and height of the room and the
            //number of gallons of paint needed.
        }
}