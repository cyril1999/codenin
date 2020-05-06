// Given a number n, put all elements from 1 to n in an array in order - 1,3,.......4,2.
// Input Format :
// 6

// Output:
// 1 3 5 6 4 2

// Input:
// 9

// Output:
// 1 3 5 7 9 8 6 4 2

package arraysintro;

import java.util.Scanner;

public class arrangenumbers {
	
	 public static int[] arrange(int n)
	    
	    {
	        int[] arr = new int[n];
	        int i=0, start = 0, end = n-1;
	     for (i = 1; start < end; i++,start++,end--) {
	     
	     arr[start] = i;
	     i++;
	         arr[end] = i;
	     
	     }
	             if(start==end)
	             {
	                 arr[start] = i;        
	             }
	     
	             return arr;
	    }
	    
	    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int arr[] = arrange(n);
			for(int i = 0; i < arr.length; i++){
				System.out.print(arr[i] +" ");
			}
	    s.close();
	    }

}
