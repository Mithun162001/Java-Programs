// 19BTRCR006, 19BTRCR005, 19BTRCR012, 19BTRCR018
import java.util.Scanner;
abstract class Shape
{
	 abstract void area();
}
	class Rectangle extends Shape
	{
		double  area_rect;
		public void input(int a, int b)
		{
			 area_rect= a*b;
		}
		void area()
		{
			System.out.println("Area of rectangle:" +area_rect);
		}
	}
	class Triangle extends Shape
	{
		double area_tri;
		public void take_input(int b, int h)
		{
			area_tri= 0.5 * b * h;
		}
		void area()
		{
			System.out.println("Area of Triangle:" +area_tri);
		}
	}
public class Multi_level 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Rectangle rect=new Rectangle();
		System.out.println("Enter the value of length");
		int l =sc.nextInt();
		System.out.println("Enter the value of breadth");
		int b=sc.nextInt();
		rect.input(l,b);
		rect.area();
		Triangle tri=new Triangle();
		System.out.println("Enter the value of base");
		int base=sc.nextInt();
		System.out.println("Enter the value of height");
		int height=sc.nextInt();
		tri.take_input(base, height);
		tri.area();
	}

}
