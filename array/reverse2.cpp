#include<iostream>
using namespace std;
void reverse(int arr[],int n){
for (int i = 0; i<=n-1-i; i++)
{
swap(arr[i],arr[n-1-i]);
}

}
int main(){
    int n=7;
    int array[n] = {3,5,7,9,30,88,6};
    reverse(array,n);
for(int i=0; i<n; i++){
    cout << array[i] << " ";
}
return 0;
}
    

