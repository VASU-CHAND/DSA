#include <iostream>
using namespace std;
int main(){
    int n;
    cout << "enter the value of n " << endl;
    cin >> n;
    int num = 1;
    int sum =0;
    while(num<=n){
        sum +=num;
        num++;
    }
     cout << sum << endl;   

return 0;
}