#include <iostream>
using namespace std;
int main(){
int n;
cout << "enter the value of n for the number pyramid" << endl;
cin >> n;

    for( int i=0; i<n; i++){
     for (int j=0; j<n-1-i; j++){
        cout << " ";
     }
     for( int j=0; j<i+1; j++){
        cout << j+1;
     }
     for(int k=i; k>0; k--) {
        cout << k;
     }
     cout << endl;
    }
}