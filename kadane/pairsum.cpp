#include<iostream>
#include<vector>
using namespace std;    
vector<int> vect(int n , int tar , vector<int> vec){
    vector<int> ans ;
for(int i=0; i<n; i++){
    for(int j=i+1; j<n; j++){
   if( vec[i] + vec[j]== tar){
    ans.push_back(vec[i]);
    ans.push_back(vec[j]);
    return ans;
   }
}
}
return ans;

}
int main(){
    vector<int> vec= {1,2,3,4,5};
    int n = vec.size();
    int tar = 7;
    vector <int> ans = vect(n,tar,vec);
    cout << ans[0] << " " << ans[1] << endl;
    return 0;

}