package graphics;
import java.util.*;
public class square
{
  int s,a;
  Scanner sc=new Scanner(System.in);
  public void area()
   {
     System.out.println("SQUARE");
     System.out.println("Enter the side:");
     s=sc.nextInt();
     sc.nextLine();
     a=s*s;
   }
   public void display()
    {
       System.out.println("Area of square:"+a);
    }
}         
