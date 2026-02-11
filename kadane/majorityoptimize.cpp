#include<iostream>
#include<algorithm>
using namespace std;
int main(){
    int arr[5]={1,2,2,1,1};
    sort(arr,arr + 5);
    int freq=1;
    for(int i=1; i<5; i++){
        if(arr[i]==arr[i-1]){
            freq++;
        }
        else{
            freq=1;
        }
        if(freq>2){
            cout << arr[i] << endl;
            break;
        }
    }
    return 0;



}