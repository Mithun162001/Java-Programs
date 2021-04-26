class LinearQueue extends Exception        
{
    int front,rear;
    final int size=5;
    int q[]=new int[size];

    LinearQueue()
    {
        front=0;
        rear=-1;
    }

    LinearQueue(String s)
    {
        super(s);     //calling constructor of super class Exception
    }

    void enqueue(int ele) throws LinearQueue
    {
        try {
            if (rear == -1 || rear < size-1) {
                q[++rear] = ele;
                System.out.println("Q has "+q[rear]+ " at pos "+rear);
            }
            else {
                throw new LinearQueue("Queue is full\n");
            }
        }



        catch(LinearQueue lq) {
            System.out.println(lq.getMessage());
        }
    }

    void dequeue() throws LinearQueue
    {
        try {
            if (front < size) {
                System.out.println("Deleted element is " + q[front++]);
            }
            else {
                if(front==size)
                    front=-1;
                throw new LinearQueue("No elements to delete");
            }
        }
        catch(LinearQueue lq)
        {
            System.out.println(lq.getMessage());
        }
    }
    void display()
    {
        if(front>-1)
        {
            System.out.println("Elements are");
            int k=front;
            for(int i=k;i<=rear;i++)
                System.out.println(q[k++]);
        }
    }      }

public class Lab6 
{
    public static void main(String args[]) throws LinearQueue
    {
        LinearQueue q=new LinearQueue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(50);
        q.display();
        System.out.println("When tried to put sixth element to full queue");
        q.enqueue(60);
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.display();
        q.dequeue();
        q.dequeue();
        System.out.println("When tried to remove sixth element from empty queue");
        q.dequeue();
        q.display();
    }
}