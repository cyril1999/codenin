import java.util.Scanner;
public class bubbleSort {
    public static void bubblesort(int[] arr){
       
        int temp=0;
        for (int i = 0; i < arr.length-1; i++) 
        {
            //arr.length-1-i because max elements are stored at the end
            //j<arr.length-1-i ensures that redundant comparisons
            //are not done
            for (int j = 0; j < arr.length-1-i; j++) {
                
                if (arr[j]>arr[j+1]) 
                {
                   temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp; 
                    
                }
             }
        }
    }
    public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr = takeInput();
		bubblesort(arr);
		print(arr);
	}
}