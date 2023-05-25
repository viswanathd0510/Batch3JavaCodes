package day25_FinalandFinally;

public class FFF1 {
	
	public static void main(String[] args) {
		
		FFF  n = new FFF () ;
		
		// Either data type or methods cannot be overridern 
		// n.a = 15 ;
		n.b = 17 ;
		
		
		// Finalize will be using garbage collector to discard the unused datas 
		// and null values to free up the memories 
		
		// Grabage Collectors 
		
		System.gc();
	}
}
