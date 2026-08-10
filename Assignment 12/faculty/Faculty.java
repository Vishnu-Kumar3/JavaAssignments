package faculty;

public class Faculty
{
    String name;
    int facultyId;
    String department;

    public Faculty(String name, int facultyId, String department)
    {
        this.name = name;
        this.facultyId = facultyId;
        this.department = department;
    }

    public void displayFaculty()
    {
        System.out.println("Faculty Details");
        System.out.println("Name: " + name);
        System.out.println("Faculty ID: " + facultyId);
        System.out.println("Department: " + department);
    }
}