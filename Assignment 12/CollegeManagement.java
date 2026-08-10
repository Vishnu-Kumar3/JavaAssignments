import student.Student;
import faculty.Faculty;

public class CollegeManagement
{
    public static void main(String[] args)
    {

        Student s = new Student("Vishnu Kumar", 217, "Computer Science Engineering");
        Faculty f = new Faculty("Dr. Akash B", 405, "Computer Science Engineering");

        s.displayStudent();

        System.out.println();

        f.displayFaculty();
    }
}