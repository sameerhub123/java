class Sample
{
	static void area()
	{
		final double pi=3.142;
		int r=5;
		double a=pi*r*r;
		System.out.println(a);
	}
}
class Circle
{
	public static void main(String[] args)
	{
		Sample.area();
	}
}