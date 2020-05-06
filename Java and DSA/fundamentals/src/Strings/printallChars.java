package Strings;
import java.util.Scanner;
public class printallChars {

	public static void printChars(String str) {
		
for (int i = 0; i < str.length(); i++) {
			
			System.out.println(str.charAt(i));
		}

	}
	
	public static void main(String[] args) 
	
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		printChars(str);
		
//		ip: Hello Sachin
//		op:
//		H
//		e
//		l
//		l
//		o
//		 
//		S
//		a
//		c
//		h
//		i
//		n
	}

}
