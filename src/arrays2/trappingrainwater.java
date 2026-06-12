

public class trappingrainwater {
    public static int trapwater(int arr[]){
      int qty=0;
      int width =1;
      int leftmax[]=new int[arr.length];
      int rightmax[]=new int[arr.length];
       leftmax[0]=arr[0];
       rightmax[arr.length-1]=arr[arr.length-1];
       for (int i = 1; i < arr.length; i++) {
        leftmax[i]=Math.max(leftmax[i-1], arr[i]);
           
       }
        for (int i = arr.length-1; i >0; i--) {
        rightmax[i-1]=Math.max(rightmax[i],arr[i-1]);
           
        }
        for (int i = 0; i < arr.length; i++) {
            int waterlevel=Math.min(leftmax[i],rightmax[i]);
            qty= qty+(waterlevel-arr[i])*width;
            
        }

        return qty;
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        int qty= trapwater(height);
        System.err.println(qty);
          

    }
}
