class str1
{
	String str, upper1, extract1;
	char ns,os;
	
	void display()
	{
		str = "semcom school";
		os = 'l';
		ns = 'r';

		int length1 = str.length();
		System.out.println(length1);

		str = str.replace(os,ns);
		System.out.println(str);

		upper1 = str.toUpperCase();
		System.out.println(upper1);

		extract1 = str.substring(0,6);
		System.out.println(extract1);
	}
}

class pro15
{
	public static void main(String arg[])
	{
		str1 s = new str1() ;
		
		s.display();	
	}
}