class Sample
{
	static void area(int r, int t)
	{
		
		double a=0.5*r*r*t;
		System.out.println(a);
	}
}
class Sector
{
	public static void main(String[] args)
	{
		Sample.area(5,6);
	}
}