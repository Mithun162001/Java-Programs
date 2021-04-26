import java.util.Scanner;
class String_Buffer
{
	String str= "Mithun";
	StringBuffer buff1=new StringBuffer();
	StringBuffer buff2=new StringBuffer("Java is Nice");
	StringBuffer buff3=new StringBuffer(35);
	void method1()
	{
		System.out.println("String length: "+ str.length());
		System.out.println("Before input, String Buffer length: " + buff1.length());
		System.out.println("Before input, String Buffer capacity: " + buff1.capacity());
		System.out.println("With input, String Buffer length: " + buff2.length());
		System.out.println("With input, String Buffer capacity: " + buff2.capacity());
		System.out.println("With capacity input, String Buffer length: " + buff3.length());
		System.out.println("With capacity input, String Buffer capacity: " + buff3.capacity());
	}
	String method2(String s)
    {
        String rev = "";
        int i=s.length()-1;
        while(i>=0) 
        {
            rev = rev+ s.charAt(i--);
        }
        return rev.toUpperCase();
    }
	String method3(String str1, String str2)
	{
		return str1.concat(str2);
	}
	void method4(String input)
	{
		System.out.println("Given only begining index as 3:"+input.substring(3));
        System.out.println("Given begining and end index as (1 to 4) "+input.substring(1,4));
	}
}
public class Lab4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String_Buffer obj=new String_Buffer();
		System.out.println("Checking the length and capacity of String and StringBuffer objects:-");
		obj.method1();
		System.out.println();
		System.out.println("Reversing the contents of a string given on console and convert the resultant string in Upper Case:-");
		System.out.println("Enter the string to be reversed");
		String name=sc.nextLine();
		String reversed= obj.method2(name);
		System.out.println("The reversed string in Upper case:" + reversed);
		System.out.println();
		System.out.println("Input a string from the console and append it to above resultant string:-");
		System.out.println("Enter a string to append");
		String app=sc.nextLine();
		String result= obj.method3(reversed, app);
		System.out.println("The appended string is:" + result);
		System.out.println();
		System.out.println("Extract the substring from resultant string:-");
		obj.method4(result);
		sc.close();
	}
}