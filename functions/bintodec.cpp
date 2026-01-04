#include<iostream>
using namespace std;
int decimal(int n){
    int decimal=0;
    int num=1;
while(n>0)
{ int rem = n%10;
    n=n/10;
    decimal= num*rem + decimal;
    num = num*2;
}
cout << "the decimal of the binary provided is :"<< decimal << endl;




}
int main(){
    int n;
cout << " enter the binary number "<< endl;
cin >> n;
decimal (n);
return 0;


}