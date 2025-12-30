#include <iostream>
using namespace std;
int main(){

int a =10;
int b = a++;/*pehle b ko a ki value assign phir 
phir a ++ hoga*/
cout << "b =" << b << endl;
cout << "a =" << a << endl;
int c = ++a; /*pehel increament phir uske baad equal to c*/
cout << "c =" << c << endl;
cout << "a =" << a << endl;

return 0;






}