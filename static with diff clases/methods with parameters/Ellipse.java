class Sample
{
	static void area(int a, int b)
	{
		final double pi=3.142;
		double r=pi*a*b;
		System.out.println(r);
	}
}
class Ellipse
{
	public static void main(String[] args)
	{
		Sample.area(5,6);
	}
}