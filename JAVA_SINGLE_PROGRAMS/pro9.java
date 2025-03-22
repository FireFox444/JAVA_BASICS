import java.util.Scanner;
class pro9
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int no,me,i,n,j,t,rev,r,arm,flag;

		do
		{
		System.out.println("1. For Positive - Negative :");
		System.out.println("2. For Odd Even Numer :");
		System.out.println("3. For Primary Number:");
		System.out.println("4. For Palidrome Number :");
		System.out.println("5. For Armstrong Number :");
		System.out.println("6. For Fibonacci Number :");
		System.out.println("7. For Terminate Program :");
        System.out.println("enter method=");
		me=s.nextInt();


        	switch(me)
			{
				case 1:
					System.out.println("number=");
					no=s.nextInt();
			    		if(no>0)
					{
						System.out.println("Number is Positive ::");
					}
					else if(no<0)
					{
						System.out.println("Number is Negative ::");
					}
					else
					{
						System.out.println("Number is ZERO ::");
					}

        	    		break;

				case 2:
					System.out.println("number=");
					no=s.nextInt();
					if(no%2==0)
					{
						System.out.println("Number is EVEN ::");
					}
					else if(no%2!=0)
					{
						System.out.println("Number is ODD ::");
					}
					else
					{
						System.out.println("Number is ZERO");
					}
        	    		break;

				case 3:
					System.out.println("number=");
					no=s.nextInt();
				    for(i=1;i<=no;i++)
					{
						flag=1;
						for(j=2;j<i;j++)
						{
							if(i%j==0)
							{
								flag=0;
								break;
							}
						}
						if(i>1 && flag==1)
						{
							System.out.println("Number is Prime :: ");
							break;
						}
					}
                		break;

				case 4:
					System.out.println("number=");
					no=s.nextInt();
				    rev=0;
					t=no;
					while(no>0)
						{
							r=no%10;
							rev=(rev*10)+r;
							no=(no-r)/10;
						}
					if(t==rev)
						{
							System.out.println("Number is Pelidrome ::");
						}
					else
						{
							System.out.println("Number is not Pelidrome ::");
						}
			    	break;

				case 5:
					System.out.println("number=");
					no=s.nextInt();
				    arm=0;
					t=no;
					while(no>0)
					{
						r=no%10;
						arm=arm+(r*r*r);
						no=(no-r)/10;
					}
					if(t==arm)
					{
						System.out.println("Number is Armstrong ::");
					}
					else
					{
						System.out.println("Number is not Armstrong ::");
					}
			    	break;


				case 6:
					System.out.println("number=");
					no=s.nextInt();
					int x=0,y=1,p;
					for(i=1;i<=no;i++)
					{
						//System.out.println(x +",");
						p=x+y;
						x=y;
						y=p;
					}
			    	break;

				default:
					if(me==7)
					{
						break;
					}
					else
					{
					System.out.println("Enter Valid Method Name ::");
			    		break;
					}
			    
			}
        }while(me!=7);
			System.out.println("Your Program is Terminated ::");
	}
}