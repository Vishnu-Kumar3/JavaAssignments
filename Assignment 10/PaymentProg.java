abstract class Payment
{
    double amount;

    Payment(double amount)
    {
        this.amount = amount;
    }

    abstract void makePayment();

    void displayAmount()
    {
        System.out.println("Payment Amount: " + amount);
    }
}

class CreditCard extends Payment
{
    String cardNumber;

    CreditCard(double amount, String cardNumber)
    {
        super(amount);
        this.cardNumber = cardNumber;
    }

    void makePayment()
    {
        System.out.println("Payment made using Credit Card");
        System.out.println("Card Number: " + cardNumber);
    }
}

class UPI extends Payment
{
    String upiId;

    UPI(double amount, String upiId)
    {
        super(amount);
        this.upiId = upiId;
    }

    void makePayment()
    {
        System.out.println("Payment made using UPI");
        System.out.println("UPI ID: " + upiId);
    }
}

public class PaymentProg
{
    public static void main(String[] args)
    {
        Payment p1 = new CreditCard(5000, "1212-3434-5656");
        Payment p2 = new UPI(2500, "vishnu@idfcfirst");

        p1.displayAmount();
        p1.makePayment();

        System.out.println();

        p2.displayAmount();
        p2.makePayment();
    }
}