import java.util.Scanner;
class pro13
{
	public static void main(String arg[])
	{
		Scanner d=new Scanner(System.in);
		String ename,dname;
		int age,sal;

		System.out.println("enter emp name::");
		ename=d.next();

		System.out.println("enter emp age::");
		age=d.nextInt();

		System.out.println("enter dep name::");
		dname=d.next();

		System.out.println("enter salary::");
		sal=d.nextInt();

		if(age>=20 && age<=60)
		{
			System.out.println("age:"+age);
		}
		else 
		{
			System.out.println("invelid age");
		}
		
		if(dname.equals("s") || dname.equals("p") || dname.equals("a"))
		{
			System.out.println("dname"+dname);
		}
		else 
		{
			System.out.println("invelid depaetment");
		}
		
		if(sal>1000)
		{
			System.out.println("salary"+sal);
		}
		else
		{
			sal=100;
			System.out.println("ename"+ename);
			System.out.println("age"+age);
			System.out.println("department"+dname);
			System.out.println("salary"+sal);
			
		}
	}
}