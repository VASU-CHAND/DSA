public class subarraysum{
 public static int sum(int arr[]){
        int max =Integer.MIN_VALUE;
          for (int i = 0; i < arr.length; i++) {
                for( int j=i+1; j<=arr.length; j++ ){
                        int sum=0;
                        for(int k=i;k<j;k++ ){
                          sum =sum+arr[k];
                          }
                          if(sum>max){
                                max = sum;
                          }
                          
                   }
        
                }
                return max;
              }

 public static void main(String[] args) {
     int numbers[]={1,-2,6,-1 ,3};
      int max=sum(numbers);
      System.err.println(max);

 }
}
