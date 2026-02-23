#include<iostream>
using namespace std;
int main(){
int arr[5]={1,2 , 5 , 8 ,4 };
int n=5;
int target=7;
for(int i=0; i<n; i++){
    for(int j=i+1; j<n; j++){
   if( arr[i] + arr[j]== target){
     cout <<arr[i]<< " " << arr[j] << endl;
     break;
   }
}
}
return 0;
}