// P24 - Min Heap (manual implementation)
class Program24 
{
    static int[] heap = new int[100];
    static int size = 0;

    static void insert(int val) 
    {
        heap[size] = val;
        int i = size++;
        while(i > 0 && heap[(i-1)/2] > heap[i]) 
        {
            int t = heap[i]; heap[i] = heap[(i-1)/2]; heap[(i-1)/2] = t;
            i = (i-1)/2;
        }
    }

    static int extractMin() 
    {
        int min = heap[0];
        heap[0] = heap[--size];
        int i = 0;
        while(true) 
        {
            int l = 2*i+1, r = 2*i+2, smallest = i;
            if(l < size && heap[l] < heap[smallest]) 
            {
                smallest = l;
            }
            if(r < size && heap[r] < heap[smallest]) 
            {
                smallest = r;
            }
            if(smallest == i) 
            {
                break;
            }

            int t = heap[i]; heap[i] = heap[smallest]; heap[smallest] = t;
            i = smallest;
        }
        return min;
    }

    public static void main(String[] args) 
    {
        for (int v : new int[]{5, 3, 8, 1, 9, 2}) 
        {
            insert(v);
        }
        System.out.print("Heap extract order (min first): ");
        while(size > 0) 
        {
            System.out.print(extractMin() + " ");
        }
    }
}
