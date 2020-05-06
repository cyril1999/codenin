package MultidimensionalArrays;

public class storageof2dArrays {

	public static void main(String[] args) {
//1 method of initializing 2-d array
		int[][] arr2d = {{1,2,3,4},{1,2},{1,2,3}};
		
//The above statement stores 3 different 1d arrays in memory
//and stores a 1d array of addresses of those 1d arrays 
//The address of the array containing references to the 1d arrays
//is returned to the variable arr2d
		System.out.println(arr2d);
		System.out.println(arr2d[0]);//reference of 1st row
		System.out.println(arr2d[1]);//reference of 2nd row
		System.out.println();
		System.out.println(arr2d.length);//number of rows OR length of 1d array containing references to rows
		System.out.println(arr2d[0].length);//Length of first row
		System.out.println(arr2d[1].length);
		System.out.println(arr2d[0][3]);//Value at 4th position of 1st row
		System.out.println(arr2d[1][1]);
	
int[][] arr2d_2	= new int[2][2];
//2-D ARRAYS initialized in this manner will have rows of equal sizes 
// And they are stored in the same manner as above
	}

}
