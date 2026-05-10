// type consion happen when type is
//  compatible and seatination type> source type
// byte >short>int>float>long>double

import java.util.Scanner;

public class typeconversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a =  sc.newFloat()   this is a big error
        float a = sc.nextInt();
        // no error becuase java coverted it 
        // to float the scanned integer
        float b= 35.999f;
        // int c= int b; this will give error
        int c= (int) b;
        System.out.println(c);
    }
}
