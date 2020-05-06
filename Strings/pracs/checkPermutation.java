package pracs;
import java.util.Scanner;
public class checkPermutation 
{
    public static boolean isPermutation(String input1, String input2) 
    {
        boolean check = true;
        int i = 0;
        int freq[] = new int[256];
        int asciiAsindex = 0;
        
        if(input1.length()==input2.length()) 
        
        {             
            for (i=0; i <= input1.length()-1; i++) 
            {	
                asciiAsindex = input1.charAt(i);
                  freq[asciiAsindex]++;       

            }
            for (i=0; i <= input2.length()-1; i++) 
            {	
                asciiAsindex = input2.charAt(i);
                freq[asciiAsindex]--;

            }
        
        }

        for (i=0; i <= freq.length-1; i++) 
        {	
            if (freq[i]!=0) 
            {
                
                return false;    
            }
        }
            
        return check;
	}

    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input1 = s.next();
		String input2 = s.next();
		System.out.println(isPermutation(input1, input2));
	}
}