package q1;

import java.util.Scanner;
/**
 * <p>This program takes a double representing some money and outputs it 
 * in the largest possible combinations of bills and change.</p>
 *
 * @author Deric
 * @version 1.0
 */
public class Change {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        // your code will go here!!!
        
        //the value of each denomination in pennies
        final int tenInPen = 1000;
        final int fiveInPen = 500;
        final int twoInPen = 200;
        final int oneInPen = 100;
        final int quarterInPen = 25;
        final int dimeInPen = 10;
        final int nickelInPen = 5;
        final int pennieInPen = 1;
        
        //a place holder for each denomination
        int tens;
        int fives;
        int twos;
        int ones;
        int quarters;
        int dimes;
        int nickels;
        int pennies;
        
        //remainder that changes after each calculation
        int remainder;
        
        //input the money, store in remainder.
        Scanner scan = new Scanner(System.in);        
        System.out.println("How much money do you have in total?");
        remainder = (int) (scan.nextDouble() * oneInPen);
        scan.close();
        
        //calculate how many tens there are, and remove them from remainder
        tens = remainder / tenInPen;
        remainder = remainder % tenInPen;        
        //fives
        fives = remainder / fiveInPen;
        remainder = remainder % fiveInPen;        
        //twos
        twos = remainder / twoInPen;
        remainder = remainder % twoInPen;        
        //ones
        ones = remainder / oneInPen;
        remainder = remainder % oneInPen;        
        //quarters
        quarters = remainder / quarterInPen;
        remainder = remainder % quarterInPen;        
        //dimes
        dimes = remainder / dimeInPen;
        remainder = remainder % dimeInPen;
        //nickels
        nickels = remainder / nickelInPen;
        remainder = remainder % nickelInPen;
        //pennies
        pennies = remainder / pennieInPen;
        remainder = remainder % pennieInPen;
        
        //print the results
        System.out.println(tens + " ten dollar bills");
        System.out.println(fives + " five dollar bills");
        System.out.println(twos + " two dollar coins");
        System.out.println(ones + " one dollar coins");
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickles");
        System.out.println(pennies + " pennies");
      
        System.out.println("Question one was called and ran sucessfully.");
    }

};
