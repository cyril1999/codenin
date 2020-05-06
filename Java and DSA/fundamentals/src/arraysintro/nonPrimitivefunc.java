package arraysintro;

public class nonPrimitivefunc {

	public static int[] incarr(int[] input) {
		//In this function address of arr i.e the value stored inside arr is 
		//passed(JAVA always passes by value) to this function and not the whole array
		//Hence, the variable input contains the adddress and length
		//Now it points to the same arrray pointed by arr
		for (int i = 0; i < input.length; i++) {
			
			input[i] = input[i]+1;
		}
	
	return input;
	}
	
	public static int[] incarr2(int[] input) {

		//In this function address of arr i.e the value stored inside arr is 
		//passed(JAVA always passes by value) to this function and not the whole array
		//Hence, the variable input contains the adddress and length
		//Now it points to the same arrray pointed by arr
		input = new int[7];
		//Because of this line, the reference value inside input is overwritten and now points to a new array
		for (int i = 0; i < input.length; i++) {
			
			input[i] = input[i]+1;
		}
		
		
		return input;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3,4,5};
// arr stores the address(value) of the memory where array is made
//Increments the array pointed to by arr
incarr(arr);
for (int i = 0; i < arr.length; i++) {
	System.out.println(arr[i]);
}
//Increments a new array pointed to inside the function even if arr's value is passed
int arr1[] = incarr2(arr);
System.out.println("Array incremented by incr2");

for (int i = 0; i < arr1.length; i++) {
System.out.println(arr1[i]);	
}
arr = incarr2(arr);
//NOw arr points to the new array created by incr2 and it loses the value it previously had
System.out.println("NOw arr points to the new array created by incr2 and it loses the value it previously had");
System.out.println("because of arr = incarr2(arr);");
for (int i = 0; i < arr1.length; i++) {
System.out.println(arr[i]);	
}

	}

	
}
