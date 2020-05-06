package Strings;


import java.util.Scanner;

public class compressString {

	public static String compress(String inputString) {
		
		
	String output="";
	int i = 1, j=0;
	int count =1;
	int flag=0;
	char temp=' ';
	
		for (; i <= inputString.length()-1; i++,j++) 
		{	
			
			temp = inputString.charAt(j);
			
			if(inputString.charAt(i)==temp) 
			
			{
				flag=1;
				count++;
				
			}
			else if (count>1)
			{
				output = output + temp + Integer.toString(count); 
				count = 1;
				flag=0;
				j=i-1;
			}
			else
			
			{
				flag=0;
				output = output + temp;
				j=i-1;
	
			}
		}
		
		if (flag==1) 
		{
				if (count>1) 
				{
					output = output + temp + Integer.toString(count);
				} 
				else 
				{
					output = output + temp;
				}
		} 
		else 
		{
			output = output + inputString.charAt(i-1);
		}
		
		return output;

	}
	
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(compress(input));
	}

}
