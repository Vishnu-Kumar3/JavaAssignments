import java.util.*;

public class bank
{
    static void checkBalance()
    {
        System.out.println("Current Balance: " +balance);
    }

    void deposit(float deposit)
    {
        if(deposit > 0)
        {
            float balance += deposit;
            System.out.println(" " +deposit " deposited successfully!")
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> bank = new ArrayList<String>();

        System.out.println("Welcome to Banking Application");
        System.out.println("Enter Customer ID: ");
        int id = sc.nextInt();

        sc.nextLine();
        int choice;
        boolean flag = true;

        while(flag)
        {
            System.out.println("Select an option: ");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    checkBalance();
                    break;

                case 2:
                    System.out.println("Enter Amount to Deposit: ");
                    float deposit = sc.nextFloat();
            }
        }
    }
}