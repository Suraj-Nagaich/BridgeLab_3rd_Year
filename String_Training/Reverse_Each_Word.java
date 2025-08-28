package String_Training;
import java.util.*;
public class Reverse_Each_Word {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("enter a string");
		  String s =("  hii suraj this side");
	        String result = "";
	        String word = "";
	        for (int i = 0; i < s.length(); i++) {
	            char ch = s.charAt(i);
	            if (ch != ' ') {
	                word = word + ch;
	            } else {
	                for (int j = word.length() - 1; j >= 0; j--) {
	                    result = result + word.charAt(j);
	                }
	                result = result + " "; 
	                word = ""; 
	            }
	        }
	        for (int j = word.length() - 1; j >= 0; j--) {
	            result = result + word.charAt(j);
	        }
	        System.out.println(result);
	}

}
