import java.util.Scanner;

public class Book {
    // Attributes
    private String title;
    private String author;
    private int pageCount;
    private double price;

    // Constructor
    public Book(String title, String author, int pageCount, double price) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.price = price;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public double getPrice() {
        return price;
    }

    // Setters
    
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Method to input book details from the user
    public void inputBookDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter title: ");
        setTitle(scanner.nextLine());

        System.out.print("Enter author: ");
        setAuthor(scanner.nextLine());

        System.out.print("Enter page count: ");
        setPageCount(scanner.nextInt());

        System.out.print("Enter price: ");
        setPrice(scanner.nextDouble());
    }

    // Method to display book information
    public void getBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Page Count: " + pageCount);
        System.out.println("Price: $" + price);
    }

    // Example usage in a main method
    public static void main(String[] args) {
        // Creating a book
        Book myBook = new Book("", "", 0, 0.0);

        // Inputting book details from the user
        myBook.inputBookDetails();

        // Displaying book information
        myBook.getBookInfo();
    }
}