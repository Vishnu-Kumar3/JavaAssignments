public class mobile
{
    int serial;
    String brand;
    
    mobile()
    {
        brand = "Default";
        serial = 0;
    }

    mobile(String b, int s)
    {
        brand = b;
        serial = s;
    }

    mobile(mobile x)
    {
        brand = x.brand;
        serial = x.serial;
    }

    void print()
    {
        System.out.println("Brand: " +brand);
        System.out.println("Serial Number: " +serial);
        System.out.println();
    }

    public static void main(String[] args)
    {
        mobile obj = new mobile();
        obj.print();

        mobile obj1 = new mobile("Apple", 16);
        obj1.print();

        mobile obj2 = new mobile("Samsung", 25);
        obj2.print();

        mobile obj3 = new mobile(obj1);
        obj3.print();
    }
}