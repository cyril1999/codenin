package Functions;

public class FunctionCalling {

	//variables a nad b created when sum is called is created ad is separate from main
	//variables inside main funnction and are destroyed after value is returned
//	public static int sum(int a, int b) {
//		
//		int result = a+b;
//		return result;
//		
//	}
	public static void increment(int n) {
		n++;
		
	}
	public static int incrementwithreturn(int n) {
		n++;
		return n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int a=10, b=5;
//		int result= sum(a,b);
//		//resumes execution aafter sum returns value and is at the top of stack
		
		int n =10;
		increment(n);
		n=incrementwithreturn(n);
		//how to increment the value of local variable inside main
		//if caller wants to pass info, only through arguments
		//calle can return value to caller
		
		System.out.println(n);
		
		
		
	}

}
