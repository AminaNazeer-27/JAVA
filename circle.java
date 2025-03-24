package graphics;
import java.util.*;
public class circle
{
  double a;
  Scanner sc=new Scanner(System.in);
  public void area()
   {
     float r; 
     System.out.println("CIRCLE"); 
     System.out.println("Enter the radius:");
     r=sc.nextFloat();
     
     a=3.14*(r*r);
   }
   public void display()
    {
       System.out.println("Area of circle:"+a);
    }
}         
