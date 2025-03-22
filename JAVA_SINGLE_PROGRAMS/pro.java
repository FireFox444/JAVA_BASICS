class test
{
void area(int x)
{
	int a=x;
	double and;
	ans=3.14*r*r;
	System.out.println("area of circle is :-"+ans);
}

void area (int x,int y)
{
	int x=l;
	int y=b;
	double ans;
	ans=l*b;
	System.out.println("area of rectange is:-"+ans);
}

void area (int s)
{
	int l=s;
	double ans;
	ans=l*l;
	return ans;

}

}
class pro
{
     	public static void main(String args[])
	{
		test k=new test();
		k.area(6);
		k.area(4,5);

		System.out.println("the area of square is:-"+k.area(8));

	}

}



	
