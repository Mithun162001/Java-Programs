// Assignment 5
/* Write down a java program to print even and odd numbers series respectively from two 
    threads: t1 and t2 synchronizing on a shared object

    Let t1 print message “ping — >” and t2 print message “,—-pong”.

    Take as command line arguments, the following inputs to the program:
    Sleep Interval for thread t1
    Sleep Interval for thread t2
    Message per cycle
    No of cycles */ 

import java.util.Scanner;
import java.io.*;
public class Threads_2 implements Runnable 
{
  int a,s1,s2;
  Threads_2(int m, int sleep1, int sleep2)
  {
    a=m;
    s1=sleep1;
    s2=sleep2;
  }
    public void run() 
    {
        for (int i = 1; i <= a; i++) 
        {
            synchronized (this) 
            {
                if (i % 2 == 0 && Thread.currentThread().getName().equals("t2")) 
                {
                    try 
                    {
                        notifyAll();
                        System.out.println("Even Thread : " + i);
                        Thread.sleep(s2);
                    } 
                    catch (InterruptedException e) 
                    {
                        e.printStackTrace();
                    }
                } 
                else if (i % 2 != 0 && Thread.currentThread().getName().equals("t1")) 
                {
                    try 
                    {
                        notifyAll();
                        System.out.println("Odd Thread : " + i);
                        Thread.sleep(s1);
                    } 
                    catch (InterruptedException e) 
                    {
                        e.printStackTrace();
                    }
                }
            }
        }

    }

    public static void main(String[] args)throws Exception
    {
      int n;
      System.out.println("enter your no. of numbers for odd or even segregation");
      Scanner sc=new Scanner(System.in);
      n= sc.nextInt();  
      System.out.println("enter sleep time for thread 1");
      int sleep1= sc.nextInt();      
      System.out.println("enter sleep time for thread 2");
      int sleep2= sc.nextInt();
      Threads_2 obj = new Threads_2(n,sleep1,sleep2);
        Thread t1 = new Thread(obj, "t1");
        Thread t2 = new Thread(obj, "t2");
        t1.start();
        t2.start();

    }
}
