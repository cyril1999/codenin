import java.util.Scanner;

public class invertedtriangle {
    //To print pattern
    /* ****
       ***
       **
       *  
       HERE n=4 */

public static void main(String args[]) {
    
Scanner sc = new Scanner(System.in);

int n = sc.nextInt();

int i=1; int j=0;
char p = '*';
while (i<=n) {
    
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