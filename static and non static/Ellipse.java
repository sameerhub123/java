class Ellipse
{
	void area()
	{
		int a=5;
		int b=6;
		final double pi=3.142;
		double r=pi*a*b;
		System.out.println(r);
	}

public static void main(String[] args)
{
	new Ellipse().area();
}
}