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
    {
        if(this.first == null && this.last == null)
        {
            return;
        }
        else if(this.first == this.last)
        {
            // Only one node
            this.first = null;
            this.last = null;
        }
        else
        {
            this.first = this.first.next;

            // Restore circular links
            this.first.prev = this.last;
            this.last.next = this.first;
        }

        System.gc();
        this.iCount--;
    }

    public void DeleteLast()
    {
        if(this.first == null && this.last == null)
        {
            return;
        }
        else if(this.first == this.last)
        {
            // Only one node
            this.first = null;
            this.last = null;
        }
        else
        {
            this.last = this.last.prev;

            // Restore circular links
            this.last.next = this.first;
            this.first.prev = this.last;
        }

        System.gc();
        this.iCount--;
    }

    public void DeleteAtPos(int Pos)
    {
        node temp = null;
        int iCnt = 0;

        if((Pos < 1) || (Pos > this.iCount))
        {
            System.out.println("Invalid Position");
            return;
        }

        if(Pos == 1)
        {
            this.DeleteFirst();
        }
        else if(Pos == this.iCount)
        {
            this.DeleteLast();
        }
        else
        {
            temp = this.first;

            for(iCnt = 1; iCnt < Pos; iCnt++)
            {
                temp = temp.next;
            }

            // Bypass the node using both prev and next links
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;

            System.gc();
            this.iCount--;
        }
    }

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

        // Print last node
        System.out.print("| " + temp.data + " | <=> ");
    }

    public int Count()
    {
        return 0;
    }
}
class Program03
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
    
        obj = null;
        System.gc();
    }
}