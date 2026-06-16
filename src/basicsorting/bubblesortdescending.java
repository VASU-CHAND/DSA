public class bubblesortdescending {
    public static void bubblesort(int arr[]){
        for(int i= 0; i<arr.length-1;i++){
            for (int j =arr.length -1 ; j>(i+0); j--) {
                if(arr[j]>arr[j-1]){
                    int temp =arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }

    }
    public static void main(String[] args) {
        int arr[]={4,9,2,4,3,8};
        bubblesort(arr);
        for(int i=0;i<arr.length;i++){
            System.err.print(arr[i] +" ");
        }
    }
}
