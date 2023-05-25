package day16_Encapsulation;

public class RBI {
	
	// Encapsulation - Binding your code and data together in a single entity
	// Hiding the implementation parts
	// Highly secured 
	// Encapsulation can be achieved by setting up your data type access modifier as private 
	 // we can access private methods using getters and setters methods 
	

	private String aadharno ;
	
	private String panno ; 
	
	private int Balance ;
	
	private String address ;
	
	
	
	public String getAadharno() {
		return aadharno;
	}

	public void setAadharno(String aadharno) {
		this.aadharno = aadharno;
	}

	public String getPanno() {
		return panno;
	}

	public void setPanno(String panno) {
		this.panno = panno;
	}
	
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	public int getBalance() {
		return Balance;
	}

	public void setBalance(int balance) {
		Balance = balance;
	}


}
