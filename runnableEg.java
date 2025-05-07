import java.util.*;

class fibanacci implements Runnable
{
     int n;
     public fibanacci(int n)
     {
         this.n=n;
     }
     public void run()
     {
          
          int a=0;
          int b=1;
          
          for(int i=1;i<=n;i++)
          {
              System.out.println(a + " ");
              int c=a+b;
              a=b;
              b=c;
           }
          
      }
      
}
  
class even implements Runnable
{
     int first,last;
     public even(int first,int last)
     {
         this.first=first;
         this.last=last;
     } 
     public void run()
      {
          
          
          for(int i=first;i<=last;i++)
          {
              if(i%2==0)
              {
                   System.out.print(i + " ");
              }
               System.out.println();
           }
       }
 }
 
 
 public class runnableEg
 {
     public static void main(String[] args)
     {   
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter the limit: ");
         int n=sc.nextInt();
         sc.nextLine();
         System.out.println("Fibanacci series  ");
         
          
          
          System.out.print("Enter the starting range: "); 
          int first=sc.nextInt();
          sc.nextLine();
          System.out.print("Enter the ending range: "); 
          int last=sc.nextInt();
          sc.nextLine();
          System.out.println("even numbers between " + first + " and " + last);
          
          fibanacci fi=new fibanacci(n);
         Thread th1=new Thread(fi);
         th1.start();
          
          
          even ev=new even(first,last);
          Thread th2=new Thread(ev);
          th2.start();
      }
  }
         
          
