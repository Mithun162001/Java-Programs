
public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]={
				{1,-2,3},
				{-4,-5,6,9},
				{7},
		};
		
		for(int inner[]:a)
		{
			for(int data: inner)
			{
				System.out.println(data);
			}
		}
	}

}
