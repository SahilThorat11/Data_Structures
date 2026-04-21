// Singly Circular Linked List

class node
{
    public int data;
    public node next;

    public node(int no)
    {
        this.data = no;
        this.next = null;
    }
}

class SinglyCL
{
    private node first;
    private int iCount;

    public SinglyCL()
    {
        this.first = null;
        this.iCount = 0;
    }

    public void InsertFirst(int no)
    {}

    public void InsertLast(int no)
    {}

    public void DeleteFirst()
    {}

    public void DeleteLast()
    {}

    public void Display()
    {}

    public int Count()
    {
        return this.iCount;
    }

    public void InsertAtPos(int no, int Pos)
    {}

    public void DeleteAtPos(int Pos)
    {}
}

class Program01
{
    public static void main(String A[])
    {
        SinglyCL obj = new SinglyCL();

        obj = null;
        System.gc();
    }
}
