package Arrays2;
import java.util.Scanner;

public class selectionSortPrac {

	public static void selectionSort(int[] arr){

        int min=0;
        int temp=0;
        for (int i = 0; i < arr.length-1; i++) {
            min=arr[i];

            for (int j = i+1; j < arr.length; j++) {
                
                if(min>arr[j])
                {
                    min=arr[j];
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    
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
		selectionSort(arr);
		print(arr);
	}


}
