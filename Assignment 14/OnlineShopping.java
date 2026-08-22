import java.util.*;

public class OnlineShopping
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.println("Enter Product Name: ");
            String product = sc.nextLine();

            System.out.println("Enter Product Quantity: ");
            int quantity = sc.nextInt();

            if(quantity <= 0)
            {
                throw new Exception("Invalid Product Quantity.");
            }

            System.out.println("Order Successful.");
            System.out.println("Product: " +product+ " | Quantity: " +quantity);
        }

        catch(Exception e)
        {
            System.out.println("Order Failed | " +e.getMessage());
        }
    }
}