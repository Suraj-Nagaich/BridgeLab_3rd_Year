package OOPS.com.encapsulation;

public class BankMain {

	public static void main(String[] args) {
		BankManagementService service=new BankManagementService();
		service.setEmployeeDetails();
		service.displayEmployeeDetails();

	}

}
