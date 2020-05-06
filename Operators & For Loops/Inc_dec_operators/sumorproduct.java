import java.util.Scanner;

public class sumorproduct {
    
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();
        int number = sc.nextInt();
        int result = 0;
        switch (choice) {
            case 1:
                    for (int i = 1; i <= number; i++) {
                       result+=i; 
                    }
                    System.out.println(result);
                    break;
            case 2:
                    result=1;
                    for (int i = 1; i <= number; i++) {
                      result+=i; 
                    }
                    System.out.println(result);
                    break;
            
            default:
                    System.out.println("-1");
                    break;
        }

    }
}