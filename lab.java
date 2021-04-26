import java.io.*;
public class lab 
{

	public static void main(String[] args) 
	{
		StringBuffer buff2=new StringBuffer("Mithun");
		StringBuffer rev = new StringBuffer();
        int i=buff2.length()-1;
        while(i>=0) 
        {
            rev = rev.append(buff2.charAt(i--));
        }
        System.out.println(buff2.reverse());
		// TODO Auto-generated method stub

	}

}
