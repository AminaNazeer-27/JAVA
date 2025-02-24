import java.util.*;
class Multiplication
{
  public static void main(String args[])
   {
     int i,j,k,c,r;
     int a[][]=new  int [3][3];
     int b[][]=new int [3][3];
     int res[][]=new  int [3][3];
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the row:");
     r=sc.nextInt();
     System.out.println("Enter the column:");
     c=sc.nextInt();
     System.out.println("Enter the matrix1:");
     for(i=0;i<r;i++)
      {
        for(j=0;j<c;j++)
         {
           a[i][j]=sc.nextInt();
         }
      }
     System.out.println("Enter the matrix2:");
     for(i=0;i<r;i++)
      {
        for(j=0;j<c;j++)
         {
           b[i][j]=sc.nextInt();
         }
      }
     System.out.println("Enter the matrix1:");
     for(i=0;i<r;i++)
      {
        for(j=0;j<c;j++)
         {  
            System.out.print(a[i][j]+" ");
         }
            System.out.println("\n");
     }
     System.out.println("Enter the matrix2:");
     for(i=0;i<r;i++)
      {
        for(j=0;j<c;j++)
         {  
            System.out.print(b[i][j]+" ");
         }
            System.out.println("\n");
     }
     System.out.println("Sum of matrix:");
     for(i=0;i<r;i++)
      {
        for(j=0;j<c;j++)
         { 
           res[i][j]=a[i][j]+b[i][j];
      
          }
      }
      for(i=0;i<r;i++)
       {
         for(j=0;j<c;j++)
          {
             System.out.print(res[i][j]+" ");
          }
              System.out.println("\n");
      }    
     System.out.println("Product of matrix:");
     for(i=0;i<r;i++)
      {
       for(j=0;j<c;j++)
         
         
         
        {
        res[i][j]=0; 
          for(k=0;k<c;k++)
           {
             res[i][j]=res[i][j]+a[i][k]*b[k][j];
             
           }
        }
      } 
      for(i=0;i<r;i++)
       {
         for(j=0;j<c;j++)
          {
             System.out.print(res[i][j]+" ");
          }
              System.out.println("\n");
      }    
    }
  }                
     
