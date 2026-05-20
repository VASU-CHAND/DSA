
import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  favourite number of PRINCESS MEDIS <3");
        int n= sc.nextInt();
        for (int i = 0; i < 10; i++) {
            if(i==0||i==9){
            for (int j = 0; j < 10; j++){
                 System.out.print(n);

            }
            System.out.println("");
        }
            if((i>=2)&&(i<9)){
              System.out.print(n);
              for (int k = 0; k < 8; k++) {
                System.out.print(" ");
                
              }
             System.out.println(n);
            }
             
            }
            
        }
    }

