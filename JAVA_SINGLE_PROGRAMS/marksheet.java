import java.util.Scanner;

class marksheet
{
	public static void main(String args[])
	{
		int m1,m2,m3,per,total;
		char grade;

		Scanner perc = new Scanner(System.in);

		System.out.println("Maths: ");
		m1=perc.nextInt();

		System.out.println("Science: ");
		m2=perc.nextInt();

		System.out.println("English: ");
		m3=perc.nextInt();

		total=m1+m2+m3;
		per=(total/3);

		if(per>=60)
		{
			grade='A';
		}
		else if(per<60 && per>=50)
		{
			grade='B';
		}
		else if(per<50 && per>=40)
		{
			grade='C';
		}
		else
		{
			grade='F';
		}	

		

	}
}



