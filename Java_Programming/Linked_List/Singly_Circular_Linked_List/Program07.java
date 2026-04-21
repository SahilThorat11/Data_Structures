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
    {
        node newn = new node(no);

        if(this.first == null)
        {
            this.first = newn;
            newn.next = this.first;
        }
        else
        {
            node temp = this.first;

            while(temp.next != this.first)
            {
                temp = temp.next;
            }

            newn.next = this.first;
            this.first = newn;
            temp.next = this.first;
        }

        this.iCount++;
    }

    public void InsertLast(int no)
    {
        node newn = new node(no);

        if(this.first == null)
        {
            this.first = newn;
            newn.next = this.first;
        }
        else
        {
            node temp = this.first;

            while(temp.next != this.first)
            {
                temp = temp.next;
            }

            temp.next = newn;
            newn.next = this.first;
        }

        this.iCount++;
    }

    public void DeleteFirst()
    {
        if(this.first == null)
        {
            return;
        }
        else if(this.iCount == 1)
        {
            this.first = null;
        }
        else
        {
            node temp = this.first;

            while(temp.next != this.first)
            {
                temp = temp.next;
            }

            this.first = this.first.next;
            temp.next = this.first;
        }

        this.iCount--;
        System.gc();
    }

    public void DeleteLast()
    {
        if(this.first == null)
        {
            return;
        }
        else if(this.iCount == 1)
        {
            this.first = null;
        }
        else
        {
            node temp = this.first;

            while(temp.next.next != this.first)
            {
                temp = temp.next;
            }

            temp.next = this.first;
        }

        this.iCount--;
        System.gc();
    }

    public void Display()
    {
        if(this.first == null)
        {
            return;
        }

        node temp = this.first;

        System.out.println();
        do
        {
            System.out.print("| " + temp.data + " | -> ");
            temp = temp.next;
        } while(temp != this.first);

        System.out.println();
    }

    public int Count()
    {
        return this.iCount;
    }

    public void InsertAtPos(int no, int Pos)
    {}

    public void DeleteAtPos(int Pos)
    {}
}

class Program07
{
    public static void main(String A[])
    {
        SinglyCL obj = new SinglyCL();

        obj.InsertFirst(51);
        obj.InsertFirst(21);
        obj.InsertFirst(11);

        obj.Display();
        System.out.println("Number of nodes are : " + obj.Count());

        obj.InsertLast(101);
        obj.InsertLast(111);
        obj.InsertLast(121);

        obj.Display();
        System.out.println("Number of nodes are : " + obj.Count());

        obj.DeleteFirst();
        obj.Display();
        System.out.println("Number of nodes are : " + obj.Count());

        obj.DeleteLast();
        obj.Display();
        System.out.println("Number of nodes are : " + obj.Count());

        obj = null;
        System.gc();
    }
}
