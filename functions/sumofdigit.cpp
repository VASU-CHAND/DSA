#include <iostream>
using namespace std;

int sumof(int n){

int sum=0;
for(n; n>0 ; n=n/10){

    sum = sum + n%10;
}

cout << " the sum of  digits is :"<< sum << endl;
}
int main(){
int n;
cout << " enter the value of n"<< endl;
cin >> n;
sumof(n);
return 0;
}
