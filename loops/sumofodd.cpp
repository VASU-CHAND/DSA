#include <iostream>
using namespace std;
int main(){
int n ;
int sum =0;
cout << "enter the value of n "<< endl;
cin >> n;
int i;
    for( i= 0; i<= n; i++){
if (i%2 != 0 ){
sum = sum + i;
}
else{
    continue;
}
}
cout << sum << endl;

return 0;
}