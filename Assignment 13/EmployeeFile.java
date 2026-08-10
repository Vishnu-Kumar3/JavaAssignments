import java.io.*;

public class EmployeeFile
{
    public static void main(String[] args)
    {
        try
        {
            FileWriter fw = new FileWriter("employee.txt");

            fw.write("Employee ID: 217\n");
            fw.write("Name: Vishnu Kumar\n");
            fw.write("Department: CSE\n");
            fw.write("Salary: 50000\n");

            fw.close();

            System.out.println("Employee details written to file.\n");

            FileReader fr = new FileReader("employee.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;

            System.out.println("Employee Details:");

            while ((line = br.readLine()) != null)
            {
                System.out.println(line);
            }

            br.close();
            fr.close();

        }
        
        catch (IOException e)
        {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}