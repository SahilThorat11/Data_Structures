// P17 - Dijkstra's Shortest Path
import java.util.*;

class Program17 
{
    static final int INF = Integer.MAX_VALUE;

    static void dijkstra(int[][] graph, int src) 
    {
        int V = graph.length;
        int[] dist = new int[V];
        boolean[] visited = new boolean[V];
        Arrays.fill(dist, INF);
        dist[src] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.offer(new int[]{src, 0});

        while(!pq.isEmpty())
        {
            int u = pq.poll()[0];
            if(visited[u])
            {
                continue;
            }

            visited[u] = true;
            for(int v = 0; v < V; v++) 
            {
                if(graph[u][v] != 0 && !visited[v] && dist[u] != INF
                        && dist[u] + graph[u][v] < dist[v]) 
                {
                    dist[v] = dist[u] + graph[u][v];
                    pq.offer(new int[]{v, dist[v]});
                }
            }
        }
        System.out.println("Dijkstra from node " + src + ":");
        for(int i = 0; i < V; i++)
        {
            System.out.println("  To " + i + " -> " + (dist[i] == INF ? "INF" : dist[i]));
        }
    }

    public static void main(String[] args) 
    {
        int[][] graph = {
            {0, 4, 0, 0, 0, 0, 0, 8, 0},
            {4, 0, 8, 0, 0, 0, 0,11, 0},
            {0, 8, 0, 7, 0, 4, 0, 0, 2},
            {0, 0, 7, 0, 9,14, 0, 0, 0},
            {0, 0, 0, 9, 0,10, 0, 0, 0},
            {0, 0, 4,14,10, 0, 2, 0, 0},
            {0, 0, 0, 0, 0, 2, 0, 1, 6},
            {8,11, 0, 0, 0, 0, 1, 0, 7},
            {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };
        dijkstra(graph, 0);
    }
}
