class Sample
{
	static void area(int a)
	{
		int r=a*a;
		System.out.println(r);
	}
}
class Square
{
	public static void main(String[] args)
	{
		Sample.area(5);
	}
}