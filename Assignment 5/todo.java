import java.util.*;
public class todo
{
    public static void main(String[] args)
    {
        ArrayList<String> todo = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);

        int i=0;
        System.out.println("Enter number of tasks: ");
        int n = sc.nextInt();

        sc.nextLine();

        for(i=0;i<n;i++)
        {
            System.out.println("Enter task: ");
            todo.add(sc.nextLine());
        }

        StringBuffer s = new StringBuffer();
        
        for(i=0;i<todo.size();i++)
        {
            s.append("Task ").append(i+1).append(": ").append(todo.get(i)).append("\n");
        }

        System.out.println(s);
    }
}