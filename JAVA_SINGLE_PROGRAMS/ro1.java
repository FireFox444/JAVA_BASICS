class test
{
	void area(int x)
	{
		int a=x;
		double ans;
		ans=3.14*a*a;
		System.out.println("area of circle is ="+ans);
	}

	void area(int x,int y)
	{
		int l=x;
		int b=y;
		int ans;
		ans=l*b;
		System.out.println("area of rectange is="+ans);
	}

	double area(double s)
	{
		double l=s;
		double ans;
		ans=l*l;
		return ans;

	}

}

class ro1
{
     	public static void main(String arg[])
	{
		test k = new test();
		k.area(6);
		k.area(4,5);

		System.out.println("the area of square is="+k.area(8.0));

	}

}



	
