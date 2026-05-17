import java.util.*;
public class invertedstar {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n= sc.nextInt();

        for(int line=n; line>0; line--){
            for(int star=line; star>0; star-- ){
             System.err.print("*");
            }
            System.err.println("");
        }
    }
}
