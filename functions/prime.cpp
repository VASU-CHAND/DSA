#include <iostream>
using namespace std;

void prime(int num){
for(int i=2;i<num;i++){
int n;
n= num%i;
if(n==0){
cout << "the number isn't prime" << endl;
break;
}
else{
cout << "the number is prime" << endl;
break;
}
}
}
int main(){
int n;
cout << "enter a number" << endl;
cin >> n;
prime(n);
return 0;

}
