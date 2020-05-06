import java.util.Scanner;

public class oddsquare {

    /*This is a very imp pattern
    understand by looking at the pattern for
    
    n=3

    135
    351
    513

    n=5

    13579
    35791
    57913
    79135
    91357

    n=8
    13579111315
    35791113151
    57911131513
    79111315135
    91113151357
    11131513579
    13151357911
    15135791113
    

    */
	
	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 

 int n = sc.nextInt();
 int i = 1; 
 int j = 1;
 //int number_to_be_printed = 1;
 /*

 This solution is feasible but it's hard to understand because of
 modulus operations, a better solution is given after this comment
int print_factor = n*2;
int multiplication_factor = n;

   
 while (i <= n) 
 {
         
    
    j=1;
          
     while (j <= n)
     {
        
        System.out.print(number_to_be_printed%(print_factor));
        
        number_to_be_printed = number_to_be_printed + 2;
           
        j++;
     } 
     number_to_be_printed = 2*(i) + 1 ; 
     i++;

     System.out.println();
 }
*/
//We need to print from i to 2n-1 and then 1 to i
//for each row
// i.e. i = 1,3,5,7....
for(i=1; i<2*n; i = i+2)
{   
    //prints from i to 2n-1 for ith row
    for (j=i; j < 2*n ; j=j+2)
    {
        System.out.print(j);

    }

    //prints from 1 to i for ith row because it's a cycle 
    //where the last number is 2* n - 1 and starts from 1 again after
    // that till i where it's not a cycle if it doesn't reach max odd number

    for(j=1; j<i ; j=j+2)
    {
        System.out.print(j);
    }
System.out.println();


}


sc.close();





	}
}
