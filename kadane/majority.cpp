#include<iostream>
#include<vector>
using namespace std;
int main(){
    vector<int> vec={1,3,3,3,3,5};
    int n = vec.size();
    for(int i : vec){
          int freq =0;
          for (int j : vec){
            if (i==j){
                freq ++;
            }
          }
          if(freq > n/2){
            cout << i << endl;
            break;
          }
    }
    return 0;
}