class Employee
{
    String name;
    double salary;

    Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    void display()
    {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}

class Manager extends Employee
{
    String department;

    Manager(String name, double salary, String department)
    {
        super(name, salary);
        this.department = department;
    }

    void displayManager()
    {
        System.out.println("Manager Name: " + super.name);
        System.out.println("Manager Salary: " + super.salary);
        System.out.println("Department: " + department);
    }
}

public class EmployeeProg
{
    public static void main(String[] args)
    {
        Manager m = new Manager("Vishnu", 60000, "IT");

        m.displayManager();
    }
}