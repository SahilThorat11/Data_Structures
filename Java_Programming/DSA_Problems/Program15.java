// P15 - Graph DFS (Adjacency List)
import java.util.*;

class Program15 
{
    static int V = 6;
    static List<List<Integer>> adj = new ArrayList<>();

    static void addEdge(int u, int v) 
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void dfs(int node, boolean[] visited) 
{
        visited[node] = true;
        System.out.print(node + " ");
        for(int nb : adj.get(node))
        {
            if(!visited[nb]) 
            {
                dfs(nb, visited);
            }
        }
    }

    public static void main(String[] args) 
    {
        for(int i = 0; i < V; i++) 
        {
            adj.add(new ArrayList<>());
        }
        
        addEdge(0, 1); 
        addEdge(0, 2); 
        addEdge(1, 3);
        addEdge(2, 4); 
        addEdge(3, 5);

        boolean[] visited = new boolean[V];
        System.out.print("DFS from 0: ");
        dfs(0, visited);
    }
}
