package OOPS.com.encapsulation;

public class BankManagement {
	private int AccountNumber;
	private String AccountHolderName;
	private int AccountBalance;
	public void setAccountNumber(int AccountNumber)
	{
		this.AccountNumber=AccountNumber;
	}

	public int getAccountNumber()
	{
		return AccountNumber;
	}
	public String getAccountHolderName()
	{
		return AccountHolderName;
	}
	public void setAccountHolderName(String AccountHolderName)
	{
		this.AccountHolderName=AccountHolderName;
	}
	public int getAccountBalance()
	{
		return AccountBalance;
	}
	public void setAccountBalance(int AccountBalance)
	{
		this.AccountBalance=AccountBalance;
	}
	@Override
	public String toString()
	{
		return "EmployeeAccountNumber:-"+getAccountNumber()+"\nAccountHolderName:-"+getAccountHolderName()+"\nAccountBalance:-"+getAccountBalance();
	}

}
