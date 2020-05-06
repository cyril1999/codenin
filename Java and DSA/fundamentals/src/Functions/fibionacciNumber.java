package Functions;

public class fibionacciNumber {
	
public static boolean checkMember(int n) 
    
    {
		int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 0; i < n; i++) {
            
            c = a+b;
            if (n==c) 
            {

                return true;
                
            }
            
            a=b;
            b=c;
}

return false;        
    }
	
	

	public static void main(String[] args) {
		//checks whether a number is in fibionacci sequence
		System.out.println(checkMember(14));
	}
	

}
