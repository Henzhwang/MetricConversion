/*
 * @Henry Huang
 * MetricConversion.java
 * March 21, 2019
 * This program is designed to convert the user input in their requested conversion way,
 * and display it.
 */
package metricconversion;

/**
 *
 * @author HenryHwang
 */

import java.util.*;
public class MetricConversion {

    /**
     * @param args the command line arguments
     */
    
    /**
     * Convert the user input from inches to centimeters and return the new value
     * @param inches
     * @return the value of centimeters after conversion from inches
     */
    public static double inchesToCentimeters(double inches)
    {
        double cent;
        cent = inches * 2.54;
        return cent;
    }
    
    /**
     * Convert the user input from feet to centimeters and return the new value
     * @param feet
     * @return the value of centimeters after conversion from feet
     */
    public static double feetToCentimeters(double feet)
    {
        double cent = feet * 30;
        return cent;
    }
    
    /**
     * Convert the user input from yards to meters and return the new value
     * @param yard
     * @return the value of meters after conversion from yards
     */
    public static double yardsToMeters(double yard)
    {
        double meter = yard * 0.91;
        return meter;
    }
    
    /**
     * Convert the user input from miles to kilometers and return the new value
     * @param miles
     * @return the value of kilometers after conversion from miles
     */
    public static double milesToKilometers(double miles)
    {
        double kilo = miles * 1.6;
        return kilo;
    }
    
    /**
     * Convert the user input from centimeters to inches and return the new value
     * @param cent
     * @return the value of inches after conversion from centimeters
     */
    public static double centimetersToInches(double cent)
    {
        double inches = cent / 2.54;
        return inches;
    }
    
    /**
     * Convert the user input from centimeters to feet and return the new value
     * @param cent
     * @return the value of feet after conversion from centimeters
     */
    public static double centimetersToFeet(double cent)
    {
        double feet = cent / 30;
        return feet;
    }
    
    /**
     * Convert the user input from meters to yards and return the new value
     * @param meter
     * @return the value of yards after conversion from meters
     */
    public static double metersToYards(double meter)
    {
        double yard = meter / 0.91;
        return yard; 
    }
    
    /**
     * Convert the user input from kilometers to miles and return the new value
     * @param kilo
     * @return 
     */
    public static double kilometersToMiles(double kilo)
    {
        double mile = kilo / 1.6;
        return kilo;
    }
    
    public static void main(String[] args) {
        //Creat a scanner object
        Scanner input = new Scanner(System.in);
        
        //Ask user for input
        System.out.println("Enter a number: ");
        //Declare variable and read user input
        double num = input.nextInt();
        
        //List choices for user to choose from
        System.out.println("\nConvert:\n1.Inches to Centimeters\n2.Feet to Centimeters"
                + "\n3.Yards to Meters\n4.Miles to Kilometers\n5.Centimerters to In ches"
                + "\n6.Centimeters to Feet\n7.Meters to Yards\n8.Kilometers to Miles\n");
        
        //Ask user for input
        System.out.println("Enter Your Choice:");
        //Declare variable and read user input
        int cho = input.nextInt();
        
        //Declare variables for further use in determine method to use
        String fir = null, sec = null;
        double fin = 0;
        
        //read user input to determine which conversiio method should be used
        if (cho == 1)
        {
            fin = inchesToCentimeters(num);
            fir = "inches";
            sec = "centimeters";
        }
        else if (cho == 2)
        {
            fin = feetToCentimeters(num);
            fir = "feet";
            sec = "centimeters";
        }
        else if (cho == 3)
        {
            fin = yardsToMeters(num);
            fir = "yards";
            sec = "meters";
        }
        else if (cho == 4)
        {
            fin = milesToKilometers(num);
            fir = "miles";
            sec = "kilometers";
        }
        else if (cho == 5)
        {
            fin = centimetersToInches(num);
            fir = "centimeters";
            sec = "inches";
        }
        else if(cho == 6)
        {
            fin = centimetersToFeet(num);
            fir = "centimeters";
            sec = "feet";
        }
        else if (cho == 7)
        {
            fin = metersToYards(num);
            fir = "meters";
            sec = "yards";
        }
        else if (cho == 8)
        {
            fin = kilometersToMiles(num);
            fir = "kilometers";
            sec = "miles";
        }
        
        //Display the new value to user
        System.out.println("\n" + num + " " + fir + " equals " + Math.round(fin) + " " + sec);
        //Close the input source
        input.close();
    }
    
}
