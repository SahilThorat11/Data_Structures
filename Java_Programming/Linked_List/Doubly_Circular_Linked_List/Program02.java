// Doubly Circular
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
class DoublyCL
{
    private node first;
    private node last;
    private int iCount;

    public DoublyCL()
    {
        System.out.println("Object of DoublyCL gets created.");
        this.first = null;
        this.last = null;
        this.iCount = 0;
    }

    public void InsertFirst(int no)
    {
        node newn = new node(no);

        if(this.first == null && this.last == null)
        {
            // First node points to itself in both directions
            this.first = newn;
            this.last = newn;
        }
        else
        {
            // Connect newn between last and first
            newn.next = this.first;
            this.first.prev = newn;
            this.first = newn;
        }

        // Maintain circular links
        this.first.prev = this.last;
        this.last.next = this.first;

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
    {}

    public int Count()
    {
        return 0;
    }
}
class Program02
{
    public static void main(String A[])
    {
        DoublyCL obj = null;
        obj = new DoublyCL();

        obj.InsertFirst(51);
        obj.InsertFirst(21);
        obj.InsertFirst(11);

        obj = null;
        System.gc();
    }
}