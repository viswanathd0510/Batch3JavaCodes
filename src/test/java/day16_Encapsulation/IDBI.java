package day16_Encapsulation;

public class IDBI {
	
	public static void main(String[] args) {
		
		
		RBI main = new RBI();
		
		main.setAadharno("567465147231");
		main.setAddress("No:74/61A, Aasari Street, B.Mettur");
		main.setPanno("APCPV9141C");
		main.setBalance(20000);
		
		System.out.println(main.getAadharno());
		System.out.println(main.getAddress());
		System.out.println(main.getBalance());
		System.out.println(main.getPanno());

	}
}
