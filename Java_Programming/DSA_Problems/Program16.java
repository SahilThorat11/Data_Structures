// P16 - Detect Cycle in Undirected Graph (Union-Find)
class Program16 
{
    static int[] parent, rank;

    static int find(int x) 
    {
        if(parent[x] != x) 
        {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    static boolean union(int x, int y) 
    {
        int px = find(x), py = find(y);

        if(px == py) 
        {
            return false; // cycle
        }

        if(rank[px] < rank[py]) 
        {
            parent[px] = py;
        }
        else if(rank[px] > rank[py]) 
        {
            parent[py] = px;
        }
        else 
        { 
            parent[py] = px; rank[px]++; 
        }
        return true;
    }

    public static void main(String[] args) 
    {
        int V = 4;
        int[][] edges = {{0,1},{1,2},{2,3},{3,0}}; // cycle
        parent = new int[V]; rank = new int[V];

        for(int i = 0; i < V; i++) 
        {
            parent[i] = i;
        }

        boolean hasCycle = false;
        for(int[] e : edges)
        {
            if (!union(e[0], e[1])) 
            { 
                hasCycle = true; break; 
            }
        }
        System.out.println("Cycle detected: " + hasCycle);
    }
}
