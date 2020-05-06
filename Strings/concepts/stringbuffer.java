package concepts;

public class stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer str = new StringBuffer("abc");
		str.setCharAt(0, 'e');//op: ebc
		str.append('g');//op: ebcg
		//MUch more efficient than
		String str1 = "abc";
		str1 = str1 + 'g';//which uses three memory spaces for
		//the equivalent of append operation in StringBUffer
		//HOw String is much more efficient for static Strings e.g. FIle Paths
	int  i = 'a';
	System.out.println(i);//Prints ascii
	
	char ch = 122;
	System.out.println(ch);//typecasts into character
	
	}

}
