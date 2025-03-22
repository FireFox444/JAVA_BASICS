import java.util.Scanner;
class pro2
{
	public static void main(String args[])
	{
		int n1, n2, op1, op2, op3,op4;
		
		Scanner myOpe = new Scanner(System.in);
		
		System.out.println("Type 1st number: ");
		n1 = myOpe.nextInt();
		
		System.out.println("Type 2nd number: ");
		n2 = myOpe.nextInt();
		
		op1= n1+n2;
		op2= n1-n2;
		op3= n1*n2;
		op4= n1/n2;
		
		System.out.println("Addition of two numbers is : "+op1);
		System.out.println("Subtraction of two numbers is : "+op2);
		System.out.println("Multiplication of two numbers is : "+op3);
		System.out.println("Division of two numbers is : "+op4);
	}
}