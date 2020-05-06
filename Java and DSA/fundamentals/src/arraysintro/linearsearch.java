package arraysintro;

public class linearsearch {

	public static void main(String[] args) {
int arr[] = new int[10];
		int num =10;
for (int i = 0; i < arr.length; i++) 

{
    if (num==arr[i]) {
        System.out.println(i);
        break;
    }
}
        System.out.println(-1);

	}

}
