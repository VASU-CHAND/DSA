#include<iostream>
using namespace std;
 int fact(int n){
    int fact = 1;

    for (int i = n; i > 0; i--)
    {
        fact = fact * i;
    
    }
  
 cout << "the factorial of n : " << fact << endl;
 return 0;

 }
 int main(){
int num;
cout << "ente rthe value of number"<< endl;
cin >> num;
fact (num);
return 0;


 }