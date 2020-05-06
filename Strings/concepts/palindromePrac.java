package concepts;
import java.util.Scanner;
public class palindromePrac {
	
	public static boolean checkPalindrome(String str)
	{
		/*for (int i = 0, j=str.length()-1; i < j; i++,j--) {
			
			if(str.charAt(i)!=str.charAt(j))
			{
				return false;
			}
			
		}
		*/
		String str1 = str.substring(0, (str.length()/2));
		
		//System.out.println(str2);
		
return false;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(checkPalindrome(str));
	}

}
