#include<iostream>
#include<climits>
using namespace std;
int main(){
    int n=6;
    int ms=INT_MIN;
    int cs=0;
    int arr[] ={3 , -4 , 5 , 4 , -1 ,-7 , -8};
    for (int i=0; i<n; i++){
         cs= cs+ arr[i];
          ms= max(ms,cs);
         if(cs<0){
             cs=0;
         }
        
    }
   cout << ms;
    return 0;
}
    

