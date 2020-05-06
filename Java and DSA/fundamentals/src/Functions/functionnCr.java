package Functions;

import java.util.Scanner;

public class functionnCr {
	
	// int is the return type
	public static int factorial(int n)
	
	{
		int factN = 1;
		for (int i = 1; i <= n; i++) {
			
			factN = factN * i;
			
		}
		return factN;
	}
public static int nCr(int n, int r)
	
	{
	int factN = factorial(n);//local variables local to nCr
	//factorial function is called by nCr multiple times and returns final value
	int factR = factorial(r);
	int factNR = factorial(n-r);
//shorter code than nCr snippet and we just need to make changes in the template

	int result = factN/(factNR*factR);
	return result;

	
	}

	
	
	public static void main(String[] args) 
	
	{
		//this is how we call the function to calculate factorial
		//to get the end result
Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int r = sc.nextInt();
		
		int factN = factorial(n);
		int factR = factorial(r);
		int factNR = factorial(n-r);
//shorter code than nCr snippet and we just need to make changes in the template

		int result = factN/(factNR*factR);
//direct calculation of nCr by using function
		result  = nCr(n, r);
		System.out.println(result);
		
	}

}
