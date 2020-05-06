import java.util.Scanner;

public class halfdiamond {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 

        int i = 1; 
        
        int no_of_times_increasing_numbers_are_printed = 1;
        int inc_no_to_be_printed = 1;
        int no_of_times_decreasing_numbers_are_printed = 1;
        int dec_no_to_be_printed = 1;
        
        System.out.println("*");
        while (i<=n) 
        {
            System.out.print("*");    
            inc_no_to_be_printed = 1;
            no_of_times_increasing_numbers_are_printed = 1;
            dec_no_to_be_printed = i-1;
            no_of_times_decreasing_numbers_are_printed = i-1;     
            
            
           
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
            System.out.print("*");
            i++;
            System.out.println();
        }
       
       
       i=n-1;

       while (i>=1) 
       {
           System.out.print("*");    
           inc_no_to_be_printed = 1;
           no_of_times_increasing_numbers_are_printed = 1;
           dec_no_to_be_printed = i-1;
           no_of_times_decreasing_numbers_are_printed = i-1;     
           
           
          
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
           System.out.print("*");
           i--;
           System.out.println();
       }
       System.out.print("*");
      
      sc.close();
      


    }
}