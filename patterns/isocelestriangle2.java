import java.util.Scanner;

public class isocelestriangle2 {

/*This code generates the isocels triangle as follows

  *
 ***
*****

n=3

Here we print * instead of increaasing
and decreasing numbers

*/
public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 

        int i = 1; 
        int no_of_spaces = 1;
        int increasing_numbers = 1;
        int decreasing_numbers = 1;
       
        while (i<=n) 
        {
            no_of_spaces = 1;
            increasing_numbers = 1;
            decreasing_numbers = i-1;     
            
               while (no_of_spaces <= n-i) 
            {
                System.out.print(" ");
                no_of_spaces++;
            }
           
               while (increasing_numbers <= i)
            {
                System.out.print("*");
                increasing_numbers++;
                   
            }
       
           
              while (decreasing_numbers >= 1)
            {
                System.out.print("*");
                decreasing_numbers--;
            }
       
            i++;
            System.out.println();
        }
       
       sc.close();
       
           }
       
       }