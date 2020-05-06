import java.util.Scanner;
public class checkarrayRotation {

    public static int arrayRotateCheck(int[] arr){
	
        
        for (i = 0; i < arr.length-1; i++) 
        {
            if (arr[i]>arr[i+1]) 
            {   
                return i+1;
            } 
            
        }
        
        return 0;
    
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
	
	public static void main(String[] args) {
		int[] arr = takeInput();
		System.out.print(arrayRotateCheck(arr));
	}
}