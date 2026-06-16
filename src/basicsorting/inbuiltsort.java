import java.util.*;
public class inbuiltsort {
    //Arrays.sort(arr)
    //Arrays.sort(arr,start i,ending i)
    //O(nlogn)
    public static void main(String[] args) {
                         Integer arr[]={5,4,1,3,2};
                         Arrays.sort(arr);
                          for (int i = 0; i < arr.length; i++) {
              System.out.print(arr[i] + " ");
        }
                    System.err.println("");

            Arrays.sort(arr, Collections.reverseOrder());               
         for (int i = 0; i < arr.length; i++) {
              System.out.print(arr[i] + " ");
        }
        
        }
    }
  
