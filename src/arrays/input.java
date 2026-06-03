
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        int marks[]= new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            marks[i]=sc.nextInt();
        
        }
        for (int i = 0; i < 5; i++) {
            System.err.println(marks[i]);
            
        }
    }
    
}
