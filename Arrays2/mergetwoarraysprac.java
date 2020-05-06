import java.util.Scanner;

public class mergetwoarraysprac {
    public static int[] merge(int arr1[], int arr2[]){
        
        int[] arr = new int[arr1.length + arr2.length];
        int i=0,j=0,k=0;
        for (i=0, j=0; i < arr1.length && j<arr2.length ; ) 

        {
            if(arr1[i]<=arr2[j])
            {
                arr[k] = arr1[i];
                i++;
                k++;
            }
            else 
            {
                arr[k] = arr2[j];
                j++;
                k++;
            }
            
        }
            /**/
            while (i<arr1.length) 
            {
            arr[k] = arr1[i];
            k++;
            i++;
            }
        
            while (j<arr2.length) 
            {
                arr[k] = arr2[j];
                k++;
                j++;
            }
        
        return arr;
	}

    static Scanner s = new Scanner(System.in);
	public static int[] takeInput(){
		
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static void main(String[] args) {
		
		int[] arr1 = takeInput();
		int[] arr2 = takeInput();
		int ans[] = merge(arr1, arr2);
		for(int i = 0; i < ans.length; i++){
			System.out.print(ans[i] + " ");
		}
	}

}