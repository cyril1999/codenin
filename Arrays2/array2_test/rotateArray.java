import java.util.Scanner;
public class rotateArray {

    public static void rotate(int[] arr, int d) 
        
    {
        int temp=0,j=0;

        for (int i = 1; i <= d; i++) 
        {   
            d%=arr.length;
            temp = arr[0];
            for (j = 0; j < arr.length-1; j++) 
            {
                
                arr[j] = arr[j+1];
            }
            arr[j] = temp;
            
        }

	}

    static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
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
		int index = s.nextInt();
		ArrayRotate.rotate(arr, index);
		print(arr);
	}

}