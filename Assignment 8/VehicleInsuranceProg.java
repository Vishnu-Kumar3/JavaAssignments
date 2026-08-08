class Vehicle
{
    String vehicleNumber;
    String vehicleType;

    Vehicle(String vehicleNumber, String vehicleType)
    {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }

    void displayVehicle()
    {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
    }
}

class VehicleInsurance extends Vehicle
{
    double premium;

    VehicleInsurance(String vehicleNumber, String vehicleType, double premium)
    {
        super(vehicleNumber, vehicleType);
        this.premium = premium;
    }

    void displayInsurance()
    {
        System.out.println("Vehicle Number: " + super.vehicleNumber);
        System.out.println("Vehicle Type: " + super.vehicleType);
        System.out.println("Insurance Premium: " + premium);
    }
}

public class VehicleInsuranceProg
{
    public static void main(String[] args)
    {
        VehicleInsurance v = new VehicleInsurance("MH04LH2790", "SUV", 15000);

        v.displayInsurance();
    }
}