import java.util.*;

public class occurence
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine().toUpperCase().replace(" ", "");

        char[] ch = str.toCharArray();
        Arrays.sort(ch);

        int i,j;

        for(i=0;i<ch.length;i++)
        {
            int count = 1;
            
            for(j=i+1;j<ch.length;j++)
            {
                if(ch[i] == ch[j])
                {
                    count++;
                }

                else
                {
                    break;
                }
            }

            System.out.print(ch[i] + ": " +count +" | ");
            i = j-1;
        }
    }
}