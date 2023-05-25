package cars;

public class Working {

	public static void main(String[] args) {
		
		TataTiago t = new TataTiago();
		
		t.airbags();
		t.brakes();
		t.engine();
	    t.headlights();
		t.steering();
		t.tyrepressuremonitoring();
		t.followmehomelamp();
				
		System.out.println("***************************");
		
		Innovo n = new Innovo();
		
		n.childsafetylocks();
		n.doorajarwarning();

	}

}
