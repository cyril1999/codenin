package MultidimensionalArrays;
import java.util.Scanner;

public class ipandop2dArray {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int[][] arr2d = new int [rows][cols];
		//Input of array
		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < cols; j++) {
				
				arr2d[i][j] = sc.nextInt();
			}
		}
		
		//Output of array
		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < cols; j++) {
				
				System.out.print(arr2d[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println(arr2d.length);
	}

}
