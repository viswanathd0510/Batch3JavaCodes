package day18_Abstraction;

public class CafeteriaRules extends OfficeRules {
	
	public void maintainsilence()
	{
		System.out.println("Signing for  Maintain");
	}

	public void timings() {
		System.out.println("Signing for 9 to 6");	
	}

	public void dresscode() {
		
		System.out.println("Signing for Mainatain proper dress code");
		
	}
	
	public void confidentialityofofficedatas() {
		
		System.out.println(" Signing for Mainatain proper datas confidential");
	}


}
