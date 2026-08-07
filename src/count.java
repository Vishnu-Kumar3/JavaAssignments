import java.util.*;

public class count
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String str = sc.nextLine().trim();
    

        int i;
        int count=1;

        for(i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);

            if(ch == ' ' || ch == '\n')
            {
                count++;
            }
        }
        
        System.out.println("Number of Words: " +count);
    }
}