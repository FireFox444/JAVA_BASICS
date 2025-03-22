import java.util.Scanner;
class medicine
{
	Scanner d=new Scanner(System.in);
	int p_price,ex_date;
	String pname,dname;
	void get_data()
	{
		System.out.println("enter product name::");
		pname=d.next();
		
		System.out.println("enter product price::");
		p_price=d.nextInt();
		
		System.out.println("enter product exdate::");
		ex_date=d.nextInt();
		
		System.out.println("disease name::");
		dname=d.next();
		
		
	}
	 
	void display()
	{
		System.out.println("product name::"+pname);
		System.out.println("product price::"+p_price);
		System.out.println("product exdate::"+ex_date);
		System.out.println("product dname::"+dname);
	}
	
	
}
class sports extends medicine
{
	Scanner d=new Scanner(System.in);
	String sname,mat;
	
	void get_data1()
	{
		System.out.println("enter sports name::");
		sname=d.next();

		System.out.println("enter sports matrial::");
		mat=d.next();
			
	}
	void display()
	{
		System.out.println("sport name::"+sname);
		System.out.println("matrial name::"+mat);
	}
}
class pro11
{
	public static void main(String arg[])
	{
		sports s1=new sports();
		s1.get_data();
		s1.get_data1();
		System.out.println("medicine info::");
		s1.display();
		System.out.println("sports info::");
		s1.display();
	}
}