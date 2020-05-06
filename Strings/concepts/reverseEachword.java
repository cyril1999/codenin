package concepts;
import java.util.Scanner;

public class reverseEachword {
	
public static String reverseWord(String str)
	
	{
	
	String answ = "";
	int i = 0;
	int currentWordstart = 0;
	
		for (; i <= str.length()-1; i++) 
		{	
			if(str.charAt(i)==' ') 
			{
				int currentWordend = i-1;
				String reverseword = "";
					for (int j = currentWordstart; j <= currentWordend ; j++) 
					{
			
				reverseword = str.charAt(j) + reverseword;
					}
				answ = answ + reverseword + " ";
				currentWordstart = i+1;
			}
			
			
		}
		
			int currentWordend = i-1;
			String reverseword = "";
			for (int j = currentWordstart; j <= currentWordend ; j++) 
		{
		
			reverseword = str.charAt(j) + reverseword;
		}
			answ = answ + reverseword + " ";
			
int max = Integer.MIN_VALUE;
			return answ;

	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(reverseWord(str));


	}

}
