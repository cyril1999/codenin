package Functions;

public class moreoNfunctions {
   
	public static double sum(int a, int b, double c) {
		
		double sum = (int) a + b + c;
		return sum;
		
	}
	
public static void printEven(int start, int end) 

{
		if (start%2!=0) {
			
			start++;
		}
		
		for (int i = start; i <= end; i=i+2) {
			
			System.out.println(i) ;
			
		}
		}
public static double add(int a,int b)
{
    float c=a+b;
    return c;
}


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sum(1,2,2.5);//this is ok, not necessary to store returned value
		double n = sum(1,2,2.5);
		System.out.println(n);
		
// printing even numbers from specified number to specified number
		printEven(3,90);//cannot collect values from a void function
		System.out.print(add(10,3));//automatically converts float to double while returning
		

	}

}
