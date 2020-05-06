import java.util.Scanner;

public class invertedtriangle2 {
    
    //To print pattern
    /* 4444
       333
       22
       1 
       HERE n=4 */



    public static void main(String args[]) {
    
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int i=1; int j=0;
        int p = 1;;
        while (i<=n) {
            p = n-i+1;
            j=1;
           
            while (j<= n-i+1) {
                
                System.out.print(p);
                
                j=j+1;
        
            }
        System.out.println();
        i=i+1;
        }
        sc.close();
        }
        
}