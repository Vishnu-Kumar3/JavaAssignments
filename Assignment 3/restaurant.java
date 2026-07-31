public class restaurant
{
    static int total = 0;

    void bill(double amount)
    {
        total++;
        System.out.println("Dine-In Bill: " +amount+" Rupees");
    }

    void bill(double amount, double packing)
    {
        total++;
        System.out.println("Take-Away Bill: " +(amount+packing)+ " Rupees");
    }

    void bill(double amount, double packing, double delivery)
    {
        total++;
        System.out.println("Delivery Bill: " +(amount+packing+delivery)+ " Rupees");
    }

    static void displayTotal()
    {
        System.out.println("Total Orders: " +total);
    }

    public static void main(String[] args)
    {
        restaurant obj = new restaurant();

        obj.bill(500);
        obj.bill(500,50);
        obj.bill(500,50,100);

        displayTotal();
    }
}