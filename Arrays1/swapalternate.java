import java.util.Scanner;

public class swapalternate {
    static Scanner s = new Scanner(System.in);
    public static void swapAlternate(int[] input){
        
        int temp = 0;
        int  start = 0, end = 1;
        for (; end < input.length ; start+=2,end+=2) {
        
            temp = input[start];
        input[start] = input[end];
    
            input[end] = temp;
        
        }
        

    }
    
	public static int[] takeInput(){
		
		int size = s.nextInt();
		int[] input = new int[size];
        
            for(int i = 0; i < size; i++){
                input[i] = s.nextInt();
            }
		return input;
	}
    public static void main(String[] args) {
        int[] input = takeInput();
		swapAlternate(input);
		for(int i = 0; i < input.length; i++){
			System.out.print(input[i]+" ");
		}
    }
}