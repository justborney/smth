#include <iostream>
#include <cmath>
#include <cstdio>
using namespace std;

int main() {
	int n,m,k,sum;
	cout<<"n= "; cin>>hex>>n; cout<<endl; 
	cout<<"m= "; cin>>hex>>m;
	for(int i=0;i<=n;i++) {
		k = i;
		sum = 0;
			while (k > 0) {
				sum += k % 15;
				k /= 15;
			}
				if (sum * sum == m) 
					cout<<i<<hex<<"<-----";
				
	}
	return 0;
}
