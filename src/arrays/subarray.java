public class subarray {
 public static void subarr(int arr[]){
          for (int i = 0; i < arr.length; i++) {
                for( int j=i+1; j<=arr.length; j++ ){
                        for(int k=i;k<j;k++ ){
                        System.err.print(arr[k] +);
                          }
                          System.err.print(" ");
                  }
                          System.err.println("");

            }
 }
 public static void main(String[] args) {
     int numbers[]={2,4,6,8,10};
      subarr(numbers);
 }
}
