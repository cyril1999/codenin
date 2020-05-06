package fundamentals;

public class Arithmetic_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 3;
		int c = a*b;
		int d = a%b;
		int e = 10/3;
//		long f = 1.0/3;
// will give error since quotient which is
// a double will not be casted into integer
// if at least one operator is floating point
// quotient needs to be stored in double
//		System.out.println(f);
//division operator will only give you 
//integer  if both operators are integers

int f = 3*2/5;
System.out.println(f);

// if multiple operators are of same precedence then 
// evaluation is done from left to right
int g = 3*(2/5);
// expression inside parentheses will get done first

double h = 3/3;
System.out.println(h);
		
		
	}

}
