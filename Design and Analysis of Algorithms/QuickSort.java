import java.util.*;
public class QuickSort
{
    void sort(int[] a,int low,int high)
    {
    int mid = (low+high)/2;
    int i = low;
    int j = high;
    int pivot = a[mid];
    while(i<=j)
    {
        while(a[i] < pivot)
        {
            i++;
        }
        while(a[j] > pivot)
        {
            j--;
        }
        if(i<=j)
        {
            int temp = a[i];
            a[i]= a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }
    if(low < j)
        sort(a,low,j);

    if(high > i)
        sort(a,i,high);
}
public static void main(String[] args)
{
    int[] array = new int[21];
    System.out.println("QUICK SORT");
    System.out.println("-----------------------------------------------");
    System.out.println("enter array size");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Random r = new Random();
    for(int i=0 ; i<n ;i++)
    {
        array[i] = r.nextInt(51);
    }

    System.out.println("array before sorting : ");
    for(int i=0 ; i<n ;i++)
    {
        System.out.println(array[i]+" ");
    }
    long startTime = System.nanoTime();
    QuickSort q = new QuickSort();
    q.sort(array,0,n-1);
    long stopTime = System.nanoTime();
    long elapseTime = (stopTime - startTime);
    System.out.println("\nTime taken to sort array is:" + elapseTime + "nanoseconds");
    System.out.println("\narray after sorting : ");
    for(int i=0 ; i<n ;i++)
    {
        System.out.println(array[i]+" ");
    }
    sc.close();
}
}