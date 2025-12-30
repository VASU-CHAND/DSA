#include <iostream>
using namespace std;
int main(){

int i;
int n;
int j;
cout << "enter the value of n" << endl;
cin >> n;
char ch = 'A';
for(i=0; i<n; i++){
for(j=0; j<i+1; j++){
cout << ch;
}
ch++;
cout << endl;
}
return 0;
}





