import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorServer implements CalculatorInterface {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) throws java.rmi.RemoteException {
        if (b == 0) {
            throw new java.rmi.RemoteException("Cannot divide by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        try {
            CalculatorServer server = new CalculatorServer();

            CalculatorInterface stub = (CalculatorInterface)
                UnicastRemoteObject.exportObject(server, 0);

            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("CalculatorService", stub);

            System.out.println("Calculator server is ready.");
        } catch (Exception e) {
            System.out.println("Server error: " + e.getMessage());
        }
    }
}