import java.util.*;

class InvalidAgeException extends Exception
{
    InvalidAgeException(String message)
    {
        super(message);
    }
}

public class VotingSystem
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
                throw new InvalidAgeException("Not eligible for voting. Age must be 18 or above.");
            }

            System.out.println("Eligible for voting.");
        }
        catch(InvalidAgeException e)
        {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}