
import java.util.Scanner;
public class qs2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the side length of the square");
        Float side = sc.nextFloat();
        Float area= side*side;
        System.err.println("the srea of the square is : "+ (area));
   
    }
}