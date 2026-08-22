import java.util.*;

public class Login
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String rPassword = "JAVA@123";

        try
        {
            System.out.print("Enter Password: ");
            String password = sc.nextLine();

            if(!password.equals(rPassword))
            {
                throw new Exception("Invalid Password.");
            }

            System.out.println("Login Successful!");
        }
        
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

        finally
        {
            System.out.println("Password Verification Complete.");
            sc.close();
        }
    }
}