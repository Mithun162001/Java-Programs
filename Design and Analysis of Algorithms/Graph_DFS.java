import java.io.*;
import java.util.*;

public class Graph_DFS
{
private int V; //No. of vertices
private LinkedList<Integer> adj[]; //Array of lists for Adjacency List Representation
Graph_DFS(int v) //Constructor
{
    V = v;
    adj = new LinkedList[v];
    for (int i=0; i<v; ++i)
        adj[i]= new LinkedList ();
}

void addEdge(int v, int w) //Function to add an edge into the graph
{
    adj[v].add(w);
}

void DFS_1(int v, boolean visited[])
{
    visited[v] = true;
    System.out.println(v+" ");
    Iterator<Integer> i = adj[v].listIterator();
    while(i.hasNext())
    {
        int n = i.next();
        if (!visited[n])
            DFS_1(n, visited);
    }
}

void DFS(int v)
{
    boolean visited[] = new boolean[V];
    DFS_1(v, visited);
}

public static void main (String[] args)
{
    Graph_DFS g= new Graph_DFS(4);
    g.addEdge(0, 1);  // 0 -> 1 -> 2 -> /
    g.addEdge(0, 2);  
    g.addEdge(1, 2);    // 1 -> 2 -> /
    g.addEdge(2, 0);    // 2 -> 0 -> 3 -> /
    g.addEdge(2, 3);    // 3 
    g.addEdge(3, 3);
    System.out.println("Following is Depth First Traversal "+ "(starting from vertex 2)");
    g.DFS(2);
}
}