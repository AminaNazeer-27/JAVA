import java.util.*;
class person
{
  String Name,Gender,Address;
  int Age;
  person(String name,String gender,String address,int age)
  {
    Name=name;
    Gender=gender;
    Address=address;
    Age=age;
    //System.out.println("Name:"+name+"Gender:"+gender+"Address:"+address+"Age:"+age);
  }
 }
class Employee extends person
{
  int Empid,Salary;
  String Companyname,Qualification;
  Employee(String name,String gender,String address,int age,int empid,int salary,String companyname,String qualification)
  {
    super(name,gender,address,age);
     Empid=empid;
     Salary=salary;
     Companyname=companyname;
     Qualification=qualification;
     //System.out.println("Employeeid:"+empid+"Salary:"+salary+"Company Name:"+company_name+"Qualification:"+qualification);

  }
}
class Teacher extends Employee
{
  int Teacherid;
  String Subject,Department;
  Teacher(String name,String gender,String address,int age,int empid,int salary,String companyname,String qualification,int teacherid,String subject,String department)
  {
    super(name,gender,address,age,empid,salary,companyname,qualification);
    Teacherid=teacherid;
    Subject=subject;
    Department=department;
    System.out.println("\nEmployeeid:"+empid+"\t Salary:"+salary+"\tCompany Name:"+companyname+"\tQualification:"+qualification+"\tTeacherid:"+teacherid+"\tSubject:"+subject+"\tDepartment:"+department);
 
 
  }
 }
 class Person
 {
   public static void main(String args[])
   { 
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the name:");
     String Name=sc.nextLine();
     System.out.println("Enter the gender:");
     String Gender=sc.nextLine(); 
     System.out.println("Enter the address:");
     String Address=sc.nextLine(); 
     System.out.println("Enter the age:");
     int Age=sc.nextInt();
     System.out.println("Enter the employeeid:");
     int Empid=sc.nextInt();
     System.out.println("Enter the salary:");
     int Salary=sc.nextInt();
     sc.nextLine();
     System.out.println("Enter the company name:");
     String Companyname=sc.nextLine();
     System.out.println("Enter the qualification:");
     String Qualification=sc.nextLine(); 
     System.out.println("Enter the teacherid:");
     int Teacherid=sc.nextInt();
     sc.nextLine();
     System.out.println("Enter the subject:");
     String Subject=sc.nextLine(); 
     System.out.println("Enter the department:");
     String Department=sc.nextLine(); 
     Teacher teach=new Teacher(Name,Gender,Address,Age,Empid,Salary,Companyname,Qualification,Teacherid,Subject,Department);
    }
  }     
             
