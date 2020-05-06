package MultidimensionalArrays;

public class jaggedArrays {

	public static void main(String[] args) {

// int [][] arr2d = new int[][]; //Not allowed
		//int [][] arr2d = new int[][4];//Not allowed because
//While storing in memory it is necessary to specify the number of rows
//Or 1d arrays of the 2d array as it is stored as a series of 1d array whose
// references are stored in an array of size equal to number of rows
		int [][] arr2d = new int [4][];
	
	//Such a definition is allowed but the array which is supposed to contain
	//the references to 1d arrays will have value as null.
	//However we can assign 1d arrays of different sizes(column numbers)
	//to the arr2d initialized only with row size by assigning different or same
	//1d array equal to the number of rows of different sizes.
	//The resultant array is a jagged array
		for (int i = 0; i < arr2d.length ; i++) {
			
			
			arr2d[i] = new int [i+2];
//assigns a 1d array of size i+2 to every row which is referenced using
//arr[i]
			}
	//Displaying a jagged 2d aray
//To display a jagged 2d array it is required, that the size of each row is addressed separately
//using arr2d[i] referencing method
		
for (int i = 0; i < arr2d.length ; i++) {
	for (int j = 0; j < arr2d[i].length ; j++) 
	{
		
		System.out.print(arr2d[i][j]);
//Prints each row which has different number of columns
		}
	System.out.println();
			}
		//Jagged array is possible because of the manner in which 2d arrays are
//stored in memory
		
	}

}
