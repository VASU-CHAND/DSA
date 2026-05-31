
import java.util.Scanner;

public class rectanglepat {
    
public static void hollowrec(int rows , int cols){
    //outer loop
    for(int i=1; i<=rows; i++){
        // innner cols
        for(int j=1; j<=cols; j++){
            if(i==1|| i==rows || j==1|| j==cols){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
                 }
             System.out.println();

           }
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.err.println("enter the length of rectangle");
    int row= sc.nextInt();
    System.err.println("enter the breadth of rectangle");
    int col=sc.nextInt();
     hollowrec(row, col);
}
}
