package arraysintro;
import java.util.Scanner;
public class InputOfArray {

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
public static void arraydisp(int arr[]) {
		
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.println("Enter element at" + i +"th" + "position");
			
			System.out.println(arr[i]);
		}
	
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = arrayInput();//This function returns an array
		
		
		
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
			
		}
	}

}
