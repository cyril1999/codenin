package fundamentals;

import java.util.Scanner;

public class average_marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);

String name_str;
char name;
int test1, test2, test3;

name_str = s.next();
name = name_str.charAt(0);

test1 = s.nextInt();
test2 = s.nextInt();
test3 = s.nextInt();

double average = (test1 + test2 + test3)/3;

System.out.println(name);
System.out.println(average);
		
		
		
	}

}
