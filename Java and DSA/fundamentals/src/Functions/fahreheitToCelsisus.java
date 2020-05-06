package Functions;

public class fahreheitToCelsisus {

	public static void printFahrenheitTable(int start, int end, int step) {
        //step is all Fahrenheit values from Start to End at the gap of step, 
        //into their corresponding Celsius values and print the table
		 int TC=0;
	        int TF = start;
	        double multifactor = 5.0/9; //5/9 in integer is zero
	        //converting to double is important especially when division might lead to 0
	        
	        for (TF = start; TF <= end; TF=TF+step) {

	            TC = (int)((TF-32)*multifactor);
	            System.out.print(TF + "\t" + TC);
	            System.out.println();
        }
	
	}
	
	public static void main(String[] args) {
		
printFahrenheitTable(0, 100, 20);
	}

}
