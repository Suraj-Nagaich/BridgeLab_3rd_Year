package OOPS.com.encapsulation;

public class BankManagementService {
	private BankManagement p1;
    private BankManagement p2;
	private BankManagement p3;
	private BankManagement p4;
	private BankManagement p5;
	private BankManagement p6;
	 
	public void setEmployeeDetails()
	{
	    p1=new BankManagement();
		p1.setAccountNumber(23586);
		p1.setAccountHolderName("Suraj");
		p1.setAccountBalance(2000);
		
		p2=new BankManagement();
		p2.setAccountNumber(2358678);
		p2.setAccountHolderName("Raja");
		p2.setAccountBalance(20000);
		
		p3=new BankManagement();
		p3.setAccountNumber(23586);
		p3.setAccountHolderName("Suraj");
		p3.setAccountBalance(2000);
		
		p4=new BankManagement();
		p4.setAccountNumber(2358456);
		p4.setAccountHolderName("Saksham");
		p4.setAccountBalance(20004);
		
		p5=new BankManagement();
		p5.setAccountNumber(2358786);
		p5.setAccountHolderName("Krishna");
		p5.setAccountBalance(200450);
		
		p6=new BankManagement();
		p6.setAccountNumber(2334586);
		p6.setAccountHolderName("Mohit");
		p6.setAccountBalance(200067);
		
	}
	public void displayEmployeeDetails()
	{
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
	}


}
