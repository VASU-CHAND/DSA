public class isprime {
    public static boolean prime(int n){
    boolean iprime=true;
    for (int i = 2; i < n-1; i++) {
        if(n%i==0){
            iprime=false;
            break;
        }
    }

                    return iprime;

    }
    public static void main(String[] args) {
        System.err.println(prime(5));
    }
}
