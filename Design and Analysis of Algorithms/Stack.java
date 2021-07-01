// Write a Java program to implement the Stack using arrays.
// Write Push(), Pop() and Display() methods to demonstrate its working
import java.util.Scanner;  
public class Stack 
{
    static int[] stack_array;
    static int top= -1; //initializsed top value to -1

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the stack size");
        int n=sc.nextInt();
        stack_array= new int[n];
        while (true)
        {
        System.out.println("Stack Operations available:");
        System.out.println(" 1. Push \n 2. Pop \n 3. Display \n 4. Exit");
        System.out.println("Enter your choice:");
        int choice=sc.nextInt();
        switch (choice) 
        {
            case 1:
                System.out.println("Enter the element to push");
                int ele=sc.nextInt();
                if (top == n-1) // checking whether the stack is full or not
                {
                    System.out.println("Stack overflow");
                }
                else
                {
                    top++;
                    stack_array[top] = ele;
                }
                break;

            case 2:
                if (top == -1)
                {
                    System.out.println("Stack Underflow");  // checking whether the stack is empty or not
                }
                else
                {
                    System.out.println("Element deleted:"+stack_array[top]);
                    top--;
                }
                break;

            case 3:
                if (top == -1)
                {
                    System.out.println("Stack Empty!!!");
                }
                else
                {
                    for(int i=top;i>=0;i--)
                    {
                        System.out.println(stack_array[i]);
                    }
                }
                break;

            case 4:
                System.exit(0);
                break;

            default:
                System.out.println("Enter the proper choice");
                break;
        }
    }
    }
}