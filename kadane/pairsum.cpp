#include<iostream>
#include<vector>
using namespace std;
vector<int> pairsum(vector<int> nums , int target ,int n){
     vector<int> ans;
for(int i=0; i<n; i++){
    for(int j=i+1; j<n; j++){
        if(nums[i]+nums[j]==target){
            ans.push_back(nums[i]);
            ans.push_back(nums[j]);
            return ans;
        }
    }
}
return ans;
}
int main(){
    vector<int> nums ={2,7,11,15};
    int target=9;
    int n= 4;
    vector<int> ans = pairsum(nums , target , n );
      cout << ans[0] <<endl;
      cout << ans[1] <<endl;
    

}
