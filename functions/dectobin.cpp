#include<iostream>
using namespace std;
int bin(int n){
int pow =1;
int binary=0;
for(n ; n>0; n=n/2){
int num = n%2;
binary = num*pow + binary;
pow=pow*10;
}
cout << "this is your binary of the number provided is :"<< binary<< endl;


}
int main(){
    int n;
    cout << "enter the decimal number"<< endl;
    cin >> n;
    bin(n);
    return 0;


}