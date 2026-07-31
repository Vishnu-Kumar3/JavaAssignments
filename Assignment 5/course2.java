import java.util.*;
public class course2
{
    public static void main(String[] args)
    {
    ArrayList<String> crs = new ArrayList<String>();
    Scanner sc = new Scanner(System.in);

    int choice;
    boolean flag = true;

    while(flag)
    {
        System.out.println("Enter [1. Add Course] | [2. Remove Course] | [3. View Courses] | [4. Exit]");
        choice = sc.nextInt();
        sc.nextLine();

        switch(choice)
        {
            case 1:
                System.out.print("Course Name: ");
                crs.add(sc.next());
                System.out.println("Course Added.");
                break;

            case 2:
                System.out.print("Enter Course Name to Remove: ");
                String coursename = sc.nextLine();
                crs.remove(coursename);
                break;

            case 3:
                if(crs.isEmpty())
                {
                    System.out.println("No Courses Registered.");
                }
                else
                {
                    StringBuffer s = new StringBuffer();
                    s.append("Registered Courses: ");

                    for(String course: crs)
                    {       
                        s.append(course).append(", ");
                    }
                    System.out.print(s.substring(0, s.length() - 2));
                }
                
                System.out.println();
                break;

            case 4:
                flag = false;
                System.out.println("Exiting...");
                break;

            default:
                System.out.println("Invalid Choice.");
            }
        }
    }
}