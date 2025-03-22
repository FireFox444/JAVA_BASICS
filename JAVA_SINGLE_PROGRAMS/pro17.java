import java.io.*;
import java.lang.*;
class pro17
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
		
		String name;
		char gender;
		int n1,n2;
		
		System.out.print("Enter Name:");
		name=obj.readLine();
		
		System.out.print("Enter Gender:");
		gender=(char)obj.read();
		
		n1=name.indexOf(' ');
		n2=name.indexOf(' ',n1+1);
		
		if(gender=='f' || gender=='f' || gender=='m' || gender=='M')
		{
			if(gender=='f' || gender=='F')
			{
				System.out.print("Ms.");
				System.out.print(name.substring(0,1)+".");
				System.out.print(name.substring(n1+1,n1+2)+".");
				System.out.print(name.substring(n2+1));
			}
			else
			{
				System.out.print("Mr.");
				System.out.print(name.substring(0,1)+".");
				System.out.print(name.substring(n1+1,n1+2)+".");
				System.out.print(name.substring(n2+1));
			}
		}
		else
		{
			System.out.print("Enter valid Gender(m/f/M/F)");
		}
	}
}
				