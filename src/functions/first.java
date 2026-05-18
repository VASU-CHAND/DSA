import java.util.*;

public class first {
    public static int sum(int a , int b){ // parameters and formal parameters
  int sum = a +b;
  return sum;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
             System.out.println("enter num1");
            int num1= sc.nextInt();
            System.out.println("enter num2");
            int num2= sc.nextInt();
           int add= sum( num1 , num2); //arguments and actual parameters
           System.out.println(add);
            
    }
}
 
