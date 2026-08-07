public class first
{
    int prn;
    String name;

    first()
    {
        prn = 99;
    }

    first(int p, String n)
    {
        name = n;
        prn = p;
    }

    first(String n)
    {
        name = n;
    }

    first(first a)
    {
        prn = a.prn;
        name = a.name;
    }

    void print()
    {
        System.out.println("Name: " +name);
        System.out.println("PRN: " +prn);
        System.out.println();
    }

    public static void main(String[] args)
    {
        first obj = new first();
        obj.print();
        first obj1 = new first(217, "Vishnu");
        obj1.print();
        first obj2 = new first("Default");
        obj2.print();
        first obj3 = new first(obj);
        obj3.print();
    }
}
