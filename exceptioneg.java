import java.util.*;

class AuthenticationException extends Exception
{
   public AuthenticationException(String message)
   {
     super(message);
   }
}

public class exceptioneg
{
       static final String valid_username="username12";
       static final String valid_password="password12";
       
       public static void main(String args[])
       {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the Username: ");
       String username=sc.nextLine();
       
       System.out.print("Enter the Password: ");
       String password=sc.nextLine();
       
       try
       {
           authenticate(username,password);
           System.out.println("Login Successfully");
        }
        catch(AuthenticationException e){
           System.out.println("Authentication failed" + e.getMessage());
        }
    }
       
       static void authenticate(String username,String password) throws AuthenticationException
       {
            if(username.isEmpty() || password.isEmpty())
            {
                throw new AuthenticationException("\nPlease enter username or password");
            }
            
            if(username.length()<5)
            {
                throw new AuthenticationException("\nUsername should have more than 5 characters");
            }
             
            if(password.length()<8)
            {
                throw new AuthenticationException("\nPassword should have more than 8 characters");
            }
            if(!username.equals(valid_username)|| !password.equals(valid_password))
            {
                throw new AuthenticationException("\nIncorrect username or password");
            } 
        }
        
    }          
