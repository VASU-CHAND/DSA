
import java.util.Scanner;


public class araaycreation {
public static void main(String args[]){
    int matrix[][]=new int[3][3];
    int n=3;
    int m=3;
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < n; i++) {
        for (int j = 0; j< m; j++) {
            System.err.println("enter the element "+(i)+"'th row and "+(j)+"'th coloumn" );
            matrix[i][j]=sc.nextInt();
        }
    }
}
    
}