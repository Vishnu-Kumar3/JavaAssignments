import java.util.*;

public class marks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int i;
        int sum=0;

        for(i=1;i<=5;i++)
        {
            System.out.println("Enter mark for subject: ");
            String marksString = sc.nextLine();
        
            int marksInt = Integer.parseInt(marksString);
            sum += marksInt;
        }

        System.out.println("Total Marks: " +sum);
    }
}

