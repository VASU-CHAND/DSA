#include<iostream>
using namespace std;
int main(){
int n;
cout << "enter the number " << endl;
cin >> n;
for(int i=n;i>0;i=i/2){
if(i%2==0){
    continue;
}
else if (i%2==1 && i==1)
{
    cout << "no is power of 2" << endl;
    break;
}

else{
    cout << "no isn't power of 2" << endl;
    break;

}

}   
return 0;
}