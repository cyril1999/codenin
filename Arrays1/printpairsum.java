import java.util.Scanner;

class printpairsum {
    public static void pairsum(int[] input, int x) {
        
        int start =0, end = 1;
        for (;start<input.length && end<input.length; end++) {

        //System.out.println("("+input[start]+","+input[end]+")");
        if (input[start]+input[end]==x) {

            if (input[start]>=input[end]) {
            System.out.println(input[end]+" "+input[start]);
                
            } else {
                System.out.println(+input[start]+" "+input[end]);
            }
            
        }
        
        if (end==input.length-1) 
          {       
          end=start+1;
          start=start+1;    
          }
          
          }
  
  
    }
	static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int x = s.nextInt();
		pairsum(input, x);
	}



}