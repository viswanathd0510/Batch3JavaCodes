package day27_EnumConstructor;

public class Child extends Parent {
	
	// Implicit : Extending the parent class and calling the constructor
	
	/// Explicit : Super() Method which will call the parent constructor
	
	
	public Child()
	{
		super();
		System.out.println("Child Class Contructor is Called");
	}

}
