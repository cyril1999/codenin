import java.util.Scanner;

public class findduplicate {
    public static int finduplicate(int[] arr)
    
    {
        int start =0, end = 1;
        for (; start<arr.length && end<arr.length; end++) {

        if (arr[start]==arr[end]) {
            return arr[start];
            
        }
          if (end==arr.length-1) 
          {       
          end=start+1;
          start=start+1;    
          }
          
          }
    return 0;
        

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
		System.out.print(finduplicate(arr));
        
    }
}