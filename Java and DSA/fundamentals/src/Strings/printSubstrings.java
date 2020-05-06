package Strings;
import java.util.Scanner;

public class printSubstrings {
	
	public static void printsubstrings(String str)
	
	{
		
//		for (int i = 0; i <= str.length()-1; i++) 
//		{
//			for (int j = i+1; j <= str.length(); j++) 
//			{
//					System.out.println(str.substring(i, j));
//			}
//			
//		}
		
		for (int length = 1; length <= str.length(); length++) 
		{//Printing strings with length "value of length"
			
			for (int start = 0; start <= str.length()-length; start++) 
			{
				int end = start +length;
				System.out.println(str.substring(start,end));
			}
			
		}
		

	}

	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		printsubstrings(str);

	}

}
