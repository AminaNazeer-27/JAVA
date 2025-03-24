import java.util.*;
 class Areacalculator
{
   double area(double length,double breadth)
   {
     return length*breadth;
   }  
   double area(int side)
   {
     return side*side;
   }  
   double areatri(double base,double height)
   {
     return base*height;
   }  
   double area(float radius)
   {
     return 3.14*radius*radius;
   }
}
public class Overload
{
  public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     Areacalculator calc=new Areacalculator(); 
     
     System.out.println("RECTANGLE");   
     System.out.println("Enter the length of rectangle:");
     double length=sc.nextDouble();
     System.out.println("Enter the breadth of rectangle:");
     double breadth=sc.nextDouble();
     System.out.println("Area of rectangle:"+calc.area(length,breadth));
     
     System.out.println("SQUARE");
     System.out.println("Enter the side of square:");
     int side=sc.nextInt();
     System.out.println("Area of square:"+calc.area(side));
     
     System.out.println("TRIANGLE");
     System.out.println("Enter the base of triangle:");
     double base=sc.nextDouble();
     System.out.println("Enter the height of triangle:");
     double height=sc.nextDouble();
     System.out.println("Area of triangle:"+calc.areatri(base,height));
     
     System.out.println("CIRCLE");
     System.out.println("Enter the radius of circle:"); 
     float radius=sc.nextFloat();
     System.out.println("Area of circle:"+calc.area(radius));
   }
}     
          
