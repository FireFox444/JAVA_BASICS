class test
{
    void area(int x)
    {
        int r=x;
        double ans;
        ans=3.14*r*r;
        System.out.println("Area of Circle ="+ans);
    }
    void area(int x,int y)
    {
        int l=x;
        int b=y;
        int ans;
        ans=l*b;
        System.out.println("Area of Rectangle ="+ans);
    }
    double area(double s)
    {
       double l=s;
       double ans;
       ans=l*l;
       return ans;
    }
}

class pro7
{
    public static void main(String arg[])
    {
       test k = new test();
       k.area(5);
       k.area(5,10);
		
       System.out.println("Area of Square ="+k.area(7.0));
    }
}