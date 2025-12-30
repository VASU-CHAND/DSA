#include <iostream>
using namespace std;

int main() {
    
    // for uppr prt
    for (int i=0; i<2; i++){
        cout << "  vv";
    }
    cout << endl;
    for(int i=0; i<2; i++){
        cout << "v   v";
    }
   cout << endl;
   // lower prt
   for(int i=0; i<5; i++){
        for (int j =0; j<i ; j++){
            cout <<" ";
        }
        cout << "v";
    
            
    for (int j=0; j<5-i-1; j++){
      cout << "  " ;
    }
     cout << "v";
    cout << endl;
    }

    
    return 0;
}