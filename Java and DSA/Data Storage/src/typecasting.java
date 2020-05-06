
public class typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		char ch = 'a';
		int i = ch;
		System.out.println(i);
//		ch = i; not allowed since 4 bytes can't 
//		be converted to 2 bytes without explicit
//		conversion there is loss of data
//		ch =(char)i;
		
//		ch = ch + 1; Is not possible since

//		ascii value of ch is added to an integer
//		which results into an integer
//		Here too explicit conversion will be
//		required
//		ch = (char) ch + 1;

short s = (short) i;
//due to the same reasons as stated above

//int i = 2.5;
//Not possible because floating point numbers
//are considered to be double data type by default
// Double data type is bigger than integer data
// type which is why explicit conversion will be required
 int j = (int)2.5;

//float f = 2.5;
// This is also not possible as 2.5 is considered
// as double data type, since 2.5 is stored as temporary
 // memory which is of 8 bytes(double) and float
// is of 4 bytes which means big data type can't be converted
// to smaller datat type without explicit conversio
float f = (float) 2.5;
//OR
float f2 = 2.5f; //for explicit conversion
//DOuble data type only increases precision

//j = f2;
//Will throw error because here it's not about size
//of data but about type of data even though both 
//are of equal size. Here too conversion is required

j = (int)f2;

System.out.println(4 + 4);
//Integer + integer gives answer as integer

System.out.println(4 + 4.5);
//Integer + double gives answer as bigger data type
// That is, answer would be double

System.out.println(4.1 + 4.4);
// Double + double gives you double

double d = 2/5;
//Is allowed since 2/5 yields integer
//which can be casted to double implicitly

System.out.println(d);

System.out.println(2/5);//Gives int as both operators
//are integer

System.out.println((double)2/5);
//Gives answer in decimal since it is casted

System.out.println(2.0/5);
//gives answer in double since one of the 
//operators is in double data type

//byte l = 50;
//l = l*50;
//This can't be done as l*50 is basically an integer
//is getting multiplied with a byte type and 50 is getting 
//stored as integer(temporarily) which makes it impossible to
// get casted into byte data type without being explicitly 
// converted
//
//int o = 50;
//long l = 20;
//int e = o*l;
//Can't be done because bigger data type long is
//being multiplied which will not be casted implicitly


	}

}
