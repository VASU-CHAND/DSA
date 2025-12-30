#include <iostream>
using namespace std;
int main(){
    char grade = 'a';
    int value = grade;
    double price = 100.99;
    int newprice = (int)price; // decimal ke baad ki sari values ignore
    cout << newprice << endl;
    cout << value << endl;
    return 0;
}