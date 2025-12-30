#include <iostream>
using namespace std;
int main(){
    char ch;
cout << "enter the character " << endl;
cin >> ch ;
if(ch >= 'a' && ch <= 'z'){
   cout << "character is lowercase" << endl;

}
else if(ch >= 'A' && ch <= 'z' ){
 cout <<   "character is uppercase" << endl;

}
else {
    cout << "this isnt  a charcter" << endl;
}
return 0;
}