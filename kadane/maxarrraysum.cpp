#include<iostream>
using namespace std;
int main(){
    int n=6;
    int arr[] ={1,2,-9,-7,-4, 7};
    
    int ms=0;
    for(int st=0; st<n; st++){
     int cs=0;
     for(int end=st; end<n; end++){
      cs += arr[end];
      ms = max(cs,ms);
     }
    }
cout << ms;
    return 0;
}
