package Functions;

public class checkPrime {
	
	
	public static boolean checkPrime(int n)
	{
		int div=2;
	boolean isPrime = true;
	
	while(div<=n/2)
	{
		if(n%2==0)
		{
			isPrime = false;
			return isPrime;
		}
		div++;
	}
	return isPrime;
	}

	public static void main(String[] args) {
		
		boolean isPrime = checkPrime(47);
if (isPrime) {
	
	System.out.println("Prime");
	
} else {
System.out.println("Composite");
}
	}

}
