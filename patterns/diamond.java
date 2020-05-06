import java.util.Scanner;

public class diamond {
	public static void main(String args[]) {
		//Your Code goes here
        
           Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); 
        int first_half = N/2 + 1;
        int second_half = N - first_half;
        int i = 1; 
        int no_of_spaces = 1;
        int j = 1;
       
        while (i<=first_half) 
        {
            
            no_of_spaces = 1;
            j = 1;
                 
            
               while (no_of_spaces <= first_half-i) 
            {
                System.out.print(" ");
                no_of_spaces++;
            }
           
               while (j <= 2*i-1)
            {
                System.out.print("*");
                j++;
                   
            }
       
            i++;
            System.out.println();
            
        }
       
        i=second_half;
        
        while (i>=1) 
        {
            no_of_spaces = 1;
            j=1;     
            
               while (no_of_spaces <= first_half - i ) 
            {
                System.out.print(" ");
                no_of_spaces++;
            }
           
               while (j <= 2*i - 1)
            {
                System.out.print("*");
                j++;
                   
            }
       
            i--;
            System.out.println();
        }
       
        
        
        
       sc.close();
	}
}