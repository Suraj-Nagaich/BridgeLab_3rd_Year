package java_control_flows.Level1;
import java.util.*;
public class Print_Table {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(n*i);
		}
		n++;
	}

}
