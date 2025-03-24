import java.util.*;
interface shapes
{
  double getArea();
  double getPerimeter();
 }
class circle implements shapes
{
  private double radius;
  public circle(double radius)
  { 
    this.radius=radius;
  }
  public double getArea()
  {
    return Math.PI*radius*radius;
  }
  public double getPerimeter()
   {
     return 2*Math.PI*radius;
   }
}   
class rectangle implements shapes
{
  private double length,breadth;
  public rectangle(double length,double breadth)
  {
    this.length=length;
    this.breadth=breadth;
  }         
  public double getArea()
   {
     return length*breadth;
   }
  public double getPerimeter()
   {
     return 2*(length+breadth);
   }
}
public class Shape
{
  public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     while(true)
      {
        System.out.println("...MENU...");
        System.out.println("1.CIRCLE");
        System.out.println("2.RECTANGLE");
        System.out.println("3.EXIT");
        System.out.println("Enter your choice:");
        int choice=sc.nextInt();
        sc.nextLine();
        switch(choice)
         {
           case 1: System.out.println("Enter the radius of circle:");
                   double radius=sc.nextDouble();
                   shapes circle=new circle(radius);
                   System.out.println("Area of circle:"+circle.getArea());
                   System.out.println("Perimeter of circle:"+circle.getPerimeter());
                   break;
           case 2: System.out.println("Enter the length of rectangle:");
                   double length=sc.nextDouble();
                   System.out.println("Enter the breadth of rectangle:");
                   double breadth=sc.nextDouble();
                   shapes rectangle=new rectangle(length,breadth);
                   System.out.println("Area of circle:"+rectangle.getArea());
                   System.out.println("Perimeter of circle:"+rectangle.getPerimeter());
                   break; 
           case 3: System.out.println("Exit");
                   return;
           default:
                   System.out.println("Invalid choice");
        }   
      } 
      
    }
}         
