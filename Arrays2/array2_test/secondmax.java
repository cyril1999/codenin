/*Given a random integer array of size n, find and return the second largest element present in the array.
If n <= 1 or all elements are same in the array, return -2147483648 i.e. -2^31.*/ 

import java.util.Scanner;
public class secondmax {

    public static int secondLargestElement(int[] arr)
    {
        int max=Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;
        int flag=0;
        for (int i = 0; i < arr.length; i++) 
        {
            if (max<arr[i]) 
            {
                max=arr[i];    
            }
            if (arr[0]==arr[i]) 
            {
                flag=1;
            }
            else
            {
                flag=0;
            }    
        }
        
        for (int i = 0; i < arr.length; i++) {
            
            if ( secondmax<arr[i] && arr[i]!=max) 
            {
                secondmax=arr[i];    
            }   
        }

        if (arr.length==1 || flag==1) 
        {
            return Integer.MIN_VALUE;    
        }

        return secondmax;

	}
    public static int[] takeInput() 
    {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
    public static void main(String[] args) 
    {
		int[] arr = takeInput();
		System.out.print(secondLargestElement(arr));
	}
}