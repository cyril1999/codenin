package Functions;

public class FunctionOverloading {

	public static double sum(double a, int b) {
		
		double result =a+b;
		return result;
		
	}
	
public static double sum(int a, double b) {
		
		double result =a+b;
		return result;
		
	}

	
	
	public static void main(String[] args) {

		//same function name but different mode of operations depending on the number
		//of parameters entered by the user
		// this ability is called function overloading
		System.out.println(sum(10.0,9));
		System.out.println(sum(10,9.0));

	}

}
