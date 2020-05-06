import java.util.Scanner;

public class findunique {
    public static int findUnique(int[] arr)
    
    {
        int start = 0, end = 0, flag=0;
        for (start=0; start<arr.length; start++) 
        {

        
            for (end=0;end<arr.length;end++) 
            {

        
                if (arr[start]==arr[end] && start!=end) 
                {       
                    flag = 1;
                    break;
                }
                else
                {
                    flag = 0;
                
                }

                
                }
                if (flag==0) 
                {
                    return arr[start];   
                }

            
          }
    return flag;
        

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
    public static void main(String[] args) {


		int[] arr = takeInput();
		System.out.print(findUnique(arr));
        
    }
}