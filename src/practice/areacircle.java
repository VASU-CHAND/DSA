
import java.util.Scanner;

public class areacircle {
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number radius of circle");
float r = sc.nextFloat();
float area =3.14f*r*r;
float perimeter=6.28f*r;
System.out.println("the area of cirlce is " + (area));
System.out.println("the perimeter of cirlce is " + (perimeter));
}
}
