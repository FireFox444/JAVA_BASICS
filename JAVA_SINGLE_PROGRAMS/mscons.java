import java.io.*;
class kalu
{
	int a,b,c;
	float total,per;
	void kalu()
	{
		System.out.println("hello");
	}
	void kalu(int a,int b,int c)
	{
	

		total=a+b+c;
		per=(total*100)/300;

		System.out.println("mark 1 :"+a);
		System.out.println("mark 2 :"+b);
		System.out.println("mark 3 :"+c);
		System.out.println("tot :"+total);
		System.out.println("per :"+per);
	
		if(per>=90)
		{
			System.out.println("Grade A");
		}
		else if(per>=80 && per<90)
		{
			System.out.println("Grade b");
		}
		else if(per>=70 && per<80)
		{
			System.out.println("Grade c");
		}
		else if(per>=60 && per<70)
		{
			System.out.println("Grade d");
		}
		else
		{
			System.out.println("fail !!");
		}	
	}
}

class mscon
{
	public static void main(String args[])
	{
		kalu k = new kalu();

		k.kalu();
		k.kalu(0,90,90);
	}
}