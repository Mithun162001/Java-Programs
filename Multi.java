class MultiThread extends Thread
{
	public void run()
	{
		System.out.println("Thread"+ Thread.currentThread().getId()+ "is running");
	}
}
public class Multi {

	public static void main(String[] args) {
	
		int n=8;
		for(int i=0;i<n;i++)
		{
			MultiThread obj=new MultiThread();
			obj.start();
		}
	}

}
