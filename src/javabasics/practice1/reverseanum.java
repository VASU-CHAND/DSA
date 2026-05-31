public class reverseanum {
    public static void main(String[] args) {
        int num =10899;
        int revnum=0;
        for(int i=0; i<5; i++){
             int no=num%10;
             num=num/10;
             revnum=revnum*10 +no;
        }
         System.err.println(revnum);
    }
}
