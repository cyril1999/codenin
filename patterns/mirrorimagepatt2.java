import java.util.Scanner;
public class mirrorimagepatt2 {

    /*
    prints the pattern
        1
       12
      123
      for n = 3
      and so on*/    
       
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = 1; 
        int no_of_spaces = 1;
        int no_of_integers = 1;
        int integer_to_be_printed = 1;

        while (i<=n) 
        {
            no_of_spaces = 1;
            no_of_integers = 1;
            integer_to_be_printed = 1;
            while (no_of_spaces <= n-i) 
            {
                System.out.print(" ");
                no_of_spaces++;
            }
            while (no_of_integers <= i)
            {
                System.out.print(integer_to_be_printed);
                no_of_integers++;
                integer_to_be_printed++;   
            }
            i++;
            System.out.println();
        }

        sc.close();
    }
}