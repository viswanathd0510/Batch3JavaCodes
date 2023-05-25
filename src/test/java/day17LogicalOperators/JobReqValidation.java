package day17LogicalOperators;

import java.util.Scanner;

public class JobReqValidation extends Working {
	
	public boolean validate() {
		int age = 18;
		int given_age;
		String first_name;
		String middle_name;
		String last_name;
		String qualification1 = "BE";
		String qualification2 = "BTech";
		String given_qualification;
		String nationality = "Indian";
		String given_nationality;
		Scanner scan_input = new Scanner(System.in);
		System.out.println("Enter First Name:");
		first_name = scan_input.next();
		System.out.println("Enter Middle Name:");
		middle_name = scan_input.next();
		System.out.println("Enter Last Name:");
		last_name = scan_input.next();
		System.out.println("Enter age: ");
		given_age = scan_input.nextInt();
		System.out.println("Enter Qualification: ");
		given_qualification = scan_input.next();
		System.out.println("Enter Nationality: ");
		given_nationality = scan_input.next();
		scan_input.close();
	if (first_name.length() <= 7 && middle_name.length() <= 7 && last_name.length() <= 7) {
			if (age <= given_age && nationality.equalsIgnoreCase(given_nationality)
					&& (qualification1.equalsIgnoreCase(given_qualification)
							|| qualification2.equalsIgnoreCase(given_qualification))) {
				return true;
			} 	
		else
			{
				return false;
			}
			
		} 
		else
		{
			System.out.println("Name Validation Unsuccessful...");
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner scan_input = new Scanner(System.in);
		JobReqValidation jv = new JobReqValidation();
		System.out.println("Enter Aadhar No: ");
		String aadhar = scan_input.next();
		System.out.println("Enter PAN No: ");
		String pan = scan_input.next();
		boolean validation = jv.validate();
		if (validation == true && aadhar.equals(jv.getAadhar_no()) && pan.equals(jv.getPan_no())) {
			System.out.println("Validation Successful");
		} else {
			System.out.println("Validation Failed");
		}
		scan_input.close();
	}

	}
