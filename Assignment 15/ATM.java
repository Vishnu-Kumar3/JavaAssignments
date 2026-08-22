import java.util.*;

public class ATM
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int correctPIN = 217;

        try
        {
            System.out.print("Enter PIN: ");
            int pin = sc.nextInt();

            if(pin != correctPIN)
            {
                throw new Exception("Invalid PIN.");
            }

            System.out.println("Correct Pin Entered.");
        }

        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

        finally
        {
            System.out.println("PIN Verification Complete.");
            sc.close();
        }
    }
}