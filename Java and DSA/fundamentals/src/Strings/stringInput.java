package Strings;
import java.util.Scanner;
public class stringInput {

	public static void main(String[] args) {
		// Taking string input
		//ip:ab de ghi jk 
		//   13
		
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		System.out.println(str1 + " " + str1.length());
		//op: ab 2 accepts first token because space is delimiter
		String str2 = sc.next();
		System.out.println(str2 + " " + str2.length());
		//op: de 2 accepts second token because space is delimiter
		String str3 = sc.nextLine();
		System.out.println(str3 + " " + str3.length());
		//op:  ghi jk  8 accepts "ghi jk" token because new line is delimiter
		int i = sc.nextInt();
		System.out.println(i);
		//op: 13 accepts 13 as token because space is delimiter and converts token
		//to integer
		String str4 = sc.nextLine();
		System.out.println(str4 + " " + str4.length());
		//op: 0 No input after 13 therefore length of token is 0
	}

}
