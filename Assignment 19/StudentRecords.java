import java.sql.*;

public class StudentRecords
{
    public static void main(String[] args)
    {
        try
        {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jdbc_demo",
                "root",
                "Vk!76763127"
            );

            Statement stmt = con.createStatement();

            String query = "SELECT * FROM student";

            ResultSet rs = stmt.executeQuery(query);

            System.out.println("Student Records:");
            System.out.println("------------------------------");

            while(rs.next())
            {
                System.out.println("Roll No: " + rs.getInt("rollno"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("------------------------------");
            }

            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
