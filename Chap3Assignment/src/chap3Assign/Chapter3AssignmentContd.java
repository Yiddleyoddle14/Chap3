package chap3Assign;
import java.util.Scanner;
/*
 * Ailsa Mensinger
 * 9-28-18
 */

public class Chapter3AssignmentContd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("5. Enter in the starting velocity in meters per second");
		double startingVelocity = input.nextDouble();
		System.out.println("Enter ending velocity in meters per second");
		double endingVelocity = input.nextDouble();
		System.out.println("Enter the time span in seconds");
		double seconds = input.nextDouble();
		double averageAcceleration = (endingVelocity - startingVelocity) /seconds;
		System.out.println("Average acceleration: " +averageAcceleration);
		 
		System.out.println(); 
		
		System.out.println("6. Enter the amount of water in kilograms");
		double kilograms = input.nextDouble();
		System.out.println("Enter the initial temperature of the water in degrees Celsius");
		double initialTemp = input.nextDouble();
		System.out.println("Enter the final temperature of the water in degrees Celsius");
		double finalTemp = input.nextDouble();
		double energy = kilograms*(finalTemp - initialTemp) * 4184;
		System.out.println("The energy needed to heat up the water is " +energy+ " joules");
		
		

	}

}
