import java.util.Scanner;

public class arrayintersection {
    public static void intersection(int[] input1,int[] input2)
    
    {
        int arr1max = input1.length, arr2max = input2.length;
        int arr1 = 0, arr2 = 0;
        int temp;
        
        for (arr1=0; arr1<arr1max; arr1++) 
        {

        
            for (arr2=0;arr2<arr2max;arr2++) 
            {

        
                if (input1[arr1]==input2[arr2] ) 
                {       
                    System.out.println(input2[arr2]);
                    input2[arr2] = Integer.MIN_VALUE;
                    break;
                }
               

                
            }
               

            
          }

    
        

    }
    public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int input1[] = new int[size];
		for (int i = 0; i < size; i++) {
			input1[i] = s.nextInt();
		}
		return input1;
	}
    public static void main(String[] args) {


        int[] input1 = takeInput();
        int[] input2 = takeInput();
		intersection(input1,input2);
        
    }
}