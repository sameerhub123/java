class Sample
{
	static void area(int a, int b, int h)
	{
		double r=0.5*h*(a+b);
		System.out.println(r);
	}
}
class Trapezoid
{
	public static void main(String[] args)
	{
		Sample.area(5,6,6);
	}
}