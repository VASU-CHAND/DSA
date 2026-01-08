#include<iostream>
#include<climits>
using namespace std;
int main(){
    int n=8;
    int array[n];
    int small=INT_MAX;
cout << "enter the elements of the array" << endl;
for(int i=0; i<n; i++){
    cin >> array[i];
    cout << endl;
}
for(int i=0; i<n; i++){
    if(array[i]<small){
        small=array[i];
    }
}
cout << "the smallest element is " << small << endl;
return 0;
}
