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
for(int i=0; i<n; i++){
    int n =array[i];
    if (n==small)
    {
        cout << "the index of the smallest element is " << i << endl;
    
    }
}
return 0;
}
