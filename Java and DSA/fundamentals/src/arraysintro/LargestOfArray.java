package arraysintro;

import java.util.Scanner;

public class LargestOfArray {

	
public static int[] arrayInput() {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter element at" + i +"th" + "position");
			arr[i]=s.nextInt();
			
		}
		return arr;
		
	}

public static int largest(int input[]) {
	
	int largest = Integer.MIN_VALUE;
	int n = input.length;
	for (int i = 0; i < n; i++) {
		
		if(largest<input[i])
		{
			largest=input[i];
		}
		
	}
	return largest;
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[] arr = arrayInput();
	int largest = largest(arr);
	System.out.println("The largest element is:" + largest);
	}

}
