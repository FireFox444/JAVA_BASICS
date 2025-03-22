import java.util.Scanner;
class pro4
{
	public static void main(String arg[])
	{
	 Scanner myObj= new Scanner(System.in);
	 int n;
	

	System.out.println("Enter Number:");
	n=myObj.nextInt();
	for(int i=1;i<=n;i++)
	{
		 if(i==n)
		{
			System.out.print("1" + "/" + i  + "!");
		}
		else if(i%2!=0)
		{
	   	 	System.out.print("1" + "/" + i  + "!-");	
		}
 		else
		{
	    		System.out.print("1" + "/" + i  + "!+");
		}
	}
	}
}