class Sample
{
	static void area()
	{
		int a=5;
		int b=5;
		int h=5;
		double r=0.5*h*(a+b);
		System.out.println(r);
	}
}
class Trapezoid
{
	public static void main(String[] args)
	{
		Sample.area();
	}
}