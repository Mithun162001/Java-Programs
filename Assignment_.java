// 2. Java Program to check palindrome string using Recursion.
import java.util.Scanner;
class Recursion
{
	public boolean check_palindrome(String str)
	{
		if(str.length()==0 || str.length()== 1)
		{
			return true;
		}
		if(str.charAt(0) == str.charAt(str.length()-1))
		{
			return check_palindrome(str.substring(1, str.length()-1));
		}
		return false;
	}
}
public class Assignment_ 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Recursion obj=new Recursion();
		System.out.println("Enter the string to be reversed:");
		String str=sc.nextLine();
		str= str.toLowerCase();
		if(obj.check_palindrome(str))
		{
			System.out.println(str+ " is a palindrome");
		}
		else
		{
			System.out.println(str+ " is not a palindrome");
		}
	} }
