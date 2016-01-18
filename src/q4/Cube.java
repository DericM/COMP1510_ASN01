package q4;

import java.util.Scanner;


/**
 * <p>This program takes a side length from the user and uses it calculate  the 
 * surface area and volume of a cube.</p>
 *
 * @author Deric
 * @version 1.0
 */
public class Cube {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        // your code will go here!!!
        
        final int cubeSides = 6;
        
        //variables
        int side;
        int volume;
        int surfaceArea;
        
        //input side length
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the cubes side length? (Integer value)");
        side = scan.nextInt();
        scan.close(); 
        //calculate volume and surface area.
        volume = side * side * side;
        surfaceArea = side * side * cubeSides;
        
        //print results
        System.out.println("volume = " + volume);
        
        System.out.println("surfaceArea = " + surfaceArea);
    }

};
