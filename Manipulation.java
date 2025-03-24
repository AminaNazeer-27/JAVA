import java.util.*;
class Manipulation
 {
   public static void main (String args[])
   {
     String s1,s2;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter two string:");
     s1=sc.nextLine();
     s2=sc.nextLine();
     System.out.println(s1+" "+s2);
     int len1=s1.length();
     int len2=s2.length();
     System.out.println("Length of first string:"+len1);
     System.out.println("Length of second stringL:"+len2);
     String so=s1+" "+s2;
     System.out.println("Concatenation of string:"+so);
     if(s1.equals(s2))
      {
        System.out.println("String is equal ");
      }
     
     else
      {
       System.out.println("String is not same");
      }
     if(s1.compareTo(s2)<0)
      {
        System.out.println("String1 is larger");
      }
      else
       {
          System.out.println("String2 is larger"); 
       }
     String s3=s1.toUpperCase(); 
     System.out.println("Uppercase of string:"+s3);
     
     System.out.println("Lowercase of string:"+s3);
     s1=s2;
     System.out.println("Copied string:"+ s1);
    
    } 
 }                                       
    
