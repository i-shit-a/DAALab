#include <iostream>
#include<math.h>
using namespace std;

int main()
{
    int t,i,k,n,x,f=0;
    int a[100];
    cout<<"test cases";
    cin>>t;
    for(i=1;i<=t;i++)
    {cout<<"\n no. of elements";
        cin>>n;
        for(int j=1;j<=n;j++)
        {
            cout<<"\n element";
            cin>>a[j-1];
            
        }cout<<"\n element to find ";
        cin>>k;
        x=sqrt(n);
        if(a[0]==k)cout<<"\npresent at 0";
        for(int i=1;i<n;i*=2)
        {
            if(a[i]==k){cout<<"\npresent at "<<i;f=1;}
            if(a[i]>k)
            {
                for(int j=i;j>=pow(i,1/x);j--)
                {
                    if(a[j]==k)
                    {
                        cout<<"\npresent at "<<j;f=1;
                    }
                }
            }
            else continue;
        }
        if(f==0)cout<<"not present";
    }

}