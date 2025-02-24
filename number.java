import java.util.*;
class number
{
 public static void main(String args[])
  {
    int n1,n2,n3;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 3 numbers");
    n1=sc.nextInt();
    sc.nextLine();
    n2=sc.nextInt();
    sc.nextLine();
    n3=sc.nextInt();
    sc.nextLine();
    if(n1>n2 && n1>n3)
     {
       System.out.println("N1 is larger"+n1);
     }
    else if(n2>n3 && n2>n1)
     {
        System.out.println("N2 is larger"+n2);
     }
    else
     {
       System.out.println("N3 is larger"+n3);
     }
  }
}
    
