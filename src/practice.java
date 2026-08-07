public class practice
{
    static int count = 0;

    int add(int a, int b)
    {
        count++;
        return a + b;
    }

    int add(int a, int b, int c)
    {
        count++;
        return a + b + c;
    }

    double add(double a, double b)
    {
        count++;
        return a + b;
    }

    public static void main(String[] args)
    {
        practice obj = new practice();

        System.out.println("10 + 20 = " +obj.add(10,20));
        System.out.println("10 + 20 + 30 = " +obj.add(10,20,30));
        System.out.println("10.5 + 20.5 = " +obj.add(10.5,20.5));
    }
}