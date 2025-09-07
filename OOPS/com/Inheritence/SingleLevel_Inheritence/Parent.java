package OOPS.com.Inheritence.SingleLevel_Inheritence;

public class Parent {
	Parent()
	{
		System.out.println("Hii parent constructor");
	}
	Parent(int a)
	{
		this();
		System.out.println(a);
	}
     public void add(int a, int b)
     {
    	 System.out.println(a+b);    
    	 }
}
