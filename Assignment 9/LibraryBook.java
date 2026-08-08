class Book
{
    final String ISBN;
    String title;
    String author;
    double price;

    Book(String ISBN, String title, String author, double price)
    {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display()
    {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class LibraryBook
{
    public static void main(String[] args)
    {
        Book b = new Book("13910399310", "Effective Java", "Joshua Bloch", 1200);

        b.display();
    }
}