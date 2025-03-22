import java.util.Scanner;
class pro3
{
   public static void main(String arg[])
   {
     Scanner myObj = new Scanner(System.in);
     int n,p;
     int rev=0;
     System.out.println("Enter Value");
     n=myObj.nextInt();
     int org=n;
  
     while(n>0)
     {
       rev=(rev*10)+(n%10);
       n=n/10;
     }

     if(org==rev)
     {
        System.out.println("It is Palindrome Number");
     }
     else
     {
        System.out.println("This is not Palindrome Number");
     }



//priime number prosedure





    System.out.println("Enter any Number");

     p=myObj.nextInt();
  
     for(int i=0;i<=p;i++)
     {
       		int cnt=0;
       		for(int j=1;j<=i;j++)
      		 {
        		 if(i%j==0)
         		{ 
          			 cnt++;
        		 }
      		 }
        		 if(cnt==2)
        		 { 
        		    System.out.println(i);
        		 }
       }


     }
   
}