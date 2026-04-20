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
    {
        node newn = new node(no);

        newn.next = this.first;

        // If list is not empty, set existing first's prev to new node
        if(this.first != null)
        {
            this.first.prev = newn;
        }

        this.first = newn;
        this.iCount++;
    }

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
    {
        node temp = null;
        temp = this.first;

        System.out.println();

        while(temp != null)
        {
            System.out.print("| "+temp.data+" | <-> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public int Count()
    {
        return this.iCount;
    }
}

class Program04
{
    public static void main(String A[])
     {
        DoublyLL obj = null;
        int iRet = 0;

        obj = new DoublyLL();

        obj.InsertFirst(51);
        obj.InsertFirst(21);
        obj.InsertFirst(11);

        obj.Display();
        iRet = obj.Count();
        System.out.println("Number of nodes are : " + iRet);

        // Important for memory deallocation
        obj = null;
        System.gc();
    }
}