import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class TemperatureServer implements TemperatureInterface {
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        try {
            TemperatureServer server = new TemperatureServer();

            TemperatureInterface stub = (TemperatureInterface)
                UnicastRemoteObject.exportObject(server, 0);

            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("TemperatureService", stub);

            System.out.println("Temperature conversion server is ready.");
        } catch (Exception e) {
            System.out.println("Server error: " + e.getMessage());
        }
    }
}