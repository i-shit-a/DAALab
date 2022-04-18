import java.util.*;
class SelectionSort
{
public static void main (String args[])
{
int T, size, arr[], countComp=0, countSwap=0;
try (Scanner sc= new Scanner (System.in)) {
    T=sc.nextInt();
    while(T>0)
    {
    size=sc.nextInt();
    arr= new int[size];
    for(int i=0; i<size; i++)
    arr[i]=sc.nextInt();
    countComp=0; countSwap=0;
    int min=0;
        for(int i=0; i<size-1; i++)
        {
            min=i;
            for(int j=i+1; j<size; j++)
            {
                countComp++;
                if(arr[j]<arr[min])
                min=j;
            }
            int t=arr[i];
            arr[i]=arr[min];
            arr[min]=t;
            countSwap++;
        }
        for(int i=0; i<size; i++)
        System.out.print(arr[i]+" ");
        System.out.println(" ");
        System.out.println("Comparisons=" +countComp);
       
        System.out.println("Swaps=" +countSwap);
        T--;
    }
}
}
}