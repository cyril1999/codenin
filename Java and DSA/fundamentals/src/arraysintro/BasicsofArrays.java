package arraysintro;

public class BasicsofArrays {

	public static void main(String[] args) {
		
		int iarr[] = new int[10];
		double darr[] = new double[10];
		char carr[] = new char[10];
		boolean barr[] = new boolean[10];
		System.out.println(iarr[0]);//Initialized by 0
		System.out.println(darr[0]);//Initialized by 0.0
		System.out.println(carr[0]);//Initialized by null charater because its ASCII
		//value is 0
		System.out.println(barr[0]);
		iarr[1] = 10;
		
		iarr = new int[2]; //iarr here is simply a name used to refer to different arrays
		//It isn't an array by itself but just used as a pointer
		System.out.println(iarr[0]);
	
	}

}
