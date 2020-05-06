/*You are given an integer array containing only 0s, 1s and 2s. Write a solution to sort this array using one scan only.
You need to change in the given array itself. So no need to return or print anything.*/

import java.util.Scanner;

public class sort012 {

    public static void Sort012(int[] arr){
		int i=0,temp=0, two=arr.length-1, zero=0;

        for (i=0;i<two;) 
        
        {   
				if (arr[i]==0) 
				{
					temp=arr[zero];
					arr[zero]=arr[i];
					arr[i]=temp;
					zero++;
					i++;
				}
				else if (arr[i]==2) 
				{
					temp = arr[two];
					arr[two]=arr[i];
					arr[i] = temp;
					two--;
				}
				else
				{
					i++;
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
		Sort012(arr);
		print(arr);
	}

}