package chap3Assign;
import java.util.Scanner;
/*
 * Ailsa Mensinger
 * 9-28-18
 */

public class Chapter3Assignment {

	private static final double PI = 0;

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("1. Enter the temperature in degrees celsius."); 
		double celsius = input.nextDouble();
		double fahrenheit = (9.0/5)*celsius + 32;
		System.out.println("Temperature: " + fahrenheit + " degrees fahrenheit"); 
		
		System.out.println();
		
		System.out.println("2. Enter the radius of a cylinder");
		double radius = input.nextDouble();
		System.out.println("Enter the length of a cylinder");
		double length = input.nextDouble();
		double PI = 3.14159265;
		double area = radius*radius*PI; 
		double volume = area*length;
		System.out.println("The area of the cylinder is: " +area);
		System.out.println("The volume of the cylinder is: " +volume);
		
		System.out.println();
		
		System.out.println("3. Enter the number of feet");
		double feet = input.nextDouble();
		double meters = feet*.305;
		System.out.println("Length: " +meters+ " meters");
		
		System.out.println();
		
		System.out.println("4. Enter the number of pounds");
		double pounds = input.nextDouble();
		double kilograms = pounds*.454;
		System.out.println("Weight: " +kilograms+ " kilograms");
		
		
		
		
		

	}

}
