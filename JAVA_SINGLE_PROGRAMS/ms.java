import java.util.Scanner;
class ms

{
	public static void main (String args[])

	{
	int m1,m2,tot,pre;
	char grade;
	Scanner myobj=new Scanner(System.in);
	
	System.out.println("enter the m1");
	m1=myobj.nextInt();

	System.out.println("enter the m1");
	m2=myobj.nextInt();

	tot=m1+m2;
	pre=tot/2;
	
	if(pre>80)
	{
		grade='a';
		
	}
	else if(pre>80 && pre<=60)
	{
		grade='b';	
	}
	
	else if(pre>80 && pre<=40)
	{
		grade='c';	
	}

	else 
	{
		grade='d';	
	}

	System.out.println("your total marks is"+tot);
	System.out.println("your percentage is"+pre);
	System.out.println("your percentage is"+grade);

	}



}