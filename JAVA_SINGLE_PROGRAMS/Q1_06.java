// constructor max

// no. 2 no.3 no. 4


// ------------------------------------------------------------------------------

// string name desighnation ?


import java.util.Scanner;
class overload

{
	void max(int x,int y)
	{	
		if(x>y)
		{
		System.out.println("maximum no. is::"+x);
		}
		else
		{
			System.out.println("maximum no. is::"+y);
		}	

	}

	void max(int x,int y,int z)
	{
		if(x>y && x>z)
		{
		System.out.println("maximum no. is::"+x);
		}
		else if (z>y && z>x)
		{
			System.out.println("maximum no. is::"+z);
		}
		else
		{
			System.out.println("maximum no. is::"+y);
		}	

	}
	void max(int x,int y, int z, int w)
	{
		if(x>y && x>z && x>w)
		{
		System.out.println("maximum no. is::"+x);
		}
		else if (z>y && z>x && z>w)
		{
			System.out.println("maximum no. is::"+z);
		}
		else if(y>z && y>x && y>w)
		{
			System.out.println("maximum no. is::"+y);
		}
		else
		{
			System.out.println("maximum no. is::"+w);
		}		
	}
}

class Q1_06
{
	public static void main(String args[])
	{
		
		overload o1=new overload();
		o1.max(3,4);
		o1.max(5,1,7);
		o1.max(5,1,7,10);
		
	}
}