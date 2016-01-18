package q3;

import java.util.Scanner;

/**
 * <p>Take two floating point numbers from the user, and calculate their
 * sum, difference, quotient and product, and then print them out.</p>
 *
 * @author Deric
 * @version 1.0
 */
public class Arithemtic {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        // your code will go here!!!
        
        //variables
        double firstNumber;
        double secondNumber;
        double sum;
        double difference;
        double quotient;
        double product;
        
        //input first number
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the first number?");
        firstNumber = scan.nextDouble();
        
        //input second number      
        System.out.println("What is the second number?");
        secondNumber = scan.nextDouble();
        scan.close(); 
        //calculate sum, difference, quotient, product
        sum = firstNumber + secondNumber;
        difference = firstNumber - secondNumber;
        quotient = firstNumber / secondNumber;
        product = firstNumber * secondNumber;
        
        //print results
        System.out.println("Sum = " + sum);
        System.out.println("difference = " + difference);
        System.out.println("quotent = " + quotient);
        System.out.println("product = " + product);
        
        System.out.println("Question three was called and ran sucessfully.");
    }

};
