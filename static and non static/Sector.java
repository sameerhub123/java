class Sector
{
	void area()
	{
		int r=5;
		int t=6;
		double a=0.5*r*r*t;
		System.out.println(a);
	}

public static void main(String[] args)
{
	new Sector().area();
}
}