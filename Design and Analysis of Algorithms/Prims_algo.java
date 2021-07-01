import java.util.*;
class PGraph 
{
    public void Prim(int G[][], int V) 
    {
        int INF = 9999999;
        int no_edge;
        boolean[] selected = new boolean[V];
        Arrays.fill(selected, false);
        no_edge = 0;
        selected[0] = true;
        System.out.println("Edge : Weight");
        while (no_edge < V - 1) 
        {
            int min = INF;
            int x = 0; // row number
            int y = 0; // col number
            for (int i = 0; i < V; i++) 
            {
                if (selected[i] == true) 
                {
                    for (int j = 0; j < V; j++) 
                    {
                        if (!selected[j] && G[i][j] != 0) 
                        {
                            if (min > G[i][j]) 
                            {
                                min = G[i][j];
                                x = i;
                                y = j;
                            }
                        }
                    }
            }
        }
        System.out.println(x + " - " + y + " : " + G[x][y]);
        selected[y] = true;
        no_edge++;
    }
}
public static void main(String[] args) 
{
    PGraph g = new PGraph();
    int G[][] = new int[10][10];
    int i, j;
    System.out.println("Enter the number of vertices of the graph");
    Scanner sc = new Scanner(System.in);
    int n;
    n = sc.nextInt();
    System.out.println("Enter the weighted matrix");
    for (i = 0; i < n; i++)
        for (j = 0; j < n; j++)
            G[i][j] = sc.nextInt();
        g.Prim(G, n);
    sc.close();
    }
}