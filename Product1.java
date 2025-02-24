import java.util.Scanner;
class product
{
  int pcode;
  String pname;
  float price;
  void getdata()
  {
    System.out.println("Enter pcode,name,price:");
    Scanner sc=new Scanner(System.in);
    this.pcode=sc.nextInt();
    sc.nextLine();
    this.pname=sc.nextLine();
    this.price=sc.nextFloat();
  }
void display()
{
 System.out.println("Product code:"+pcode);
 System.out.println("Product name:"+pname);
 System.out.println("Product price:"+price);
}
}
class Product1
{
 public static void main(String args[])
 {
 product p1=new product();
 product p2=new product();
 product p3=new product();
 p1.getdata();
 p1.display();
 p2.getdata();
 p2.display();
 p3.getdata();
 p3.display();
 
 if(p1.price<p2.price && p1.price<p3.price)
  {
    System.out.println("Product 1 is lower:"+p1.pcode+","+p1.pname+","+p1.price);
  }
 else if(p2.price<p3.price && p2.price<p1.price)
  {
    System.out.println("Product 2 is lower:"+p2.pcode+","+p2.pname+","+p2.price);
  }
  else
  {
    System.out.println("Product 3 is lower:"+p3.pcode+","+p3.pname+","+p3.price);
  }
 }
}  
   
    
    
    
    
    
 
