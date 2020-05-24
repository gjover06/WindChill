/**
Author:George Samu
Date:5/22/2020
Description:Computes the wind-chill temperature from the 
			actual temperature and wind speed.
*/
import java.util.Scanner;

public class WindChill
{
	public static void main (String[]args)
	{
	
	//Description of program
	System.out.print("This program computes the wind-chill ");
	System.out.print("temperature from the acutal temperature ");
	System.out.print("and wind speed. \n");
	
	//get input data
	Scanner keyboard=new Scanner(System.in);
	System.out.println("Enter the temperature in degrees fahrenheit: ");
	double temperature=keyboard.nextDouble();
	System.out.println("Enter the Wind speed in miles per hour:");
	double windSpeed = keyboard.nextDouble();
	
	//compute wind chill temperature
	final double CONSTANT1=35.74,
				 CONSTANT2=0.6215,
				 CONSTANT3=35.75,
				 CONSTANT4=0.4275,
				 Exponent = 0.16;
				 
	double powerTerm= Math.pow(windSpeed, Exponent);
	double windChillTemperature= CONSTANT1 + CONSTANT2 * temperature 
								- CONSTANT3 * powerTerm
								+ CONSTANT4 * temperature * powerTerm;
	
	//Display Results
	
	System.out.println("\nThe actual temperature is " + temperature +
						"degrees Farhenheit.");
	System.out.println("The wind speed is " + windSpeed + " m.p.h.");
	System.out.println("The wind-chill temperature is " + 
						Math.round(windChillTemperature) +
						" degrees Fahrenheit.");
	
	}//end main
	}//end WindChill