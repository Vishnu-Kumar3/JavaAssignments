import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class CalculatorClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            CalculatorInterface calculator =
                (CalculatorInterface) registry.lookup("CalculatorService");

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter first number: ");
            double a = sc.nextDouble();

            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + calculator.add(a, b));
                    break;
                case 2:
                    System.out.println("Result: " + calculator.subtract(a, b));
                    break;
                case 3:
                    System.out.println("Result: " + calculator.multiply(a, b));
                    break;
                case 4:
                    System.out.println("Result: " + calculator.divide(a, b));
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

            sc.close();
        } catch (Exception e) {
            System.out.println("Client error: " + e.getMessage());
        }
    }
}