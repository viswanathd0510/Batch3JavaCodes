package day14;

public class MethodOverloading {
	
    public void employee_info() {

  	  System.out.println("*****Employee_Information*****");
}
  public void employee_Info (String employeename) {
 System.out.println("Employee_Name: " + " "+ employeename);
 }
  
  public void employee_Info1 (int id) {
System.out.println("Employee_Id:" +" " +  id);
	}
  
 public void employee_Info2 (String designation) {
System.out.println("Employee_Designation:" + " "+designation);
}

 
  public static void main(String[] args) {
      MethodOverloading ref = new MethodOverloading();

      ref.employee_info();
      ref.employee_Info("Viswanath" +" "+ "Dharmalingam" );
      ref.employee_Info1(135289);
    ref.employee_Info2("Team Leader");
     System.out.println('\n');
     ref.employee_info();
     ref.employee_Info("Shree"+ " " + "Harina");
     ref.employee_Info1(145268);
     ref.employee_Info2("Team Leader");
      System.out.println('\n');
      ref.employee_info();
      ref.employee_Info("Vidhya"+ " " +"Viswanath");
      ref.employee_Info1(145789);
      ref.employee_Info2("Team Leader");
      System.out.println('\n');
      ref.employee_info();
      ref.employee_Info("Sivanya"+" " +"Viswanath");
      ref.employee_Info1(145789);
     ref.employee_Info2("Team Leader");
     System.out.println('\n'); 
     ref.employee_info();
     ref.employee_Info("Nithika"+" "+"Veerappan");
     ref.employee_Info1(178954);
     ref.employee_Info2("Team Leader");

  }
  
}

