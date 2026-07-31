import java.util.*;

public class student
{
    String name;
    int rollno;

    student()
    {
        name = "Default";
        rollno = 0;
    }

    student(String n, int r)
    {
        name = n;
        rollno = r;
    }

    void print()
    {
        System.out.println("Student Name: " +name);
        System.out.println("Roll Number: " +rollno);
        System.out.println();
    }
    public static void main(String[] args)
    {
        student obj = new student();
        obj.print();

        student obj1 = new student("Vishnu", 217);
        obj1.print();
    }
}