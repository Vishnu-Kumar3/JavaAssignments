public class book
{
    String title, author;
    float price;

    book()
    {
        title = "Default";
        author = "Default";
        price = 0;
    }

    book(String t, String a)
    {
        title = t;
        author = a;
    }

    book(String t, String a, float p)
    {
        title = t;
        author = a;
        price = p;
    }

    void print()
    {
        System.out.println("Title: " +title);
        System.out.println("Author: " +author);
        System.out.println("Price: " +price);
        System.out.println();
    }

    public static void main(String[] args)
    {
        book obj1 = new book();
        obj1.print();

        book obj2 = new book("First", "Author One");
        obj2.print();

        book obj3 = new book("Second", "Author Two", 699);
        obj3.print();
    }
}