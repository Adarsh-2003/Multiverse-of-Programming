// wAP to print details of the books using OOPs concept 

public class app{

    String title;
    String author;
    int pageCount;
    int price;

    public void getTitle(String title){
        System.out.println("Title of book : -", setTitle.title);
    }
    public void getAuthor(String author){
        System.out.println("Author of book : -", +setAuthor.author);
    }
    public void getPageCount(int pageCount){
        System.out.println("Page count of book : -", +setPageCount.pagecount);
    }
    public void getPrice(int price){
        System.out.println("Price of book : -", +setPrice.price);
    }

    public void setTitle(String title){
        this.title = "Harry Potter";
    }
    public void setAuthor(String author){
        this.author = "Nirav Potter";
    }
    public void setPageCount(int pageCount){
        this.pageCount = 22;
    }
    public void setPrice(int price) {
        this.price = 120;
    }

    public int displayBookInfo(){
        getTitle();
        getAuthor();
        getPageCount();
        getPrice();
    }

    public static void main(String args[]){
        app p = new app();
        p.displayBookInfo();

    }
}

class A{
    A(){
    System.out.println("hello a");
    }
    A(int x){
    this();
    System.out.println(x);
    }
    }
    class TestThis5{
    public static void main (String args[]){
    A a = new A(10);
    }
    }