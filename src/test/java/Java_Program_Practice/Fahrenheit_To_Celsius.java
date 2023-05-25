package Java_Program_Practice;

import java.util.Scanner;

public class Fahrenheit_To_Celsius {
	
	public static void main(String[] args) {
		
		float temperatue;
		
		Scanner in = new Scanner(System.in);

		System.out.println("Enter temperatue in Fahrenheit"); 
		
		temperatue = in.nextInt();

		temperatue = ((temperatue - 32)*5)/9;

		System.out.println("Temperatue in Celsius = " + temperatue);
}

}
