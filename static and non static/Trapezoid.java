class Trapezoid
{
	void area()
	{
		int a=5;
		int b=6;
		int h=6;
		double r=0.5*h*(a+b);
		System.out.println(r);
	}

public static void main(String[] args)
{
	new Trapezoid().area();
}
}