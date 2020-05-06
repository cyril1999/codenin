import java.util.Scanner;
public class sumof2arrays {

    public static int[] sumOfTwoArrays(int[] arr1, int[] arr2)
    {   int big=0;
        if(arr1.length>=arr2.length)
        {
            big = arr1.length;
        }
        else
        {   
            big=arr2.length;
            int[] temp = arr1;
            arr1 = arr2;
            arr2 = temp;
            
        }
        int[] result = new int[big+1];
        int carry = 0;
        int k=result.length-1;
        int i=arr1.length-1,j= arr2.length-1,sum=0;
       
       
            while(j>=0)
        {
            sum=(arr1[i] + carry + arr2[j]);
            result[k] = sum%10;    
            carry = sum/10; 
            k--;
            i--;
            j--;
        }

            while(i>=0)
        {
            sum = arr1[i]+carry ;
            result[k] = sum%10;
            carry = sum/10;
            k--;
            i--;
        }
        
        if(carry!=0)
        {
         result[k] = carry;   
        }
            return result;
	}

    static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr1 = takeInput();
		int[] arr2 = takeInput();
		print(sumOfTwoArrays(arr1, arr2));
	}

}