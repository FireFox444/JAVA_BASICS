import java.lang.*;
import java.io.*;
class Library
{
	String bname,sname,cd,mname,cotype,scode,ctype;
	int bprice,npra,bcode,ncd;
}
final class Educationbook extends Library
{
	void physics()
	{
	sname="science";
	bname="microbiology";
	bprice=500;
	bcode=4806;
	scode="P";
	npra=450;
	System.out.println("--------------------------");
	System.out.println("Physics book details");
	System.out.println("Book name="+bname);
	System.out.println("Book code="+bcode);
	System.out.println("Book price="+bprice);
	System.out.println("Subject code="+scode);
	System.out.println("Subject Name="+sname);
	System.out.println("Number of Practical="+npra);
	System.out.println("--------------------------");
	}
	void comuter()
	{
	scode="c";
	sname="computer";
	bname="c programming";
	bprice=400;
	bcode=4406;
	ncd=2;
	System.out.println("--------------------------");
	System.out.println("Computer book details");
	System.out.println("Book name="+bname);
	System.out.println("Book code="+bcode);
	System.out.println("Book price="+bprice);
	System.out.println("Subject code="+scode);
	System.out.println("Subject Name="+sname);
	System.out.println("Number of cd="+ncd);
	System.out.println("--------------------------");
	}
}

final class Magazines extends Library
{
	void commercial()
	{
	bname="how to get profit";
	bprice=480;
	ctype="commercial";
	System.out.println("--------------------------");
	System.out.println("Commercial type details");
	System.out.println("Book name="+bname);
	System.out.println("Commercial type="+ctype);
	System.out.println("Magazine price="+bprice);
	System.out.println("--------------------------");
	}
	void sports()
	{
	bname="life ok";
	bprice=30;
	ctype="sports";
	System.out.println("--------------------------");
	System.out.println("Sports type details");
	System.out.println("Book name="+bname);
	System.out.println("Commercial type="+ctype);
	System.out.println("Magazine price="+bprice);
	System.out.println("--------------------------");
	}
}

class pro12
{
	public static void main(String args[])
{
	Educationbook ebook=new Educationbook();
	ebook.physics();
	ebook.comuter();
	Magazines mg=new Magazines();
	mg.commercial();
	mg.sports();
}
}