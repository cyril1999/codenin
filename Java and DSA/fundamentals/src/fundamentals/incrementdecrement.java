package fundamentals;

public class incrementdecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=60;
	//	System.out.println(a++);
		//op:60 because print method first uses the value
		// of a and the operator increases the value
		int b=a++;
	//	System.out.println(b);
		//op: 60 because first, old value of a is used
		// to assign to b and then (post) it is incremented
		a=60;
		

//		System.out.println(++a);
//		//op:61 because print method uses the incremented value
//		// of a and the operator increases the value before(pre) it is printed
//		a=60;
//		b=++a;
//		System.out.println(b);
//		//op: 61 because first(pre), value of a is incremented and then used 
//		//to assign to b
//		
//		
//		a=60; b=80;
//		// if stmt first compares value of a with 60 then increments it but does not 
//		//increment b because first expression is false therefore overall 
//		//result would be false
//		if(a++>60 && b++>80)
//		{
//			System.out.println("Inside if");
//		}
//		else
//		{
//			System.out.println("Inside else");
//		}
//		
//		System.out.println("a"+ a+ "b"+ b);
//	
//	a=60; b=80;
//		//it first increents value of a and then compares with 60
//		if(++a>60 && b++>80)
//		{
//			System.out.println("Inside if");
//		}
//		//second stmt is checked, because first is true therefore b is incremeneted
//		else
//		{
//			System.out.println("Inside else");
//		}
//		
//		System.out.println("a"+ a+ "b"+ b);
//	
//	a=60; b=80;
//		
//		if(++a>60 || b++>80)
//		{
//			System.out.println("Inside if");
//		}
//		else
//		{
//			System.out.println("Inside else");
//		}
//		
//		System.out.println("a"+ a+ "b"+ b);
//	
		a=10; b=50;
		a++;
		--b;
		int c = --a + b--;//here new value of a is used
		// and old value of b is used because of
		//pre and post dec operators respectively
		System.out.println(++c);
		
		  a=10;b=20;
		    System.out.println(a+++--b);//line 1
		    //System.out.println(a--+++b);//line 2
		    System.out.println(a++-++b);//line 3
		    //System.out.println(a+++++b);//line 4
		
		
	}
//refer notebook 
}
