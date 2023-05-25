package day14;

public class MethodOverriding extends MethodOverloading {
	
	@Override
	public void employee_info() {
		
		System.out.println("***********Employee Information***********");
		
	}
	
	@Override
	public void employee_Info(String employeename) {
		super.employee_Info(employeename);
	}

	@Override
	public void employee_Info2(String designation) {
		super.employee_Info2(designation);
	}
	
	public static void main(String[] args) {
		
		MethodOverriding ref = new MethodOverriding();

		ref.employee_info();
		ref.employee_Info(" " + "Viswanath");
		ref.employee_Info2(" " + "Team Leader");
		
		ref.employee_info();
		ref.employee_Info(" " + "Harina");
		ref.employee_Info2(" " + "Team Leader");
		
		ref.employee_info();
		ref.employee_Info(" " + "Vidhya");
		ref.employee_Info2(" " + "Team Leader");
		
		ref.employee_info();
		ref.employee_Info(" " + "Sivanya");
		ref.employee_Info2(" " + "Team Leader");
		
		ref.employee_info();
		ref.employee_Info(" " + "Nithika");
		ref.employee_Info2(" " + "Team Leader");
	
	}

}
