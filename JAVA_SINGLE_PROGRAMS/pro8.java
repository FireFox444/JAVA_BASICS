import java.util.Scanner;
class sal
{
   void salary(int b_sal1,int da1,int hra1,int ma1,int pf1,int it1,int pt1)
   {
      int b_sal=b_sal1;
      int da=da1;
      int hra=hra1;
      int ma=ma1;
      int pf=pf1;
      int it=it1;
      int pt=pt1;

      float net_sal= b_sal+((b_sal*da)/100)+((b_sal*hra)/100)+((b_sal*ma)/100)-((b_sal*pf)/100)-((b_sal*it)/100)-((b_sal*pt)/100);
     System.out.println("Total Sal is:"+net_sal);
   }
  
   void salary(int b_sal1,int da1,int hra1,int pf1,int it1)
   {
      int b_sal=b_sal1; 
      int da=da1;
      int hra=hra1;
      int pf=pf1;
      int it=it1;

     float net_sal= b_sal+((b_sal*da)/100)+((b_sal*hra)/100)-((b_sal*pf)/100)-((b_sal*it)/100);
     System.out.println("Total Sal is:"+net_sal);
   }

   void salary(int b_sal1,int da1,int hra1,int it1)
   {
     int b_sal=b_sal1; 
      int da=da1;
      int hra=hra1;
      int it=it1;

     float net_sal= b_sal+((b_sal*da)/100)+((b_sal*hra)/100)-((b_sal*it)/100);
     System.out.println("Total Sal is:"+net_sal);
   }
   
   void salary(int b_sal1,int da1)
   {
     int b_sal=b_sal1;
     int da=da1;
 
     float net_sal = b_sal+((b_sal*da)/100);
     System.out.println("Total Sal is:"+net_sal);
   }
}

class pro8
{
   public static void main(String arg[])
   {
      int job;
      Scanner myObj = new Scanner(System.in);

      System.out.println("Enter Employee Job:");
      job = myObj.nextInt();
      sal s1 = new sal();
          
      if(job==1)
      {
         s1.salary(75000,5,6,7,5,4,3);
      }
      else if(job==2)
      {
         s1.salary(50000,5,6,5,4);
      }
      else if(job==3)
      {
         s1.salary(40000,5,6,4);
      }
      else if(job==4)
      {
         s1.salary(30000,5);
      }
      else
      {
        System.out.println("Enter Valid No:");
      }
   }
}
        


     