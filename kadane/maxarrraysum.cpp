#include<iostream>
using namespace std;
int main(){
    int n=6;
    int ms=0;
    int arr[] ={3 , -4 , 5 , 4 , -1 ,-7 , -8};
    for (int i=0; i<n; i++){
         int cs =0;
     for (int j=i; j<n; j++){
    // cs ka initialize nhi krna gueess why
     cs= cs +arr[j];
      ms= max(ms,cs);
    }
   
}
cout << ms;
    return 0;
}
