import java.util.Scanner;

public class charpatt {
    //To print pattern
    /* ABCD
       BCDE
       CDEF
       FGHI  HERE n=4 */

public static void main(String args[]) {
    
Scanner sc = new Scanner(System.in);

int n = sc.nextInt();

int i=1; int j=0;
char p;
while (i<=n) {
    j=1;
    p = (char) ('A' + i - 1);
    while (j<=n) {
        
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