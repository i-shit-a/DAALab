import java.util.Scanner;
class BinSearch
{
public static void main (String args[])
{
int T, size, x, arr[], count=0, f=0;
Scanner sc= new Scanner (System.in);
    T=sc.nextInt();
    while(T>0)
    {
    size=sc.nextInt();
    arr= new int[size];
    int high=size-1, low=0, mid=0;
    for(int i=0; i<size; i++)
    arr[i]=sc.nextInt();
    x=sc.nextInt();
    while(high>=low)
    {
       f=0; mid=(high+low)/2;
       if(x>arr[mid])
       low=mid+1;
       else if(x<arr[mid])
       high=mid-1;
       else
       { 
           f=1; count=mid; break;
       }
    }
        if(f==1)
        System.out.println("Present" +count);
        else
        System.out.println("Not Present" +size);
        T--;
    }
}
}

