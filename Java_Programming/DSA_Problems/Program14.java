// P14 - Graph BFS (Adjacency List)
import java.util.*;

class Program14 
{
    static int V = 6;
    static List<List<Integer>> adj = new ArrayList<>();

    static void addEdge(int u, int v) 
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void bfs(int start) 
    {
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        visited[start] = true; q.add(start);
        System.out.print("BFS from " + start + ": ");
        while (!q.isEmpty()) 
        {
            int node = q.poll();
            System.out.print(node + " ");
            for(int nb : adj.get(node))
            {
                if (!visited[nb]) 
                { 
                    visited[nb] = true; q.add(nb); 
                }
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
        bfs(0);
    }
}
