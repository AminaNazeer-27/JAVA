package graphics;
import java.util.*;
public class triangle
{
  int h,b;
  double a;
  Scanner sc=new Scanner(System.in);
  public void area()
   { 
     System.out.println("TRIANGLE");
     System.out.println("Enter the base:");
     b=sc.nextInt();
     sc.nextLine();
     System.out.println("Enter the height:");
     h=sc.nextInt();
     sc.nextLine();
   
     a=0.5*(b*h);
   }
  public void display()
    {
       System.out.println("Area of triangle:"+a);
    }
}         
