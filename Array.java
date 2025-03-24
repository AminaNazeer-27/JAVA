ilmport java.util.*;
cass Array
{
  public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the no.of elements in the array:");
     int n=sc.nextInt();
     sc.nextLine();
     String[]strArray=new String[n];
     System.out.println("Enter"+n+"strings:");
     
     for(int i=0;i<n;i++)
     {
         System.out.println("Enter string"+(i+1)+":");
         strArray[i]=sc.nextLine();
     }
     while(true)
      {
        System.out.println("\nMenu");
        System.out.println("\n1.Search string in an array:");
        System.out.println("\n2.Sort string in an array");
        System.out.println("\n3.Exit");
        System.out.println("\nEnter your choice:");
        int choice=sc.nextInt();
        sc.nextLine();
        switch(choice)
         {
           case 1 :System.out.println("Enter the string to search:");
                   String Search=sc.nextLine();
                   SearchString(strArray,Search);
                   break;
           case 2 :sortArray(strArray);  
                   System.out.println("Sorted successfully");
                   System.out.println("Sorted array: "+Arrays.toString(strArray));   
                   break;
           case 3 :System.out.println("Exiting");
                   return;
           default:System.out.println("Invalid choice");
         }                              
      }      
     }
      public static void SearchString(String []array,String Search)
       {
         boolean found=false;
         for(String str:array)
          {
            if(str.equalsIgnoreCase(Search))
              {
                found=true;
                break;
              } 
           }   
         if(found)
          {
            System.out.println("String"+Search+" "+"is found in the array");
          }
          else
           {
              System.out.println("String"+Search+" "+"is not found in the array");
           }
       }
       public static void sortArray(String[]array)
        {
          Arrays.sort(array);
        }
 }              
              
             
