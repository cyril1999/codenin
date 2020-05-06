package Functions;

public class DivideNumbers {

public static int divideNumbers(int num,int deno) {
	//corner case
	if(deno==0)
	{
		return Integer.MIN_VALUE;
	}
	
	return num/deno;
	
}	
//void needs to be specified
public static void divisionResult(int num,int deno) {
	//corner case
	if(deno==0)
	{
		//exits function without returning anything
		//because it's a void function
		System.out.println("cannot divide by zero");
		return ;
	}
	System.out.println(num/deno);
	
	
	
}	
	public static void main(String[] args) {
		
		int num=8, deno=0;
		int result = divideNumbers(num, deno);
		System.out.println(result);
		//This code can fail when denominator==0
		
		divisionResult(num, deno);
		//Printing a result and returning a value is different
		//if you want to see result on console then you have to print
		// if you only have to use the value you have to return using the function

	}

}
