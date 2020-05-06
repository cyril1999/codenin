package fundamentals;

public class precedenceandassosc {

	public static void main(String[] args) {
int a=5;		
		boolean c = ++a > 5 ;
		System.out.println(c);
// since ++a has higher precedence than relational operators
// new value of a is evaluated in relation and therefore c is true
		
	}

}
