import java.util.Scanner;
class pro10
{
  public static void main(String arg[])
  { 
    Scanner myObj = new Scanner(System.in);
    String name[] = new String[5];
    int Qty[] = new int[5];
    int rate[] = new int[5];
    int amt[] = new int[5];

    for(int i=0;i<=4;i++)
    {
      System.out.println(i+"  Enter Name");
      name[i] = myObj.next();

      System.out.println(i+"  Enter Quantity");
      Qty[i] = myObj.nextInt();
 
      System.out.println(i+"  Enter Rate");
      rate[i] = myObj.nextInt();

      amt[i] = Qty[i]*rate[i];
    }

    for(int i=0;i<=4;i++)
    {
      System.out.println(name[i]+"   "+Qty[i]+"   "+rate[i]+" = "+amt[i]);
    }

    int max=amt[0];
    for(int i=0;i<=4;i++)
    {
       if(amt[i]>max)
       { 
          max=amt[i];
          System.out.println("Highest Amount = "+amt[i]);
       }
    }
  }
}