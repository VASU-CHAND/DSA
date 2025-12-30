//lets calculate the binomial
#include <iostream>
using namespace std;
int binomial(int n , int r){
    int nfact=1;
    int rfact=1;
    int nrfact=1;
for(int i =1; i<=n; i++ ){
nfact = nfact*i;
}
for(int i =1; i<=r; i++ ){
rfact = rfact*i;
}
for(int i =1; i<=(n-r); i++ ){
nrfact = nrfact*i;
}
int ans = (nfact/nrfact)/(rfact);
return ans;
}
    int main(){
int n;
cout << "enter the number " << endl;
cin >> n;
int r;
cout << "enter the number " << endl;
cin >> r;

cout << "the factorial is :" <<binomial (n,r) << endl;
return 0;

    }