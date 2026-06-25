public class kadane1 {
    public static int msum(int arr[]){
         int maxsum=Integer.MIN_VALUE;
         int cs=0;
         for (int i = 0; i < arr.length; i++) {
             cs= cs+arr[i];
         }
             

        return maxsum;
    }
    public static void main(String[] args) {
        
    }
}
