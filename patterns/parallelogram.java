import java.util.Scanner;

public class parallelogram {
	
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int j = 1;
        int no_of_spaces = 1;
        
        
        while (i<=n) 
        {
            no_of_spaces = 1;
            j=1;     
            
               while (no_of_spaces <= i - 1 ) 
            {
                System.out.print(" ");
                no_of_spaces++;
            }
           
               while (j <= n)
            {
                System.out.print("*");
                j++;
                   
            }
       
            i++;
            System.out.println();
        }
       
        sc.close();
        
        
        
	}
}
