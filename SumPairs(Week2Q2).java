import java.util.*;
class SumPairs
{
public static void main (String args[])
{
int arr[], size=0, T, f=0;
Scanner sc= new Scanner (System.in);
    T=sc.nextInt();
    while(T>0){
    size=sc.nextInt();
    arr= new int[size];
    for(int k=0; k<size; k++)
    arr[k]=sc.nextInt();
    for(int i=0; i<size; i++)
    {
       
     for(int j=i+1; j<size-1; j++)
     {
        
         for(int k=j+1; k<size-2; k++)
         {
             
         if(arr[i]+arr[j]==arr[k])
        { System.out.println((i+1) + "," + (j+1) + "," + (k+1)); f=1;}
        
         }
     }
   
    }   
    if(f==0)
     System.out.println("No Sequence Found");
     T--;
    }
} 