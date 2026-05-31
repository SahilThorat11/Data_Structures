// P27 - Topological Sort (Kahn's Algorithm - BFS)
import java.util.*;

class Program27 
{
    public static void main(String[] args) 
    {
        int V = 6;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < V; i++) 
        {
            adj.add(new ArrayList<>());
        }

        // DAG edges
        int[][] edges = {{5,2},{5,0},{4,0},{4,1},{2,3},{3,1}};
        int[] inDegree = new int[V];
        for(int[] e : edges)
        {
             adj.get(e[0]).add(e[1]); inDegree[e[1]]++; 
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < V; i++) 
        {
            if(inDegree[i] == 0) 
            {
                q.add(i);
            }
        }

        List<Integer> order = new ArrayList<>();
        while (!q.isEmpty()) 
        {
            int u = q.poll(); 
            order.add(u);
            for(int v : adj.get(u)) 
            {
                if (--inDegree[v] == 0) 
                {
                    q.add(v);
                }
            }
        }

        System.out.print("Topological Order: ");
        order.forEach(x -> System.out.print(x + " "));
    }
}
