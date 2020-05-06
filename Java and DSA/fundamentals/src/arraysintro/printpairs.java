package arraysintro;

public class printpairs {

	 public static void printpair(int[] arr) {
	        
	        int start =0, end = 1;
	        for (; start<arr.length && end<arr.length; start++,end++) {

	        System.out.println("("+arr[start]+","+arr[end]+")");
	          if (end==arr.length-1) 
	          {       
	          end=start+1;
	          start=start+1;    
	          }
	          start--;
	          }
	  
	  
	    }
		public static void main(String[] args) {
			// TODO Auto-generated method stub

	        int[] arr = {1,4,7,6,5,9};
	        printpair(arr);


	    }


}
