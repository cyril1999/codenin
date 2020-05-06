import java.util.Scanner;
    
public class sumpattern {
	
	public static void main(String[] args) {
 
Scanner sc = new Scanner(System.in); 

 int n = sc.nextInt();
 int i = 1; 
 int increasing_numbers = 1;
 int sum = 0;


   
 while (i<=n) 
 {
         
     increasing_numbers = 1;
     sum = 0 ;     
     while (increasing_numbers <= i-1)
     {
        
        System.out.print(increasing_numbers+"+");
        sum = sum + increasing_numbers; 
        increasing_numbers++;
           
     }
     sum = sum + increasing_numbers; 
     System.out.print(increasing_numbers+"="+sum);

     i++;
     System.out.println();
 }

sc.close();


	}
}
