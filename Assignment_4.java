// ASSIGNMENT -4
// 1.  Java Program to Reverse a number using for, while loop and recursion
import java.util.Scanner;
public class Assignment_4 
{
	void Using_for_loop(int number)
	{
		int rev=0;
		for(;number!=0; number=number/10)
		{
			int rem = number %10;
			rev = rev*10 + rem;
		}
		System.out.println(rev);
	}
	void Using_while_loop(int number)
	{
		int rev=0;
		while(number!=0)
		{
			int rem =number%10;
			rev=rev*10+rem;
			number = number/10;
		}
		System.out.println(rev);
	}
	void Using_recursion(int number)
	{
		if(number<10)
		{
			System.out.println(number);
			return;
		}
		else
		{
			System.out.print(number%10);
			Using_recursion(number/10);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Assignment_4 obj=new Assignment_4();
		System.out.println("Enter the number to be reversed:");
		int num=sc.nextInt();
		System.out.println("Reversed number using for loop:");
		obj.Using_for_loop(num);
		System.out.println("Reversed number using while loop:");
		obj.Using_while_loop(num);
		System.out.println("Reversed number using Recursion method:");
		obj.Using_recursion(num);
	}

}
