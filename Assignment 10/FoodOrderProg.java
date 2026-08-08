abstract class FoodOrder
{
    double amount;

    FoodOrder(double amount)
    {
        this.amount = amount;
    }

    abstract void calculateBill();
}

class DineInOrder extends FoodOrder
{
    DineInOrder(double amount)
    {
        super(amount);
    }

    void calculateBill()
    {
        double total = amount + (amount * 0.09);
        System.out.println("Dine-In Order");
        System.out.println("Total Bill: " + total);
    }
}

class TakeAwayOrder extends FoodOrder
{
    TakeAwayOrder(double amount)
    {
        super(amount);
    }

    void calculateBill()
    {
        double total = amount + 50;
        System.out.println("Take-Away Order");
        System.out.println("Total Bill: " + total);
    }
}

public class FoodOrderProg
{
    public static void main(String[] args)
    {
        FoodOrder dineIn = new DineInOrder(1000);
        FoodOrder takeAway = new TakeAwayOrder(1000);

        dineIn.calculateBill();

        System.out.println();

        takeAway.calculateBill();
    }
}