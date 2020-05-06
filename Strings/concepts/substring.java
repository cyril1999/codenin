package concepts;

public class substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Coding";
		System.out.println(str.substring(6));
		//op: Empty string
		System.out.println(str.substring(1,5));//excludes character at index 5
		//includes character at index 1
		//op: odin
		System.out.println(str.substring(3));
		//op:ing
		//gives characters from index 3 to end
		
		//System.out.println(str.substring(1,7));
		//Gives error
		
		
	}

}
