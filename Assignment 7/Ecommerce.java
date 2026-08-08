interface Product
{
    void displayProduct();
    double calculatePrice();
}

class Electronic implements Product
{
    String name;
    double price;

    Electronic(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    public void displayProduct()
    {
        System.out.println("Electronic Product: " + name);
        System.out.println("Price: " + price);
    }

    public double calculatePrice()
    {
        return price;
    }
}

class Clothing implements Product
{
    String name;
    double price;

    Clothing(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    public void displayProduct()
    {
        System.out.println("Clothing Product: " + name);
        System.out.println("Price: " + price);
    }

    public double calculatePrice()
    {
        return price;
    }
}

class Grocery implements Product
{
    String name;
    double price;

    Grocery(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    public void displayProduct()
    {
        System.out.println("Grocery Product: " + name);
        System.out.println("Price: " + price);
    }

    public double calculatePrice()
    {
        return price;
    }
}

public class Ecommerce
{
    public static void main(String[] args)
    {
        Product p1 = new Electronic("Laptop", 50000);
        Product p2 = new Clothing("T-Shirt", 800);
        Product p3 = new Grocery("Rice", 1200);

        p1.displayProduct();
        System.out.println("Calculated Price: " + p1.calculatePrice());

        System.out.println();

        p2.displayProduct();
        System.out.println("Calculated Price: " + p2.calculatePrice());

        System.out.println();

        p3.displayProduct();
        System.out.println("Calculated Price: " + p3.calculatePrice());
    }
}