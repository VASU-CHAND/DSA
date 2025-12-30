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
//i wanted 012 next line 345 next line 678
//mistake here was that on j =2 i wont cout as condidition 
// will be fulfiled on next itteration
// correct version on correctedpatt1.cpp
int j=0;
for(i =0; i<m; i++){
    for(j; j<n; j++){
    cout <<j;
    }
  cout << endl;
}
return 0;


}