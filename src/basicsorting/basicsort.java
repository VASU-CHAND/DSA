


public class basicsort {
    public static void bubblesort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j <arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=0;
                     temp= arr[j+1];
                     arr[j+1]=arr[j];
                     arr[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        bubblesort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
