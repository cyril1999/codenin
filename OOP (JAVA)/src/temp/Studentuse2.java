package temp;
import classes_and_objects.Student;

public class Studentuse2 {

	public static void main(String[] args) {
		
		Student s1 = new Student("Sachin");
		//System.out.println(s1.roll_no);
		//System.out.println(s1.name);
		System.out.println(s1);//op: classes_and_objects.Student@6a6824be "Different from s1 created in Studentuse of classes_and_objects package"
		s1.average = 50;
		System.out.println(s1.average);//Different value than s1 of other package
		

	}

}
