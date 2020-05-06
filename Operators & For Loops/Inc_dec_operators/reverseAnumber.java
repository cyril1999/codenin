import java.util.Scanner;
public class reverseAnumber {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int reverse=0;
        int last_digit = 0;
        
        //This solution might appear to be correct but it gives 0001 for an input 1000 
        //The correct answer should have been one
        //  while (number!=0) {
            
        //      result=number%10;
        //      System.out.print(result);
        //      number/=10;
        //  }
        //Correctsolution to reverse a number
        //    reverse = 0 to concatenate with an integer, multiply with zero to create space for a digit
        //0*0=0+ integer_to_be_concat
        //e.g. 2->24   2*10 = 20 = 2[] now the empty space can be filled with a digit by simply adding the digit to
        //be concatenated i.e. 2[] + integer_to_be_concat = 2integer_to_be_concat
        // e.g. 2*10 = 2[]  2[] + 4 = 24
        //However you cannot generate numbers like 001, because 0 as a highest power is considered an empty box 
        // i.e. 0 -> [] however  10 is not equal to 1[], you can concatenate an integer to 10 by
        // 10*0 -> 10[] -> 10[integer_to_be_concat]  

        while (number!=0) {
            
               last_digit = number%10;
               reverse = reverse*10 + last_digit;
            
                  number/=10;
          }
          System.out.println(reverse);

    }
}