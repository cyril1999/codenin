package Strings;
import java.util.Scanner;

public class reversestringWordwise {
	public static String reverseWordWise(String input) 
	{
	String answ = "";
	int i = 0;
	int currentWordstart = 0;
	
		for (; i <= input.length()-1; i++) 
		{	
			if(input.charAt(i)==' ') 
			{
				int currentWordend = i-1;
				String word = "";
			
				word = input.substring(currentWordstart, currentWordend+1);
				answ =" " + word + answ;
				currentWordstart = i+1;
			}
			
			
		}
		
			int currentWordend = i-1;
			String word = "";
			word = input.substring(currentWordstart, currentWordend+1);
			answ =" " + word + answ;
		
			answ = word + answ;

	return answ;
	}
	
	public static void main(String[] args) 
	
	{
		
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(reverseWordWise(input));
	}

}
