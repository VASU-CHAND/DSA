#include<iostream>
using namespace std;
int reversenum(int n){
    int rev=0;
    int num=10;
for(n; n>0; n=n/10){
rev=  rev*num + n%10;
}
cout << "the reverse of the number is :"<< rev << endl;
return 0;
}
int main(){
int n;
cout << "enter the number " << endl;
cin >> n;
reversenum(n);
return 0;
}