package fundamentals;

import java.util.Scanner;

public class nthfibionacii {

	public static void main(String[] args) 
	
	{
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int answer = 0;
		
		for (int i = 1,a=1,b=1; i < n-1 ; i++)
		
		{
			answer = a + b;
			a=b;
			b=answer;
		}

		System.out.println(answer);
		sc.close();
		
	
	}

}
