package Strings;
import java.util.Scanner;
public class reverseAstring {

	public static String reversestring(String str) {
		String reverse = "";
	/*	
		for (int i = str.length()-1; i >=0; i--) {
			reverse+=str.charAt(i);
			
		}
		*/
		for (int i = 0; i <str.length(); i++) {
			reverse=str.charAt(i)+reverse;
			
		}
		return reverse;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(reversestring(str));
		

	}

}
