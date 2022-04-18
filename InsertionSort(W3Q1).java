import java.util.*;
class InsertionSort
{
public static void main (String args[])
{
int T, size, arr[], countComp=0, countShift=0;
try (Scanner sc= new Scanner (System.in)) {
    T=sc.nextInt();
    while(T>0)
    {
    size=sc.nextInt();
    arr= new int[size];
    for(int i=0; i<size; i++)
    arr[i]=sc.nextInt();
    countComp=0; countShift=0;
    int key=0;
        for(int i=1; i<size; i++)
        {
            key=arr[i];
            int j=i-1;
            countShift++;
           while(j>=0 && arr[j]>=key)
           {
               countShift++; 
               countComp++;
               arr[j+1]=arr[j];
               j=j-1;
           }
           arr[j+1]=key;
        }
        for(int i=0; i<size; i++)
        System.out.print(arr[i]+" ");
        System.out.println(" ");
        System.out.println("Comparisons=" +countComp);
        System.out.println("Shifts=" +countShift);
        T--;
    }
}
}
}
