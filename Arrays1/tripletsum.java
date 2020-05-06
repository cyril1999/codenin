import java.util.Scanner;

class tripletsum {
    public static void triplesum(int[] input, int x) {
        for (int i = 0;i < input.length- 2; i++)  
    { 
        for (int j = i + 1;j < input.length- 1; j++)  
        { 
            for (int k = j + 1;k < input.length; k++) 
            { 
                if (input[i] + input[j] + input[k] == x)  
                { 
                   
        
                    if (input[i]>=input[j] && input[i]>=input[k] ) {

                        if (input[k]>=input[j]) {
                       System.out.println(input[j]+" "+input[k]+" "+input[i]);
                       
                        } else {
                       System.out.println(input[k]+" "+input[j]+" "+input[i]);
                       }
                       
                       } else {
                       
                                if (input[k]>=input[j]) {
                                           if (input[i]>=input[j]) {
                                               System.out.println(input[j]+" "+input[i]+" "+input[k]);
                               
                                   } else {
                                           System.out.println(input[i]+" "+input[j]+" "+input[k]);
                                           }
                            
                           
                               }           else {
                                           if (input[i]>=input[k]) {
                                               System.out.println(input[k]+" "+input[i]+" "+input[j]);
                               
                                           } else {
                                               System.out.println(input[i]+" "+input[k]+" "+input[j]);
                                           }
                          
                       }
                       
                   }
                  
                } 
            } 
        } 
    } 
         
        
            
         

        
    }
	static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		int size = s.nextInt();
		int input[] = new int[size];
		for (int i = 0; i < size; i++) {
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int x = s.nextInt();
		triplesum(input, x);
	}



}