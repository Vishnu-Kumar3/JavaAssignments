interface DeliveryStatus
{
    void updateStatus();
}

public class food
{
    String restaurant = "Dominos";
    String customer = "Vishnu";

    class Order
    {
        String food = "Farmhouse Pizza";
        int quantity = 2;
        double price = 299;

        void displayOrder()
        {
            System.out.println("----- Order Details -----");
            System.out.println("Customer: " +customer);
            System.out.println("Restaurant: " +restaurant);
            System.out.println("Food: " +food);
            System.out.println("Quantity: " +quantity);
            System.out.println("Price per item: Rs. " +price);
            System.out.println("Total: Rs. " + (price * quantity));
        }
    }

    public static void main(String[] args)
    {
        food fd = new food();

        food.Order order = fd.new Order();
        order.displayOrder();

        DeliveryStatus status1 = new DeliveryStatus()
        {
            public void updateStatus()
            {
                System.out.println("\nOrder Status: Order Confirmed");
            }
        };

        DeliveryStatus status2 = new DeliveryStatus()
        {
            public void updateStatus()
            {
                System.out.println("Order Status: Out for Delivery");
            }
        };

        DeliveryStatus status3 = new DeliveryStatus()
        {
            public void updateStatus()
            {
                System.out.println("Order Status: Delivered");
            }
        };

        status1.updateStatus();
        status2.updateStatus();
        status3.updateStatus();
    }
}