class Sample
{
	static void area(int b, int h)
	{
		int a=b*h;
		System.out.println(a);
	}
}
class Rectangle
{
	public static void main(String[] args)
	{
		Sample.area(5,6);
	}
}