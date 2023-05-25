package day16_Encapsulation;

public class Axis {
	
public static void main(String[] args) {
		
		
		RBI main = new RBI();
		
		main.setAadharno("567564158796");
		main.setAddress("Tamilnadu");
		main.setPanno("AAVSB7845B");
		main.setBalance(50000);
		
		System.out.println(main.getAadharno());
		System.out.println(main.getAddress());
		System.out.println(main.getBalance());
		System.out.println(main.getPanno());
	
	}


}
