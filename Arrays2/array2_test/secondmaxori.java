/*Given a random integer array of size n, find and return the second largest element present in the array.
If n <= 1 or all elements are same in the array, return -2147483648 i.e. -2^31.*/ 
//This problem has lesser time complexity because of one loop

import java.util.Scanner    ;
public class secondmaxori {

    public static int secondMax(int[] arr) 
    {
        int max = arr[0];
        int secondMax = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) 
        {
            if (max<arr[i]) 
            {   
                secondMax=max;
                max = arr[i];
            } 
            else 
            
            {
                    if (secondMax<arr[i] && max!=arr[i]) 
                    {
                        secondMax = arr[i];    
                    }    
            }
        }
        return secondMax;
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
		System.out.print(secondMax(arr));
	}
}