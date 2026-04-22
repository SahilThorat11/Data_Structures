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
    {
        node newn = new node(no);

        if(this.first == null && this.last == null)
        {
            this.first = newn;
            this.last = newn;
        }
        else
        {
            // Connect newn after last
            this.last.next = newn;
            newn.prev = this.last;
            this.last = newn;
        }

        // Maintain circular links
        this.last.next = this.first;
        this.first.prev = this.last;

        this.iCount++;
    }

    public void InsertAtPos(int no, int Pos)
    {
        node newn = null;
        node temp = null;
        int iCnt = 0;

        if((Pos < 1) || (Pos > this.iCount + 1))
        {
            System.out.println("Invalid Position");
            return;
        }

        if(Pos == 1)
        {
            this.InsertFirst(no);
        }
        else if(Pos == this.iCount + 1)
        {
            this.InsertLast(no);
        }
        else
        {
            newn = new node(no);
            temp = this.first;

            for(iCnt = 1; iCnt < Pos - 1; iCnt++)
            {
                temp = temp.next;
            }

            // Connect newn between temp and temp.next
            newn.next = temp.next;
            newn.prev = temp;
            temp.next.prev = newn;
            temp.next = newn;

            this.iCount++;
        }
    }

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

        while(temp != this.last)
        {
            System.out.print("| " + temp.data + " | <=> ");
            temp = temp.next;
        }

        System.out.print("| " + temp.data + " | <=> ");
        System.out.println();
    }

    public int Count()
    {
        return this.iCount;
    }
}
class Program06
{
    public static void main(String A[])
    {
        DoublyCL obj = null;
        int iRet = 0;
        obj = new DoublyCL();

        obj.InsertFirst(51);
        obj.InsertFirst(21);
        obj.InsertFirst(11);

        obj.Display();
        iRet = obj.Count();
        System.out.println("Number of nodes are : " + iRet);

        obj.InsertLast(101);
        obj.InsertLast(111);
        obj.InsertLast(121);

        obj.Display();
        iRet = obj.Count();
        System.out.println("Number of nodes are : " + iRet);

        obj.InsertAtPos(75, 4);
        obj.Display();
        iRet = obj.Count();
        System.out.println("Number of nodes are : " + iRet);

        obj = null;
        System.gc();
    }
}