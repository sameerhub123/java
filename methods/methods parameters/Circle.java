class Sample
{
	static double area()
	{
		final double pi=3.142;
		int r=5;
		double a=pi*r*r;
		return a;
	}
}
class Circle
{
	public static void main(String[] args)
	{
		double x=Sample.area();
		System.out.println(x);
	}
}