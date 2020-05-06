package classes_and_objects;

public class Student {

	String name; //can be accessed only by classes
	
private	int roll_no; //can be accessed only inside this class
public double average;
final static double CONVERSION_FACTOR = 0.95;//THE DOWNSIDE IS WE CAN'T HAVE A CONSTRUCTOR OR ANY OTHER PART OF THE PROGRAM MODIFYING THIS VALUE
//Which means we can't have more than one constructor if we decide to initialize the value
double GPA;
static private int NUMBEROFSTUDENTS;//ONly one opy of this variable exists and a copy isn't created every time an object is initialized
	
//Creating constructor with argument forces the user to enter arguments while creating objects
public Student(String name) //We can create constructors without arguments to initiate with our values instead of user defined
{
	this.name = name;
	NUMBEROFSTUDENTS++;
	this.roll_no = NUMBEROFSTUDENTS;
//This ensures that Roll NUmber is assigned according to the number of student objects created
//Also roll number is a final variable which ensures that once assigned it cannot be manipulated in another program or elsewhere
}
//public Student(String name) //We can create constructors with 1 argument to initiate with our values instead of user defined
//{
//	this.name = name;
//	
//}


public int getRoll_no() 
	{
		return roll_no;
	}
	
	public void setRoll_no(int roll_no) //Allows files to set valid roll number to the object
	{	
		if(roll_no<=0)
		{
			return ; //Disallows from setting an invalid roll number
		}
		this.roll_no = roll_no; //Doesn't set valid roll number if "this" keyword isn't used because code can't differentiate
		//Therefore not having an effect because value of local variable of setter method will be assigned to the local variable itself
//THis keyword tells you to assign value of variable to variable of current object
	}
	
	//tHIS IS A STATIC METHOD
	//STATIC METHOD CANNOT ACCESS NON-STATIC VARIABLES BECAUSE THERE ARE MULTIPLE COPIES OF NON-STATIC VARIABLES
	//AND MIGHT LEAD TO CONFUSION
	//STATIC METHODS CANNOT CALL NON-STATIC FUNCTIONS
	//STATIC METHODS CANNOT USE KEYWORD LIKE "THIS" OR "SUPER"
	public static int getNumberofStudents() 
	{
		//The right way to access a static variable is by using the class name 
		System.out.println("NUmber of students"+" "+ Student.NUMBEROFSTUDENTS);
		//It can also be accessed using object if the static variable is public
	 
		return NUMBEROFSTUDENTS;
	}
}
