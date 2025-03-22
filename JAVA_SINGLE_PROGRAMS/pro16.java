import java.io.*;
class pro16
{
	public static void main(String args[])
	{
		StringBuffer str=new StringBuffer("Java is useful language");
		int s;
		s=str.indexOf(" ");
		str.deleteCharAt(s);
		str.insert(10," ");
		str.deleteCharAt(14);
		str.insert(22,"X");
		System.out.println(str);
	}
}