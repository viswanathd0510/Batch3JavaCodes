package day16_Encapsulation;

public class MatriculationSchool {

	public static void main(String[] args) {
		
		Boardofschools bos = new Boardofschools();
		
		bos.setTimings("9 to 5");
		bos.setLeaves("We will follow the leaves policy as per board rules");
		bos.setDresscode("We will follow the dresscode as per board rules ");
		
		System.out.println(bos.getTimings());
		System.out.println(bos.getLeaves());
		System.out.println(bos.getDresscode());
	}
}
