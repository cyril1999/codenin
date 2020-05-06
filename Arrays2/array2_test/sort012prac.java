/*You are given an integer array containing only 0s, 1s and 2s. Write a solution to sort this array using one scan only.
You need to change in the given array itself. So no need to return or print anything.*/

import java.util.Scanner;

public class sort012prac {

    public static void sort012(int[] arr){
        
        int i=0,temp=0, count=arr.length-1, count2=arr.length-1;

        for (i=arr.length-1;i>=0;i--) 
        {   
                if(arr[i]!=0)
                {   
                    temp = arr[i];
                    arr[i]=0;
                    arr[count] = temp;
                    count--;    
                }    
               
        }
        for (i=arr.length-1;arr[i]!=0;i--) 
        {   
                if(arr[i]!=1)
                {   
                    temp = arr[i];
                    arr[i]=1;
                    arr[count2] = temp;
                    count2--;    
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

	public static void print(int[] arr){
		for(int i=0; i<arr.length; i++){
			System.out.print(+arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = takeInput();
		sort012(arr);
		print(arr);
	}

}