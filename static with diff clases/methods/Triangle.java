class Sample
{
	static void area()
	{
		int b=5;
		int h=5;
		double a=0.5*b*h;
		System.out.println(a);
	}
}
class Triangle
{
	public static void main(String[] args)
	{
		Sample.area();
	}
}