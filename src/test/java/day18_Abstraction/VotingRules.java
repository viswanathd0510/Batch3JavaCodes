package day18_Abstraction;

import java.util.Scanner;

public class VotingRules extends VotingValidation {

	public void aadharno() {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Aadhar No");
		int a = s.nextInt();
	}

	@Override
	public void panno() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Pan No");
		int b = s.nextInt();
	}

	@Override
	public void age() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Age");
		int c = s.nextInt();		
	}

	@Override
	public void nationality() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Nationality");
		String d = s.next();
	}
}
