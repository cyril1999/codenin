

public class fahreheitToCelsisus {

    public static void printFahrenheitTable(int start, int end, int step) {
        //step is all Fahrenheit values from Start to End at the gap of step, 
        //into their corresponding Celsius values and print the table
        int TC=0;
        int TF = start;
        double multifactor = 5.0/9;
        System.out.println(multifactor);
        for (TF = start; TF <= end; TF=TF+step) {

            TC = (int)((TF-32)*multifactor);
            System.out.print(TF + " " + TC);
            System.out.println();
        }
    }

        public static void main(String[] args) {
    
    printFahrenheitTable(0, 100, 20);
}



	}

