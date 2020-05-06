package fundamentals;

public class continueKeyword {

	public static void main(String[] args) {
		
		int n =5;
		int i = 1;
		int j=1;

		while(i<=n)
		{
			i++;
			if(j==4)
			{
				continue;
			}
			System.out.println(j);	
			
		}
		i=1;
		//this loop goes into infinite loop because
		// at i=4 it skips iteration because of continue
		//checks condition at while and doesn't go to the step
		//of i++ when i=4 therefore i is never incremented it is always
		// stuck at 4
//		while(i<=n)
//		{
//			i++;
//			if(i==4)
//			{
//				continue;
//			}
//			System.out.println(i);	
//			
//		}
//		
		//does not go into infinite because for has an increment argument
		
		for (i = 1; i < n; i++) {
			if(i==4)
			{
				continue;
			}
			
		}

		//goes into infinite because increment or loop step is not specified
		
//		for (i = 1; i < n; ) {
//			if(i==4)
//			{
//				continue;
//			}
//			
//		}
	}

}
