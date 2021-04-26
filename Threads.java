// Assignment 5
// Write a program  to create two threads, one prints “HELLO” and other prints “HI”
class Hello implements Runnable 
{
    public void run()
    {
            System.out.println("HELLO");
            try
            {
                Thread.sleep(100);
            } 
            catch(Exception e)
            {
                System.out.println(e);
            } 
    }
}

class Hi implements Runnable 
{
    public void run()
    {
            System.out.println("HI");
            try
            {
                Thread.sleep(100);
            } 
            catch(Exception e)
            {
                System.out.println(e);
            }
    }
}

public class Threads
{
    public static void main(String[ ] args) 
    {
        Thread t1 = new Thread(new Hello());
        Thread t2 = new Thread(new Hi());
        //Thread 1
        try 
        {
            t1.start();
        } 
        catch (Exception e)
        {
            System.out.println(e);
        }
        //Thread 2
        try
        {

            t2.start ();
        }
        catch(Exception e) 
        {
            System.out.println(e);
        }
}
}