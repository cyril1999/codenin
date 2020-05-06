import java.util.Scanner;
public class mirrorimagepatt {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = 1; 
        int no_of_spaces = 1;
        int no_of_stars = 1;
        char ch = '*';

        while (i<=n) 
        {
            no_of_spaces = 1;
            no_of_stars = 1;
            while (no_of_spaces <= n-i) 
            {
                System.out.print(" ");
                no_of_spaces++;
            }
            while (no_of_stars <= i)
            {
                System.out.print(ch);
                no_of_stars++;   
            }
            i++;
            System.out.println();
        }

        sc.close();
    }
}