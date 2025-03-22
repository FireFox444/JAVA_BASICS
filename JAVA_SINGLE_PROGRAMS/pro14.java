import java.util.Scanner;
import java.io.*;

class str1
{
	String str;
	String  oc,nc;
	
	Scanner obj = new Scanner(System.in);

	void display()
	{
		System.out.println("Enter a string : ");
		str=obj.next();

		System.out.println("Enter old alphabet : ");
		oc=obj.next();

		System.out.println("Enter new alphabet : ");
		nc=obj.next();
		
		str = str.replace(oc,nc);

		System.out.println("New String :  "+str);
	}
}

class str2
{
	String str;
	int ns,os;
	
	Scanner obj2 = new Scanner(System.in);

	void display()
	{
		System.out.println("Enter a string : ");
		str=obj2.next();

		System.out.println("Enter starting value : ");
		os=obj2.nextInt();
		
		System.out.println("Enter ending value : ");
		ns=obj2.nextInt();

		str = str.substring(os,ns);
		

		System.out.println("New String :  "+str);
	}
}

class pro14
{
	public static void main (String args[])
	{
		str1 s1 = new str1();
		str2 s2 = new str2();

		s1.display();
		s2.display();
	}
}