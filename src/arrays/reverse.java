public class reverse {
    public static void reverse(int arr[]){
        int start=0;
        int end =arr.length-1;
        for (int i = 0; i < arr.length/2; i++) {
            int temp= arr[end];
            arr[end]=  arr[start];
            arr[start]= temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
