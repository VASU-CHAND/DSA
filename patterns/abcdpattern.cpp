#include<iostream>
using namespace std;
int main(){
int n;
cout << "enter the value of n" << endl;
cin >> n;
for(int i=0; i<n; i++){
char ch = 'A';// under declare taake next loop pe wapas A bn jaye
for (int j=0; j<n; j++){
cout << ch;
ch++;
}
  cout << endl;
}
return 0;
}