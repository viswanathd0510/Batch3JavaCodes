package day27_EnumConstructor;

public class Working {

	public static void main(String[] args) {

		for(Daysoftheweek d : Daysoftheweek.values())
		{
			System.out.println("The days are " +d);
		}

	}

}
