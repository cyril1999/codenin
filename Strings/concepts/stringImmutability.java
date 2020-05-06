package concepts;

public class stringImmutability {

public static void main(String[] args) {
	
	String str = "abc";
	String str2 ="def";
	String str3 = "abcdef";
	System.out.println(str2.length());
	str2 =str + "def" ;
//Concatenation always creates brand new string and gives the reference of the new
//the new memory space unlike previous case of initialization without "new" keyword
//It creates new string in string pool
	System.out.println(str2.length());
	System.out.println(str2.equals(str3));
	
	

}

}


