import java.util.*;
class Employee
{
  int eNo;
  String eName;
  double eSalary;
  Employee(int eNo,String eName,double eSalary)
  {
    this.eNo=eNo;
    this.eName=eName;
    this.eSalary=eSalary;
  }    
  void display()
   {
     System.out.println("Employee number:"+eNo);
     System.out.println("Employee name:"+eName);
     System.out.println("Employee salary:"+eSalary);
   }
}     
class Employeemain
{
  public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the no.of employee:");
     int n=sc.nextInt();
     Employee[] employees=new Employee[n];
     for(int i=0;i<n;i++)
     {
         System.out.println("\tEnter the details of employee:"+(i+1)+" " );
         System.out.print("\tEnter the  employee ID:");
         int eNo=sc.nextInt();
         sc.nextLine();
         System.out.print("\tEnter the  employee Name:");
         String eName= sc.nextLine();
         System.out.print("\tEnter the  employee salary:");
         double eSalary=sc.nextDouble();
         employees[i]=new Employee(eNo,eName,eSalary);
     }
         
  
          System.out.print("\tEnter the  employee ID to search:"); 
          int searchNo=sc.nextInt();
          boolean found=false;
          for(int i=0;i<n;i++)
           {
             if(employees[i].eNo == searchNo)
             {
    
                employees[i].display();
                found=true;
                break;
             }
           }
             
             if(!found)
              {
                 System.out.println("employee with id:"+searchNo+"not found");
              }
   }
   }
              
         
                 
