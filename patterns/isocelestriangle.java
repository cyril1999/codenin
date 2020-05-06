import java.util.Scanner;

public class isocelestriangle {

/*This code generates the isocels triangle as follows

  1
 121
12321

n=3

*/

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   
/*First we will take this half of the isoceles triangle pattern and
write the code for it

        1
       12
      123
      
      for n = 3
      and so on
*/

// int i = 1; 
// int no_of_spaces = 1;
// int increasing_numbers = 1;
// int decreasing_numbers = 1;

// while (i<=n) 
// {
//     no_of_spaces = 1;
//     increasing_numbers = 1;
//     
//     while (no_of_spaces <= n-i) 
//     {
//         System.out.print(" ");
//         no_of_spaces++;
//     }
//     while (increasing_numbers <= i)
//     {
//         System.out.print(increasing_numbers);
//         increasing_numbers++;
//            
//     }
//     i++;
//     System.out.println();
// }

/*Now we will take this half of the isoceles triangle pattern and
write the code for it

__  
1_
21
      
      for n = 3
      and so on
*/




// int i = 1; 

// int decreasing_numbers = 1; //for the decreasing numbers

// in the pattern and there is no variable for spaces
// because we don't need that in non-mirror image patterns
// refer the triangle pattern program 
// It doesn't have a variable for spaces because the latter part 
// can be skipped just like the latter part of the isoceles triangle


// while (i<=n) 
// {
    
//     decreasing_numbers = i-1;
    
//     while (decreasing_numbers >= i-1)
//     {
//         System.out.print(decreasing_numbers);
//         decreasing_numbers--;
//     }


//     i++;
//     System.out.println();
// }


/*Now that we have solution for both the halves
Keeping the outer loops and variables same, we club the inner loops
to give the following pattern which is combo of the above two triangles

  1
 121
12321

*/





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
         System.out.print(increasing_numbers);
         increasing_numbers++;
            
     }

    
       while (decreasing_numbers >= 1)
     {
         System.out.print(decreasing_numbers);
         decreasing_numbers--;
     }

     i++;
     System.out.println();
 }

sc.close();

    }

}