class outer_class
{
	int data_outer=5;
	void outer_method()
	{
		System.out.println("This is a method of outer class");
		System.out.println("Value stored in data in outer class is:"+ data_outer);
	}
	
	class inner_class
	{
		int data_inner=10;
		void inner_method()
		{
			System.out.println("This is a method of inner class");
			System.out.println("Value stored in data in inner class is:"+data_inner);
			System.out.println("The sum of of outer and inner data value is:"+(data_outer+data_inner));
		}
	}
}

public class Lab_pro 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		outer_class out=new outer_class();
		out.outer_method();
		outer_class.inner_class in=out.new inner_class();
		in.inner_method();
	}
}
