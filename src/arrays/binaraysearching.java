public class binaraysearching {
    public static int search(int arr[] , int key){
      int start=0;
      int end = arr.length -1;
      while(end<=start){
        int mid = (start + end )/2;
        if(mid==key){
          return mid;
        }
       if(mid>key){
        end= mid -1;
       }
       else{
        start= mid+1;
       }
      }
      
    }
    public static void main(String[] args) {
      int num[]={1,5,8,9,10};
        
    }
}
