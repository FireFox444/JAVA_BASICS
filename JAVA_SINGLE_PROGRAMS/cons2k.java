import java.util.Scanner;
import java.lang.*;
class test
{
	test()
	{
		System.out.println();
	}
	
	int m1,m2,m3,tot,per;
	test(int x,int y,int z)
	{	m1=x;
		m2=y;
		m3=z;
		
		tot=m1+m2+m3;
		per=tot/3;
		System.out.println("Total Is : "+tot);
		System.out.println("Percentage Is : "+per);
				
		if(per >= 90)
		{
			
			
			System.out.println("Grade Is : A+");
		}
		else if(per>80 && per<=90)
		{
			
			System.out.println("Grade Is : A");
		}
		else if(per>70 && per<=80)
		{
			
			System.out.println("Grade Is : B+");	
		}
 		else if(per>60  && per<=70)
		{
			
			System.out.println("Grade Is : B");
		}
		else if(per>50 && per<=60)
		{
			
			System.out.println("Grade Is : C");
		}
		else 
		{
			System.out.println("Fail");
		}
		
	}
			
}
class consp
{
	public static void main(String args[])
	{
		
		int m1,m2,m3;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Marks Of Subject 1:");
		m1=s1.nextInt();
		
		System.out.println("Enter Marks Of Subject 2:");
		m2=s1.nextInt();
	
		System.out.println("Enter Marks Of Subject 3:");
		m3=s1.nextInt(); 
		
		
		test t1=new test(m1,m2,m3);
		
		
			
	}
}