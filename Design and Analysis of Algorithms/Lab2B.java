//                      LAB EXERCISE - 2B
/* Write a program to implements a multi-thread application that has three threads. 
First thread genrates a random integer for every 1 second; 
second thread computes the square of the number and prints; 
third thread will print the value of cube of the number */

import java.lang.Thread;
import java.util.Random;
public class Lab2B
{
    static int randomnum;
    public static void main(String[] args)
    {
        System.out.println("For 10 Random numbers");
        Thread1 t1=new Thread1();
        t1.start();
    }
}
class Thread1 extends Thread
{
    public void run()
    {
        try
        {
            for(int i=0;i<10;i++)
            {
               Random random=new Random();
               Lab2B.randomnum = random.nextInt(20);
               System.out.println(i+" Random integer is "+ Lab2B.randomnum);
               new Thread2().start();
               new Thread3().start();
               Thread.sleep(1000*1);
               System.out.println();
            }
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
class Thread2 extends Thread
{
    public void run()
    {
        System.out.println("Square of "+Lab2B.randomnum*Lab2B.randomnum);
    }
}
class Thread3 extends Thread
{
    public void run()
    {
        System.out.println("Cube of "+Lab2B.randomnum*Lab2B.randomnum*Lab2B.randomnum);
    }
}   