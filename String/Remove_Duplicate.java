package String;
import java.util.*;
public class Remove_Duplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s = sc.next();
		HashSet<Character> set = new HashSet<>();
		for(char c : s.toCharArray()) {
			set.add(c);
		}
		
		for(char c : s.toCharArray()) {
			if(set.contains(c)) {
				System.out.print(c);
			}
			set.remove(c);


	}
	}
}
