package Strings;

public class stringComparison {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		//str1==str2 due to string pool
		//However
		String str3 = new String("abc");
		//str3 is not equal to str2 becasue new keyword is used
		//"abc" is stored in another area in the heap
		
	}

}
