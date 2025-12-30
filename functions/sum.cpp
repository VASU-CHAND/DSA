#include <iostream>
using namespace std;

int sum(int n){
int sum =0;
for (int i = 0; i <= n; i++)
{
sum= sum +i;

}
cout << "the value of sum is =" << sum << endl;

}

int main(){
int n;
cout << "enter the value of n" << endl;
cin >> n;
sum(n);




}