
import java.util.Scanner;

public class ternaryoperator {
    public static void main(String[] args){
// variable = condition? statement1 : statement2;
//agar condition true hai tw statement 1 true wrna statement 2S
 Scanner sc = new Scanner(System.in);
 int number = sc.nextInt();
String type =((number%2)==0)? "even":"odd";
System.err.println(type);

    }
}
