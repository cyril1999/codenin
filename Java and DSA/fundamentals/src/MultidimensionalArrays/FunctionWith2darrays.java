package MultidimensionalArrays;
import java.util.Scanner;

public class FunctionWith2darrays {

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
		//Output of array
		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < cols ;j++) {
				
				 System.out.println(arr2d[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) 
	{

		int [][] input = takeinput();//reference value inside arr passed to input
		output(input);//reference value inside input passed as argument
	}

}
