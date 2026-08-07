public class reverse
{
    public static void main(String[] args)
    {
        String str = "unhsiV";
        String rev = "";
        int i;
        char ch;

        for(i=str.length()-1;i>=0;i--)
        {
            ch = str.charAt(i);
            rev += ch;
        }

        System.out.println("Original String: " +str);
        System.out.println("Reversed String: " +rev); 

        StringBuilder s = new StringBuilder();
        s.append("unhsiV");
        s.reverse();
        System.out.println("Reversed String Using Method: " +s);
    }
}