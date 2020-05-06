import java.util.Scanner;


public class prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		System.out.println('a' + 1);
//		
//		System.out.println(99);
//		
		Scanner s = new Scanner(System.in);
		int S = s.nextInt();
		int E = s.nextInt();
		int W = s.nextInt();
		int fahrenheit = S;
		int celsius =  0;
		
		while (fahrenheit<=E)
			{	
				celsius = (5*(fahrenheit - 32))/9; 
				System.out.println(fahrenheit + "\t" + celsius);
				fahrenheit+=W;
			}
		s.close();
//		int max = Integer.MAX_VALUE;
//		System.out.println(i);
		
//		while (i<3)
//		{
//			int a = 10; 
//			System.out.println(a);
		//i++
//		}
//		
		//For this code:
		//Would initializing and assigning a value inside a loop take up space,
		//What I mean is, does Java allocate 3 different allocations?
		//for the above code?
		//Answer: When the control enters the loop for i=1
		// a is created and initialized with value 10
		// After executing print statement inside the loop
		// It increments i and exits the curly brace to check
		// the condition again whether i is less than 3
		//By this point j has been deleted or destroyed 
		// the moment the control exited the loop to check
		// the while condition got satisfied, a got destroyed because the
		// the control went outside the curly braces thus exiting the scope 
		// of a. Whenever the control goes outside scope
		//all variables inside that scope get destroyed
		//and aren't re-initialized until it enters the scope
		// in which it was initialized 
		// thus for every iteration inside the while loop
		// the variable is created and destroyed because
		//control goes outside scope(curly braces)
		// to check condition and is created once again when
		// it enters the loop
		
		// while(condition); only checks
		// the condition and doesn't execute the code
		//thus going into infinite loop
		
		
		//Notice that i doesn't get destroyed as the control
		// has not exited the main function which is the scope of i
		
		
		// int a =10;
		////		while (i<3)
//		{
//		int a = 10; 
//		System.out.println(a);
	//i++
//	}
		
		//Throws an error because a has already been
		// created outside the loop and hence can't be recreated
		// inside the loop, not even for one iteration
		// However, there's no harm in re-initializing i.e a=10
		//inside the loop.
	}

}
