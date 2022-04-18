import java.util.*;
class AbsoluteDifference
{
public static void main (String args[])
{
int arr[], size=0, diff=0, c=0, key, T;
Scanner sc= new Scanner (System.in);
    T=sc.nextInt();
    while(T>0){
    size=sc.nextInt();
    arr= new int[size];
    key=sc.nextInt();
    for(int k=0; k<size; k++)
    arr[k]=sc.nextInt();
    for(int i=0; i<size; i++)
    {
     for(int j=0; j<size; j++)
     {
        diff=(int)Math.abs(arr[i]-arr[j]);
        if(diff==key)
        {c++;}
     }
   
    }   
    System.out.println(c);
    T--;
    }
}
}