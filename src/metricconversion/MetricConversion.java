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
        double cent = inches * 2.54;
        System.out.println("\n" + inches + " inches equals " + Math.round(cent*100)/100D + " centimeters.");
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
        System.out.println("\n" + feet + " feet equals " + Math.round(cent*100)/100d + " centimeters.");
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
        System.out.println("\n" + yard + " yards equals " + Math.round(meter*100)/100D + " meters.");
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
        System.out.println("\n" + miles + " miles equals " + Math.round(kilo*100)/100D + " kilometers.");
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
        System.out.println("\n" + cent + " centimeters equals " + Math.round(cent*100)/100D + " inches.");
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
        System.out.println("\n" + cent + " centimeters equals " + Math.round(feet*100)/100D + " feet.");
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
        System.out.println("\n" + meter + " meters equals " + Math.round(yard*100)/100D + " yards.");
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
        System.out.println("\n" + kilo + " kilometers equals " + Math.round(mile*100)/100D + " miles.");
        return kilo;
    }
    
    public static void main(String[] args) {
        //Creat a scanner object
        Scanner input = new Scanner(System.in);
        
        //Ask user for input
        System.out.println("Enter The Value of Length: ");
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
       
        //read user input to determine which conversiio method should be used
        if (cho == 1)
        {
            inchesToCentimeters(num);
        }
        else if (cho == 2)
        {
            feetToCentimeters(num);
        }
        else if (cho == 3)
        {
            yardsToMeters(num);
        }
        else if (cho == 4)
        {
            milesToKilometers(num);
        }
        else if (cho == 5)
        {
            centimetersToInches(num);
        }
        else if(cho == 6)
        {
            centimetersToFeet(num);
        }
        else if (cho == 7)
        {
            metersToYards(num);
        }
        else if (cho == 8)
        {
            kilometersToMiles(num);
        }
        else
        {
            System.out.println("Please Enter an Valid Number!");
        }
        
        //Close the input source
        input.close();
    }
    
}
