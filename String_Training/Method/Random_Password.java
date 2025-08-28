package String_Training.Method;
import java.util.*;
public class Random_Password {

	public static void main(String[] args) {
		for(int i=0;i<8;i++)
		{
			System.out.print((char)(int)(Math.random()*100));
		}

	}

}
