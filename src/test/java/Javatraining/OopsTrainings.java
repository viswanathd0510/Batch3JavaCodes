package Javatraining;

public class OopsTrainings {

	public void addition()
	{
		int x = 5 ;
		int y = 10 ;
		int z = x+y ;
		System.out.println(z);
	}		
	public void subraction() {
		int x1 = 10;
		int y1 = 5;
		int z1 = x1-y1;
		System.out.println(z1);
	}
	public void multiplication() {
		int x2 = 10;
		int y2 = 5;
		int z2 = x2*y2;
		System.out.println(z2);		
	}
	public void dividion() {
		int x3 = 10;
		int y3 = 5;
		int z3 = x3/y3;
		System.out.println(z3);
	}	
	public void percent() {
		int x4 = 10;
		int y4 = 5;
		int z4 = x4%y4;
		System.out.println(z4);
	}
		public void notequalto() {
			int x5 = 10;
			int y5 = 5;
		System.out.println(x5!=y5);
	} 		
		public void equalto() {
			int x6 = 10;
			int y6 = 5;
			System.out.println(x6==y6);
		}
	
	public static void main(String[] args) {
		
		OopsTrainings x = new OopsTrainings();
		x.addition();
		
		OopsTrainings x1 = new OopsTrainings();
		x1.subraction();
		
		OopsTrainings x2 = new OopsTrainings();
		x2.multiplication();
		
		OopsTrainings x3 = new OopsTrainings();
		x3.dividion();
		
		OopsTrainings x4 = new OopsTrainings();
		x4.percent();
		
		OopsTrainings x5 = new OopsTrainings();
		x5.notequalto();
		
		OopsTrainings x6 = new OopsTrainings();
		x6.equalto();
		
	}
}
		
		


