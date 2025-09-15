package BankManagement;

public class User {
	private String Username;
	private int age;
	private long adharnumber;
	private String address;
	
	public void setUsername(String Username)
	{
		this.Username=Username;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public void setadharnumber(long adharnumber)
	{
		this.adharnumber=adharnumber;
	}
	public void setadress(String adress)
	{
		this.address=address;
	}
	public String getUsername()
	{
		return Username;
	}
	public int getage()
	{
		return age;
	}
	public long getadharnumber()
	{
		return adharnumber;
	}
	public String getaddress()
	{
		return address;
	}
	@Override
	public String toString() {
		return "User name : " + getUsername() + "Age: " + getage() + "Adhar number: " + getadharnumber()+ "address" + getaddress();
	}
	

}
