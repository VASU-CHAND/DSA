import java.util.*;
public class qs3{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.err.println("enter the pencil rate");
        Float a= sc.nextFloat();
        System.err.println("enter the pen rate");
                Float b= sc.nextFloat();

        System.err.println("enter the eraser rate");
                Float c= sc.nextFloat();

        Float bill= (a+b +c)/3;
        System.err.println("the bill :"+(bill));







    }
}