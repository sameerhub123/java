class Circle
{
	void area()
	{
		int r=5;
		final double pi=3.142;
		double a=pi*r*r;
		System.out.println(a);
	}

public static void main(String[] args)
{
	new Circle().area();
}
}
