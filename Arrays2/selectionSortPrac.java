import java.util.Scanner;
public class selectionSortPrac {

	public static void selectionSort(int[] arr){

        int min=0;
        int temp=0;
        //to remind which element should be swapped
        //because you shouldn't ommediately swap the moment you find
        //minimum
        int minIndex = -1;
        for (int i = 0; i < arr.length-1; i++) {
            //always initialize max or min variables with min and max values respectively

            min=Integer.MAX_VALUE;
            minIndex=-1;
            for (int j = i; j < arr.length; j++) {
                
                if(min>arr[j])
                {
                    min=arr[j];
                    minIndex=j;
                }
                
            }
            temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;

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