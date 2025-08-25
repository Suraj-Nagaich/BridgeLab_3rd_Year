package String;
import java.util.*;
public class Non_Repeated_Character {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter string");
		String s = sc.next();
		HashMap<Character, Integer> map = new HashMap<>();
		for(char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for(char c : s.toCharArray()) {
			if(map.get(c)==1) {
				System.out.print(c);
				break;
			}

	}

}
}
