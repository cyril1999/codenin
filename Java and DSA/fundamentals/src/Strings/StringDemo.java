package Strings;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] charray = {'c','o','d','i','n','g'};//hard to manipulte
		String str1 = "coding";//easier to manipulate or concatenate
		String str = "";//Empty string
		//String str2 = " ";//Non-empty string because of space
		 //Right way to return character at it
		//str[0] is the incorrect way to return element at ith position
		//String is a non-primitive data type
		//Therefore it stores the reference of the character array formed by the string
		String str2 = " is fun";
		System.out.println(str1+str2);//Concatenating in console using '+'
		//Op: coding is fun
		str1  =  str1 + str2;//increases the array size and then adds str2 and adds it back to str1
		System.out.println(str1);//op: coding is fun
		//str1 = str1 +str2; creates an intermediate memory
//		You could do this too for avoiding that intermediate memory
		str1 = "coding";//so that it isn't concatenated to coding is fun
		//System.out.println(str1.concat(str2));//op:coding is fun
		System.out.println(str1.equals(str2));//op:false
		 String str3 = "aoding";
		 String str4 = "eoding";
		 System.out.println(str1.compareTo(str3));//op:+ve value tells that
// coding is ahead of aoding lexicographically(i.e. if placed in alphabetical order)because c>a in ascii
		 System.out.println(str1.compareTo(str4));//op:-ve value tells that
// eoding is ahead of coding lexicographically(i.e. if placed in alphabetical order) because e>a in ascii
	}

}
