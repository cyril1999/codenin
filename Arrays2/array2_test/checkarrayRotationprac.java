import java.util.Scanner;

public class checkarrayRotationprac {

    public static int arrayRotateCheck(int[] arr){
	
        int min = arr[0];
       
        int MinIndex = 0;
        int i =0;
        for (i = 1; i < arr.length; i++) 
        {
            if (min>arr[i]) 
            {   
                min = arr[i];
                MinIndex = i;
            } 
            
        }
        
        
            return MinIndex;
        
    
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