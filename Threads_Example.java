
public class Threads_Example extends Thread
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Threads_Example obj=new Threads_Example();
		obj.start();
		System.out.println("Started");
		System.out.println("Some other stuff");
	}

	public void run()
	{
		System.out.println("Thread running");
	
	}
}