package fundamentals;

import java.util.Scanner;

public class taking_input {

	public static void main(String[] args) {
		
Scanner s = new Scanner(System.in);

/*int a = s.nextInt();
double b = s.nextDouble();

 s.data_type()
String word = s.next();

String sentence = s.nextLine();

Scanner(System.in) tells the system that input should 
only be taken from console for this particular variable
of Scanner


 s.next will take only one word as an input
 e.g. If input is: abc de ef
It would only take abc as input since s.next only takes
a word

However, in case od s.nextLine() it will take 
"abc de ef" or a complete line as input

Input:abcd eff
Output:abcd
//If s.nextLine() is used

Input:abcd eff
Output:abcd eff
*/
//
//s.nextchar() doesn't exist
//in that case String str = s.nextLine() should be stored
//in s and declare a character and store it as 
//char j = str.charAt(0) will give the first character
//of the input string
//e.g. If abcd is input j will only store a
//
//Input:abcd eff (if s.nextLine is not used)
//Output:a
//
//String str = s.next();
//System.out.println(str);
//char j = str.charAt(0);
//System.out.println(j);

//int a = s.nextInt();
//int b = s.nextInt();
//System.out.println(a+b);


//Input:5 10
//Output: 15
//s.nextInt() scans and returns the next token as int. 
//A token is part of entered line that is separated
//from other tokens by space, tab or newline.
//So when input line is : “5 10”, then s.nextInt() returns
//the first token i.e. “5” as int and s.nextInt()
//again returns the next token i.e. “10” as int 

//s.next() returns the next token as String.
//So when input line is - “Coding Ninjas” then s.next()
//returns the first token i.e. “Coding”

//String str = s.next();
//int a = s.nextInt();
//System.out.print(str + " " + a);

//Input:abc
//10
//Output: abc 10
//Because first token contains string and 2nd contains integer
//in the Input stream
//
//
//Input:abc def
//Output: Error
//
//Because the first token is string and 2nd is integer
//2nd token should have been integer as the next piece 
//of code takes integer as the 2nd token
// Token is separated from others by space tab or newline
// Other way around would've been the way in which you enter 
//the integers or enter inputs in the order in which you have
//mentioned s.next_data_type()
//Input:abc 
//10
//Output:abc 10
//
//The last manner is the easiest way to picture the
//way in which input is processed or tokens are seen by the system
//However, if s.nextLine() was to be used, there would be error
//for the first two cases since the whole line would be considered
//as token and returned to the string
//unless and until you press enter and enter the second integer
//s.nextLine() considers one whole line as token

String str = s.nextLine();
int a = s.nextInt();
System.out.print(str + "" + a );

//Input: abc def 10
//10
//Output: abc def 10 10
}

}
