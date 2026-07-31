import java.util.*;

public class payroll 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        float sum=0;

        System.out.println("Enter Employee ID: ");
        String id = sc.nextLine();
        System.out.println("Enter Basic Salary" );
        String salary = sc.nextLine();
        System.out.println("Enter Bonus Amount: ");
        String bonus = sc.nextLine();
        
        float salaryfloat = Float.parseFloat(salary);
        float salarybonus = Float.parseFloat(bonus);

        sum = salaryfloat + salarybonus;

        System.out.println("Employee ID: " +id);
        System.out.println("Basic Salary:: " +salary);
        System.out.println("Bonus Amount: " +bonus);
        System.out.println("Total Payout: " +sum);
    }
}
