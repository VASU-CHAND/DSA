#include<iostream>
#include<vector>
using namespace std;
int main(){
    vector<int> v(3,1);
    //3 is sizs of vector and 0 is the value
    for(int i : v){
     cout << i << endl;
    }
     for(int i =0; i<3;i++){
     cout << v[i] << endl;
    }
return 0;
}