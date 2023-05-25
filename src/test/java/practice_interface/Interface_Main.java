package practice_interface;

public class Interface_Main implements Interface_Demo, Interface_Demo1{

	public void home() {
		System.out.println("IDBI Bank Home Loan Interest");
	}
	
	public void homeloan(float f) {
		System.out.println("8%");	
	}
	
	public void car() {
		System.out.println("IDBI Bank Car Loan Interest");	
	}
	
	public void carloan(float f) {
		System.out.println("8.46%");
	}
	
	public void homeloanEMI() {
		System.out.println("Home Loan EMI Percentage Between");
	}
	
	public void homeloanEMIpercentage(float f) {
		System.out.println("30 to 40%");
	}
	
	public void carloanEMI() {
		System.out.println("Car Loan EMI Percentage Between");	
	}
	
	public void carloanEMIpercentage(float f) {	
		System.out.println("10 to 15%");
	}	
}
