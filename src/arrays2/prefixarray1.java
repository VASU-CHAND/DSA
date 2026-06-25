public class prefixarray1{

public static int sum(int arr[]){
    int prefix[] = new int[arr.length];
    int sum=0;
    int maxsum=Integer.MIN_VALUE;
    prefix[0]=arr[0];
    for(int i=1; i<arr.length;i++){
     prefix[i]= prefix[i-1] +arr[i];
    }
    for (int i = 0; i< arr.length; i++) {
        for(int j=i; j<arr.length;j++){
            sum= i==0 ? sum=prefix[j] :prefix[j]-prefix[i-1];
          if (maxsum<sum){
              maxsum=sum; }
                                     }  
}

 return maxsum;
}
public static void main(String[] args) {
    int numbers[]={1,-2,6,-1 ,3};
      int max=sum(numbers);
      System.err.println(max);
 
}
}

 
    

