package classes_and_objects;
import java.util.Scanner;
public class Studentuse {

	public static void main(String[] args) {
		
		//Scanner s = new Scanner(System.in);
		
//Object of student is instantiated in this file to keep things organized		
		Student s1 = new Student("Sachin");
		Student s2 = new Student("Justin");

		//System.out.println(s1);//prints address of object created in the following format: 
		//packagename.classname@address_of_object
		//classes_and_objects.Student@6a6824be   "Here '@' means address
		
		//Student s3 = s1;
		//s3 stores address of object s1 by getting assigned the value(address) of s1
		//It doesn't create a new object s3 because "new" keyword wasn't used
		//System.out.println(s3);//Prints address same as that of s1 because no new object is created
		//op: classes_and_objects.Student@6a6824be
		
//		System.out.println(s1.name +  " " + s1.roll_no);
		//Since values weren't initialized in class, JAVA assigns them initialized values when objects are created
		//String->null i.e. no reference value
		//int->0
		//double->0.0
		//Roll_no not accessible from this class because it's a private attribute in Student class
		//Hence it can only be accessed in Student.java class
		
		
		
		s1.average = 50.0;
		System.out.println();
		System.out.println(s1);//op: classes_and_objects.Student@6a6824be "Different from s1 in temp package"
		s1.average = 40.5;
		System.out.println(s1.average);
	
		//Getters
		System.out.println("Roll number:" + " " + s1.getRoll_no());
	
		//Setters
		s1.setRoll_no(-100);//Setter doesn't allow to give invalid values to private attribute of object
		Student.getNumberofStudents();//Conventional way to access static methods
		s1.getNumberofStudents();//Static methods can also be accessed using objects but it's not good practice 
		
	
	}

}