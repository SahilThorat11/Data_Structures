// Doubly Linear 

class node
{
    public int data;
    public node next;
    public node prev;

    public node(int no)
    {
        this.data = no;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLL
{
    private node first;

    private int iCount;

    public DoublyLL()
    {
        System.out.println("Object of DoublyLL gets created.");
        this.first = null;

        this.iCount = 0;
    }

    public void InsertFirst(int no)
    {}

    public void InsertLast(int no)
    {}

    public void InsertAtPos(int no, int Pos)
    {}

    public void DeleteFirst()
    {}

    public void DeleteLast()
    {}

    public void DeleteAtPos(int Pos)
    {}

    public void Display()
    {}

    public int Count()
    {
        return this.iCount;
    }
}

class Program02
{
    public static void main(String A[])
     {
        DoublyLL obj = null;
        int iRet = 0;

        obj = new DoublyLL();

        // Important for memory deallocation
        obj = null;
        System.gc();
    }
}