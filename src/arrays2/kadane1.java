public class kadane1 {
    public static int msum(int arr[]){
         int maxsum=Integer.MIN_VALUE;
         int cs=0;
         for (int i = 0; i < arr.length; i++) {
             cs= cs+arr[i];
             if(cs<0){
                cs=0;
             }
            maxsum= Math.max(cs, maxsum);
         }
             

        return maxsum;
    }
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        int maxsum=msum(arr);
         System.err.println(maxsum);
            
        
    }
}
