class StackNode
{
    int data;
    StackNode next;

    StackNode(int no)
    {
        this.data = no;
        this.next = null;
    }
}

class Stack
{
    private StackNode top;
    private int iCount;

    Stack()
    {
        this.top = null;
        this.iCount = 0;
    }

    // Push - Add element on top
    void push(int no)
    {
        StackNode newn = new StackNode(no);

        if (this.top == null)
        {
            this.top = newn;
        }
        else
        {
            newn.next = this.top;
            this.top = newn;
        }
        this.iCount++;
    }

    // Pop - Remove element from top
    int pop()
    {
        if (this.top == null)
        {
            System.out.println("Stack is empty");
            return -1;
        }

        int value = this.top.data;
        this.top = this.top.next;

        this.iCount--;
        return value;
    }

    // Peep - View top element without removing
    int peep()
    {
        if (this.top == null)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        return this.top.data;
    }

    // Display all elements
    void display()
    {
        if (this.top == null)
        {
            System.out.println("Stack is empty");
            return;
        }

        StackNode temp = this.top;

        System.out.println();
        
        while (temp != null)
        {
            System.out.println("| " + temp.data + " |");
            temp = temp.next;
        }
        System.out.println("-----");
    }

    int count()
    {
        return this.iCount;
    }

    boolean isEmpty()
    {
        return this.top == null;
    }
}

class Program01
{
    public static void main(String A[])
    {
        Stack sobj = new Stack();

        // Push elements
        sobj.push(11);
        sobj.push(21);
        sobj.push(51);
        sobj.push(101);

        sobj.display();
        System.out.println("Number of elements in Stack : " + sobj.count());

        // Peep
        System.out.println("Top Element is : " + sobj.peep());

        // Pop elements
        System.out.println("Removed Element is : " + sobj.pop());
        sobj.display();
        System.out.println("Number of elements in Stack : " + sobj.count());

        System.out.println("Removed Element is : " + sobj.pop());
        sobj.display();
        System.out.println("Number of elements in Stack : " + sobj.count());

        // Push new element
        sobj.push(121);
        sobj.display();
        System.out.println("Number of elements in Stack : " + sobj.count());
    }
}