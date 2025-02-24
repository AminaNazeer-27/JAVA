import java.util.*;
class arithmetic
{
 public static void main(String args[])
 {
  int n1,n2,sum=0,diff=0,product=0,quotient=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter two number");
  n1=sc.nextInt();
  sc.nextLine();
  n2=sc.nextInt();
  sum=n1+n2;
  diff=n1-n2;
  product=n1*n2;
  
  System.out.println("Sum="+sum);
  
  System.out.println("Difference="+diff);
 
  System.out.println("Product="+product);
 if(n2==0)
 {
  System.out.println("Enter a number other than 0");
  n2=sc.nextInt();
 }
 quotient=n1/n2;
  System.out.println("Quotient="+quotient);
 }
}  
  
