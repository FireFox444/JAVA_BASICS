class pro5
{
	public static void main(String arg[])
	{ 
		int x=0,y=1,t;

		for(int i=1;i<=25;i++)
     		{
			System.out.println(x);
			t=x+y;
			x=y;
			y=t;
     		}
   	}
}