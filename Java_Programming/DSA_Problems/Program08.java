// P08 - Doubly Linked List
class Program08 
{
    static class Node 
    { 
        int data; 
        Node prev, next; 
        Node(int d) 
        { 
            data = d; 
        } 
    }
    static Node head;

    static void insert(int data) 
    {
        Node node = new Node(data);
        if (head == null) 
        { 
            head = node; return; 
        }

        Node cur = head;

        while(cur.next != null) 
        {
            cur = cur.next;
        }

        cur.next = node; node.prev = cur;
    }

    static void displayForward() 
    {
        Node cur = head;
        System.out.print("Forward: ");
        while(cur != null) 
        { 
            System.out.print(cur.data + " "); 
            cur = cur.next;
        }

        System.out.println();
    }

    static void displayBackward() 
    {
        Node cur = head;
        while (cur.next != null) 
        {
            cur = cur.next;
        }

        System.out.print("Backward: ");

        while(cur != null) 
        { 
            System.out.print(cur.data + " "); cur = cur.prev; 
        }

        System.out.println();
    }

    public static void main(String[] args) 
    {
        insert(1); 
        insert(2); 
        insert(3); 
        insert(4);

        displayForward();
        displayBackward();
    }
}
