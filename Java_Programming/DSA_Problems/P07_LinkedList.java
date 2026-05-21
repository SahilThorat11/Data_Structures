// P07 - Singly Linked List (insert, delete, display)
class P07_LinkedList 
{
    static class Node 
    { 
        int data; 
        Node next; 
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

        cur.next = node;
    }

    static void delete(int key) 
    {
        if (head == null) 
        {
            return;
        }
        if (head.data == key) 
        { 
            head = head.next; return; 
        }

        Node cur = head;

        while(cur.next != null && cur.next.data != key) 
        {
            cur = cur.next;
        }
        if(cur.next != null)
        {
            cur.next = cur.next.next;
        }
    }

    static void display() 
    {
        Node cur = head;
        while(cur != null) 
        { 
            System.out.print(cur.data + " -> ");
             cur = cur.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) 
    {
        insert(1); 
        insert(2); 
        insert(3); 
        insert(4);

        display();
        delete(3);
        
        System.out.print("After deleting 3: ");
        display();
    }
}
