class BankAccount
{
    final int accountNumber;
    String name;
    double balance;

    BankAccount(int accountNumber, String name, double balance)
    {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    void display()
    {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: " + balance);
    }

    void deposit(double amount)
    {
        balance = balance + amount;
    }
}

public class BankAccountProg
{
    public static void main(String[] args)
    {
        BankAccount account = new BankAccount(10101, "Vishnu", 50000);

        account.display();

        account.deposit(5000);

        System.out.println("\nAfter Deposit:");
        account.display();
    }
}