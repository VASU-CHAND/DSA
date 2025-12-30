#include<iostream>
using namespace std;
int main(){
int i;
int n;// n for row
int m;// m for coloumn
cout << "enter the value of n" << endl;
cin >> n;
cout << "enter the value of m" << endl;
cin >> m;

int j;
for(i =0; i<m; i++){
    for(j=0; j<n; j++){
    cout <<"*";
    }
  cout << endl;
}
return 0;


}