package q2;

import java.util.Scanner;
/**
 * <p>This program takes a number from the user representing a number of seconds
 * and converts to a format of hh:mm:ss and then prints it.</p>
 *
 * @author Deric
 * @version 1.0
 */
public class SecondsConvert {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        // your code will go here!!!
        
        //seconds in an hour, seconds in a minute.
        final int secInH = 3600;
        final int secInMin = 60;
        
        //variables
        int allSeconds;
        int hours;
        int minutes;
        int seconds;
        
        //input seconds
        Scanner scan = new Scanner(System.in);
        System.out.println("How many seconds are there?");
        allSeconds = scan.nextInt();
        
        //calculate hours, minutes, seconds
        hours = allSeconds / secInH;
        minutes = (allSeconds % secInH) / secInMin;
        seconds = (allSeconds % secInH) % secInMin;
        
        //print results
        System.out.println(hours + ":" + minutes + ":" + seconds);
        
        System.out.println("Question two was called and ran sucessfully.");
    }
};
