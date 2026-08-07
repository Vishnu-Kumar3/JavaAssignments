    import java.util.*;
    public class course
    {
        public static void main(String[] args)
        {
            ArrayList<String> crs = new ArrayList<String>();

            Scanner sc = new Scanner(System.in);
            int i;
            
            System.out.println("Enter Name of Course: ");
            crs.add(sc.nextLine());

            int choice;
            System.out.println("Enter [1. Remove Course] | [2. View Courses]");
            choice = sc.nextInt();

            sc.nextLine();

            StringBuffer s = new StringBuffer();
            
            switch(choice)
            {
                case 1:
                    System.out.println("Enter course name to remove: ");
                    String coursename = sc.nextLine();

                    if(crs.remove(coursename))
                    {
                        System.out.println("Course Removed.");
                    }
                    else
                    {
                        System.out.println("Course not found.");
                    }

                    break;


                case 2:
                    for(i=0; i<crs.size(); i++)
                    {
                        s.append("Course ").append(i+1).append(": ").append(crs.get(i)).append("\n");
                    }
                    System.out.println(s);

                    break;

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }