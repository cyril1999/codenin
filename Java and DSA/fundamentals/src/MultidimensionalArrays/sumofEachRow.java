package MultidimensionalArrays;

import java.util.Scanner;

public class sumofEachRow {

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
		
	Scanner sc = new Scanner(System.in);
		
		int cols = arr2d[0].length;
		int rows = arr2d.length;
		int sum = 0;
		//Output of array
		for (int i = 0; i < rows; i++) {
			sum = 0;
			for (int j = 0; j < cols ;j++) 
			{
				sum = sum + arr2d[i][j];
				
			}
			System.out.print(sum + " ");
		}
		
	}
    
    
    public static void main(String[] args) 
    {
		int [][] input = takeinput();
		output(input);       

	}
}
