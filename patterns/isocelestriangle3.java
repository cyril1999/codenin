import java.util.Scanner;

public class isocelestriangle3 {

/*This code generates the isocels triangle as follows

  1
 232
34543

n=3

Here we print * instead of increaasing
and decreasing numbers

*/
public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 

        int i = 1; 
        int no_of_spaces = 1;
        int no_of_times_increasing_numbers_are_printed = 1;
        int inc_no_to_be_printed = 1;
        int no_of_times_decreasing_numbers_are_printed = 1;
        int dec_no_to_be_printed = 1;
       
        while (i<=n) 
        {
            no_of_spaces = 1;
            inc_no_to_be_printed = i;
            dec_no_to_be_printed = 2*(i-1);
            no_of_times_increasing_numbers_are_printed = 1;
            no_of_times_decreasing_numbers_are_printed = i-1;     
            
               while (no_of_spaces <= n-i) 
            {
                System.out.print(" ");
                no_of_spaces++;
            }
           
               while (no_of_times_increasing_numbers_are_printed <= i)
            {
                System.out.print(inc_no_to_be_printed);
                no_of_times_increasing_numbers_are_printed++;
                inc_no_to_be_printed++;
            }
       
           
              while (no_of_times_decreasing_numbers_are_printed >= 1)
            {
                System.out.print(dec_no_to_be_printed);
                no_of_times_decreasing_numbers_are_printed--;
                dec_no_to_be_printed--;
            }
       
            i++;
            System.out.println();
        }
       
       sc.close();
       
           }
       
       }