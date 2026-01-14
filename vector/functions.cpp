#include<iostream>
#include<vector>
using namespace std;
int main(){
vector<int> vec={1,2,3,4,5};
// size
cout << "Size: " << vec.size() << endl;
// to add a element
vec.push_back(6);
for (int i : vec){
    cout << i << endl;
}
//pop back removes last index value
vec.pop_back();
for (int i : vec){
    cout << i << endl;
}
// to print starting and ending value of vector
cout << "First Element: " << vec.front() << endl;
cout << "Last Element: " << vec.back() << endl;
// to get value at any particular index
cout << "Element at index 2: " << vec.at(2) << endl;
return 0;
}