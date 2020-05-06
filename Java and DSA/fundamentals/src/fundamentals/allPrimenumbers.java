package fundamentals;

import java.util.Scanner;

public class allPrimenumbers {

	public static void main(String[] args) {
		
		
Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int primeNumber = 1;
		int flag = 1;
		
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
			
			for (int i = 3; i <= halfOfn ; i=i+2) 
			{
				
				
				if(primeNumber%i==0 && i!=1)
					
				{
					flag=0;
					break;
				}
				else
				{
					flag=1;
				}
				
			}
			if(flag==1)
            {System.out.println(primeNumber);}
		}
		}

	//	System.out.println(answer);
		sc.close();
		
		
		
	}

}
