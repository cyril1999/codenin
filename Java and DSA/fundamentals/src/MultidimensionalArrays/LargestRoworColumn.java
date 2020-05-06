package MultidimensionalArrays;

import java.util.Scanner;

public class LargestRoworColumn {

    public static int[][] takeinput() 
	{
		
	Scanner sc = new Scanner(System.in);
		
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int[][] arr = new int [rows][cols];
		//Input of array
		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < cols; j++) {
				
				arr[i][j] = sc.nextInt();
			}
		}
		return arr;
	}
	
    public static void output(int[][] arr2d) //reference value inside input passed to arr2d
	{
		

		
	
		int rows = arr2d.length;
		int cols = arr2d[0].length;
		int rowsum = 0;
		int columnsum = 0;
		boolean row = true;//In case sum of row and column is equal, attributes of row will be printed first  
		int largest = Integer.MIN_VALUE;
		int largestIndex = 0;
		
		//Output of array
		for (int i = 0; i < rows ; i++) {
			rowsum = 0;
			
			for (int j = 0; j < cols ;j++) 
			{
			rowsum+= arr2d[i][j];
				
			}
			if (rowsum >largest) 
			{
			largest = rowsum;
			largestIndex = i;
			}
			
		}
		for (int i = 0; i < cols ; i++) {
			columnsum = 0;
			
			for (int j = 0; j < rows ;j++) 
			{
			columnsum+= arr2d[j][i];
				
			}
			if (columnsum >largest) 
			{
			largest = columnsum;
			largestIndex = i;
			row = false;
			}
		}
		if (row) 
		{
			System.out.println("row" + " " + largestIndex + " " + largest);
		} else {
			System.out.println("column" + " " + largestIndex + " " + largest);
		}
		
	}
    
    
    public static void main(String[] args) 
    {
		int [][] input = takeinput();
		output(input);       

	}
}
