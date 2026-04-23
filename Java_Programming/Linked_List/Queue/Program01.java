class QueueNode
{
    int data;
    QueueNode next;

    QueueNode(int no)
    {
        this.data = no;
        this.next = null;
    }
}

class Queue 
{
    private QueueNode first;
    private QueueNode last;   
    private int iCount;

    Queue() 
    {
        this.first = null;
        this.last = null;
        this.iCount = 0;
    }

    void enqueue(int no) 
    {
        QueueNode newn = new QueueNode(no);

        if (this.first == null) 
        {
            this.first = newn;
            this.last = newn;
        }
        else
        {
            this.last.next = newn;
            this.last = newn;
        }
        this.iCount++;
    }

    int dequeue() 
    {
        if (this.first == null) 
        {
            System.out.println("Queue is empty");
            return -1;
        }

        int value = this.first.data;
        this.first = this.first.next;

        if (this.first == null) 
        {  
            this.last = null;
        }

        this.iCount--;
        return value;
    }

    void display() 
    {
        QueueNode temp = this.first;
        while (temp != null) 
        {
            System.out.print("| " + temp.data + " | -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    int count() 
    {
        return this.iCount;
    }
}

class Program01
{
    public static void main(String A[])
    {
        Queue qobj = new Queue();

        qobj.enqueue(11);
        qobj.enqueue(21);
        qobj.enqueue(51);
        qobj.enqueue(101);

        qobj.display();
        System.out.println("Number of elements in Queue : " + qobj.count());

        System.out.println("Removed Element is : " + qobj.dequeue());

        qobj.display();
        System.out.println("Number of elements in Queue : " + qobj.count());

        System.out.println("Removed Element is : " + qobj.dequeue());

        qobj.display();
        System.out.println("Number of elements in Queue : " + qobj.count());

        qobj.enqueue(121);
        qobj.display();
        System.out.println("Number of elements in Queue : " + qobj.count());
    }
}