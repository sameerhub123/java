class Sample
{
	static void area(int b, int h)
	{
		double a=0.5*b*h;
		System.out.println(a);
	}
}
class Triangle
{
	public static void main(String[] args)
	{
		Sample.area(5,6);
	}
}