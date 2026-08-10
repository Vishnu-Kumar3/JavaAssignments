import java.io.*;
import java.util.Scanner;

public class PatientFile
{
    public static void main(String args[])
    {
        try
        {
            File f = new File("patient.txt");
            f.createNewFile();

            FileWriter fw = new FileWriter(f);

            fw.write("Patient ID: 217\n");
            fw.write("Name: Vishnu Kumar\n");
            fw.write("Age: 18\n");
            fw.write("Diagnosis: Fever\n");

            fw.close();

            Scanner sc = new Scanner(f);

            System.out.println("Patient Details:");

            while(sc.hasNextLine())
            {
                System.out.println(sc.nextLine());
            }

            sc.close();
        }
        catch(IOException e)
        {
            System.out.println("Error occurred");
        }
    }
}