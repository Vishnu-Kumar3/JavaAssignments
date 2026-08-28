import java.util.*;

class InvalidAgeException extends Exception
{
    InvalidAgeException(String message)
    {
        super(message);
    }
}

public class DrivingLicense
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            if(age < 18)
            {
                throw new InvalidAgeException("Age is below 18. Not eligible for driving license.");
            }

            System.out.println("Eligible for driving license.");
        }
        catch(InvalidAgeException e)
        {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}