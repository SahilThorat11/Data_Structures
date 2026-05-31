// P25 - HashMap using Chaining
import java.util.LinkedList;

class Program25 
{
    static final int SIZE = 10;
    @SuppressWarnings("unchecked")
    static LinkedList<int[]>[] table = new LinkedList[SIZE];

    static void put(int key, int val) 
    {
        int idx = key % SIZE;
        if(table[idx] == null)
        {
            table[idx] = new LinkedList<>();
        }

        for(int[] entry : table[idx])
        {
            if (entry[0] == key) 
            { 
                entry[1] = val; 
                return; 
            }
        }
        table[idx].add(new int[]{key, val});
    }

    static int get(int key) 
    {
        int idx = key % SIZE;
        if(table[idx] == null)
        {
            return -1;
        }

        for(int[] entry : table[idx])
        {
            if (entry[0] == key) 
            {
                return entry[1];
            }
        }
        return -1;
    }

    public static void main(String[] args) 
    {
        put(1, 10);
        put(2, 20); 
        put(11, 110); 
        put(21, 210);

        System.out.println("get(1)  = " + get(1));
        System.out.println("get(11) = " + get(11));
        System.out.println("get(21) = " + get(21));
        System.out.println("get(99) = " + get(99));
    }
}
