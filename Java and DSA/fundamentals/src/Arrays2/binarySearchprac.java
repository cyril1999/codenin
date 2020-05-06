package Arrays2;
import java.util.Scanner;

public class binarySearchprac {

	  static Scanner s1 = new Scanner(System.in);
      
	    
	    public static int binarySearch(int[] arr, int num){
	        
	        int start=0;
	        int end=arr.length-1;
	        int mid=0;
	        

	        while (start<=end) {
	        	
	        	mid=(start+end)/2;
	        	
	            if(num==arr[mid])
	            {
	                return mid;
	            }
	            else if (num<arr[mid]) {
	                end=mid-1;  
	                         
	            }
	            else
	            {
	                start=mid+1;
	                
	            }
	            
	        }

	        return -1;
		}


		public static int[] takeInput() {
			int size = s1.nextInt();
			int arr[] = new int[size];
			for (int i = 0; i < size; i++) {
				arr[i] = s1.nextInt();
			}
			return arr;
		}
		
		public static void main(String[] args) {
			int[] arr = takeInput();
			int num = s1.nextInt();
			System.out.println("Index is: ");
			System.out.print(binarySearch(arr, num));
		}

}
