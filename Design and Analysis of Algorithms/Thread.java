import java.util.Scanner;
public class Thread 
{
    public static void main(String args[])
    {
        float div;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a=sc.nextInt();
        System.out.println("Enter the value of b");
        int b=sc.nextInt();
        try
        {
            div= a/b;
            System.out.println("Division of "+a+"/"+b+":"+div);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Can't divide a number by zero");
        }
        sc.close();
    }
}
