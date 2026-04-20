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
    {
        node newn = new node(no);
        node temp = null;

        if(this.first == null)
        {
            this.first = newn;
        }
        else
        {
            temp = this.first;

            // Traverse to the last node
            while(temp.next != null)
            {
                temp = temp.next;
            }

            temp.next = newn;
            newn.prev = temp;   // Link back to previous node
        }

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

            // Update the next node's prev pointer
            if(temp.next != null)
            {
                temp.next.prev = newn;
            }

            temp.next = newn;
            this.iCount++;
        }
    }

    public void DeleteFirst()
    {
        if(this.first == null)
        {
            return;
        }
        else if(this.first.next == null)
        {
            this.first = null;
        }
        else
        {
            this.first = this.first.next;
            this.first.prev = null;     // New first has no previous node
        }

        System.gc();
        this.iCount--;
    }

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
class Program07
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

        obj.DeleteFirst();
        obj.Display();
        iRet = obj.Count();
        System.out.println("Number of nodes are : " + iRet);
        
        // Important for memory deallocation
        obj = null;
        System.gc();
    }
}