// Finding the minimum spanning tree using Kruskal's algorithm
import java.util.Scanner;
public class MinSpanTree 
{
    int parent[] = new int[10];
    int find(int m)
    {
        int p =m;
        while(parent[p] != 0)
        {
            p = parent[p];
        }
        return m;
    }

    void union(int i, int j)
    {
        if(i<j)
        {
            parent[i] = j;
        }
        else
        {
            parent[j] = i;
        }
    }

    void krkl(int[][] a, int n)
    {
        int u= 0, v=0, min, k=0,i,j, sum=0;
        while(k < n-1)
        {
            min = 99;   // 99 means there is no edge
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    if(a[i][j] < min && i!=j)
                    {
                        min = a[i][j];
                        u = i;
                        v=j;
                    }
                }
            }
                    i =find(u);
                    j= find(v);
                    if(i!=j)
                    {
                        union(i,j);
                        System.out.println("("+u+","+v+")"+"="+ a[u][v]);
                        sum = sum + a[u][v];
                        k++;
                    }
            a[u][v]= a[v][u] = 99;
        }
        System.out.println("The cost of the minimum spanning tree = "+ sum);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a[][] = new int[10][10];    // adjaceny matrix
        int i,j;
        System.out.println("Enter the number of vertices of the graph");
        int n=sc.nextInt();
        System.out.println("Enter the weighted matrix");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        MinSpanTree obj=new MinSpanTree();
        obj.krkl(a, n); // calling the kruskal's method using object
    }
}
