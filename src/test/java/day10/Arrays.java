package day10;

public class Arrays {

	public static void main(String[] args) {

		String name = "Adithya" ;
		String name1 = "Barani" ;
		String name2 = "Partheban" ;
		String name3 = "Pratima" ;
		String name4 = "Sri";
		String name5 = "Viswa" ;
		
		
		System.out.println(name);
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		System.out.println(name4);
		System.out.println(name5);
		
		// Why we start to use array ??
		
		String [] names = {"Adithya","Barani","Partheban","Pratima","Sri", "Viswa"};
		
		// Enhanced for loop
		
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		System.out.println(names[4]);
		System.out.println(names[5]);
		
		System.out.println(names.length);
		
		System.out.println("**********************************");
		
		for(String p : names)
		{
			System.out.println("My Students names" +p);
		}

		
	}

}
