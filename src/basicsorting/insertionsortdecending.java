public class insertionsortdecending {
    public static void insertionsort(int arr[]){
         for (int i= 0; i<arr.length-1; i++){
            //find minimum element
            int minimum=Integer.MAX_VALUE; 
            int minindex=arr.length-i-1;
             for(int j=arr.length-1-i; j>0; j--){
               minimum= Math.min(minimum, arr[j]);
               minindex=j;
            
             }
            //putting min element in the end
            if(arr[arr.length-i-1]>arr[arr.length-i-2]){
            int temp= arr[arr.length -i-1];
            arr[arr.length -i -1]=arr[minindex];
            arr[minindex]=temp;
            }
            

         }
    }
    public static void main(String[] args) {
     int arr[]={2,8,99,3,2,4};
     insertionsort(arr);
     for (int i = 0; i < arr.length; i++) {
        System.err.print( arr[i]+ " ");       
     }
        
    }
}
