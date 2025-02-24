import java.util.*;
class factorial
{
 public static void main(String args[])
 {
  int n,fact=1,i,f2=1,f3=1;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number");
  n=sc.nextInt();
  sc.nextLine();
  for(i=1;i<=n;i++)
   {
     fact*=i;
   }
  System.out.println("Factorial of number"+n+"="+fact);
  i=1;
  while(i<=n)
   {
     f2*=i;
     i++;
   }
   System.out.println("Factorial of number"+n+"="+fact);
   i=1;
   do
    {
      f3*=i;
      i++;
    }
    while(i<=n);
   System.out.println("Factorial of number"+n+"="+fact); 
 }
} 
