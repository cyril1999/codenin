import java.util.Scanner;

public class insertionsort {

    public static void insertionSort(int[] arr)
    {
        int  temp,j=0;
        for (int i = 0; i < arr.length-1; i++) {

            
                       
                temp=arr[i+1];
                j=i;
                while (j>=0 && arr[j]>temp ) 
                {
                    arr[j+1]=arr[j];
                    j--;
                }
                arr[j+1] = temp;
            
            
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
        insertionSort(arr);
		print(arr);
	}


}