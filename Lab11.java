import java.io.*;
public class Lab11 
{
 public static void main (String s[]) throws FileNotFoundException, IOException
 	{
          File f1 = new File("D:\\3rd-SEM\\OOP Using Java\\Lab11\\input.txt");  
          File f2 = new File("D:\\3rd-SEM\\OOP Using Java\\Lab11\\output.txt");
          FileReader in;
          FileWriter in1;
          FileWriter out;
          PrintWriter out1;
          PrintWriter in2;
          if(!f1.exists()) 
                f1.createNewFile();
          try 
          {
	           in= new FileReader(f1); // what should I do now? nothing is here
	           out = new FileWriter(f2);
	           out1= new PrintWriter(out);
	           in1 = new FileWriter(f1);
	           in2 = new PrintWriter(in1);
	           
	           for(int i=1; i<=10;i++)
	           in2.println(i);
	           in2.close();
	           int k;
	           while ((k=in.read())!=-1)
	           {
	        	   System.out.print((char)k); 
	        	   out1.print((char)k); 		//Writing in new file
	           }
	           out1.close();
	           File f= new File("data.txt");
	           if(f.createNewFile())
	           { 
	        	   System.out.println("File created");
	           }
	           boolean de= f.delete();  		// File deletion
	           System.out.println("File deleted="+de);
	      	}
	        catch (Exception e)
          	{
	        	System.out.println("Error");
	        }
	    }
	}