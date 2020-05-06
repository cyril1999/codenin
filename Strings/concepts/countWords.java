package concepts;
import java.util.Scanner;
public class countWords {
	public static int countwords(String str)
	{
		/*Solution easy
		String[] strar = str.split(" ");
		int noofWords = strar.length;
		return noofWords;*/
		int noofWords = 0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==' ')
			{
				noofWords++;
			}
			}
	
		return noofWords+1;
	
	}
	
	
static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		String str = s.nextLine();
		System.out.println(countwords(str));
	}

}
