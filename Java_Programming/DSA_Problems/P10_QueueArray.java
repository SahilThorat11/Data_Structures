// P10 - Queue using Array (Circular)
public class P10_QueueArray 
{
    static int[] queue = new int[100];
    static int front = 0, rear = 0, size = 0;

    static void enqueue(int val) 
    {
        if (size == queue.length) 
        { 
            System.out.println("Queue Full"); 
            return; 
        }

        queue[rear] = val;
        rear = (rear + 1) % queue.length;
        size++;
    }

    static int dequeue() 
    {
        if (size == 0) 
        { 
            System.out.println("Queue Empty"); 
            return -1; 
        }

        int val = queue[front];

        front = (front + 1) % queue.length;
        size--;
        return val;
    }

    static int peek() 
    { 
        return size == 0 ? -1 : queue[front]; 
    }

    public static void main(String[] args) 
    {
        enqueue(10);
         enqueue(20);
          enqueue(30);
        System.out.println("Front: " + peek());
        System.out.println("Dequeue: " + dequeue());
        System.out.println("Front after dequeue: " + peek());
    }
}
