import java.util.*;

public class arrayList
{
    public static void main(String args[])
    {
       ArrayList<String> al=new ArrayList<>();
       Scanner sc=new Scanner(System.in);
       al.add("Mango");
       al.add("Grapes");
       al.add("Orange");
       al.add("Pineapple");
       System.out.println("Existing elements: " + al);    
       System.out.print("Enter the element to insert: " );
       String name=sc.nextLine();
       al.add(name);
       System.out.println("After insertion: " + al);
       al.remove("Grapes");
       System.out.println("After deletion: " + al);
       Collections.sort(al);
       System.out.println("After sorting:" + al);
       
       System.out.print("Enter the element to search: ");
       String search=sc.nextLine();
      
       if(al.contains(search))
       {
            System.out.println("Element " + search+ " found in the Arraylist");
       }
       else
       {
            System.out.println("Element " + search+ " not found in the Arraylist");
        }
    }
}
