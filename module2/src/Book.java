import java.util.Scanner;

public class Book {
    private Scanner scanner= new Scanner(System.in);

    public String title;
    public String author;
    public int year;


    public Book() {
        this.author = "Aruzhan " ;
        this.title = "Thriller";
        this.year = 1990;

    }

    public Book(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }


    public static void main(String[] args) {

        Book b1 = new Book("a", "b", 2022);
        Book b2 = new Book();


    }

}
