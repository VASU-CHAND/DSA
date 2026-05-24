import java.util.Scanner;

public class invertnumhalf {
    
    public static void inverted(int n){
    //outer loop
    for(int i=n; i>0; i--){
    
        // innner cols
        for(int j=1; j<=i; j++){
           System.out.print(j);
           }
           System.err.println("");
}
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.err.println("enter the length of pyramid");
    int n= sc.nextInt();
    inverted(n);
    
}
}
