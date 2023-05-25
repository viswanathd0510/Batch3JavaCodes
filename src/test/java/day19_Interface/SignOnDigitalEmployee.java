package day19_Interface;

public class SignOnDigitalEmployee implements OfficeRules,CafeteriaRules {
	
	public void productsafety() {
		System.out.println("Approving Product Safety Points");
		
	}

	public void silence() {
		System.out.println("Approving Silence");
		
	}

	public void firesafety() {
		System.out.println("Approving Firesafety");
		
	}

	public void wearmask() {
		System.out.println("Approved to wear mask");
		
	}

	public void officetimings() {
		System.out.println("Approved to work on the given officetiming");
		
	}

	public void cabtimings() {
		System.out.println("Approved to adhere cabtiming");
		
	}

	public void dresscode() {
		System.out.println("Approvd to formals as per company policy");
		
	}

	public void dataconfidentaility() {
		System.out.println("Approved to mainatain data confiedentaility");
		
	}


}
