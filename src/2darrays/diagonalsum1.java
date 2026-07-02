public class diagonalsum1{
public static int sum(int arr[][]){
    int pd=0;
    int sd=0;
    int mid=arr.length/2;
for (int i = 0; i< arr.length; i++) {
    
    for (int j = 0; j < arr[0].length; j++) {
        if(i==j){
             pd=pd+arr[i][j];
        }
        if(i+j==arr.length-1){
            sd=sd+arr[i][j];
        }

        
    }
}
if(arr.length%2==0){
return sd+pd;
}
else{
    return (sd+pd - arr[mid][mid]);
}



}



public static void main(String[] args) {
    int matrix[][]={
        {1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,16}
    };
      int diagsum=sum(matrix);
    System.err.println(diagsum);

}



}