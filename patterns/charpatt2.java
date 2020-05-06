import java.util.Scanner;

public class charpatt2 {
    
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ich = (char)(n +'A');
        char ch = (char) ich;
        int i=1; int j=0;
        char p;
        while (i<=n) {
            j=1;
            p = (char) (ch - i);
            while (j<=i) {
                
                System.out.print(p);
                p=(char)(p+1);
                j=j+1;
        
            }
        System.out.println();
        i=i+1;
        }
        sc.close();


    }
}