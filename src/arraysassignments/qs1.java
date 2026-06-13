public class qs1 {
    public static boolean check(int arr[]){
       boolean bool=false;
       for (int i = 0; i < arr.length; i++) {
        for (int j = i+1; j < arr.length; j++) {
           if(arr[i]==arr[j]){
            bool=true;
           }
            }
           }
        return bool;
    }
public static void main(String[] args) {
    int nums[]={1,2,3,2};
     boolean bool =check(nums);
     System.err.println(bool);

    
}
    
}
