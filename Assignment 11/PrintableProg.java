interface Printable
{
    void printDetails();
}

class Student implements Printable
{
    String name;
    int rollNo;

    Student(String name, int rollNo)
    {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void printDetails()
    {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
    }
}

class Employee implements Printable
{
    String name;
    int employeeId;

    Employee(String name, int employeeId)
    {
        this.name = name;
        this.employeeId = employeeId;
    }

    public void printDetails()
    {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }
}

public class PrintableProg
{
    public static void main(String[] args)
    {
        Printable s = new Student("Vishnu", 217);
        Printable e = new Employee("Vineet", 216);

        s.printDetails();

        System.out.println();

        e.printDetails();
    }
}