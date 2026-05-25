import java.util.*;

public class invertedpy {
    
public static void inverted(int n){
    //outer loop
    for(int i=1; i<=n; i++){
    
        // innner cols
        for(int j=1; j<=n; j++){
           if(j>n-i){
            System.out.print("*");
           }
           else{
            System.out.print(" ");
           }
           }
           System.err.println("");
}
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.err.println("enter the length Of Pyramid");
    int n= sc.nextInt();
    inverted(n);
    
}
}


