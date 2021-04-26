public class method_overloading
{
   void sum(int a,int b)
   {
	   System.out.println("Output of 2 integers parameterized method: "+ (a+b));
   }
   void sum(int a,int b,int c)
   {
	   System.out.println("Output of 3 integers parametrized method: "+ (a+b+c));
	}
   void sum(int a, double b)
   {
	   System.out.println("Output of 1 integer and 1 double parametrized method: "+(a+b));
   }
   void sum(double a, double b, double c)
   {
	   System.out.println("Output of 3 double parameterized paramters: "+ (a+b+c));
   }
   public static void main(String args[])
   {
	  method_overloading obj = new method_overloading();
      obj.sum(30, 20);
      obj.sum(10, 20,30);
      obj.sum(12, 10.25);
      obj.sum(10.5, 20.5,5.5);
   }
}