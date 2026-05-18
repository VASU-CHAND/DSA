import java.util.*;
public class product {
     public static int multi( int a, int b){
        int m= a*b;
        return m;


     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        int  a= sc.nextInt();
        System.out.println("enter b");
        int b= sc.nextInt();
        int c= multi(a,b);
        System.out.println(c);

    }
}
