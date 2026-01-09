#include<iostream>
using namespace std;    
void reversearray( int arr[],int n){
int start=0;
int end=n-1;
while(start<end){
int temp=arr[start];
arr[start]=arr[end];
arr[end]=temp;
start++;
end--;
}


}
int main(){
int arr[] = {2,9,6,9,5,3};
int sz=6;
reversearray(arr,sz);
for(int i=0;i<sz;i++){
cout<<arr[i]<<" ";
}
return 0;


}