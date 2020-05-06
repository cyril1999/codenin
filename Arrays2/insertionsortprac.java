import java.util.Scanner;

public class insertionsortprac {

    public static void insertionSort(int[] arr)
    {
        int  temp;
        for (int i = 0; i < arr.length-1; i++) {

            if (arr[i+1]>=arr[i]) 
            {
                continue;
            }
            else 
            {
                temp=arr[i+1];
                arr[i+1]=arr[i];
                i = i-1;
             
                while (i>-1) 
                {
                    if (arr[i]<=temp) 
                    {
                        arr[i+1]=temp;
                        break;
                    }
                    else 
                    {
                        arr[i+1]=arr[i];
                        i=i-1;    
                    }
                    
                }

                if (i==-1) 
                {
                    arr[0]=temp;
                    
                }
                
            }
            
        }
	}


    public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
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
	}
	
	public static void main(String[] args) {
		int[] arr = takeInput();
        insertionSort(arr);
		print(arr);
	}


}