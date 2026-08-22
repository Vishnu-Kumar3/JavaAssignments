import java.util.*;

public class ATM
{
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);
        
        float balance = 50000;

        try
        {
            System.out.println("Enter Amount to Withdraw: ");
            float amount = sc.nextFloat();

            if(amount <= 0)
            {
                throw new Exception("Invalid Withdrawal Amount.");
            }

            if(amount > balance)
            {
                throw new Exception("Insufficient Balance.");
            }

            balance = balance - amount;
            System.out.println("Withdrawal Successful.");
            System.out.println("Amount Withdrawn: " +amount+ " | Updated Balamce: " +balance);
        }

        catch(Exception e)
        {
            System.out.println("Transaction Failed | " +e.getMessage());
        }
    }
}