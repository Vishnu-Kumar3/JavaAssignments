public class vehicle
{
    String name= "Meridian";
    String brand= "Jeep";
    int speed= 120;

    class details
    {
        void display()
        {
            System.out.println("Vehicle Name: " +name);
            System.out.println("Brand: " +brand);
            System.out.println("Speed: " +speed+ " km/h");
        }
    }

    interface action
    {
        void perform();
    }

    public static void main(String[] args)
    {
        vehicle v = new vehicle();

        vehicle.details d = v.new details();
        d.display();

        action a = new action()
        {
            public void perform()
            {
                System.out.println("Vehicle is overspeeding...");
            }
        };
        a.perform();
    }
}