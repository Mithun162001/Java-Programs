public class Restaurant
{  
  public static void main(String args[]){  
  try{  
   int data=25/0;  
   System.out.println(data);  
  }  
  catch(ArithmeticException e)
  {
	  System.out.println("We are inside catch block only if exception generated and exception type "
	  		+ "match with this try block"+e);
  }  
  finally
  {
	  System.out.println("finally block is always executed");
  }  
  System.out.println("rest of the code...");  
  }  
}
