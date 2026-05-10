// in an expression of any kin like a* b + c  fiffternt type
//  of datatypes then java automatically promotes them into 
// integer
// if one operant is long float or double whole exp is promoted
//  to long,float the whole expression is converted to it
public class typepromotion {


    public static void main(String[] args) {
       char a='a';
       char b='b';
       System.err.println((int)(a));
      System.err.println((int)(b));
      System.err.println(a-b);


    }
}
