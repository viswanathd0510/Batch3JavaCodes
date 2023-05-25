package day19_Interface;

public interface OfficeRules {

	// Interface - To achieve Multiple Inheriatnce 
	// What is multiple inheritance ??
			//  Child class can have two parent class properties 
// 100 % Abstraction can also be achevied 
// Here if you are not abstract keyword also interface will consider
		// it as abstarct 
// What ever variable value and varible name ur declaring it is always final in nature	
//  You cannot create object for interface 
// Interface it will not allow you to create implemenattion 

public void officetimings();
public void cabtimings() ;
public void dresscode();
public void dataconfidentaility();
int a = 10 ; // it is final in nature we cannot override it 

}
