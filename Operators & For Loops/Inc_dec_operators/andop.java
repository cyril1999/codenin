

import java.util.Scanner;

public class andop {

	public static void main(String[] args) {
		
		
Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int primeNumber = 1;
		
		if(n==2)
		{
			System.out.println("2");
		}
		else 
		{
		System.out.println("2");
		
		for (primeNumber = 3; primeNumber <= n ; primeNumber+=2)
		
		{
			
			int halfOfn = primeNumber/2;
			
			for (int i = 1; i <= halfOfn ; i=i+2) {
				
				
				if(primeNumber%i==0 && i!=1)
					
				{
					break;
				}
				else
				{
					System.out.println(primeNumber);
					break;
				}
				
			}
		}
		}

	//	System.out.println(answer);
		sc.close();
		
		
		
	}

}
