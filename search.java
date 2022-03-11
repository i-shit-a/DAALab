import java.util.*;
class search
{
public static void main (String args[])
{
int T, size, x, arr[], count=0;
try (Scanner sc= new Scanner (System.in)) {
    T=sc.nextInt();
    while(T>0)
    {
    size=sc.nextInt();
    arr= new int[size];
    for(int i=0; i<size; i++)
    arr[i]=sc.nextInt();
    x=sc.nextInt();
    int f=0;
        for(int i=0; i<size; i++)
        {
            if(arr[i]==x)
            {
                count=i;
                f=1;
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
}