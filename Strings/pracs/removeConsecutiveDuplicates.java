package pracs;
import java.util.Scanner;

public class removeConsecutiveDuplicates {

    public static String removeconsecutiveDuplicates(String input) 
    {
        StringBuffer answer = new StringBuffer("");
        char result = input.charAt(0);
        answer.append(result);
        int flag = 0;

        for (int current=1; current < input.length(); current++) 
        {	
            
            if (result!=input.charAt(current) ) 
            {
                result = input.charAt(current);
                answer.append(result);
                flag=0;
            }
    
        }
        String Answer = answer.toString();
        return Answer;
	}


    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		System.out.println(removeconsecutiveDuplicates(input));
	}
}